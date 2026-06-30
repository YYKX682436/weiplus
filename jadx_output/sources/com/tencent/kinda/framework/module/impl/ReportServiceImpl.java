package com.tencent.kinda.framework.module.impl;

/* loaded from: classes.dex */
public class ReportServiceImpl implements com.tencent.kinda.gen.KReportService {
    private static final java.lang.String ACF_REPORT_KEY = "acfReport_";
    private static final java.lang.String LAST_REPORT_SESSION_KEY = "lastReportSession";
    private static final java.lang.String TAG = "MicroMsg.ReportServiceImpl";

    @Override // com.tencent.kinda.gen.KReportService
    public java.lang.String getLastSessionInfo() {
        return com.tencent.mm.wallet_core.ui.r1.G().getString(LAST_REPORT_SESSION_KEY, "");
    }

    @Override // com.tencent.kinda.gen.KReportService
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
    }

    @Override // com.tencent.kinda.gen.KReportService
    public void kvStat(int i17, java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
    }

    @Override // com.tencent.kinda.gen.KReportService
    public void setLastSessionInfo(final java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 G = com.tencent.mm.wallet_core.ui.r1.G();
        G.getClass();
        G.putString(LAST_REPORT_SESSION_KEY, str).apply();
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.ReportServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str2 = com.tencent.kinda.framework.module.impl.ReportServiceImpl.ACF_REPORT_KEY + gm0.j1.b().j();
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    java.lang.String string = com.tencent.mm.wallet_core.ui.r1.G().getString(str2, "");
                    try {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                            return;
                        }
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 2)));
                            java.lang.String optString = jSONObject.optString("acf");
                            if (optString.length() > 7000) {
                                com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.module.impl.ReportServiceImpl.TAG, "over length: %s", java.lang.Integer.valueOf(optString.length()));
                                optString = optString.substring(0, 7000);
                            }
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24087, optString, jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID));
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.kinda.framework.module.impl.ReportServiceImpl.TAG, e17, "", new java.lang.Object[0]);
                        }
                        return;
                    } finally {
                        com.tencent.mm.wallet_core.ui.r1.G().remove(str2);
                    }
                }
                java.lang.String string2 = com.tencent.mm.wallet_core.ui.r1.G().getString(str2, "");
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.t8.K0(string2) ? "{}" : new java.lang.String(android.util.Base64.decode(string2, 2));
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                    java.lang.String optString2 = jSONObject2.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                    java.lang.String optString3 = jSONObject2.optString("lastReportUrl");
                    java.lang.String optString4 = jSONObject2.optString("logType");
                    java.lang.String optString5 = jSONObject2.optString("logAction");
                    if (!optString3.equals("NetworkChange") && !optString3.equals("MemoryWarning")) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(str3);
                        java.lang.String optString6 = jSONObject3.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
                        java.lang.String optString7 = jSONObject3.optString("acf");
                        java.lang.String format = java.lang.String.format("%s(%s:%s)", optString3, optString4, optString5);
                        java.lang.String[] split = optString7.split("-");
                        int length = split.length;
                        if (length >= 2 && split[length - 1].equals(format) && split[length - 2].equals(format)) {
                            com.tencent.mars.xlog.Log.w(com.tencent.kinda.framework.module.impl.ReportServiceImpl.TAG, "skip duplicate action node: %s", format);
                            return;
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(optString6)) {
                            jSONObject3.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString2);
                            jSONObject3.put("acf", format);
                            jSONObject3.toString();
                            com.tencent.mm.wallet_core.ui.r1.G().putString(str2, android.util.Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                            return;
                        }
                        if (!optString6.equals(optString2)) {
                            com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.module.impl.ReportServiceImpl.TAG, "bad case: %s", optString2);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24087, optString7, optString6);
                            jSONObject3.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString2);
                            jSONObject3.put("acf", format);
                            jSONObject3.toString();
                            com.tencent.mm.wallet_core.ui.r1.G().putString(str2, android.util.Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                            return;
                        }
                        jSONObject3.put("acf", optString7 + "-" + format);
                        jSONObject3.toString();
                        com.tencent.mm.wallet_core.ui.r1.G().putString(str2, android.util.Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.kinda.framework.module.impl.ReportServiceImpl.TAG, e18, "", new java.lang.Object[0]);
                }
            }
        }, "wcpay_acf_report");
    }

    @Override // com.tencent.kinda.gen.KReportService
    public long svrTimeMs() {
        return c01.id.a();
    }
}

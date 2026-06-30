package com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220;

/* renamed from: com.tencent.kinda.framework.module.impl.ReportServiceImpl */
/* loaded from: classes.dex */
public class C3257xb76a4481 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3518x9cecc856 {

    /* renamed from: ACF_REPORT_KEY */
    private static final java.lang.String f12457xb128536f = "acfReport_";

    /* renamed from: LAST_REPORT_SESSION_KEY */
    private static final java.lang.String f12458x7a6dc6b4 = "lastReportSession";
    private static final java.lang.String TAG = "MicroMsg.ReportServiceImpl";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3518x9cecc856
    /* renamed from: getLastSessionInfo */
    public java.lang.String mo25950x6564adb8() {
        return com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G().getString(f12458x7a6dc6b4, "");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3518x9cecc856
    /* renamed from: idkeyStat */
    public void mo25951x336bdfd8(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(j17, j18, j19, z17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3518x9cecc856
    /* renamed from: kvStat */
    public void mo25952xbd3cda5f(int i17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(i17, str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3518x9cecc856
    /* renamed from: setLastSessionInfo */
    public void mo25953x9c3b472c(final java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 G = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G();
        G.getClass();
        G.putString(f12458x7a6dc6b4, str).apply();
        ((ku5.t0) ku5.t0.f394148d).h(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.module.impl.ReportServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                java.lang.String str2 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3257xb76a4481.f12457xb128536f + gm0.j1.b().j();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    java.lang.String string = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G().getString(str2, "");
                    try {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                            return;
                        }
                        try {
                            org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(string, 2)));
                            java.lang.String optString = jSONObject.optString("acf");
                            if (optString.length() > 7000) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3257xb76a4481.TAG, "over length: %s", java.lang.Integer.valueOf(optString.length()));
                                optString = optString.substring(0, 7000);
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24087, optString, jSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984));
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3257xb76a4481.TAG, e17, "", new java.lang.Object[0]);
                        }
                        return;
                    } finally {
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G().remove(str2);
                    }
                }
                java.lang.String string2 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G().getString(str2, "");
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) ? "{}" : new java.lang.String(android.util.Base64.decode(string2, 2));
                try {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
                    java.lang.String optString2 = jSONObject2.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                    java.lang.String optString3 = jSONObject2.optString("lastReportUrl");
                    java.lang.String optString4 = jSONObject2.optString("logType");
                    java.lang.String optString5 = jSONObject2.optString("logAction");
                    if (!optString3.equals("NetworkChange") && !optString3.equals("MemoryWarning")) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(str3);
                        java.lang.String optString6 = jSONObject3.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
                        java.lang.String optString7 = jSONObject3.optString("acf");
                        java.lang.String format = java.lang.String.format("%s(%s:%s)", optString3, optString4, optString5);
                        java.lang.String[] split = optString7.split("-");
                        int length = split.length;
                        if (length >= 2 && split[length - 1].equals(format) && split[length - 2].equals(format)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3257xb76a4481.TAG, "skip duplicate action node: %s", format);
                            return;
                        }
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString6)) {
                            jSONObject3.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString2);
                            jSONObject3.put("acf", format);
                            jSONObject3.toString();
                            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G().putString(str2, android.util.Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                            return;
                        }
                        if (!optString6.equals(optString2)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3257xb76a4481.TAG, "bad case: %s", optString2);
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(24087, optString7, optString6);
                            jSONObject3.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, optString2);
                            jSONObject3.put("acf", format);
                            jSONObject3.toString();
                            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G().putString(str2, android.util.Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                            return;
                        }
                        jSONObject3.put("acf", optString7 + "-" + format);
                        jSONObject3.toString();
                        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.G().putString(str2, android.util.Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                    }
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3257xb76a4481.TAG, e18, "", new java.lang.Object[0]);
                }
            }
        }, "wcpay_acf_report");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3518x9cecc856
    /* renamed from: svrTimeMs */
    public long mo25954xa060b8a2() {
        return c01.id.a();
    }
}

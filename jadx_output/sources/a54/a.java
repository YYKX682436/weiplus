package a54;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a54.a f1589a = new a54.a();

    public static void c(a54.a aVar, java.lang.String channel, java.lang.String header, java.lang.String content, java.lang.String extra1, java.lang.String extra2, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvReport$default", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        if ((i17 & 8) != 0) {
            extra1 = "";
        }
        if ((i17 & 16) != 0) {
            extra2 = "";
        }
        aVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(vd1.h.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        kotlin.jvm.internal.o.g(channel, "channel");
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(extra1, "extra1");
        kotlin.jvm.internal.o.g(extra2, "extra2");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28131, channel, header, content, extra1, extra2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(vd1.h.NAME, "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvReport$default", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
    }

    public final void a(java.lang.String str, r45.n2 n2Var, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
            return;
        }
        if (n2Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
            return;
        }
        if (str2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
            return;
        }
        try {
            java.lang.String b17 = b(n2Var);
            java.lang.String encode = java.net.URLEncoder.encode(b17, com.tencent.mapsdk.internal.rv.f51270c);
            java.lang.String encode2 = java.net.URLEncoder.encode(str2, com.tencent.mapsdk.internal.rv.f51270c);
            int length = str.length() + encode.length() + encode2.length();
            com.tencent.mars.xlog.Log.i("AdChannelKvReporter", "channel=" + str + ", header.len=" + b17.length() + ", content.len=" + str2.length() + ", encodedHeader.len=" + encode.length() + ", encodedContent.len=" + encode2.length() + ", total=" + length);
            if (length < 7168) {
                c(this, str, encode, encode2, null, null, 24, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 114);
            } else {
                com.tencent.mars.xlog.Log.e("AdChannelKvReporter", "content too long for kv");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 115);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.tencent.mars.xlog.Log.e("AdChannelKvReporter", "checkKvReport exp=" + th);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
    }

    public final java.lang.String b(r45.n2 n2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertHeaderToJsonStr", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_NETWORK_TYPE, n2Var.f381000e);
        jSONObject.put("os_type", n2Var.f381003h);
        jSONObject.put("oaid", n2Var.f381005m);
        jSONObject.put("imei", n2Var.f381006n);
        jSONObject.put("ua", n2Var.f381009q);
        jSONObject.put("common_device_id", n2Var.f381010r);
        jSONObject.put("waid", n2Var.f381011s);
        jSONObject.put("pkg_name", n2Var.f381012t);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertHeaderToJsonStr", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        return jSONObject2;
    }
}

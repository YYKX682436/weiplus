package a54;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a54.a f83122a = new a54.a();

    public static void c(a54.a aVar, java.lang.String channel, java.lang.String header, java.lang.String content, java.lang.String extra1, java.lang.String extra2, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("kvReport$default", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        if ((i17 & 8) != 0) {
            extra1 = "";
        }
        if ((i17 & 16) != 0) {
            extra2 = "";
        }
        aVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(vd1.h.f77285x24728b, "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra1, "extra1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra2, "extra2");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(28131, channel, header, content, extra1, extra2);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(vd1.h.f77285x24728b, "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("kvReport$default", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
    }

    public final void a(java.lang.String str, r45.n2 n2Var, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        try {
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
            return;
        }
        if (n2Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
            return;
        }
        if (str2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
            return;
        }
        try {
            java.lang.String b17 = b(n2Var);
            java.lang.String encode = java.net.URLEncoder.encode(b17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            java.lang.String encode2 = java.net.URLEncoder.encode(str2, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            int length = str.length() + encode.length() + encode2.length();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdChannelKvReporter", "channel=" + str + ", header.len=" + b17.length() + ", content.len=" + str2.length() + ", encodedHeader.len=" + encode.length() + ", encodedContent.len=" + encode2.length() + ", total=" + length);
            if (length < 7168) {
                c(this, str, encode, encode2, null, null, 24, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 114);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdChannelKvReporter", "content too long for kv");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1612, 115);
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdChannelKvReporter", "checkKvReport exp=" + th);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkKvReport", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
    }

    public final java.lang.String b(r45.n2 n2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertHeaderToJsonStr", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52918x89383abf, n2Var.f462533e);
        jSONObject.put("os_type", n2Var.f462536h);
        jSONObject.put("oaid", n2Var.f462538m);
        jSONObject.put("imei", n2Var.f462539n);
        jSONObject.put("ua", n2Var.f462542q);
        jSONObject.put("common_device_id", n2Var.f462543r);
        jSONObject.put("waid", n2Var.f462544s);
        jSONObject.put("pkg_name", n2Var.f462545t);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertHeaderToJsonStr", "com.tencent.mm.plugin.sns.ad.landingpage.AdChannelKvReporter");
        return jSONObject2;
    }
}

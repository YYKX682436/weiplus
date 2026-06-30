package l44;

/* loaded from: classes4.dex */
public abstract class e {
    public static final org.json.JSONObject a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaCapabilityJson", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        boolean Di = d11.s.Di(6);
        boolean g17 = m11.n1.g();
        boolean m17 = m44.a.m();
        boolean l17 = m44.a.l();
        boolean k17 = m44.a.k();
        int i17 = (!m44.a.o() || k17) ? 0 : 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCapabilityHelper", "sdkInt=" + android.os.Build.VERSION.SDK_INT + ", isExptDeviceDisable=" + k17 + ", isExptEnableAvif=" + m17 + ", isExptEnableAdLandingPageAvif=" + l17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("supportH265", Di ? 1 : 0);
        jSONObject.put("supportWebP", g17 ? 1 : 0);
        jSONObject.put("supportAVIF", i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaCapabilityJson", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        return jSONObject;
    }

    public static final java.lang.String b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaCapabilityString", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        java.lang.String jSONObject = a().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaCapabilityString", "com.tencent.mm.plugin.sns.ad.helper.AdCapabilityHelper");
        return jSONObject;
    }
}

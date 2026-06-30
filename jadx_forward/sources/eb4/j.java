package eb4;

/* loaded from: classes4.dex */
public final class j implements eb4.e {

    /* renamed from: a, reason: collision with root package name */
    public static final eb4.j f332422a = new eb4.j();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eb4.e
    public void a(org.json.JSONObject paramsJson, android.content.Context context, yz5.p jsCallback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("process", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.FloatCompJsApi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsJson, "paramsJson");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsCallback, "jsCallback");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6043xb4097527 c6043xb4097527 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6043xb4097527();
        int i17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(paramsJson.optString("action"), "show") ? 1 : 0;
        am.hv hvVar = c6043xb4097527.f136332g;
        if (hvVar != null) {
            hvVar.f88404a = i17;
        }
        if (hvVar != null) {
            hvVar.f88405b = context;
        }
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nd) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773 activityC18007x6d5e9773 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nd) context);
            activityC18007x6d5e9773.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            ab4.n0 A7 = activityC18007x6d5e9773.A7();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("snsid", A7.j());
            jSONObject.put("uxinfo", A7.o());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, A7.l());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("action", i17 != 0 ? "hide" : "show");
            jSONObject2.put("result", ya.b.f77504xbb80cbe3);
            jSONObject.put("extInfo", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            ca4.m0.a("sns_ad_h5_js_control_float_component", jSONObject3);
        }
        c6043xb4097527.e();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("ret", "0");
        linkedHashMap.put("err_msg", "ok");
        jsCallback.mo149xb9724478("ok", linkedHashMap);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("process", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.FloatCompJsApi");
    }
}

package m54;

/* loaded from: classes4.dex */
public final class h0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public int f405803d;

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        float f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.VangoghPageKeyboardObserver", "the keyboard height is " + i17 + ", the resized is " + z17);
        m54.g0 g0Var = m54.g0.f405801a;
        if (i17 > 100) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toVangoghPageSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver$Companion");
            float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            if (g17 > 1.0f) {
                f17 = i17 / g17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toVangoghPageSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver$Companion");
            } else {
                f17 = 1.0f * i17;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toVangoghPageSize", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver$Companion");
            }
            int i18 = this.f405803d;
            if (i18 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishKeyboardWillShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardWillShow", jSONObject);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishKeyboardWillShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishKeyboardDidShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardDidShow", jSONObject2);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishKeyboardDidShow", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            } else if (i18 != i17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishKeyboardWillChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardWillChangeFrame", jSONObject3);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishKeyboardWillChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishKeyboardDidChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("keyboardHeight", java.lang.Float.valueOf(f17));
                g0Var.a("onKeyboardDidChangeFrame", jSONObject4);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishKeyboardDidChangeFrame", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            }
            this.f405803d = i17;
        } else {
            if (this.f405803d > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishKeyboardWillHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                g0Var.a("onKeyboardWillHide", null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishKeyboardWillHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishKeyboardDidHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                g0Var.a("onKeyboardDidHide", null);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishVangoghPageEvent$default", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("publishKeyboardDidHide", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageEventPublisher");
            }
            this.f405803d = 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onKeyboardHeightChanged", "com.tencent.mm.plugin.sns.ad.landingpage.dynamic.VangoghPageKeyboardObserver");
    }
}

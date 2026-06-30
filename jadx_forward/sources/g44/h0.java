package g44;

/* loaded from: classes4.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g44.h0 f350361a = new g44.h0();

    public final void a(android.content.Context context, s34.k1 k1Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17, yz5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        if (k1Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        if (aVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        int i18 = i17 == 0 ? 1 : 2;
        java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", t07);
        jSONObject.put("uxinfo", c17933xe8d1b226.m70375x338a8cc7());
        jSONObject.put("adExtInfo", c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i18);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("clickAction", 0);
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_half_screen_weapp_game_gift_report", jSONObject3);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dcj, (android.view.ViewGroup) null);
        if (inflate == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f78246x851a1260);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569229ph4);
        if (imageView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569230ph5);
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569228q35);
        if (textView2 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569227q34);
        if (textView3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.pzg);
        if (button == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        java.lang.String str = k1Var.f484225a;
        if (!r26.n0.N(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGameIcon", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            a84.m.a(str, imageView);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGameTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGameTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        textView.setText(k1Var.f484226b);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTipWording", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTipWording", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        textView2.setText(k1Var.f484227c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGiftName", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGiftName", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        textView3.setText(k1Var.f484229e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getButtonTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getButtonTitle", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        button.setText(k1Var.f484230f);
        button.setOnClickListener(new g44.f0(k1Var, h0Var, aVar, t07, c17933xe8d1b226, i18));
        h0Var.f391656d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
        android.view.ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) h0Var.f391656d;
        if (k0Var != null) {
            k0Var.s(inflate, true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) h0Var.f391656d;
        if (k0Var2 != null) {
            k0Var2.V1 = true;
        }
        if (k0Var2 != null) {
            k0Var2.e(true);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) h0Var.f391656d;
        if (k0Var3 != null) {
            k0Var3.v();
        }
        c22699x3dcdb352.setOnClickListener(new g44.g0(h0Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper");
    }
}

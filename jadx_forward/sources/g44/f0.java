package g44;

/* loaded from: classes4.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s34.k1 f350353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f350354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f350355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f350356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f350357h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f350358i;

    public f0(s34.k1 k1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17) {
        this.f350353d = k1Var;
        this.f350354e = h0Var;
        this.f350355f = aVar;
        this.f350356g = str;
        this.f350357h = c17933xe8d1b226;
        this.f350358i = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("snsid", this.f350356g);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f350357h;
        jSONObject.put("uxinfo", c17933xe8d1b226.m70375x338a8cc7());
        jSONObject.put("adExtInfo", c17933xe8d1b226.m70354x74235b3e().f38172xd73c98cc);
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f350358i);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("clickAction", 1);
        jSONObject.put("extInfo", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_half_screen_weapp_game_gift_report", jSONObject3);
        s34.k1 k1Var = this.f350353d;
        k1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
        if (!r26.n0.N(k1Var.f484228d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGiftCode", "com.tencent.mm.plugin.sns.ad.adxml.OpenWeAppGameHalfScreenInfo");
            l44.k.c(k1Var.f484228d);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f350354e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) h0Var.f391656d;
        if ((k0Var2 != null && k0Var2.i()) && (k0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0) h0Var.f391656d) != null) {
            k0Var.u();
        }
        this.f350355f.mo152xb9724478();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdOpenWeAppGameHalfScreenHelper$showBottomSheet$1");
    }
}

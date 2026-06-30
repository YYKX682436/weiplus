package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class o6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f163979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f163980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, org.json.JSONObject jSONObject, java.lang.String str) {
        super(0);
        this.f163979d = n7Var;
        this.f163980e = jSONObject;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = this.f163979d.mo32091x9a3f0ba2();
        if (this.f163980e.optBoolean("shouldHighlight")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 Q3 = this.f163979d.Q3();
            java.lang.String iconUrl = mo32091x9a3f0ba2.u0().f158813f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconUrl, "iconUrl");
            java.lang.String brandName = mo32091x9a3f0ba2.u0().f158812e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(brandName, "brandName");
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(mo32091x9a3f0ba2.E0().f387385r.f156932d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getTipNameByDebugType(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = mo32091x9a3f0ba2.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getInitConfig(...)");
            Q3.getClass();
            p91.b bVar = Q3.f168213e;
            if (bVar.f434412e.getVisibility() == 0) {
                android.view.View view = bVar.f434414g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter", "doFlicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter", "doFlicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.2f);
                alphaAnimation.setRepeatCount(1);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.e9(Q3));
                bVar.f434414g.startAnimation(alphaAnimation);
            } else {
                Q3.b(false, iconUrl, brandName, a17, u07);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 Q32 = this.f163979d.Q3();
            java.lang.String iconUrl2 = mo32091x9a3f0ba2.u0().f158813f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iconUrl2, "iconUrl");
            java.lang.String brandName2 = mo32091x9a3f0ba2.u0().f158812e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(brandName2, "brandName");
            java.lang.String a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p.a(mo32091x9a3f0ba2.E0().f387385r.f156932d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "getTipNameByDebugType(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08 = mo32091x9a3f0ba2.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u08, "getInitConfig(...)");
            Q32.c(iconUrl2, brandName2, a18, u08);
        }
        return jz5.f0.f384359a;
    }
}

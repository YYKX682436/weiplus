package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public final class o6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f82446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f82447e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(com.tencent.mm.plugin.appbrand.page.n7 n7Var, org.json.JSONObject jSONObject, java.lang.String str) {
        super(0);
        this.f82446d = n7Var;
        this.f82447e = jSONObject;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.o6 runtime = this.f82446d.getRuntime();
        if (this.f82447e.optBoolean("shouldHighlight")) {
            com.tencent.mm.plugin.appbrand.page.h9 Q3 = this.f82446d.Q3();
            java.lang.String iconUrl = runtime.u0().f77280f;
            kotlin.jvm.internal.o.f(iconUrl, "iconUrl");
            java.lang.String brandName = runtime.u0().f77279e;
            kotlin.jvm.internal.o.f(brandName, "brandName");
            java.lang.String a17 = com.tencent.mm.plugin.appbrand.appcache.p.a(runtime.E0().f305852r.f75399d);
            kotlin.jvm.internal.o.f(a17, "getTipNameByDebugType(...)");
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07 = runtime.u0();
            kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
            Q3.getClass();
            p91.b bVar = Q3.f86680e;
            if (bVar.f352879e.getVisibility() == 0) {
                android.view.View view = bVar.f352881g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter", "doFlicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/AppBrandSinglePageModeFooter", "doFlicker", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 0.2f);
                alphaAnimation.setRepeatCount(1);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setRepeatMode(2);
                alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.appbrand.page.e9(Q3));
                bVar.f352881g.startAnimation(alphaAnimation);
            } else {
                Q3.b(false, iconUrl, brandName, a17, u07);
            }
        } else {
            com.tencent.mm.plugin.appbrand.page.h9 Q32 = this.f82446d.Q3();
            java.lang.String iconUrl2 = runtime.u0().f77280f;
            kotlin.jvm.internal.o.f(iconUrl2, "iconUrl");
            java.lang.String brandName2 = runtime.u0().f77279e;
            kotlin.jvm.internal.o.f(brandName2, "brandName");
            java.lang.String a18 = com.tencent.mm.plugin.appbrand.appcache.p.a(runtime.E0().f305852r.f75399d);
            kotlin.jvm.internal.o.f(a18, "getTipNameByDebugType(...)");
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08 = runtime.u0();
            kotlin.jvm.internal.o.f(u08, "getInitConfig(...)");
            Q32.c(iconUrl2, brandName2, a18, u08);
        }
        return jz5.f0.f302826a;
    }
}

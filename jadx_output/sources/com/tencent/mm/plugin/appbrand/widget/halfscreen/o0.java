package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.p0 f91212d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.appbrand.widget.halfscreen.p0 p0Var) {
        super(0);
        this.f91212d = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.p0 p0Var = this.f91212d;
        android.app.Activity r07 = p0Var.f91213a.r0();
        if (r07 == null) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = p0Var.f91213a.u0().L1;
        halfScreenConfig.getClass();
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig = com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig.f77383f;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.CloseWhenClickEmptyAreaConfig closeWhenClickEmptyAreaConfig2 = halfScreenConfig.f77362i;
        boolean z17 = false;
        if (!kotlin.jvm.internal.o.b(closeWhenClickEmptyAreaConfig2, closeWhenClickEmptyAreaConfig)) {
            com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent appBrandHalfScreenCloseAnimationSettingEvent = new com.tencent.mm.autogen.events.AppBrandHalfScreenCloseAnimationSettingEvent();
            int hashCode = r07.hashCode();
            am.t tVar = appBrandHalfScreenCloseAnimationSettingEvent.f53980g;
            tVar.f7950a = hashCode;
            k91.s2 style = closeWhenClickEmptyAreaConfig2.f77385e;
            kotlin.jvm.internal.o.g(style, "style");
            tVar.f7951b = java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.widget.halfscreen.n0.f91208a[style.ordinal()] == 1 ? com.tencent.mm.R.anim.f477746a7 : com.tencent.mm.ui.uc.f211081d).intValue();
            appBrandHalfScreenCloseAnimationSettingEvent.e();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("extra_start_by_half_screen_empty_area_click_scene", true);
            intent.addFlags(603979776);
            intent.setClass(r07, java.lang.Class.forName(closeWhenClickEmptyAreaConfig2.f77384d));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(r07, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/config/HalfScreenConfig", "performCloseHalfScreen", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            r07.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(r07, "com/tencent/mm/plugin/appbrand/config/HalfScreenConfig", "performCloseHalfScreen", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function1;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

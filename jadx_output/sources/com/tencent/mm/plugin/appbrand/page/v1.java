package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class v1 extends al5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.x1 f87156a;

    public v1(com.tencent.mm.plugin.appbrand.page.x1 x1Var) {
        this.f87156a = x1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = this.f87156a;
        x1Var.setVisibility(8);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.page.u1(x1Var));
    }
}

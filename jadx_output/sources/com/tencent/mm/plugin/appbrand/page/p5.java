package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.q5 f86996d;

    public p5(com.tencent.mm.plugin.appbrand.page.q5 q5Var) {
        this.f86996d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.q5 q5Var = this.f86996d;
        com.tencent.mm.plugin.appbrand.page.d5 d5Var = q5Var.f87036e;
        com.tencent.mm.plugin.appbrand.page.x1 x1Var = d5Var.N;
        d5Var.N = new com.tencent.mm.plugin.appbrand.page.x1(q5Var.f87036e.getContext());
        com.tencent.mm.plugin.appbrand.page.n5 n5Var = new com.tencent.mm.plugin.appbrand.page.n5(this);
        q5Var.f87036e.N.setPositiveButton(n5Var);
        q5Var.f87036e.N.setNegativeButton(n5Var);
        com.tencent.mm.plugin.appbrand.page.d5 pageContainer = q5Var.f87036e;
        com.tencent.mm.plugin.appbrand.page.x1 x1Var2 = pageContainer.N;
        com.tencent.mm.plugin.appbrand.page.o5 o5Var = new com.tencent.mm.plugin.appbrand.page.o5(this, x1Var);
        x1Var2.getClass();
        kotlin.jvm.internal.o.g(pageContainer, "pageContainer");
        x1Var2.K = pageContainer;
        pageContainer.addView(x1Var2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        x1Var2.bringToFront();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = pageContainer.getRuntime();
        kotlin.jvm.internal.o.d(runtime);
        al1.b bVar = x1Var2.L;
        if (bVar != null) {
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u07 = runtime.u0();
            java.lang.String str = u07 != null ? u07.f77279e : null;
            if (str == null) {
                str = "";
            }
            bVar.setMainTitle(str);
            bVar.setBackgroundColor(0);
            bVar.setForegroundStyle(true);
            bVar.l(true, al1.h0.PageConfig);
        }
        android.widget.ImageView imageView = x1Var2.M;
        if (imageView != null) {
            android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            imageView.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
            l01.b bVar2 = l01.d0.f314761a;
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig u08 = runtime.u0();
            bVar2.b(imageView, u08 != null ? u08.f77280f : null, l01.a.h(), l01.q0.f314787d);
        }
        android.view.animation.Animation animation = x1Var2.f87242J;
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(x1Var2.getContext(), com.tencent.mm.ui.uc.f211078a);
        x1Var2.f87242J = loadAnimation;
        kotlin.jvm.internal.o.d(loadAnimation);
        loadAnimation.setAnimationListener(new com.tencent.mm.plugin.appbrand.page.w1(x1Var2, o5Var));
        android.view.animation.Animation animation2 = x1Var2.f87242J;
        kotlin.jvm.internal.o.d(animation2);
        x1Var2.startAnimation(animation2);
    }
}

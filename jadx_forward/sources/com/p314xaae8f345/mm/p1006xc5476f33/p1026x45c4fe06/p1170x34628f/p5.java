package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q5 f168529d;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q5 q5Var) {
        this.f168529d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q5 q5Var = this.f168529d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 d5Var = q5Var.f168569e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var = d5Var.N;
        d5Var.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1(q5Var.f168569e.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n5 n5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n5(this);
        q5Var.f168569e.N.m52249x3240c38d(n5Var);
        q5Var.f168569e.N.m52248x19ed98c9(n5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d5 pageContainer = q5Var.f168569e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.x1 x1Var2 = pageContainer.N;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o5 o5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o5(this, x1Var);
        x1Var2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageContainer, "pageContainer");
        x1Var2.K = pageContainer;
        pageContainer.addView(x1Var2, new android.widget.FrameLayout.LayoutParams(-1, -1));
        x1Var2.bringToFront();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo52154x9a3f0ba2 = pageContainer.mo52154x9a3f0ba2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo52154x9a3f0ba2);
        al1.b bVar = x1Var2.L;
        if (bVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u07 = mo52154x9a3f0ba2.u0();
            java.lang.String str = u07 != null ? u07.f158812e : null;
            if (str == null) {
                str = "";
            }
            bVar.mo2224x4c2b09dd(str);
            bVar.mo134899x67f06213(0);
            bVar.m2221xf5e6816c(true);
            bVar.l(true, al1.h0.PageConfig);
        }
        android.widget.ImageView imageView = x1Var2.M;
        if (imageView != null) {
            android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            imageView.setColorFilter(new android.graphics.ColorMatrixColorFilter(colorMatrix));
            l01.b bVar2 = l01.d0.f396294a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 u08 = mo52154x9a3f0ba2.u0();
            bVar2.b(imageView, u08 != null ? u08.f158813f : null, l01.a.h(), l01.q0.f396320d);
        }
        android.view.animation.Animation animation = x1Var2.f168775J;
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(x1Var2.getContext(), com.p314xaae8f345.mm.ui.uc.f292611a);
        x1Var2.f168775J = loadAnimation;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(loadAnimation);
        loadAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.w1(x1Var2, o5Var));
        android.view.animation.Animation animation2 = x1Var2.f168775J;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(animation2);
        x1Var2.startAnimation(animation2);
    }
}

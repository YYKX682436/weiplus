package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 f196402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f196403e;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var, boolean z17) {
        this.f196402d = a5Var;
        this.f196403e = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.a5 a5Var = this.f196402d;
        a5Var.f446856d.setVisibility(8);
        a5Var.X.f199876a.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(r0.getContext()).y);
        a5Var.Y.f201373a.setTranslationY(com.p314xaae8f345.mm.ui.bl.b(r0.getContext()).y);
        a5Var.f193333r.setTranslationY(0.0f);
        if (this.f196403e) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.z4(a5Var));
        }
    }
}

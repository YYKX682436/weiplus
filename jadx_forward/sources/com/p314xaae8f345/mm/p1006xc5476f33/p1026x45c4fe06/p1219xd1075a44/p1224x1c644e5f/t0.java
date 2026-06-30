package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f;

/* loaded from: classes7.dex */
public final class t0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 f172754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0 f172755e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f172756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.AnimatorListenerAdapter f172757g;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0 x0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.f172754d = c0Var;
        this.f172755e = x0Var;
        this.f172756f = f0Var;
        this.f172757g = animatorListenerAdapter;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.q0, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.util.Objects.toString(this.f172754d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 c0Var = this.f172754d;
        if (c0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172600g || c0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172601h) {
            this.f172755e.F = false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(animation, this.f172755e.H)) {
            this.f172755e.G = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0 x0Var = this.f172755e;
            x0Var.H = null;
            x0Var.f172766a.H2.i(true, this.f172754d);
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f172757g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animation);
        }
        this.f172755e.o();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.util.Objects.toString(this.f172754d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 c0Var = this.f172754d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0 c0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172600g;
        if (c0Var == c0Var2 || c0Var == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.c0.f172601h) {
            this.f172755e.F = false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(animation, this.f172755e.H)) {
            this.f172755e.G = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.x0 x0Var = this.f172755e;
            x0Var.H = null;
            x0Var.f172766a.H2.i(false, this.f172754d);
            if (this.f172756f.f391649d != -1) {
                java.util.Objects.toString(this.f172754d);
                this.f172755e.k(this.f172756f.f391649d, true);
            }
            if (this.f172754d == c0Var2) {
                this.f172755e.f172766a.S();
            }
        }
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f172757g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animation);
        }
        this.f172755e.o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.q0, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.util.Objects.toString(this.f172754d);
        this.f172755e.G = true;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f172757g;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animation);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class dl extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f213435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f213436e;

    public dl(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f213435d = c0Var;
        this.f213436e = qVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f213435d;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        ((p3325xe03a0797.p3326xc267989b.r) this.f213436e).s(jz5.f0.f384359a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cl.f213318d);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f213435d;
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        ((p3325xe03a0797.p3326xc267989b.r) this.f213436e).s(jz5.f0.f384359a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cl.f213318d);
    }
}

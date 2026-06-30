package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes.dex */
public final class xr extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f214896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f214897e;

    public xr(yz5.a aVar) {
        this.f214897e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator a17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        this.f214896d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator a17) {
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        if (this.f214896d || (aVar = this.f214897e) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }
}

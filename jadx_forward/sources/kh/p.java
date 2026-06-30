package kh;

/* loaded from: classes12.dex */
public final class p implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.Animator.AnimatorListener f389415d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f389416e;

    public p(android.animation.Animator.AnimatorListener origin, java.lang.String taskName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskName, "taskName");
        this.f389415d = origin;
        this.f389416e = taskName;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        try {
            kh.g.f389335f.h(this.f389416e, this.f389415d.hashCode(), new kh.l(this, animation));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationCancel");
            }
            throw e17;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        try {
            kh.g.f389335f.h(this.f389416e, this.f389415d.hashCode(), new kh.m(this, animation));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationEnd");
            }
            throw e17;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        try {
            kh.g.f389335f.h(this.f389416e, this.f389415d.hashCode(), new kh.n(this, animation));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationRepeat");
            }
            throw e17;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        try {
            kh.g.f389335f.h(this.f389416e, this.f389415d.hashCode(), new kh.o(this, animation));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.AnimatorTracker", e17, "wrapListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "ListenerWrap", "onAnimationStart");
            }
            throw e17;
        }
    }
}

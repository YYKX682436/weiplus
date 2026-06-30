package kh;

/* loaded from: classes12.dex */
public final class r implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.animation.ValueAnimator.AnimatorUpdateListener f389432d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f389433e;

    public r(android.animation.ValueAnimator.AnimatorUpdateListener origin, java.lang.String taskName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskName, "taskName");
        this.f389432d = origin;
        this.f389433e = taskName;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        try {
            kh.g.f389335f.h(this.f389433e, this.f389432d.hashCode(), new kh.q(this, animation));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.AnimatorTracker", e17, "wrapUpdateListenerErr: " + e17.getMessage(), new java.lang.Object[0]);
            boolean z17 = kh.k1.f389371n;
            if (kh.k1.f389371n) {
                ap.a.a(1, "errTrackAnimator", e17, null, "UpdateListenerWrap", "onAnimationUpdate");
            }
            throw e17;
        }
    }
}

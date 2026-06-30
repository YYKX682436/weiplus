package kf3;

/* loaded from: classes5.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 f388880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 f388881e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 c16484xf5149ba0, com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 c16484xf5149ba02) {
        this.f388880d = c16484xf5149ba0;
        this.f388881e = c16484xf5149ba02;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 c16484xf5149ba0 = this.f388881e;
        android.graphics.Rect rect = c16484xf5149ba0.f230056e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.C16484xf5149ba0 c16484xf5149ba02 = this.f388880d;
        c16484xf5149ba02.getGlobalVisibleRect(rect);
        c16484xf5149ba0.f230056e.top = c16484xf5149ba02.getTop();
        c16484xf5149ba0.f230056e.bottom = c16484xf5149ba02.getBottom();
        java.lang.Object animatedValue = animation.getAnimatedValue("alpha");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c16484xf5149ba0.f230057f.setAlpha((int) (255 * ((java.lang.Float) animatedValue).floatValue()));
        c16484xf5149ba0.postInvalidate();
    }
}

package ck3;

/* loaded from: classes8.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f124025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f124026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck3.a0 f124027f;

    public l(kk3.d dVar, android.graphics.Bitmap bitmap, ck3.a0 a0Var) {
        this.f124025d = dVar;
        this.f124026e = bitmap;
        this.f124027f = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new ck3.k(this.f124027f));
        kk3.d dVar = this.f124025d;
        if (dVar != null) {
            kk3.d.a(dVar, this.f124026e, 0, 2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        kk3.d dVar = this.f124025d;
        if (dVar != null) {
            kk3.d.c(dVar, this.f124026e, false, 0, 6, null);
        }
    }
}

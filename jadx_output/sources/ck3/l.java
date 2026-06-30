package ck3;

/* loaded from: classes8.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk3.d f42492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f42493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ck3.a0 f42494f;

    public l(kk3.d dVar, android.graphics.Bitmap bitmap, ck3.a0 a0Var) {
        this.f42492d = dVar;
        this.f42493e = bitmap;
        this.f42494f = a0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.sdk.platformtools.u3.h(new ck3.k(this.f42494f));
        kk3.d dVar = this.f42492d;
        if (dVar != null) {
            kk3.d.a(dVar, this.f42493e, 0, 2, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kk3.d dVar = this.f42492d;
        if (dVar != null) {
            kk3.d.c(dVar, this.f42493e, false, 0, 6, null);
        }
    }
}

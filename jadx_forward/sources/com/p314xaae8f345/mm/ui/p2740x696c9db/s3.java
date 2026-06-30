package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes2.dex */
public final class s3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f292223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f292224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f292225f;

    public s3(android.view.View view, float f17, boolean z17) {
        this.f292223d = view;
        this.f292224e = f17;
        this.f292225f = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = this.f292223d;
        if (view == null) {
            return;
        }
        float animatedFraction = this.f292224e * (this.f292225f ? it.getAnimatedFraction() : 1.0f - it.getAnimatedFraction());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(animatedFraction));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/ImageGalleryAnimation$createViewBgAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/tools/ImageGalleryAnimation$createViewBgAlphaAnimator$1$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}

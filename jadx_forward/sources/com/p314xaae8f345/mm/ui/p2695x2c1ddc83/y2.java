package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public final class y2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jl1.a f289791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f289792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 f289793f;

    public y2(jl1.a aVar, android.view.View view, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var) {
        this.f289791d = aVar;
        this.f289792e = view;
        this.f289793f = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("ratio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int a17 = this.f289791d.a(((java.lang.Float) animatedValue).floatValue());
        this.f289792e.setBackgroundColor(a17);
        android.graphics.drawable.ColorDrawable colorDrawable = this.f289793f.f288994c;
        if (colorDrawable != null) {
            colorDrawable.setColor(a17);
        }
    }
}

package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class d9 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.GradientDrawable f86530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.h9 f86531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f86532f;

    public d9(android.graphics.drawable.GradientDrawable gradientDrawable, com.tencent.mm.plugin.appbrand.page.h9 h9Var, yz5.a aVar) {
        this.f86530d = gradientDrawable;
        this.f86531e = h9Var;
        this.f86532f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        float a17 = com.tencent.mm.plugin.appbrand.page.y8.a(com.tencent.mm.plugin.appbrand.page.h9.f86673f);
        float[] fArr = {a17, a17, a17, a17, 0.0f, 0.0f, 0.0f, 0.0f};
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f86530d;
        gradientDrawable.setCornerRadii(fArr);
        this.f86531e.f86680e.f352879e.setBackground(gradientDrawable);
        this.f86532f.invoke();
    }
}

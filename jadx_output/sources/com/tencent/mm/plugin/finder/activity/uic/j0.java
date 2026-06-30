package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101898f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101899g;

    public j0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var, int i17, int i18, int i19) {
        this.f101896d = c1Var;
        this.f101897e = i17;
        this.f101898f = i18;
        this.f101899g = i19;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f101896d.f101844f;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText.setPadding(this.f101897e, this.f101898f, this.f101899g, intValue);
    }
}

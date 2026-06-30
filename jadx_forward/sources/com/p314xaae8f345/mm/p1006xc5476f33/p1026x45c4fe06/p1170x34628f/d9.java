package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class d9 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.GradientDrawable f168063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 f168064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f168065f;

    public d9(android.graphics.drawable.GradientDrawable gradientDrawable, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9 h9Var, yz5.a aVar) {
        this.f168063d = gradientDrawable;
        this.f168064e = h9Var;
        this.f168065f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.y8.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h9.f168206f);
        float[] fArr = {a17, a17, a17, a17, 0.0f, 0.0f, 0.0f, 0.0f};
        android.graphics.drawable.GradientDrawable gradientDrawable = this.f168063d;
        gradientDrawable.setCornerRadii(fArr);
        this.f168064e.f168213e.f434412e.setBackground(gradientDrawable);
        this.f168065f.mo152xb9724478();
    }
}

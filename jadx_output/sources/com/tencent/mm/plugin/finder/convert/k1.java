package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class k1 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f103793d;

    public k1(android.view.ViewGroup viewGroup) {
        this.f103793d = viewGroup;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f103793d;
        viewGroup.setAlpha(1.0f);
        viewGroup.setTranslationY(0.0f);
    }
}

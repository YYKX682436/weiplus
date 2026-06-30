package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class gf extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103480d;

    public gf(android.widget.ImageView imageView) {
        this.f103480d = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f103480d;
        imageView.setVisibility(8);
        imageView.setAlpha(1.0f);
        imageView.setTag(java.lang.Boolean.FALSE);
    }
}

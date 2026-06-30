package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class a1 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f102849d;

    public a1(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f102849d = weImageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f102849d.setVisibility(4);
    }
}

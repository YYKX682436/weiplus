package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes3.dex */
public class a0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f238171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f238172e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17117x395bed72 activityC17117x395bed72, java.lang.ref.WeakReference weakReference, int i17) {
        this.f238171d = weakReference;
        this.f238172e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = (android.view.View) this.f238171d.get();
        if (view != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height);
            layoutParams2.setMargins(layoutParams.leftMargin, this.f238172e, layoutParams.rightMargin, layoutParams.bottomMargin);
            view.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

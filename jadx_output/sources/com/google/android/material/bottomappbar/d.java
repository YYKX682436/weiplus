package com.google.android.material.bottomappbar;

/* loaded from: classes15.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f44376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ActionMenuView f44377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f44378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f44379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar f44380h;

    public d(com.google.android.material.bottomappbar.BottomAppBar bottomAppBar, androidx.appcompat.widget.ActionMenuView actionMenuView, int i17, boolean z17) {
        this.f44380h = bottomAppBar;
        this.f44377e = actionMenuView;
        this.f44378f = i17;
        this.f44379g = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f44376d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        if (this.f44376d) {
            return;
        }
        int i17 = com.google.android.material.bottomappbar.BottomAppBar.B1;
        this.f44380h.y(this.f44377e, this.f44378f, this.f44379g);
    }
}

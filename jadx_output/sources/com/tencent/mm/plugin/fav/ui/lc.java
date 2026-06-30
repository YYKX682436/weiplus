package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class lc extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.nc f101250d;

    public lc(com.tencent.mm.plugin.fav.ui.nc ncVar) {
        this.f101250d = ncVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f101250d.f101305g.setAlpha(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f101250d.f101305g.setAlpha(0.0f);
    }
}

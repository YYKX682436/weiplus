package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109870e;

    public n(android.view.View view, android.view.View view2) {
        this.f109869d = view;
        this.f109870e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f109869d;
        float height = view.getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(height, 0.0f);
        ofFloat.setDuration(300L);
        android.view.View view2 = this.f109870e;
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.k(view, view2, height));
        com.tencent.mm.plugin.finder.feed.ui.commentimage.l lVar = new com.tencent.mm.plugin.finder.feed.ui.commentimage.l(view, view2, height);
        ofFloat.addListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.m(lVar, lVar, view));
        ofFloat.start();
    }
}

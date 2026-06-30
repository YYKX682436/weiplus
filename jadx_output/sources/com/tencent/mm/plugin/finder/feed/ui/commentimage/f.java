package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f109841e;

    public f(android.view.View view, android.view.View view2) {
        this.f109840d = view;
        this.f109841e = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f109840d;
        float height = view.getHeight();
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, height);
        ofFloat.setDuration(300L);
        android.view.View view2 = this.f109841e;
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.c(view, view2, height));
        com.tencent.mm.plugin.finder.feed.ui.commentimage.d dVar = new com.tencent.mm.plugin.finder.feed.ui.commentimage.d(view, height, view2);
        ofFloat.addListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.e(dVar, dVar));
        ofFloat.start();
    }
}

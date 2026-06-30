package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class v0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.LayoutManager f109906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f109907f;

    public v0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI, androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager, int i17) {
        this.f109905d = finderCommentImageFlowUI;
        this.f109906e = layoutManager;
        this.f109907f = i17;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.ViewTreeObserver viewTreeObserver;
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109905d;
        androidx.recyclerview.widget.RecyclerView recyclerView = finderCommentImageFlowUI.f109777u;
        if (recyclerView != null && (viewTreeObserver = recyclerView.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = this.f109906e;
        int i17 = this.f109907f;
        android.view.View findViewByPosition = layoutManager.findViewByPosition(i17);
        if (findViewByPosition != null) {
            android.os.Bundle bundle = finderCommentImageFlowUI.I;
            if (!finderCommentImageFlowUI.H) {
                finderCommentImageFlowUI.H = true;
                android.graphics.Rect rect = finderCommentImageFlowUI.M;
                if (rect == null) {
                    com.tencent.mars.xlog.Log.e("FinderCommentImageFlowUI", "currentCommentImageRect is null");
                    finderCommentImageFlowUI.finish();
                } else {
                    int i18 = rect.left;
                    int i19 = rect.top;
                    int width = rect.width();
                    int height = rect.height();
                    com.tencent.mm.ui.tools.s4 s4Var = finderCommentImageFlowUI.F;
                    s4Var.e(i18, i19, width, height);
                    if (bundle == null) {
                        android.view.View findViewById = findViewByPosition.findViewById(com.tencent.mm.R.id.u76);
                        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById;
                        android.view.View findViewById2 = findViewByPosition.findViewById(com.tencent.mm.R.id.ssh);
                        s4Var.c(mMGestureGallery, finderCommentImageFlowUI.f109782z, new com.tencent.mm.plugin.finder.feed.ui.commentimage.o0(finderCommentImageFlowUI));
                        if (finderCommentImageFlowUI.P && i17 == 0) {
                            mMGestureGallery.setGalleryScaleListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.n0(mMGestureGallery, finderCommentImageFlowUI));
                        }
                        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(200L);
                        ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.p0(findViewById2, finderCommentImageFlowUI));
                        ofFloat.addListener(new com.tencent.mm.plugin.finder.feed.ui.commentimage.q0(findViewById2, finderCommentImageFlowUI));
                        ofFloat.start();
                    }
                }
            }
        }
        return true;
    }
}

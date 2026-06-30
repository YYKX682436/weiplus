package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class n0 implements com.tencent.mm.ui.tools.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.MMGestureGallery f109871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109872b;

    public n0(com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery, com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109871a = mMGestureGallery;
        this.f109872b = finderCommentImageFlowUI;
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void a(float f17, float f18) {
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f109871a;
        if (mMGestureGallery.getHeight() <= 0) {
            return;
        }
        float height = 1 - (f18 / mMGestureGallery.getHeight());
        if (height > 1.0f) {
            height = 1.0f;
        }
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109872b;
        finderCommentImageFlowUI.f109775J = height;
        android.view.View selectedView = mMGestureGallery.getSelectedView();
        if (selectedView != null) {
            selectedView.setPivotX(mMGestureGallery.getWidth() / 2.0f);
            selectedView.setPivotY(mMGestureGallery.getHeight() / 2.0f);
            selectedView.setScaleX(height);
            selectedView.setScaleY(height);
            selectedView.setTranslationX(f17);
            selectedView.setTranslationY(f18);
            ug5.x.e(finderCommentImageFlowUI.getWindow(), height < 1.0f ? 0 : -16777216);
            android.view.View view = finderCommentImageFlowUI.f109782z;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(height));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$runDragAnimation$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/commentimage/FinderCommentImageFlowUI$runDragAnimation$1", "onGalleryScale", "(FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    @Override // com.tencent.mm.ui.tools.o5
    public void b(float f17, float f18) {
        com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI = this.f109872b;
        finderCommentImageFlowUI.K = (int) f17;
        finderCommentImageFlowUI.L = (int) f18;
    }
}

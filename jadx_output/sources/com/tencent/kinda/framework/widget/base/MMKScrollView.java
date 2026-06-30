package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKScrollView extends com.tencent.kinda.framework.widget.base.MMKViewLayout<com.tencent.mm.wallet_core.ui.MMScrollView> implements com.tencent.kinda.gen.KScrollView {
    protected static final java.lang.String TAG = "MMKScrollView";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.framework.widget.base.MMKViewLayout, com.tencent.kinda.gen.KViewLayout
    public void addView(com.tencent.kinda.gen.KView kView, int i17) {
        if (kView instanceof com.tencent.kinda.framework.widget.base.MMKViewLayout) {
            com.tencent.mm.sdk.platformtools.Log.a(TAG, "%s addView: %s, childCount: %s %s", this, kView, java.lang.Integer.valueOf(((com.tencent.kinda.framework.widget.base.MMKViewLayout) kView).childList.size()), java.lang.Integer.valueOf(this.childList.size()));
        } else {
            com.tencent.mm.sdk.platformtools.Log.a(TAG, "%s addView: %s, childCount: %s", this, kView, java.lang.Integer.valueOf(this.childList.size()));
        }
        com.tencent.kinda.framework.widget.base.MMKView mMKView = (com.tencent.kinda.framework.widget.base.MMKView) kView;
        this.childList.add(mMKView);
        ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).addView(mMKView.getView());
        float marginLeft = kView.getMarginLeft();
        float marginRight = kView.getMarginRight();
        float marginTop = kView.getMarginTop();
        float marginBottom = kView.getMarginBottom();
        com.tencent.kinda.framework.widget.base.MMKView mMKView2 = (com.tencent.kinda.framework.widget.base.MMKView) kView;
        if (mMKView2.getView().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) mMKView2.getView().getLayoutParams();
            marginLayoutParams.topMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginTop);
            marginLayoutParams.bottomMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginBottom);
            marginLayoutParams.leftMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginLeft);
            marginLayoutParams.rightMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginRight);
            mMKView2.getView().setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KScrollView
    public com.tencent.kinda.gen.KPoint getContentOffset() {
        int c17 = i65.a.c(((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getContext(), ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getScrollX());
        int c18 = i65.a.c(((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getContext(), ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getScrollY());
        com.tencent.kinda.gen.KPoint kPoint = new com.tencent.kinda.gen.KPoint(c17, c18);
        com.tencent.mm.sdk.platformtools.Log.a(TAG, "getContentOffset  X: %s, Y: %s", java.lang.Integer.valueOf(c17), java.lang.Integer.valueOf(c18));
        return kPoint;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public float getHeight() {
        int i17;
        if (com.tencent.kinda.framework.widget.tools.KindaContext.get() != null) {
            android.util.DisplayMetrics displayMetrics = com.tencent.kinda.framework.widget.tools.KindaContext.get().getResources().getDisplayMetrics();
            int pxToDp = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getContext(), ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getHeight());
            int pxToDp2 = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getContext(), displayMetrics.heightPixels);
            com.tencent.mm.sdk.platformtools.Log.a(TAG, "getView() - %s scroolviewheight: %s,screenheight: %s", this, java.lang.Integer.valueOf(pxToDp), java.lang.Integer.valueOf(pxToDp2));
            i17 = java.lang.Math.min(pxToDp, pxToDp2);
        } else {
            i17 = 0;
        }
        return i17;
    }

    @Override // com.tencent.kinda.gen.KScrollView
    public boolean getScrollToDimissKeyboardEnabled() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KScrollView
    public boolean getScrollWhenViewSizeEnough() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KScrollView
    public boolean getShowScrollBar() {
        return ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).isVerticalScrollBarEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.framework.widget.base.MMKViewLayout, com.tencent.kinda.gen.KViewLayout
    public void removeView(com.tencent.kinda.gen.KView kView) {
        com.tencent.kinda.framework.widget.base.MMKView mMKView = (com.tencent.kinda.framework.widget.base.MMKView) kView;
        this.childList.remove(mMKView.getView());
        ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).removeView(mMKView.getView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KScrollView
    public void scrollTo(com.tencent.kinda.gen.KView kView, float f17, float f18, boolean z17) {
        android.view.View view = ((com.tencent.kinda.framework.widget.base.MMKView) kView).getView();
        int dpToPx = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, f17);
        int dpToPx2 = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, f18);
        if (this.childList.size() <= 0) {
            com.tencent.mars.xlog.Log.e(TAG, "has not contentView");
            return;
        }
        com.tencent.kinda.gen.KPoint convertPointToView = kView.convertPointToView(new com.tencent.kinda.gen.KPoint(0.0f, 0.0f), this.childList.get(0));
        float a17 = i65.a.a(this.mContext, kView.convertPointToView(new com.tencent.kinda.gen.KPoint(0.0f, 0.0f), this).mY);
        float height = view.getHeight() + a17;
        if (a17 >= 0.0f && height <= ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getHeight()) {
            com.tencent.mars.xlog.Log.i(TAG, "view is perfect visible, no need scroll to");
            return;
        }
        int a18 = i65.a.a(this.mContext, convertPointToView.mX);
        int a19 = dpToPx2 + i65.a.a(this.mContext, convertPointToView.mY);
        int i17 = dpToPx + a18;
        com.tencent.mars.xlog.Log.i(TAG, "scrollTo x:%s y:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a19));
        ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).scrollTo(java.lang.Math.max(i17, 0), java.lang.Math.max(a19, 0));
    }

    @Override // com.tencent.kinda.gen.KScrollView
    public void setContent(com.tencent.kinda.gen.KView kView) {
    }

    @Override // com.tencent.kinda.gen.KScrollView
    public void setContentInsect(float f17, float f18, float f19, float f27) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KScrollView
    public void setContentOffset(com.tencent.kinda.gen.KPoint kPoint) {
        final int dpToPx = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getContext(), (int) kPoint.getX());
        final int dpToPx2 = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).getContext(), (int) kPoint.getY());
        ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKScrollView.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                ((com.tencent.mm.wallet_core.ui.MMScrollView) com.tencent.kinda.framework.widget.base.MMKScrollView.this.getView()).scrollBy(dpToPx, dpToPx2);
            }
        }, 150L);
        com.tencent.mm.sdk.platformtools.Log.a(TAG, "setContentOffset  X: %s, Y: %s", java.lang.Integer.valueOf(dpToPx), java.lang.Integer.valueOf(dpToPx2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KScrollView
    public void setOnScrollCallback(final com.tencent.kinda.gen.KScrollViewOnScrollCallback kScrollViewOnScrollCallback) {
        if (kScrollViewOnScrollCallback != null) {
            ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).setOnScrollListener(new com.tencent.mm.wallet_core.ui.o() { // from class: com.tencent.kinda.framework.widget.base.MMKScrollView.1
                @Override // com.tencent.mm.wallet_core.ui.o
                public void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
                    kScrollViewOnScrollCallback.onScroll(i65.a.c(com.tencent.kinda.framework.widget.base.MMKScrollView.this.mContext, i17), i65.a.c(com.tencent.kinda.framework.widget.base.MMKScrollView.this.mContext, i18));
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KScrollView
    public void setScrollToDimissKeyboardEnabled(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KScrollView
    public void setScrollWhenViewSizeEnough(boolean z17) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KScrollView
    public void setShowScrollBar(boolean z17) {
        ((com.tencent.mm.wallet_core.ui.MMScrollView) getView()).setVerticalScrollBarEnabled(z17);
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKViewLayout, com.tencent.kinda.framework.widget.base.MMKView
    public com.tencent.mm.wallet_core.ui.MMScrollView createView(android.content.Context context) {
        com.tencent.mm.wallet_core.ui.MMScrollView mMScrollView = new com.tencent.mm.wallet_core.ui.MMScrollView(context);
        mMScrollView.setOverScrollMode(2);
        mMScrollView.setFillViewport(true);
        return mMScrollView;
    }

    @Override // com.tencent.kinda.gen.KScrollView
    public void setContentOffset(com.tencent.kinda.gen.KPoint kPoint, boolean z17) {
        setContentOffset(kPoint);
    }
}

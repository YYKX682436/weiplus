package com.tencent.kinda.framework.widget.base;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001'B\u0007¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J*\u0010\u0012\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001f\u001a\u00020\u0010H\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010!\u001a\u00020\u0010H\u0016J\u0012\u0010$\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¨\u0006("}, d2 = {"Lcom/tencent/kinda/framework/widget/base/MMKHorizontalScrollView;", "Lcom/tencent/kinda/framework/widget/base/MMKViewLayout;", "Lcom/tencent/mm/ui/base/MMHorizontalScrollView;", "Lcom/tencent/kinda/gen/KHorizontalScrollView;", "Landroid/content/Context;", "context", "createView", "Lcom/tencent/kinda/gen/KView;", "view", "", "position", "Ljz5/f0;", "addView", "", "xOffset", "yOffset", "", "animated", "scrollTo", "setContent", "top", "left", "bottom", "right", "setContentInsect", "Lcom/tencent/kinda/gen/KPoint;", "getContentOffset", "offset", "setContentOffset", "value", "setShowScrollBar", "getShowScrollBar", "setScrollWhenViewSizeEnough", "getScrollWhenViewSizeEnough", "Lcom/tencent/kinda/gen/KHorizontalScrollViewOnScrollCallback;", "callback", "setOnScrollCallback", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class MMKHorizontalScrollView extends com.tencent.kinda.framework.widget.base.MMKViewLayout<com.tencent.mm.ui.base.MMHorizontalScrollView> implements com.tencent.kinda.gen.KHorizontalScrollView {
    public static final java.lang.String TAG = "MMKHorizontalScrollView";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.framework.widget.base.MMKViewLayout, com.tencent.kinda.gen.KViewLayout
    public void addView(com.tencent.kinda.gen.KView kView, int i17) {
        if (kView instanceof com.tencent.kinda.framework.widget.base.MMKViewLayout) {
            com.tencent.mm.sdk.platformtools.Log.a(TAG, this + " addView: " + kView + ", childCount: " + ((com.tencent.kinda.framework.widget.base.MMKViewLayout) kView).childList.size() + ' ' + this.childList.size(), new java.lang.Object[0]);
        } else {
            com.tencent.mm.sdk.platformtools.Log.a(TAG, this + " addView: " + kView + ", childCount: " + this.childList.size(), new java.lang.Object[0]);
        }
        this.childList.add((com.tencent.kinda.framework.widget.base.MMKView) kView);
        com.tencent.mm.ui.base.MMHorizontalScrollView mMHorizontalScrollView = (com.tencent.mm.ui.base.MMHorizontalScrollView) getView();
        kotlin.jvm.internal.o.e(kView, "null cannot be cast to non-null type com.tencent.kinda.framework.widget.base.MMKView<*>");
        com.tencent.kinda.framework.widget.base.MMKView mMKView = (com.tencent.kinda.framework.widget.base.MMKView) kView;
        mMHorizontalScrollView.addView(mMKView.getView());
        float marginLeft = mMKView.getMarginLeft();
        float marginRight = mMKView.getMarginRight();
        float marginTop = mMKView.getMarginTop();
        float marginBottom = mMKView.getMarginBottom();
        if (mMKView.getView().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.LayoutParams layoutParams = mMKView.getView().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginTop);
            marginLayoutParams.bottomMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginBottom);
            marginLayoutParams.leftMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginLeft);
            marginLayoutParams.rightMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, marginRight);
            mMKView.getView().setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public com.tencent.kinda.gen.KPoint getContentOffset() {
        int c17 = i65.a.c(((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).getContext(), ((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).getScrollX());
        int c18 = i65.a.c(((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).getContext(), ((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).getScrollY());
        com.tencent.mm.sdk.platformtools.Log.a("MMKViewLayout", "getContentOffset X: " + c17 + " , Y: " + c18, new java.lang.Object[0]);
        return new com.tencent.kinda.gen.KPoint(c17, c18);
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public boolean getScrollWhenViewSizeEnough() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public boolean getShowScrollBar() {
        return ((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).isHorizontalScrollBarEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void scrollTo(com.tencent.kinda.gen.KView kView, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.e(kView, "null cannot be cast to non-null type com.tencent.kinda.framework.widget.base.MMKView<*>");
        android.view.View view = ((com.tencent.kinda.framework.widget.base.MMKView) kView).getView();
        ((com.tencent.mm.ui.base.MMHorizontalScrollView) getView()).scrollTo((int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, f17), view.getTop() - ((int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, f18)));
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void setContent(com.tencent.kinda.gen.KView kView) {
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void setContentInsect(float f17, float f18, float f19, float f27) {
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void setContentOffset(com.tencent.kinda.gen.KPoint kPoint) {
        final int dpToPx = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).getContext(), kPoint != null ? kPoint.getX() : 0.0f);
        final int dpToPx2 = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).getContext(), kPoint != null ? kPoint.getY() : 0.0f);
        ((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKHorizontalScrollView$setContentOffset$1
            @Override // java.lang.Runnable
            public final void run() {
                ((com.tencent.mm.ui.base.MMHorizontalScrollView) com.tencent.kinda.framework.widget.base.MMKHorizontalScrollView.this.view).scrollBy(dpToPx, dpToPx2);
            }
        }, 150L);
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void setOnScrollCallback(final com.tencent.kinda.gen.KHorizontalScrollViewOnScrollCallback kHorizontalScrollViewOnScrollCallback) {
        ((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).setOnScrollListener(new db5.w8() { // from class: com.tencent.kinda.framework.widget.base.MMKHorizontalScrollView$setOnScrollCallback$1
            @Override // db5.w8
            public void onScrollChange(android.view.View v17, int i17, int i18, int i19, int i27) {
                kotlin.jvm.internal.o.g(v17, "v");
                com.tencent.kinda.gen.KHorizontalScrollViewOnScrollCallback kHorizontalScrollViewOnScrollCallback2 = com.tencent.kinda.gen.KHorizontalScrollViewOnScrollCallback.this;
                if (kHorizontalScrollViewOnScrollCallback2 != null) {
                    kHorizontalScrollViewOnScrollCallback2.onScroll(i17, i18);
                }
            }
        });
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void setScrollWhenViewSizeEnough(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void setShowScrollBar(boolean z17) {
        ((com.tencent.mm.ui.base.MMHorizontalScrollView) this.view).setHorizontalScrollBarEnabled(z17);
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKViewLayout, com.tencent.kinda.framework.widget.base.MMKView
    public com.tencent.mm.ui.base.MMHorizontalScrollView createView(android.content.Context context) {
        if (context == null) {
            android.view.ViewGroup createView = super.createView(context);
            kotlin.jvm.internal.o.f(createView, "createView(...)");
            return (com.tencent.mm.ui.base.MMHorizontalScrollView) createView;
        }
        com.tencent.mm.ui.base.MMHorizontalScrollView mMHorizontalScrollView = new com.tencent.mm.ui.base.MMHorizontalScrollView(context);
        mMHorizontalScrollView.setOverScrollMode(2);
        mMHorizontalScrollView.setHorizontalScrollBarEnabled(false);
        mMHorizontalScrollView.setFillViewport(false);
        return mMHorizontalScrollView;
    }

    @Override // com.tencent.kinda.gen.KHorizontalScrollView
    public void setContentOffset(com.tencent.kinda.gen.KPoint kPoint, boolean z17) {
        setContentOffset(kPoint);
    }
}

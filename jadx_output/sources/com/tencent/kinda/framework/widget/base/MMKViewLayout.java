package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class MMKViewLayout<Layout extends android.view.ViewGroup> extends com.tencent.kinda.framework.widget.base.MMKView<Layout> implements com.tencent.kinda.gen.KViewLayout {
    protected static final java.lang.String TAG = "MMKViewLayout";
    public java.util.ArrayList<com.tencent.kinda.framework.widget.base.MMKView> childList = new java.util.ArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    private void addViewImpl(com.tencent.kinda.gen.KView kView, int i17) {
        if (getView() != 0) {
            com.tencent.kinda.gen.KView unWrapRealObj = com.tencent.kinda.framework.animate.KindaAnimatorViewProxy.unWrapRealObj(kView);
            boolean z17 = unWrapRealObj instanceof com.tencent.kinda.framework.widget.base.MMKView;
            if (!z17) {
                com.tencent.mars.xlog.Log.e(TAG, "error error %s child %s %s", getView(), unWrapRealObj, java.lang.Boolean.valueOf(z17));
                return;
            }
            com.tencent.kinda.framework.widget.base.MMKView mMKView = (com.tencent.kinda.framework.widget.base.MMKView) unWrapRealObj;
            com.tencent.mm.sdk.platformtools.Log.a(TAG, "%s addview this %s | child %s | childparent %s | childCount: %s", this, getView(), mMKView.getView(), mMKView.getView().getParent(), java.lang.Integer.valueOf(this.childList.size()));
            if (mMKView.node() != null && mMKView.node().getData() == null) {
                mMKView.node().setData(mMKView.getView());
            }
            if (getView() instanceof com.facebook.yoga.android.YogaLayout) {
                ((com.facebook.yoga.android.YogaLayout) getView()).addView(mMKView.getView(), mMKView.node());
            } else {
                ((android.view.ViewGroup) getView()).addView(mMKView.getView());
            }
            this.childList.add(mMKView);
        }
    }

    public void addView(com.tencent.kinda.gen.KView kView) {
        addView(kView, node().getChildCount());
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public com.tencent.kinda.gen.Align getAlignContent() {
        return this.flexAttr.getAlignContent();
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public com.tencent.kinda.gen.Align getAlignItems() {
        return this.flexAttr.getAlignItems();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public boolean getDisableHighlightDarkMode() {
        return super.getDisableHighlightDarkMode();
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public com.tencent.kinda.gen.FlexDirection getFlexDirection() {
        return this.flexAttr.getFlexDirection();
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public com.tencent.kinda.gen.Wrap getFlexWrap() {
        return this.flexAttr.getFlexWrap();
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public com.tencent.kinda.gen.Justify getJustifyContent() {
        return this.flexAttr.getJustifyContent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KViewLayout
    public void removeAllViews() {
        ((android.view.ViewGroup) getView()).removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void removeView(com.tencent.kinda.gen.KView kView) {
        if (getView() == 0 || !(kView instanceof com.tencent.kinda.framework.widget.base.MMKView)) {
            return;
        }
        ((android.view.ViewGroup) getView()).removeView(((com.tencent.kinda.framework.widget.base.MMKView) kView).getView());
        this.childList.remove(kView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setAccessible(boolean z17) {
        if (z17) {
            ((android.view.ViewGroup) getView()).setImportantForAccessibility(1);
            ((android.view.ViewGroup) getView()).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKViewLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    for (int i17 = 0; i17 < com.tencent.kinda.framework.widget.base.MMKViewLayout.this.childList.size(); i17++) {
                        com.tencent.kinda.framework.widget.base.MMKViewLayout.this.childList.get(i17).getView().setImportantForAccessibility(4);
                    }
                }
            });
        } else {
            ((android.view.ViewGroup) getView()).setImportantForAccessibility(2);
            ((android.view.ViewGroup) getView()).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKViewLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    for (int i17 = 0; i17 < com.tencent.kinda.framework.widget.base.MMKViewLayout.this.childList.size(); i17++) {
                        android.view.View view = com.tencent.kinda.framework.widget.base.MMKViewLayout.this.childList.get(i17).getView();
                        if (view.getImportantForAccessibility() == 4) {
                            view.setImportantForAccessibility(0);
                        }
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public void setAlignContent(com.tencent.kinda.gen.Align align) {
        this.flexAttr.setAlignContent(align);
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public void setAlignItems(com.tencent.kinda.gen.Align align) {
        this.flexAttr.setAlignItems(align);
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public void setClip(boolean z17) {
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setDisableHighlightDarkMode(boolean z17) {
        super.setDisableHighlightDarkMode(z17);
        com.tencent.mars.xlog.Log.i(TAG, "setDisableDarkMode: %b, childlist's size: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.childList.size()));
        for (int i17 = 0; i17 < this.childList.size(); i17++) {
            this.childList.get(i17).setDisableHighlightDarkMode(z17);
        }
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public void setFlexDirection(com.tencent.kinda.gen.FlexDirection flexDirection) {
        this.flexAttr.setFlexDirection(flexDirection);
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public void setFlexWrap(com.tencent.kinda.gen.Wrap wrap) {
        this.flexAttr.setFlexWrap(wrap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.kinda.gen.KViewLayout
    public void setFocusableInTouchMode(boolean z17) {
        ((android.view.ViewGroup) getView()).setFocusable(true);
        ((android.view.ViewGroup) getView()).setFocusableInTouchMode(true);
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public void setJustifyContent(com.tencent.kinda.gen.Justify justify) {
        this.flexAttr.setJustifyContent(justify);
    }

    @Override // com.tencent.kinda.gen.KViewLayout
    public void setOhosRenderGroup(boolean z17) {
    }

    public void addView(com.tencent.kinda.gen.KView kView, int i17) {
        addViewImpl(kView, node().getChildCount());
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public Layout createView(android.content.Context context) {
        com.facebook.yoga.android.YogaLayout yogaLayout = new com.facebook.yoga.android.YogaLayout(context);
        this.flexAttr.setYogaNode(yogaLayout.getYogaNode());
        return yogaLayout;
    }
}

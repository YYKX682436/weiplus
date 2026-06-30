package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class MMKView<T extends android.view.View> extends com.tencent.kinda.framework.widget.base.ViewBase implements com.tencent.kinda.gen.KView, com.tencent.kinda.framework.widget.base.MMKViewBase<T> {
    public static final java.lang.String TAG = "base_MMKView";
    private byte _hellAccFlag_;
    private android.graphics.drawable.Drawable backgroundDrawable;
    protected float borderRadius;
    protected float borderWidth;
    private boolean disableDarkModeHighlight;

    /* renamed from: id, reason: collision with root package name */
    private java.lang.String f45963id;
    private com.tencent.kinda.framework.widget.base.MMKViewBackgroundBorderDrawable internalDrawable;
    private boolean isHighlight;
    private boolean isSecure;
    protected android.content.Context mContext;
    private com.tencent.kinda.gen.KViewOnClickCallback onClickCallback;
    private com.tencent.kinda.gen.KViewOnLongClickCallback onLongClickCallback;
    private com.tencent.kinda.gen.KViewOnTouchCallback onTouchCallback;
    protected float shadowOffset;
    protected float shadowRadius;
    private com.tencent.kinda.gen.DynamicColor tmpSaveBgColor;
    private java.lang.ref.WeakReference<com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl> uiPageDelegate;
    protected T view;
    private java.lang.ref.WeakReference<com.tencent.kinda.framework.widget.base.MMKView> wClickAsView;
    protected com.tencent.kinda.gen.DynamicColor borderColor = new com.tencent.kinda.gen.DynamicColor(0, 0);
    protected com.tencent.kinda.gen.DynamicColor borderPressedColor = new com.tencent.kinda.gen.DynamicColor(0, 0);
    protected com.tencent.kinda.gen.DynamicColor backgroundColor = null;
    private float topLeftBorderRadius = 0.0f;
    private float topRightBorderRadius = 0.0f;
    private float bottomLeftBorderRadius = 0.0f;
    private float bottomRightBorderRadius = 0.0f;
    protected com.tencent.kinda.gen.DynamicColor shadowColor = new com.tencent.kinda.gen.DynamicColor(0, 0);
    protected boolean supportDynamicSize = true;
    private com.tencent.kinda.framework.widget.base.KViewAnimatorProxy mAnimatorProxy = new com.tencent.kinda.framework.widget.base.KViewAnimatorProxy(this);

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKView$8, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$Visible;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.Visible.values().length];
            $SwitchMap$com$tencent$kinda$gen$Visible = iArr;
            try {
                iArr[com.tencent.kinda.gen.Visible.VISIBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$Visible[com.tencent.kinda.gen.Visible.INVISIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$Visible[com.tencent.kinda.gen.Visible.GONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.kinda.framework.widget.base.MMKViewBackgroundBorderDrawable checkIfNeedCreateBorderDrawable() {
        if (this.internalDrawable == null) {
            this.internalDrawable = new com.tencent.kinda.framework.widget.base.MMKViewBackgroundBorderDrawable(getView());
        }
        return this.internalDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getAlpha(long j17) {
        return j17 >> 24;
    }

    private boolean isViewLayout() {
        T view = getView();
        if (view == null) {
            return false;
        }
        return (view.getLeft() == 0 && view.getTop() == 0 && view.getRight() == 0 && view.getBottom() == 0) ? false : true;
    }

    private void removeYogaNode() {
        if (node().getParent() != null) {
            node().getParent().removeChildAt(node().getParent().indexOf(node()));
        }
    }

    private void resumeYogaNode() {
        if (node().getParent() == null && getView().getParent() != null && (getView().getParent() instanceof com.facebook.yoga.android.YogaLayout)) {
            com.facebook.yoga.android.YogaLayout yogaLayout = (com.facebook.yoga.android.YogaLayout) getView().getParent();
            yogaLayout.getYogaNode().addChildAt(node(), yogaLayout.indexOfChild(getView()));
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void accessibilityClickFrom(com.tencent.kinda.gen.KView kView) {
        if ((kView instanceof com.tencent.kinda.framework.widget.base.MMKView) && la5.b.f317600a.g(true)) {
            final com.tencent.kinda.framework.widget.base.MMKView mMKView = (com.tencent.kinda.framework.widget.base.MMKView) kView;
            mMKView.getView().post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKView.2
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.MMKView mMKView2 = this;
                    boolean z17 = true;
                    if (!(mMKView2 instanceof com.tencent.kinda.framework.widget.base.MMKRichLabelView) ? !(mMKView2 instanceof com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl) ? mMKView2.onClickCallback == null : ((com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl) mMKView2).onChangeSwitchCallback == null : ((com.tencent.kinda.framework.widget.base.MMKRichLabelView) mMKView2).linkCallback == null && mMKView2.onClickCallback == null) {
                        z17 = false;
                    }
                    if (z17) {
                        mMKView.wClickAsView = new java.lang.ref.WeakReference(this);
                        com.tencent.kinda.framework.widget.base.MMKView mMKView3 = mMKView;
                        mMKView3.setOnClickCallback(mMKView3.onClickCallback);
                    }
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void accessibilityStatesType(com.tencent.kinda.gen.StatesType statesType) {
        com.tencent.mm.wallet_core.e eVar = getView().getAccessibilityDelegate() instanceof com.tencent.mm.wallet_core.e ? (com.tencent.mm.wallet_core.e) getView().getAccessibilityDelegate() : new com.tencent.mm.wallet_core.e();
        eVar.setStatesType(statesType);
        getView().setAccessibilityDelegate(eVar);
    }

    @Override // com.tencent.kinda.gen.KView
    public void accessibilityTraitsType(com.tencent.kinda.gen.TraitsType traitsType) {
        com.tencent.mm.wallet_core.e eVar = getView().getAccessibilityDelegate() instanceof com.tencent.mm.wallet_core.e ? (com.tencent.mm.wallet_core.e) getView().getAccessibilityDelegate() : new com.tencent.mm.wallet_core.e();
        eVar.setViewType(traitsType);
        getView().setAccessibilityDelegate(eVar);
    }

    @Override // com.tencent.kinda.gen.KView
    public void addBlurEffect(int i17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void autoHeight() {
        this.flexAttr.autoHeight();
    }

    @Override // com.tencent.kinda.gen.KView
    public void autoWidth() {
        this.flexAttr.autoWidth();
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.KPoint convertPointToScreen(com.tencent.kinda.gen.KPoint kPoint) {
        return convertPointToView(kPoint, null);
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.KPoint convertPointToView(com.tencent.kinda.gen.KPoint kPoint, com.tencent.kinda.gen.KView kView) {
        if (kPoint == null || getView() == null || getView().getContext() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "%s call convertPointToView params illegal! point: %s, getView(): %s.", this, kPoint, getView());
            return new com.tencent.kinda.gen.KPoint(0.0f, 0.0f);
        }
        int[] iArr = new int[2];
        getView().getLocationOnScreen(new int[2]);
        if (kView == null) {
            iArr[1] = com.tencent.mm.ui.bk.p(getView().getContext());
        } else {
            ((com.tencent.kinda.framework.widget.base.MMKView) kView).getView().getLocationOnScreen(iArr);
        }
        return new com.tencent.kinda.gen.KPoint(com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(getView().getContext(), (r1[0] - iArr[0]) + kPoint.mX), com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(getView().getContext(), (r1[1] - iArr[1]) + kPoint.mY));
    }

    public T createView(android.content.Context context) {
        return (T) new android.view.View(context);
    }

    @Override // com.tencent.kinda.gen.KView
    public void expandHitSize(float f17, float f18) {
        com.tencent.kinda.framework.widget.tools.MMKViewUtil.setExpandSize(this.view, f17, f18);
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginXInScreen() {
        getView().getLocationOnScreen(new int[2]);
        return r0[0];
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginXInScreenDP() {
        getView().getLocationOnScreen(new int[2]);
        float screenDensity = new com.tencent.kinda.framework.app.KindaPlatformUtil().getScreenDensity();
        return screenDensity == 0.0f ? r0[0] : r0[0] / screenDensity;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginYInScreen() {
        getView().getLocationOnScreen(new int[2]);
        return r0[1];
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginYInScreenDP() {
        getView().getLocationOnScreen(new int[2]);
        float screenDensity = new com.tencent.kinda.framework.app.KindaPlatformUtil().getScreenDensity();
        return screenDensity == 0.0f ? r0[1] : r0[1] / screenDensity;
    }

    @Override // com.tencent.kinda.gen.KView
    public java.lang.String getAccessibilityString() {
        return getView().getContentDescription() == null ? "" : (java.lang.String) getView().getContentDescription();
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getAccessible() {
        return getView().isImportantForAccessibility();
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.Align getAlignSelf() {
        return this.flexAttr.getAlignSelf();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAspectRatio() {
        return this.flexAttr.getAspectRatio();
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getBackgroundColor() {
        com.tencent.kinda.gen.DynamicColor dynamicColor = this.backgroundColor;
        return dynamicColor == null ? new com.tencent.kinda.gen.DynamicColor(0L, 0L) : dynamicColor;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getBorderColor() {
        return this.borderColor;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getBorderPressedColor() {
        return this.borderPressedColor;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBorderWidth() {
        return this.borderWidth;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottom() {
        return isViewLayout() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(getView().getContext(), getView().getBottom()) : this.flexAttr.getBottom();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottomLeftCornerRadius() {
        return this.bottomLeftBorderRadius;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottomPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottomRightCornerRadius() {
        return this.bottomRightBorderRadius;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getClickable() {
        return getView().isClickable();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getCornerRadius() {
        return this.borderRadius;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getDisableHighlightDarkMode() {
        return this.disableDarkModeHighlight;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getEnableHighLight() {
        return this.isHighlight;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFlexBasis() {
        return this.flexAttr.getFlexBasis();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFlexGrow() {
        return this.flexAttr.getFlexGrow();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFlexShrink() {
        return this.flexAttr.getFlexShrink();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFrameOriginX() {
        if (getView() == null || getView().getContext() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "%s call convertPointToView params illegal!, getView(): %s.", this, getView());
            return 0.0f;
        }
        com.tencent.mars.xlog.Log.i(TAG, " get getFrameOriginX getView().getLeft(): %s.", java.lang.Integer.valueOf(getView().getLeft()));
        return i65.a.c(getView().getContext(), getView().getLeft());
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFrameOriginY() {
        if (getView() == null || getView().getContext() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "%s call convertPointToView params illegal!, getView(): %s.", this, getView());
            return 0.0f;
        }
        com.tencent.mars.xlog.Log.i(TAG, " get getFrameOriginY getView().getTop(): %s.", java.lang.Integer.valueOf(getView().getTop()));
        return i65.a.c(getView().getContext(), getView().getTop());
    }

    public float getHeight() {
        return this.flexAttr.getHeight();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getHeightPercent() {
        return this.flexAttr.getHeightPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getIsRefreshing() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getLeft() {
        return isViewLayout() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(getView().getContext(), getView().getLeft()) : this.flexAttr.getLeft();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getLeftPercent() {
        return this.flexAttr.getLeftPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginBottom() {
        return this.flexAttr.getMarginBottom();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginBottomPercent() {
        return this.flexAttr.getMarginBottomPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginLeft() {
        return this.flexAttr.getMarginLeft();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginLeftPercent() {
        return this.flexAttr.getMarginLeftPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginRight() {
        return this.flexAttr.getMarginRight();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginRightPercent() {
        return this.flexAttr.getMarginRightPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginTop() {
        return this.flexAttr.getMarginTop();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginTopPercent() {
        return this.flexAttr.getMarginTopPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMaxHeight() {
        return this.flexAttr.getMaxHeight();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMaxWidth() {
        return this.flexAttr.getMaxWidth();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMinHeight() {
        return this.flexAttr.getMinHeight();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMinWidth() {
        return this.flexAttr.getMinWidth();
    }

    public com.tencent.kinda.gen.KViewOnClickCallback getOnClickCallback() {
        return this.onClickCallback;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingBottom() {
        return this.flexAttr.getPaddingBottom();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingBottomPercent() {
        return this.flexAttr.getPaddingBottomPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingLeft() {
        return this.flexAttr.getPaddingLeft();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingLeftPercent() {
        return this.flexAttr.getPaddingLeftPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingRight() {
        return this.flexAttr.getPaddingRight();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingRightPercent() {
        return this.flexAttr.getPaddingRightPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingTop() {
        return this.flexAttr.getPaddingTop();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingTopPercent() {
        return this.flexAttr.getPaddingTopPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.PositionType getPositionType() {
        return this.flexAttr.getPositionType();
    }

    @Override // com.tencent.kinda.gen.KView
    public java.lang.String getReportId() {
        return (java.lang.String) this.view.getTag(com.tencent.mm.R.id.pgt);
    }

    @Override // com.tencent.kinda.gen.KView
    public float getRight() {
        return isViewLayout() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(getView().getContext(), getView().getRight()) : this.flexAttr.getRight();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getRightPercent() {
        return this.flexAttr.getRightPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getRotation() {
        return getView().getRotation();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getScaleX() {
        return getView().getScaleX();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getScaleY() {
        return getView().getScaleY();
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getSecure() {
        return this.isSecure;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getShadowColor() {
        return this.shadowColor;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getShadowOffset() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getShadowRadius() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getSupportDynamicSize() {
        return this.supportDynamicSize;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTop() {
        return isViewLayout() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.pxToDp(getView().getContext(), getView().getTop()) : this.flexAttr.getTop();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTopLeftCornerRadius() {
        return this.topLeftBorderRadius;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTopPercent() {
        return this.flexAttr.getTopPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTopRightCornerRadius() {
        return this.topRightBorderRadius;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTranslateX() {
        return getView().getTranslationX();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTranslateY() {
        return getView().getTranslationY();
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKViewBase
    public final T getView() {
        return this.view;
    }

    @Override // com.tencent.kinda.gen.KView
    public java.lang.String getViewId() {
        return com.tencent.mm.sdk.platformtools.t8.K0(this.f45963id) ? "" : this.f45963id;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.Visible getVisible() {
        int visibility = getView().getVisibility();
        return visibility != 0 ? visibility != 4 ? visibility != 8 ? com.tencent.kinda.gen.Visible.VISIBLE : com.tencent.kinda.gen.Visible.GONE : com.tencent.kinda.gen.Visible.INVISIBLE : com.tencent.kinda.gen.Visible.VISIBLE;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getWidth() {
        return this.flexAttr.getWidth();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getWidthPercent() {
        return this.flexAttr.getWidthPercent();
    }

    @Override // com.tencent.kinda.gen.KView
    public final void initWithPlatformDelegate(com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate) {
        if (iUIPagePlatformDelegate instanceof com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl) {
            com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl uIPagePlatformDelegateImpl = (com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl) iUIPagePlatformDelegate;
            this.uiPageDelegate = new java.lang.ref.WeakReference<>(uIPagePlatformDelegateImpl);
            android.content.Context context = uIPagePlatformDelegateImpl.getContext();
            if (context != null) {
                setView(createView(context));
            }
            this.mContext = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
    }

    public void notifyChanged() {
        if (node().isMeasureDefined() && !node().isDirty()) {
            node().dirty();
        }
        if (getView() != null) {
            getView().requestLayout();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.ViewBase
    public void onFlexAttribute() {
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KView
    public void removeBlurEffect() {
    }

    @Override // com.tencent.kinda.gen.KView
    public void requestFrameImpl(final com.tencent.kinda.gen.VoidKRectCallback voidKRectCallback) {
        this.view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKView.7
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.gen.KRect kRect = new com.tencent.kinda.gen.KRect();
                kRect.mOrigin = new com.tencent.kinda.gen.KPoint();
                kRect.mSize = new com.tencent.kinda.gen.KSize();
                kRect.mOrigin.mX = com.tencent.kinda.framework.widget.base.MMKView.this.view.getLeft();
                kRect.mOrigin.mY = com.tencent.kinda.framework.widget.base.MMKView.this.view.getTop();
                kRect.mSize.mWidth = com.tencent.kinda.framework.widget.base.MMKView.this.view.getWidth();
                kRect.mSize.mHeight = com.tencent.kinda.framework.widget.base.MMKView.this.view.getHeight();
                voidKRectCallback.call(kRect);
            }
        });
    }

    @Override // com.tencent.kinda.gen.KView
    public void requestLayout() {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAccessibilityString(java.lang.String str) {
        getView().setContentDescription(str);
    }

    public void setAccessible(boolean z17) {
        if (z17) {
            getView().setImportantForAccessibility(1);
        } else {
            getView().setImportantForAccessibility(2);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAlignSelf(com.tencent.kinda.gen.Align align) {
        this.flexAttr.setAlignSelf(align);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAlpha(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setAlpha(f17);
            return;
        }
        T view = getView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/kinda/framework/widget/base/MMKView", "setAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAspectRatio(float f17) {
        this.flexAttr.setAspectRatio(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBackgroundColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            toString();
            java.lang.Long.toHexString(com.tencent.kinda.framework.widget.tools.ColorUtil.absColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
            this.mAnimatorProxy.setBackgroundColor(dynamicColor);
            return;
        }
        toString();
        java.lang.Long.toHexString(com.tencent.kinda.framework.widget.tools.ColorUtil.absColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
        this.backgroundColor = dynamicColor;
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor) >= 0) {
            checkIfNeedCreateBorderDrawable().setBackgroundColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.backgroundColor)));
            setViewBackground(this.backgroundDrawable);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBorderColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.borderColor = dynamicColor;
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor) >= 0) {
            checkIfNeedCreateBorderDrawable().setBorderColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.borderColor)));
            setViewBackground(this.backgroundDrawable);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBorderPressedColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.borderPressedColor = dynamicColor;
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor) >= 0) {
            checkIfNeedCreateBorderDrawable().setBorderPressedColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.borderPressedColor)));
            setViewBackground(this.backgroundDrawable);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBorderWidth(float f17) {
        this.borderWidth = f17;
        if (f17 > 0.0f) {
            checkIfNeedCreateBorderDrawable().setBorderWidth(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) f17));
            setViewBackground(this.backgroundDrawable);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottom(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setBottom(f17);
        } else {
            this.flexAttr.setBottom(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottomLeftCornerRadius(float f17) {
        this.bottomLeftBorderRadius = f17;
        if (f17 >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setBottomLeftBorderRadius(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) this.bottomLeftBorderRadius));
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottomPercent(float f17) {
        this.flexAttr.setBottomPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottomRightCornerRadius(float f17) {
        this.bottomRightBorderRadius = f17;
        if (f17 >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setBottomRightBorderRadius(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) this.bottomRightBorderRadius));
        }
    }

    public void setClickable(boolean z17) {
        getView().setClickable(z17);
    }

    public void setCornerRadius(float f17) {
        this.borderRadius = f17;
        if (f17 >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setBorderRadius(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) this.borderRadius));
            setViewBackground(this.backgroundDrawable);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setDisableHighlightDarkMode(boolean z17) {
        this.disableDarkModeHighlight = z17;
    }

    public void setEnableHighLight(boolean z17) {
        this.isHighlight = z17;
        if (getView() == null || !this.isHighlight) {
            return;
        }
        getView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKView.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                if (com.tencent.kinda.framework.widget.base.MMKView.this.isHighlight) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        com.tencent.kinda.framework.widget.base.MMKView mMKView = com.tencent.kinda.framework.widget.base.MMKView.this;
                        com.tencent.kinda.gen.DynamicColor dynamicColor = mMKView.backgroundColor;
                        if (dynamicColor == null) {
                            mMKView.tmpSaveBgColor = new com.tencent.kinda.gen.DynamicColor(0L, 0L);
                            if (com.tencent.kinda.framework.widget.base.MMKView.this.disableDarkModeHighlight) {
                                com.tencent.kinda.framework.widget.base.MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(com.tencent.kinda.framework.widget.base.MMKView.this.mContext.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
                            } else {
                                com.tencent.kinda.framework.widget.base.MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(com.tencent.kinda.framework.widget.base.MMKView.this.mContext.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
                            }
                        } else {
                            if (mMKView.getAlpha(dynamicColor.mNormalColor) == 0) {
                                com.tencent.kinda.framework.widget.base.MMKView mMKView2 = com.tencent.kinda.framework.widget.base.MMKView.this;
                                if (mMKView2.getAlpha(mMKView2.backgroundColor.mDarkmodeColor) == 0) {
                                    com.tencent.kinda.framework.widget.base.MMKView.this.tmpSaveBgColor = new com.tencent.kinda.gen.DynamicColor(0L, 0L);
                                    if (com.tencent.kinda.framework.widget.base.MMKView.this.disableDarkModeHighlight) {
                                        com.tencent.kinda.framework.widget.base.MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(com.tencent.kinda.framework.widget.base.MMKView.this.mContext.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1));
                                    } else {
                                        com.tencent.kinda.framework.widget.base.MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor(com.tencent.kinda.framework.widget.base.MMKView.this.mContext.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
                                    }
                                }
                            }
                            com.tencent.kinda.framework.widget.base.MMKView mMKView3 = com.tencent.kinda.framework.widget.base.MMKView.this;
                            mMKView3.tmpSaveBgColor = mMKView3.backgroundColor;
                            if (com.tencent.kinda.framework.widget.base.MMKView.this.disableDarkModeHighlight) {
                                com.tencent.kinda.framework.widget.base.MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.MergeColors(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(com.tencent.kinda.framework.widget.base.MMKView.this.backgroundColor), com.tencent.kinda.framework.widget.base.MMKView.this.mContext.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1)));
                            } else {
                                com.tencent.kinda.framework.widget.base.MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.MergeColors(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(com.tencent.kinda.framework.widget.base.MMKView.this.backgroundColor), com.tencent.kinda.framework.widget.base.MMKView.this.mContext.getResources().getColor(com.tencent.mm.R.color.FG_3)));
                            }
                        }
                        com.tencent.kinda.framework.widget.base.MMKView mMKView4 = com.tencent.kinda.framework.widget.base.MMKView.this;
                        mMKView4.setViewBackground(mMKView4.backgroundDrawable);
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        com.tencent.kinda.framework.widget.base.MMKView.this.checkIfNeedCreateBorderDrawable().setBackgroundColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(com.tencent.kinda.framework.widget.base.MMKView.this.tmpSaveBgColor));
                        com.tencent.kinda.framework.widget.base.MMKView mMKView5 = com.tencent.kinda.framework.widget.base.MMKView.this;
                        mMKView5.setViewBackground(mMKView5.backgroundDrawable);
                    }
                }
                if (com.tencent.kinda.framework.widget.base.MMKView.this.onTouchCallback == null) {
                    return false;
                }
                com.tencent.kinda.gen.TouchAction touchAction = com.tencent.kinda.gen.TouchAction.DOWN;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        touchAction = com.tencent.kinda.gen.TouchAction.UP;
                    } else if (action == 2) {
                        touchAction = com.tencent.kinda.gen.TouchAction.MOVE;
                    }
                }
                com.tencent.kinda.framework.widget.base.MMKView.this.onTouchCallback.onTouch(new com.tencent.kinda.gen.TouchEvent(motionEvent.getX(), motionEvent.getY(), touchAction));
                return false;
            }
        });
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFlexBasis(float f17) {
        this.flexAttr.setFlexBasis(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFlexGrow(float f17) {
        this.flexAttr.setFlexGrow(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFlexShrink(float f17) {
        this.flexAttr.setFlexShrink(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFrameImpl(com.tencent.kinda.gen.KRect kRect, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        setTranslateX(kRect.mOrigin.mX);
        setTranslateY(kRect.mOrigin.mY);
        setWidth(kRect.mSize.mWidth);
        setHeight(kRect.mSize.mHeight);
        this.view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.MMKView.6
            @Override // java.lang.Runnable
            public void run() {
                voidCallback.call();
            }
        });
    }

    public void setHeight(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setHeight(f17);
        } else {
            this.flexAttr.setHeight(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setHeightPercent(float f17) {
        this.flexAttr.setHeightPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setIsRefreshing(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setLeft(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setLeft(f17);
        } else {
            this.flexAttr.setLeft(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setLeftPercent(float f17) {
        this.flexAttr.setLeftPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginBottom(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginBottom(f17);
            return;
        }
        this.flexAttr.setMarginBottom(f17);
        if (getView().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) getView().getLayoutParams()).bottomMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, getMarginBottom());
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginBottomPercent(float f17) {
        this.flexAttr.setMarginBottomPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginLeft(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginLeft(f17);
            return;
        }
        this.flexAttr.setMarginLeft(f17);
        if (getView().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) getView().getLayoutParams()).leftMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, getMarginLeft());
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginLeftPercent(float f17) {
        this.flexAttr.setMarginLeftPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginRight(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginRight(f17);
            return;
        }
        this.flexAttr.setMarginRight(f17);
        if (getView().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) getView().getLayoutParams()).rightMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, getMarginRight());
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginRightPercent(float f17) {
        this.flexAttr.setMarginRightPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginTop(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setMarginTop(f17);
            return;
        }
        this.flexAttr.setMarginTop(f17);
        if (getView().getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) getView().getLayoutParams()).topMargin = (int) com.tencent.kinda.framework.widget.tools.MMKViewUtil.dpToPx(this.mContext, getMarginTop());
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginTopPercent(float f17) {
        this.flexAttr.setMarginTopPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMaxHeight(float f17) {
        this.flexAttr.setMaxHeight(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMaxWidth(float f17) {
        this.flexAttr.setMaxWidth(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMinHeight(float f17) {
        this.flexAttr.setMinHeight(f17);
    }

    public void setMinWidth(float f17) {
        this.flexAttr.setMinWidth(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setOnClickCallback(com.tencent.kinda.gen.KViewOnClickCallback kViewOnClickCallback) {
        this.onClickCallback = kViewOnClickCallback;
        getView().setOnClickListener(new com.tencent.mm.wallet_core.ui.z1(true, 800L) { // from class: com.tencent.kinda.framework.widget.base.MMKView.3
            @Override // com.tencent.mm.wallet_core.ui.z1
            public void onRealClick(android.view.View view) {
                if (com.tencent.kinda.framework.widget.base.MMKView.this.onClickCallback != null) {
                    com.tencent.kinda.framework.widget.base.MMKView.this.onClickCallback.onClick(com.tencent.kinda.framework.widget.base.MMKView.this);
                    return;
                }
                com.tencent.kinda.framework.widget.base.MMKView mMKView = (com.tencent.kinda.framework.widget.base.MMKView) com.tencent.kinda.framework.widget.base.MMKView.this.wClickAsView.get();
                if (mMKView == null || !la5.b.f317600a.g(true)) {
                    return;
                }
                if (mMKView instanceof com.tencent.kinda.framework.widget.base.MMKRichLabelView) {
                    com.tencent.kinda.gen.VoidCallback voidCallback = ((com.tencent.kinda.framework.widget.base.MMKRichLabelView) mMKView).linkCallback;
                    if (voidCallback != null) {
                        voidCallback.call();
                        return;
                    } else {
                        if (mMKView.onClickCallback != null) {
                            mMKView.onClickCallback.onClick(mMKView);
                            return;
                        }
                        return;
                    }
                }
                if (!(mMKView instanceof com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl)) {
                    if (mMKView.onClickCallback != null) {
                        mMKView.onClickCallback.onClick(mMKView);
                    }
                } else {
                    com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback kSwitchViewOnChangeSwitchCallback = ((com.tencent.kinda.framework.widget.base.KindaSwitchViewImpl) mMKView).onChangeSwitchCallback;
                    if (kSwitchViewOnChangeSwitchCallback != null) {
                        kSwitchViewOnChangeSwitchCallback.onChangeSwitch();
                    }
                }
            }
        });
    }

    @Override // com.tencent.kinda.gen.KView
    public void setOnLongClickCallback(com.tencent.kinda.gen.KViewOnLongClickCallback kViewOnLongClickCallback) {
        this.onLongClickCallback = kViewOnLongClickCallback;
        getView().setOnLongClickListener(new android.view.View.OnLongClickListener() { // from class: com.tencent.kinda.framework.widget.base.MMKView.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(android.view.View view) {
                if (com.tencent.kinda.framework.widget.base.MMKView.this.onLongClickCallback == null) {
                    return false;
                }
                com.tencent.kinda.framework.widget.base.MMKView.this.onLongClickCallback.onLongClick(com.tencent.kinda.framework.widget.base.MMKView.this);
                return false;
            }
        });
    }

    @Override // com.tencent.kinda.gen.KView
    public void setOnTouchCallback(com.tencent.kinda.gen.KViewOnTouchCallback kViewOnTouchCallback) {
        this.onTouchCallback = kViewOnTouchCallback;
        if (getView() != null) {
            getView().setOnTouchListener(new android.view.View.OnTouchListener() { // from class: com.tencent.kinda.framework.widget.base.MMKView.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    if (com.tencent.kinda.framework.widget.base.MMKView.this.onTouchCallback == null) {
                        return false;
                    }
                    com.tencent.kinda.gen.TouchAction touchAction = com.tencent.kinda.gen.TouchAction.DOWN;
                    int action = motionEvent.getAction();
                    if (action != 0) {
                        if (action == 1) {
                            touchAction = com.tencent.kinda.gen.TouchAction.UP;
                        } else if (action == 2) {
                            touchAction = com.tencent.kinda.gen.TouchAction.MOVE;
                        }
                    }
                    com.tencent.kinda.framework.widget.base.MMKView.this.onTouchCallback.onTouch(new com.tencent.kinda.gen.TouchEvent(motionEvent.getX(), motionEvent.getY(), touchAction));
                    return false;
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingBottom(float f17) {
        this.flexAttr.setPaddingBottom(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingBottomPercent(float f17) {
        this.flexAttr.setPaddingBottomPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingLeft(float f17) {
        this.flexAttr.setPaddingLeft(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingLeftPercent(float f17) {
        this.flexAttr.setPaddingLeftPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingRight(float f17) {
        this.flexAttr.setPaddingRight(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingRightPercent(float f17) {
        this.flexAttr.setPaddingRightPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingTop(float f17) {
        this.flexAttr.setPaddingTop(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingTopPercent(float f17) {
        this.flexAttr.setPaddingTopPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPositionType(com.tencent.kinda.gen.PositionType positionType) {
        this.flexAttr.setPositionType(positionType);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setReportId(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.view.setTag(com.tencent.mm.R.id.pgt, str);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setRight(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setRight(f17);
        } else {
            this.flexAttr.setRight(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setRightPercent(float f17) {
        this.flexAttr.setRightPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setRotation(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setRotation(f17);
        } else {
            getView().setRotation(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setScaleX(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setScaleX(f17);
        } else {
            getView().setScaleX(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setScaleY(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setScaleY(f17);
        } else {
            getView().setScaleY(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setSecure(boolean z17) {
        com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl uIPagePlatformDelegateImpl;
        android.content.Context context;
        com.tencent.mm.booter.s sVar = ((km0.c) gm0.j1.p().a()).f308992f;
        if (sVar != null && com.tencent.mm.sdk.platformtools.t8.j1(sVar.c(".com.tencent.mm.debug.kinda_secure_page_flag"), 0) == 1) {
            com.tencent.mars.xlog.Log.i(TAG, "secure switch true, because debugger");
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_kinda_secure_page_flag, 1);
        com.tencent.mars.xlog.Log.i(TAG, "setSecure %s, enableValue: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(Ni));
        if (Ni != 1) {
            return;
        }
        this.isSecure = z17;
        java.lang.ref.WeakReference<com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl> weakReference = this.uiPageDelegate;
        if (weakReference == null || weakReference.get() == null || (context = (uIPagePlatformDelegateImpl = this.uiPageDelegate.get()).getContext()) == null || !(context instanceof android.app.Activity)) {
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (!this.isSecure) {
            uIPagePlatformDelegateImpl.removeSecureView(java.lang.Integer.valueOf(hashCode()));
            return;
        }
        uIPagePlatformDelegateImpl.addSecureView(hashCode());
        activity.getWindow().addFlags(8192);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_overlay_hidden, false) || android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        try {
            if (b3.l.checkSelfPermission(context, "android.permission.HIDE_OVERLAY_WINDOWS") == 0) {
                activity.getWindow().setHideOverlayWindows(true);
            } else {
                com.tencent.mars.xlog.Log.i(TAG, "no permission");
                jx3.f.INSTANCE.kvStat(28867, "100");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setShadowColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.shadowColor = dynamicColor;
    }

    @Override // com.tencent.kinda.gen.KView
    public void setShadowOffset(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setShadowRadius(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setSupportDynamicSize(boolean z17) {
        this.supportDynamicSize = z17;
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTop(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setTop(f17);
        } else {
            this.flexAttr.setTop(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTopLeftCornerRadius(float f17) {
        this.topLeftBorderRadius = f17;
        if (f17 >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setTopLeftBorderRadius(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) this.topLeftBorderRadius));
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTopPercent(float f17) {
        this.flexAttr.setTopPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTopRightCornerRadius(float f17) {
        this.topRightBorderRadius = f17;
        if (f17 >= 0.0f) {
            checkIfNeedCreateBorderDrawable().setTopRightBorderRadius(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) this.topRightBorderRadius));
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTranslateX(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setTranslateX(f17);
        } else {
            getView().setTranslationX(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTranslateY(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setTranslateY(f17);
        } else {
            getView().setTranslationY(f17);
        }
    }

    public final void setView(T t17) {
        this.view = t17;
    }

    public void setViewBackground(android.graphics.drawable.Drawable drawable) {
        this.backgroundDrawable = drawable;
        if (drawable == null && this.internalDrawable != null) {
            getView().setBackground(this.internalDrawable);
            return;
        }
        com.tencent.kinda.framework.widget.base.MMKViewBackgroundBorderDrawable mMKViewBackgroundBorderDrawable = this.internalDrawable;
        if (mMKViewBackgroundBorderDrawable == null && drawable != null) {
            getView().setBackground(this.backgroundDrawable);
        } else if (mMKViewBackgroundBorderDrawable != null) {
            mMKViewBackgroundBorderDrawable.setInsetDrawable(drawable);
            getView().setBackground(this.internalDrawable);
        }
    }

    public void setViewId(java.lang.String str) {
        this.f45963id = str;
        this.flexAttr.setTestId(str);
        com.tencent.kinda.framework.widget.tools.MMKViewUtil.setId4KindaImplView(this.mContext, str, getView());
    }

    @Override // com.tencent.kinda.gen.KView
    public void setVisible(com.tencent.kinda.gen.Visible visible) {
        int i17 = com.tencent.kinda.framework.widget.base.MMKView.AnonymousClass8.$SwitchMap$com$tencent$kinda$gen$Visible[visible.ordinal()];
        if (i17 == 1) {
            T view = getView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.flexAttr.setVisibility(0);
            resumeYogaNode();
        } else if (i17 == 2) {
            T view2 = getView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.flexAttr.setVisibility(4);
        } else if (i17 == 3) {
            T view3 = getView();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/kinda/framework/widget/base/MMKView", "setVisible", "(Lcom/tencent/kinda/gen/Visible;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.flexAttr.setVisibility(8);
            removeYogaNode();
        }
        notifyChanged();
    }

    public void setWidth(float f17) {
        if (com.tencent.kinda.framework.animate.KindaGlobalAnimator.hasAnimate()) {
            this.mAnimatorProxy.setWidth(f17);
        } else {
            this.flexAttr.setWidth(f17);
        }
    }

    @Override // com.tencent.kinda.gen.KView
    public void setWidthPercent(float f17) {
        this.flexAttr.setWidthPercent(f17);
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAlpha() {
        return getView().getAlpha();
    }
}

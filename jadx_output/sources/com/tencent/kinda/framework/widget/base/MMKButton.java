package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKButton extends com.tencent.kinda.framework.widget.base.MMKView<com.tencent.kinda.framework.widget.base.KindaButtonImpl> implements com.tencent.kinda.gen.KButton {
    public static final java.lang.String TAG = "MMKView.MMKButton";
    private java.lang.String accessibilityString;
    private com.tencent.kinda.framework.widget.base.MMKImage disabledImage;
    private long horizontalPadding;
    private com.tencent.kinda.framework.widget.base.KindaButtonImpl impl;
    private com.tencent.kinda.framework.widget.base.MMKImage normalImage;
    private com.tencent.kinda.framework.widget.base.MMKImage pressedImage;
    private com.tencent.kinda.framework.widget.base.MMKImage selectedImage;
    private java.lang.String textFontName;
    private float textSize;
    private long verticalPadding;
    private long textSelectedColor = -1;
    private com.tencent.kinda.gen.DynamicColor textNormalColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);
    private long textPressedColor = -1;
    private long textDisabledColor = -1;
    private long selectedColor = -1;
    private com.tencent.kinda.gen.DynamicColor normalColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);
    private long pressedColor = -1;
    private long disabledColor = -1;
    private boolean isEnableHighlight = true;
    private com.tencent.kinda.gen.FontStyle fontStyle = com.tencent.kinda.gen.FontStyle.REGULAR;

    /* loaded from: classes9.dex */
    public static class BackgroundColorDrawable extends android.graphics.drawable.Drawable {
        private int color;

        public BackgroundColorDrawable(int i17) {
            this.color = i17;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas canvas) {
            canvas.drawColor(this.color);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            int i17 = this.color;
            if (i17 == 0) {
                return -2;
            }
            return android.graphics.Color.alpha(i17) > 0 ? -3 : -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i17) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        }
    }

    private void updateBackgroundWithColor() {
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        if (this.isEnableHighlight && this.pressedColor >= 0) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new com.tencent.kinda.framework.widget.base.MMKButton.BackgroundColorDrawable(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(this.pressedColor)));
        }
        if (this.selectedColor >= 0) {
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, new com.tencent.kinda.framework.widget.base.MMKButton.BackgroundColorDrawable(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(this.selectedColor)));
        }
        if (this.disabledColor >= 0) {
            stateListDrawable.addState(new int[]{-16842910}, new com.tencent.kinda.framework.widget.base.MMKButton.BackgroundColorDrawable(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(this.disabledColor)));
        }
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.normalColor) >= 0) {
            stateListDrawable.addState(new int[0], new com.tencent.kinda.framework.widget.base.MMKButton.BackgroundColorDrawable(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.normalColor))));
        }
        setViewBackground(stateListDrawable);
    }

    private void updateBackgroundWithImage() {
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage;
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        if (this.isEnableHighlight && (mMKImage = this.pressedImage) != null && !mMKImage.isNetworkImage()) {
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.pressedImage.getDrawable());
        }
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage2 = this.selectedImage;
        if (mMKImage2 != null && !mMKImage2.isNetworkImage()) {
            stateListDrawable.addState(new int[]{android.R.attr.state_selected}, this.selectedImage.getDrawable());
        }
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage3 = this.disabledImage;
        if (mMKImage3 != null && !mMKImage3.isNetworkImage()) {
            stateListDrawable.addState(new int[]{-16842910}, this.disabledImage.getDrawable());
        }
        com.tencent.kinda.framework.widget.base.MMKImage mMKImage4 = this.normalImage;
        if (mMKImage4 != null && !mMKImage4.isNetworkImage()) {
            stateListDrawable.addState(new int[0], this.normalImage.getDrawable());
        }
        getView().setImageDrawable(stateListDrawable);
    }

    private void updateTextColor() {
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.textNormalColor) >= 0 || this.textSelectedColor >= 0 || this.textPressedColor >= 0 || this.textDisabledColor >= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (this.textSelectedColor >= 0) {
                arrayList.add(new int[]{android.R.attr.state_selected});
                arrayList2.add(java.lang.Integer.valueOf(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(this.textSelectedColor)));
            }
            if (this.isEnableHighlight && this.textPressedColor >= 0) {
                arrayList.add(new int[]{android.R.attr.state_pressed});
                arrayList2.add(java.lang.Integer.valueOf(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(this.textPressedColor)));
            }
            if (this.textDisabledColor >= 0) {
                arrayList.add(new int[]{-16842910});
                arrayList2.add(java.lang.Integer.valueOf(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(this.textDisabledColor)));
            }
            if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.textNormalColor) >= 0) {
                arrayList.add(new int[0]);
                arrayList2.add(java.lang.Integer.valueOf(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.textNormalColor))));
            }
            int size = arrayList2.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr[i17] = ((java.lang.Integer) arrayList2.get(i17)).intValue();
            }
            int[][] iArr2 = new int[arrayList.size()];
            for (int i18 = 0; i18 < arrayList.size(); i18++) {
                iArr2[i18] = (int[]) arrayList.get(i18);
            }
            getView().setTextColor(new android.content.res.ColorStateList(iArr2, iArr));
        }
    }

    private void updateTypeface() {
        java.lang.String str = this.textFontName;
        if (str != null) {
            int i17 = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : -1;
            if (i17 != -1) {
                try {
                    getView().getKButtonTextView().setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), com.tencent.mm.wallet_core.ui.r1.E(i17)));
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                    return;
                }
            }
        }
        if (this.fontStyle == com.tencent.kinda.gen.FontStyle.REGULAR) {
            getView().getKButtonTextView().setTypeface(null, 0);
        } else {
            getView().getKButtonTextView().setTypeface(null, 1);
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.DynamicColor getDisableColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.DynamicColor getDisableTextColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.KImage getDisabledImage() {
        return this.disabledImage;
    }

    @Override // com.tencent.kinda.gen.KButton
    public boolean getEnable() {
        return getView().isEnabled();
    }

    @Override // com.tencent.kinda.gen.KButton
    public long getExpandHitHeight() {
        return 0L;
    }

    @Override // com.tencent.kinda.gen.KButton
    public long getExpandHitWidth() {
        return 0L;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @Override // com.tencent.kinda.gen.KButton
    public long getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.DynamicColor getNormalColor() {
        return this.normalColor;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.KImage getNormalImage() {
        return this.normalImage;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.KImage getPressedImage() {
        return this.pressedImage;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.KImage getSelectedImage() {
        return this.selectedImage;
    }

    @Override // com.tencent.kinda.gen.KButton
    public java.lang.String getText() {
        if (getView().getText() != null) {
            return getView().getText().toString();
        }
        return null;
    }

    public java.lang.String getTextFont() {
        return this.textFontName;
    }

    @Override // com.tencent.kinda.gen.KButton
    public com.tencent.kinda.gen.DynamicColor getTextNormalColor() {
        return this.textNormalColor;
    }

    @Override // com.tencent.kinda.gen.KButton
    public float getTextSize() {
        return this.textSize;
    }

    @Override // com.tencent.kinda.gen.KButton
    public long getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setDisableColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        long colorByModeNoCompat = com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor);
        if (this.disabledColor == colorByModeNoCompat) {
            return;
        }
        this.disabledColor = colorByModeNoCompat;
        updateBackgroundWithColor();
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setDisableTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        long colorByModeNoCompat = com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor);
        if (this.textDisabledColor == colorByModeNoCompat) {
            return;
        }
        this.textDisabledColor = colorByModeNoCompat;
        updateTextColor();
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setDisabledImage(com.tencent.kinda.gen.KImage kImage) {
        if (kImage instanceof com.tencent.kinda.framework.widget.base.MMKImage) {
            this.disabledImage = (com.tencent.kinda.framework.widget.base.MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setEnable(boolean z17) {
        getView().setEnabled(z17);
        getView().setNestEnabled(z17);
        updateTextColor();
        getView().setClickable(z17);
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setEnableHighLight(boolean z17) {
        this.isEnableHighlight = z17;
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setExpandHitHeight(long j17) {
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setExpandHitWidth(long j17) {
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setFontStyle(com.tencent.kinda.gen.FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        updateTypeface();
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setHorizontalPadding(long j17) {
        this.horizontalPadding = j17;
        com.tencent.kinda.framework.widget.base.KindaTextViewImpl kButtonTextView = getView().getKButtonTextView();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) kButtonTextView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.leftMargin = i65.a.a(this.mContext, (float) this.horizontalPadding);
            layoutParams.rightMargin = i65.a.a(this.mContext, (float) this.horizontalPadding);
            kButtonTextView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setMinWidth(float f17) {
        com.tencent.kinda.framework.widget.base.KindaButtonImpl view = getView();
        if (view != null) {
            view.noRecalcuate = false;
        }
        super.setMinWidth(f17);
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setNormalColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.normalColor) == com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)) {
            com.tencent.mars.xlog.Log.i(TAG, "MMKButton[" + getText() + "] setNormalColor设置相同值。");
            return;
        }
        this.normalColor = dynamicColor;
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor) != 0) {
            this.pressedColor = com.tencent.kinda.framework.widget.tools.ColorUtil.MergeColors(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor), 436207616L);
            if (this.disabledColor == -1) {
                if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
                    this.disabledColor = java.lang.Long.parseLong("14FFFFFF", 16);
                } else {
                    this.disabledColor = com.tencent.kinda.framework.widget.tools.ColorUtil.MergeColors(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor), 2583691263L);
                }
            }
        }
        updateBackgroundWithColor();
        com.tencent.mars.xlog.Log.i(TAG, "MMKButton[" + getText() + "] setNormalColor设置完成后，normalColor：" + this.normalColor + "，pressedColor：" + this.pressedColor + "，disabledColor：" + this.disabledColor);
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setNormalImage(com.tencent.kinda.gen.KImage kImage) {
        if (kImage instanceof com.tencent.kinda.framework.widget.base.MMKImage) {
            this.normalImage = (com.tencent.kinda.framework.widget.base.MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setPressedImage(com.tencent.kinda.gen.KImage kImage) {
        if (kImage instanceof com.tencent.kinda.framework.widget.base.MMKImage) {
            this.pressedImage = (com.tencent.kinda.framework.widget.base.MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setSelectedImage(com.tencent.kinda.gen.KImage kImage) {
        if (kImage instanceof com.tencent.kinda.framework.widget.base.MMKImage) {
            this.selectedImage = (com.tencent.kinda.framework.widget.base.MMKImage) kImage;
            updateBackgroundWithImage();
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setText(java.lang.String str) {
        if (str != null) {
            getView().setText(str);
        }
    }

    public void setTextFont(java.lang.String str) {
        if (str != null) {
            this.textFontName = str;
            getView().setTextFont(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), str));
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setTextNormalColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.textNormalColor) != com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor, com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKButtonText)) {
            this.textNormalColor = dynamicColor;
            long colorByModeNoCompat = (153.0f << 24) | (com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(dynamicColor) & 16777215);
            this.textPressedColor = colorByModeNoCompat;
            if (this.textDisabledColor == -1) {
                this.textDisabledColor = colorByModeNoCompat;
            }
            java.lang.Long.toString(colorByModeNoCompat);
            java.lang.Long.toString(this.textDisabledColor);
            java.lang.Long.toHexString(this.textPressedColor);
            java.lang.Long.toHexString(this.textDisabledColor);
            updateTextColor();
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setTextSize(float f17) {
        if (f17 > 0.0f) {
            this.textSize = f17 * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f);
            getView().setTextSize(1, this.textSize);
        }
    }

    @Override // com.tencent.kinda.gen.KButton
    public void setVerticalPadding(long j17) {
        this.verticalPadding = j17;
        com.tencent.kinda.framework.widget.base.KindaTextViewImpl kButtonTextView = getView().getKButtonTextView();
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) kButtonTextView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.topMargin = i65.a.a(this.mContext, (float) this.verticalPadding);
            layoutParams.bottomMargin = i65.a.a(this.mContext, (float) this.verticalPadding);
            kButtonTextView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public com.tencent.kinda.framework.widget.base.KindaButtonImpl createView(android.content.Context context) {
        com.tencent.kinda.framework.widget.base.KindaButtonImpl kindaButtonImpl = new com.tencent.kinda.framework.widget.base.KindaButtonImpl(context);
        kindaButtonImpl.setClickable(true);
        kindaButtonImpl.setEnabled(true);
        return kindaButtonImpl;
    }
}

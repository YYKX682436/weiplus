package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKLabelView extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.TextView> implements com.tencent.kinda.gen.KLabelView {
    private com.tencent.kinda.gen.Ellipsize ellipsize;
    private com.tencent.kinda.framework.widget.base.MMKRichText richText;
    private java.lang.String textFontName;
    private com.tencent.kinda.gen.TextAlign textAlign = com.tencent.kinda.gen.TextAlign.LEFT;
    private int maxLength = -1;
    private com.tencent.kinda.gen.DynamicColor textColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);
    private com.tencent.kinda.gen.FontStyle fontStyle = com.tencent.kinda.gen.FontStyle.REGULAR;

    /* renamed from: com.tencent.kinda.framework.widget.base.MMKLabelView$1, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$Ellipsize;
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.TextAlign.values().length];
            $SwitchMap$com$tencent$kinda$gen$TextAlign = iArr;
            try {
                iArr[com.tencent.kinda.gen.TextAlign.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.tencent.kinda.gen.Ellipsize.values().length];
            $SwitchMap$com$tencent$kinda$gen$Ellipsize = iArr2;
            try {
                iArr2[com.tencent.kinda.gen.Ellipsize.TAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$Ellipsize[com.tencent.kinda.gen.Ellipsize.HEAD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$Ellipsize[com.tencent.kinda.gen.Ellipsize.MIDDLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private void updateTypeface() {
        java.lang.String str = this.textFontName;
        if (str != null) {
            int i17 = str.equalsIgnoreCase("WeChat-Sans-SS-Light") ? 2 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Medium") ? 0 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Regular") ? 3 : this.textFontName.equalsIgnoreCase("WeChat-Sans-SS-Bold") ? 1 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Medium") ? 4 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Light") ? 6 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Bold") ? 5 : this.textFontName.equalsIgnoreCase("WeChat-Sans-Std-Regular") ? 7 : -1;
            if (i17 != -1) {
                try {
                    getView().setTypeface(android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), com.tencent.mm.wallet_core.ui.r1.E(i17)));
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(com.tencent.kinda.framework.widget.base.MMKView.TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                    getView().setTypeface(null, 0);
                    return;
                }
            }
        }
        com.tencent.kinda.gen.FontStyle fontStyle = this.fontStyle;
        if (fontStyle == com.tencent.kinda.gen.FontStyle.BOLD) {
            getView().setTypeface(null, 1);
        } else if (fontStyle == com.tencent.kinda.gen.FontStyle.MEDIUM) {
            com.tencent.mm.ui.bk.r0(getView().getPaint(), 0.8f);
        } else {
            getView().setTypeface(null, 0);
        }
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public boolean getAdjustsFontSizeToFitWidth() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public com.tencent.kinda.gen.BaselineAdjustmentAlign getBaselineAdjustment() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public com.tencent.kinda.gen.Ellipsize getEllipsize() {
        return this.ellipsize;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public com.tencent.kinda.gen.FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public float getLineSpacingFactor() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public int getLines() {
        return getView().getLineCount();
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public int getMaxLength() {
        return this.maxLength;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public java.lang.String getText() {
        java.lang.CharSequence text = getView().getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public com.tencent.kinda.gen.TextAlign getTextAlign() {
        return this.textAlign;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public com.tencent.kinda.gen.DynamicColor getTextColor() {
        return this.textColor;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public java.lang.String getTextFont() {
        return this.textFontName;
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public float getTextSize() {
        return i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) getView().getTextSize());
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public void notifyChanged() {
        super.notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setAdjustsFontSizeToFitWidth(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setBaselineAdjustment(com.tencent.kinda.gen.BaselineAdjustmentAlign baselineAdjustmentAlign) {
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView, com.tencent.kinda.gen.KView
    public void setClickable(boolean z17) {
        super.setClickable(z17);
        getView().setEnabled(z17);
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setEllipsize(com.tencent.kinda.gen.Ellipsize ellipsize) {
        this.ellipsize = ellipsize;
        int i17 = com.tencent.kinda.framework.widget.base.MMKLabelView.AnonymousClass1.$SwitchMap$com$tencent$kinda$gen$Ellipsize[ellipsize.ordinal()];
        if (i17 == 1) {
            getView().setEllipsize(android.text.TextUtils.TruncateAt.END);
        } else if (i17 == 2) {
            getView().setEllipsize(android.text.TextUtils.TruncateAt.START);
        } else if (i17 == 3) {
            getView().setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        }
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setFontStyle(com.tencent.kinda.gen.FontStyle fontStyle) {
        this.fontStyle = fontStyle;
        updateTypeface();
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setLineSpacingFactor(float f17) {
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setLines(int i17) {
        if (i17 > 0) {
            getView().setMaxLines(i17);
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setMaxLength(int i17) {
        if (i17 >= 0) {
            this.maxLength = i17;
            getView().setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.maxLength)});
        }
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setText(java.lang.String str) {
        if (str != null) {
            android.widget.TextView view = getView();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            float textSize = getView().getTextSize();
            ((ke0.e) xVar).getClass();
            view.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign) {
        if (textAlign != null) {
            this.textAlign = textAlign;
            int gravity = getView().getGravity();
            int i17 = com.tencent.kinda.framework.widget.base.MMKLabelView.AnonymousClass1.$SwitchMap$com$tencent$kinda$gen$TextAlign[this.textAlign.ordinal()];
            if (i17 == 1) {
                getView().setGravity(gravity | 3);
            } else if (i17 == 2) {
                getView().setGravity(17);
            } else {
                if (i17 != 3) {
                    return;
                }
                getView().setGravity(5);
            }
        }
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.textColor = dynamicColor;
        com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType mMViewType = com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKLabelViewText;
        java.lang.Integer.toHexString(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor, mMViewType)));
        getView().setTextColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor, mMViewType)));
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setTextFont(java.lang.String str) {
        if (str != null) {
            this.textFontName = str;
            updateTypeface();
        }
    }

    @Override // com.tencent.kinda.gen.KLabelView
    public void setTextSize(float f17) {
        if (f17 > 0.0f) {
            getView().setTextSize(1, f17 * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f));
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.TextView createView(android.content.Context context) {
        com.tencent.kinda.framework.widget.base.KindaTextView kindaTextView = new com.tencent.kinda.framework.widget.base.KindaTextView(context);
        kindaTextView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
        kindaTextView.setGravity(19);
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            kindaTextView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            this.textColor = new com.tencent.kinda.gen.DynamicColor(java.lang.Long.parseLong("E6000000", 16), java.lang.Long.parseLong("CCFFFFFF", 16));
        }
        return kindaTextView;
    }
}

package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class MMKRichText implements com.tencent.kinda.gen.KText {
    public com.tencent.kinda.gen.VoidCallback linkCallback;
    public boolean hasLinkAndCanCallback = false;
    private android.text.SpannableStringBuilder spanText = new android.text.SpannableStringBuilder("");
    private java.util.ArrayList<com.tencent.kinda.framework.widget.base.MMKRichText.PayTextContent> textArray = new java.util.ArrayList<>();
    public boolean supportDynamicSize = true;
    public float defaultTextSize = 0.0f;
    private boolean baselineAlign = false;

    /* loaded from: classes9.dex */
    public static class MMKLink implements com.tencent.kinda.gen.KLink {
        private com.tencent.kinda.gen.DynamicColor bgColor;
        private int bgRadius;
        private com.tencent.kinda.gen.VoidCallback clickCallback;
        private int linkColor;
        private com.tencent.kinda.gen.LinkStyle linkStyle;
        private java.lang.String text;
        private java.lang.String textFontName;
        private float textSize;
        private boolean setLinkColor = false;
        public boolean hasCallBack = false;
        private com.tencent.kinda.gen.FontStyle fontStyle = com.tencent.kinda.gen.FontStyle.REGULAR;
        public boolean supportDynamicSize = true;
        public boolean abtestOpen = false;
        public float defaultTextSize = 0.0f;
        public boolean baselineAlign = false;

        /* loaded from: classes9.dex */
        public static class CustomBaselineShiftSpan extends android.text.style.MetricAffectingSpan {
            private final int shift;

            public CustomBaselineShiftSpan(int i17) {
                this.shift = i17;
            }

            @Override // android.text.style.CharacterStyle
            public void updateDrawState(android.text.TextPaint textPaint) {
                textPaint.baselineShift += this.shift;
            }

            @Override // android.text.style.MetricAffectingSpan
            public void updateMeasureState(android.text.TextPaint textPaint) {
                textPaint.baselineShift += this.shift;
            }
        }

        /* loaded from: classes9.dex */
        public static class LinkClickableSpan extends com.tencent.mm.pluginsdk.ui.span.z0 {
            private com.tencent.kinda.gen.VoidCallback clickCallback;
            private int linkColor;
            private com.tencent.kinda.gen.LinkStyle linkStyle;

            public LinkClickableSpan(int i17, com.tencent.kinda.gen.VoidCallback voidCallback) {
                super(2, (r35.m3) null);
                this.linkColor = i17;
                this.clickCallback = voidCallback;
                setColor(i17, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
            }

            @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
            public void onClick(android.view.View view) {
                com.tencent.kinda.gen.VoidCallback voidCallback = this.clickCallback;
                if (voidCallback != null) {
                    voidCallback.call();
                }
            }
        }

        private int calculateBaselineShift(float f17, float f18) {
            android.graphics.Typeface typeface;
            android.graphics.Typeface typeface2;
            try {
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setTextSize(f17);
                if (!android.text.TextUtils.isEmpty(this.textFontName) && (typeface2 = com.tencent.kinda.framework.widget.tools.KindaFontUtil.getTypeface(this.textFontName)) != null) {
                    paint.setTypeface(typeface2);
                }
                android.graphics.Paint paint2 = new android.graphics.Paint();
                paint2.setTextSize(f18);
                if (!android.text.TextUtils.isEmpty(this.textFontName) && (typeface = com.tencent.kinda.framework.widget.tools.KindaFontUtil.getTypeface(this.textFontName)) != null) {
                    paint2.setTypeface(typeface);
                }
                android.graphics.Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                android.graphics.Paint.FontMetrics fontMetrics2 = paint2.getFontMetrics();
                return java.lang.Math.round(((fontMetrics.ascent + fontMetrics.descent) / 2.0f) - ((fontMetrics2.ascent + fontMetrics2.descent) / 2.0f));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MMKRichText", "计算baseline偏移失败: " + e17.getMessage());
                return 0;
            }
        }

        public android.text.SpannableString get() {
            android.text.SpannableString spannableString = new android.text.SpannableString("");
            if (this.text != null) {
                spannableString = new android.text.SpannableString(this.text);
            }
            if (!this.setLinkColor && com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
                this.linkColor = com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(new com.tencent.kinda.gen.DynamicColor(java.lang.Long.parseLong("E6000000", 16), java.lang.Long.parseLong("CCFFFFFF", 16))));
            }
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(this.linkColor), 0, spannableString.length(), 33);
            if (this.clickCallback != null) {
                spannableString.setSpan(new com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink.LinkClickableSpan(this.linkColor, this.clickCallback), 0, spannableString.length(), 33);
            }
            if (this.linkStyle == com.tencent.kinda.gen.LinkStyle.DELETED) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableString.length(), 33);
            }
            if (this.linkStyle == com.tencent.kinda.gen.LinkStyle.UNDERLINE) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 33);
            }
            float f17 = this.textSize;
            if (this.abtestOpen) {
                if (this.supportDynamicSize) {
                    f17 = com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) * this.textSize;
                }
                if (f17 > 0.0f) {
                    spannableString.setSpan(new android.text.style.AbsoluteSizeSpan((int) f17, false), 0, spannableString.length(), 33);
                }
            }
            if (this.baselineAlign) {
                float f18 = this.defaultTextSize;
                if (f18 > 0.0f && f17 > 0.0f && java.lang.Math.abs(f17 - f18) > 1.0f) {
                    spannableString.setSpan(new com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink.CustomBaselineShiftSpan(calculateBaselineShift(this.defaultTextSize, f17)), 0, spannableString.length(), 33);
                }
            }
            com.tencent.kinda.gen.DynamicColor dynamicColor = this.bgColor;
            if (dynamicColor != null) {
                long colorByMode = com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor);
                int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
                spannableString.setSpan(new yl1.c(this.text, b17, b17, (int) f17, this.linkColor, (int) colorByMode, this.bgRadius), 0, spannableString.length(), 33);
            }
            if (!android.text.TextUtils.isEmpty(this.textFontName) || this.fontStyle != com.tencent.kinda.gen.FontStyle.REGULAR) {
                spannableString.setSpan(new com.tencent.kinda.framework.widget.tools.KindaFontUtil.KindaTypefaceSpan(this.textFontName, this.fontStyle), 0, spannableString.length(), 33);
            }
            return spannableString;
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setBackground(com.tencent.kinda.gen.DynamicColor dynamicColor, int i17) {
            this.bgColor = dynamicColor;
            this.bgRadius = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17);
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setFontStyle(com.tencent.kinda.gen.FontStyle fontStyle) {
            this.fontStyle = fontStyle;
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setLinkCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
            if (voidCallback != null) {
                this.clickCallback = voidCallback;
                this.hasCallBack = true;
            }
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setLinkColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
            this.linkColor = com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor));
            this.setLinkColor = true;
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setLinkFont(java.lang.String str) {
            this.textFontName = str;
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setLinkStyle(com.tencent.kinda.gen.LinkStyle linkStyle) {
            this.linkStyle = linkStyle;
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setText(java.lang.String str) {
            this.text = str;
        }

        @Override // com.tencent.kinda.gen.KLink
        public void setTextSize(float f17) {
            this.textSize = i65.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a, f17);
        }
    }

    private boolean abtestOpen() {
        return true;
    }

    @Override // com.tencent.kinda.gen.KText
    public void appendLink(com.tencent.kinda.gen.KLink kLink) {
        if (kLink == null || !(kLink instanceof com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink)) {
            return;
        }
        com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink mMKLink = (com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink) kLink;
        if (abtestOpen()) {
            mMKLink.abtestOpen = true;
            this.textArray.add(new com.tencent.kinda.framework.widget.base.MMKRichText.PayTextContent(mMKLink));
        } else {
            this.spanText.append((java.lang.CharSequence) mMKLink.get());
            this.hasLinkAndCanCallback = mMKLink.hasCallBack;
            this.linkCallback = mMKLink.clickCallback;
        }
    }

    @Override // com.tencent.kinda.gen.KText
    public void appendText(java.lang.String str) {
        if (str != null) {
            if (abtestOpen()) {
                this.textArray.add(new com.tencent.kinda.framework.widget.base.MMKRichText.PayTextContent(str));
                return;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = this.spanText;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ke0.e) xVar).getClass();
            spannableStringBuilder.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        }
    }

    public java.lang.CharSequence get() {
        if (abtestOpen() && !this.textArray.isEmpty()) {
            for (int i17 = 0; i17 < this.textArray.size(); i17++) {
                if (this.textArray.get(i17).link != null) {
                    com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink mMKLink = this.textArray.get(i17).link;
                    mMKLink.supportDynamicSize = this.supportDynamicSize;
                    mMKLink.defaultTextSize = this.defaultTextSize;
                    mMKLink.baselineAlign = this.baselineAlign;
                    this.spanText.append((java.lang.CharSequence) mMKLink.get());
                    this.hasLinkAndCanCallback = mMKLink.hasCallBack;
                    this.linkCallback = mMKLink.clickCallback;
                } else {
                    android.text.SpannableStringBuilder spannableStringBuilder = this.spanText;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    java.lang.String str = this.textArray.get(i17).textStr;
                    ((ke0.e) xVar).getClass();
                    spannableStringBuilder.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
                }
            }
            this.textArray.clear();
        }
        return this.spanText;
    }

    @Override // com.tencent.kinda.gen.KText
    public void setBaselineAlign(boolean z17) {
        this.baselineAlign = z17;
    }

    /* loaded from: classes9.dex */
    public static class PayTextContent {
        public com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink link;
        public java.lang.String textStr;

        public PayTextContent(java.lang.String str) {
            this.link = null;
            this.textStr = str;
        }

        public PayTextContent(com.tencent.kinda.framework.widget.base.MMKRichText.MMKLink mMKLink) {
            this.textStr = "";
            this.link = mMKLink;
        }
    }
}

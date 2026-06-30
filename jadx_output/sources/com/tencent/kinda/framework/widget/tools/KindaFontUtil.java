package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class KindaFontUtil {
    private static final java.lang.String TAG = "KindaFontUtil";
    private static android.graphics.Typeface[] typefaces;

    /* loaded from: classes9.dex */
    public static class KindaTypefaceSpan extends android.text.style.MetricAffectingSpan {
        private java.lang.String fontName;
        private com.tencent.kinda.gen.FontStyle fontStyle;

        public KindaTypefaceSpan(java.lang.String str, com.tencent.kinda.gen.FontStyle fontStyle) {
            if (str == null) {
                this.fontName = "";
            } else {
                this.fontName = str;
            }
            this.fontStyle = fontStyle;
        }

        private void updateKindaFont(android.text.TextPaint textPaint) {
            int i17;
            android.graphics.Typeface typeface = com.tencent.kinda.framework.widget.tools.KindaFontUtil.getTypeface(this.fontName);
            if (typeface != null) {
                textPaint.setTypeface(typeface);
                return;
            }
            com.tencent.kinda.gen.FontStyle fontStyle = this.fontStyle;
            if (fontStyle == com.tencent.kinda.gen.FontStyle.MEDIUM) {
                com.tencent.mm.ui.bk.r0(textPaint, 0.8f);
                return;
            }
            if (fontStyle == com.tencent.kinda.gen.FontStyle.BOLD) {
                textPaint.setFakeBoldText(true);
                i17 = 1;
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setStrokeWidth(0.0f);
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                i17 = 0;
            }
            android.graphics.Typeface typeface2 = textPaint.getTypeface();
            int style = i17 | (typeface2 != null ? typeface2.getStyle() : 0);
            android.graphics.Typeface defaultFromStyle = typeface2 == null ? android.graphics.Typeface.defaultFromStyle(style) : android.graphics.Typeface.create(typeface2, style);
            int i18 = style & (~defaultFromStyle.getStyle());
            if ((i18 & 1) != 0) {
                textPaint.setFakeBoldText(true);
            }
            if ((i18 & 2) != 0) {
                textPaint.setTextSkewX(-0.25f);
            }
            textPaint.setTypeface(defaultFromStyle);
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            updateKindaFont(textPaint);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(android.text.TextPaint textPaint) {
            updateKindaFont(textPaint);
        }
    }

    public static android.graphics.Typeface getTypeface(java.lang.String str) {
        int i17;
        android.graphics.Typeface[] typefaceArr = typefaces;
        if (typefaceArr == null || typefaceArr.length == 0) {
            typefaces = new android.graphics.Typeface[9];
        }
        if (str.equalsIgnoreCase("WeChat-Sans-SS-Light")) {
            i17 = 2;
        } else if (str.equalsIgnoreCase("WeChat-Sans-SS-Medium")) {
            i17 = 0;
        } else if (str.equalsIgnoreCase("WeChat-Sans-SS-Regular")) {
            i17 = 3;
        } else if (str.equalsIgnoreCase("WeChat-Sans-SS-Bold")) {
            i17 = 1;
        } else if (str.equalsIgnoreCase("WeChat-Sans-Std-Medium")) {
            i17 = 4;
        } else if (str.equalsIgnoreCase("WeChat-Sans-Std-Light")) {
            i17 = 6;
        } else if (str.equalsIgnoreCase("WeChat-Sans-Std-Bold")) {
            i17 = 5;
        } else {
            if (!str.equalsIgnoreCase("WeChat-Sans-Std-Regular")) {
                return null;
            }
            i17 = 7;
        }
        if (i17 >= 9) {
            return null;
        }
        android.graphics.Typeface typeface = typefaces[i17];
        if (typeface != null) {
            return typeface;
        }
        try {
            typefaces[i17] = android.graphics.Typeface.createFromAsset(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets(), com.tencent.mm.wallet_core.ui.r1.E(i17));
            return typefaces[i17];
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}

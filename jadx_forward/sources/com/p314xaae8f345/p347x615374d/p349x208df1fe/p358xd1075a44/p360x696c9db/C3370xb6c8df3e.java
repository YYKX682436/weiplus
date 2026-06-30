package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db;

/* renamed from: com.tencent.kinda.framework.widget.tools.KindaFontUtil */
/* loaded from: classes9.dex */
public class C3370xb6c8df3e {
    private static final java.lang.String TAG = "KindaFontUtil";

    /* renamed from: typefaces */
    private static android.graphics.Typeface[] f13382x1f4edabc;

    /* renamed from: com.tencent.kinda.framework.widget.tools.KindaFontUtil$KindaTypefaceSpan */
    /* loaded from: classes9.dex */
    public static class KindaTypefaceSpan extends android.text.style.MetricAffectingSpan {

        /* renamed from: fontName */
        private java.lang.String f13383x15c83b7a;

        /* renamed from: fontStyle */
        private com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 f13384xa38e7aa2;

        public KindaTypefaceSpan(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 enumC3399x1b009a82) {
            if (str == null) {
                this.f13383x15c83b7a = "";
            } else {
                this.f13383x15c83b7a = str;
            }
            this.f13384xa38e7aa2 = enumC3399x1b009a82;
        }

        /* renamed from: updateKindaFont */
        private void m27321x46db0273(android.text.TextPaint textPaint) {
            int i17;
            android.graphics.Typeface m27320x5392760d = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3370xb6c8df3e.m27320x5392760d(this.f13383x15c83b7a);
            if (m27320x5392760d != null) {
                textPaint.setTypeface(m27320x5392760d);
                return;
            }
            com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82 enumC3399x1b009a82 = this.f13384xa38e7aa2;
            if (enumC3399x1b009a82 == com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.MEDIUM) {
                com.p314xaae8f345.mm.ui.bk.r0(textPaint, 0.8f);
                return;
            }
            if (enumC3399x1b009a82 == com.p314xaae8f345.p347x615374d.gen.EnumC3399x1b009a82.BOLD) {
                textPaint.setFakeBoldText(true);
                i17 = 1;
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setStrokeWidth(0.0f);
                textPaint.setStyle(android.graphics.Paint.Style.FILL);
                i17 = 0;
            }
            android.graphics.Typeface typeface = textPaint.getTypeface();
            int style = i17 | (typeface != null ? typeface.getStyle() : 0);
            android.graphics.Typeface defaultFromStyle = typeface == null ? android.graphics.Typeface.defaultFromStyle(style) : android.graphics.Typeface.create(typeface, style);
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
            m27321x46db0273(textPaint);
        }

        @Override // android.text.style.MetricAffectingSpan
        public void updateMeasureState(android.text.TextPaint textPaint) {
            m27321x46db0273(textPaint);
        }
    }

    /* renamed from: getTypeface */
    public static android.graphics.Typeface m27320x5392760d(java.lang.String str) {
        int i17;
        android.graphics.Typeface[] typefaceArr = f13382x1f4edabc;
        if (typefaceArr == null || typefaceArr.length == 0) {
            f13382x1f4edabc = new android.graphics.Typeface[9];
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
        android.graphics.Typeface typeface = f13382x1f4edabc[i17];
        if (typeface != null) {
            return typeface;
        }
        try {
            f13382x1f4edabc[i17] = android.graphics.Typeface.createFromAsset(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets(), com.p314xaae8f345.mm.p2802xd031a825.ui.r1.E(i17));
            return f13382x1f4edabc[i17];
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }
}

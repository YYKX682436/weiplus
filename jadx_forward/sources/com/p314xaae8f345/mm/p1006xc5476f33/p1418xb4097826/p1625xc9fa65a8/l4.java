package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class l4 {

    /* renamed from: c, reason: collision with root package name */
    public static r45.b31 f207296c;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4 f207294a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.l4();

    /* renamed from: b, reason: collision with root package name */
    public static final int f207295b = i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 72);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f207297d = new java.util.concurrent.ConcurrentHashMap();

    public final java.lang.String a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "<font color=\"#06AD56\">";
        }
        return "<font color=" + str + '>';
    }

    public final android.text.Spanned b(java.lang.String origin, android.text.TextPaint textPaint, int i17, java.lang.String highLightFontColor, boolean z17) {
        int i18;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highLightFontColor, "highLightFontColor");
        java.lang.String replacement = a(highLightFontColor);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("<em class=\"highlight\">");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replacement, "replacement");
        java.lang.String replaceAll = compile.matcher(origin).replaceAll(replacement);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("</em>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("</font>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll2, "replaceAll(...)");
        android.text.Spanned fromHtml = android.text.Html.fromHtml(replaceAll2);
        float f17 = i17;
        if (textPaint.measureText(fromHtml.toString()) <= f17 || !(fromHtml instanceof android.text.SpannableStringBuilder)) {
            return fromHtml;
        }
        float textSize = f17 - (z17 ? textPaint.getTextSize() * 2 : 0.0f);
        float measureText = textPaint.measureText("…");
        android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) fromHtml.getSpans(0, fromHtml.length(), android.text.style.ForegroundColorSpan.class);
        if (foregroundColorSpanArr != null) {
            int length = foregroundColorSpanArr.length;
            int i27 = 0;
            i18 = 0;
            i19 = 0;
            while (i27 < length) {
                android.text.style.ForegroundColorSpan foregroundColorSpan = foregroundColorSpanArr[i27];
                int spanStart = fromHtml.getSpanStart(foregroundColorSpan);
                i27++;
                i19 = fromHtml.getSpanEnd(foregroundColorSpan);
                i18 = spanStart;
            }
        } else {
            i18 = 0;
            i19 = 0;
        }
        if (i19 == 0) {
            return fromHtml;
        }
        android.text.Spanned spanned = fromHtml;
        float measureText2 = textPaint.measureText(spanned, 0, i18);
        float measureText3 = textPaint.measureText(spanned, i18, i19);
        float measureText4 = textPaint.measureText(spanned, i19, fromHtml.length());
        java.lang.CharSequence subSequence = fromHtml.subSequence(0, i18);
        java.lang.CharSequence subSequence2 = fromHtml.subSequence(i18, i19);
        java.lang.CharSequence subSequence3 = fromHtml.subSequence(i19, fromHtml.length());
        if (measureText2 + measureText3 + measureText < textSize) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(subSequence);
            spannableStringBuilder.append(subSequence2);
            spannableStringBuilder.append(android.text.TextUtils.ellipsize(subSequence3, textPaint, (textSize - measureText2) - measureText3, android.text.TextUtils.TruncateAt.END));
            return spannableStringBuilder;
        }
        float f18 = measureText + measureText3;
        if (f18 + measureText4 < textSize) {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            spannableStringBuilder2.append(android.text.TextUtils.ellipsize(subSequence, textPaint, (textSize - measureText3) - measureText4, android.text.TextUtils.TruncateAt.START));
            spannableStringBuilder2.append(subSequence2);
            spannableStringBuilder2.append(subSequence3);
            return spannableStringBuilder2;
        }
        if (f18 + measureText >= textSize) {
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
            spannableStringBuilder3.append(android.text.TextUtils.ellipsize(subSequence2, textPaint, textSize, android.text.TextUtils.TruncateAt.END));
            return spannableStringBuilder3;
        }
        android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder();
        float f19 = (textSize - measureText3) / 2;
        spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence, textPaint, f19, android.text.TextUtils.TruncateAt.START));
        spannableStringBuilder4.append(subSequence2);
        spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence3, textPaint, f19, android.text.TextUtils.TruncateAt.END));
        return spannableStringBuilder4;
    }

    public final android.text.Spanned c(java.lang.String origin, java.lang.String highLightFontColor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highLightFontColor, "highLightFontColor");
        java.lang.String replacement = a(highLightFontColor);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("<em class=\"highlight\">");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replacement, "replacement");
        java.lang.String replaceAll = compile.matcher(origin).replaceAll(replacement);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("</em>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("</font>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll2, "replaceAll(...)");
        android.text.Spanned fromHtml = android.text.Html.fromHtml(replaceAll2);
        if (fromHtml instanceof android.text.SpannableStringBuilder) {
            android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) fromHtml.getSpans(0, fromHtml.length(), android.text.style.ForegroundColorSpan.class);
            if (foregroundColorSpanArr != null) {
                for (android.text.style.ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                    int spanStart = fromHtml.getSpanStart(foregroundColorSpan);
                    int spanEnd = fromHtml.getSpanEnd(foregroundColorSpan);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(spanStart);
                    sb6.append(' ');
                    sb6.append(spanEnd);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Hightlight", sb6.toString());
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fromHtml);
        return fromHtml;
    }

    public final java.lang.String d(java.lang.String origin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(origin, "origin");
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("<em class=\"highlight\">");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(origin).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("</em>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile2, "compile(...)");
        java.lang.String replaceAll2 = compile2.matcher(replaceAll).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll2, "replaceAll(...)");
        return replaceAll2;
    }
}

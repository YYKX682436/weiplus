package ad4;

/* loaded from: classes15.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final ad4.y f84743a = new ad4.y();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f84744b = jz5.h.b(ad4.x.f84742d);

    public final java.lang.String a(java.lang.String str, java.lang.Integer num) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("generateCacheKeyAboutFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        if (str == null || num == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateCacheKeyAboutFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return "";
        }
        java.lang.String str2 = str + '+' + num;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("generateCacheKeyAboutFoldCommentContent", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return str2;
    }

    public final android.text.Layout b(android.widget.TextView textView, java.lang.CharSequence charSequence, int i17) {
        android.text.DynamicLayout dynamicLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDynamicLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= 28) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeDynamicLayoutNotBelow28", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            android.text.DynamicLayout.Builder hyphenationFrequency = android.text.DynamicLayout.Builder.obtain(charSequence, textView.getPaint(), i17).setAlignment(android.text.Layout.Alignment.ALIGN_NORMAL).setTextDirection(android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hyphenationFrequency, "setHyphenationFrequency(...)");
            if (i18 >= 26) {
                hyphenationFrequency.setJustificationMode(textView.getJustificationMode());
            }
            if (textView.getEllipsize() != null) {
                hyphenationFrequency.setEllipsize(textView.getEllipsize()).setEllipsizedWidth(i17);
            }
            hyphenationFrequency.setDisplayText(charSequence);
            dynamicLayout = hyphenationFrequency.build();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dynamicLayout, "build(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeDynamicLayoutNotBelow28", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeDynamicLayoutBelow28", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            android.text.DynamicLayout dynamicLayout2 = new android.text.DynamicLayout(charSequence, charSequence, textView.getPaint(), i17, android.text.Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding(), textView.getEllipsize(), textView.getEllipsize() != null ? i17 : 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeDynamicLayoutBelow28", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            dynamicLayout = dynamicLayout2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDynamicLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return dynamicLayout;
    }

    public final java.util.Map c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFoldCommentContentMap", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        java.util.Map map = (java.util.Map) ((jz5.n) f84744b).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldCommentContentMap", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return map;
    }

    public final jz5.l d(java.lang.CharSequence content, android.widget.TextView tv6, int i17, int i18, int i19, android.text.Layout layout) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        if (layout == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.TextUtil", "getFoldCommentString error textMeasureLayout null");
            jz5.l lVar = new jz5.l("", java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return lVar;
        }
        int lineCount = layout.getLineCount();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.TextUtil", "getFoldCommentString >> lineCount: " + lineCount + " showLineCount: " + i19);
        if (lineCount <= i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.TextUtil", "getFoldCommentString error lineCount <= maxShowCount");
            jz5.l lVar2 = new jz5.l("", java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return lVar2;
        }
        double d17 = i17 - i18;
        int i27 = i19 - 1;
        int lineEnd = layout.getLineEnd(i27);
        int lineStart = layout.getLineStart(i27);
        int min = java.lang.Integer.min(content.length() - 1, lineEnd);
        if (lineStart < 0 || min >= content.length() || lineStart >= min) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.TextUtil", "getFoldCommentString error,start:" + lineStart + " last:" + min);
            jz5.l lVar3 = new jz5.l("", java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return lVar3;
        }
        java.lang.CharSequence subSequence = content.subSequence(lineStart, min);
        int i28 = (int) ((lineEnd - lineStart) * (d17 / i17));
        boolean z17 = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274869d;
        int h17 = com.p314xaae8f345.mm.p2614xca6eae71.l0.f274840a.h(subSequence.toString(), 0, i28) + lineStart;
        layout.getLineVisibleEnd(0);
        jz5.l lVar4 = new jz5.l(content.subSequence(0, h17), java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFoldCommentString", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return lVar4;
    }

    public final android.text.Layout e(android.widget.TextView textView, java.lang.CharSequence charSequence, int i17) {
        android.text.Layout layout;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMeasureTextLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = "";
        }
        int max = java.lang.Math.max((i17 - textView.getCompoundPaddingLeft()) - textView.getCompoundPaddingRight(), 0);
        try {
            layout = b(textView, charSequence, max);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.TextUtil", "getMeasureTextLayout: DynamicLayout failed: " + e17);
            layout = null;
        }
        if (layout == null) {
            try {
                layout = f(textView, charSequence.toString(), max);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.TextUtil", "getMeasureTextLayout: StaticLayout failed: " + e18);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMeasureTextLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return layout;
    }

    public final android.text.StaticLayout f(android.widget.TextView textView, java.lang.CharSequence charSequence, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStaticLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        android.text.StaticLayout.Builder hyphenationFrequency = android.text.StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textView.getPaint(), i17).setAlignment(android.text.Layout.Alignment.ALIGN_NORMAL).setTextDirection(android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(hyphenationFrequency, "setHyphenationFrequency(...)");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            hyphenationFrequency.setJustificationMode(textView.getJustificationMode());
        }
        if (textView.getEllipsize() != null && textView.getKeyListener() == null) {
            hyphenationFrequency.setEllipsize(textView.getEllipsize()).setEllipsizedWidth(i17);
        }
        android.text.StaticLayout build = hyphenationFrequency.build();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(build, "build(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStaticLayout", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return build;
    }

    public final int g(android.widget.TextView textView, java.lang.CharSequence charSequence, int i17) {
        int i18;
        android.text.Layout e17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTextViewLines", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        if (charSequence == null || charSequence.length() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewLines", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return 0;
        }
        try {
            e17 = e(textView, charSequence, i17);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.TextUtil", "getTextViewLines: failed: " + e18);
        }
        if (e17 != null) {
            i18 = e17.getLineCount();
            int max = java.lang.Math.max(i18, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewLines", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
            return max;
        }
        i18 = 0;
        int max2 = java.lang.Math.max(i18, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTextViewLines", "com.tencent.mm.plugin.sns.ui.improve.util.ImproveTextUtil");
        return max2;
    }
}

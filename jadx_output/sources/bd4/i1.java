package bd4;

/* loaded from: classes10.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final bd4.i1 f19357a = new bd4.i1();

    static {
        kz5.c0.i(new bd4.h1("\"", "\""), new bd4.h1("“", "”"), new bd4.h1("'", "'"), new bd4.h1("『", "』"), new bd4.h1("「", "」"), new bd4.h1("(", ")"), new bd4.h1("{", "}"), new bd4.h1("<", ">"), new bd4.h1("【", "】"), new bd4.h1("〖", "〗"), new bd4.h1("〔", "〕"), new bd4.h1("()", "()"), new bd4.h1("{}", "{}"), new bd4.h1("<>", "<>"), new bd4.h1("《", "》"), new bd4.h1("〈", "〉"), new bd4.h1("«", "»"));
        java.util.regex.Pattern.compile("[.。！？!?．…‥\n\r]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        r4 = r4.b(r5, r6, r7, r8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findWordRangeByICU", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
        r1 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.util.Pair] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(bd4.i1 r4, java.lang.String r5, int r6, boolean r7, int r8, android.text.Spannable r9, int r10, java.lang.Object r11) {
        /*
            java.lang.String r11 = "selectPartText$default"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r0)
            r10 = r10 & 16
            r1 = 0
            if (r10 == 0) goto Le
            r9 = r1
        Le:
            r4.getClass()
            java.lang.String r10 = "selectPartText"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r0)
            java.lang.String r2 = "text"
            kotlin.jvm.internal.o.g(r5, r2)
            int r2 = r5.length()
            if (r2 != 0) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            if (r2 == 0) goto L2d
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
            goto Lc9
        L2d:
            if (r6 < 0) goto Lc6
            int r2 = r5.length()
            if (r6 < r2) goto L37
            goto Lc6
        L37:
            char r2 = r5.charAt(r6)
            r3 = 10
            if (r2 == r3) goto Lc2
            r3 = 32
            if (r2 != r3) goto L45
            goto Lc2
        L45:
            android.util.Pair r1 = r4.a(r5, r6, r9)
            if (r1 == 0) goto L50
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
            goto Lc9
        L50:
            java.lang.String r9 = "findWordRangeByICU"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r0)
            java.util.Locale r1 = java.util.Locale.CHINESE     // Catch: java.lang.Exception -> L9e
            android.icu.text.BreakIterator r1 = android.icu.text.BreakIterator.getWordInstance(r1)     // Catch: java.lang.Exception -> L9e
            r1.setText(r5)     // Catch: java.lang.Exception -> L9e
            int r2 = r1.following(r6)     // Catch: java.lang.Exception -> L9e
            int r1 = r1.preceding(r2)     // Catch: java.lang.Exception -> L9e
            r3 = -1
            if (r1 == r3) goto L96
            if (r2 == r3) goto L96
            if (r1 < r2) goto L6e
            goto L96
        L6e:
            if (r6 < r1) goto L8e
            if (r6 < r2) goto L73
            goto L8e
        L73:
            if (r7 == 0) goto L7a
            if (r8 <= 0) goto L7a
            if (r2 <= r8) goto L7a
            r2 = r8
        L7a:
            if (r1 >= r2) goto Lb6
            android.util.Pair r3 = new android.util.Pair     // Catch: java.lang.Exception -> L9e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L9e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L9e
            r3.<init>(r1, r2)     // Catch: java.lang.Exception -> L9e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)     // Catch: java.lang.Exception -> L9e
            r1 = r3
            goto Lbe
        L8e:
            android.util.Pair r1 = r4.b(r5, r6, r7, r8)     // Catch: java.lang.Exception -> L9e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)     // Catch: java.lang.Exception -> L9e
            goto Lbe
        L96:
            android.util.Pair r1 = r4.b(r5, r6, r7, r8)     // Catch: java.lang.Exception -> L9e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)     // Catch: java.lang.Exception -> L9e
            goto Lbe
        L9e:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "findWordRangeByICU error: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MicroMsg.SnsLongClickWordHelper"
            com.tencent.mars.xlog.Log.e(r2, r1)
        Lb6:
            android.util.Pair r4 = r4.b(r5, r6, r7, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r0)
            r1 = r4
        Lbe:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
            goto Lc9
        Lc2:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
            goto Lc9
        Lc6:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r0)
        Lc9:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bd4.i1.d(bd4.i1, java.lang.String, int, boolean, int, android.text.Spannable, int, java.lang.Object):android.util.Pair");
    }

    public final android.util.Pair a(java.lang.String text, int i17, android.text.Spannable spannable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findLinkRange", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
        kotlin.jvm.internal.o.g(text, "text");
        if (spannable != null) {
            android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(0, text.length(), android.text.style.ClickableSpan.class);
            kotlin.jvm.internal.o.d(clickableSpanArr);
            for (android.text.style.ClickableSpan clickableSpan : clickableSpanArr) {
                int spanStart = spannable.getSpanStart(clickableSpan);
                int spanEnd = spannable.getSpanEnd(clickableSpan);
                if (spanStart <= i17 && i17 < spanEnd) {
                    android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(spanStart), java.lang.Integer.valueOf(spanEnd));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findLinkRange", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
                    return pair;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findLinkRange", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
        return null;
    }

    public final android.util.Pair b(java.lang.String str, int i17, boolean z17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findWordRange", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
        if (str.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findWordRange", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
            return null;
        }
        if (z17 && i18 > 0) {
            i17 = java.lang.Math.min(i17, i18 - 1);
        }
        int i19 = i17;
        while (i19 > 0 && c(str.charAt(i19 - 1))) {
            i19--;
        }
        while (i17 < str.length() && c(str.charAt(i17))) {
            i17++;
        }
        if (!z17 || i18 <= 0 || i17 <= i18) {
            i18 = i17;
        }
        if (i19 >= i18) {
            i18 = java.lang.Math.min(i19 + 2, str.length());
        }
        android.util.Pair pair = new android.util.Pair(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findWordRange", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
        return pair;
    }

    public final boolean c(char c17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWordChar", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
        boolean z17 = java.lang.Character.isLetterOrDigit(c17) || kotlin.jvm.internal.o.b(java.lang.Character.UnicodeBlock.of(c17), java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) || kotlin.jvm.internal.o.b(java.lang.Character.UnicodeBlock.of(c17), java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) || kotlin.jvm.internal.o.b(java.lang.Character.UnicodeBlock.of(c17), java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B) || kotlin.jvm.internal.o.b(java.lang.Character.UnicodeBlock.of(c17), java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS) || kotlin.jvm.internal.o.b(java.lang.Character.UnicodeBlock.of(c17), java.lang.Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT) || kotlin.jvm.internal.o.b(java.lang.Character.UnicodeBlock.of(c17), java.lang.Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWordChar", "com.tencent.mm.plugin.sns.ui.improve.view.SnsLongClickWordHelper");
        return z17;
    }
}

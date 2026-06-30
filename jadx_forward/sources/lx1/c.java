package lx1;

/* loaded from: classes12.dex */
public abstract class c {
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.text.Spanned r18) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx1.c.a(android.text.Spanned):java.lang.String");
    }

    public static void b(android.text.Spanned spanned, java.lang.StringBuilder sb6, int i17, int i18, java.util.SortedSet sortedSet) {
        while (i17 < i18) {
            android.text.style.CharacterStyle characterStyle = sortedSet.isEmpty() ? null : (android.text.style.CharacterStyle) sortedSet.first();
            int spanStart = characterStyle == null ? Integer.MAX_VALUE : spanned.getSpanStart(characterStyle);
            int spanEnd = characterStyle != null ? spanned.getSpanEnd(characterStyle) : Integer.MAX_VALUE;
            if (i17 < spanStart) {
                c(spanned, sb6, i17, java.lang.Math.min(i18, spanStart));
                i17 = spanStart;
            } else {
                sortedSet.remove(characterStyle);
                boolean z17 = characterStyle instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1342x688f269.C13159x75d53f8f;
                if (z17) {
                    sb6.append("<wx-b>");
                } else {
                    boolean z18 = characterStyle instanceof android.text.style.StyleSpan;
                    if (z18 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 1) {
                        sb6.append("<wx-b>");
                    } else if (z18 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 2) {
                        sb6.append("<i>");
                    } else if (characterStyle instanceof android.text.style.UnderlineSpan) {
                        sb6.append("<u>");
                    } else if (characterStyle instanceof android.text.style.RelativeSizeSpan) {
                        sb6.append("<wx-font style=\"font-size:");
                        sb6.append(java.lang.Math.round(((int) (((android.text.style.RelativeSizeSpan) characterStyle).getSizeChange() * nx1.q.f422853d)) / nx1.q.a()));
                        sb6.append("px\">");
                    } else if (characterStyle instanceof android.text.style.AbsoluteSizeSpan) {
                        sb6.append("<wx-font style=\"font-size:");
                        sb6.append(java.lang.Math.round(((android.text.style.AbsoluteSizeSpan) characterStyle).getSize() / nx1.q.a()));
                        sb6.append("px\">");
                    } else if (characterStyle instanceof android.text.style.ForegroundColorSpan) {
                        sb6.append("<wx-font style=\"color:#");
                        java.lang.String hexString = java.lang.Integer.toHexString(((android.text.style.ForegroundColorSpan) characterStyle).getForegroundColor() + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
                        while (hexString.length() < 6) {
                            hexString = "0".concat(hexString);
                        }
                        sb6.append(hexString);
                        sb6.append("\">");
                    } else if (characterStyle instanceof android.text.style.BackgroundColorSpan) {
                        sb6.append("<wx-font style=\"background-color:#");
                        java.lang.String hexString2 = java.lang.Integer.toHexString(((android.text.style.BackgroundColorSpan) characterStyle).getBackgroundColor() + com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52070xe96767bb);
                        while (hexString2.length() < 6) {
                            hexString2 = "0".concat(hexString2);
                        }
                        sb6.append(hexString2);
                        sb6.append("\">");
                    }
                }
                b(spanned, sb6, java.lang.Math.max(spanStart, i17), java.lang.Math.min(spanEnd, i18), sortedSet);
                if (characterStyle instanceof android.text.style.ForegroundColorSpan) {
                    sb6.append("</wx-font>");
                } else if (characterStyle instanceof android.text.style.BackgroundColorSpan) {
                    sb6.append("</wx-font>");
                } else if (characterStyle instanceof android.text.style.AbsoluteSizeSpan) {
                    sb6.append("</wx-font>");
                } else if (characterStyle instanceof android.text.style.UnderlineSpan) {
                    sb6.append("</u>");
                } else if (z17) {
                    sb6.append("</wx-b>");
                } else {
                    boolean z19 = characterStyle instanceof android.text.style.StyleSpan;
                    if (z19 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 2) {
                        sb6.append("</i>");
                    } else if (z19 && ((android.text.style.StyleSpan) characterStyle).getStyle() == 1) {
                        sb6.append("</wx-b>");
                    } else if (characterStyle instanceof android.text.style.RelativeSizeSpan) {
                        sb6.append("</wx-font>");
                    }
                }
                i17 = spanEnd;
            }
        }
    }

    public static void c(java.lang.CharSequence charSequence, java.lang.StringBuilder sb6, int i17, int i18) {
        while (i17 < i18) {
            char charAt = charSequence.charAt(i17);
            if (charAt == '\n') {
                sb6.append("<br/>");
            } else if (charAt == '<') {
                sb6.append("&lt;");
            } else if (charAt == '>') {
                sb6.append("&gt;");
            } else if (charAt == '&') {
                sb6.append("&amp;");
            } else if (charAt == ' ') {
                while (true) {
                    int i19 = i17 + 1;
                    if (i19 >= i18 || charSequence.charAt(i19) != ' ') {
                        break;
                    }
                    sb6.append("&nbsp;");
                    i17 = i19;
                }
                sb6.append(' ');
            } else if (charAt < ' ') {
                sb6.append("&#" + ((int) charAt) + ";");
            } else {
                sb6.append(charAt);
            }
            i17++;
        }
    }

    public static void d(java.util.Stack stack, java.lang.StringBuilder sb6, px1.a aVar) {
        int i17;
        px1.p pVar = px1.p.NONE;
        int i18 = 0;
        if (stack.isEmpty()) {
            i17 = 0;
        } else {
            px1.a aVar2 = (px1.a) stack.peek();
            i17 = aVar2.f440350b;
            pVar = aVar2.f440349a;
        }
        int i19 = aVar.f440350b;
        px1.p pVar2 = aVar.f440349a;
        if (i19 > i17) {
            int i27 = i19 - i17;
            aVar.f440351c = i27;
            java.lang.String str = pVar2.f440374d;
            while (i18 < i27) {
                sb6.append(str);
                i18++;
            }
            stack.push(aVar);
            return;
        }
        if (i19 < i17) {
            e(stack, sb6);
            d(stack, sb6, aVar);
        } else if (pVar2 != pVar) {
            int e17 = e(stack, sb6);
            aVar.f440351c = e17;
            java.lang.String str2 = pVar2.f440374d;
            while (i18 < e17) {
                sb6.append(str2);
                i18++;
            }
            stack.push(aVar);
        }
    }

    public static int e(java.util.Stack stack, java.lang.StringBuilder sb6) {
        if (stack.isEmpty()) {
            return 0;
        }
        px1.a aVar = (px1.a) stack.pop();
        java.lang.String str = aVar.f440349a.f440375e;
        int i17 = aVar.f440351c;
        for (int i18 = 0; i18 < i17; i18++) {
            sb6.append(str);
        }
        return aVar.f440351c;
    }
}

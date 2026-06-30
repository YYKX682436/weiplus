package al5;

/* loaded from: classes9.dex */
public final class p3 {
    public static final java.lang.String a(java.lang.String text, float f17, int i17, android.graphics.Paint paint, int i18, boolean z17, boolean z18) {
        java.lang.String str;
        java.lang.String str2;
        int O;
        int O2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        float f18 = f17 * i17;
        if (paint.measureText(text) <= f18) {
            return text;
        }
        float measureText = paint.measureText("...");
        if (!z17 || (O2 = r26.n0.O(text, '.', 0, false, 6, null)) <= 0) {
            str = "";
            str2 = text;
        } else {
            str = text.substring(O2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
            str2 = text.substring(0, O2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "substring(...)");
        }
        float measureText2 = paint.measureText(str);
        float f19 = (i17 - 1) * f17;
        int max = java.lang.Math.max(0, str2.length() - java.lang.Math.min(i18, str2.length()));
        if (z18 && max > 0 && max < str2.length() && java.lang.Character.isLetterOrDigit(str2.charAt(max))) {
            int i19 = max;
            while (i19 > 0) {
                int i27 = i19 - 1;
                if (!java.lang.Character.isLetterOrDigit(str2.charAt(i27))) {
                    break;
                }
                i19 = i27;
            }
            if (i19 < max && f18 - ((paint.measureText(str2, i19, str2.length()) + measureText) + measureText2) >= f19) {
                max = i19;
            }
        }
        while (max < str2.length() && f18 - ((paint.measureText(str2, max, str2.length()) + measureText) + measureText2) < f19) {
            max++;
        }
        float f27 = 0.0f;
        if (max >= str2.length()) {
            float f28 = f18 - (measureText + measureText2);
            int length = str2.length();
            int i28 = 0;
            while (i28 < length) {
                int i29 = i28 + 1;
                f27 += paint.measureText(str2, i28, i29);
                if (f27 > f28) {
                    break;
                }
                i28 = i29;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String substring = str2.substring(0, i28);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            sb6.append(substring);
            sb6.append("...");
            sb6.append(str);
            return sb6.toString();
        }
        java.lang.String substring2 = str2.substring(max);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        java.lang.String str3 = "..." + substring2 + str;
        float measureText3 = f18 - paint.measureText(str3);
        java.lang.String substring3 = str2.substring(0, max);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring3, "substring(...)");
        int length2 = substring3.length();
        int i37 = 0;
        while (i37 < length2) {
            int i38 = i37 + 1;
            f27 += paint.measureText(substring3, i37, i38);
            if (f27 > measureText3) {
                break;
            }
            i37 = i38;
        }
        if (z18 && i37 > 0 && i37 < substring3.length()) {
            int i39 = i37 - 1;
            char charAt = substring3.charAt(i39);
            char charAt2 = substring3.charAt(i37);
            if (!r26.a.b(charAt) && !r26.a.b(charAt2) && (O = r26.n0.O(substring3, ' ', i39, false, 4, null)) > 0) {
                int i47 = O + 1;
                java.lang.String substring4 = substring3.substring(0, i47);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring4, "substring(...)");
                if (paint.measureText(substring4) >= f19) {
                    i37 = i47;
                }
            }
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.lang.String substring5 = substring3.substring(0, i37);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring5, "substring(...)");
        sb7.append(substring5);
        sb7.append(str3);
        return sb7.toString();
    }
}

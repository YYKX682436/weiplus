package zy2;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final zy2.p f559059a = new zy2.p();

    public final java.lang.CharSequence a(java.lang.String text, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (i17 <= 1) {
            return text;
        }
        java.lang.String d17 = d(i17);
        if ((d17.length() == 0) || !r26.i0.n(text, d17, false)) {
            return text;
        }
        int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        if (dimensionPixelSize < 1) {
            dimensionPixelSize = 1;
        }
        android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(0);
        colorDrawable.setBounds(0, 0, dimensionPixelSize, 0);
        java.lang.String substring = text.substring(0, text.length() - d17.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(substring + ' ' + d17);
        int length = substring.length();
        spannableString.setSpan(new android.text.style.ImageSpan(colorDrawable, 1), length, length + 1, 33);
        return spannableString;
    }

    public final java.lang.String b(java.util.List list, int i17, float f17, android.text.TextPaint paint) {
        float f18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.String c17 = c(list);
        java.lang.String d17 = d(i17);
        java.lang.String concat = c17.concat(d17);
        if (d17.length() > 0) {
            int dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
            f18 = dimensionPixelSize >= 1 ? dimensionPixelSize : 1;
        } else {
            f18 = 0.0f;
        }
        float f19 = f17 - f18;
        if (f19 < 0.0f) {
            f19 = 0.0f;
        }
        if (paint.measureText(concat) <= f19) {
            return concat;
        }
        float measureText = f19 - paint.measureText("…".concat(d17));
        if (measureText <= 0.0f) {
            return "…".concat(d17);
        }
        float measureText2 = c17.length() > 0 ? paint.measureText(c17) / c17.length() : 0.0f;
        int f27 = measureText2 > 0.0f ? e06.p.f((int) (measureText / measureText2), 0, c17.length()) : 0;
        int length = c17.length();
        if (f27 > length) {
            f27 = length;
        }
        if (f27 < c17.length() && paint.measureText(c17, 0, f27) <= measureText) {
            f27 = c17.length();
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 <= f27) {
            int i27 = ((f27 - i18) / 2) + i18;
            if (paint.measureText(c17, 0, i27) > measureText) {
                if (i27 == 0) {
                    break;
                }
                f27 = i27 - 1;
            } else {
                i18 = i27 + 1;
                i19 = i27;
            }
        }
        if (i19 == 0) {
            return "…".concat(d17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = c17.substring(0, i19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append((char) 8230);
        sb6.append(d17);
        return sb6.toString();
    }

    public final java.lang.String c(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oq6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return kz5.n0.g0(list, string, null, null, 0, null, zy2.o.f559036d, 30, null);
    }

    public final java.lang.String d(int i17) {
        if (i17 <= 1) {
            return "";
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oqm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}

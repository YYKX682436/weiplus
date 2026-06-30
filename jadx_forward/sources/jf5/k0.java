package jf5;

/* loaded from: classes11.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f381010a = {8203, 8288};

    public static final int a(java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        return str.codePointCount(0, e06.p.f(i17, 0, str.length()));
    }

    public static final int b(java.lang.String str, int i17) {
        int codePointCount;
        int f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<this>");
        if (i17 <= 0) {
            return 0;
        }
        if ((str.length() == 0) || (f17 = e06.p.f(i17, 0, (codePointCount = str.codePointCount(0, str.length())))) == 0) {
            return 0;
        }
        return f17 == codePointCount ? str.length() : str.offsetByCodePoints(0, f17);
    }

    public static final android.widget.TextView c(android.widget.TextView textView, yz5.l configure) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configure, "configure");
        java.lang.Object tag = textView.getTag(com.p314xaae8f345.mm.R.id.vcc);
        java.lang.Object obj = tag instanceof jf5.f0 ? (jf5.f0) tag : null;
        jf5.j0 j0Var = obj instanceof jf5.j0 ? (jf5.j0) obj : null;
        if (j0Var == null) {
            j0Var = new jf5.j0(textView);
            textView.setTag(com.p314xaae8f345.mm.R.id.vcc, j0Var);
        }
        configure.mo146xb9724478(j0Var.f381008b);
        return textView;
    }

    public static final java.util.List d(android.text.Spanned spanned, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanned, "<this>");
        java.lang.Object[] spans = spanned.getSpans(i17, i18, jf5.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(spans, "getSpans(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : spans) {
            jf5.k kVar = (jf5.k) obj;
            if (spanned.getSpanStart(kVar) < i18 && spanned.getSpanEnd(kVar) > i17) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean e(char c17) {
        int type;
        return c17 == '\n' || r26.a.b(c17) || kz5.z.E(f381010a, c17) || c17 == 65532 || (type = java.lang.Character.getType(c17)) == 0 || type == 15 || type == 16 || type == 18 || type == 19;
    }

    public static final boolean f(v11.s sVar) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<this>");
        int i18 = sVar.f513991a;
        return (i18 >= 0 && i18 <= sVar.f513992b) && (i17 = sVar.f513993c) >= 0 && sVar.f513994d >= i17;
    }
}

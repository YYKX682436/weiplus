package j2;

/* loaded from: classes14.dex */
public abstract class e {
    public static final float a(long j17, float f17, p2.f fVar) {
        long b17 = p2.t.b(j17);
        if (p2.v.a(b17, 4294967296L)) {
            return fVar.H(j17);
        }
        if (p2.v.a(b17, 8589934592L)) {
            return p2.t.c(j17) * f17;
        }
        return Float.NaN;
    }

    public static final void b(android.text.Spannable setBackground, long j17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setBackground, "$this$setBackground");
        int i19 = e1.y.f327854l;
        if (j17 != e1.y.f327853k) {
            e(setBackground, new android.text.style.BackgroundColorSpan(e1.a0.h(j17)), i17, i18);
        }
    }

    public static final void c(android.text.Spannable setColor, long j17, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setColor, "$this$setColor");
        int i19 = e1.y.f327854l;
        if (j17 != e1.y.f327853k) {
            e(setColor, new android.text.style.ForegroundColorSpan(e1.a0.h(j17)), i17, i18);
        }
    }

    public static final void d(android.text.Spannable setFontSize, long j17, p2.f density, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setFontSize, "$this$setFontSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        long b17 = p2.t.b(j17);
        if (p2.v.a(b17, 4294967296L)) {
            e(setFontSize, new android.text.style.AbsoluteSizeSpan(a06.d.b(density.H(j17)), false), i17, i18);
        } else if (p2.v.a(b17, 8589934592L)) {
            e(setFontSize, new android.text.style.RelativeSizeSpan(p2.t.c(j17)), i17, i18);
        }
    }

    public static final void e(android.text.Spannable spannable, java.lang.Object span, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spannable, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(span, "span");
        spannable.setSpan(span, i17, i18, 33);
    }
}

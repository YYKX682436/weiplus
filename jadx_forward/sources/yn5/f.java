package yn5;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f545554a;

    /* renamed from: b, reason: collision with root package name */
    public final long f545555b;

    /* renamed from: c, reason: collision with root package name */
    public final long f545556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f545557d;

    /* renamed from: e, reason: collision with root package name */
    public final int f545558e;

    /* renamed from: f, reason: collision with root package name */
    public final int f545559f;

    /* renamed from: g, reason: collision with root package name */
    public final float f545560g;

    /* renamed from: h, reason: collision with root package name */
    public final float f545561h;

    public f(long j17, long j18, long j19, int i17, int i18, int i19, float f17, float f18) {
        this.f545554a = j17;
        this.f545555b = j18;
        this.f545556c = j19;
        this.f545557d = i17;
        this.f545558e = i18;
        this.f545559f = i19;
        this.f545560g = f17;
        this.f545561h = f18;
    }

    /* renamed from: toString */
    public java.lang.String m177418x9616526c() {
        float f17 = 100;
        java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(this.f545560g * f17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        java.lang.String format2 = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(this.f545561h * f17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format2, "format(...)");
        return "totalInflateCost:" + this.f545554a + "  asyncInflateCost:" + this.f545555b + " mainThreadInflateCost:" + this.f545556c + " asyncCostRatio:" + format + "% \n totalInflateCount:" + this.f545557d + " asyncInflateCount:" + this.f545558e + " mainThreadInflateCount:" + this.f545559f + " asyncCountRatio:" + format2 + '%';
    }
}

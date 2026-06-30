package q1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final q1.e f441021e;

    /* renamed from: a, reason: collision with root package name */
    public final long f441022a;

    /* renamed from: b, reason: collision with root package name */
    public final float f441023b;

    /* renamed from: c, reason: collision with root package name */
    public final long f441024c;

    /* renamed from: d, reason: collision with root package name */
    public final long f441025d;

    static {
        long j17 = d1.e.f307156b;
        f441021e = new q1.e(j17, 1.0f, 0L, j17, null);
    }

    public e(long j17, float f17, long j18, long j19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f441022a = j17;
        this.f441023b = f17;
        this.f441024c = j18;
        this.f441025d = j19;
    }

    /* renamed from: equals */
    public boolean m159261xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1.e)) {
            return false;
        }
        q1.e eVar = (q1.e) obj;
        return d1.e.a(this.f441022a, eVar.f441022a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f441023b), java.lang.Float.valueOf(eVar.f441023b)) && this.f441024c == eVar.f441024c && d1.e.a(this.f441025d, eVar.f441025d);
    }

    /* renamed from: hashCode */
    public int m159262x8cdac1b() {
        int i17 = d1.e.f307159e;
        return (((((java.lang.Long.hashCode(this.f441022a) * 31) + java.lang.Float.hashCode(this.f441023b)) * 31) + java.lang.Long.hashCode(this.f441024c)) * 31) + java.lang.Long.hashCode(this.f441025d);
    }

    /* renamed from: toString */
    public java.lang.String m159263x9616526c() {
        return "VelocityEstimate(pixelsPerSecond=" + ((java.lang.Object) d1.e.h(this.f441022a)) + ", confidence=" + this.f441023b + ", durationMillis=" + this.f441024c + ", offset=" + ((java.lang.Object) d1.e.h(this.f441025d)) + ')';
    }
}

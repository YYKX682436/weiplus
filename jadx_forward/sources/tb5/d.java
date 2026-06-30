package tb5;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public float f498571a;

    /* renamed from: b, reason: collision with root package name */
    public float f498572b;

    /* renamed from: c, reason: collision with root package name */
    public float f498573c;

    /* renamed from: d, reason: collision with root package name */
    public long f498574d;

    public d(float f17, float f18, float f19, long j17) {
        this.f498571a = f17;
        this.f498572b = f18;
        this.f498573c = f19;
        this.f498574d = j17;
    }

    public static tb5.d a(tb5.d dVar, float f17, float f18, float f19, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            f17 = dVar.f498571a;
        }
        if ((i17 & 2) != 0) {
            f18 = dVar.f498572b;
        }
        float f27 = f18;
        if ((i17 & 4) != 0) {
            f19 = dVar.f498573c;
        }
        float f28 = f19;
        if ((i17 & 8) != 0) {
            j17 = dVar.f498574d;
        }
        dVar.getClass();
        return new tb5.d(f17, f27, f28, j17);
    }

    /* renamed from: equals */
    public boolean m166114xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5.d)) {
            return false;
        }
        tb5.d dVar = (tb5.d) obj;
        return java.lang.Float.compare(this.f498571a, dVar.f498571a) == 0 && java.lang.Float.compare(this.f498572b, dVar.f498572b) == 0 && java.lang.Float.compare(this.f498573c, dVar.f498573c) == 0 && this.f498574d == dVar.f498574d;
    }

    /* renamed from: hashCode */
    public int m166115x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f498571a) * 31) + java.lang.Float.hashCode(this.f498572b)) * 31) + java.lang.Float.hashCode(this.f498573c)) * 31) + java.lang.Long.hashCode(this.f498574d);
    }

    /* renamed from: toString */
    public java.lang.String m166116x9616526c() {
        return "FpsInfo(fps=" + this.f498571a + ", refresh=" + this.f498572b + ", sensitivity=" + this.f498573c + ", animTime=" + this.f498574d + ')';
    }

    public /* synthetic */ d(float f17, float f18, float f19, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 0.0f : f17, (i17 & 2) != 0 ? 0.0f : f18, (i17 & 4) == 0 ? f19 : 0.0f, (i17 & 8) != 0 ? 0L : j17);
    }
}

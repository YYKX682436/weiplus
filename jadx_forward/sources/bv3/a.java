package bv3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f106253a;

    /* renamed from: b, reason: collision with root package name */
    public final long f106254b;

    /* renamed from: c, reason: collision with root package name */
    public final long f106255c;

    /* renamed from: d, reason: collision with root package name */
    public final float f106256d;

    public a(java.lang.String path, long j17, long j18, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f106253a = path;
        this.f106254b = j17;
        this.f106255c = j18;
        this.f106256d = f17;
    }

    /* renamed from: equals */
    public boolean m11383xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv3.a)) {
            return false;
        }
        bv3.a aVar = (bv3.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106253a, aVar.f106253a) && this.f106254b == aVar.f106254b && this.f106255c == aVar.f106255c && java.lang.Float.compare(this.f106256d, aVar.f106256d) == 0;
    }

    /* renamed from: hashCode */
    public int m11384x8cdac1b() {
        return (((((this.f106253a.hashCode() * 31) + java.lang.Long.hashCode(this.f106254b)) * 31) + java.lang.Long.hashCode(this.f106255c)) * 31) + java.lang.Float.hashCode(this.f106256d);
    }

    /* renamed from: toString */
    public java.lang.String m11385x9616526c() {
        return "EditRenderScript(path=" + this.f106253a + ", startMs=" + this.f106254b + ", endMS=" + this.f106255c + ", playRate=" + this.f106256d + ')';
    }
}

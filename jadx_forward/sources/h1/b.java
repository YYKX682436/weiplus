package h1;

/* loaded from: classes14.dex */
public final class b extends h1.c {

    /* renamed from: i, reason: collision with root package name */
    public final long f359481i;

    /* renamed from: n, reason: collision with root package name */
    public e1.z f359483n;

    /* renamed from: m, reason: collision with root package name */
    public float f359482m = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    public final long f359484o = d1.k.f307175c;

    public b(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f359481i = j17;
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f359482m = f17;
        return true;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f359483n = zVar;
        return true;
    }

    /* renamed from: equals */
    public boolean m132625xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1.b) {
            return e1.y.c(this.f359481i, ((h1.b) obj).f359481i);
        }
        return false;
    }

    @Override // h1.c
    public long h() {
        return this.f359484o;
    }

    /* renamed from: hashCode */
    public int m132626x8cdac1b() {
        int i17 = e1.y.f327854l;
        return java.lang.Long.hashCode(this.f359481i);
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar, "<this>");
        g1.h.h(iVar, this.f359481i, 0L, 0L, this.f359482m, null, this.f359483n, 0, 86, null);
    }

    /* renamed from: toString */
    public java.lang.String m132627x9616526c() {
        return "ColorPainter(color=" + ((java.lang.Object) e1.y.i(this.f359481i)) + ')';
    }
}

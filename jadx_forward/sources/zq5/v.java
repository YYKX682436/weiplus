package zq5;

/* loaded from: classes15.dex */
public final class v {

    /* renamed from: f, reason: collision with root package name */
    public static final zq5.v f556627f;

    /* renamed from: a, reason: collision with root package name */
    public final long f556628a;

    /* renamed from: b, reason: collision with root package name */
    public final long f556629b;

    /* renamed from: c, reason: collision with root package name */
    public final float f556630c;

    /* renamed from: d, reason: collision with root package name */
    public final long f556631d;

    /* renamed from: e, reason: collision with root package name */
    public final long f556632e;

    static {
        long a17 = zq5.s.a(1.0f, 1.0f);
        long j17 = zq5.l.f556610b;
        zq5.x xVar = zq5.y.f556633b;
        f556627f = new zq5.v(a17, j17, 0.0f, zq5.a0.b(xVar), zq5.a0.b(xVar), null);
    }

    public v(long j17, long j18, float f17, long j19, long j27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f556628a = j17;
        this.f556629b = j18;
        this.f556630c = f17;
        this.f556631d = j19;
        this.f556632e = j27;
        if (j17 != zq5.q.f556620c) {
            if (!(j18 != zq5.l.f556611c)) {
                throw new java.lang.IllegalArgumentException("offset must be specified".toString());
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("scale must be specified".toString());
    }

    public final zq5.v a(long j17, long j18, float f17, long j19, long j27) {
        return new zq5.v(j17, j18, f17, j19, j27, null);
    }

    public final float c() {
        return zq5.q.b(this.f556628a);
    }

    /* renamed from: equals */
    public boolean m179347xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.v)) {
            return false;
        }
        zq5.v vVar = (zq5.v) obj;
        if (zq5.q.a(this.f556628a, vVar.f556628a)) {
            return ((this.f556629b > vVar.f556629b ? 1 : (this.f556629b == vVar.f556629b ? 0 : -1)) == 0) && java.lang.Float.compare(this.f556630c, vVar.f556630c) == 0 && zq5.y.a(this.f556631d, vVar.f556631d) && zq5.y.a(this.f556632e, vVar.f556632e);
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m179348x8cdac1b() {
        zq5.p pVar = zq5.q.f556619b;
        int hashCode = java.lang.Long.hashCode(this.f556628a) * 31;
        int i17 = zq5.l.f556612d;
        int hashCode2 = (((hashCode + java.lang.Long.hashCode(this.f556629b)) * 31) + java.lang.Float.hashCode(this.f556630c)) * 31;
        zq5.x xVar = zq5.y.f556633b;
        return ((hashCode2 + java.lang.Long.hashCode(this.f556631d)) * 31) + java.lang.Long.hashCode(this.f556632e);
    }

    /* renamed from: toString */
    public java.lang.String m179349x9616526c() {
        return "TransformCompat(scale=" + zq5.s.d(this.f556628a) + ", offset=" + zq5.m.e(this.f556629b) + ", rotation=" + this.f556630c + ", scaleOrigin=" + zq5.a0.c(this.f556631d) + ", rotationOrigin=" + zq5.a0.c(this.f556632e) + ')';
    }

    public /* synthetic */ v(long j17, long j18, float f17, long j19, long j27, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, j18, (i17 & 4) != 0 ? 0.0f : f17, (i17 & 8) != 0 ? zq5.a0.b(zq5.y.f556633b) : j19, (i17 & 16) != 0 ? zq5.a0.b(zq5.y.f556633b) : j27, null);
    }
}

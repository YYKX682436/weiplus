package l0;

/* loaded from: classes14.dex */
public final class x implements l0.b3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f396120a;

    /* renamed from: b, reason: collision with root package name */
    public final long f396121b;

    /* renamed from: c, reason: collision with root package name */
    public final long f396122c;

    /* renamed from: d, reason: collision with root package name */
    public final long f396123d;

    /* renamed from: e, reason: collision with root package name */
    public final long f396124e;

    /* renamed from: f, reason: collision with root package name */
    public final long f396125f;

    /* renamed from: g, reason: collision with root package name */
    public final long f396126g;

    /* renamed from: h, reason: collision with root package name */
    public final long f396127h;

    public x(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f396120a = j17;
        this.f396121b = j18;
        this.f396122c = j19;
        this.f396123d = j27;
        this.f396124e = j28;
        this.f396125f = j29;
        this.f396126g = j37;
        this.f396127h = j38;
    }

    /* renamed from: equals */
    public boolean m144767xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(l0.x.class), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(obj.getClass()))) {
            return false;
        }
        l0.x xVar = (l0.x) obj;
        return e1.y.c(this.f396120a, xVar.f396120a) && e1.y.c(this.f396121b, xVar.f396121b) && e1.y.c(this.f396122c, xVar.f396122c) && e1.y.c(this.f396123d, xVar.f396123d) && e1.y.c(this.f396124e, xVar.f396124e) && e1.y.c(this.f396125f, xVar.f396125f) && e1.y.c(this.f396126g, xVar.f396126g) && e1.y.c(this.f396127h, xVar.f396127h);
    }

    /* renamed from: hashCode */
    public int m144768x8cdac1b() {
        int i17 = e1.y.f327854l;
        return (((((((((((((java.lang.Long.hashCode(this.f396120a) * 31) + java.lang.Long.hashCode(this.f396121b)) * 31) + java.lang.Long.hashCode(this.f396122c)) * 31) + java.lang.Long.hashCode(this.f396123d)) * 31) + java.lang.Long.hashCode(this.f396124e)) * 31) + java.lang.Long.hashCode(this.f396125f)) * 31) + java.lang.Long.hashCode(this.f396126g)) * 31) + java.lang.Long.hashCode(this.f396127h);
    }
}

package nu3;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f421720a;

    /* renamed from: b, reason: collision with root package name */
    public final long f421721b;

    /* renamed from: c, reason: collision with root package name */
    public final long f421722c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f421723d;

    /* renamed from: e, reason: collision with root package name */
    public final long f421724e;

    public b(long j17, long j18, long j19, java.lang.String fileFormat, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileFormat, "fileFormat");
        this.f421720a = j17;
        this.f421721b = j18;
        this.f421722c = j19;
        this.f421723d = fileFormat;
        this.f421724e = j27;
    }

    public cl0.g a() {
        cl0.g gVar = new cl0.g();
        java.lang.Long valueOf = java.lang.Long.valueOf(d());
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            gVar.p("file_size", valueOf.longValue());
        }
        java.lang.Long valueOf2 = java.lang.Long.valueOf(f());
        if (!(valueOf2.longValue() > 0)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            gVar.p("width", valueOf2.longValue());
        }
        java.lang.Long valueOf3 = java.lang.Long.valueOf(e());
        if (!(valueOf3.longValue() > 0)) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            gVar.p("height", valueOf3.longValue());
        }
        java.lang.String c17 = c();
        if (!(c17.length() > 0)) {
            c17 = null;
        }
        if (c17 != null) {
            gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15, c17);
        }
        java.lang.Long valueOf4 = java.lang.Long.valueOf(b());
        java.lang.Long l17 = valueOf4.longValue() > 0 ? valueOf4 : null;
        if (l17 != null) {
            gVar.p("duration", l17.longValue());
        }
        return gVar;
    }

    public long b() {
        return this.f421724e;
    }

    public java.lang.String c() {
        return this.f421723d;
    }

    public long d() {
        return this.f421720a;
    }

    public long e() {
        return this.f421722c;
    }

    public long f() {
        return this.f421721b;
    }

    public final java.lang.String g() {
        java.lang.String gVar = a().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return r26.i0.u(gVar, ',', ';', false, 4, null);
    }

    public /* synthetic */ b(long j17, long j18, long j19, java.lang.String str, long j27, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? 0L : j17, (i17 & 2) != 0 ? 0L : j18, (i17 & 4) != 0 ? 0L : j19, (i17 & 8) != 0 ? "" : str, (i17 & 16) == 0 ? j27 : 0L);
    }
}

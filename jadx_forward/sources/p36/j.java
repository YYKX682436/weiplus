package p36;

/* loaded from: classes16.dex */
public final class j extends l36.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f433267d;

    /* renamed from: e, reason: collision with root package name */
    public final long f433268e;

    /* renamed from: f, reason: collision with root package name */
    public final x36.m f433269f;

    public j(java.lang.String str, long j17, x36.m mVar) {
        this.f433267d = str;
        this.f433268e = j17;
        this.f433269f = mVar;
    }

    @Override // l36.c1
    public long a() {
        return this.f433268e;
    }

    @Override // l36.c1
    public l36.n0 b() {
        java.lang.String str = this.f433267d;
        if (str == null) {
            return null;
        }
        try {
            return l36.n0.a(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // l36.c1
    public x36.m c() {
        return this.f433269f;
    }
}

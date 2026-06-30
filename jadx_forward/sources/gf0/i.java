package gf0;

/* loaded from: classes15.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final double f352737a;

    /* renamed from: b, reason: collision with root package name */
    public final double f352738b;

    /* renamed from: c, reason: collision with root package name */
    public long f352739c;

    /* renamed from: d, reason: collision with root package name */
    public long f352740d;

    /* renamed from: e, reason: collision with root package name */
    public gf0.e f352741e;

    /* renamed from: g, reason: collision with root package name */
    public kf1.h f352743g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f352744h;

    /* renamed from: i, reason: collision with root package name */
    public f25.m0 f352745i;

    /* renamed from: j, reason: collision with root package name */
    public int f352746j;

    /* renamed from: k, reason: collision with root package name */
    public double f352747k;

    /* renamed from: l, reason: collision with root package name */
    public double f352748l;

    /* renamed from: n, reason: collision with root package name */
    public int f352750n;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f352742f = "";

    /* renamed from: m, reason: collision with root package name */
    public double f352749m = Double.MAX_VALUE;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f352751o = "";

    public i(double d17, double d18, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C25174x440e05d6 c25174x440e05d6) {
        this.f352737a = d17;
        this.f352738b = d18;
    }

    public final void a() {
        f25.m0 m0Var = this.f352745i;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            this.f352745i = null;
        }
    }

    public final double b() {
        long j17 = this.f352739c;
        if (j17 <= 0) {
            return 0.0d;
        }
        long j18 = this.f352740d;
        if (j18 <= 0 || j18 <= j17) {
            return 0.0d;
        }
        return (j18 - j17) / 1000.0d;
    }

    public final java.lang.String c(int i17, boolean z17) {
        java.lang.String c17 = com.p314xaae8f345.mm.vfs.q7.c("TingAudioCache");
        if (c17 == null) {
            c17 = "";
        }
        java.lang.String concat = c17.concat("/TingAudioRecord/UploadTemp/");
        if (!com.p314xaae8f345.mm.vfs.w6.j(concat)) {
            com.p314xaae8f345.mm.vfs.w6.u(concat);
        }
        if (!z17) {
            return concat + i17 + ".mp3";
        }
        java.lang.String i18 = com.p314xaae8f345.mm.vfs.w6.i(concat + i17 + ".mp3", true);
        return i18 == null ? "" : i18;
    }
}

package yv1;

/* loaded from: classes12.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f547537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.i0 f547538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f547539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw1.f f547540g;

    public c0(java.lang.String[] strArr, yv1.i0 i0Var, long j17, bw1.f fVar) {
        this.f547537d = strArr;
        this.f547538e = i0Var;
        this.f547539f = j17;
        this.f547540g = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Start CleanAppBrand task");
        yv1.h1.g(1, null, 2, null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).Aa(kz5.v.f(this.f547537d));
        yv1.g1 g1Var = this.f547538e.f547602a;
        if (g1Var != null) {
            long j17 = this.f547539f;
            synchronized (g1Var) {
                g1Var.f547577c -= j17;
                g1Var.f547578d -= j17;
                long[] jArr = g1Var.f547586l;
                jArr[6] = jArr[6] - j17;
            }
        }
        this.f547538e.f547617p.B("clean_cache_appbrand2", this.f547539f);
        yv1.i0 i0Var = this.f547538e;
        long j18 = this.f547539f;
        synchronized (i0Var) {
            i0Var.f547607f += j18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "CleanAppBrand task done");
        this.f547540g.a(jz5.f0.f384359a);
        yv1.i0.e(this.f547538e, true, false, 2, null);
    }
}

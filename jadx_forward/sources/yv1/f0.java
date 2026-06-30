package yv1;

/* loaded from: classes12.dex */
public final class f0 implements aw1.w {

    /* renamed from: a, reason: collision with root package name */
    public long f547559a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f547560b = new long[21];

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f547561c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv1.i0 f547562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long[] f547563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw1.f f547564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f547565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f547566h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f547567i;

    public f0(long j17, yv1.i0 i0Var, long[] jArr, bw1.f fVar, int i17, java.util.Set set, byte[] bArr) {
        this.f547561c = j17;
        this.f547562d = i0Var;
        this.f547563e = jArr;
        this.f547564f = fVar;
        this.f547565g = i17;
        this.f547566h = set;
        this.f547567i = bArr;
    }

    @Override // aw1.w
    public void a(int i17, long j17) {
        yv1.h1.g(2, null, 2, null);
        long j18 = j17 - this.f547559a;
        yv1.i0 i0Var = this.f547562d;
        synchronized (i0Var) {
            i0Var.f547607f += j18;
        }
        yv1.g1 g1Var = this.f547562d.f547602a;
        if (g1Var != null) {
            long[] jArr = this.f547563e;
            synchronized (g1Var) {
                g1Var.f547577c -= j18;
                g1Var.f547578d -= j18;
                for (int i18 = 0; i18 < 21; i18++) {
                    long[] jArr2 = g1Var.f547586l;
                    jArr2[i18] = jArr2[i18] - (jArr[i18] - this.f547560b[i18]);
                }
            }
        }
        yv1.i0.e(this.f547562d, false, false, 2, null);
        this.f547559a = j17;
        kz5.v.o(this.f547563e, this.f547560b, 0, 0, 0, 14, null);
    }

    @Override // aw1.w
    public void b(boolean z17, long j17, int i17) {
        int i18;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d c5156x300e729d = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5156x300e729d();
        int i19 = this.f547565g;
        am.l lVar = c5156x300e729d.f135505g;
        lVar.f88735a = i19;
        lVar.f88736b = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "triggering AggressiveCleanCacheEvent with groupFlags " + c5156x300e729d.f135505g.f88735a);
        c5156x300e729d.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", "Done AggressiveCleanCacheEvent");
        long j18 = (z17 ? j17 : this.f547561c) - this.f547559a;
        yv1.i0 i0Var = this.f547562d;
        synchronized (i0Var) {
            i0Var.f547607f += j18;
        }
        yv1.g1 g1Var = this.f547562d.f547602a;
        if (g1Var != null) {
            long[] jArr = this.f547563e;
            java.util.Set set = this.f547566h;
            byte[] bArr = this.f547567i;
            synchronized (g1Var) {
                g1Var.f547577c -= j18;
                g1Var.f547578d -= j18;
                for (int i27 = 0; i27 < 21; i27++) {
                    long[] jArr2 = g1Var.f547586l;
                    jArr2[i27] = jArr2[i27] - (jArr[i27] - this.f547560b[i27]);
                }
                if (!z17) {
                    for (0; i18 < 21; i18 + 1) {
                        if (i18 == 6) {
                            i18 = !set.isEmpty() ? i18 + 1 : 0;
                        }
                        if (bArr[i18] < Byte.MAX_VALUE) {
                            g1Var.f547586l[i18] = 0;
                        }
                    }
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("4:");
        long[] jArr3 = this.f547563e;
        sb6.append(jArr3[10] + jArr3[11]);
        sb6.append("#6:");
        sb6.append(this.f547563e[8]);
        sb6.append("#7:");
        sb6.append(this.f547563e[9]);
        sb6.append("#8:");
        sb6.append(this.f547563e[17]);
        sb6.append("#9:");
        sb6.append(this.f547563e[7]);
        sb6.append("#10:");
        sb6.append(this.f547563e[4]);
        sb6.append("#11:");
        sb6.append(this.f547563e[19]);
        sb6.append("#12:");
        sb6.append(this.f547563e[18]);
        sb6.append("#13:");
        long[] jArr4 = this.f547563e;
        sb6.append(jArr4[0] + jArr4[2] + jArr4[3] + jArr4[16]);
        sb6.append("#14:");
        sb6.append(this.f547563e[5]);
        sb6.append("#15:");
        sb6.append(this.f547563e[15]);
        this.f547562d.f547617p.D("clean_cache_typed_deleted_size", sb6.toString());
        this.f547562d.f547617p.B("clean_cache_appbrand1", this.f547563e[6]);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Clean cache: FileSystem stage ");
        sb7.append(z17 ? "cancelled" : "done");
        sb7.append('.');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanService", sb7.toString());
        this.f547564f.a(jz5.f0.f384359a);
        yv1.i0.e(this.f547562d, true, false, 2, null);
    }
}

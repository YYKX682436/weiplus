package com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0;

/* loaded from: classes12.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a f178410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f178412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f178413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178414h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178415i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178416m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long[] f178417n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long[] f178418o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f178419p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f178420q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178421r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 f178422s;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0 e0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar, java.lang.String str, boolean z17, com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str2, java.lang.String str3, java.lang.String str4, long[] jArr, long[] jArr2, int i17, java.lang.String[] strArr, java.lang.String str5) {
        this.f178422s = e0Var;
        this.f178410d = aVar;
        this.f178411e = str;
        this.f178412f = z17;
        this.f178413g = c26948xabb259c7;
        this.f178414h = str2;
        this.f178415i = str3;
        this.f178416m = str4;
        this.f178417n = jArr;
        this.f178418o = jArr2;
        this.f178419p = i17;
        this.f178420q = strArr;
        this.f178421r = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        int i17;
        int i18;
        char c17;
        java.lang.String str;
        if (!this.f178422s.f178378g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar = this.f178410d;
            if (aVar != null) {
                aVar.mo54660x57429edc(1);
                return;
            }
            return;
        }
        this.f178422s.f178375d = null;
        try {
            try {
                long nanoTime = java.lang.System.nanoTime();
                byte[] h17 = kk.k.h((wo.w0.g(true) + gm0.j1.b().h()).getBytes());
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f178411e);
                if (!this.f178412f || !r6Var.m()) {
                    boolean m107994x35c17d = com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26986x49fedfe9.MasterInfo.m107994x35c17d(this.f178413g, kk.w.a(this.f178414h, true), h17);
                    com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(this.f178414h);
                    if (m107994x35c17d) {
                        r6Var.l();
                        m107994x35c17d = r6Var2.L(r6Var);
                    } else {
                        r6Var2.l();
                    }
                    long nanoTime2 = java.lang.System.nanoTime() - nanoTime;
                    java.lang.Object[] objArr = new java.lang.Object[2];
                    objArr[0] = m107994x35c17d ? "SUCCEEDED" : "FAILED";
                    objArr[1] = java.lang.Float.valueOf(((float) nanoTime2) / 1.0E9f);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Master table backup %s, elapsed %.3f", objArr);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(181L, m107994x35c17d ? 24L : 25L, 1L, false);
                }
                com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(this.f178415i);
                java.lang.String str2 = a17.f294812f;
                if (str2 != null) {
                    java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                    if (!a17.f294812f.equals(l17)) {
                        a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                if (m17.a()) {
                    com.p314xaae8f345.mm.vfs.x1 m18 = m17.f294799a.m(m17.f294800b);
                    j17 = m18 == null ? 0L : m18.f294766c;
                } else {
                    j17 = 0;
                }
                com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(this.f178416m);
                java.lang.String str3 = a18.f294812f;
                if (str3 != null) {
                    java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                    if (!a18.f294812f.equals(l18)) {
                        a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                    }
                }
                com.p314xaae8f345.mm.vfs.z2 m19 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
                if (m19.a()) {
                    com.p314xaae8f345.mm.vfs.x1 m27 = m19.f294799a.m(m19.f294800b);
                    j18 = m27 == null ? 0L : m27.f294766c;
                } else {
                    j18 = 0;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                java.lang.String str4 = "incremental";
                objArr2[0] = this.f178412f ? "incremental" : "new";
                long[] jArr = this.f178417n;
                objArr2[1] = java.lang.Long.valueOf(jArr != null ? jArr[0] : 0L);
                objArr2[2] = java.lang.Long.valueOf(this.f178418o[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Backup started [%s, cursor: %d ~ %d]", objArr2);
                int i19 = this.f178412f ? 10011 : 10000;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                g0Var.d(11098, java.lang.Integer.valueOf(i19), java.lang.String.format("%d|%d|%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), this.f178422s.f178380i.format(new java.util.Date())));
                this.f178422s.f178375d = new com.p314xaae8f345.p3121x37984a.p3129xc84c1f8d.C26983xc83ae194(this.f178413g, this.f178416m, h17, this.f178419p, this.f178420q);
                int run = this.f178422s.f178375d.run();
                long nanoTime3 = java.lang.System.nanoTime() - nanoTime;
                com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(this.f178416m);
                long C = r6Var3.C();
                if (run == 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.e0.wi(this.f178422s, this.f178415i, this.f178418o);
                    com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(this.f178421r);
                    r6Var4.l();
                    r6Var3.L(r6Var4);
                    if (this.f178412f) {
                        i17 = 10012;
                        i18 = 19;
                    } else {
                        i17 = 10001;
                        i18 = 16;
                    }
                } else {
                    r6Var3.l();
                    if (run == 1) {
                        if (this.f178412f) {
                            i17 = 10013;
                            i18 = 20;
                        } else {
                            i17 = 10002;
                            i18 = 17;
                        }
                    } else if (this.f178412f) {
                        i17 = 10014;
                        i18 = 21;
                    } else {
                        i17 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
                        i18 = 18;
                    }
                }
                java.lang.Object[] objArr3 = new java.lang.Object[3];
                if (!this.f178412f) {
                    str4 = "new";
                }
                objArr3[0] = str4;
                if (run == 0) {
                    str = "succeeded";
                    c17 = 1;
                } else {
                    c17 = 1;
                    str = run == 1 ? "canceled" : com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d;
                }
                objArr3[c17] = str;
                objArr3[2] = java.lang.Float.valueOf(((float) nanoTime3) / 1.0E9f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreDBBackup", "Database %s backup %s, elapsed %.2f seconds.", objArr3);
                g0Var.mo68477x336bdfd8(181L, i18, 1L, false);
                g0Var.d(11098, java.lang.Integer.valueOf(i17), java.lang.String.format("%d|%d|%d|%d|%d|%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(C), java.lang.Integer.valueOf(this.f178422s.f178375d.m107928xeea8c4e0()), java.lang.Long.valueOf(nanoTime3 / 1000000), this.f178422s.f178380i.format(new java.util.Date())));
                com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar2 = this.f178410d;
                if (aVar2 != null) {
                    aVar2.mo54660x57429edc(run);
                }
                this.f178422s.f178375d.m107927x41012807();
                this.f178422s.f178375d = null;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb6.append(gm0.j1.u().d());
                sb6.append("dbback");
                com.p314xaae8f345.mm.vfs.w6.u(sb6.toString());
                java.lang.String str5 = this.f178411e;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                gm0.j1.i();
                sb7.append(gm0.j1.u().d());
                sb7.append("dbback/EnMicroMsg.db.sm");
                com.p314xaae8f345.mm.vfs.w6.c(str5, sb7.toString());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreDBBackup", e17, "Failed to start database backup, path: %s", this.f178415i);
                com.p314xaae8f345.mm.p1006xc5476f33.p1356x80d8abc0.a aVar3 = this.f178410d;
                if (aVar3 != null) {
                    aVar3.mo54660x57429edc(-1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(181L, this.f178412f ? 18L : 21L, 1L, false);
                if (this.f178422s.f178375d != null) {
                    this.f178422s.f178375d.m107927x41012807();
                    this.f178422s.f178375d = null;
                }
            }
        } finally {
            if (this.f178422s.f178375d != null) {
                this.f178422s.f178375d.m107927x41012807();
                this.f178422s.f178375d = null;
            }
            this.f178422s.f178378g = false;
        }
    }
}

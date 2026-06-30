package z25;

/* loaded from: classes12.dex */
public class d implements z25.k, p25.e {

    /* renamed from: a, reason: collision with root package name */
    public z25.a f551309a;

    /* renamed from: b, reason: collision with root package name */
    public z25.f f551310b;

    /* renamed from: c, reason: collision with root package name */
    public int f551311c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f551312d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f551313e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f551314f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f551315g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f551316h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f551317i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f551318j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f551319k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f551320l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f551321m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f551322n = false;

    public final void a(java.lang.String str, long j17, java.lang.String str2) {
        z25.a aVar = new z25.a(this);
        aVar.f551291a = str;
        aVar.f551292b = j17;
        aVar.f551294d = 5;
        z25.f fVar = this.f551310b;
        aVar.f551293c = fVar.f551324b;
        aVar.f551300j = this.f551316h;
        aVar.f551301k = str2;
        aVar.f551306p = fVar.f551338p;
        this.f551309a = aVar;
        aVar.b();
    }

    public final void b(int i17, java.lang.String str) {
        z25.f fVar = this.f551310b;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        fVar.f551334l = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f551310b.f551324b);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(this.f551310b.f551335m);
        z25.f fVar2 = this.f551310b;
        g0Var.g(20470, true, true, false, valueOf, valueOf2, java.lang.Long.valueOf(fVar2.f551334l - fVar2.f551333k), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f551310b.f551336n));
        g0Var.A(1431, 2);
        int i18 = this.f551310b.f551324b;
        if (i18 == 1) {
            g0Var.A(1431, 5);
        } else if (i18 == 2) {
            g0Var.A(1431, 8);
        } else if (i18 == 3) {
            g0Var.A(1431, 11);
            if (this.f551310b.f551335m > 26214400) {
                g0Var.A(1431, 14);
            }
        }
        z25.e eVar = this.f551310b.f551325c;
        if (eVar != null) {
            eVar.a(i17, str);
        }
    }

    public void c(z25.b bVar, java.lang.String str, int i17) {
        if (bVar.f551294d != 2 || i17 != -100003 || !this.f551321m) {
            b(i17, str);
        } else {
            this.f551321m = false;
            e(2);
        }
    }

    public boolean d(z25.f fVar) {
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CGIParallelUploadMgr", "summersafecdn addSendTask task info is null");
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new z25.c(this, fVar), "MicroMsg.ParallelUpload.ThreadName");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:94:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r14) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z25.d.e(int):void");
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CGIParallelUploadMgr", "quitVideoSendThread");
        z25.a aVar = this.f551309a;
        if (aVar != null) {
            aVar.c();
        }
    }
}

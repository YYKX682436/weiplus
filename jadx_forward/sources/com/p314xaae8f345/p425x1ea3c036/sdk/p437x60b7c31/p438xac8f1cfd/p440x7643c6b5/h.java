package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class h implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] f128960a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f128961b = new java.lang.Object[1];

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f128962c = new boolean[1];

    /* renamed from: d, reason: collision with root package name */
    public int f128963d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128964e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f128965f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f128966g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f128967h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f128968i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f f128969j;

    public h(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar, java.lang.String str, boolean z17, long j17, long j18, int i17) {
        this.f128969j = fVar;
        this.f128964e = str;
        this.f128965f = z17;
        this.f128966g = j17;
        this.f128967h = j18;
        this.f128968i = i17;
        this.f128960a = r3;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n[] nVarArr = {nVar};
        nVar.f128885i = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3
    public void a(cl.k1 k1Var) {
        this.f128961b[0] = k1Var;
        this.f128960a[0].f128887k = k1Var.f4720x425dcee1;
        c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        this.f128962c[0] = false;
        c();
    }

    public final void c() {
        int i17 = this.f128963d - 1;
        this.f128963d = i17;
        if (i17 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean z17 = this.f128965f;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.f fVar = this.f128969j;
            if (z17) {
                long j17 = this.f128966g;
                if (j17 > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSContextInterface[multicontext]", "loadJsFileWithOptions, appId[%s] initialScript[%s] inject done, cost[%d]ms", fVar.f128939d.mo48798x74292566(), this.f128964e, java.lang.Long.valueOf(currentTimeMillis - j17));
                }
            }
            this.f128969j.c(this.f128964e, this.f128965f, this.f128960a, this.f128962c, this.f128961b, this.f128967h, currentTimeMillis);
            sj1.l.h(fVar.f128939d.mo50260x9f1221c2() + "", this.f128968i);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    /* renamed from: onSuccess */
    public void mo1150xe05b4124(java.lang.String str) {
        this.f128962c[0] = true;
        c();
    }
}

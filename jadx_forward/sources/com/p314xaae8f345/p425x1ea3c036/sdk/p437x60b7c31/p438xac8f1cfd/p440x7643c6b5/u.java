package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public class u implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f129074a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f129075b;

    /* renamed from: c, reason: collision with root package name */
    public final long f129076c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f129077d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n f129078e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f129079f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f129080g;

    /* renamed from: h, reason: collision with root package name */
    public cl.k1 f129081h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f129082i;

    /* renamed from: j, reason: collision with root package name */
    public final long f129083j;

    /* renamed from: k, reason: collision with root package name */
    public final int f129084k;

    public u(java.lang.String str, java.lang.String str2, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n nVar, boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.o oVar) {
        this.f129080g = false;
        this.f129081h = null;
        this.f129082i = new java.util.concurrent.atomic.AtomicInteger(2);
        this.f129074a = str;
        this.f129075b = str2;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f129076c = (str2 == null ? "" : str2).length();
        this.f129077d = yVar;
        this.f129078e = nVar;
        this.f129079f = z17;
        this.f129083j = java.lang.System.currentTimeMillis();
        this.f129084k = sj1.l.f(yVar.mo50260x9f1221c2() + "", "public:inject", "代码注入-" + str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c3
    public void a(cl.k1 k1Var) {
        this.f129081h = k1Var;
        c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    public void b(java.lang.String str) {
        this.f129080g = false;
        c();
    }

    public final void c() {
        if (this.f129082i.decrementAndGet() == 0) {
            cl.k1 k1Var = this.f129081h;
            long j17 = k1Var == null ? this.f129083j : k1Var.f124208a;
            long currentTimeMillis = k1Var == null ? java.lang.System.currentTimeMillis() : k1Var.f124209b;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n nVar = new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.n();
            java.lang.String str = this.f129074a;
            nVar.f128885i = str;
            nVar.f128886j = this.f129075b;
            nVar.f128887k = this.f129076c;
            this.f129077d.H1(nVar, this.f129080g, j17, currentTimeMillis, this.f129081h);
            this.f129078e.I0(this.f129080g, str, this.f129081h);
            sj1.l.h(this.f129077d.mo48798x74292566(), this.f129084k);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.b3
    /* renamed from: onSuccess */
    public void mo1150xe05b4124(java.lang.String str) {
        this.f129080g = true;
        c();
        if (this.f129074a.equals("WAServiceMainContext.js")) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f129083j;
            boolean z17 = this.f129079f;
            com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f129077d;
            cl.r3.c(2, currentTimeMillis, z17 ? 1 : 0, yVar.mo48798x74292566(), -1, 0, yVar.x().i());
        }
    }

    public u(java.lang.String str, android.content.res.AssetFileDescriptor assetFileDescriptor, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n nVar, boolean z17, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.o oVar) {
        this.f129080g = false;
        this.f129081h = null;
        this.f129082i = new java.util.concurrent.atomic.AtomicInteger(2);
        this.f129074a = str;
        this.f129075b = null;
        this.f129076c = assetFileDescriptor.getLength();
        this.f129077d = yVar;
        this.f129078e = nVar;
        this.f129079f = z17;
        this.f129083j = java.lang.System.currentTimeMillis();
        this.f129084k = sj1.l.f(yVar.mo50260x9f1221c2() + "", "public:inject", "代码注入-" + str);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 f225614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oq1.q f225615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h f225616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f225617g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 f225618h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 f225619i;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var, com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874, oq1.q qVar, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.k2 k2Var) {
        this.f225619i = c1Var;
        this.f225614d = abstractC3700xe41a2874;
        this.f225615e = qVar;
        this.f225616f = hVar;
        this.f225617g = str;
        this.f225618h = k2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.m65927x7420eb55();
        oq1.q qVar = this.f225615e;
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = this.f225614d;
        if (abstractC3700xe41a2874 == null) {
            abstractC3700xe41a2874 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e(qVar.f428879a);
        }
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a28742 = abstractC3700xe41a2874;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1293L, 93L, 1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.t0(null);
        java.lang.String str = qVar.f428882d;
        t0Var.f178683a = str;
        t0Var.f178686d = qVar.f428883e;
        t0Var.f178688f = 2;
        t0Var.f178692j = false;
        t0Var.B = false;
        t0Var.C = qVar.f428898t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var = this.f225619i;
        if (((java.util.concurrent.ConcurrentHashMap) c1Var.f225447e).containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", qVar.f428882d + " is downloading");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.h hVar = this.f225616f;
            if (hVar != null) {
                hVar.mo25333x2fd71e(qVar.f428879a, 8);
                return;
            }
            return;
        }
        if (abstractC3700xe41a28742 != null) {
            abstractC3700xe41a28742.mo28861xbcd14bec(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3696xcb0f78fe.DOWNLOAD_PACKAGE, qVar.f428893o);
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        long b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().b(t0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var2 = this.f225619i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 b1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1(c1Var2, "downloadLiteAppPkg", this.f225615e, this.f225617g, abstractC3700xe41a28742, this.f225616f, null);
        b1Var.f225441f = this.f225618h;
        ((java.util.concurrent.ConcurrentHashMap) c1Var2.f225446d).put(java.lang.Long.valueOf(b17), b1Var);
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f225447e).put(qVar.f428882d, b1Var);
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f225448f).put(qVar.f428882d, java.lang.Long.valueOf(b17));
    }
}

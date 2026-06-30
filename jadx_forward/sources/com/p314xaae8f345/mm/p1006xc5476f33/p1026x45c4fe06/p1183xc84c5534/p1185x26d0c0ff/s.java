package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f169806d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p f169807e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f169808f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t f169809g;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o oVar) {
        this.f169809g = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f169809g.f169841h == null) {
            return;
        }
        if (this.f169807e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntimeEventReporter", "hy: null type! could not happen");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar = this.f169809g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p pVar = this.f169807e;
        boolean z17 = this.f169808f;
        synchronized (tVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321 = tVar.f169841h;
            if (c12567x34ba321 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t.b(c12567x34ba321, pVar);
                if (b17 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba3212 = tVar.f169841h;
                    boolean z18 = true;
                    if (!c12567x34ba3212.A) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.j(c12567x34ba3212.f169668e, b17);
                        ka1.j jVar = new ka1.j(tVar.f169841h, b17);
                        if (pVar != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.Full) {
                            z18 = false;
                        }
                        jVar.a(z18);
                    } else if (z17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.f169705a.j(c12567x34ba3212.f169668e, b17);
                    } else {
                        ka1.j jVar2 = new ka1.j(c12567x34ba3212, b17);
                        if (pVar != com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.Full) {
                            z18 = false;
                        }
                        jVar2.a(z18);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar2 = this.f169809g;
        tVar2.f169834a.postDelayed(tVar2.f169835b, this.f169806d);
    }
}

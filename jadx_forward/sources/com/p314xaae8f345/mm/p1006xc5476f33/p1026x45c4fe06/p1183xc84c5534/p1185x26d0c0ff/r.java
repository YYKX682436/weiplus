package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public long f169803d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t f169804e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o oVar) {
        this.f169804e = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar = this.f169804e;
        if (tVar.f169841h == null) {
            return;
        }
        if (tVar.f169842i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar2 = this.f169804e;
            synchronized (tVar2) {
                if (tVar2.f169841h != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeEventReporter", tVar2.f169841h.f169668e + " newReport");
                    new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.a0().a(tVar2.f169841h, tVar2.f169838e);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeEventReporter", tVar2.f169841h.f169668e + " newReport finish");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar3 = this.f169804e;
        synchronized (tVar3) {
            if (tVar3.f169838e != null) {
                ((java.util.HashMap) tVar3.f169838e).clear();
            }
        }
        if (this.f169804e.f169843j) {
            ((ku5.t0) ku5.t0.f394148d).k(this.f169804e.f169836c, this.f169803d);
        }
    }
}

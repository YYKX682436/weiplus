package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff;

/* loaded from: classes7.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t f169794d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o oVar) {
        this.f169794d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar = this.f169794d;
        if (tVar.f169841h == null) {
            return;
        }
        if (tVar.f169842i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntimeEventReporter", "NewCollectionTask:" + this.f169794d.f169841h.f169668e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t tVar2 = this.f169794d;
            synchronized (tVar2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba321 = tVar2.f169841h;
                if (c12567x34ba321 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t1 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.t.b(c12567x34ba321, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.p.Light);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 c12567x34ba3212 = tVar2.f169841h;
                    java.lang.String str = c12567x34ba3212.f169668e;
                    tVar2.a(c12567x34ba3212, b17);
                    java.lang.String.valueOf(b17);
                    if (((java.util.HashMap) tVar2.f169838e).containsKey(java.lang.Integer.valueOf(tVar2.f169839f))) {
                        if (((java.util.HashMap) tVar2.f169838e).get(java.lang.Integer.valueOf(tVar2.f169839f)) != null) {
                            java.lang.String str2 = tVar2.f169841h.f169668e;
                            ((java.util.List) ((java.util.HashMap) tVar2.f169838e).get(java.lang.Integer.valueOf(tVar2.f169839f))).add(b17);
                        }
                    } else if (((java.util.HashMap) tVar2.f169838e).size() < 6) {
                        java.lang.String str3 = tVar2.f169841h.f169668e;
                        ((java.util.HashMap) tVar2.f169838e).put(java.lang.Integer.valueOf(tVar2.f169839f), new java.util.ArrayList());
                        ((java.util.List) ((java.util.HashMap) tVar2.f169838e).get(java.lang.Integer.valueOf(tVar2.f169839f))).add(b17);
                    }
                }
            }
        }
        if (this.f169794d.f169843j) {
            ((ku5.t0) ku5.t0.f394148d).k(this.f169794d.f169837d, 1000L);
        }
    }
}

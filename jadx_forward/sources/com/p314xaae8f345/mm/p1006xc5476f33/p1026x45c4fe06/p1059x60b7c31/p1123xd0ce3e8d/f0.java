package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d;

/* loaded from: classes7.dex */
public class f0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.h0 f165354d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.h0 h0Var) {
        this.f165354d = h0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.h0 h0Var = this.f165354d;
        if (((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SRDownloadFile", "down fail, id:%d errCode:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.g0) ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).get(java.lang.Long.valueOf(j17));
            if (((java.util.concurrent.ConcurrentHashMap) h0Var.f165366e).containsKey(g0Var.f165357a)) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f165366e).remove(g0Var.f165357a);
            }
            ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).remove(java.lang.Long.valueOf(j17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.a aVar = g0Var.f165359c;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.q) aVar).a(1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.h0 h0Var = this.f165354d;
        if (((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.g0) ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).get(java.lang.Long.valueOf(j17));
            if (((java.util.concurrent.ConcurrentHashMap) h0Var.f165366e).containsKey(g0Var.f165357a)) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f165366e).remove(g0Var.f165357a);
            }
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.a aVar = g0Var.f165359c;
            if (K0) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).remove(java.lang.Long.valueOf(j17));
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.q) aVar).a(1);
                    return;
                }
                return;
            }
            if (!g0Var.f165358b.equals(uk.k.b(str))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SRDownloadFile", "MD5 error!");
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).remove(java.lang.Long.valueOf(j17));
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.q) aVar).a(2);
                    return;
                }
                return;
            }
            ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).remove(java.lang.Long.valueOf(j17));
            java.lang.String f17 = lp0.b.f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SRDownloadFile", "download success, path:%s", str);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(f17);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            try {
                if (com.p314xaae8f345.mm.vfs.w6.Q(com.p314xaae8f345.mm.vfs.w6.i(str, false), f17) < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SRDownloadFile", "unzip error!");
                    if (aVar != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.q) aVar).a(3);
                        return;
                    }
                    return;
                }
                if (aVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.q qVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.q) aVar;
                    qVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.C12289xc35496e5 c12289xc35496e5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.C12289xc35496e5(0);
                    com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = qVar.f165385a;
                    if (rVar != null) {
                        rVar.a(c12289xc35496e5);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SRDownloadFile", "download Success");
            } catch (java.lang.Exception e17) {
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.q) aVar).a(4);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SRDownloadFile", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SRDownloadFile", "download Fail, in exception");
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SRDownloadFile", "onTaskStarted id:%s savedFilePath:%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.h0 h0Var = this.f165354d;
        if (((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).containsKey(java.lang.Long.valueOf(j17))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.g0 g0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1123xd0ce3e8d.g0) ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).get(java.lang.Long.valueOf(j17));
            if (((java.util.concurrent.ConcurrentHashMap) h0Var.f165366e).containsKey(g0Var.f165357a)) {
                ((java.util.concurrent.ConcurrentHashMap) h0Var.f165366e).remove(g0Var.f165357a);
            }
            ((java.util.concurrent.ConcurrentHashMap) h0Var.f165365d).remove(java.lang.Long.valueOf(j17));
        }
    }
}

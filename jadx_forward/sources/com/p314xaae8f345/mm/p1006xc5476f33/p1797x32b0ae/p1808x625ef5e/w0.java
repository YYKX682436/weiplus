package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class w0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 f225605d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var) {
        this.f225605d = c1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1) ((java.util.concurrent.ConcurrentHashMap) this.f225605d.f225446d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) this.f225605d.f225446d).remove(java.lang.Long.valueOf(j17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppDownloadPkg", "cdn download fail, id: %d, errCode: %d, appId: %s. need http download.", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), b1Var.f225437b.f428879a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var = this.f225605d;
        c1Var.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.a1(c1Var, b1Var));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", "onTaskFinished id:%s, savedFilePath:%s", java.lang.Long.valueOf(j17), str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var = this.f225605d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1) ((java.util.concurrent.ConcurrentHashMap) c1Var.f225446d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f225446d).remove(java.lang.Long.valueOf(j17));
        c1Var.g(b1Var, str, "cdn");
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var = this.f225605d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1) ((java.util.concurrent.ConcurrentHashMap) c1Var.f225446d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        b1Var.f225442g = currentTimeMillis;
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f225446d).put(java.lang.Long.valueOf(j17), b1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", "onTaskStarted id:%s, startDownloadTime:%d, savedFilePath:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppDownloadPkg", "onTaskRemoved id:%s", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c1 c1Var = this.f225605d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.b1) ((java.util.concurrent.ConcurrentHashMap) c1Var.f225446d).get(java.lang.Long.valueOf(j17));
        if (b1Var == null) {
            return;
        }
        java.util.Map map = c1Var.f225447e;
        oq1.q qVar = b1Var.f225437b;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(qVar.f428882d)) {
            ((java.util.concurrent.ConcurrentHashMap) c1Var.f225447e).remove(qVar.f428882d);
        }
        ((java.util.concurrent.ConcurrentHashMap) c1Var.f225446d).remove(java.lang.Long.valueOf(j17));
    }
}

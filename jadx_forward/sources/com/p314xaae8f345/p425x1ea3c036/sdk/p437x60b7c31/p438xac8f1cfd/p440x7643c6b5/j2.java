package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5;

/* loaded from: classes7.dex */
public final class j2 extends com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 f128992a;

    public j2(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var) {
        this.f128992a = n2Var;
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652
    /* renamed from: fileSizeChangeEvent */
    public void mo32125x10f044ed(java.lang.String filePath, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 mo49623xfc54b5c4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = this.f128992a;
        synchronized (n2Var.f129039e) {
            e9Var = n2Var.f129037c;
        }
        if (e9Var == null || (mo50354x59eafec1 = e9Var.mo50354x59eafec1()) == null || (mo49623xfc54b5c4 = mo50354x59eafec1.mo49623xfc54b5c4()) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) mo49623xfc54b5c4).g(filePath, j17, "");
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652
    /* renamed from: getFolderUsedSize */
    public long mo32126x1ab318e2(java.lang.String dirPath) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.u1 mo50354x59eafec1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.x1 mo49623xfc54b5c4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirPath, "dirPath");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = this.f128992a;
        synchronized (n2Var.f129039e) {
            e9Var = n2Var.f129037c;
        }
        if (e9Var == null || (mo50354x59eafec1 = e9Var.mo50354x59eafec1()) == null || (mo49623xfc54b5c4 = mo50354x59eafec1.mo49623xfc54b5c4()) == null) {
            return -1L;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.n3) mo49623xfc54b5c4).c(dirPath, "");
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652
    /* renamed from: requestUserAuth */
    public void mo32127x8a66b7c2(long j17, java.lang.String apiName) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = this.f128992a;
        synchronized (n2Var.f129039e) {
            e9Var = n2Var.f129037c;
        }
        if (e9Var == null) {
            return;
        }
        boolean z17 = false;
        java.util.Set c17 = ui1.t.f509615d.c(e9Var.mo48798x74292566(), false);
        if (c17 != null) {
            synchronized (c17) {
                z17 = c17.contains(apiName);
            }
        }
        if (!z17) {
            ui1.t.c(new ui1.a0(e9Var, apiName, null, null, 0), new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.i2(n2Var, j17));
            return;
        }
        com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652 abstractC22919x419b2652 = n2Var.f129035a;
        if (abstractC22919x419b2652 != null) {
            abstractC22919x419b2652.m83335xd02421cf(j17, vp5.j.f520654d);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("jsBridge");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22919x419b2652
    /* renamed from: showJsApiBanAlert */
    public void mo32128x4b83edc1(java.lang.String apiName) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(apiName, "apiName");
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.n2 n2Var = this.f128992a;
        synchronized (n2Var.f129039e) {
            e9Var = n2Var.f129037c;
        }
        if (e9Var == null) {
            return;
        }
        si1.o0.f489811a.F6(e9Var, apiName);
    }
}

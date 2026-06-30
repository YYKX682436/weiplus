package com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29;

/* loaded from: classes7.dex */
public final class s implements com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f271239a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f271240b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f271241c = new java.lang.Object();

    public s(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.f271239a = n3Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g
    public void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchRetry, urlKey = %s, max = %d, count = %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(str);
        if (e17 != null) {
            e17.f68784xeef7a77d = i17;
            e17.f68793x74b591e3 = i18;
            l0Var.g(e17, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g
    public void b(com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.i iVar, com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.v vVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ResDownloader.NetworkEventDispatcher", "dispatchResponse, response = " + vVar);
        int i17 = vVar.f271262g;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f271239a;
        java.lang.String str = vVar.f271256a;
        if (i17 == 2) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(str);
            if (e17 != null) {
                e17.f68795x10a0fed7 = 2;
                l0Var.g(e17, true);
            }
            iVar.mo49249x4f4a97c4();
            java.util.List d17 = d(iVar.mo49249x4f4a97c4());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d17)) {
                return;
            }
            d17.size();
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.q(this, d17, vVar, ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar).f()));
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var2 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
            com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e18 = l0Var2.e(str);
            if (e18 != null) {
                e18.f68795x10a0fed7 = 3;
                l0Var2.g(e18, true);
            }
            java.util.List d18 = d(iVar.mo49249x4f4a97c4());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d18)) {
                return;
            }
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.p(this, d18, vVar, ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar).f()));
            return;
        }
        if (i17 != 4) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var3 = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e19 = l0Var3.e(str);
        if (e19 != null) {
            e19.f68795x10a0fed7 = 4;
            l0Var3.g(e19, true);
        }
        java.util.List d19 = d(iVar.mo49249x4f4a97c4());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d19)) {
            return;
        }
        n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.r(this, d19, vVar, ((com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.x) iVar).f()));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.g
    public void c(java.lang.String str, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.l0 l0Var = com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.j0.f271212a;
        com.p314xaae8f345.mm.p2470x93e71c27.res.p2477x798ad335.p2479x633fb29.n0 e17 = l0Var.e(str);
        if (e17 != null) {
            e17.f68769x590f923a = j17;
            l0Var.g(e17, true);
        }
    }

    public final java.util.List d(java.lang.String str) {
        java.util.List list;
        int hashCode = str.hashCode();
        synchronized (this.f271241c) {
            list = (java.util.List) this.f271240b.get(hashCode);
        }
        return list;
    }
}

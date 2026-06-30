package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class k3 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l3 f263397d;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l3 l3Var) {
        this.f263397d = l3Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.l3 l3Var = this.f263397d;
        l3Var.f263412f = null;
        if (l3Var.f263410d) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3 m3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a;
            java.lang.Class cls = l3Var.f263411e;
            if (m3Var.b(cls).size() < com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263421c) {
                m3Var.b(cls).add(l3Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIConnectionPool", "detach with reuse service");
                return;
            }
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unbindService(l3Var);
        } catch (java.lang.IllegalArgumentException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3 m3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.m3.f263419a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewUIConnectionPool", "detach unbind service");
    }
}

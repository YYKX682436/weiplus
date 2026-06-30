package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd;

/* renamed from: com.google.android.gms.common.api.internal.zaal */
/* loaded from: classes13.dex */
final class C1808x38ed92 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks {
    private final java.lang.ref.WeakReference zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api zab;
    private final boolean zac;

    public C1808x38ed92(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.Api api, boolean z17) {
        this.zaa = new java.lang.ref.WeakReference(c1819x38ed9d);
        this.zab = api;
        this.zac = z17;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.AbstractC1900x418ca687.ConnectionProgressReportCallbacks
    /* renamed from: onReportServiceBinding */
    public final void mo17961x7bf20ce3(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1700xff0c58bb c1700xff0c58bb) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1831x38edae c1831x38edae;
        java.util.concurrent.locks.Lock lock;
        java.util.concurrent.locks.Lock lock2;
        boolean zaG;
        boolean zaH;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d c1819x38ed9d = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.C1819x38ed9d) this.zaa.get();
        if (c1819x38ed9d == null) {
            return;
        }
        android.os.Looper myLooper = android.os.Looper.myLooper();
        c1831x38edae = c1819x38ed9d.zaa;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(myLooper == c1831x38edae.zag.mo17781x23b2dd47(), "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        lock = c1819x38ed9d.zab;
        lock.lock();
        try {
            zaG = c1819x38ed9d.zaG(0);
            if (zaG) {
                if (!c1700xff0c58bb.m17605x6e268779()) {
                    c1819x38ed9d.zaE(c1700xff0c58bb, this.zab, this.zac);
                }
                zaH = c1819x38ed9d.zaH();
                if (zaH) {
                    c1819x38ed9d.zaF();
                }
            }
        } finally {
            lock2 = c1819x38ed9d.zab;
            lock2.unlock();
        }
    }
}

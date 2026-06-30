package com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p196xca356fa2.p197x21ffc6bd;

/* loaded from: classes13.dex */
public final class zzf extends p012xc85e97e9.p094xbe953013.p095x38b73479.b implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1790xea568934 {

    /* renamed from: zzet */
    private java.util.concurrent.Semaphore f5694x394bef;

    /* renamed from: zzeu */
    private java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c> f5695x394bf0;

    public zzf(android.content.Context context, java.util.Set<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c> set) {
        super(context);
        this.f5694x394bef = new java.util.concurrent.Semaphore(0);
        this.f5695x394bf0 = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // p012xc85e97e9.p094xbe953013.p095x38b73479.b
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final java.lang.Void mo7831x333bc439() {
        java.util.Iterator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.AbstractC1748xd28d482c> it = this.f5695x394bf0.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (it.next().mo17788x402f564a(this)) {
                i17++;
            }
        }
        try {
            this.f5694x394bef.tryAcquire(i17, 5L, java.util.concurrent.TimeUnit.SECONDS);
            return null;
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1790xea568934
    /* renamed from: onComplete */
    public final void mo17558x815f5438() {
        this.f5694x394bef.release();
    }

    @Override // p012xc85e97e9.p094xbe953013.p095x38b73479.e
    /* renamed from: onStartLoading */
    public final void mo7853x814fedf9() {
        this.f5694x394bef.drainPermits();
        m7844x5b105671();
    }
}

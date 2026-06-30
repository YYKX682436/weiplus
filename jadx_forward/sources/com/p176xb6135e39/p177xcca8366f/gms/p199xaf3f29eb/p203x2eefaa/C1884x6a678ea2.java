package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.DataBufferObserverSet */
/* loaded from: classes16.dex */
public final class C1884x6a678ea2 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0.Observable {
    private final java.util.HashSet zaa = new java.util.HashSet();

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0.Observable
    /* renamed from: addObserver */
    public void mo17994xdab4fe97(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0 interfaceC1883x2a64d1a0) {
        this.zaa.add(interfaceC1883x2a64d1a0);
    }

    /* renamed from: clear */
    public void m17996x5a5b64d() {
        this.zaa.clear();
    }

    /* renamed from: hasObservers */
    public boolean m17997x4365e2e3() {
        return !this.zaa.isEmpty();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0
    /* renamed from: onDataChanged */
    public void mo17989xf050804b() {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0) it.next()).mo17989xf050804b();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0
    /* renamed from: onDataRangeChanged */
    public void mo17990x9f061b80(int i17, int i18) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0) it.next()).mo17990x9f061b80(i17, i18);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0
    /* renamed from: onDataRangeInserted */
    public void mo17991xca765cc(int i17, int i18) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0) it.next()).mo17991xca765cc(i17, i18);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0
    /* renamed from: onDataRangeMoved */
    public void mo17992xb9deba7f(int i17, int i18, int i19) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0) it.next()).mo17992xb9deba7f(i17, i18, i19);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0
    /* renamed from: onDataRangeRemoved */
    public void mo17993xb40ed12c(int i17, int i18) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0) it.next()).mo17993xb40ed12c(i17, i18);
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0.Observable
    /* renamed from: removeObserver */
    public void mo17995xb5bdeb7a(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1883x2a64d1a0 interfaceC1883x2a64d1a0) {
        this.zaa.remove(interfaceC1883x2a64d1a0);
    }
}

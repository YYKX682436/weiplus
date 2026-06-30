package org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc;

/* renamed from: org.chromium.base.supplier.UnownedUserDataSupplier */
/* loaded from: classes16.dex */
public abstract class AbstractC29428x8d364aad<E> extends org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.C29421x1e8330f<E> implements org.p3343x72743996.p3344x2e06d1.p3347x394123c9.InterfaceC29399xed465034, org.p3343x72743996.p3344x2e06d1.InterfaceC29376x1b753dc1 {

    /* renamed from: mDestroyChecker */
    private final org.p3343x72743996.p3344x2e06d1.p3347x394123c9.C29398xc04f867b f73574x2bbc428 = new org.p3343x72743996.p3344x2e06d1.p3347x394123c9.C29398xc04f867b();

    /* renamed from: mUudKey */
    private final org.p3343x72743996.p3344x2e06d1.C29379x507e84de<org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.AbstractC29428x8d364aad<E>> f73575x1db280c8;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC29428x8d364aad(org.p3343x72743996.p3344x2e06d1.C29379x507e84de<? extends org.p3343x72743996.p3344x2e06d1.p3350x9cdbf9cc.AbstractC29428x8d364aad<E>> c29379x507e84de) {
        this.f73575x1db280c8 = c29379x507e84de;
    }

    /* renamed from: attach */
    public void m152969xac1eee45(org.p3343x72743996.p3344x2e06d1.C29377xbf50df09 c29377xbf50df09) {
        this.f73574x2bbc428.m152873xd87b75ae();
        this.f73575x1db280c8.m152764x80581568(c29377xbf50df09, this);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3347x394123c9.InterfaceC29399xed465034
    /* renamed from: destroy */
    public void mo152874x5cd39ffa() {
        this.f73574x2bbc428.mo152874x5cd39ffa();
        this.f73575x1db280c8.m152765xff660ba7(this);
    }
}

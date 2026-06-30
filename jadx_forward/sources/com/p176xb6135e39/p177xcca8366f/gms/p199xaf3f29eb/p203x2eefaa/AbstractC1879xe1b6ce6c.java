package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.AbstractDataBuffer */
/* loaded from: classes13.dex */
public abstract class AbstractC1879xe1b6ce6c<T> implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa<T> {

    /* renamed from: mDataHolder */
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 f5913x1540ba43;

    public AbstractC1879xe1b6ce6c(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16) {
        this.f5913x1540ba43 = c1888xafe09e16;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mo17739x41012807();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    public abstract T get(int i17);

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    /* renamed from: getCount */
    public int mo17736x7444f759() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16 = this.f5913x1540ba43;
        if (c1888xafe09e16 == null) {
            return 0;
        }
        return c1888xafe09e16.m18026x7444f759();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    /* renamed from: getMetadata */
    public final android.os.Bundle mo17737x6107b8a5() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16 = this.f5913x1540ba43;
        if (c1888xafe09e16 == null) {
            return null;
        }
        return c1888xafe09e16.m18029x6107b8a5();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    @java.lang.Deprecated
    /* renamed from: isClosed */
    public boolean mo17738xd742d336() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16 = this.f5913x1540ba43;
        return c1888xafe09e16 == null || c1888xafe09e16.m18035xd742d336();
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1882x5c198738(this);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.InterfaceC1754x1c628e98
    /* renamed from: release */
    public void mo17739x41012807() {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1888xafe09e16 c1888xafe09e16 = this.f5913x1540ba43;
        if (c1888xafe09e16 != null) {
            c1888xafe09e16.close();
        }
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa
    /* renamed from: singleRefIterator */
    public java.util.Iterator<T> mo17740x55d908b9() {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1892xa2511183(this);
    }
}

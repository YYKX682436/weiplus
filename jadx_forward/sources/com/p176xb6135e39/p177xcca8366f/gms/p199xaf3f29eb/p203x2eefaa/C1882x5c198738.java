package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.DataBufferIterator */
/* loaded from: classes13.dex */
public class C1882x5c198738<T> implements java.util.Iterator<T> {
    protected final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa zaa;
    protected int zab = -1;

    public C1882x5c198738(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa interfaceC1881xa5f564aa) {
        this.zaa = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC1881xa5f564aa);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.mo17736x7444f759() + (-1);
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (hasNext()) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa interfaceC1881xa5f564aa = this.zaa;
            int i17 = this.zab + 1;
            this.zab = i17;
            return interfaceC1881xa5f564aa.get(i17);
        }
        throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

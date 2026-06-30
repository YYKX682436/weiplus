package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.SingleRefDataBufferIterator */
/* loaded from: classes13.dex */
public class C1892xa2511183<T> extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1882x5c198738<T> {
    private java.lang.Object zac;

    public C1892xa2511183(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.InterfaceC1881xa5f564aa interfaceC1881xa5f564aa) {
        super(interfaceC1881xa5f564aa);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1882x5c198738, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
        }
        int i17 = this.zab + 1;
        this.zab = i17;
        if (i17 == 0) {
            java.lang.Object m18214x7b41bcd2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zaa.get(0));
            this.zac = m18214x7b41bcd2;
            if (!(m18214x7b41bcd2 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1885xc7aea389)) {
                throw new java.lang.IllegalStateException("DataBuffer reference of type " + java.lang.String.valueOf(m18214x7b41bcd2.getClass()) + " is not movable");
            }
        } else {
            ((com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.AbstractC1885xc7aea389) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}

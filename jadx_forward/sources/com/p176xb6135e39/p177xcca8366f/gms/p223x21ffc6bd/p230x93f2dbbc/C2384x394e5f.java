package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzyx */
/* loaded from: classes13.dex */
final class C2384x394e5f implements java.util.Iterator {

    /* renamed from: limit */
    private final int f7211x6234bbb;

    /* renamed from: position */
    private int f7212x2c929929 = 0;

    /* renamed from: zzbqz */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e f7213x6f026cb;

    public C2384x394e5f(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e abstractC2383x394e5e) {
        this.f7213x6f026cb = abstractC2383x394e5e;
        this.f7211x6234bbb = abstractC2383x394e5e.mo19374x35e001();
    }

    /* renamed from: nextByte */
    private final byte m19378x54deae9b() {
        try {
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2383x394e5e abstractC2383x394e5e = this.f7213x6f026cb;
            int i17 = this.f7212x2c929929;
            this.f7212x2c929929 = i17 + 1;
            return abstractC2383x394e5e.mo19376x394b64(i17);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7212x2c929929 < this.f7211x6234bbb;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return java.lang.Byte.valueOf(m19378x54deae9b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

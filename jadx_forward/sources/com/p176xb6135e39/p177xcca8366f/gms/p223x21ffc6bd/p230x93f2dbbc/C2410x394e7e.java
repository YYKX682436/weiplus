package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzzx */
/* loaded from: classes13.dex */
final class C2410x394e7e<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {

    /* renamed from: zzbsv */
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> f7266x6f02705;

    public C2410x394e7e(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.f7266x6f02705 = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7266x6f02705.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.f7266x6f02705.next();
        return next.getValue() instanceof com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2407x394e7b ? new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2409x394e7d(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7266x6f02705.remove();
    }
}

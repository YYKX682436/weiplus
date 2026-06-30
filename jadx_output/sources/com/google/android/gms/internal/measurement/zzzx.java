package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzzx<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
    private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> zzbsv;

    public zzzx(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> it) {
        this.zzbsv = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzbsv.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        java.util.Map.Entry<K, java.lang.Object> next = this.zzbsv.next();
        return next.getValue() instanceof com.google.android.gms.internal.measurement.zzzu ? new com.google.android.gms.internal.measurement.zzzw(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzbsv.remove();
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzes implements java.util.Iterator<java.lang.String> {
    private java.util.Iterator<java.lang.String> zzafz;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzer zzaga;

    public zzes(com.google.android.gms.internal.measurement.zzer zzerVar) {
        android.os.Bundle bundle;
        this.zzaga = zzerVar;
        bundle = zzerVar.zzafy;
        this.zzafz = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzafz.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        return this.zzafz.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Remove not supported");
    }
}

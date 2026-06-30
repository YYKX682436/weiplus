package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
final class zzyx implements java.util.Iterator {
    private final int limit;
    private int position = 0;
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzyw zzbqz;

    public zzyx(com.google.android.gms.internal.measurement.zzyw zzywVar) {
        this.zzbqz = zzywVar;
        this.limit = zzywVar.size();
    }

    private final byte nextByte() {
        try {
            com.google.android.gms.internal.measurement.zzyw zzywVar = this.zzbqz;
            int i17 = this.position;
            this.position = i17 + 1;
            return zzywVar.zzae(i17);
        } catch (java.lang.IndexOutOfBoundsException e17) {
            throw new java.util.NoSuchElementException(e17.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.position < this.limit;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        return java.lang.Byte.valueOf(nextByte());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}

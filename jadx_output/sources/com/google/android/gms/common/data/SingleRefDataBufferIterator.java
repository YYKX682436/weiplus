package com.google.android.gms.common.data;

/* loaded from: classes13.dex */
public class SingleRefDataBufferIterator<T> extends com.google.android.gms.common.data.DataBufferIterator<T> {
    private java.lang.Object zac;

    public SingleRefDataBufferIterator(com.google.android.gms.common.data.DataBuffer dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
        }
        int i17 = this.zab + 1;
        this.zab = i17;
        if (i17 == 0) {
            java.lang.Object checkNotNull = com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = checkNotNull;
            if (!(checkNotNull instanceof com.google.android.gms.common.data.DataBufferRef)) {
                throw new java.lang.IllegalStateException("DataBuffer reference of type " + java.lang.String.valueOf(checkNotNull.getClass()) + " is not movable");
            }
        } else {
            ((com.google.android.gms.common.data.DataBufferRef) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}

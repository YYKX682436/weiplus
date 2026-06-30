package com.google.android.gms.common.data;

/* loaded from: classes13.dex */
public class DataBufferIterator<T> implements java.util.Iterator<T> {
    protected final com.google.android.gms.common.data.DataBuffer zaa;
    protected int zab = -1;

    public DataBufferIterator(com.google.android.gms.common.data.DataBuffer dataBuffer) {
        this.zaa = (com.google.android.gms.common.data.DataBuffer) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataBuffer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zab < this.zaa.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (hasNext()) {
            com.google.android.gms.common.data.DataBuffer dataBuffer = this.zaa;
            int i17 = this.zab + 1;
            this.zab = i17;
            return dataBuffer.get(i17);
        }
        throw new java.util.NoSuchElementException("Cannot advance the iterator beyond " + this.zab);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

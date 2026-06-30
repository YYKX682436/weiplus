package com.google.android.gms.common.data;

/* loaded from: classes13.dex */
public abstract class DataBufferRef {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected int mDataRow;
    private int zaa;

    public DataBufferRef(com.google.android.gms.common.data.DataHolder dataHolder, int i17) {
        this.mDataHolder = (com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(dataHolder);
        zaa(i17);
    }

    public void copyToBuffer(java.lang.String str, android.database.CharArrayBuffer charArrayBuffer) {
        this.mDataHolder.zac(str, this.mDataRow, this.zaa, charArrayBuffer);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.common.data.DataBufferRef) {
            com.google.android.gms.common.data.DataBufferRef dataBufferRef = (com.google.android.gms.common.data.DataBufferRef) obj;
            if (com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(dataBufferRef.mDataRow), java.lang.Integer.valueOf(this.mDataRow)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(dataBufferRef.zaa), java.lang.Integer.valueOf(this.zaa)) && dataBufferRef.mDataHolder == this.mDataHolder) {
                return true;
            }
        }
        return false;
    }

    public boolean getBoolean(java.lang.String str) {
        return this.mDataHolder.getBoolean(str, this.mDataRow, this.zaa);
    }

    public byte[] getByteArray(java.lang.String str) {
        return this.mDataHolder.getByteArray(str, this.mDataRow, this.zaa);
    }

    public int getDataRow() {
        return this.mDataRow;
    }

    public double getDouble(java.lang.String str) {
        return this.mDataHolder.zaa(str, this.mDataRow, this.zaa);
    }

    public float getFloat(java.lang.String str) {
        return this.mDataHolder.zab(str, this.mDataRow, this.zaa);
    }

    public int getInteger(java.lang.String str) {
        return this.mDataHolder.getInteger(str, this.mDataRow, this.zaa);
    }

    public long getLong(java.lang.String str) {
        return this.mDataHolder.getLong(str, this.mDataRow, this.zaa);
    }

    public java.lang.String getString(java.lang.String str) {
        return this.mDataHolder.getString(str, this.mDataRow, this.zaa);
    }

    public boolean hasColumn(java.lang.String str) {
        return this.mDataHolder.hasColumn(str);
    }

    public boolean hasNull(java.lang.String str) {
        return this.mDataHolder.hasNull(str, this.mDataRow, this.zaa);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.mDataRow), java.lang.Integer.valueOf(this.zaa), this.mDataHolder);
    }

    public boolean isDataValid() {
        return !this.mDataHolder.isClosed();
    }

    public android.net.Uri parseUri(java.lang.String str) {
        java.lang.String string = this.mDataHolder.getString(str, this.mDataRow, this.zaa);
        if (string == null) {
            return null;
        }
        return android.net.Uri.parse(string);
    }

    public final void zaa(int i17) {
        boolean z17 = false;
        if (i17 >= 0 && i17 < this.mDataHolder.getCount()) {
            z17 = true;
        }
        com.google.android.gms.common.internal.Preconditions.checkState(z17);
        this.mDataRow = i17;
        this.zaa = this.mDataHolder.getWindowIndex(i17);
    }
}

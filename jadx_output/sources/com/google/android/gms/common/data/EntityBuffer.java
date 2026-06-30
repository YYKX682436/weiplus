package com.google.android.gms.common.data;

/* loaded from: classes13.dex */
public abstract class EntityBuffer<T> extends com.google.android.gms.common.data.AbstractDataBuffer<T> {
    private boolean zaa;
    private java.util.ArrayList zab;

    public EntityBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            if (!this.zaa) {
                int count = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getCount();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                this.zab = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    java.lang.String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                    java.lang.String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                    for (int i17 = 1; i17 < count; i17++) {
                        int windowIndex = this.mDataHolder.getWindowIndex(i17);
                        java.lang.String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i17, windowIndex);
                        if (string2 == null) {
                            throw new java.lang.NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i17 + ", for window: " + windowIndex);
                        }
                        if (!string2.equals(string)) {
                            this.zab.add(java.lang.Integer.valueOf(i17));
                            string = string2;
                        }
                    }
                }
                this.zaa = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final T get(int i17) {
        int intValue;
        int intValue2;
        zab();
        int zaa = zaa(i17);
        int i18 = 0;
        if (i17 >= 0 && i17 != this.zab.size()) {
            if (i17 == this.zab.size() - 1) {
                intValue = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getCount();
                intValue2 = ((java.lang.Integer) this.zab.get(i17)).intValue();
            } else {
                intValue = ((java.lang.Integer) this.zab.get(i17 + 1)).intValue();
                intValue2 = ((java.lang.Integer) this.zab.get(i17)).intValue();
            }
            int i19 = intValue - intValue2;
            if (i19 == 1) {
                int zaa2 = zaa(i17);
                int windowIndex = ((com.google.android.gms.common.data.DataHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(zaa2);
                java.lang.String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, zaa2, windowIndex) != null) {
                    i18 = 1;
                }
            } else {
                i18 = i19;
            }
        }
        return getEntry(zaa, i18);
    }

    public java.lang.String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        zab();
        return this.zab.size();
    }

    public abstract T getEntry(int i17, int i18);

    public abstract java.lang.String getPrimaryDataMarkerColumn();

    public final int zaa(int i17) {
        if (i17 >= 0 && i17 < this.zab.size()) {
            return ((java.lang.Integer) this.zab.get(i17)).intValue();
        }
        throw new java.lang.IllegalArgumentException("Position " + i17 + " is out of bounds for this buffer");
    }
}

package com.google.android.gms.common.data;

/* loaded from: classes16.dex */
public interface DataBufferObserver {

    /* loaded from: classes16.dex */
    public interface Observable {
        void addObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver);

        void removeObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i17, int i18);

    void onDataRangeInserted(int i17, int i18);

    void onDataRangeMoved(int i17, int i18, int i19);

    void onDataRangeRemoved(int i17, int i18);
}

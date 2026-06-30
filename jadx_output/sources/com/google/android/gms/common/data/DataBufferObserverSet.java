package com.google.android.gms.common.data;

/* loaded from: classes16.dex */
public final class DataBufferObserverSet implements com.google.android.gms.common.data.DataBufferObserver, com.google.android.gms.common.data.DataBufferObserver.Observable {
    private final java.util.HashSet zaa = new java.util.HashSet();

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void addObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zaa.add(dataBufferObserver);
    }

    public void clear() {
        this.zaa.clear();
    }

    public boolean hasObservers() {
        return !this.zaa.isEmpty();
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataChanged() {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataChanged();
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeChanged(int i17, int i18) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeChanged(i17, i18);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeInserted(int i17, int i18) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeInserted(i17, i18);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeMoved(int i17, int i18, int i19) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeMoved(i17, i18, i19);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver
    public void onDataRangeRemoved(int i17, int i18) {
        java.util.Iterator it = this.zaa.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.data.DataBufferObserver) it.next()).onDataRangeRemoved(i17, i18);
        }
    }

    @Override // com.google.android.gms.common.data.DataBufferObserver.Observable
    public void removeObserver(com.google.android.gms.common.data.DataBufferObserver dataBufferObserver) {
        this.zaa.remove(dataBufferObserver);
    }
}

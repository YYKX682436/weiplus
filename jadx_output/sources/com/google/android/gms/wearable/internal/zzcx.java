package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzcx implements com.google.android.gms.wearable.DataEvent {
    private int type;
    private com.google.android.gms.wearable.DataItem zzdg;

    public zzcx(com.google.android.gms.wearable.DataEvent dataEvent) {
        this.type = dataEvent.getType();
        this.zzdg = dataEvent.getDataItem().freeze();
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.wearable.DataEvent freeze() {
        return this;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final com.google.android.gms.wearable.DataItem getDataItem() {
        return this.zzdg;
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return this.type;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : com.eclipsesource.mmv8.Platform.UNKNOWN;
        java.lang.String valueOf = java.lang.String.valueOf(getDataItem());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length() + 35 + valueOf.length());
        sb6.append("DataEventEntity{ type=");
        sb6.append(str);
        sb6.append(", dataitem=");
        sb6.append(valueOf);
        sb6.append(" }");
        return sb6.toString();
    }
}

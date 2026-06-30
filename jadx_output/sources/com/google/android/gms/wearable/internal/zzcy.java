package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public final class zzcy extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.wearable.DataEvent {
    private final int zzdl;

    public zzcy(com.google.android.gms.common.data.DataHolder dataHolder, int i17, int i18) {
        super(dataHolder, i17);
        this.zzdl = i18;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.wearable.DataEvent freeze() {
        return new com.google.android.gms.wearable.internal.zzcx(this);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final com.google.android.gms.wearable.DataItem getDataItem() {
        return new com.google.android.gms.wearable.internal.zzdf(this.mDataHolder, this.mDataRow, this.zzdl);
    }

    @Override // com.google.android.gms.wearable.DataEvent
    public final int getType() {
        return getInteger("event_type");
    }

    public final java.lang.String toString() {
        java.lang.String str = getType() == 1 ? "changed" : getType() == 2 ? "deleted" : com.eclipsesource.mmv8.Platform.UNKNOWN;
        java.lang.String valueOf = java.lang.String.valueOf(getDataItem());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length() + 32 + valueOf.length());
        sb6.append("DataEventRef{ type=");
        sb6.append(str);
        sb6.append(", dataitem=");
        sb6.append(valueOf);
        sb6.append(" }");
        return sb6.toString();
    }
}

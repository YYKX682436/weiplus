package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class DataItemBuffer extends com.google.android.gms.common.data.EntityBuffer<com.google.android.gms.wearable.DataItem> implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zzp;

    public DataItemBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
        this.zzp = new com.google.android.gms.common.api.Status(dataHolder.getStatusCode());
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    public /* synthetic */ com.google.android.gms.wearable.DataItem getEntry(int i17, int i18) {
        return new com.google.android.gms.wearable.internal.zzdf(this.mDataHolder, i17, i18);
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    public java.lang.String getPrimaryDataMarkerColumn() {
        return com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zzp;
    }
}

package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public interface DataEvent extends com.google.android.gms.common.data.Freezable<com.google.android.gms.wearable.DataEvent> {
    public static final int TYPE_CHANGED = 1;
    public static final int TYPE_DELETED = 2;

    com.google.android.gms.wearable.DataItem getDataItem();

    int getType();
}

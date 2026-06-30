package com.google.android.gms.wearable;

/* loaded from: classes13.dex */
public class DataMapItem {
    private final android.net.Uri uri;
    private final com.google.android.gms.wearable.DataMap zzr;

    private DataMapItem(com.google.android.gms.wearable.DataItem dataItem) {
        this.uri = dataItem.getUri();
        this.zzr = zza(dataItem.freeze());
    }

    public static com.google.android.gms.wearable.DataMapItem fromDataItem(com.google.android.gms.wearable.DataItem dataItem) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(dataItem, "dataItem must not be null");
        return new com.google.android.gms.wearable.DataMapItem(dataItem);
    }

    private static com.google.android.gms.wearable.DataMap zza(com.google.android.gms.wearable.DataItem dataItem) {
        if (dataItem.getData() == null && dataItem.getAssets().size() > 0) {
            throw new java.lang.IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        }
        if (dataItem.getData() == null) {
            return new com.google.android.gms.wearable.DataMap();
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = dataItem.getAssets().size();
            for (int i17 = 0; i17 < size; i17++) {
                com.google.android.gms.wearable.DataItemAsset dataItemAsset = dataItem.getAssets().get(java.lang.Integer.toString(i17));
                if (dataItemAsset == null) {
                    java.lang.String valueOf = java.lang.String.valueOf(dataItem);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(valueOf.length() + 64);
                    sb6.append("Cannot find DataItemAsset referenced in data at ");
                    sb6.append(i17);
                    sb6.append(" for ");
                    sb6.append(valueOf);
                    throw new java.lang.IllegalStateException(sb6.toString());
                }
                arrayList.add(com.google.android.gms.wearable.Asset.createFromRef(dataItemAsset.getId()));
            }
            return com.google.android.gms.internal.wearable.zze.zza(new com.google.android.gms.internal.wearable.zzf(com.google.android.gms.internal.wearable.zzg.zza(dataItem.getData()), arrayList));
        } catch (com.google.android.gms.internal.wearable.zzs | java.lang.NullPointerException e17) {
            new java.lang.StringBuilder(java.lang.String.valueOf(dataItem.getUri()).length() + 50 + java.lang.String.valueOf(android.util.Base64.encodeToString(dataItem.getData(), 0)).length());
            java.lang.String valueOf2 = java.lang.String.valueOf(dataItem.getUri());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(valueOf2.length() + 44);
            sb7.append("Unable to parse datamap from dataItem.  uri=");
            sb7.append(valueOf2);
            throw new java.lang.IllegalStateException(sb7.toString(), e17);
        }
    }

    public com.google.android.gms.wearable.DataMap getDataMap() {
        return this.zzr;
    }

    public android.net.Uri getUri() {
        return this.uri;
    }
}

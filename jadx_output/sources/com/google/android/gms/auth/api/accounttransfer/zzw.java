package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public class zzw extends com.google.android.gms.internal.auth.zzbs {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzw> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzx();
    private static final java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zzbk;
    private final java.util.Set<java.lang.Integer> zzbl;
    private java.lang.String zzbx;
    private int zzby;
    private byte[] zzbz;
    private android.app.PendingIntent zzca;
    private com.google.android.gms.auth.api.accounttransfer.DeviceMetaData zzcb;
    private final int zzy;

    static {
        java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> hashMap = new java.util.HashMap<>();
        zzbk = hashMap;
        hashMap.put("accountType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("accountType", 2));
        hashMap.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("status", 3));
        hashMap.put("transferBytes", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBase64("transferBytes", 4));
    }

    public zzw() {
        this.zzbl = new x.d(3);
        this.zzy = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public /* synthetic */ java.util.Map getFieldMappings() {
        return zzbk;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        int i17;
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            i17 = this.zzy;
        } else {
            if (safeParcelableFieldId == 2) {
                return this.zzbx;
            }
            if (safeParcelableFieldId != 3) {
                if (safeParcelableFieldId == 4) {
                    return this.zzbz;
                }
                int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
                sb6.append("Unknown SafeParcelable id=");
                sb6.append(safeParcelableFieldId2);
                throw new java.lang.IllegalStateException(sb6.toString());
            }
            i17 = this.zzby;
        }
        return java.lang.Integer.valueOf(i17);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return this.zzbl.contains(java.lang.Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzbz = bArr;
            this.zzbl.add(java.lang.Integer.valueOf(safeParcelableFieldId));
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(59);
            sb6.append("Field with id=");
            sb6.append(safeParcelableFieldId);
            sb6.append(" is not known to be an byte array.");
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i17) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zzby = i17;
            this.zzbl.add(java.lang.Integer.valueOf(safeParcelableFieldId));
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(52);
            sb6.append("Field with id=");
            sb6.append(safeParcelableFieldId);
            sb6.append(" is not known to be an int.");
            throw new java.lang.IllegalArgumentException(sb6.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string.", java.lang.Integer.valueOf(safeParcelableFieldId)));
        }
        this.zzbx = str2;
        this.zzbl.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.Set<java.lang.Integer> set = this.zzbl;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzbx, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzby);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.zzbz, true);
        }
        if (set.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzca, i17, true);
        }
        if (set.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzcb, i17, true);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzw(java.util.Set<java.lang.Integer> set, int i17, java.lang.String str, int i18, byte[] bArr, android.app.PendingIntent pendingIntent, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData) {
        this.zzbl = set;
        this.zzy = i17;
        this.zzbx = str;
        this.zzby = i18;
        this.zzbz = bArr;
        this.zzca = pendingIntent;
        this.zzcb = deviceMetaData;
    }
}

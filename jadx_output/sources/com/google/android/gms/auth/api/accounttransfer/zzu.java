package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public class zzu extends com.google.android.gms.internal.auth.zzbs {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzu> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzv();
    private static final java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zzbk;
    private java.lang.String mPackageName;
    private final java.util.Set<java.lang.Integer> zzbl;
    private com.google.android.gms.auth.api.accounttransfer.zzw zzbv;
    private java.lang.String zzbw;
    private final int zzy;

    static {
        java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> hashMap = new java.util.HashMap<>();
        zzbk = hashMap;
        hashMap.put("authenticatorInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, com.google.android.gms.auth.api.accounttransfer.zzw.class));
        hashMap.put("signature", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("signature", 3));
        hashMap.put("package", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("package", 4));
    }

    public zzu() {
        this.zzbl = new java.util.HashSet(3);
        this.zzy = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, T t17) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), t17.getClass().getCanonicalName()));
        }
        this.zzbv = (com.google.android.gms.auth.api.accounttransfer.zzw) t17;
        this.zzbl.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public /* synthetic */ java.util.Map getFieldMappings() {
        return zzbk;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return java.lang.Integer.valueOf(this.zzy);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzbv;
        }
        if (safeParcelableFieldId == 3) {
            return this.zzbw;
        }
        if (safeParcelableFieldId == 4) {
            return this.mPackageName;
        }
        int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Unknown SafeParcelable id=");
        sb6.append(safeParcelableFieldId2);
        throw new java.lang.IllegalStateException(sb6.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return this.zzbl.contains(java.lang.Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zzbw = str2;
        } else {
            if (safeParcelableFieldId != 4) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string.", java.lang.Integer.valueOf(safeParcelableFieldId)));
            }
            this.mPackageName = str2;
        }
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
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzbv, i17, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzbw, true);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.mPackageName, true);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzu(java.util.Set<java.lang.Integer> set, int i17, com.google.android.gms.auth.api.accounttransfer.zzw zzwVar, java.lang.String str, java.lang.String str2) {
        this.zzbl = set;
        this.zzy = i17;
        this.zzbv = zzwVar;
        this.zzbw = str;
        this.mPackageName = str2;
    }
}

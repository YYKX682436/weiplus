package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public final class zzo extends com.google.android.gms.internal.auth.zzbs {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzo> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzp();
    private static final java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zzbk;
    private final java.util.Set<java.lang.Integer> zzbl;
    private java.util.ArrayList<com.google.android.gms.auth.api.accounttransfer.zzu> zzbm;
    private int zzbn;
    private com.google.android.gms.auth.api.accounttransfer.zzr zzbo;
    private final int zzy;

    static {
        java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> hashMap = new java.util.HashMap<>();
        zzbk = hashMap;
        hashMap.put("authenticatorData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, com.google.android.gms.auth.api.accounttransfer.zzu.class));
        hashMap.put("progress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("progress", 4, com.google.android.gms.auth.api.accounttransfer.zzr.class));
    }

    public zzo() {
        this.zzbl = new java.util.HashSet(1);
        this.zzy = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
        }
        this.zzbm = arrayList;
        this.zzbl.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, T t17) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 4) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), t17.getClass().getCanonicalName()));
        }
        this.zzbo = (com.google.android.gms.auth.api.accounttransfer.zzr) t17;
        this.zzbl.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ java.util.Map getFieldMappings() {
        return zzbk;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return java.lang.Integer.valueOf(this.zzy);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzbm;
        }
        if (safeParcelableFieldId == 4) {
            return this.zzbo;
        }
        int safeParcelableFieldId2 = field.getSafeParcelableFieldId();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
        sb6.append("Unknown SafeParcelable id=");
        sb6.append(safeParcelableFieldId2);
        throw new java.lang.IllegalStateException(sb6.toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return this.zzbl.contains(java.lang.Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.Set<java.lang.Integer> set = this.zzbl;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzbm, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzbn);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzbo, i17, true);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzo(java.util.Set<java.lang.Integer> set, int i17, java.util.ArrayList<com.google.android.gms.auth.api.accounttransfer.zzu> arrayList, int i18, com.google.android.gms.auth.api.accounttransfer.zzr zzrVar) {
        this.zzbl = set;
        this.zzy = i17;
        this.zzbm = arrayList;
        this.zzbn = i18;
        this.zzbo = zzrVar;
    }
}

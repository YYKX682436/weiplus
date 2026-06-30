package com.google.android.gms.auth.api.accounttransfer;

/* loaded from: classes13.dex */
public class zzr extends com.google.android.gms.internal.auth.zzbs {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzr> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzs();
    private static final x.b zzbp;
    private java.util.List<java.lang.String> zzbq;
    private java.util.List<java.lang.String> zzbr;
    private java.util.List<java.lang.String> zzbs;
    private java.util.List<java.lang.String> zzbt;
    private java.util.List<java.lang.String> zzbu;
    private final int zzy;

    static {
        x.b bVar = new x.b();
        zzbp = bVar;
        bVar.put("registered", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("registered", 2));
        bVar.put("in_progress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("in_progress", 3));
        bVar.put(ya.b.SUCCESS, com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(ya.b.SUCCESS, 4));
        bVar.put(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, 5));
        bVar.put("escrowed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    public zzr() {
        this.zzy = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzbp;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return java.lang.Integer.valueOf(this.zzy);
            case 2:
                return this.zzbq;
            case 3:
                return this.zzbr;
            case 4:
                return this.zzbs;
            case 5:
                return this.zzbt;
            case 6:
                return this.zzbu;
            default:
                int safeParcelableFieldId = field.getSafeParcelableFieldId();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(37);
                sb6.append("Unknown SafeParcelable id=");
                sb6.append(safeParcelableFieldId);
                throw new java.lang.IllegalStateException(sb6.toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbq = arrayList;
            return;
        }
        if (safeParcelableFieldId == 3) {
            this.zzbr = arrayList;
            return;
        }
        if (safeParcelableFieldId == 4) {
            this.zzbs = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzbt = arrayList;
        } else {
            if (safeParcelableFieldId != 6) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string list.", java.lang.Integer.valueOf(safeParcelableFieldId)));
            }
            this.zzbu = arrayList;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 2, this.zzbq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 3, this.zzbr, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 4, this.zzbs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 5, this.zzbt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzbu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzr(int i17, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, java.util.List<java.lang.String> list4, java.util.List<java.lang.String> list5) {
        this.zzy = i17;
        this.zzbq = list;
        this.zzbr = list2;
        this.zzbs = list3;
        this.zzbt = list4;
        this.zzbu = list5;
    }
}

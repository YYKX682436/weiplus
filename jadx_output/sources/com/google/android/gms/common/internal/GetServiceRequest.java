package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public class GetServiceRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.GetServiceRequest> CREATOR = new com.google.android.gms.common.internal.zzn();
    static final com.google.android.gms.common.api.Scope[] zza = new com.google.android.gms.common.api.Scope[0];
    static final com.google.android.gms.common.Feature[] zzb = new com.google.android.gms.common.Feature[0];
    final int zzc;
    final int zzd;
    final int zze;
    java.lang.String zzf;
    android.os.IBinder zzg;
    com.google.android.gms.common.api.Scope[] zzh;
    android.os.Bundle zzi;
    android.accounts.Account zzj;
    com.google.android.gms.common.Feature[] zzk;
    com.google.android.gms.common.Feature[] zzl;
    final boolean zzm;
    final int zzn;
    boolean zzo;
    private final java.lang.String zzp;

    public GetServiceRequest(int i17, int i18, int i19, java.lang.String str, android.os.IBinder iBinder, com.google.android.gms.common.api.Scope[] scopeArr, android.os.Bundle bundle, android.accounts.Account account, com.google.android.gms.common.Feature[] featureArr, com.google.android.gms.common.Feature[] featureArr2, boolean z17, int i27, boolean z18, java.lang.String str2) {
        scopeArr = scopeArr == null ? zza : scopeArr;
        bundle = bundle == null ? new android.os.Bundle() : bundle;
        featureArr = featureArr == null ? zzb : featureArr;
        featureArr2 = featureArr2 == null ? zzb : featureArr2;
        this.zzc = i17;
        this.zzd = i18;
        this.zze = i19;
        if ("com.google.android.gms".equals(str)) {
            this.zzf = "com.google.android.gms";
        } else {
            this.zzf = str;
        }
        if (i17 < 2) {
            this.zzj = iBinder != null ? com.google.android.gms.common.internal.AccountAccessor.getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.zzg = iBinder;
            this.zzj = account;
        }
        this.zzh = scopeArr;
        this.zzi = bundle;
        this.zzk = featureArr;
        this.zzl = featureArr2;
        this.zzm = z17;
        this.zzn = i27;
        this.zzo = z18;
        this.zzp = str2;
    }

    public android.os.Bundle getExtraArgs() {
        return this.zzi;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        com.google.android.gms.common.internal.zzn.zza(this, parcel, i17);
    }

    public final java.lang.String zza() {
        return this.zzp;
    }
}

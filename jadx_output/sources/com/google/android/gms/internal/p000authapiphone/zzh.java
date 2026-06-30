package com.google.android.gms.internal.p000authapiphone;

/* loaded from: classes13.dex */
public abstract class zzh extends com.google.android.gms.internal.p000authapiphone.zzb implements com.google.android.gms.internal.p000authapiphone.zzg {
    public zzh() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // com.google.android.gms.internal.p000authapiphone.zzb
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 1) {
            return false;
        }
        zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.p000authapiphone.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
        return true;
    }
}

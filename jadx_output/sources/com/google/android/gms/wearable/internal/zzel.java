package com.google.android.gms.wearable.internal;

/* loaded from: classes13.dex */
public abstract class zzel extends com.google.android.gms.internal.wearable.zzb implements com.google.android.gms.wearable.internal.zzek {
    public zzel() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    @Override // com.google.android.gms.internal.wearable.zzb
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        switch (i17) {
            case 2:
                zza((com.google.android.gms.wearable.internal.zzdw) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdw.CREATOR));
                break;
            case 3:
                zza((com.google.android.gms.wearable.internal.zzfu) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzfu.CREATOR));
                break;
            case 4:
                zza((com.google.android.gms.wearable.internal.zzec) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzec.CREATOR));
                break;
            case 5:
                zzb((com.google.android.gms.common.data.DataHolder) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.common.data.DataHolder.CREATOR));
                break;
            case 6:
                zza((com.google.android.gms.wearable.internal.zzdg) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdg.CREATOR));
                break;
            case 7:
                zza((com.google.android.gms.wearable.internal.zzga) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzga.CREATOR));
                break;
            case 8:
                zza((com.google.android.gms.wearable.internal.zzee) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzee.CREATOR));
                break;
            case 9:
                zza((com.google.android.gms.wearable.internal.zzeg) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzeg.CREATOR));
                break;
            case 10:
                zza((com.google.android.gms.wearable.internal.zzea) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzea.CREATOR));
                break;
            case 11:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                break;
            case 12:
                zza((com.google.android.gms.wearable.internal.zzge) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzge.CREATOR));
                break;
            case 13:
                zza((com.google.android.gms.wearable.internal.zzdy) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdy.CREATOR));
                break;
            case 14:
                zza((com.google.android.gms.wearable.internal.zzfq) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzfq.CREATOR));
                break;
            case 15:
                zza((com.google.android.gms.wearable.internal.zzbt) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzbt.CREATOR));
                break;
            case 16:
                zzb((com.google.android.gms.wearable.internal.zzbt) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzbt.CREATOR));
                break;
            case 17:
                zza((com.google.android.gms.wearable.internal.zzdm) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdm.CREATOR));
                break;
            case 18:
                zza((com.google.android.gms.wearable.internal.zzdo) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdo.CREATOR));
                break;
            case 19:
                zza((com.google.android.gms.wearable.internal.zzbn) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzbn.CREATOR));
                break;
            case 20:
                zza((com.google.android.gms.wearable.internal.zzbp) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzbp.CREATOR));
                break;
            case 21:
            case 24:
            case 25:
            default:
                return false;
            case 22:
                zza((com.google.android.gms.wearable.internal.zzdk) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdk.CREATOR));
                break;
            case 23:
                zza((com.google.android.gms.wearable.internal.zzdi) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdi.CREATOR));
                break;
            case 26:
                zza((com.google.android.gms.wearable.internal.zzf) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzf.CREATOR));
                break;
            case 27:
                zza((com.google.android.gms.wearable.internal.zzfy) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzfy.CREATOR));
                break;
            case 28:
                zza((com.google.android.gms.wearable.internal.zzdr) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdr.CREATOR));
                break;
            case 29:
                zza((com.google.android.gms.wearable.internal.zzdv) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdv.CREATOR));
                break;
            case 30:
                zza((com.google.android.gms.wearable.internal.zzdt) com.google.android.gms.internal.wearable.zzc.zza(parcel, com.google.android.gms.wearable.internal.zzdt.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}

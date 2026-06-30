package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public abstract class zzez extends com.google.android.gms.internal.measurement.zzo implements com.google.android.gms.internal.measurement.zzey {
    public zzez() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzo
    public final boolean dispatchTransaction(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        java.util.Collection zza;
        switch (i17) {
            case 1:
                zza((com.google.android.gms.internal.measurement.zzeu) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzeu.CREATOR), (com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zza((com.google.android.gms.internal.measurement.zzjx) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzjx.CREATOR), (com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zza((com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                zza((com.google.android.gms.internal.measurement.zzeu) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzeu.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                zzb((com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                zza = zza((com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR), com.google.android.gms.internal.measurement.zzp.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 9:
                byte[] zza2 = zza((com.google.android.gms.internal.measurement.zzeu) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzeu.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(zza2);
                return true;
            case 10:
                zza(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                java.lang.String zzc = zzc((com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(zzc);
                return true;
            case 12:
                zza((com.google.android.gms.internal.measurement.zzed) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzed.CREATOR), (com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                zzb((com.google.android.gms.internal.measurement.zzed) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzed.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                zza = zza(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzp.zza(parcel), (com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 15:
                zza = zza(parcel.readString(), parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzp.zza(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 16:
                zza = zza(parcel.readString(), parcel.readString(), (com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 17:
                zza = zze(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(zza);
                return true;
            case 18:
                zzd((com.google.android.gms.internal.measurement.zzdz) com.google.android.gms.internal.measurement.zzp.zza(parcel, com.google.android.gms.internal.measurement.zzdz.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}

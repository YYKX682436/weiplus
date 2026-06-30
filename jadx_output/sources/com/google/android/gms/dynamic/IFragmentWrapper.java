package com.google.android.gms.dynamic;

/* loaded from: classes13.dex */
public interface IFragmentWrapper extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.dynamic.IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static com.google.android.gms.dynamic.IFragmentWrapper asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof com.google.android.gms.dynamic.IFragmentWrapper ? (com.google.android.gms.dynamic.IFragmentWrapper) queryLocalInterface : new com.google.android.gms.dynamic.zza(iBinder);
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            switch (i17) {
                case 2:
                    com.google.android.gms.dynamic.IObjectWrapper zzg = zzg();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzg);
                    return true;
                case 3:
                    android.os.Bundle zzd = zzd();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zzd(parcel2, zzd);
                    return true;
                case 4:
                    int zzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzb);
                    return true;
                case 5:
                    com.google.android.gms.dynamic.IFragmentWrapper zze = zze();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zze);
                    return true;
                case 6:
                    com.google.android.gms.dynamic.IObjectWrapper zzh = zzh();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzh);
                    return true;
                case 7:
                    boolean zzs = zzs();
                    parcel2.writeNoException();
                    int i19 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzs ? 1 : 0);
                    return true;
                case 8:
                    java.lang.String zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(zzj);
                    return true;
                case 9:
                    com.google.android.gms.dynamic.IFragmentWrapper zzf = zzf();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzf);
                    return true;
                case 10:
                    int zzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzc);
                    return true;
                case 11:
                    boolean zzt = zzt();
                    parcel2.writeNoException();
                    int i27 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzt ? 1 : 0);
                    return true;
                case 12:
                    com.google.android.gms.dynamic.IObjectWrapper zzi = zzi();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.common.zzc.zze(parcel2, zzi);
                    return true;
                case 13:
                    boolean zzu = zzu();
                    parcel2.writeNoException();
                    int i28 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzu ? 1 : 0);
                    return true;
                case 14:
                    boolean zzv = zzv();
                    parcel2.writeNoException();
                    int i29 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzv ? 1 : 0);
                    return true;
                case 15:
                    boolean zzw = zzw();
                    parcel2.writeNoException();
                    int i37 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzw ? 1 : 0);
                    return true;
                case 16:
                    boolean zzx = zzx();
                    parcel2.writeNoException();
                    int i38 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzx ? 1 : 0);
                    return true;
                case 17:
                    boolean zzy = zzy();
                    parcel2.writeNoException();
                    int i39 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzy ? 1 : 0);
                    return true;
                case 18:
                    boolean zzz = zzz();
                    parcel2.writeNoException();
                    int i47 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzz ? 1 : 0);
                    return true;
                case 19:
                    boolean zzA = zzA();
                    parcel2.writeNoException();
                    int i48 = com.google.android.gms.internal.common.zzc.zza;
                    parcel2.writeInt(zzA ? 1 : 0);
                    return true;
                case 20:
                    com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzk(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zzf2 = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzl(zzf2);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zzf3 = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzm(zzf3);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zzf4 = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzn(zzf4);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean zzf5 = com.google.android.gms.internal.common.zzc.zzf(parcel);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzo(zzf5);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR);
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzp(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    android.content.Intent intent2 = (android.content.Intent) com.google.android.gms.internal.common.zzc.zza(parcel, android.content.Intent.CREATOR);
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzq(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    com.google.android.gms.dynamic.IObjectWrapper asInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    com.google.android.gms.internal.common.zzc.zzb(parcel);
                    zzr(asInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    boolean zzA();

    int zzb();

    int zzc();

    android.os.Bundle zzd();

    com.google.android.gms.dynamic.IFragmentWrapper zze();

    com.google.android.gms.dynamic.IFragmentWrapper zzf();

    com.google.android.gms.dynamic.IObjectWrapper zzg();

    com.google.android.gms.dynamic.IObjectWrapper zzh();

    com.google.android.gms.dynamic.IObjectWrapper zzi();

    java.lang.String zzj();

    void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper);

    void zzl(boolean z17);

    void zzm(boolean z17);

    void zzn(boolean z17);

    void zzo(boolean z17);

    void zzp(android.content.Intent intent);

    void zzq(android.content.Intent intent, int i17);

    void zzr(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper);

    boolean zzs();

    boolean zzt();

    boolean zzu();

    boolean zzv();

    boolean zzw();

    boolean zzx();

    boolean zzy();

    boolean zzz();
}

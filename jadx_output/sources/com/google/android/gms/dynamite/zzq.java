package com.google.android.gms.dynamite;

/* loaded from: classes13.dex */
public final class zzq extends com.google.android.gms.internal.common.zza {
    public zzq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zze() {
        android.os.Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z17) {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z17 ? 1 : 0);
        android.os.Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z17) {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z17 ? 1 : 0);
        android.os.Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i17) {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i17);
        android.os.Parcel zzB = zzB(2, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i17, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i17);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        android.os.Parcel zzB = zzB(8, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzj(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i17) {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i17);
        android.os.Parcel zzB = zzB(4, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, boolean z17, long j17) {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(z17 ? 1 : 0);
        zza.writeLong(j17);
        android.os.Parcel zzB = zzB(7, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}

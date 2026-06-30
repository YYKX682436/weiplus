package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public final class zzy extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzaa {
    public zzy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        android.os.Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() {
        android.os.Parcel zzB = zzB(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzB.readStrongBinder());
        zzB.recycle();
        return asInterface;
    }
}

package com.google.android.gms.internal.ads_identifier;

/* loaded from: classes13.dex */
public class zza implements android.os.IInterface {
    private final android.os.IBinder zza;
    private final java.lang.String zzb;

    public zza(android.os.IBinder iBinder, java.lang.String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.zza;
    }

    public final android.os.Parcel obtainAndWriteInterfaceToken() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final android.os.Parcel transactAndReadException(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.zza.transact(i17, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (java.lang.RuntimeException e17) {
                obtain.recycle();
                throw e17;
            }
        } finally {
            parcel.recycle();
        }
    }
}

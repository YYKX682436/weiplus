package com.google.android.gms.internal.gcm;

/* loaded from: classes13.dex */
public class zzd implements android.os.IInterface {
    private final android.os.IBinder zzd;
    private final java.lang.String zze;

    public zzd(android.os.IBinder iBinder, java.lang.String str) {
        this.zzd = iBinder;
        this.zze = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.zzd;
    }

    public final android.os.Parcel obtainAndWriteInterfaceToken() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zze);
        return obtain;
    }

    public final void transactAndReadExceptionReturnVoid(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.zzd.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void transactOneway(int i17, android.os.Parcel parcel) {
        try {
            this.zzd.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

package com.google.android.gms.internal.auth;

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

    public final android.os.Parcel transactAndReadException(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.zzd.transact(i17, parcel, obtain, 0);
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

    public final void transactAndReadExceptionReturnVoid(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.zzd.transact(i17, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}

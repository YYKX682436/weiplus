package com.google.android.gms.internal.measurement;

/* loaded from: classes13.dex */
public class zzn implements android.os.IInterface {
    private final android.os.IBinder zzqi;
    private final java.lang.String zzqj;

    public zzn(android.os.IBinder iBinder, java.lang.String str) {
        this.zzqi = iBinder;
        this.zzqj = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.zzqi;
    }

    public final android.os.Parcel obtainAndWriteInterfaceToken() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zzqj);
        return obtain;
    }

    public final android.os.Parcel transactAndReadException(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.zzqi.transact(i17, parcel, obtain, 0);
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
            this.zzqi.transact(i17, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void transactOneway(int i17, android.os.Parcel parcel) {
        try {
            this.zzqi.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

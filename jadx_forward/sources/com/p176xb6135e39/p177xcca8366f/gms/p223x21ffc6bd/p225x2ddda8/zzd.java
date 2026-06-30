package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

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

    /* renamed from: obtainAndWriteInterfaceToken */
    public final android.os.Parcel m18796x3e4375ad() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zze);
        return obtain;
    }

    /* renamed from: transactAndReadException */
    public final android.os.Parcel m18797x5cf17fcc(int i17, android.os.Parcel parcel) {
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

    /* renamed from: transactAndReadExceptionReturnVoid */
    public final void m18798x8523f7d0(int i17, android.os.Parcel parcel) {
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

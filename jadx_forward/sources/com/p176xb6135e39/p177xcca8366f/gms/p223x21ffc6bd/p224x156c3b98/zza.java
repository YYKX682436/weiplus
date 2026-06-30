package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p224x156c3b98;

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

    /* renamed from: obtainAndWriteInterfaceToken */
    public final android.os.Parcel m18780x3e4375ad() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    /* renamed from: transactAndReadException */
    public final android.os.Parcel m18781x5cf17fcc(int i17, android.os.Parcel parcel) {
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

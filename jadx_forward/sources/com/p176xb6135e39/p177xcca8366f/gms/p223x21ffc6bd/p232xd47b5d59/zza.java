package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p232xd47b5d59;

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
    public final android.os.Parcel m19423x3e4375ad() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    /* renamed from: transactAndReadExceptionReturnVoid */
    public final void m19424x8523f7d0(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.zza.transact(i17, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: transactOneway */
    public final void m19425xfcc7453(int i17, android.os.Parcel parcel) {
        try {
            this.zza.transact(i17, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

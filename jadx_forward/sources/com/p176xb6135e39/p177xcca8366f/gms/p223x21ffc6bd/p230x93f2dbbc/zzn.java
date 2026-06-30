package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* loaded from: classes13.dex */
public class zzn implements android.os.IInterface {

    /* renamed from: zzqi */
    private final android.os.IBinder f7148x394d58;

    /* renamed from: zzqj */
    private final java.lang.String f7149x394d59;

    public zzn(android.os.IBinder iBinder, java.lang.String str) {
        this.f7148x394d58 = iBinder;
        this.f7149x394d59 = str;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f7148x394d58;
    }

    /* renamed from: obtainAndWriteInterfaceToken */
    public final android.os.Parcel m19337x3e4375ad() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        obtain.writeInterfaceToken(this.f7149x394d59);
        return obtain;
    }

    /* renamed from: transactAndReadException */
    public final android.os.Parcel m19338x5cf17fcc(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            try {
                this.f7148x394d58.transact(i17, parcel, obtain, 0);
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
    public final void m19339x8523f7d0(int i17, android.os.Parcel parcel) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            this.f7148x394d58.transact(i17, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: transactOneway */
    public final void m19340xfcc7453(int i17, android.os.Parcel parcel) {
        try {
            this.f7148x394d58.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

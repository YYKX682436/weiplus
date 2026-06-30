package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes7.dex */
public class l4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f229602d;

    public l4(android.os.IBinder iBinder) {
        this.f229602d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4
    public qc3.f B5(java.lang.String str, qc3.c cVar) {
        qc3.f dVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
            obtain.writeString(str);
            obtain.writeStrongInterface(cVar);
            this.f229602d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = qc3.e.f443045d;
            if (readStrongBinder == null) {
                dVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
                dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof qc3.f)) ? new qc3.d(readStrongBinder) : (qc3.f) queryLocalInterface;
            }
            return dVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f229602d;
    }
}

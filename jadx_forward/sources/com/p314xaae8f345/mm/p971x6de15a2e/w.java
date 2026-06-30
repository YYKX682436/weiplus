package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class w implements com.p314xaae8f345.mm.p971x6de15a2e.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153689d;

    public w(android.os.IBinder iBinder) {
        this.f153689d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.y
    public void Q7(int i17, int i18, long j17, long j18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IIpxxCallback_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeLong(j17);
            obtain.writeLong(j18);
            this.f153689d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153689d;
    }
}

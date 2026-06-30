package com.tencent.mm.network;

/* loaded from: classes8.dex */
public class q0 implements com.tencent.mm.network.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f72124d;

    public q0(android.os.IBinder iBinder) {
        this.f72124d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f72124d;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IOnNetworkChange_AIDL");
            obtain.writeInt(i17);
            this.f72124d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

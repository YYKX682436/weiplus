package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes8.dex */
public class q0 implements com.p314xaae8f345.mm.p971x6de15a2e.s0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153657d;

    public q0(android.os.IBinder iBinder) {
        this.f153657d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153657d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.s0
    /* renamed from: onNetworkChange */
    public void mo8869xde9f63df(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IOnNetworkChange_AIDL");
            obtain.writeInt(i17);
            this.f153657d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

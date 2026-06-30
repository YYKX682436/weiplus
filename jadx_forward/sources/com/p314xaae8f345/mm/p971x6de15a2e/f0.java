package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class f0 implements com.p314xaae8f345.mm.p971x6de15a2e.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153518d;

    public f0(android.os.IBinder iBinder) {
        this.f153518d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.h0
    public int Wh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
            this.f153518d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153518d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.h0
    public boolean q5(com.p314xaae8f345.mm.p971x6de15a2e.s0 s0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
            obtain.writeStrongInterface(s0Var);
            this.f153518d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

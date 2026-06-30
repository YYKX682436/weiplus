package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class f0 implements com.tencent.mm.network.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f71985d;

    public f0(android.os.IBinder iBinder) {
        this.f71985d = iBinder;
    }

    @Override // com.tencent.mm.network.h0
    public int Wh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
            this.f71985d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f71985d;
    }

    @Override // com.tencent.mm.network.h0
    public boolean q5(com.tencent.mm.network.s0 s0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.INetworkEvent_AIDL");
            obtain.writeStrongInterface(s0Var);
            this.f71985d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

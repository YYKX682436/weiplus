package com.tencent.mm.network;

/* loaded from: classes8.dex */
public abstract class r0 extends android.os.Binder implements com.tencent.mm.network.s0 {
    static final int TRANSACTION_onNetworkChange = 1;

    public r0() {
        attachInterface(this, "com.tencent.mm.network.IOnNetworkChange_AIDL");
    }

    public static com.tencent.mm.network.s0 asInterface(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.network.s0)) ? new com.tencent.mm.network.q0(iBinder) : (com.tencent.mm.network.s0) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.IOnNetworkChange_AIDL");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        onNetworkChange(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}

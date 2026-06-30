package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes8.dex */
public abstract class r0 extends android.os.Binder implements com.p314xaae8f345.mm.p971x6de15a2e.s0 {

    /* renamed from: TRANSACTION_onNetworkChange */
    static final int f32687xb83be45e = 1;

    public r0() {
        attachInterface(this, "com.tencent.mm.network.IOnNetworkChange_AIDL");
    }

    /* renamed from: asInterface */
    public static com.p314xaae8f345.mm.p971x6de15a2e.s0 m48355xbd0d1927(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IOnNetworkChange_AIDL");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.s0)) ? new com.p314xaae8f345.mm.p971x6de15a2e.q0(iBinder) : (com.p314xaae8f345.mm.p971x6de15a2e.s0) queryLocalInterface;
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
        mo8869xde9f63df(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}

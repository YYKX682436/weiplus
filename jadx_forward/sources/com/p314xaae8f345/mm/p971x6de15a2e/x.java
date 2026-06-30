package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public abstract class x extends android.os.Binder implements com.p314xaae8f345.mm.p971x6de15a2e.y {
    public x() {
        attachInterface(this, "com.tencent.mm.network.IIpxxCallback_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.IIpxxCallback_AIDL");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        ((com.p314xaae8f345.mm.app.f3) this).Q7(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong());
        parcel2.writeNoException();
        return true;
    }
}

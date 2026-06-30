package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class b1 extends android.os.Binder implements com.tencent.mm.network.c1 {
    public b1() {
        attachInterface(this, "com.tencent.mm.network.ISpeedTestCallback_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.ISpeedTestCallback_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.ISpeedTestCallback_AIDL");
            return true;
        }
        if (i17 == 1) {
            le(parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            Za(parcel.readInt() != 0, parcel.readFloat(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}

package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class e1 extends android.os.Binder implements com.tencent.mm.network.f1 {
    public e1() {
        attachInterface(this, "com.tencent.mm.network.IWorkerCallback_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.IWorkerCallback_AIDL");
            return true;
        }
        if (i17 == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            ((com.tencent.mm.app.e0) this).Z8(parcel.readInt() != 0 ? com.tencent.mm.network.AccInfo.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
        }
        return true;
    }
}

package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class d0 extends android.os.Binder implements com.tencent.mm.network.e0 {
    public d0() {
        attachInterface(this, "com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        ((gm0.q) this).networkAnalysisCallBack(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}

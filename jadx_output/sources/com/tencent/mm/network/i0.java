package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class i0 implements com.tencent.mm.network.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f72024d;

    public i0(android.os.IBinder iBinder) {
        this.f72024d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f72024d;
    }

    @Override // com.tencent.mm.network.k0
    public void ri(com.tencent.mm.network.z0 z0Var, int i17, int i18, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IOnAutoAuth_AIDL");
            obtain.writeStrongInterface(z0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            this.f72024d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

package com.tencent.mm.network;

/* loaded from: classes7.dex */
public class z implements com.tencent.mm.network.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f72186d;

    public z(android.os.IBinder iBinder) {
        this.f72186d = iBinder;
    }

    @Override // com.tencent.mm.network.b0
    public void Xe(boolean z17, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            obtain.writeInt(i17);
            this.f72186d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f72186d;
    }
}

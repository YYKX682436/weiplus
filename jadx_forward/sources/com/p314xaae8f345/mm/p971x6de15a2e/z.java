package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes7.dex */
public class z implements com.p314xaae8f345.mm.p971x6de15a2e.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153719d;

    public z(android.os.IBinder iBinder) {
        this.f153719d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.b0
    public void Xe(boolean z17, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            obtain.writeInt(i17);
            this.f153719d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153719d;
    }
}

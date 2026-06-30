package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class i0 implements com.p314xaae8f345.mm.p971x6de15a2e.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153557d;

    public i0(android.os.IBinder iBinder) {
        this.f153557d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153557d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.k0
    public void ri(com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, int i17, int i18, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IOnAutoAuth_AIDL");
            obtain.writeStrongInterface(z0Var);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            this.f153557d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

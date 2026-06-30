package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class m0 implements com.p314xaae8f345.mm.p971x6de15a2e.o0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153606d;

    public m0(android.os.IBinder iBinder) {
        this.f153606d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153606d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.o0
    public void j4(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, byte[] bArr, int i27, int i28) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IOnGYNetEnd_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeString(str);
            obtain.writeStrongInterface(z0Var);
            obtain.writeByteArray(bArr);
            obtain.writeInt(i27);
            obtain.writeInt(i28);
            this.f153606d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

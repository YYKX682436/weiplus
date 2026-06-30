package com.tencent.mm.network;

/* loaded from: classes8.dex */
public class d1 implements com.tencent.mm.network.f1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f71978d;

    public d1(android.os.IBinder iBinder) {
        this.f71978d = iBinder;
    }

    @Override // com.tencent.mm.network.f1
    public boolean R0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IWorkerCallback_AIDL");
            this.f71978d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.f1
    public void Z8(com.tencent.mm.network.AccInfo accInfo) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IWorkerCallback_AIDL");
            if (accInfo != null) {
                obtain.writeInt(1);
                accInfo.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f71978d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f71978d;
    }
}

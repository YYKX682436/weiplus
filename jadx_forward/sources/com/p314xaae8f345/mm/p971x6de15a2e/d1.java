package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes8.dex */
public class d1 implements com.p314xaae8f345.mm.p971x6de15a2e.f1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153511d;

    public d1(android.os.IBinder iBinder) {
        this.f153511d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.f1
    public boolean R0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IWorkerCallback_AIDL");
            this.f153511d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.f1
    public void Z8(com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IWorkerCallback_AIDL");
            if (binderC11173x1cfac0af != null) {
                obtain.writeInt(1);
                binderC11173x1cfac0af.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f153511d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153511d;
    }
}

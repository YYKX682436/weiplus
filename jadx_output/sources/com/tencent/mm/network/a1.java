package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class a1 implements com.tencent.mm.network.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f71959d;

    public a1(android.os.IBinder iBinder) {
        this.f71959d = iBinder;
    }

    @Override // com.tencent.mm.network.c1
    public void Za(boolean z17, float f17, float f18, boolean z18, int i17, int i18, int i19, boolean z19, int i27, int i28, int i29) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.ISpeedTestCallback_AIDL");
            int i37 = 1;
            obtain.writeInt(z17 ? 1 : 0);
            obtain.writeFloat(f17);
            obtain.writeFloat(f18);
            obtain.writeInt(z18 ? 1 : 0);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            if (!z19) {
                i37 = 0;
            }
            obtain.writeInt(i37);
            obtain.writeInt(i27);
            obtain.writeInt(i28);
            obtain.writeInt(i29);
            this.f71959d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f71959d;
    }

    @Override // com.tencent.mm.network.c1
    public void le(boolean z17, float f17, float f18, boolean z18, int i17, int i18, int i19) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.ISpeedTestCallback_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            obtain.writeFloat(f17);
            obtain.writeFloat(f18);
            obtain.writeInt(z18 ? 1 : 0);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            this.f71959d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

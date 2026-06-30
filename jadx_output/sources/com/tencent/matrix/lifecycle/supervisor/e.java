package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public class e implements com.tencent.matrix.lifecycle.supervisor.g {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f52836d;

    public e(android.os.IBinder iBinder) {
        this.f52836d = iBinder;
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public void E2(java.lang.String str, java.lang.String str2, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i17);
            if (!this.f52836d.transact(2, obtain, obtain2, 0)) {
                int i18 = com.tencent.matrix.lifecycle.supervisor.f.f52837d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public void J8(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i17);
            obtain.writeInt(z17 ? 1 : 0);
            if (!this.f52836d.transact(3, obtain, obtain2, 0)) {
                int i18 = com.tencent.matrix.lifecycle.supervisor.f.f52837d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f52836d;
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public void c5(java.lang.String str, java.lang.String str2, boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(z17 ? 1 : 0);
            if (!this.f52836d.transact(1, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.f.f52837d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.g
    public com.tencent.matrix.util.MemInfo y5() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            if (!this.f52836d.transact(4, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.f.f52837d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? com.tencent.matrix.util.MemInfo.CREATOR.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

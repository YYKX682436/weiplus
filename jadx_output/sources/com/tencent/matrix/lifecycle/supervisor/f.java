package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public abstract class f extends android.os.Binder implements com.tencent.matrix.lifecycle.supervisor.g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f52837d = 0;

    public f() {
        attachInterface(this, "com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            ((com.tencent.matrix.lifecycle.supervisor.r) this).c5(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
        if (i17 == 2) {
            parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            ((com.tencent.matrix.lifecycle.supervisor.r) this).E2(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        if (i17 == 3) {
            parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            ((com.tencent.matrix.lifecycle.supervisor.r) this).J8(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
            parcel2.writeNoException();
            return true;
        }
        if (i17 != 4) {
            if (i17 != 1598968902) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeString("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            return true;
        }
        parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
        com.tencent.matrix.util.MemInfo y57 = ((com.tencent.matrix.lifecycle.supervisor.r) this).y5();
        parcel2.writeNoException();
        parcel2.writeInt(1);
        y57.writeToParcel(parcel2, 1);
        return true;
    }
}

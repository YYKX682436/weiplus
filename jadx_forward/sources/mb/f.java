package mb;

/* loaded from: classes12.dex */
public abstract class f extends android.os.Binder implements mb.g {
    public f() {
        attachInterface(this, "com.huawei.securitymgr.IAuthenticationClient");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 != 1) {
            if (i17 != 1598968902) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeString("com.huawei.securitymgr.IAuthenticationClient");
            return true;
        }
        parcel.enforceInterface("com.huawei.securitymgr.IAuthenticationClient");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        byte[] createByteArray = parcel.createByteArray();
        mb.c cVar = ((mb.b) this).f406811d.f406815c;
        cVar.sendMessage(cVar.obtainMessage(readInt, readInt2, readInt3, createByteArray));
        parcel2.writeNoException();
        return true;
    }
}

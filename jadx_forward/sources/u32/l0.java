package u32;

/* loaded from: classes13.dex */
public abstract class l0 extends android.os.Binder implements u32.m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f505855d = 0;

    public l0() {
        attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        u32.w0 u0Var;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        java.lang.String readString = parcel.readString();
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            u0Var = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
            u0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof u32.w0)) ? new u32.u0(readStrongBinder) : (u32.w0) queryLocalInterface;
        }
        ((w32.n) this).wh(readLong, readInt, readInt2, readString, u0Var);
        parcel2.writeNoException();
        return true;
    }
}

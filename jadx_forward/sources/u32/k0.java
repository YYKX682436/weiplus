package u32;

/* loaded from: classes13.dex */
public class k0 implements u32.m0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505850d;

    public k0(android.os.IBinder iBinder) {
        this.f505850d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505850d;
    }

    @Override // u32.m0
    public void wh(long j17, int i17, int i18, java.lang.String str, u32.w0 w0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
            obtain.writeLong(j17);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            obtain.writeStrongInterface(w0Var);
            this.f505850d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

package u32;

/* loaded from: classes13.dex */
public class e0 implements u32.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505822d;

    public e0(android.os.IBinder iBinder) {
        this.f505822d = iBinder;
    }

    @Override // u32.g0
    public void N6(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnScanCallback_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeInt(i19);
            obtain.writeByteArray(bArr);
            this.f505822d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505822d;
    }
}

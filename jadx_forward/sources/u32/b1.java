package u32;

/* loaded from: classes13.dex */
public class b1 implements u32.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505809d;

    public b1(android.os.IBinder iBinder) {
        this.f505809d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505809d;
    }

    @Override // u32.d1
    public void bb(long j17, byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnRecv_AIDL");
            obtain.writeLong(j17);
            obtain.writeByteArray(bArr);
            this.f505809d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

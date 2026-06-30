package u32;

/* loaded from: classes13.dex */
public class e1 implements u32.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505823d;

    public e1(android.os.IBinder iBinder) {
        this.f505823d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505823d;
    }

    @Override // u32.g1
    public void o4(long j17, int i17, int i18, java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.ISimpleBTOnSendEnd_AIDL");
            obtain.writeLong(j17);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            this.f505823d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

package u32;

/* loaded from: classes13.dex */
public class h0 implements u32.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505832d;

    public h0(android.os.IBinder iBinder) {
        this.f505832d = iBinder;
    }

    @Override // u32.j0
    public void Y6(long j17, int i17, int i18, int i19, long j18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IBTOnStateChange_AIDL");
            obtain.writeLong(j17);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeLong(j18);
            this.f505832d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505832d;
    }
}

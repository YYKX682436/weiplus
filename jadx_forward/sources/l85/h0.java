package l85;

/* loaded from: classes12.dex */
public class h0 implements l85.j0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f398709d;

    public h0(android.os.IBinder iBinder) {
        this.f398709d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f398709d;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
            obtain.writeStrongBinder(iBinder);
            this.f398709d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

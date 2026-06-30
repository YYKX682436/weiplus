package lb;

/* loaded from: classes13.dex */
public class g implements lb.i {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f399193d;

    public g(android.os.IBinder iBinder) {
        this.f399193d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f399193d;
    }

    public boolean d(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.huawei.nfc.sdk.service.ICUPOnlinePayService");
            obtain.writeString(str);
            this.f399193d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

package t7;

/* loaded from: classes8.dex */
public class a implements t7.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f497557d;

    public a(android.os.IBinder iBinder) {
        this.f497557d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f497557d;
    }

    public java.lang.String d(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.coolpad.deviceidsupport.IDeviceIdManager");
            obtain.writeString(str);
            this.f497557d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

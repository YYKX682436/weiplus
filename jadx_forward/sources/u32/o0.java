package u32;

/* loaded from: classes13.dex */
public class o0 implements u32.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505870d;

    public o0(android.os.IBinder iBinder) {
        this.f505870d = iBinder;
    }

    @Override // u32.q0
    public android.os.Bundle Rb(int i17, android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceInvoker_AIDL");
            obtain.writeInt(i17);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f505870d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return (android.os.Bundle) (obtain2.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(obtain2) : null);
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505870d;
    }
}

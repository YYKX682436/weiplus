package k55;

/* loaded from: classes8.dex */
public abstract class g extends android.os.Binder implements k55.h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f386000d = 0;

    public g() {
        attachInterface(this, "com.tencent.mm.remoteservice.ICommRemoteServer");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.remoteservice.ICommRemoteServer");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.remoteservice.ICommRemoteServer");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        java.lang.String readString = parcel.readString();
        java.lang.String readString2 = parcel.readString();
        android.os.Bundle bundle = (android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
        ((k55.i) this).Na(readString, readString2, bundle, k55.d.m142016xbd0d1927(parcel.readStrongBinder()));
        parcel2.writeNoException();
        if (bundle != null) {
            parcel2.writeInt(1);
            bundle.writeToParcel(parcel2, 1);
        } else {
            parcel2.writeInt(0);
        }
        return true;
    }
}

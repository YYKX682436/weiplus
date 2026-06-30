package b;

/* loaded from: classes13.dex */
public abstract class e extends android.os.Binder implements android.os.IInterface {
    public e() {
        attachInterface(this, "android.support.customtabs.IPostMessageService");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        android.os.Bundle bundle;
        android.os.Parcel obtain;
        android.os.Parcel obtain2;
        if (i17 == 2) {
            parcel.enforceInterface("android.support.customtabs.IPostMessageService");
            b.c d17 = b.b.d(parcel.readStrongBinder());
            bundle = parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null;
            b.a aVar = (b.a) d17;
            aVar.getClass();
            obtain = android.os.Parcel.obtain();
            obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                if (bundle != null) {
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                } else {
                    obtain.writeInt(0);
                }
                aVar.f97716d.transact(4, obtain, obtain2, 0);
                obtain2.readException();
                obtain2.recycle();
                obtain.recycle();
                parcel2.writeNoException();
                return true;
            } finally {
            }
        }
        if (i17 != 3) {
            if (i17 != 1598968902) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeString("android.support.customtabs.IPostMessageService");
            return true;
        }
        parcel.enforceInterface("android.support.customtabs.IPostMessageService");
        b.c d18 = b.b.d(parcel.readStrongBinder());
        java.lang.String readString = parcel.readString();
        bundle = parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null;
        b.a aVar2 = (b.a) d18;
        aVar2.getClass();
        obtain = android.os.Parcel.obtain();
        obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
            obtain.writeString(readString);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar2.f97716d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            parcel2.writeNoException();
            return true;
        } finally {
        }
    }
}

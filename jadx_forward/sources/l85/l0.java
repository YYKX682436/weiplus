package l85;

/* loaded from: classes12.dex */
public abstract class l0 extends android.os.Binder implements l85.n0 {
    public l0() {
        attachInterface(this, "com.tencent.mm.service.IMMServiceStub_AIDL");
    }

    public static l85.n0 d(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof l85.n0)) ? new l85.k0(iBinder) : (l85.n0) queryLocalInterface;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        l85.j0 h0Var;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.service.IMMServiceStub_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.service.IMMServiceStub_AIDL");
            return true;
        }
        if (i17 == 1) {
            android.content.Intent intent = (android.content.Intent) l85.m0.a(parcel, android.content.Intent.CREATOR);
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                h0Var = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.service.IMMServiceConnectionStub_AIDL");
                h0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof l85.j0)) ? new l85.h0(readStrongBinder) : (l85.j0) queryLocalInterface;
            }
            ((l85.a) this).og(intent, h0Var);
            parcel2.writeNoException();
        } else if (i17 == 2) {
            ((l85.a) this).nb((android.content.Intent) l85.m0.a(parcel, android.content.Intent.CREATOR));
            parcel2.writeNoException();
        } else if (i17 == 3) {
            ((l85.a) this).mo145315x6e4047f3((android.content.Intent) l85.m0.a(parcel, android.content.Intent.CREATOR));
            parcel2.writeNoException();
        } else {
            if (i17 != 4) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            ((l85.a) this).mo145316x29afb053((android.content.Intent) l85.m0.a(parcel, android.content.Intent.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}

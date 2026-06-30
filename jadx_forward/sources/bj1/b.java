package bj1;

/* loaded from: classes7.dex */
public abstract class b extends android.os.Binder implements bj1.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f102672d = 0;

    public b() {
        attachInterface(this, "com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        bj1.e dVar;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
            return true;
        }
        if (i17 == 1) {
            int c47 = ((xg1.f) this).c4(parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(c47);
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            android.os.IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                dVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCallback");
                dVar = (queryLocalInterface == null || !(queryLocalInterface instanceof bj1.e)) ? new bj1.d(readStrongBinder) : (bj1.e) queryLocalInterface;
            }
            xg1.f fVar = (xg1.f) this;
            fVar.f535902e.m51874x6c4ebec7(dVar);
            if (dVar != null) {
                bj1.d dVar2 = (bj1.d) dVar;
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCallback");
                    obtain.writeStrongBinder(fVar);
                    dVar2.f102673d.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            parcel2.writeNoException();
        }
        return true;
    }
}

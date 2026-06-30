package bj1;

/* loaded from: classes7.dex */
public class a implements bj1.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f21138d;

    public a(android.os.IBinder iBinder) {
        this.f21138d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f21138d;
    }

    @Override // bj1.c
    public int c4(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.appbrand.preloading.IAppBrandProgressTriggerCall");
            obtain.writeInt(i17);
            this.f21138d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

package u31;

/* loaded from: classes12.dex */
public class a implements u31.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505787d;

    public a(android.os.IBinder iBinder) {
        this.f505787d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505787d;
    }

    @Override // u31.c
    public void si(int i17, int i18, int i19, int i27) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeInt(i27);
            this.f505787d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

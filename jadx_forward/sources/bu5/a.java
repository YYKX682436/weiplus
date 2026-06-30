package bu5;

/* loaded from: classes15.dex */
public class a implements bu5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f106164d;

    public a(android.os.IBinder iBinder) {
        this.f106164d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f106164d;
    }

    public com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25622x1e242462 d(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
            obtain.writeString(str);
            if (!this.f106164d.transact(13, obtain, obtain2, 0)) {
                int i17 = bu5.b.f106165d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? com.p314xaae8f345.p2939x688c445.p2942x51f5ebc8.C25622x1e242462.f47019x681a0c0c.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public int e(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
            obtain.writeInt(i17);
            if (!this.f106164d.transact(7, obtain, obtain2, 0)) {
                int i18 = bu5.b.f106165d;
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

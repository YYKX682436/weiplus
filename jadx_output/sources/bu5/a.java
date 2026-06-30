package bu5;

/* loaded from: classes15.dex */
public class a implements bu5.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f24631d;

    public a(android.os.IBinder iBinder) {
        this.f24631d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f24631d;
    }

    public com.tencent.soter.soterserver.SoterExtraParam d(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.soter.soterserver.ISoterService");
            obtain.writeString(str);
            if (!this.f24631d.transact(13, obtain, obtain2, 0)) {
                int i17 = bu5.b.f24632d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? com.tencent.soter.soterserver.SoterExtraParam.CREATOR.createFromParcel(obtain2) : null;
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
            if (!this.f24631d.transact(7, obtain, obtain2, 0)) {
                int i18 = bu5.b.f24632d;
            }
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

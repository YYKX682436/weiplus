package e;

/* loaded from: classes13.dex */
public abstract class b extends android.os.Binder implements e.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f327017d = 0;

    public b() {
        attachInterface(this, e.c.F0);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        java.lang.String str = e.c.F0;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i17 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        ((e.e) this).V5(parcel.readInt(), (android.os.Bundle) (parcel.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(parcel) : null));
        return true;
    }
}

package e;

/* loaded from: classes13.dex */
public class a implements e.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f327016d;

    public a(android.os.IBinder iBinder) {
        this.f327016d = iBinder;
    }

    @Override // e.c
    public void V5(int i17, android.os.Bundle bundle) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken(e.c.F0);
            obtain.writeInt(i17);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f327016d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f327016d;
    }
}

package p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296;

/* loaded from: classes15.dex */
public class a implements p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f90501d;

    public a(android.os.IBinder iBinder) {
        this.f90501d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f90501d;
    }

    @Override // p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.c
    public void bj(p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0049x5ee9be38 c0049x5ee9be38) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            if (c0049x5ee9be38 != null) {
                obtain.writeInt(1);
                c0049x5ee9be38.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f90501d.transact(3, obtain, null, 1)) {
                int i17 = p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.b.f90502d;
            }
        } finally {
            obtain.recycle();
        }
    }
}

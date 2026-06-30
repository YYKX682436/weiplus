package ah4;

/* loaded from: classes13.dex */
public class f implements ah4.h {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f86533d;

    public f(android.os.IBinder iBinder) {
        this.f86533d = iBinder;
    }

    @Override // ah4.h
    public void A4(int i17, int i18, boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(z17 ? 1 : 0);
            this.f86533d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f86533d;
    }
}

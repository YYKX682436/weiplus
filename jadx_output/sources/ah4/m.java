package ah4;

/* loaded from: classes13.dex */
public abstract class m extends android.os.Binder implements ah4.n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5004d = 0;

    public m() {
        attachInterface(this, "com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.talkroom.component.ITalkRoomPlayer_AIDL");
            return true;
        }
        if (i17 == 1) {
            ((ah4.a0) this).a1();
            parcel2.writeNoException();
        } else if (i17 == 2) {
            ((ah4.a0) this).u();
            parcel2.writeNoException();
        } else if (i17 == 3) {
            ((ah4.a0) this).release();
            parcel2.writeNoException();
        } else if (i17 == 4) {
            int o17 = ((ah4.a0) this).o1();
            parcel2.writeNoException();
            parcel2.writeInt(o17);
        } else {
            if (i17 != 5) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            ((ah4.a0) this).start();
            parcel2.writeNoException();
        }
        return true;
    }
}

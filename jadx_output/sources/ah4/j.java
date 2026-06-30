package ah4;

/* loaded from: classes13.dex */
public abstract class j extends android.os.Binder implements ah4.k {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5002d = 0;

    public j() {
        attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.talkroom.component.IMicRecoder_AIDL");
            return true;
        }
        if (i17 == 1) {
            ((ah4.p) this).bf();
            parcel2.writeNoException();
        } else if (i17 == 2) {
            ((ah4.p) this).Pe();
            parcel2.writeNoException();
        } else if (i17 == 3) {
            ((ah4.p) this).bf();
            parcel2.writeNoException();
        } else if (i17 == 4) {
            int o17 = ((ah4.p) this).o1();
            parcel2.writeNoException();
            parcel2.writeInt(o17);
        } else {
            if (i17 != 5) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // ah4.k
    public void release() {
        bf();
    }
}

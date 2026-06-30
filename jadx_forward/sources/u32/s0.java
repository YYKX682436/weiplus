package u32;

/* loaded from: classes13.dex */
public abstract class s0 extends android.os.Binder implements u32.t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f505897d = 0;

    public s0() {
        attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
            return true;
        }
        if (i17 == 1) {
            long mo167498xbdf72787 = ((w32.p) this).mo167498xbdf72787();
            parcel2.writeNoException();
            parcel2.writeLong(mo167498xbdf72787);
        } else if (i17 == 2) {
            byte[] z96 = ((w32.p) this).z9();
            parcel2.writeNoException();
            parcel2.writeByteArray(z96);
        } else if (i17 == 3) {
            int Hf = ((w32.p) this).Hf();
            parcel2.writeNoException();
            parcel2.writeInt(Hf);
        } else if (i17 == 4) {
            short s17 = ((w32.p) this).f524231e.f369653b;
            parcel2.writeNoException();
            parcel2.writeInt(s17);
        } else {
            if (i17 != 5) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            int W5 = ((w32.p) this).W5();
            parcel2.writeNoException();
            parcel2.writeInt(W5);
        }
        return true;
    }
}

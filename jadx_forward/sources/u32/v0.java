package u32;

/* loaded from: classes13.dex */
public abstract class v0 extends android.os.Binder implements u32.w0 {
    public v0() {
        attachInterface(this, "com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
            return true;
        }
        if (i17 == 1) {
            u32.t0 mo167500x2d63726f = ((w32.o) this).mo167500x2d63726f();
            parcel2.writeNoException();
            parcel2.writeStrongInterface(mo167500x2d63726f);
        } else {
            if (i17 != 2) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            u32.m0 Ia = ((w32.o) this).Ia();
            parcel2.writeNoException();
            parcel2.writeStrongInterface(Ia);
        }
        return true;
    }
}

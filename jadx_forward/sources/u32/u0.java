package u32;

/* loaded from: classes13.dex */
public class u0 implements u32.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f505906d;

    public u0(android.os.IBinder iBinder) {
        this.f505906d = iBinder;
    }

    @Override // u32.w0
    public u32.m0 Ia() {
        u32.m0 k0Var;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
            this.f505906d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = u32.l0.f505855d;
            if (readStrongBinder == null) {
                k0Var = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IBTOnTaskEnd_AIDL");
                k0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof u32.m0)) ? new u32.k0(readStrongBinder) : (u32.m0) queryLocalInterface;
            }
            return k0Var;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f505906d;
    }

    @Override // u32.w0
    /* renamed from: getReqObj */
    public u32.t0 mo167500x2d63726f() {
        u32.t0 r0Var;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.exdevice.service.IExDeviceTask_AIDL");
            this.f505906d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = u32.s0.f505897d;
            if (readStrongBinder == null) {
                r0Var = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.exdevice.service.IExDeviceTaskReq_AIDL");
                r0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof u32.t0)) ? new u32.r0(readStrongBinder) : (u32.t0) queryLocalInterface;
            }
            return r0Var;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

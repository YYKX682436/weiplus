package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.shadow.dynamic.host.PpsBinder */
/* loaded from: classes13.dex */
public class BinderC25554x1edf1dd extends android.os.Binder {

    /* renamed from: DESCRIPTOR */
    static final java.lang.String f46736xf04ebf6f = "com.tencent.shadow.dynamic.host.PpsBinder";

    /* renamed from: TRANSACTION_CODE_FAILED_EXCEPTION */
    static final int f46737xde1193fe = 1;

    /* renamed from: TRANSACTION_CODE_NO_EXCEPTION */
    static final int f46738xcf025102 = 0;

    /* renamed from: TRANSACTION_checkPpsId */
    static final int f46739xde6ce6e7 = 10;

    /* renamed from: TRANSACTION_exit */
    static final int f46740x307e91ff = 4;

    /* renamed from: TRANSACTION_getPluginLoader */
    static final int f46741x941f2c1b = 6;

    /* renamed from: TRANSACTION_getPpsStatus */
    static final int f46742xb79d6570 = 5;

    /* renamed from: TRANSACTION_initCrashHandlerByFd */
    static final int f46743x3ea737c9 = 9;

    /* renamed from: TRANSACTION_loadPluginLoader */
    static final int f46744x9d33988d = 2;

    /* renamed from: TRANSACTION_loadPluginLoaderByApk */
    static final int f46745xffc0c9b8 = 8;

    /* renamed from: TRANSACTION_loadRuntime */
    static final int f46746x4980c11 = 1;

    /* renamed from: TRANSACTION_setHostOpenedFds */
    static final int f46747x4d58bfa3 = 11;

    /* renamed from: TRANSACTION_setSystemService */
    static final int f46748x995c9ba5 = 7;

    /* renamed from: TRANSACTION_setUuidManager */
    static final int f46749x95fcc951 = 3;

    /* renamed from: mPps */
    private final com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.ServiceC25553xc80f4f79 f46750x32c6c6;

    public BinderC25554x1edf1dd(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.ServiceC25553xc80f4f79 serviceC25553xc80f4f79) {
        this.f46750x32c6c6 = serviceC25553xc80f4f79;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1598968902) {
            parcel2.writeString(f46736xf04ebf6f);
            return true;
        }
        switch (i17) {
            case 1:
                parcel.enforceInterface(f46736xf04ebf6f);
                try {
                    this.f46750x32c6c6.m95621x3de17412(parcel.readString());
                    parcel2.writeInt(0);
                } catch (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872 e17) {
                    parcel2.writeInt(1);
                    e17.writeToParcel(parcel2, 0);
                }
                return true;
            case 2:
                parcel.enforceInterface(f46736xf04ebf6f);
                try {
                    this.f46750x32c6c6.m95619x4340092c(parcel.readString());
                    parcel2.writeInt(0);
                } catch (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872 e18) {
                    parcel2.writeInt(1);
                    e18.writeToParcel(parcel2, 0);
                }
                return true;
            case 3:
                parcel.enforceInterface(f46736xf04ebf6f);
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                this.f46750x32c6c6.m95624x1b5ad5b0(readStrongBinder != null ? new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25530xbcdf9f48(readStrongBinder) : null);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface(f46736xf04ebf6f);
                this.f46750x32c6c6.m95615x2fb91e();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface(f46736xf04ebf6f);
                com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 m95617xa780fd8f = this.f46750x32c6c6.m95617xa780fd8f();
                parcel2.writeNoException();
                m95617xa780fd8f.writeToParcel(parcel2, 1);
                return true;
            case 6:
                parcel.enforceInterface(f46736xf04ebf6f);
                android.os.IBinder m95616xba82ab9c = this.f46750x32c6c6.m95616xba82ab9c();
                parcel2.writeNoException();
                parcel2.writeStrongBinder(m95616xba82ab9c);
                return true;
            case 7:
                parcel.enforceInterface(f46736xf04ebf6f);
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                this.f46750x32c6c6.m95623x3f690c44(readStrongBinder2 != null ? new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130.Proxy(readStrongBinder2) : null);
                parcel2.writeNoException();
                return true;
            case 8:
                parcel.enforceInterface(f46736xf04ebf6f);
                try {
                    this.f46750x32c6c6.m95620x6f4ce479(parcel.readString(), parcel.readInt() != 0 ? com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25507x83693462.f46640x681a0c0c.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeInt(0);
                } catch (com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872 e19) {
                    parcel2.writeInt(1);
                    e19.writeToParcel(parcel2, 0);
                }
                return true;
            case 9:
                parcel.enforceInterface(f46736xf04ebf6f);
                this.f46750x32c6c6.m95618x31bc40e8(parcel.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 10:
                parcel.enforceInterface(f46736xf04ebf6f);
                com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25556x1f85ac25 m95614xe045fac6 = this.f46750x32c6c6.m95614xe045fac6(parcel.readString());
                parcel2.writeNoException();
                m95614xe045fac6.writeToParcel(parcel2, 1);
                return true;
            case 11:
                parcel.enforceInterface(f46736xf04ebf6f);
                int readInt = parcel.readInt();
                java.util.HashMap hashMap = new java.util.HashMap();
                for (int i19 = 0; i19 < readInt; i19++) {
                    hashMap.put(parcel.readString(), (android.os.ParcelFileDescriptor) android.os.ParcelFileDescriptor.CREATOR.createFromParcel(parcel));
                }
                this.f46750x32c6c6.m95622xf3653042(hashMap);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}

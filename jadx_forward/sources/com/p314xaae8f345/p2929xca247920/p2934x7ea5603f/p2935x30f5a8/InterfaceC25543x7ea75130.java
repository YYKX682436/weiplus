package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.ISystemServiceManager */
/* loaded from: classes13.dex */
public interface InterfaceC25543x7ea75130 extends android.os.IInterface {

    /* renamed from: DESCRIPTOR */
    public static final java.lang.String f46706xf04ebf6f = "com.tencent.shadow.dynamic.host.ISystemServiceManager";

    /* renamed from: TRANSACTION_CODE_FAILED_EXCEPTION */
    public static final int f46707xde1193fe = 1;

    /* renamed from: TRANSACTION_CODE_NOT_FOUND_EXCEPTION */
    public static final int f46708x8fae7f15 = 2;

    /* renamed from: TRANSACTION_CODE_NO_EXCEPTION */
    public static final int f46709xcf025102 = 0;

    /* renamed from: TRANSACTION_addService */
    public static final int f46710xe6280af5 = 2;

    /* renamed from: TRANSACTION_getService */
    public static final int f46711xb237eea0 = 1;

    /* renamed from: com.tencent.shadow.dynamic.host.ISystemServiceManager$Proxy */
    /* loaded from: classes13.dex */
    public static class Proxy implements com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130 {

        /* renamed from: mRemote */
        private android.os.IBinder f46712x17b71f13;

        public Proxy(android.os.IBinder iBinder) {
            this.f46712x17b71f13 = iBinder;
        }

        @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130
        /* renamed from: addService */
        public boolean mo95584xe8011ed4(java.lang.String str, android.os.IBinder iBinder) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130.f46706xf04ebf6f);
                obtain.writeString(str);
                obtain.writeStrongBinder(iBinder);
                this.f46712x17b71f13.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() == 1;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this.f46712x17b71f13;
        }

        @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130
        /* renamed from: getService */
        public android.os.IBinder mo95585xb411027f(java.lang.String str) {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130.f46706xf04ebf6f);
                obtain.writeString(str);
                this.f46712x17b71f13.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readStrongBinder();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.tencent.shadow.dynamic.host.ISystemServiceManager$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130 {
        public Stub() {
            attachInterface(this, com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130.f46706xf04ebf6f);
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            java.lang.String str = com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25543x7ea75130.f46706xf04ebf6f;
            if (i17 == 1) {
                parcel.enforceInterface(str);
                android.os.IBinder mo95585xb411027f = mo95585xb411027f(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(mo95585xb411027f);
                return true;
            }
            if (i17 != 2) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(str);
                return true;
            }
            parcel.enforceInterface(str);
            boolean mo95584xe8011ed4 = mo95584xe8011ed4(parcel.readString(), parcel.readStrongBinder());
            parcel2.writeNoException();
            parcel2.writeInt(mo95584xe8011ed4 ? 1 : 0);
            return true;
        }
    }

    /* renamed from: addService */
    boolean mo95584xe8011ed4(java.lang.String str, android.os.IBinder iBinder);

    /* renamed from: getService */
    android.os.IBinder mo95585xb411027f(java.lang.String str);
}

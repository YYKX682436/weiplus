package com.p284x36a29809.p285xb1e6786a.p286xf5bc2045;

/* renamed from: com.hihonor.easygo.callback.IEasyGoCallback */
/* loaded from: classes8.dex */
public interface InterfaceC2820xb884e798 extends android.os.IInterface {

    /* renamed from: com.hihonor.easygo.callback.IEasyGoCallback$Default */
    /* loaded from: classes8.dex */
    public static class Default implements com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798
        /* renamed from: callback */
        public void mo20985xf5bc2045(int i17, android.os.Bundle bundle) {
        }
    }

    /* renamed from: com.hihonor.easygo.callback.IEasyGoCallback$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f9463xf04ebf6f = "com.hihonor.easygo.callback.IEasyGoCallback";

        /* renamed from: TRANSACTION_callback */
        static final int f9464x3f41a0a6 = 1;

        /* renamed from: com.hihonor.easygo.callback.IEasyGoCallback$Stub$Proxy */
        /* loaded from: classes13.dex */
        public static class Proxy implements com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 {

            /* renamed from: sDefaultImpl */
            public static com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 f9465xbe26958e;

            /* renamed from: mRemote */
            private android.os.IBinder f9466x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f9466x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f9466x17b71f13;
            }

            @Override // com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798
            /* renamed from: callback */
            public void mo20985xf5bc2045(int i17, android.os.Bundle bundle) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.f9463xf04ebf6f);
                    obtain.writeInt(i17);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f9466x17b71f13.transact(1, obtain, obtain2, 0) || com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.m20987xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.m20987xbfc5eacb().mo20985xf5bc2045(i17, bundle);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m20989x19238652() {
                return com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.f9463xf04ebf6f;
            }
        }

        public Stub() {
            attachInterface(this, f9463xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 m20986xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f9463xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798)) ? new com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.Proxy(iBinder) : (com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798) queryLocalInterface;
        }

        /* renamed from: getDefaultImpl */
        public static com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 m20987xbfc5eacb() {
            return com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.Proxy.f9465xbe26958e;
        }

        /* renamed from: setDefaultImpl */
        public static boolean m20988x562b5e3f(com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798 interfaceC2820xb884e798) {
            if (com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.Proxy.f9465xbe26958e != null || interfaceC2820xb884e798 == null) {
                return false;
            }
            com.p284x36a29809.p285xb1e6786a.p286xf5bc2045.InterfaceC2820xb884e798.Stub.Proxy.f9465xbe26958e = interfaceC2820xb884e798;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 != 1) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(f9463xf04ebf6f);
                return true;
            }
            parcel.enforceInterface(f9463xf04ebf6f);
            mo20985xf5bc2045(parcel.readInt(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: callback */
    void mo20985xf5bc2045(int i17, android.os.Bundle bundle);
}

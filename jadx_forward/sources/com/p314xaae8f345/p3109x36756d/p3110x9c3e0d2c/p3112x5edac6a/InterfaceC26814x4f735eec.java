package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService */
/* loaded from: classes16.dex */
public interface InterfaceC26814x4f735eec extends android.os.IInterface {

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService$Default */
    /* loaded from: classes8.dex */
    public static class Default implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec
        /* renamed from: destroy */
        public void mo105860x5cd39ffa() {
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec
        /* renamed from: enableHighSampleRatePlay */
        public void mo105861x476c3923(boolean z17) {
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec
        /* renamed from: init */
        public void mo105862x316510(java.lang.String str) {
        }
    }

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService$Stub */
    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f57481xf04ebf6f = "com.hihonor.android.magicx.media.audioengine.IHnAudioPlayService";

        /* renamed from: TRANSACTION_destroy */
        static final int f57482x45c0f79 = 3;

        /* renamed from: TRANSACTION_enableHighSampleRatePlay */
        static final int f57483x664ed784 = 2;

        /* renamed from: TRANSACTION_init */
        static final int f57484x30803df1 = 1;

        /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioPlayService$Stub$Proxy */
        /* loaded from: classes16.dex */
        public static class Proxy implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec {

            /* renamed from: sDefaultImpl */
            public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec f57485xbe26958e;

            /* renamed from: mRemote */
            private android.os.IBinder f57486x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f57486x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f57486x17b71f13;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec
            /* renamed from: destroy */
            public void mo105860x5cd39ffa() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.f57481xf04ebf6f);
                    if (this.f57486x17b71f13.transact(3, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.m105864xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.m105864xbfc5eacb().mo105860x5cd39ffa();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec
            /* renamed from: enableHighSampleRatePlay */
            public void mo105861x476c3923(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.f57481xf04ebf6f);
                    obtain.writeInt(z17 ? 1 : 0);
                    if (this.f57486x17b71f13.transact(2, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.m105864xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.m105864xbfc5eacb().mo105861x476c3923(z17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m105866x19238652() {
                return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.f57481xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec
            /* renamed from: init */
            public void mo105862x316510(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.f57481xf04ebf6f);
                    obtain.writeString(str);
                    if (this.f57486x17b71f13.transact(1, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.m105864xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.m105864xbfc5eacb().mo105862x316510(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f57481xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec m105863xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f57481xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec)) ? new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec) queryLocalInterface;
        }

        /* renamed from: getDefaultImpl */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec m105864xbfc5eacb() {
            return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.Proxy.f57485xbe26958e;
        }

        /* renamed from: setDefaultImpl */
        public static boolean m105865x562b5e3f(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec interfaceC26814x4f735eec) {
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.Proxy.f57485xbe26958e != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC26814x4f735eec == null) {
                return false;
            }
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26814x4f735eec.Stub.Proxy.f57485xbe26958e = interfaceC26814x4f735eec;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(f57481xf04ebf6f);
                mo105862x316510(parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(f57481xf04ebf6f);
                mo105861x476c3923(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            }
            if (i17 != 3) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(f57481xf04ebf6f);
                return true;
            }
            parcel.enforceInterface(f57481xf04ebf6f);
            mo105860x5cd39ffa();
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: destroy */
    void mo105860x5cd39ffa();

    /* renamed from: enableHighSampleRatePlay */
    void mo105861x476c3923(boolean z17);

    /* renamed from: init */
    void mo105862x316510(java.lang.String str);
}

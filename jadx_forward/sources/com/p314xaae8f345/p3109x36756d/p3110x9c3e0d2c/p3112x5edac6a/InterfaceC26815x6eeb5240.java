package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService */
/* loaded from: classes15.dex */
public interface InterfaceC26815x6eeb5240 extends android.os.IInterface {

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService$Default */
    /* loaded from: classes15.dex */
    public static class Default implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240
        /* renamed from: getSupportedServices */
        public java.util.List mo105867xb9854276() {
            return null;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240
        /* renamed from: init */
        public void mo105868x316510(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240
        /* renamed from: isServiceSupported */
        public boolean mo105869x8ab4a6c3(int i17) {
            return false;
        }
    }

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService$Stub */
    /* loaded from: classes15.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f57487xf04ebf6f = "com.hihonor.android.magicx.media.audioengine.IHnAudioService";

        /* renamed from: TRANSACTION_getSupportedServices */
        static final int f57488xc6703957 = 1;

        /* renamed from: TRANSACTION_init */
        static final int f57489x30803df1 = 3;

        /* renamed from: TRANSACTION_isServiceSupported */
        static final int f57490x3601e1e4 = 2;

        /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAudioService$Stub$Proxy */
        /* loaded from: classes15.dex */
        public static class Proxy implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 {

            /* renamed from: sDefaultImpl */
            public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 f57491xbe26958e;

            /* renamed from: mRemote */
            private android.os.IBinder f57492x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f57492x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f57492x17b71f13;
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m105873x19238652() {
                return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.f57487xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240
            /* renamed from: getSupportedServices */
            public java.util.List mo105867xb9854276() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.f57487xf04ebf6f);
                    if (!this.f57492x17b71f13.transact(1, obtain, obtain2, 0) && com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.m105871xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.m105871xbfc5eacb().mo105867xb9854276();
                    }
                    obtain2.readException();
                    return obtain2.readArrayList(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240
            /* renamed from: init */
            public void mo105868x316510(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.f57487xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (this.f57492x17b71f13.transact(3, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.m105871xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.m105871xbfc5eacb().mo105868x316510(str, str2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240
            /* renamed from: isServiceSupported */
            public boolean mo105869x8ab4a6c3(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.f57487xf04ebf6f);
                    obtain.writeInt(i17);
                    if (this.f57492x17b71f13.transact(2, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.m105871xbfc5eacb() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean mo105869x8ab4a6c3 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.m105871xbfc5eacb().mo105869x8ab4a6c3(i17);
                    obtain2.recycle();
                    obtain.recycle();
                    return mo105869x8ab4a6c3;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f57487xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 m105870xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f57487xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240)) ? new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240) queryLocalInterface;
        }

        /* renamed from: getDefaultImpl */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 m105871xbfc5eacb() {
            return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.Proxy.f57491xbe26958e;
        }

        /* renamed from: setDefaultImpl */
        public static boolean m105872x562b5e3f(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240 interfaceC26815x6eeb5240) {
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.Proxy.f57491xbe26958e != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC26815x6eeb5240 == null) {
                return false;
            }
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26815x6eeb5240.Stub.Proxy.f57491xbe26958e = interfaceC26815x6eeb5240;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(f57487xf04ebf6f);
                java.util.List mo105867xb9854276 = mo105867xb9854276();
                parcel2.writeNoException();
                parcel2.writeList(mo105867xb9854276);
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(f57487xf04ebf6f);
                boolean mo105869x8ab4a6c3 = mo105869x8ab4a6c3(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(mo105869x8ab4a6c3 ? 1 : 0);
                return true;
            }
            if (i17 != 3) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(f57487xf04ebf6f);
                return true;
            }
            parcel.enforceInterface(f57487xf04ebf6f);
            mo105868x316510(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: getSupportedServices */
    java.util.List mo105867xb9854276();

    /* renamed from: init */
    void mo105868x316510(java.lang.String str, java.lang.String str2);

    /* renamed from: isServiceSupported */
    boolean mo105869x8ab4a6c3(int i17);
}

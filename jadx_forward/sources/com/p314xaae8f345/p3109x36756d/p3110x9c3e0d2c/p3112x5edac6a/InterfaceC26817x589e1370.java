package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService */
/* loaded from: classes16.dex */
public interface InterfaceC26817x589e1370 extends android.os.IInterface {

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService$Default */
    /* loaded from: classes13.dex */
    public static class Default implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
        /* renamed from: destroy */
        public void mo105874x5cd39ffa() {
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
        /* renamed from: enableEarReturn */
        public int mo105875x76f6d5e3(boolean z17) {
            return 0;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
        /* renamed from: getEarReturnLatency */
        public int mo105876xdd389d6e() {
            return 0;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
        /* renamed from: init */
        public void mo105877x316510(java.lang.String str) {
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
        /* renamed from: isSupported */
        public boolean mo105878x450f16a4(int i17) {
            return false;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
        /* renamed from: setParameter */
        public int mo105879xd03fe567(java.lang.String str, int i17) {
            return 0;
        }
    }

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService$Stub */
    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f57493xf04ebf6f = "com.hihonor.android.magicx.media.audioengine.IHnEarReturnService";

        /* renamed from: TRANSACTION_destroy */
        static final int f57494x45c0f79 = 6;

        /* renamed from: TRANSACTION_enableEarReturn */
        static final int f57495x50935662 = 2;

        /* renamed from: TRANSACTION_getEarReturnLatency */
        static final int f57496x9b92c66d = 3;

        /* renamed from: TRANSACTION_init */
        static final int f57497x30803df1 = 5;

        /* renamed from: TRANSACTION_isSupported */
        static final int f57498xbc5aea3 = 1;

        /* renamed from: TRANSACTION_setParameter */
        static final int f57499xe05c4d48 = 4;

        /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorEarReturnService$Stub$Proxy */
        /* loaded from: classes16.dex */
        public static class Proxy implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 {

            /* renamed from: sDefaultImpl */
            public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 f57500xbe26958e;

            /* renamed from: mRemote */
            private android.os.IBinder f57501x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f57501x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f57501x17b71f13;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
            /* renamed from: destroy */
            public void mo105874x5cd39ffa() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.f57493xf04ebf6f);
                    if (this.f57501x17b71f13.transact(6, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb().mo105874x5cd39ffa();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
            /* renamed from: enableEarReturn */
            public int mo105875x76f6d5e3(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.f57493xf04ebf6f);
                    obtain.writeInt(z17 ? 1 : 0);
                    if (!this.f57501x17b71f13.transact(2, obtain, obtain2, 0) && com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb().mo105875x76f6d5e3(z17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
            /* renamed from: getEarReturnLatency */
            public int mo105876xdd389d6e() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.f57493xf04ebf6f);
                    if (!this.f57501x17b71f13.transact(3, obtain, obtain2, 0) && com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb().mo105876xdd389d6e();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m105883x19238652() {
                return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.f57493xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
            /* renamed from: init */
            public void mo105877x316510(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.f57493xf04ebf6f);
                    obtain.writeString(str);
                    if (this.f57501x17b71f13.transact(5, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb().mo105877x316510(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
            /* renamed from: isSupported */
            public boolean mo105878x450f16a4(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.f57493xf04ebf6f);
                    obtain.writeInt(i17);
                    if (this.f57501x17b71f13.transact(1, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean mo105878x450f16a4 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb().mo105878x450f16a4(i17);
                    obtain2.recycle();
                    obtain.recycle();
                    return mo105878x450f16a4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370
            /* renamed from: setParameter */
            public int mo105879xd03fe567(java.lang.String str, int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.f57493xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeInt(i17);
                    if (!this.f57501x17b71f13.transact(4, obtain, obtain2, 0) && com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.m105881xbfc5eacb().mo105879xd03fe567(str, i17);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f57493xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 m105880xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f57493xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370)) ? new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370) queryLocalInterface;
        }

        /* renamed from: getDefaultImpl */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 m105881xbfc5eacb() {
            return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.Proxy.f57500xbe26958e;
        }

        /* renamed from: setDefaultImpl */
        public static boolean m105882x562b5e3f(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370 interfaceC26817x589e1370) {
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.Proxy.f57500xbe26958e != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC26817x589e1370 == null) {
                return false;
            }
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26817x589e1370.Stub.Proxy.f57500xbe26958e = interfaceC26817x589e1370;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1598968902) {
                parcel2.writeString(f57493xf04ebf6f);
                return true;
            }
            switch (i17) {
                case 1:
                    parcel.enforceInterface(f57493xf04ebf6f);
                    boolean mo105878x450f16a4 = mo105878x450f16a4(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105878x450f16a4 ? 1 : 0);
                    return true;
                case 2:
                    parcel.enforceInterface(f57493xf04ebf6f);
                    int mo105875x76f6d5e3 = mo105875x76f6d5e3(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105875x76f6d5e3);
                    return true;
                case 3:
                    parcel.enforceInterface(f57493xf04ebf6f);
                    int mo105876xdd389d6e = mo105876xdd389d6e();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105876xdd389d6e);
                    return true;
                case 4:
                    parcel.enforceInterface(f57493xf04ebf6f);
                    int mo105879xd03fe567 = mo105879xd03fe567(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105879xd03fe567);
                    return true;
                case 5:
                    parcel.enforceInterface(f57493xf04ebf6f);
                    mo105877x316510(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(f57493xf04ebf6f);
                    mo105874x5cd39ffa();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    /* renamed from: destroy */
    void mo105874x5cd39ffa();

    /* renamed from: enableEarReturn */
    int mo105875x76f6d5e3(boolean z17);

    /* renamed from: getEarReturnLatency */
    int mo105876xdd389d6e();

    /* renamed from: init */
    void mo105877x316510(java.lang.String str);

    /* renamed from: isSupported */
    boolean mo105878x450f16a4(int i17);

    /* renamed from: setParameter */
    int mo105879xd03fe567(java.lang.String str, int i17);
}

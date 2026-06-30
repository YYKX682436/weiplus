package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a;

/* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService */
/* loaded from: classes16.dex */
public interface InterfaceC26813x75a30101 extends android.os.IInterface {

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService$Default */
    /* loaded from: classes16.dex */
    public static class Default implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
        /* renamed from: destroy */
        public void mo105849x5cd39ffa() {
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
        /* renamed from: disableAdvancedRecord */
        public boolean mo105850x4a92581b() {
            return false;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
        /* renamed from: enableAdvancedRecord */
        public boolean mo105851xbbf72f76() {
            return false;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
        /* renamed from: enableRecordDenoise */
        public int mo105852xd3b6f8e5(boolean z17, int i17, int i18, int i19, android.os.IBinder iBinder) {
            return 0;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
        /* renamed from: init */
        public void mo105853x316510(java.lang.String str) {
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
        /* renamed from: isSupported */
        public boolean mo105854x450f16a4(int i17) {
            return false;
        }

        @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
        /* renamed from: unbind */
        public void mo105855xcde33e56(int i17) {
        }
    }

    /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService$Stub */
    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f57471xf04ebf6f = "com.hihonor.android.magicx.media.audioengine.IHnAdvancedRecordService";

        /* renamed from: TRANSACTION_destroy */
        static final int f57472x45c0f79 = 2;

        /* renamed from: TRANSACTION_disableAdvancedRecord */
        static final int f57473xdb063d5a = 4;

        /* renamed from: TRANSACTION_enableAdvancedRecord */
        static final int f57474xc8e22657 = 3;

        /* renamed from: TRANSACTION_enableRecordDenoise */
        static final int f57475x921121e4 = 6;

        /* renamed from: TRANSACTION_init */
        static final int f57476x30803df1 = 1;

        /* renamed from: TRANSACTION_isSupported */
        static final int f57477xbc5aea3 = 5;

        /* renamed from: TRANSACTION_unbind */
        static final int f57478x25df62f7 = 7;

        /* renamed from: com.tencent.trtc.hardwareearmonitor.honor.IHonorAdvancedRecordService$Stub$Proxy */
        /* loaded from: classes16.dex */
        public static class Proxy implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 {

            /* renamed from: sDefaultImpl */
            public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 f57479xbe26958e;

            /* renamed from: mRemote */
            private android.os.IBinder f57480x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f57480x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f57480x17b71f13;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
            /* renamed from: destroy */
            public void mo105849x5cd39ffa() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f);
                    if (this.f57480x17b71f13.transact(2, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb().mo105849x5cd39ffa();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
            /* renamed from: disableAdvancedRecord */
            public boolean mo105850x4a92581b() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f);
                    if (this.f57480x17b71f13.transact(4, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean mo105850x4a92581b = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb().mo105850x4a92581b();
                    obtain2.recycle();
                    obtain.recycle();
                    return mo105850x4a92581b;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
            /* renamed from: enableAdvancedRecord */
            public boolean mo105851xbbf72f76() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f);
                    if (this.f57480x17b71f13.transact(3, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean mo105851xbbf72f76 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb().mo105851xbbf72f76();
                    obtain2.recycle();
                    obtain.recycle();
                    return mo105851xbbf72f76;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
            /* renamed from: enableRecordDenoise */
            public int mo105852xd3b6f8e5(boolean z17, int i17, int i18, int i19, android.os.IBinder iBinder) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f);
                    obtain.writeInt(z17 ? 1 : 0);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeInt(i19);
                    obtain.writeStrongBinder(iBinder);
                    if (!this.f57480x17b71f13.transact(6, obtain, obtain2, 0) && com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb().mo105852xd3b6f8e5(z17, i17, i18, i19, iBinder);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m105859x19238652() {
                return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
            /* renamed from: init */
            public void mo105853x316510(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f);
                    obtain.writeString(str);
                    if (this.f57480x17b71f13.transact(1, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb().mo105853x316510(str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
            /* renamed from: isSupported */
            public boolean mo105854x450f16a4(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f);
                    obtain.writeInt(i17);
                    if (this.f57480x17b71f13.transact(5, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    boolean mo105854x450f16a4 = com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb().mo105854x450f16a4(i17);
                    obtain2.recycle();
                    obtain.recycle();
                    return mo105854x450f16a4;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101
            /* renamed from: unbind */
            public void mo105855xcde33e56(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.f57471xf04ebf6f);
                    obtain.writeInt(i17);
                    if (this.f57480x17b71f13.transact(7, obtain, obtain2, 0) || com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.m105857xbfc5eacb().mo105855xcde33e56(i17);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f57471xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 m105856xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f57471xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101)) ? new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101) queryLocalInterface;
        }

        /* renamed from: getDefaultImpl */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 m105857xbfc5eacb() {
            return com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.Proxy.f57479xbe26958e;
        }

        /* renamed from: setDefaultImpl */
        public static boolean m105858x562b5e3f(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101 interfaceC26813x75a30101) {
            if (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.Proxy.f57479xbe26958e != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC26813x75a30101 == null) {
                return false;
            }
            com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3112x5edac6a.InterfaceC26813x75a30101.Stub.Proxy.f57479xbe26958e = interfaceC26813x75a30101;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1598968902) {
                parcel2.writeString(f57471xf04ebf6f);
                return true;
            }
            switch (i17) {
                case 1:
                    parcel.enforceInterface(f57471xf04ebf6f);
                    mo105853x316510(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(f57471xf04ebf6f);
                    mo105849x5cd39ffa();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(f57471xf04ebf6f);
                    boolean mo105851xbbf72f76 = mo105851xbbf72f76();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105851xbbf72f76 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(f57471xf04ebf6f);
                    boolean mo105850x4a92581b = mo105850x4a92581b();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105850x4a92581b ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(f57471xf04ebf6f);
                    boolean mo105854x450f16a4 = mo105854x450f16a4(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105854x450f16a4 ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(f57471xf04ebf6f);
                    int mo105852xd3b6f8e5 = mo105852xd3b6f8e5(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    parcel2.writeInt(mo105852xd3b6f8e5);
                    return true;
                case 7:
                    parcel.enforceInterface(f57471xf04ebf6f);
                    mo105855xcde33e56(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    /* renamed from: destroy */
    void mo105849x5cd39ffa();

    /* renamed from: disableAdvancedRecord */
    boolean mo105850x4a92581b();

    /* renamed from: enableAdvancedRecord */
    boolean mo105851xbbf72f76();

    /* renamed from: enableRecordDenoise */
    int mo105852xd3b6f8e5(boolean z17, int i17, int i18, int i19, android.os.IBinder iBinder);

    /* renamed from: init */
    void mo105853x316510(java.lang.String str);

    /* renamed from: isSupported */
    boolean mo105854x450f16a4(int i17);

    /* renamed from: unbind */
    void mo105855xcde33e56(int i17);
}

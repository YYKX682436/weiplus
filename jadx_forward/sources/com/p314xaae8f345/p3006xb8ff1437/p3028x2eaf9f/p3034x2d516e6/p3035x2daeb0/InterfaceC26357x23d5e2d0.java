package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl */
/* loaded from: classes16.dex */
public interface InterfaceC26357x23d5e2d0 extends android.os.IInterface {

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl$Default */
    /* loaded from: classes16.dex */
    public static class Default implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: getNativeVersion */
        public java.lang.String mo102220x994c290b() {
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: getTPDownloadProxy */
        public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 mo102221x61ce4f94(int i17) {
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: isReadyForDownload */
        public boolean mo102222xf56d1818() {
            return false;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
        /* renamed from: isReadyForPlay */
        public boolean mo102223xccbd22c4() {
            return false;
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl$Stub */
    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f52697xf04ebf6f = "com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl";

        /* renamed from: TRANSACTION_getNativeVersion */
        static final int f52698xf33fb86c = 4;

        /* renamed from: TRANSACTION_getTPDownloadProxy */
        static final int f52699xd1b8ab5 = 1;

        /* renamed from: TRANSACTION_isReadyForDownload */
        static final int f52700xa0ba5339 = 3;

        /* renamed from: TRANSACTION_isReadyForPlay */
        static final int f52701x475f1665 = 2;

        /* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.TPDownloadProxyFactoryAidl$Stub$Proxy */
        /* loaded from: classes16.dex */
        public static class Proxy implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 {

            /* renamed from: sDefaultImpl */
            public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 f52702xbe26958e;

            /* renamed from: mRemote */
            private android.os.IBinder f52703x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f52703x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f52703x17b71f13;
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m102227x19238652() {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.f52697xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
            /* renamed from: getNativeVersion */
            public java.lang.String mo102220x994c290b() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.f52697xf04ebf6f);
                    if (!this.f52703x17b71f13.transact(4, obtain, obtain2, 0) && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb().mo102220x994c290b();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
            /* renamed from: getTPDownloadProxy */
            public com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 mo102221x61ce4f94(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.f52697xf04ebf6f);
                    obtain.writeInt(i17);
                    if (!this.f52703x17b71f13.transact(1, obtain, obtain2, 0) && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb().mo102221x61ce4f94(i17);
                    }
                    obtain2.readException();
                    return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491.Stub.m102176xbd0d1927(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
            /* renamed from: isReadyForDownload */
            public boolean mo102222xf56d1818() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.f52697xf04ebf6f);
                    if (!this.f52703x17b71f13.transact(3, obtain, obtain2, 0) && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb().mo102222xf56d1818();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0
            /* renamed from: isReadyForPlay */
            public boolean mo102223xccbd22c4() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.f52697xf04ebf6f);
                    if (!this.f52703x17b71f13.transact(2, obtain, obtain2, 0) && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb() != null) {
                        return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.m102225xbfc5eacb().mo102223xccbd22c4();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f52697xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 m102224xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f52697xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0)) ? new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0) queryLocalInterface;
        }

        /* renamed from: getDefaultImpl */
        public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 m102225xbfc5eacb() {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.Proxy.f52702xbe26958e;
        }

        /* renamed from: setDefaultImpl */
        public static boolean m102226x562b5e3f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0 interfaceC26357x23d5e2d0) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.Proxy.f52702xbe26958e != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC26357x23d5e2d0 == null) {
                return false;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26357x23d5e2d0.Stub.Proxy.f52702xbe26958e = interfaceC26357x23d5e2d0;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(f52697xf04ebf6f);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 mo102221x61ce4f94 = mo102221x61ce4f94(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(mo102221x61ce4f94 != null ? mo102221x61ce4f94.asBinder() : null);
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(f52697xf04ebf6f);
                boolean mo102223xccbd22c4 = mo102223xccbd22c4();
                parcel2.writeNoException();
                parcel2.writeInt(mo102223xccbd22c4 ? 1 : 0);
                return true;
            }
            if (i17 == 3) {
                parcel.enforceInterface(f52697xf04ebf6f);
                boolean mo102222xf56d1818 = mo102222xf56d1818();
                parcel2.writeNoException();
                parcel2.writeInt(mo102222xf56d1818 ? 1 : 0);
                return true;
            }
            if (i17 != 4) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(f52697xf04ebf6f);
                return true;
            }
            parcel.enforceInterface(f52697xf04ebf6f);
            java.lang.String mo102220x994c290b = mo102220x994c290b();
            parcel2.writeNoException();
            parcel2.writeString(mo102220x994c290b);
            return true;
        }
    }

    /* renamed from: getNativeVersion */
    java.lang.String mo102220x994c290b();

    /* renamed from: getTPDownloadProxy */
    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26353x2bfd9491 mo102221x61ce4f94(int i17);

    /* renamed from: isReadyForDownload */
    boolean mo102222xf56d1818();

    /* renamed from: isReadyForPlay */
    boolean mo102223xccbd22c4();
}

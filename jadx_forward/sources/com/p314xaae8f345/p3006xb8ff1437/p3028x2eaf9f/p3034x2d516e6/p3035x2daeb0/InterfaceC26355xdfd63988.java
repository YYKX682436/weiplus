package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl */
/* loaded from: classes16.dex */
public interface InterfaceC26355xdfd63988 extends android.os.IInterface {

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl$Default */
    /* loaded from: classes15.dex */
    public static class Default implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
        /* renamed from: onPrepareDownloadProgressUpdate */
        public void mo102206x8ea30446(int i17, int i18, long j17, long j18, java.lang.String str) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
        /* renamed from: onPrepareError */
        public void mo102207xfaf06cc0(int i17, int i18, java.lang.String str) {
        }

        @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
        /* renamed from: onPrepareOK */
        public void mo102208xc1e12e04() {
        }
    }

    /* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl$Stub */
    /* loaded from: classes16.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f52687xf04ebf6f = "com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl";

        /* renamed from: TRANSACTION_onPrepareDownloadProgressUpdate */
        static final int f52688xa384a6c5 = 3;

        /* renamed from: TRANSACTION_onPrepareError */
        static final int f52689x75926061 = 2;

        /* renamed from: TRANSACTION_onPrepareOK */
        static final int f52690x8897c603 = 1;

        /* renamed from: com.tencent.thumbplayer.core.downloadproxy.aidl.ITPPreLoadListenerAidl$Stub$Proxy */
        /* loaded from: classes16.dex */
        public static class Proxy implements com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 {

            /* renamed from: sDefaultImpl */
            public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 f52691xbe26958e;

            /* renamed from: mRemote */
            private android.os.IBinder f52692x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f52692x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f52692x17b71f13;
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m102212x19238652() {
                return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.f52687xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
            /* renamed from: onPrepareDownloadProgressUpdate */
            public void mo102206x8ea30446(int i17, int i18, long j17, long j18, java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.f52687xf04ebf6f);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeLong(j17);
                    obtain.writeLong(j18);
                    obtain.writeString(str);
                    try {
                        if (this.f52692x17b71f13.transact(3, obtain, obtain2, 0) || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.m102210xbfc5eacb() == null) {
                            obtain2.readException();
                            obtain2.recycle();
                            obtain.recycle();
                        } else {
                            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.m102210xbfc5eacb().mo102206x8ea30446(i17, i18, j17, j18, str);
                            obtain2.recycle();
                            obtain.recycle();
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
            /* renamed from: onPrepareError */
            public void mo102207xfaf06cc0(int i17, int i18, java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.f52687xf04ebf6f);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeString(str);
                    if (this.f52692x17b71f13.transact(2, obtain, obtain2, 0) || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.m102210xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.m102210xbfc5eacb().mo102207xfaf06cc0(i17, i18, str);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988
            /* renamed from: onPrepareOK */
            public void mo102208xc1e12e04() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.f52687xf04ebf6f);
                    if (this.f52692x17b71f13.transact(1, obtain, obtain2, 0) || com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.m102210xbfc5eacb() == null) {
                        obtain2.readException();
                    } else {
                        com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.m102210xbfc5eacb().mo102208xc1e12e04();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f52687xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 m102209xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f52687xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988)) ? new com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988) queryLocalInterface;
        }

        /* renamed from: getDefaultImpl */
        public static com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 m102210xbfc5eacb() {
            return com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.Proxy.f52691xbe26958e;
        }

        /* renamed from: setDefaultImpl */
        public static boolean m102211x562b5e3f(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988 interfaceC26355xdfd63988) {
            if (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.Proxy.f52691xbe26958e != null) {
                throw new java.lang.IllegalStateException("setDefaultImpl() called twice");
            }
            if (interfaceC26355xdfd63988 == null) {
                return false;
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3035x2daeb0.InterfaceC26355xdfd63988.Stub.Proxy.f52691xbe26958e = interfaceC26355xdfd63988;
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(f52687xf04ebf6f);
                mo102208xc1e12e04();
                parcel2.writeNoException();
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(f52687xf04ebf6f);
                mo102207xfaf06cc0(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            }
            if (i17 != 3) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(f52687xf04ebf6f);
                return true;
            }
            parcel.enforceInterface(f52687xf04ebf6f);
            mo102206x8ea30446(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: onPrepareDownloadProgressUpdate */
    void mo102206x8ea30446(int i17, int i18, long j17, long j18, java.lang.String str);

    /* renamed from: onPrepareError */
    void mo102207xfaf06cc0(int i17, int i18, java.lang.String str);

    /* renamed from: onPrepareOK */
    void mo102208xc1e12e04();
}

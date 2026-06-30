package com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0;

/* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface */
/* loaded from: classes13.dex */
public interface InterfaceC26646xb416be9a extends android.os.IInterface {

    /* renamed from: DESCRIPTOR */
    public static final java.lang.String f55949xf04ebf6f = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface";

    /* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface$Default */
    /* loaded from: classes13.dex */
    public static class Default implements com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: cancelDownloadTask */
        public void mo104783x48fc89c7(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: getDownloadTaskInfo */
        public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo104784x69694ff1(java.lang.String str, java.lang.String str2) {
            return null;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: getServiceVersion */
        public int mo104785x8a0bb559() {
            return 0;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: isAllDownloadFinished */
        public boolean mo104786xe58d0751() {
            return false;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: pauseDownloadTask */
        public void mo104787xb0172743(java.lang.String str, java.lang.String str2) {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: registerDownloadTaskCallback */
        public void mo104788x8f0da8d5(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4) {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: setServiceSetingIsDownloadWifiOnly */
        public void mo104789xa56831c6(boolean z17) {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: setServiceSetingIsTaskAutoResume */
        public void mo104790x80c86a1e(boolean z17) {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: setServiceSetingMaxTaskNum */
        public void mo104791x39ddf030(int i17) {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: startDownloadTask */
        public int mo104792x729383af(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map) {
            return 0;
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
        /* renamed from: unregisterDownloadTaskCallback */
        public void mo104793x9e4c47ee(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4) {
        }
    }

    /* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a {

        /* renamed from: TRANSACTION_cancelDownloadTask */
        static final int f55950xf449c4e8 = 9;

        /* renamed from: TRANSACTION_getDownloadTaskInfo */
        static final int f55951x27c378f0 = 6;

        /* renamed from: TRANSACTION_getServiceVersion */
        static final int f55952x6e8a1218 = 1;

        /* renamed from: TRANSACTION_isAllDownloadFinished */
        static final int f55953x7600ec90 = 5;

        /* renamed from: TRANSACTION_pauseDownloadTask */
        static final int f55954x94958402 = 8;

        /* renamed from: TRANSACTION_registerDownloadTaskCallback */
        static final int f55955x24c82eb6 = 10;

        /* renamed from: TRANSACTION_setServiceSetingIsDownloadWifiOnly */
        static final int f55956xa2c50ae7 = 3;

        /* renamed from: TRANSACTION_setServiceSetingIsTaskAutoResume */
        static final int f55957x81b177f = 2;

        /* renamed from: TRANSACTION_setServiceSetingMaxTaskNum */
        static final int f55958x2a927a51 = 4;

        /* renamed from: TRANSACTION_startDownloadTask */
        static final int f55959x5711e06e = 7;

        /* renamed from: TRANSACTION_unregisterDownloadTaskCallback */
        static final int f55960xaf7cd98f = 11;

        /* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface$Stub$Proxy */
        /* loaded from: classes13.dex */
        public static class Proxy implements com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a {

            /* renamed from: mRemote */
            private android.os.IBinder f55961x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f55961x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f55961x17b71f13;
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: cancelDownloadTask */
            public void mo104783x48fc89c7(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f55961x17b71f13.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: getDownloadTaskInfo */
            public com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo104784x69694ff1(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f55961x17b71f13.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300) com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a._Parcel.m104798xe31d04d3(obtain2, com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300.f56058x681a0c0c);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m104795x19238652() {
                return com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: getServiceVersion */
            public int mo104785x8a0bb559() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    this.f55961x17b71f13.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: isAllDownloadFinished */
            public boolean mo104786xe58d0751() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    this.f55961x17b71f13.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: pauseDownloadTask */
            public void mo104787xb0172743(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f55961x17b71f13.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: registerDownloadTaskCallback */
            public void mo104788x8f0da8d5(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(interfaceC26645x556a9ec4);
                    this.f55961x17b71f13.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: setServiceSetingIsDownloadWifiOnly */
            public void mo104789xa56831c6(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeInt(z17 ? 1 : 0);
                    this.f55961x17b71f13.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: setServiceSetingIsTaskAutoResume */
            public void mo104790x80c86a1e(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeInt(z17 ? 1 : 0);
                    this.f55961x17b71f13.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: setServiceSetingMaxTaskNum */
            public void mo104791x39ddf030(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeInt(i17);
                    this.f55961x17b71f13.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: startDownloadTask */
            public int mo104792x729383af(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeLong(j17);
                    obtain.writeInt(i17);
                    obtain.writeString(str4);
                    obtain.writeString(str5);
                    obtain.writeMap(map);
                    this.f55961x17b71f13.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a
            /* renamed from: unregisterDownloadTaskCallback */
            public void mo104793x9e4c47ee(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeStrongInterface(interfaceC26645x556a9ec4);
                    this.f55961x17b71f13.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a m104794xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a)) ? new com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a.f55949xf04ebf6f);
                return true;
            }
            switch (i17) {
                case 1:
                    int mo104785x8a0bb559 = mo104785x8a0bb559();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo104785x8a0bb559);
                    return true;
                case 2:
                    mo104790x80c86a1e(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    mo104789xa56831c6(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    mo104791x39ddf030(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean mo104786xe58d0751 = mo104786xe58d0751();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo104786xe58d0751 ? 1 : 0);
                    return true;
                case 6:
                    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo104784x69694ff1 = mo104784x69694ff1(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26646xb416be9a._Parcel.m104799xcd6eea(parcel2, mo104784x69694ff1, 1);
                    return true;
                case 7:
                    int mo104792x729383af = mo104792x729383af(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(mo104792x729383af);
                    return true;
                case 8:
                    mo104787xb0172743(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    mo104783x48fc89c7(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    mo104788x8f0da8d5(parcel.readString(), com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.Stub.m104781xbd0d1927(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    mo104793x9e4c47ee(parcel.readString(), com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.Stub.m104781xbd0d1927(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        }
    }

    /* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceInterface$_Parcel */
    /* loaded from: classes13.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: readTypedObject */
        public static <T> T m104798xe31d04d3(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: writeTypedObject */
        public static <T extends android.os.Parcelable> void m104799xcd6eea(android.os.Parcel parcel, T t17, int i17) {
            if (t17 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t17.writeToParcel(parcel, i17);
            }
        }
    }

    /* renamed from: cancelDownloadTask */
    void mo104783x48fc89c7(java.lang.String str, java.lang.String str2);

    /* renamed from: getDownloadTaskInfo */
    com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26663xc1a70300 mo104784x69694ff1(java.lang.String str, java.lang.String str2);

    /* renamed from: getServiceVersion */
    int mo104785x8a0bb559();

    /* renamed from: isAllDownloadFinished */
    boolean mo104786xe58d0751();

    /* renamed from: pauseDownloadTask */
    void mo104787xb0172743(java.lang.String str, java.lang.String str2);

    /* renamed from: registerDownloadTaskCallback */
    void mo104788x8f0da8d5(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4);

    /* renamed from: setServiceSetingIsDownloadWifiOnly */
    void mo104789xa56831c6(boolean z17);

    /* renamed from: setServiceSetingIsTaskAutoResume */
    void mo104790x80c86a1e(boolean z17);

    /* renamed from: setServiceSetingMaxTaskNum */
    void mo104791x39ddf030(int i17);

    /* renamed from: startDownloadTask */
    int mo104792x729383af(java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, java.lang.String str4, java.lang.String str5, java.util.Map map);

    /* renamed from: unregisterDownloadTaskCallback */
    void mo104793x9e4c47ee(java.lang.String str, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 interfaceC26645x556a9ec4);
}

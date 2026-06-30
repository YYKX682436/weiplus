package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2;

/* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine */
/* loaded from: classes13.dex */
public interface InterfaceC26799xc8a6b9cf extends android.os.IInterface {

    /* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f57335xf04ebf6f = "com.huawei.multimedia.audioengine.IHwAudioEngine";

        /* renamed from: TRANSACTION_getSupportedFeatures */
        static final int f57336x62e80d36 = 1;

        /* renamed from: TRANSACTION_init */
        static final int f57337x30803df1 = 3;

        /* renamed from: TRANSACTION_isFeatureSupported */
        static final int f57338xfa9366c3 = 2;

        /* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioEngine$Stub$a */
        /* loaded from: classes9.dex */
        public static class a implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf {

            /* renamed from: a, reason: collision with root package name */
            private android.os.IBinder f297243a;

            public a(android.os.IBinder iBinder) {
                this.f297243a = iBinder;
            }

            @Override // android.os.IInterface
            public final android.os.IBinder asBinder() {
                return this.f297243a;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf
            /* renamed from: getSupportedFeatures */
            public final java.util.List mo105715x55fd1655() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf.Stub.f57335xf04ebf6f);
                    this.f297243a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readArrayList(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf.Stub.a.class.getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf
            /* renamed from: init */
            public final void mo105716x316510(java.lang.String str, java.lang.String str2) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf.Stub.f57335xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.f297243a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf
            /* renamed from: isFeatureSupported */
            public final boolean mo105717x4f462ba2(int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf.Stub.f57335xf04ebf6f);
                    obtain.writeInt(i17);
                    this.f297243a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f57335xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf m105718xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f57335xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf)) ? new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf.Stub.a(iBinder) : (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26799xc8a6b9cf) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(f57335xf04ebf6f);
                java.util.List mo105715x55fd1655 = mo105715x55fd1655();
                parcel2.writeNoException();
                parcel2.writeList(mo105715x55fd1655);
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(f57335xf04ebf6f);
                boolean mo105717x4f462ba2 = mo105717x4f462ba2(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(mo105717x4f462ba2 ? 1 : 0);
                return true;
            }
            if (i17 != 3) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(f57335xf04ebf6f);
                return true;
            }
            parcel.enforceInterface(f57335xf04ebf6f);
            mo105716x316510(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: getSupportedFeatures */
    java.util.List mo105715x55fd1655();

    /* renamed from: init */
    void mo105716x316510(java.lang.String str, java.lang.String str2);

    /* renamed from: isFeatureSupported */
    boolean mo105717x4f462ba2(int i17);
}

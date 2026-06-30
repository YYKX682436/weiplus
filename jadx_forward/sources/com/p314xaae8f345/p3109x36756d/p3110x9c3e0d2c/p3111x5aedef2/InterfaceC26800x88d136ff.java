package com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2;

/* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature */
/* loaded from: classes13.dex */
public interface InterfaceC26800x88d136ff extends android.os.IInterface {

    /* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff {

        /* renamed from: DESCRIPTOR */
        private static final java.lang.String f57339xf04ebf6f = "com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature";

        /* renamed from: TRANSACTION_enableKaraokeFeature */
        static final int f57340x34e9dbb6 = 2;

        /* renamed from: TRANSACTION_getKaraokeLatency */
        static final int f57341xb2ed502f = 3;

        /* renamed from: TRANSACTION_init */
        static final int f57342x30803df1 = 5;

        /* renamed from: TRANSACTION_isKaraokeFeatureSupport */
        static final int f57343x35c5d172 = 1;

        /* renamed from: TRANSACTION_setParameter */
        static final int f57344xe05c4d48 = 4;

        /* renamed from: com.tencent.trtc.hardwareearmonitor.daisy.IDaisyAudioKaraokeFeature$Stub$a */
        /* loaded from: classes13.dex */
        public static class a implements com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff {

            /* renamed from: a, reason: collision with root package name */
            private android.os.IBinder f297244a;

            public a(android.os.IBinder iBinder) {
                this.f297244a = iBinder;
            }

            @Override // android.os.IInterface
            public final android.os.IBinder asBinder() {
                return this.f297244a;
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff
            /* renamed from: enableKaraokeFeature */
            public final int mo105719x27fee4d5(boolean z17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff.Stub.f57339xf04ebf6f);
                    obtain.writeInt(z17 ? 1 : 0);
                    this.f297244a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff
            /* renamed from: getKaraokeLatency */
            public final int mo105720xce6ef370() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff.Stub.f57339xf04ebf6f);
                    this.f297244a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff
            /* renamed from: init */
            public final void mo105721x316510(java.lang.String str) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff.Stub.f57339xf04ebf6f);
                    obtain.writeString(str);
                    this.f297244a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff
            /* renamed from: isKaraokeFeatureSupport */
            public final boolean mo105722xf2b63ff3() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff.Stub.f57339xf04ebf6f);
                    this.f297244a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff
            /* renamed from: setParameter */
            public final int mo105723xd03fe567(java.lang.String str, int i17) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff.Stub.f57339xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeInt(i17);
                    this.f297244a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f57339xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff m105724xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(f57339xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff)) ? new com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff.Stub.a(iBinder) : (com.p314xaae8f345.p3109x36756d.p3110x9c3e0d2c.p3111x5aedef2.InterfaceC26800x88d136ff) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 == 1) {
                parcel.enforceInterface(f57339xf04ebf6f);
                boolean mo105722xf2b63ff3 = mo105722xf2b63ff3();
                parcel2.writeNoException();
                parcel2.writeInt(mo105722xf2b63ff3 ? 1 : 0);
                return true;
            }
            if (i17 == 2) {
                parcel.enforceInterface(f57339xf04ebf6f);
                int mo105719x27fee4d5 = mo105719x27fee4d5(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(mo105719x27fee4d5);
                return true;
            }
            if (i17 == 3) {
                parcel.enforceInterface(f57339xf04ebf6f);
                int mo105720xce6ef370 = mo105720xce6ef370();
                parcel2.writeNoException();
                parcel2.writeInt(mo105720xce6ef370);
                return true;
            }
            if (i17 == 4) {
                parcel.enforceInterface(f57339xf04ebf6f);
                int mo105723xd03fe567 = mo105723xd03fe567(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(mo105723xd03fe567);
                return true;
            }
            if (i17 != 5) {
                if (i17 != 1598968902) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                parcel2.writeString(f57339xf04ebf6f);
                return true;
            }
            parcel.enforceInterface(f57339xf04ebf6f);
            mo105721x316510(parcel.readString());
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: enableKaraokeFeature */
    int mo105719x27fee4d5(boolean z17);

    /* renamed from: getKaraokeLatency */
    int mo105720xce6ef370();

    /* renamed from: init */
    void mo105721x316510(java.lang.String str);

    /* renamed from: isKaraokeFeatureSupport */
    boolean mo105722xf2b63ff3();

    /* renamed from: setParameter */
    int mo105723xd03fe567(java.lang.String str, int i17);
}

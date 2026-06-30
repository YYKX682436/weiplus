package com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0;

/* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback */
/* loaded from: classes13.dex */
public interface InterfaceC26645x556a9ec4 extends android.os.IInterface {

    /* renamed from: DESCRIPTOR */
    public static final java.lang.String f55945xf04ebf6f = "com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback";

    /* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback$Default */
    /* loaded from: classes13.dex */
    public static class Default implements com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 {
        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4
        /* renamed from: OnDownloadSDKServiceTaskProgressChanged */
        public void mo104779xcbedf400(java.lang.String str, java.lang.String str2, long j17, long j18) {
        }

        @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4
        /* renamed from: OnDownloadSDKServiceTaskStateChanged */
        public void mo104780xb39b9b4a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18) {
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }
    }

    /* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback$Stub */
    /* loaded from: classes13.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 {

        /* renamed from: TRANSACTION_OnDownloadSDKServiceTaskProgressChanged */
        static final int f55946x4c00a77f = 2;

        /* renamed from: TRANSACTION_OnDownloadSDKServiceTaskStateChanged */
        static final int f55947xcd26b02b = 1;

        /* renamed from: com.tencent.tmassistantsdk.aidl.ITMAssistantDownloadSDKServiceCallback$Stub$Proxy */
        /* loaded from: classes13.dex */
        public static class Proxy implements com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 {

            /* renamed from: mRemote */
            private android.os.IBinder f55948x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f55948x17b71f13 = iBinder;
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4
            /* renamed from: OnDownloadSDKServiceTaskProgressChanged */
            public void mo104779xcbedf400(java.lang.String str, java.lang.String str2, long j17, long j18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.f55945xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeLong(j17);
                    obtain.writeLong(j18);
                    this.f55948x17b71f13.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4
            /* renamed from: OnDownloadSDKServiceTaskStateChanged */
            public void mo104780xb39b9b4a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.f55945xf04ebf6f);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(i17);
                    obtain.writeInt(i18);
                    obtain.writeString(str3);
                    obtain.writeInt(z17 ? 1 : 0);
                    obtain.writeInt(z18 ? 1 : 0);
                    this.f55948x17b71f13.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f55948x17b71f13;
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m104782x19238652() {
                return com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.f55945xf04ebf6f;
            }
        }

        public Stub() {
            attachInterface(this, com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.f55945xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4 m104781xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.f55945xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4)) ? new com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.f55945xf04ebf6f);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.p314xaae8f345.p3085x8ea91595.p3086x2daeb0.InterfaceC26645x556a9ec4.f55945xf04ebf6f);
                return true;
            }
            if (i17 == 1) {
                mo104780xb39b9b4a(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                parcel2.writeNoException();
            } else {
                if (i17 != 2) {
                    return super.onTransact(i17, parcel, parcel2, i18);
                }
                mo104779xcbedf400(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
            }
            return true;
        }
    }

    /* renamed from: OnDownloadSDKServiceTaskProgressChanged */
    void mo104779xcbedf400(java.lang.String str, java.lang.String str2, long j17, long j18);

    /* renamed from: OnDownloadSDKServiceTaskStateChanged */
    void mo104780xb39b9b4a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, boolean z17, boolean z18);
}

package com.p314xaae8f345.p3121x37984a.p3130x91727fcf;

/* renamed from: com.tencent.wcdb.support.ICancellationSignal */
/* loaded from: classes12.dex */
public interface InterfaceC26989x948c71b4 extends android.os.IInterface {

    /* renamed from: DESCRIPTOR */
    public static final java.lang.String f58428xf04ebf6f = "com.tencent.wcdb.support.ICancellationSignal";

    /* renamed from: com.tencent.wcdb.support.ICancellationSignal$Default */
    /* loaded from: classes12.dex */
    public static class Default implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4
        /* renamed from: cancel */
        public void mo108012xae7a2e7a() {
        }
    }

    /* renamed from: com.tencent.wcdb.support.ICancellationSignal$Stub */
    /* loaded from: classes12.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 {

        /* renamed from: TRANSACTION_cancel */
        static final int f58429x676531b = 1;

        /* renamed from: com.tencent.wcdb.support.ICancellationSignal$Stub$Proxy */
        /* loaded from: classes12.dex */
        public static class Proxy implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 {

            /* renamed from: mRemote */
            private android.os.IBinder f58430x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f58430x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f58430x17b71f13;
            }

            @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4
            /* renamed from: cancel */
            public void mo108012xae7a2e7a() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.f58428xf04ebf6f);
                    this.f58430x17b71f13.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m108025x19238652() {
                return com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.f58428xf04ebf6f;
            }
        }

        public Stub() {
            attachInterface(this, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.f58428xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4 m108024xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.f58428xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4)) ? new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.f58428xf04ebf6f);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.InterfaceC26989x948c71b4.f58428xf04ebf6f);
                return true;
            }
            if (i17 != 1) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            mo108012xae7a2e7a();
            return true;
        }
    }

    /* renamed from: cancel */
    void mo108012xae7a2e7a();
}

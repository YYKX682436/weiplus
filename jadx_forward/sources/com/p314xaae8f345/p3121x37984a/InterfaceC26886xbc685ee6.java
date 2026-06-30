package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.IContentObserver */
/* loaded from: classes12.dex */
public interface InterfaceC26886xbc685ee6 extends android.os.IInterface {

    /* renamed from: DESCRIPTOR */
    public static final java.lang.String f57810xf04ebf6f = "com.tencent.wcdb.IContentObserver";

    /* renamed from: com.tencent.wcdb.IContentObserver$Default */
    /* loaded from: classes12.dex */
    public static class Default implements com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6
        /* renamed from: onChange */
        public void mo106313x3dcbea6f(boolean z17, android.net.Uri uri) {
        }
    }

    /* renamed from: com.tencent.wcdb.IContentObserver$Stub */
    /* loaded from: classes12.dex */
    public static abstract class Stub extends android.os.Binder implements com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 {

        /* renamed from: TRANSACTION_onChange */
        static final int f57811x87516ad0 = 1;

        /* renamed from: com.tencent.wcdb.IContentObserver$Stub$Proxy */
        /* loaded from: classes12.dex */
        public static class Proxy implements com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 {

            /* renamed from: mRemote */
            private android.os.IBinder f57812x17b71f13;

            public Proxy(android.os.IBinder iBinder) {
                this.f57812x17b71f13 = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f57812x17b71f13;
            }

            /* renamed from: getInterfaceDescriptor */
            public java.lang.String m106315x19238652() {
                return com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.f57810xf04ebf6f;
            }

            @Override // com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6
            /* renamed from: onChange */
            public void mo106313x3dcbea6f(boolean z17, android.net.Uri uri) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.f57810xf04ebf6f);
                    obtain.writeInt(z17 ? 1 : 0);
                    com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6._Parcel.m106319xcd6eea(obtain, uri, 0);
                    this.f57812x17b71f13.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.f57810xf04ebf6f);
        }

        /* renamed from: asInterface */
        public static com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 m106314xbd0d1927(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.f57810xf04ebf6f);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6)) ? new com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.Stub.Proxy(iBinder) : (com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
            if (i17 >= 1 && i17 <= 16777215) {
                parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.f57810xf04ebf6f);
            }
            if (i17 == 1598968902) {
                parcel2.writeString(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.f57810xf04ebf6f);
                return true;
            }
            if (i17 != 1) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            mo106313x3dcbea6f(parcel.readInt() != 0, (android.net.Uri) com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6._Parcel.m106318xe31d04d3(parcel, android.net.Uri.CREATOR));
            return true;
        }
    }

    /* renamed from: com.tencent.wcdb.IContentObserver$_Parcel */
    /* loaded from: classes12.dex */
    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: readTypedObject */
        public static <T> T m106318xe31d04d3(android.os.Parcel parcel, android.os.Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: writeTypedObject */
        public static <T extends android.os.Parcelable> void m106319xcd6eea(android.os.Parcel parcel, T t17, int i17) {
            if (t17 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t17.writeToParcel(parcel, i17);
            }
        }
    }

    /* renamed from: onChange */
    void mo106313x3dcbea6f(boolean z17, android.net.Uri uri);
}

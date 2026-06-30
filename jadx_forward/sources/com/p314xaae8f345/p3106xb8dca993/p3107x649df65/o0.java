package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes13.dex */
public interface o0 extends android.os.IInterface {

    /* loaded from: classes13.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o0 {

        /* renamed from: com.tencent.tmsqmsp.oaid2.o0$a$a, reason: collision with other inner class name */
        /* loaded from: classes13.dex */
        public static class C30932a implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o0 {

            /* renamed from: a, reason: collision with root package name */
            public android.os.IBinder f297160a;

            public C30932a(android.os.IBinder iBinder) {
                this.f297160a = iBinder;
            }

            public java.lang.String a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                java.lang.String str4;
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.openid.IOpenID");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    this.f297160a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    str4 = obtain2.readString();
                } catch (java.lang.Throwable unused) {
                    str4 = "";
                }
                try {
                    obtain2.recycle();
                    obtain.recycle();
                } catch (java.lang.Throwable unused2) {
                }
                return str4;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f297160a;
            }
        }

        public static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o0 a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o0)) ? new com.tencent.tmsqmsp.oaid2.o0.a.C30932a(iBinder) : (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.o0) queryLocalInterface;
        }
    }
}

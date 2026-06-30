package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public interface n extends android.os.IInterface {

    /* loaded from: classes8.dex */
    public static abstract class a extends android.os.Binder implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n {

        /* renamed from: com.tencent.tmsqmsp.oaid2.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public static class C30931a implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n {

            /* renamed from: a, reason: collision with root package name */
            public android.os.IBinder f297152a;

            public C30931a(android.os.IBinder iBinder) {
                this.f297152a = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.f297152a;
            }

            @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n
            public boolean b() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                boolean z17 = true;
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.f297152a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z17 = false;
                    }
                } catch (java.lang.Exception unused) {
                } catch (java.lang.Throwable th6) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th6;
                }
                obtain2.recycle();
                obtain.recycle();
                return z17;
            }

            @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n
            public java.lang.String c() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.f297152a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    java.lang.String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (java.lang.Throwable unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                }
            }

            @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n
            public java.lang.String i() {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                android.os.Parcel obtain2 = android.os.Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.asus.msa.SupplementaryDID.IDidAidlInterface");
                    this.f297152a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    java.lang.String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    return readString;
                } catch (java.lang.Throwable unused) {
                    obtain2.recycle();
                    obtain.recycle();
                    return "";
                }
            }
        }

        public static com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n a(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.asus.msa.SupplementaryDID.IDidAidlInterface");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n)) ? new com.tencent.tmsqmsp.oaid2.n.a.C30931a(iBinder) : (com.p314xaae8f345.p3106xb8dca993.p3107x649df65.n) queryLocalInterface;
        }
    }

    boolean b();

    java.lang.String c();

    java.lang.String i();
}

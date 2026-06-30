package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public final class y1 implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f297222d;

    public y1(android.os.IBinder iBinder) {
        this.f297222d = iBinder;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y
    public final java.lang.String a() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            this.f297222d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            java.lang.String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (android.os.RemoteException unused) {
            obtain2.recycle();
            obtain.recycle();
            return "";
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f297222d;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y
    public final boolean c() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        boolean z17 = false;
        try {
            obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            this.f297222d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z17 = true;
            }
        } catch (android.os.RemoteException unused) {
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
        obtain2.recycle();
        obtain.recycle();
        return z17;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y
    public final java.lang.String d() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            this.f297222d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            java.lang.String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (android.os.RemoteException unused) {
            obtain2.recycle();
            obtain.recycle();
            return "";
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y
    public final void f() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            this.f297222d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } catch (android.os.RemoteException unused) {
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.y
    public final boolean g() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        boolean z17 = false;
        try {
            obtain.writeInterfaceToken("com.bun.lib.MsaIdInterface");
            this.f297222d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z17 = true;
            }
        } catch (android.os.RemoteException unused) {
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
        obtain2.recycle();
        obtain.recycle();
        return z17;
    }
}

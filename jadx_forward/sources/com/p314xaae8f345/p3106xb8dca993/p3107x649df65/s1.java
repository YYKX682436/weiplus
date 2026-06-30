package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public final class s1 implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f297197d;

    public s1(android.os.IBinder iBinder) {
        this.f297197d = iBinder;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0
    public final java.lang.String a(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
            obtain.writeString(str);
            this.f297197d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            java.lang.String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (android.os.RemoteException unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this.f297197d;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.q0
    public final java.lang.String a() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.samsung.android.deviceidservice.IDeviceIdService");
            this.f297197d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            java.lang.String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            return readString;
        } catch (android.os.RemoteException unused) {
            obtain2.recycle();
            obtain.recycle();
            return null;
        } catch (java.lang.Throwable th6) {
            obtain2.recycle();
            obtain.recycle();
            throw th6;
        }
    }
}

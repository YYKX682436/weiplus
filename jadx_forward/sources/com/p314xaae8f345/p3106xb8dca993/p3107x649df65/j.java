package com.p314xaae8f345.p3106xb8dca993.p3107x649df65;

/* loaded from: classes8.dex */
public class j implements com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k {

    /* renamed from: a, reason: collision with root package name */
    public android.os.IBinder f297133a;

    public j(android.os.IBinder iBinder) {
        this.f297133a = iBinder;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k
    public void a(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i iVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
            obtain.writeStrongBinder(iVar != null ? (com.tencent.tmsqmsp.oaid2.i.a) iVar : null);
            this.f297133a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } catch (java.lang.Exception unused) {
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f297133a;
    }

    @Override // com.p314xaae8f345.p3106xb8dca993.p3107x649df65.k
    public void b(com.p314xaae8f345.p3106xb8dca993.p3107x649df65.i iVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.hihonor.cloudservice.oaid.IOAIDService");
            obtain.writeStrongBinder(iVar != null ? (com.tencent.tmsqmsp.oaid2.i.a) iVar : null);
            this.f297133a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } catch (java.lang.Exception unused) {
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

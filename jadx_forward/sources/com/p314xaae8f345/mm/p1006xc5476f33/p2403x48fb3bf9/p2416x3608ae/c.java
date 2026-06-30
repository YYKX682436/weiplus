package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f265057d;

    public c(android.os.IBinder iBinder) {
        this.f265057d = iBinder;
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f265057d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.e
    /* renamed from: getRet */
    public int mo74361xb588696b() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
            this.f265057d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.e
    public boolean k2() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
            this.f265057d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

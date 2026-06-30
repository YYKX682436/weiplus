package com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f134451d;

    public a(android.os.IBinder iBinder) {
        this.f134451d = iBinder;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c
    public java.util.Map Sh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
            if (!this.f134451d.transact(1, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.b.f134452d;
            }
            obtain2.readException();
            return obtain2.readHashMap(com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.a.class.getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c
    public void Vi() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
            if (!this.f134451d.transact(2, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.b.f134452d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f134451d;
    }
}

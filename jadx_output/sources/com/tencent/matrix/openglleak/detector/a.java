package com.tencent.matrix.openglleak.detector;

/* loaded from: classes12.dex */
public class a implements com.tencent.matrix.openglleak.detector.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f52918d;

    public a(android.os.IBinder iBinder) {
        this.f52918d = iBinder;
    }

    @Override // com.tencent.matrix.openglleak.detector.c
    public java.util.Map Sh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
            if (!this.f52918d.transact(1, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.openglleak.detector.b.f52919d;
            }
            obtain2.readException();
            return obtain2.readHashMap(com.tencent.matrix.openglleak.detector.a.class.getClassLoader());
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.openglleak.detector.c
    public void Vi() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
            if (!this.f52918d.transact(2, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.openglleak.detector.b.f52919d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f52918d;
    }
}

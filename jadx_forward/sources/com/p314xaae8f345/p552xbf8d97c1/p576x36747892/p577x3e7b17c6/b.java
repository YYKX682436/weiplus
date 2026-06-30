package com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6;

/* loaded from: classes12.dex */
public abstract class b extends android.os.Binder implements com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f134452d = 0;

    public b() {
        attachInterface(this, "com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1) {
            parcel.enforceInterface("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
            java.util.Map Sh = ((com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.d) this).Sh();
            parcel2.writeNoException();
            parcel2.writeMap(Sh);
            return true;
        }
        if (i17 != 2) {
            if (i17 != 1598968902) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeString("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
            return true;
        }
        parcel.enforceInterface("com.tencent.matrix.openglleak.detector.IOpenglIndexDetector");
        ((com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p577x3e7b17c6.d) this).Vi();
        parcel2.writeNoException();
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public abstract class d extends android.os.Binder implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.e {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f265059d = 0;

    public d() {
        attachInterface(this, "com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.webview.stub.FavUrl_Result_AIDL");
            return true;
        }
        if (i17 == 1) {
            boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.m0) this).f265078e;
            parcel2.writeNoException();
            parcel2.writeInt(z17 ? 1 : 0);
        } else if (i17 == 2) {
            parcel2.writeNoException();
            parcel2.writeInt(0);
        } else if (i17 == 3) {
            int i19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.m0) this).f265079f;
            parcel2.writeNoException();
            parcel2.writeInt(i19);
        } else {
            if (i17 != 4) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            parcel2.writeNoException();
            parcel2.writeInt(0);
        }
        return true;
    }
}

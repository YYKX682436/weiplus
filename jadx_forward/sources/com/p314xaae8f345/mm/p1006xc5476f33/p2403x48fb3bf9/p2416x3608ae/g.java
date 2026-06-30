package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes8.dex */
public abstract class g extends android.os.Binder implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.h {
    public g() {
        attachInterface(this, "com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
            return true;
        }
        if (i17 == 1) {
            int i19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.n0) this).f265085d;
            parcel2.writeNoException();
            parcel2.writeInt(i19);
        } else if (i17 == 2) {
            int i27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.n0) this).f265086e;
            parcel2.writeNoException();
            parcel2.writeInt(i27);
        } else if (i17 == 3) {
            int i28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.n0) this).f265087f;
            parcel2.writeNoException();
            parcel2.writeInt(i28);
        } else if (i17 == 4) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.n0) this).f265088g;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else {
            if (i17 != 5) {
                return super.onTransact(i17, parcel, parcel2, i18);
            }
            android.os.Bundle bundle = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.n0) this).f265089h;
            parcel2.writeNoException();
            if (bundle != null) {
                parcel2.writeInt(1);
                bundle.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
        }
        return true;
    }
}

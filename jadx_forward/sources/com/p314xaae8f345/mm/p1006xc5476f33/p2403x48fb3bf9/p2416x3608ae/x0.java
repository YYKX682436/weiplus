package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public abstract class x0 extends android.os.Binder implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f265114d = 0;

    public x0() {
        attachInterface(this, "com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.h fVar;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.webview.stub.WebViewStub_Callback_AIDL");
            return true;
        }
        switch (i17) {
            case 1:
                boolean v37 = v3(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(v37 ? 1 : 0);
                return true;
            case 2:
                int readInt = parcel.readInt();
                android.os.Bundle bundle = (android.os.Bundle) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.a(parcel, android.os.Bundle.CREATOR);
                boolean mo70207xf5bc2045 = mo70207xf5bc2045(readInt, bundle);
                parcel2.writeNoException();
                parcel2.writeInt(mo70207xf5bc2045 ? 1 : 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.b(parcel2, bundle, 1);
                return true;
            case 3:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    fVar = null;
                } else {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.webview.stub.OnSceneEnd_AIDL");
                    fVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.h)) ? new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.f(readStrongBinder) : (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.h) queryLocalInterface;
                }
                boolean Cg = Cg(fVar);
                parcel2.writeNoException();
                parcel2.writeInt(Cg ? 1 : 0);
                return true;
            case 4:
                boolean aj6 = aj(parcel.readString(), parcel.readString(), (android.os.Bundle) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.a(parcel, android.os.Bundle.CREATOR), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeInt(aj6 ? 1 : 0);
                return true;
            case 5:
                java.lang.String E6 = E6();
                parcel2.writeNoException();
                parcel2.writeString(E6);
                return true;
            case 6:
                java.lang.String mo70208xad58292c = mo70208xad58292c();
                parcel2.writeNoException();
                parcel2.writeString(mo70208xad58292c);
                return true;
            case 7:
                java.lang.String Ni = Ni();
                parcel2.writeNoException();
                parcel2.writeString(Ni);
                return true;
            case 8:
                java.lang.String za6 = za();
                parcel2.writeNoException();
                parcel2.writeString(za6);
                return true;
            case 9:
                int X1 = X1();
                parcel2.writeNoException();
                parcel2.writeInt(X1);
                return true;
            case 10:
                da(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 11:
                w8(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 12:
                te(parcel.readInt(), (android.os.Bundle) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                ec();
                parcel2.writeNoException();
                return true;
            case 14:
                b((android.os.Bundle) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                W1(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                D3(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 17:
                V1();
                parcel2.writeNoException();
                return true;
            case 18:
                t3(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 19:
                android.os.Bundle i19 = i(parcel.readInt(), (android.os.Bundle) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.b(parcel2, i19, 1);
                return true;
            case 20:
                Ae((android.os.Bundle) com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.a(parcel, android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 21:
                d5(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 22:
                Ic(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 23:
                android.os.Bundle H6 = H6(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.y0.b(parcel2, H6, 1);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

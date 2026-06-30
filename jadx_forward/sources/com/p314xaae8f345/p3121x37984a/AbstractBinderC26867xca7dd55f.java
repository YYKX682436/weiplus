package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.BulkCursorNative */
/* loaded from: classes12.dex */
public abstract class AbstractBinderC26867xca7dd55f extends android.os.Binder implements com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 {
    public AbstractBinderC26867xca7dd55f() {
        attachInterface(this, com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
    }

    /* renamed from: asInterface */
    public static com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 m106143xbd0d1927(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031 interfaceC26885x9ba19031 = (com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031) iBinder.queryLocalInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
        return interfaceC26885x9ba19031 != null ? interfaceC26885x9ba19031 : new com.p314xaae8f345.p3121x37984a.C26868x407a7c26(iBinder);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        try {
            switch (i17) {
                case 1:
                    parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                    com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106147x3622fee6 = mo106147x3622fee6(parcel.readInt());
                    parcel2.writeNoException();
                    if (mo106147x3622fee6 == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        mo106147x3622fee6.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 2:
                    parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                    mo106145x88fbd074();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                    int mo106149x414ef275 = mo106149x414ef275(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6.Stub.m106314xbd0d1927(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(mo106149x414ef275);
                    parcel2.writeBundle(mo106146x18421159());
                    return true;
                case 4:
                    parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                    mo106148xc39cb650(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                    android.os.Bundle mo106146x18421159 = mo106146x18421159();
                    parcel2.writeNoException();
                    parcel2.writeBundle(mo106146x18421159);
                    return true;
                case 6:
                    parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                    android.os.Bundle mo106150x41690095 = mo106150x41690095(parcel.readBundle(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeBundle(mo106150x41690095);
                    return true;
                case 7:
                    parcel.enforceInterface(com.p314xaae8f345.p3121x37984a.InterfaceC26885x9ba19031.f57809xd364d36f);
                    mo106144x5a5ddf8();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i17, parcel, parcel2, i18);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106281x579329b4(parcel2, e17);
            return true;
        }
    }
}

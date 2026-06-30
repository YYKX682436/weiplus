package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

/* loaded from: classes7.dex */
public abstract class m4 extends android.os.Binder implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f229606d = 0;

    public m4() {
        attachInterface(this, "com.tencent.mm.plugin.magicbrush.IMBServerMgr");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        qc3.c aVar;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.magicbrush.IMBServerMgr");
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        java.lang.String readString = parcel.readString();
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof qc3.c)) ? new qc3.a(readStrongBinder) : (qc3.c) queryLocalInterface;
        }
        qc3.f B5 = ((pc3.t) this).B5(readString, aVar);
        parcel2.writeNoException();
        parcel2.writeStrongInterface(B5);
        return true;
    }
}

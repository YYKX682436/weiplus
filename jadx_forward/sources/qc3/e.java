package qc3;

/* loaded from: classes7.dex */
public abstract class e extends android.os.Binder implements qc3.f {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f443045d = 0;

    public e() {
        attachInterface(this, "com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.magicbrush.core.api.IMBServer");
            return true;
        }
        switch (i17) {
            case 1:
                ((tc3.m0) this).s2(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 2:
                ((tc3.m0) this).w9(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                ((tc3.m0) this).J5(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                ((tc3.m0) this).fj(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5:
                ((tc3.m0) this).pg(parcel.readInt(), (android.view.Surface) (parcel.readInt() != 0 ? android.view.Surface.CREATOR.createFromParcel(parcel) : null), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 6:
                ((tc3.m0) this).cj(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 7:
                ((tc3.m0) this).yd(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 8:
                ((tc3.m0) this).M1(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.createIntArray(), parcel.createFloatArray(), parcel.createFloatArray());
                parcel2.writeNoException();
                return true;
            case 9:
                ((tc3.m0) this).w3((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b) (parcel.readInt() != 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b.f37477x681a0c0c.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            case 10:
                ((tc3.m0) this).D1();
                parcel2.writeNoException();
                return true;
            case 11:
                ((tc3.m0) this).z3();
                parcel2.writeNoException();
                return true;
            case 12:
                ((tc3.m0) this).uc();
                parcel2.writeNoException();
                return true;
            case 13:
                ((tc3.m0) this).Oc(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 14:
                ((tc3.m0) this).mo159830x764d819b(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

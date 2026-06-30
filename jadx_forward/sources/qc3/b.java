package qc3;

/* loaded from: classes7.dex */
public abstract class b extends android.os.Binder implements qc3.c {
    public b() {
        attachInterface(this, "com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.magicbrush.core.api.IMBClient");
            return true;
        }
        switch (i17) {
            case 1:
                C3(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 2:
                B8(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                K3(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 4:
                Bi(parcel.readInt(), parcel.createFloatArray(), parcel.createFloatArray(), parcel.createFloatArray(), parcel.createFloatArray());
                parcel2.writeNoException();
                return true;
            case 5:
                c(parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 6:
                mo159828x8cf48009();
                parcel2.writeNoException();
                return true;
            case 7:
                n();
                parcel2.writeNoException();
                return true;
            case 8:
                mo159829xac79a11b();
                parcel2.writeNoException();
                return true;
            case 9:
                java.lang.String ih6 = ih(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(ih6);
                return true;
            case 10:
                j6(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 11:
                Da(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 12:
                Ke(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 13:
                h(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 14:
                F2(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 15:
                Oe();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

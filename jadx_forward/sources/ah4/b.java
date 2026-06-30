package ah4;

/* loaded from: classes13.dex */
public abstract class b extends android.os.Binder implements ah4.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f86531d = 0;

    public b() {
        attachInterface(this, "com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.plugin.talkroom.component.IEngine_AIDL");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b interfaceC18546xdab69d9b = null;
        ah4.h hVar = null;
        switch (i17) {
            case 1:
                int I7 = ((ah4.y) this).I7();
                parcel2.writeNoException();
                parcel2.writeInt(I7);
                return true;
            case 2:
                int F8 = ((ah4.y) this).F8();
                parcel2.writeNoException();
                parcel2.writeInt(F8);
                return true;
            case 3:
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.ILiveConEngineCallback_AIDL");
                    interfaceC18546xdab69d9b = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b)) ? new ah4.d(readStrongBinder) : (com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.p2255xac8f1cfd.InterfaceC18546xdab69d9b) queryLocalInterface;
                }
                int E5 = ((ah4.y) this).E5(interfaceC18546xdab69d9b, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.createIntArray(), parcel.createIntArray(), parcel.readInt(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(E5);
                return true;
            case 4:
                int yh6 = ((ah4.y) this).yh(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(yh6);
                return true;
            case 5:
                int Nh = ((ah4.y) this).Nh();
                parcel2.writeNoException();
                parcel2.writeInt(Nh);
                return true;
            case 6:
                int readInt = parcel.readInt();
                int[] iArr = readInt >= 0 ? new int[readInt] : null;
                byte[] C1 = ((ah4.y) this).C1(iArr, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(C1);
                parcel2.writeIntArray(iArr);
                return true;
            case 7:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.tencent.mm.plugin.talkroom.component.IMemberUpdateCallback_AIDL");
                    hVar = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof ah4.h)) ? new ah4.f(readStrongBinder2) : (ah4.h) queryLocalInterface2;
                }
                ah4.n Pb = ((ah4.y) this).Pb(hVar);
                parcel2.writeNoException();
                parcel2.writeStrongInterface(Pb);
                return true;
            case 8:
                ah4.k H4 = ((ah4.y) this).H4();
                parcel2.writeNoException();
                parcel2.writeStrongInterface(H4);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

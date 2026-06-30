package b;

/* loaded from: classes13.dex */
public abstract class d extends android.os.Binder implements android.os.IInterface {
    public d() {
        attachInterface(this, "android.support.customtabs.ICustomTabsService");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1598968902) {
            parcel2.writeString("android.support.customtabs.ICustomTabsService");
            return true;
        }
        int i19 = 0;
        switch (i17) {
            case 2:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean h17 = ((s.b) this).f483359d.h(parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeInt(h17 ? 1 : 0);
                return true;
            case 3:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                b.c d17 = b.b.d(parcel.readStrongBinder());
                s.b bVar = (s.b) this;
                s.c cVar = new s.c(d17);
                try {
                    s.a aVar = new s.a(bVar, cVar);
                    synchronized (bVar.f483359d.f91298d) {
                        d17.asBinder().linkToDeath(aVar, 0);
                        ((x.n) bVar.f483359d.f91298d).put(d17.asBinder(), aVar);
                    }
                    i19 = bVar.f483359d.c(cVar);
                } catch (android.os.RemoteException unused) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(i19);
                return true;
            case 4:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean b17 = ((s.b) this).f483359d.b(new s.c(b.b.d(parcel.readStrongBinder())), parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(android.os.Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(b17 ? 1 : 0);
                return true;
            case 5:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                android.os.Bundle a17 = ((s.b) this).f483359d.a(parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                if (a17 != null) {
                    parcel2.writeInt(1);
                    a17.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            case 6:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean f17 = ((s.b) this).f483359d.f(new s.c(b.b.d(parcel.readStrongBinder())), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(f17 ? 1 : 0);
                return true;
            case 7:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean e17 = ((s.b) this).f483359d.e(new s.c(b.b.d(parcel.readStrongBinder())), parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(e17 ? 1 : 0);
                return true;
            case 8:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                int d18 = ((s.b) this).f483359d.d(new s.c(b.b.d(parcel.readStrongBinder())), parcel.readString(), parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(d18);
                return true;
            case 9:
                parcel.enforceInterface("android.support.customtabs.ICustomTabsService");
                boolean g17 = ((s.b) this).f483359d.g(new s.c(b.b.d(parcel.readStrongBinder())), parcel.readInt(), parcel.readInt() != 0 ? (android.net.Uri) android.net.Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (android.os.Bundle) android.os.Bundle.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeInt(g17 ? 1 : 0);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

package a3;

/* loaded from: classes15.dex */
public abstract class c extends android.os.Binder implements a3.d {
    public c() {
        attachInterface(this, a3.d.f82470b0);
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        a3.b aVar;
        java.lang.String str = a3.d.f82470b0;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i17 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i17 != 1) {
            return super.onTransact(i17, parcel, parcel2, i18);
        }
        android.os.IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(a3.b.f82469a0);
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof a3.b)) ? new a3.a(readStrongBinder) : (a3.b) queryLocalInterface;
        }
        b3.t tVar = (b3.t) this;
        if (aVar != null) {
            tVar.f99085d.a(new b3.s(aVar));
        }
        return true;
    }
}

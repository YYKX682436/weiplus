package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public abstract class i extends android.os.Binder implements com.tencent.matrix.lifecycle.supervisor.j {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f52842d = 0;

    public i() {
        attachInterface(this, "com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            return true;
        }
        com.tencent.matrix.lifecycle.supervisor.g gVar = null;
        switch (i17) {
            case 1:
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                com.tencent.matrix.lifecycle.supervisor.ProcessToken[] processTokenArr = (com.tencent.matrix.lifecycle.supervisor.ProcessToken[]) parcel.createTypedArray(com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR);
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
                    gVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.matrix.lifecycle.supervisor.g)) ? new com.tencent.matrix.lifecycle.supervisor.e(readStrongBinder) : (com.tencent.matrix.lifecycle.supervisor.g) queryLocalInterface;
                }
                ((com.tencent.matrix.lifecycle.supervisor.z0) this).a7(processTokenArr, gVar);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                ((com.tencent.matrix.lifecycle.supervisor.z0) this).fg(parcel.readInt() != 0 ? com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                ((com.tencent.matrix.lifecycle.supervisor.z0) this).a3(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                ((com.tencent.matrix.lifecycle.supervisor.z0) this).lf(parcel.readInt() != 0 ? com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                ((com.tencent.matrix.lifecycle.supervisor.z0) this).g4(parcel.readInt() != 0 ? com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                ((com.tencent.matrix.lifecycle.supervisor.z0) this).Ka(parcel.readInt() != 0 ? com.tencent.matrix.lifecycle.supervisor.ProcessToken.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                return true;
            case 7:
                parcel.enforceInterface("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
                java.lang.String F3 = ((com.tencent.matrix.lifecycle.supervisor.z0) this).F3();
                parcel2.writeNoException();
                parcel2.writeString(F3);
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

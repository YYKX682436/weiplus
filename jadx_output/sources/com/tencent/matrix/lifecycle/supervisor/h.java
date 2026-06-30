package com.tencent.matrix.lifecycle.supervisor;

/* loaded from: classes12.dex */
public class h implements com.tencent.matrix.lifecycle.supervisor.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f52840d;

    public h(android.os.IBinder iBinder) {
        this.f52840d = iBinder;
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public java.lang.String F3() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (!this.f52840d.transact(7, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
            }
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void Ka(com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (processToken != null) {
                obtain.writeInt(1);
                processToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f52840d.transact(6, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void a3(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            obtain.writeString(str);
            if (!this.f52840d.transact(3, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void a7(com.tencent.matrix.lifecycle.supervisor.ProcessToken[] processTokenArr, com.tencent.matrix.lifecycle.supervisor.g gVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            obtain.writeTypedArray(processTokenArr, 0);
            obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
            if (!this.f52840d.transact(1, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f52840d;
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void fg(com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (processToken != null) {
                obtain.writeInt(1);
                processToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f52840d.transact(2, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void g4(com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (processToken != null) {
                obtain.writeInt(1);
                processToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f52840d.transact(5, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.matrix.lifecycle.supervisor.j
    public void lf(com.tencent.matrix.lifecycle.supervisor.ProcessToken processToken) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (processToken != null) {
                obtain.writeInt(1);
                processToken.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f52840d.transact(4, obtain, obtain2, 0)) {
                int i17 = com.tencent.matrix.lifecycle.supervisor.i.f52842d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

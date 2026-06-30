package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public class h implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f134373d;

    public h(android.os.IBinder iBinder) {
        this.f134373d = iBinder;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public java.lang.String F3() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (!this.f134373d.transact(7, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i.f134375d;
            }
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void Ka(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (c4689x7ffeacea != null) {
                obtain.writeInt(1);
                c4689x7ffeacea.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f134373d.transact(6, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i.f134375d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void a3(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            obtain.writeString(str);
            if (!this.f134373d.transact(3, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i.f134375d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void a7(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea[] c4689x7ffeaceaArr, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g gVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            obtain.writeTypedArray(c4689x7ffeaceaArr, 0);
            obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
            if (!this.f134373d.transact(1, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i.f134375d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f134373d;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void fg(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (c4689x7ffeacea != null) {
                obtain.writeInt(1);
                c4689x7ffeacea.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f134373d.transact(2, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i.f134375d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void g4(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (c4689x7ffeacea != null) {
                obtain.writeInt(1);
                c4689x7ffeacea.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f134373d.transact(5, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i.f134375d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.j
    public void lf(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4689x7ffeacea c4689x7ffeacea) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISupervisorProxy");
            if (c4689x7ffeacea != null) {
                obtain.writeInt(1);
                c4689x7ffeacea.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f134373d.transact(4, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i.f134375d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

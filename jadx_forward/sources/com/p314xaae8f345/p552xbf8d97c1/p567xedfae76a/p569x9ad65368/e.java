package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public class e implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f134369d;

    public e(android.os.IBinder iBinder) {
        this.f134369d = iBinder;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public void E2(java.lang.String str, java.lang.String str2, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i17);
            if (!this.f134369d.transact(2, obtain, obtain2, 0)) {
                int i18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.f.f134370d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public void J8(java.lang.String str, java.lang.String str2, int i17, boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i17);
            obtain.writeInt(z17 ? 1 : 0);
            if (!this.f134369d.transact(3, obtain, obtain2, 0)) {
                int i18 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.f.f134370d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f134369d;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public void c5(java.lang.String str, java.lang.String str2, boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(z17 ? 1 : 0);
            if (!this.f134369d.transact(1, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.f.f134370d;
            }
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.g
    public com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403 y5() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.matrix.lifecycle.supervisor.ISubordinateProxy");
            if (!this.f134369d.transact(4, obtain, obtain2, 0)) {
                int i17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.f.f134370d;
            }
            obtain2.readException();
            return obtain2.readInt() != 0 ? com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403.f20053x681a0c0c.createFromParcel(obtain2) : null;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

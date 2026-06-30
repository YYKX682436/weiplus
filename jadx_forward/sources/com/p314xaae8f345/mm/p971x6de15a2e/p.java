package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes8.dex */
public class p implements com.p314xaae8f345.mm.p971x6de15a2e.r {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153631d;

    public p(android.os.IBinder iBinder) {
        this.f153631d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void E(byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, long j17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeByteArray(bArr);
            obtain.writeByteArray(bArr2);
            obtain.writeByteArray(bArr3);
            obtain.writeInt(i17);
            obtain.writeLong(j17);
            this.f153631d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void I0(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153631d.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] L0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public int O(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(33, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public int U0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(34, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void a(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeInt(i17);
            this.f153631d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153631d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] c1(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] f0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(24, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: getUin */
    public int mo9862xb5887524() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: getUsername */
    public java.lang.String mo9863x6c03c64c() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void i0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: isForeground */
    public boolean mo9864xf7b3660d() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: isLogin */
    public boolean mo9865x7b0e9c5f() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void l1(java.lang.String str, byte[] bArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            obtain.writeByteArray(bArr);
            this.f153631d.transact(13, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] o() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public java.lang.String q() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r
    public byte[] qh() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(36, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] r(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeInt(i17);
            this.f153631d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    /* renamed from: reset */
    public void mo9866x6761d4f() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] s() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r
    /* renamed from: setUsername */
    public void mo48332x66bc2758(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] v(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public void v0(com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            if (binderC11173x1cfac0af != null) {
                obtain.writeInt(1);
                binderC11173x1cfac0af.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f153631d.transact(19, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public boolean x(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            obtain.writeString(str);
            this.f153631d.transact(27, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r
    public byte[] xb() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(35, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.r, com.p314xaae8f345.mm.p971x6de15a2e.o
    public byte[] y0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IAccInfo_AIDL");
            this.f153631d.transact(39, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

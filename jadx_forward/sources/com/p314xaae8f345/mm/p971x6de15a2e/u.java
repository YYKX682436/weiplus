package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public class u implements com.p314xaae8f345.mm.p971x6de15a2e.v {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f153677d;

    public u(android.os.IBinder iBinder) {
        this.f153677d = iBinder;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String A0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public com.p314xaae8f345.mm.p971x6de15a2e.h0 Ai() {
        com.p314xaae8f345.mm.p971x6de15a2e.h0 f0Var;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = com.p314xaae8f345.mm.p971x6de15a2e.g0.f153519d;
            if (readStrongBinder == null) {
                f0Var = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                f0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.h0)) ? new com.p314xaae8f345.mm.p971x6de15a2e.f0(readStrongBinder) : (com.p314xaae8f345.mm.p971x6de15a2e.h0) queryLocalInterface;
            }
            return f0Var;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void B(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void C(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(38, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int D(int[] iArr, boolean z17, long j17, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeIntArray(iArr);
            obtain.writeInt(z17 ? 1 : 0);
            obtain.writeLong(j17);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f153677d.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int D0(java.lang.String str, boolean z17, java.util.List list) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.readStringList(list);
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void F() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    /* renamed from: G */
    public com.p314xaae8f345.mm.p971x6de15a2e.r mo180101G() {
        com.p314xaae8f345.mm.p971x6de15a2e.r pVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = com.p314xaae8f345.mm.p971x6de15a2e.q.f153656d;
            if (readStrongBinder == null) {
                pVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IAccInfo_AIDL");
                pVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.r)) ? new com.p314xaae8f345.mm.p971x6de15a2e.p(readStrongBinder) : (com.p314xaae8f345.mm.p971x6de15a2e.r) queryLocalInterface;
            }
            return pVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void H(long j17, long j18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeLong(j17);
            obtain.writeLong(j18);
            this.f153677d.transact(31, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void I(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(37, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int J(com.p314xaae8f345.mm.p971x6de15a2e.z0 z0Var, com.p314xaae8f345.mm.p971x6de15a2e.o0 o0Var, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(z0Var);
            obtain.writeStrongInterface(o0Var);
            obtain.writeInt(i17);
            this.f153677d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void J0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] K() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(49, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public long L() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(58, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public byte[] N(int i17, int i18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f153677d.transact(62, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void Nd(com.p314xaae8f345.mm.p971x6de15a2e.f1 f1Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(f1Var);
            this.f153677d.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int P(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.p314xaae8f345.mm.p971x6de15a2e.c1 c1Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            obtain.writeInt(i19);
            obtain.writeInt(i27);
            obtain.writeByteArray(bArr);
            obtain.writeByteArray(bArr2);
            obtain.writeStrongInterface(c1Var);
            this.f153677d.transact(57, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] P0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(52, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void Q(java.lang.String[] strArr, int[] iArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStringArray(strArr);
            obtain.writeIntArray(iArr);
            this.f153677d.transact(64, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int Q0(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            this.f153677d.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void R(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int T0(java.lang.String str, int i17, int i18, java.util.List list) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f153677d.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.readStringList(list);
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void U() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(50, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void Uh(o45.mi miVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(miVar);
            this.f153677d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void W0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(47, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void X(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void Y(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(45, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int Z0(java.lang.String str, int i17, long j17, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeInt(i17);
            obtain.writeLong(j17);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f153677d.transact(24, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: ackActionNotify */
    public int mo48026x708d4848(java.lang.String str, long j17, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeLong(j17);
            obtain.writeInt(i17);
            this.f153677d.transact(56, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f153677d;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void d0(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            this.f153677d.transact(53, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void d1() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(41, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public int e0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(51, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String[] e1(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void f1(com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(b0Var);
            this.f153677d.transact(60, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public boolean g0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: getHostByName */
    public int mo48027x8faab340(java.lang.String str, java.util.List list) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.readStringList(list);
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void h1(com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(b0Var);
            this.f153677d.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void hh(com.p314xaae8f345.mm.p971x6de15a2e.e0 e0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(e0Var);
            this.f153677d.transact(42, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void i1(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            this.f153677d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void j0(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStringArray(strArr);
            obtain.writeStringArray(strArr2);
            obtain.writeIntArray(iArr);
            this.f153677d.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void j1(u31.c cVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(cVar);
            this.f153677d.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void k1(java.lang.String str, java.lang.String str2, int[] iArr, int[] iArr2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeIntArray(iArr);
            obtain.writeIntArray(iArr2);
            this.f153677d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v
    public void ke(com.p314xaae8f345.mm.p971x6de15a2e.y yVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(yVar);
            this.f153677d.transact(36, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void m0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void n0(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(44, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void n1(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(40, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void p1(java.lang.String str, java.lang.String str2, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i17);
            this.f153677d.transact(61, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void q1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f153677d.transact(54, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void r1(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f153677d.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: reset */
    public void mo48028x6761d4f() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void s0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(43, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    /* renamed from: simpleTestCommand */
    public void mo48029x19d1d47(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(55, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void u0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(65, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void y() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public void z(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f153677d.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.v, com.p314xaae8f345.mm.p971x6de15a2e.s
    public java.lang.String z0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f153677d.transact(29, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

package com.tencent.mm.network;

/* loaded from: classes12.dex */
public class u implements com.tencent.mm.network.v {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.IBinder f72144d;

    public u(android.os.IBinder iBinder) {
        this.f72144d = iBinder;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String A0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v
    public com.tencent.mm.network.h0 Ai() {
        com.tencent.mm.network.h0 f0Var;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(16, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = com.tencent.mm.network.g0.f71986d;
            if (readStrongBinder == null) {
                f0Var = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.INetworkEvent_AIDL");
                f0Var = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.network.h0)) ? new com.tencent.mm.network.f0(readStrongBinder) : (com.tencent.mm.network.h0) queryLocalInterface;
            }
            return f0Var;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void B(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(21, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void C(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(38, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
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
            this.f72144d.transact(25, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int D0(java.lang.String str, boolean z17, java.util.List list) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(19, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.readStringList(list);
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void F() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(33, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v
    /* renamed from: G */
    public com.tencent.mm.network.r mo101G() {
        com.tencent.mm.network.r pVar;
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            android.os.IBinder readStrongBinder = obtain2.readStrongBinder();
            int i17 = com.tencent.mm.network.q.f72123d;
            if (readStrongBinder == null) {
                pVar = null;
            } else {
                android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IAccInfo_AIDL");
                pVar = (queryLocalInterface == null || !(queryLocalInterface instanceof com.tencent.mm.network.r)) ? new com.tencent.mm.network.p(readStrongBinder) : (com.tencent.mm.network.r) queryLocalInterface;
            }
            return pVar;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void H(long j17, long j18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeLong(j17);
            obtain.writeLong(j18);
            this.f72144d.transact(31, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void I(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(37, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int J(com.tencent.mm.network.z0 z0Var, com.tencent.mm.network.o0 o0Var, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(z0Var);
            obtain.writeStrongInterface(o0Var);
            obtain.writeInt(i17);
            this.f72144d.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void J0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(32, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String[] K() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(49, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public long L() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(58, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readLong();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public byte[] N(int i17, int i18) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f72144d.transact(62, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createByteArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v
    public void Nd(com.tencent.mm.network.f1 f1Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(f1Var);
            this.f72144d.transact(35, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int P(java.lang.String str, int i17, int i18, int i19, int i27, byte[] bArr, byte[] bArr2, com.tencent.mm.network.c1 c1Var) {
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
            this.f72144d.transact(57, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String[] P0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(52, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void Q(java.lang.String[] strArr, int[] iArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStringArray(strArr);
            obtain.writeIntArray(iArr);
            this.f72144d.transact(64, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int Q0(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            this.f72144d.transact(26, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void R(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(9, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int T0(java.lang.String str, int i17, int i18, java.util.List list) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeInt(i17);
            obtain.writeInt(i18);
            this.f72144d.transact(20, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.readStringList(list);
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void U() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(50, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v
    public void Uh(o45.mi miVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(miVar);
            this.f72144d.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void W0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(47, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void X(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void Y(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(45, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
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
            this.f72144d.transact(24, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int ackActionNotify(java.lang.String str, long j17, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeLong(j17);
            obtain.writeInt(i17);
            this.f72144d.transact(56, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f72144d;
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void d0(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            this.f72144d.transact(53, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void d1() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(41, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int e0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(51, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String[] e1(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.createStringArray();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void f1(com.tencent.mm.network.b0 b0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(b0Var);
            this.f72144d.transact(60, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public boolean g0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public int getHostByName(java.lang.String str, java.util.List list) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            int readInt = obtain2.readInt();
            obtain2.readStringList(list);
            return readInt;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void h1(com.tencent.mm.network.b0 b0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(b0Var);
            this.f72144d.transact(59, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v
    public void hh(com.tencent.mm.network.e0 e0Var) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(e0Var);
            this.f72144d.transact(42, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void i1(int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(i17);
            this.f72144d.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void j0(java.lang.String[] strArr, java.lang.String[] strArr2, int[] iArr) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStringArray(strArr);
            obtain.writeStringArray(strArr2);
            obtain.writeIntArray(iArr);
            this.f72144d.transact(22, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void j1(u31.c cVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(cVar);
            this.f72144d.transact(14, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void k1(java.lang.String str, java.lang.String str2, int[] iArr, int[] iArr2) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeIntArray(iArr);
            obtain.writeIntArray(iArr2);
            this.f72144d.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v
    public void ke(com.tencent.mm.network.y yVar) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeStrongInterface(yVar);
            this.f72144d.transact(36, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void m0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(27, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void n0(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(44, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void n1(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(40, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void p1(java.lang.String str, java.lang.String str2, int i17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeInt(i17);
            this.f72144d.transact(61, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void q1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            this.f72144d.transact(54, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void r1(boolean z17) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeInt(z17 ? 1 : 0);
            this.f72144d.transact(39, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void reset() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void s0(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(43, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void simpleTestCommand(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(55, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void u0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(65, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void y() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(28, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public void z(java.lang.String str) {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            obtain.writeString(str);
            this.f72144d.transact(15, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // com.tencent.mm.network.v, com.tencent.mm.network.s
    public java.lang.String z0() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        android.os.Parcel obtain2 = android.os.Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
            this.f72144d.transact(29, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readString();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}

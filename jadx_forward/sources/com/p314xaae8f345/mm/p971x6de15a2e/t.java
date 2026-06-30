package com.p314xaae8f345.mm.p971x6de15a2e;

/* loaded from: classes12.dex */
public abstract class t extends android.os.Binder implements com.p314xaae8f345.mm.p971x6de15a2e.v {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f153667d = 0;

    public t() {
        attachInterface(this, "com.tencent.mm.network.IDispatcher_AIDL");
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i17, final android.os.Parcel parcel, android.os.Parcel parcel2, int i18) {
        boolean z17;
        com.p314xaae8f345.mm.p971x6de15a2e.c3 c3Var;
        android.os.IInterface queryLocalInterface;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.IDispatcher_AIDL");
            return true;
        }
        com.p314xaae8f345.mm.p971x6de15a2e.o0 o0Var = null;
        com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var = null;
        com.p314xaae8f345.mm.p971x6de15a2e.b0 b0Var2 = null;
        com.p314xaae8f345.mm.p971x6de15a2e.c1 a1Var = null;
        com.p314xaae8f345.mm.p971x6de15a2e.e0 e0Var = null;
        com.p314xaae8f345.mm.p971x6de15a2e.y yVar = null;
        com.p314xaae8f345.mm.p971x6de15a2e.f1 f1Var = null;
        u31.c cVar = null;
        o45.mi miVar = null;
        switch (i17) {
            case 1:
                com.p314xaae8f345.mm.p971x6de15a2e.z0 d17 = com.p314xaae8f345.mm.p971x6de15a2e.w0.d(parcel.readStrongBinder());
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
                    o0Var = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof com.p314xaae8f345.mm.p971x6de15a2e.o0)) ? new com.p314xaae8f345.mm.p971x6de15a2e.m0(readStrongBinder) : (com.p314xaae8f345.mm.p971x6de15a2e.o0) queryLocalInterface2;
                }
                int J2 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).J(d17, o0Var, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(J2);
                return true;
            case 2:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).i1(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).f153526n;
                parcel2.writeNoException();
                parcel2.writeStrongInterface(binderC11173x1cfac0af);
                return true;
            case 4:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).mo48028x6761d4f();
                parcel2.writeNoException();
                return true;
            case 5:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
                    miVar = (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof o45.mi)) ? new o45.ki(readStrongBinder2) : (o45.mi) queryLocalInterface3;
                }
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).Uh(miVar);
                parcel2.writeNoException();
                return true;
            case 6:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).k1(parcel.readString(), parcel.readString(), parcel.createIntArray(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 7:
                java.lang.String[] e17 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).e1(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStringArray(e17);
                return true;
            case 8:
                java.lang.String A0 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).A0();
                parcel2.writeNoException();
                parcel2.writeString(A0);
                return true;
            case 9:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).R(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 10:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).l0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).r0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).A();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean g07 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).g0();
                parcel2.writeNoException();
                parcel2.writeInt(g07 ? 1 : 0);
                return true;
            case 14:
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder3.queryLocalInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
                    cVar = (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof u31.c)) ? new u31.a(readStrongBinder3) : (u31.c) queryLocalInterface4;
                }
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).j1(cVar);
                parcel2.writeNoException();
                return true;
            case 15:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).z(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                com.p314xaae8f345.mm.p971x6de15a2e.a3 i19 = com.p314xaae8f345.mm.p971x6de15a2e.x2.i();
                parcel2.writeNoException();
                parcel2.writeStrongInterface(i19);
                return true;
            case 17:
                java.lang.String readString = parcel.readString();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int mo48027x8faab340 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).mo48027x8faab340(readString, arrayList);
                parcel2.writeNoException();
                parcel2.writeInt(mo48027x8faab340);
                parcel2.writeStringList(arrayList);
                return true;
            case 18:
                z17 = parcel.readInt() != 0;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int m40250x65185ded = ((com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.mm.C4569xb3cd6a80.class)).m40250x65185ded(arrayList2, z17);
                parcel2.writeNoException();
                parcel2.writeInt(m40250x65185ded);
                parcel2.writeStringList(arrayList2);
                return true;
            case 19:
                java.lang.String readString2 = parcel.readString();
                z17 = parcel.readInt() != 0;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int D0 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).D0(readString2, z17, arrayList3);
                parcel2.writeNoException();
                parcel2.writeInt(D0);
                parcel2.writeStringList(arrayList3);
                return true;
            case 20:
                java.lang.String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int T0 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).T0(readString3, readInt, readInt2, arrayList4);
                parcel2.writeNoException();
                parcel2.writeInt(T0);
                parcel2.writeStringList(arrayList4);
                return true;
            case 21:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).B(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 22:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).j0(parcel.createStringArray(), parcel.createStringArray(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 23:
                java.lang.String[] createStringArray = parcel.createStringArray();
                java.lang.String[] createStringArray2 = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var = (com.p314xaae8f345.mm.p971x6de15a2e.g1) this;
                g1Var.f153524i.m40015x32c52b(g1Var.f153525m, "MMAutoAuth.addHostInfo");
                new com.p314xaae8f345.mm.p971x6de15a2e.k1(g1Var, 1000L, null, createStringArray, createStringArray2, createIntArray).a(g1Var.f153532t);
                parcel2.writeNoException();
                return true;
            case 24:
                int Z0 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).Z0(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Z0);
                return true;
            case 25:
                int D = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).D(parcel.createIntArray(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(D);
                return true;
            case 26:
                int Q0 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).Q0(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(Q0);
                return true;
            case 27:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40529x312e01fd();
                parcel2.writeNoException();
                return true;
            case 28:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).y();
                parcel2.writeNoException();
                return true;
            case 29:
                java.lang.String z07 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).z0();
                parcel2.writeNoException();
                parcel2.writeString(z07);
                return true;
            case 30:
                int readInt3 = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                synchronized (com.p314xaae8f345.mm.p971x6de15a2e.c3.class) {
                    if (com.p314xaae8f345.mm.p971x6de15a2e.c3.f153509b == null) {
                        com.p314xaae8f345.mm.p971x6de15a2e.c3.f153509b = new com.p314xaae8f345.mm.p971x6de15a2e.c3();
                    }
                    c3Var = com.p314xaae8f345.mm.p971x6de15a2e.c3.f153509b;
                }
                synchronized (c3Var) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(c3Var.f153510a.get(java.lang.Integer.valueOf(readInt3)));
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = java.lang.Integer.valueOf(readInt3);
                    objArr[1] = null;
                    int i27 = -1;
                    objArr[2] = java.lang.Integer.valueOf(createByteArray == null ? -1 : createByteArray.length);
                    boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    objArr[3] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PostPushEventHandler", "postEvent event:%s cb:%s data:%s [%s]", objArr);
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = java.lang.Integer.valueOf(readInt3);
                    objArr2[1] = null;
                    if (createByteArray != null) {
                        i27 = createByteArray.length;
                    }
                    objArr2[2] = java.lang.Integer.valueOf(i27);
                    objArr2[3] = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PostPushEventHandler", "postEvent cb == null  event:%s cb:%s data:%s [%s]", objArr2);
                }
                parcel2.writeNoException();
                parcel2.writeInt(-3);
                return true;
            case 31:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).H(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 32:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).J0();
                parcel2.writeNoException();
                return true;
            case 33:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).F();
                parcel2.writeNoException();
                return true;
            case 34:
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null && (queryLocalInterface = readStrongBinder4.queryLocalInterface("com.tencent.mm.network.IOnReportKV_AIDL")) != null && (queryLocalInterface instanceof com.p314xaae8f345.mm.p971x6de15a2e.t0)) {
                }
                com.p314xaae8f345.mm.p971x6de15a2e.x2.k().f153713i.getClass();
                parcel2.writeNoException();
                return true;
            case 35:
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
                    f1Var = (queryLocalInterface5 == null || !(queryLocalInterface5 instanceof com.p314xaae8f345.mm.p971x6de15a2e.f1)) ? new com.p314xaae8f345.mm.p971x6de15a2e.d1(readStrongBinder5) : (com.p314xaae8f345.mm.p971x6de15a2e.f1) queryLocalInterface5;
                }
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).f153534v = f1Var;
                parcel2.writeNoException();
                return true;
            case 36:
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
                    yVar = (queryLocalInterface6 == null || !(queryLocalInterface6 instanceof com.p314xaae8f345.mm.p971x6de15a2e.y)) ? new com.p314xaae8f345.mm.p971x6de15a2e.w(readStrongBinder6) : (com.p314xaae8f345.mm.p971x6de15a2e.y) queryLocalInterface6;
                }
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).f153535w = yVar;
                parcel2.writeNoException();
                return true;
            case 37:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).I(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 38:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).C(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 39:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).r1(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 40:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).n1(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 41:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).d1();
                parcel2.writeNoException();
                return true;
            case 42:
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    android.os.IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
                    e0Var = (queryLocalInterface7 == null || !(queryLocalInterface7 instanceof com.p314xaae8f345.mm.p971x6de15a2e.e0)) ? new com.p314xaae8f345.mm.p971x6de15a2e.c0(readStrongBinder7) : (com.p314xaae8f345.mm.p971x6de15a2e.e0) queryLocalInterface7;
                }
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).f153537y = e0Var;
                parcel2.writeNoException();
                return true;
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
                com.p314xaae8f345.mm.p971x6de15a2e.g1.B = parcel.readString();
                parcel2.writeNoException();
                return true;
            case 44:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).n0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 45:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).Y(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 46:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).X(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).W0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 48:
                java.lang.String readString4 = parcel.readString();
                java.lang.String readString5 = parcel.readString();
                com.p314xaae8f345.mm.p971x6de15a2e.BinderC11173x1cfac0af binderC11173x1cfac0af2 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).f153526n;
                if (binderC11173x1cfac0af2 != null) {
                    binderC11173x1cfac0af2.G0(readString4, readString5);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMAutoAuth", "accinfo is empty");
                }
                parcel2.writeNoException();
                return true;
            case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                java.lang.String[] K = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).K();
                parcel2.writeNoException();
                parcel2.writeStringArray(K);
                return true;
            case 50:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).U();
                parcel2.writeNoException();
                return true;
            case 51:
                int e07 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).e0();
                parcel2.writeNoException();
                parcel2.writeInt(e07);
                return true;
            case 52:
                java.lang.String[] P0 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).P0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(P0);
                return true;
            case 53:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).d0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 54:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).q1(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 55:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).mo48029x19d1d47(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 56:
                int mo48026x708d4848 = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).mo48026x708d4848(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(mo48026x708d4848);
                return true;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.y1.f34664x366c91de /* 57 */:
                java.lang.String readString6 = parcel.readString();
                int readInt4 = parcel.readInt();
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                int readInt7 = parcel.readInt();
                byte[] createByteArray2 = parcel.createByteArray();
                byte[] createByteArray3 = parcel.createByteArray();
                android.os.IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    android.os.IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.tencent.mm.network.ISpeedTestCallback_AIDL");
                    a1Var = (queryLocalInterface8 == null || !(queryLocalInterface8 instanceof com.p314xaae8f345.mm.p971x6de15a2e.c1)) ? new com.p314xaae8f345.mm.p971x6de15a2e.a1(readStrongBinder8) : (com.p314xaae8f345.mm.p971x6de15a2e.c1) queryLocalInterface8;
                }
                int P = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).P(readString6, readInt4, readInt5, readInt6, readInt7, createByteArray2, createByteArray3, a1Var);
                parcel2.writeNoException();
                parcel2.writeInt(P);
                return true;
            case 58:
                long L = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).L();
                parcel2.writeNoException();
                parcel2.writeLong(L);
                return true;
            case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k9.f34376x366c91de /* 59 */:
                android.os.IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    android.os.IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
                    b0Var2 = (queryLocalInterface9 == null || !(queryLocalInterface9 instanceof com.p314xaae8f345.mm.p971x6de15a2e.b0)) ? new com.p314xaae8f345.mm.p971x6de15a2e.z(readStrongBinder9) : (com.p314xaae8f345.mm.p971x6de15a2e.b0) queryLocalInterface9;
                }
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).h1(b0Var2);
                parcel2.writeNoException();
                return true;
            case 60:
                android.os.IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    android.os.IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
                    b0Var = (queryLocalInterface10 == null || !(queryLocalInterface10 instanceof com.p314xaae8f345.mm.p971x6de15a2e.b0)) ? new com.p314xaae8f345.mm.p971x6de15a2e.z(readStrongBinder10) : (com.p314xaae8f345.mm.p971x6de15a2e.b0) queryLocalInterface10;
                }
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).f1(b0Var);
                parcel2.writeNoException();
                return true;
            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).p1(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 62:
                byte[] N = ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).N(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeByteArray(N);
                return true;
            case 63:
                int readInt8 = parcel.readInt();
                final java.util.HashMap hashMap = readInt8 >= 0 ? new java.util.HashMap() : null;
                java.util.stream.IntStream.range(0, readInt8).forEach(new java.util.function.IntConsumer() { // from class: com.tencent.mm.network.t$$a
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i28) {
                        android.os.Parcel parcel3 = parcel;
                        hashMap.put(parcel3.readString(), parcel3.readString());
                    }
                });
                boolean z19 = parcel.readInt() != 0;
                com.p314xaae8f345.mm.p971x6de15a2e.g1 g1Var2 = (com.p314xaae8f345.mm.p971x6de15a2e.g1) this;
                if (hashMap != null && hashMap.size() != 0) {
                    new com.p314xaae8f345.mm.p971x6de15a2e.p1(g1Var2, 1000L, null, hashMap, z19).a(g1Var2.f153532t);
                }
                parcel2.writeNoException();
                return true;
            case 64:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).Q(parcel.createStringArray(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 65:
                ((com.p314xaae8f345.mm.p971x6de15a2e.g1) this).u0();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

package com.tencent.mm.network;

/* loaded from: classes12.dex */
public abstract class t extends android.os.Binder implements com.tencent.mm.network.v {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f72134d = 0;

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
        com.tencent.mm.network.c3 c3Var;
        android.os.IInterface queryLocalInterface;
        if (i17 >= 1 && i17 <= 16777215) {
            parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
        }
        if (i17 == 1598968902) {
            parcel2.writeString("com.tencent.mm.network.IDispatcher_AIDL");
            return true;
        }
        com.tencent.mm.network.o0 o0Var = null;
        com.tencent.mm.network.b0 b0Var = null;
        com.tencent.mm.network.b0 b0Var2 = null;
        com.tencent.mm.network.c1 a1Var = null;
        com.tencent.mm.network.e0 e0Var = null;
        com.tencent.mm.network.y yVar = null;
        com.tencent.mm.network.f1 f1Var = null;
        u31.c cVar = null;
        o45.mi miVar = null;
        switch (i17) {
            case 1:
                com.tencent.mm.network.z0 d17 = com.tencent.mm.network.w0.d(parcel.readStrongBinder());
                android.os.IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    android.os.IInterface queryLocalInterface2 = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
                    o0Var = (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof com.tencent.mm.network.o0)) ? new com.tencent.mm.network.m0(readStrongBinder) : (com.tencent.mm.network.o0) queryLocalInterface2;
                }
                int J2 = ((com.tencent.mm.network.g1) this).J(d17, o0Var, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(J2);
                return true;
            case 2:
                ((com.tencent.mm.network.g1) this).i1(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 3:
                com.tencent.mm.network.AccInfo accInfo = ((com.tencent.mm.network.g1) this).f71993n;
                parcel2.writeNoException();
                parcel2.writeStrongInterface(accInfo);
                return true;
            case 4:
                ((com.tencent.mm.network.g1) this).reset();
                parcel2.writeNoException();
                return true;
            case 5:
                android.os.IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    android.os.IInterface queryLocalInterface3 = readStrongBinder2.queryLocalInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
                    miVar = (queryLocalInterface3 == null || !(queryLocalInterface3 instanceof o45.mi)) ? new o45.ki(readStrongBinder2) : (o45.mi) queryLocalInterface3;
                }
                ((com.tencent.mm.network.g1) this).Uh(miVar);
                parcel2.writeNoException();
                return true;
            case 6:
                ((com.tencent.mm.network.g1) this).k1(parcel.readString(), parcel.readString(), parcel.createIntArray(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 7:
                java.lang.String[] e17 = ((com.tencent.mm.network.g1) this).e1(parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeStringArray(e17);
                return true;
            case 8:
                java.lang.String A0 = ((com.tencent.mm.network.g1) this).A0();
                parcel2.writeNoException();
                parcel2.writeString(A0);
                return true;
            case 9:
                ((com.tencent.mm.network.g1) this).R(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 10:
                ((com.tencent.mm.network.g1) this).l0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                ((com.tencent.mm.network.g1) this).r0(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                ((com.tencent.mm.network.g1) this).A();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean g07 = ((com.tencent.mm.network.g1) this).g0();
                parcel2.writeNoException();
                parcel2.writeInt(g07 ? 1 : 0);
                return true;
            case 14:
                android.os.IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    android.os.IInterface queryLocalInterface4 = readStrongBinder3.queryLocalInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
                    cVar = (queryLocalInterface4 == null || !(queryLocalInterface4 instanceof u31.c)) ? new u31.a(readStrongBinder3) : (u31.c) queryLocalInterface4;
                }
                ((com.tencent.mm.network.g1) this).j1(cVar);
                parcel2.writeNoException();
                return true;
            case 15:
                ((com.tencent.mm.network.g1) this).z(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
                com.tencent.mm.network.a3 i19 = com.tencent.mm.network.x2.i();
                parcel2.writeNoException();
                parcel2.writeStrongInterface(i19);
                return true;
            case 17:
                java.lang.String readString = parcel.readString();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int hostByName = ((com.tencent.mm.network.g1) this).getHostByName(readString, arrayList);
                parcel2.writeNoException();
                parcel2.writeInt(hostByName);
                parcel2.writeStringList(arrayList);
                return true;
            case 18:
                z17 = parcel.readInt() != 0;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int snsIpsForScene = ((com.tencent.mars.mm.MMStnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.mm.MMStnManager.class)).getSnsIpsForScene(arrayList2, z17);
                parcel2.writeNoException();
                parcel2.writeInt(snsIpsForScene);
                parcel2.writeStringList(arrayList2);
                return true;
            case 19:
                java.lang.String readString2 = parcel.readString();
                z17 = parcel.readInt() != 0;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int D0 = ((com.tencent.mm.network.g1) this).D0(readString2, z17, arrayList3);
                parcel2.writeNoException();
                parcel2.writeInt(D0);
                parcel2.writeStringList(arrayList3);
                return true;
            case 20:
                java.lang.String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                int T0 = ((com.tencent.mm.network.g1) this).T0(readString3, readInt, readInt2, arrayList4);
                parcel2.writeNoException();
                parcel2.writeInt(T0);
                parcel2.writeStringList(arrayList4);
                return true;
            case 21:
                ((com.tencent.mm.network.g1) this).B(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 22:
                ((com.tencent.mm.network.g1) this).j0(parcel.createStringArray(), parcel.createStringArray(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 23:
                java.lang.String[] createStringArray = parcel.createStringArray();
                java.lang.String[] createStringArray2 = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                com.tencent.mm.network.g1 g1Var = (com.tencent.mm.network.g1) this;
                g1Var.f71991i.lock(g1Var.f71992m, "MMAutoAuth.addHostInfo");
                new com.tencent.mm.network.k1(g1Var, 1000L, null, createStringArray, createStringArray2, createIntArray).a(g1Var.f71999t);
                parcel2.writeNoException();
                return true;
            case 24:
                int Z0 = ((com.tencent.mm.network.g1) this).Z0(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(Z0);
                return true;
            case 25:
                int D = ((com.tencent.mm.network.g1) this).D(parcel.createIntArray(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(D);
                return true;
            case 26:
                int Q0 = ((com.tencent.mm.network.g1) this).Q0(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(Q0);
                return true;
            case 27:
                com.tencent.mars.xlog.Log.appenderFlush();
                parcel2.writeNoException();
                return true;
            case 28:
                ((com.tencent.mm.network.g1) this).y();
                parcel2.writeNoException();
                return true;
            case 29:
                java.lang.String z07 = ((com.tencent.mm.network.g1) this).z0();
                parcel2.writeNoException();
                parcel2.writeString(z07);
                return true;
            case 30:
                int readInt3 = parcel.readInt();
                byte[] createByteArray = parcel.createByteArray();
                synchronized (com.tencent.mm.network.c3.class) {
                    if (com.tencent.mm.network.c3.f71976b == null) {
                        com.tencent.mm.network.c3.f71976b = new com.tencent.mm.network.c3();
                    }
                    c3Var = com.tencent.mm.network.c3.f71976b;
                }
                synchronized (c3Var) {
                    android.support.v4.media.f.a(c3Var.f71977a.get(java.lang.Integer.valueOf(readInt3)));
                    java.lang.Object[] objArr = new java.lang.Object[4];
                    objArr[0] = java.lang.Integer.valueOf(readInt3);
                    objArr[1] = null;
                    int i27 = -1;
                    objArr[2] = java.lang.Integer.valueOf(createByteArray == null ? -1 : createByteArray.length);
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    objArr[3] = new com.tencent.mm.sdk.platformtools.z3();
                    com.tencent.mars.xlog.Log.i("MicroMsg.PostPushEventHandler", "postEvent event:%s cb:%s data:%s [%s]", objArr);
                    java.lang.Object[] objArr2 = new java.lang.Object[4];
                    objArr2[0] = java.lang.Integer.valueOf(readInt3);
                    objArr2[1] = null;
                    if (createByteArray != null) {
                        i27 = createByteArray.length;
                    }
                    objArr2[2] = java.lang.Integer.valueOf(i27);
                    objArr2[3] = new com.tencent.mm.sdk.platformtools.z3();
                    com.tencent.mars.xlog.Log.e("MicroMsg.PostPushEventHandler", "postEvent cb == null  event:%s cb:%s data:%s [%s]", objArr2);
                }
                parcel2.writeNoException();
                parcel2.writeInt(-3);
                return true;
            case 31:
                ((com.tencent.mm.network.g1) this).H(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 32:
                ((com.tencent.mm.network.g1) this).J0();
                parcel2.writeNoException();
                return true;
            case 33:
                ((com.tencent.mm.network.g1) this).F();
                parcel2.writeNoException();
                return true;
            case 34:
                android.os.IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null && (queryLocalInterface = readStrongBinder4.queryLocalInterface("com.tencent.mm.network.IOnReportKV_AIDL")) != null && (queryLocalInterface instanceof com.tencent.mm.network.t0)) {
                }
                com.tencent.mm.network.x2.k().f72180i.getClass();
                parcel2.writeNoException();
                return true;
            case 35:
                android.os.IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    android.os.IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
                    f1Var = (queryLocalInterface5 == null || !(queryLocalInterface5 instanceof com.tencent.mm.network.f1)) ? new com.tencent.mm.network.d1(readStrongBinder5) : (com.tencent.mm.network.f1) queryLocalInterface5;
                }
                ((com.tencent.mm.network.g1) this).f72001v = f1Var;
                parcel2.writeNoException();
                return true;
            case 36:
                android.os.IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    android.os.IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
                    yVar = (queryLocalInterface6 == null || !(queryLocalInterface6 instanceof com.tencent.mm.network.y)) ? new com.tencent.mm.network.w(readStrongBinder6) : (com.tencent.mm.network.y) queryLocalInterface6;
                }
                ((com.tencent.mm.network.g1) this).f72002w = yVar;
                parcel2.writeNoException();
                return true;
            case 37:
                ((com.tencent.mm.network.g1) this).I(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 38:
                ((com.tencent.mm.network.g1) this).C(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 39:
                ((com.tencent.mm.network.g1) this).r1(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 40:
                ((com.tencent.mm.network.g1) this).n1(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 41:
                ((com.tencent.mm.network.g1) this).d1();
                parcel2.writeNoException();
                return true;
            case 42:
                android.os.IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    android.os.IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
                    e0Var = (queryLocalInterface7 == null || !(queryLocalInterface7 instanceof com.tencent.mm.network.e0)) ? new com.tencent.mm.network.c0(readStrongBinder7) : (com.tencent.mm.network.e0) queryLocalInterface7;
                }
                ((com.tencent.mm.network.g1) this).f72004y = e0Var;
                parcel2.writeNoException();
                return true;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                com.tencent.mm.network.g1.B = parcel.readString();
                parcel2.writeNoException();
                return true;
            case 44:
                ((com.tencent.mm.network.g1) this).n0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 45:
                ((com.tencent.mm.network.g1) this).Y(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 46:
                ((com.tencent.mm.network.g1) this).X(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                ((com.tencent.mm.network.g1) this).W0(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 48:
                java.lang.String readString4 = parcel.readString();
                java.lang.String readString5 = parcel.readString();
                com.tencent.mm.network.AccInfo accInfo2 = ((com.tencent.mm.network.g1) this).f71993n;
                if (accInfo2 != null) {
                    accInfo2.G0(readString4, readString5);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MMAutoAuth", "accinfo is empty");
                }
                parcel2.writeNoException();
                return true;
            case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
                java.lang.String[] K = ((com.tencent.mm.network.g1) this).K();
                parcel2.writeNoException();
                parcel2.writeStringArray(K);
                return true;
            case 50:
                ((com.tencent.mm.network.g1) this).U();
                parcel2.writeNoException();
                return true;
            case 51:
                int e07 = ((com.tencent.mm.network.g1) this).e0();
                parcel2.writeNoException();
                parcel2.writeInt(e07);
                return true;
            case 52:
                java.lang.String[] P0 = ((com.tencent.mm.network.g1) this).P0(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStringArray(P0);
                return true;
            case 53:
                ((com.tencent.mm.network.g1) this).d0(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 54:
                ((com.tencent.mm.network.g1) this).q1(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 55:
                ((com.tencent.mm.network.g1) this).simpleTestCommand(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 56:
                int ackActionNotify = ((com.tencent.mm.network.g1) this).ackActionNotify(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(ackActionNotify);
                return true;
            case com.tencent.mm.plugin.appbrand.jsapi.pay.y1.CTRL_INDEX /* 57 */:
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
                    a1Var = (queryLocalInterface8 == null || !(queryLocalInterface8 instanceof com.tencent.mm.network.c1)) ? new com.tencent.mm.network.a1(readStrongBinder8) : (com.tencent.mm.network.c1) queryLocalInterface8;
                }
                int P = ((com.tencent.mm.network.g1) this).P(readString6, readInt4, readInt5, readInt6, readInt7, createByteArray2, createByteArray3, a1Var);
                parcel2.writeNoException();
                parcel2.writeInt(P);
                return true;
            case 58:
                long L = ((com.tencent.mm.network.g1) this).L();
                parcel2.writeNoException();
                parcel2.writeLong(L);
                return true;
            case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                android.os.IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    android.os.IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
                    b0Var2 = (queryLocalInterface9 == null || !(queryLocalInterface9 instanceof com.tencent.mm.network.b0)) ? new com.tencent.mm.network.z(readStrongBinder9) : (com.tencent.mm.network.b0) queryLocalInterface9;
                }
                ((com.tencent.mm.network.g1) this).h1(b0Var2);
                parcel2.writeNoException();
                return true;
            case 60:
                android.os.IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    android.os.IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.tencent.mm.network.IMMNetCommonCallback_AIDL");
                    b0Var = (queryLocalInterface10 == null || !(queryLocalInterface10 instanceof com.tencent.mm.network.b0)) ? new com.tencent.mm.network.z(readStrongBinder10) : (com.tencent.mm.network.b0) queryLocalInterface10;
                }
                ((com.tencent.mm.network.g1) this).f1(b0Var);
                parcel2.writeNoException();
                return true;
            case com.tencent.qqmusic.mediaplayer.PlayerException.EXCEPTION_TYPE_INITLIB /* 61 */:
                ((com.tencent.mm.network.g1) this).p1(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 62:
                byte[] N = ((com.tencent.mm.network.g1) this).N(parcel.readInt(), parcel.readInt());
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
                com.tencent.mm.network.g1 g1Var2 = (com.tencent.mm.network.g1) this;
                if (hashMap != null && hashMap.size() != 0) {
                    new com.tencent.mm.network.p1(g1Var2, 1000L, null, hashMap, z19).a(g1Var2.f71999t);
                }
                parcel2.writeNoException();
                return true;
            case 64:
                ((com.tencent.mm.network.g1) this).Q(parcel.createStringArray(), parcel.createIntArray());
                parcel2.writeNoException();
                return true;
            case 65:
                ((com.tencent.mm.network.g1) this).u0();
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i17, parcel, parcel2, i18);
        }
    }
}

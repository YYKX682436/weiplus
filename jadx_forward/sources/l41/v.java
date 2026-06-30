package l41;

/* loaded from: classes11.dex */
public class v extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f397475d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f397476e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f397477f;

    /* renamed from: g, reason: collision with root package name */
    public final int f397478g;

    public v(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.xj3();
        lVar.f152198b = new r45.yj3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getopenimchatroommemberdetail";
        lVar.f152200d = 942;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f397476e = a17;
        this.f397477f = str;
        this.f397478g = i17;
        r45.xj3 xj3Var = (r45.xj3) a17.f152243a.f152217a;
        xj3Var.f471697d = str;
        xj3Var.f471698e = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "get roomname:%s, version=%d", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f397475d = u0Var;
        return mo9409x10f9447a(sVar, this.f397476e, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 942;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        int i27 = this.f397478g;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i27);
        java.lang.String str2 = this.f397477f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s, %d", valueOf, valueOf2, str, str2, valueOf3);
        if (i19 == 0) {
            r45.yj3 yj3Var = (r45.yj3) ((com.p314xaae8f345.mm.p944x882e457a.o) v0Var).f152244b.f152233a;
            com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str2);
            int i28 = yj3Var.f472686d;
            long j17 = i28 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail svrVer:%d, localVer:%d", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i27));
            if (i27 < j17) {
                W0.W0(yj3Var.f472686d);
                r45.wz4 wz4Var = yj3Var.f472687e;
                java.util.LinkedList linkedList = wz4Var == null ? null : wz4Var.f471134d;
                boolean z18 = 1;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(linkedList == null ? -1 : linkedList.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Openim.NetSceneGetOpenIMChatroomMemberDetail", "updateMemberDetail memInfoList size[%d]", objArr);
                W0.R0(c01.z1.r(), t41.f.a(linkedList), null, null);
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(W0);
                r45.wz4 wz4Var2 = yj3Var.f472687e;
                t41.h hVar = new t41.h();
                if (wz4Var2 != null) {
                    java.util.LinkedList<r45.zz4> linkedList2 = wz4Var2.f471134d;
                    com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                    com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
                    java.util.LinkedList linkedList3 = new java.util.LinkedList();
                    java.util.LinkedList linkedList4 = new java.util.LinkedList();
                    int size = linkedList2 != null ? linkedList2.size() : -1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OpenIMChatRoomContactLogic", "updateMemberDetail memInfoList size[%d]", java.lang.Integer.valueOf(size));
                    if (size >= 0) {
                        hVar.f497029b = size > com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45961x8579fee8() ? 0 : com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45959x58ce6550(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45958x3c99cc16(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45957xf52418fb(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45960x73433b53(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45962xf5245bd1() ? gm0.j1.e().c() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45963xd29e0734(), 401, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45956x5168be03(), "PerfTrace");
                        for (r45.zz4 zz4Var : linkedList2) {
                            if (wz4Var2.f471135e == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zz4Var.f474017d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zz4Var.f474021h)) {
                                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = Ni.n0(zz4Var.f474017d);
                                if (n07 == null) {
                                    n07 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                                    n07.f152062a = zz4Var.f474017d;
                                }
                                java.lang.String str3 = zz4Var.f474020g;
                                n07.f152066e = str3;
                                n07.f152065d = zz4Var.f474021h;
                                n07.f152063b = 3;
                                n07.f152067f = (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) ? 1 : 0) ^ z18;
                                linkedList4.add(n07);
                            }
                            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(zz4Var.f474017d, z18);
                            if (n17 == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("OpenIMChatRoomContactLogic", "updateMemberDetail memberlist username is null");
                            } else {
                                if (n17.q2()) {
                                    n17.M1(zz4Var.f474018e);
                                    linkedList3.add(new android.util.Pair(zz4Var.f474017d, n17));
                                }
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zz4Var.f474023m)) {
                                    n17.P1(zz4Var.f474023m);
                                }
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zz4Var.f474024n)) {
                                    n17.C1(zz4Var.f474024n);
                                }
                                Bi.l0(n17);
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zz4Var.f474023m)) {
                                    z17 = false;
                                    ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).wi(zz4Var.f474023m, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), zz4Var.f474024n, 0);
                                    z18 = 1;
                                }
                            }
                            z17 = false;
                            z18 = 1;
                        }
                        linkedList4.size();
                        linkedList3.size();
                        if (!linkedList4.isEmpty()) {
                            hVar.f497028a |= 1;
                            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new t41.a(linkedList4, hVar, Ni), true).c(100L, 100L);
                        }
                        if (!linkedList3.isEmpty()) {
                            hVar.f497028a |= 2;
                            new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(gm0.j1.e().a(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new t41.b(linkedList3, hVar, Bi), true).c(100L, 100L);
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f397475d;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

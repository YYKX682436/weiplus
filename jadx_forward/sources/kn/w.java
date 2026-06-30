package kn;

/* loaded from: classes11.dex */
public class w extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f391012d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f391014f;

    /* renamed from: g, reason: collision with root package name */
    public final int f391015g;

    /* renamed from: i, reason: collision with root package name */
    public int f391017i;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f391013e = null;

    /* renamed from: h, reason: collision with root package name */
    public int f391016h = 0;

    public w(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cd3();
        lVar.f152198b = new r45.dd3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getchatroommemberdetail";
        lVar.f152200d = 551;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f391012d = a17;
        this.f391014f = str;
        this.f391015g = i17;
        int D0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str).D0();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        ((r45.cd3) fVar).f453017d = str;
        ((r45.cd3) fVar).f453018e = D0 < i17 ? i17 : D0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s, oldVer:%d, localVer:%d, stack[%s]", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(D0), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public static void H(kn.w wVar, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, int i17, java.lang.String str, int i18, java.util.List list, r45.ya4 ya4Var, java.util.List list2, java.util.List list3) {
        int i19 = (~i17) & wVar.f391016h;
        wVar.f391016h = i19;
        if (i19 == 0) {
            if (ya4Var == null) {
                a3Var.getClass();
                a3Var.f69097x5eaef643 = new r45.ya4();
            } else {
                a3Var.f69097x5eaef643 = ya4Var;
            }
            a3Var.W0(i18);
            a3Var.R0(c01.z1.r(), list, list2, list3);
            c01.v1.M(a3Var);
            c01.v1.r(str, a3Var.f69107x5be1edb3, a3Var.f69098xbcb1bed0, a3Var.f69084x8729abea);
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45959x58ce6550(), wVar.f391017i);
            wVar.f391017i = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "updateDone(%s)", str);
        }
    }

    public final java.util.List I(java.util.LinkedList linkedList) {
        if (linkedList == null) {
            return null;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((r45.du5) it.next()).f454289d);
        }
        return linkedList2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        this.f391013e = u0Var;
        return mo9409x10f9447a(sVar, this.f391012d, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 551;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        int mo46127x5f00c26e;
        long j17;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var;
        java.util.LinkedList linkedList;
        java.lang.Class cls;
        r45.ya4 ya4Var;
        java.lang.String str2;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p943x351df9c2.s0 s0Var;
        java.util.Iterator it;
        boolean z17;
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var;
        java.lang.String str3 = this.f391014f;
        int i27 = this.f391015g;
        java.util.HashMap hashMap = (java.util.HashMap) c01.v1.f119052a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O(hashMap.get(str3), -1) == i27) {
            hashMap.remove(str3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomMembersLogic", "clearRunningGetChatroomDetailReqItem:(%s, %d)", str3, java.lang.Integer.valueOf(i27));
        }
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
            this.f391013e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "onGYNetEnd errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.dd3 dd3Var = (r45.dd3) this.f391012d.f152244b.f152233a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(this.f391014f);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dd3Var.f453854g)) {
            W0.f69107x5be1edb3 = dd3Var.f453854g;
        }
        java.util.LinkedList linkedList3 = dd3Var.f453856i;
        java.lang.String str4 = "";
        if (linkedList3 != null && linkedList3.size() > 0) {
            java.util.List I = I(dd3Var.f453856i);
            W0.U0(I);
            java.util.LinkedList linkedList4 = (java.util.LinkedList) I;
            W0.f69098xbcb1bed0 = linkedList4.size();
            if ((W0.f69084x8729abea & 2) != 2) {
                W0.f69094xd1f9ba88 = c01.v1.i(linkedList4, -1, "");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W0.z0(W0.f69088x37548063))) {
                W0.f69109x43482a3c = c01.v1.k();
            }
        }
        long D0 = W0.D0();
        int i28 = dd3Var.f453852e;
        long j18 = i28 & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = this.f391014f;
        objArr[1] = java.lang.Integer.valueOf(i28);
        r45.vy vyVar = dd3Var.f453853f;
        objArr[2] = java.lang.Integer.valueOf(vyVar == null ? 0 : vyVar.f470190d);
        objArr[3] = java.lang.Long.valueOf(D0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom chatroomName:%s svrVer:%d, modCnt:%d， localVer:%d", objArr);
        if (D0 >= j18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom localVer[%d] serverVer[%d] is new and return", java.lang.Long.valueOf(D0), java.lang.Long.valueOf(j18));
            this.f391013e.mo815x76e0bfae(i18, i19, str, this);
            return;
        }
        r45.vy vyVar2 = dd3Var.f453853f;
        java.util.LinkedList linkedList5 = vyVar2 == null ? null : vyVar2.f470191e;
        int size = linkedList5 == null ? -1 : linkedList5.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom memInfoList size[%d]", java.lang.Integer.valueOf(size));
        r45.ya4 ya4Var2 = new r45.ya4();
        r45.vy vyVar3 = dd3Var.f453853f;
        if (vyVar3 != null) {
            ya4Var2.f472459d = vyVar3.f470194h;
            ya4Var2.f472460e = vyVar3.f470195i;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.s0 Ni = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni();
        java.util.LinkedList linkedList6 = new java.util.LinkedList();
        java.util.LinkedList linkedList7 = new java.util.LinkedList();
        if (size > com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45961x8579fee8()) {
            mo46127x5f00c26e = 0;
        } else {
            mo46127x5f00c26e = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45959x58ce6550(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45958x3c99cc16(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45957xf52418fb(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45960x73433b53(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45962xf5245bd1() ? gm0.j1.e().c() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45963xd29e0734(), 401, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45956x5168be03(), "MicroMsg.NetSceneGetChatroomMemberDetail");
        }
        this.f391017i = mo46127x5f00c26e;
        java.util.Iterator it6 = linkedList5.iterator();
        while (it6.hasNext()) {
            r45.wy wyVar = (r45.wy) it6.next();
            java.lang.String str5 = str4;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wyVar.f471102h) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wyVar.f471098d)) {
                s0Var = Ni;
                it = it6;
                z17 = true;
            } else {
                com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = Ni.n0(wyVar.f471098d);
                if (n07 == null) {
                    r0Var = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                    s0Var = Ni;
                    r0Var.f152062a = wyVar.f471098d;
                } else {
                    s0Var = Ni;
                    n07.d().equals(wyVar.f471102h);
                    r0Var = n07;
                }
                java.lang.String str6 = wyVar.f471101g;
                r0Var.f152066e = str6;
                it = it6;
                r0Var.f152065d = wyVar.f471102h;
                r0Var.f152063b = 3;
                z17 = true;
                r0Var.f152067f = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6) ? 1 : 0;
                linkedList7.add(r0Var);
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(wyVar.f471098d, z17);
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var2 = Bi;
            if (n17 == null || ((int) n17.E2) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail memberlist username is null");
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.X1(wyVar.f471098d);
                java.lang.String str7 = wyVar.f471099e;
                if (str7 != null) {
                    z3Var.M1(str7);
                }
                z3Var.P1(wyVar.f471107p);
                z3Var.C1(wyVar.f471108q);
                z3Var.G2();
                linkedList6.add(new android.util.Pair(wyVar.f471098d, z3Var));
            } else if (n17.q2()) {
                n17.M1(wyVar.f471099e);
                linkedList6.add(new android.util.Pair(wyVar.f471098d, n17));
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                java.lang.String str8 = wyVar.f471098d;
                if (str8 == null) {
                    str8 = str5;
                }
                objArr2[0] = str8;
                objArr2[1] = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(wyVar.f471099e);
                objArr2[2] = java.lang.Integer.valueOf(n17.m124896xfb85f7b0());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail username:%s nickname:%s type:%s", objArr2);
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[3];
                java.lang.String str9 = wyVar.f471098d;
                if (str9 == null) {
                    str9 = str5;
                }
                objArr3[0] = str9;
                java.lang.String str10 = wyVar.f471099e;
                if (str10 == null) {
                    str10 = str5;
                }
                objArr3[1] = str10;
                objArr3[2] = java.lang.Integer.valueOf(n17.m124896xfb85f7b0());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneGetChatroomMemberDetail", "NetSceneGetChatroomMemberDetail isChatRoomContact == false, username %s nickname %s type:%s", objArr3);
            }
            Bi = k4Var2;
            str4 = str5;
            Ni = s0Var;
            it6 = it;
        }
        com.p314xaae8f345.mm.p943x351df9c2.s0 s0Var2 = Ni;
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 k4Var3 = Bi;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetChatroomMemberDetail", "summerChatRoom update newImgFlagList size:%d, updateList size:%d", java.lang.Integer.valueOf(linkedList7.size()), java.lang.Integer.valueOf(linkedList6.size()));
        if (linkedList7.isEmpty()) {
            j17 = 100;
            k4Var = k4Var3;
            linkedList = linkedList7;
            cls = rv1.f.class;
            ya4Var = ya4Var2;
            str2 = "chatroom_member_detail";
            linkedList2 = linkedList6;
        } else {
            this.f391016h |= 1;
            j17 = 100;
            k4Var = k4Var3;
            cls = rv1.f.class;
            ya4Var = ya4Var2;
            str2 = "chatroom_member_detail";
            linkedList2 = linkedList6;
            linkedList = linkedList7;
            ((ku5.t0) ku5.t0.f394148d).l(new kn.u(this, linkedList7, s0Var2, W0, dd3Var, linkedList5, ya4Var), 100L, str2);
        }
        if (!linkedList2.isEmpty()) {
            this.f391016h |= 2;
            ((ku5.t0) ku5.t0.f394148d).l(new kn.v(this, linkedList2, k4Var, W0, dd3Var, linkedList5, ya4Var), j17, str2);
        }
        if (linkedList.isEmpty() && linkedList2.isEmpty()) {
            int i29 = dd3Var.f453852e;
            java.util.List I2 = I(dd3Var.f453856i);
            java.util.List I3 = I(dd3Var.f453858n);
            W0.f69097x5eaef643 = ya4Var;
            W0.W0(i29);
            W0.R0(c01.z1.r(), linkedList5, I2, I3);
            ((qv1.a) ((rv1.f) gm0.j1.s(cls))).a().mo11260x413cb2b4(W0);
        }
        this.f391013e.mo815x76e0bfae(i18, i19, str, this);
    }
}

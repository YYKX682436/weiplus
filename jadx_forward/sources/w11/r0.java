package w11;

/* loaded from: classes12.dex */
public class r0 extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.List f523647r = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f523648d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.o f523649e;

    /* renamed from: f, reason: collision with root package name */
    public final long f523650f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f523651g;

    /* renamed from: h, reason: collision with root package name */
    public int f523652h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f523653i;

    /* renamed from: m, reason: collision with root package name */
    public int f523654m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f523655n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f523656o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f523657p;

    /* renamed from: q, reason: collision with root package name */
    public vg3.a4 f523658q;

    public r0(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.Object obj) {
        java.lang.String str3;
        boolean z17;
        this.f523652h = 15;
        this.f523653i = new java.util.LinkedList();
        this.f523654m = 3;
        this.f523655n = false;
        this.f523656o = new java.util.ArrayList();
        this.f523657p = null;
        this.f523658q = null;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.r1(1);
        f9Var.u1(str);
        f9Var.e1(c01.w9.o(str));
        f9Var.j1(1);
        f9Var.d1(str2);
        f9Var.m124850x7650bebc(i17);
        java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(f9Var);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = wi6;
        objArr[1] = java.lang.Boolean.valueOf(obj == null);
        objArr[2] = java.lang.Integer.valueOf(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", objArr);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6) && !wi6.startsWith("<msgsource>")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] the msgsource is right? %s", wi6);
        } else if ((i18 & 1) != 0 && (obj instanceof java.util.HashMap)) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                stringBuffer.append("<msgsource>");
            }
            for (java.util.Map.Entry entry : ((java.util.HashMap) obj).entrySet()) {
                java.lang.String str4 = (java.lang.String) entry.getValue();
                java.lang.String str5 = (java.lang.String) entry.getKey();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    if (!"similar_paste_seq".equalsIgnoreCase(str5)) {
                        stringBuffer.append("<");
                        stringBuffer.append(str5);
                        stringBuffer.append(">");
                        stringBuffer.append(str4);
                        stringBuffer.append("</");
                        stringBuffer.append(str5);
                        stringBuffer.append(">");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSendMsg", "%s %s", str5, str4);
                }
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
                stringBuffer.append("</msgsource>");
                wi6 = stringBuffer.toString();
            } else {
                wi6 = wi6.replace("<msgsource>", "<msgsource>" + stringBuffer.toString());
            }
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
            f9Var.u3(wi6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", f9Var.G);
        }
        int i19 = i18 & 4;
        if (i19 == 0 && (i18 & 8) == 0) {
            int i27 = i18 & 16;
            if (i27 != 0 || (i18 & 32) != 0) {
                int i28 = i27 != 0 ? 4 : 5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "has paste similar change flag, %d", java.lang.Integer.valueOf(i28));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(".msgsource.alnode.cf", java.lang.String.valueOf(i28));
                if (obj instanceof java.util.HashMap) {
                    hashMap.put(".msgsource.alnode.inlenlist", (java.lang.String) ((java.util.HashMap) obj).get("similar_paste_seq"));
                }
                c01.ia.N(f9Var, c01.ia.F(hashMap), false);
            }
        } else {
            int i29 = i19 != 0 ? 2 : 3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "has paste fully flag, %d", java.lang.Integer.valueOf(i29));
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(".msgsource.alnode.cf", java.lang.String.valueOf(i29));
            if (obj instanceof java.util.HashMap) {
                hashMap2.put(".msgsource.alnode.inlenlist", (java.lang.String) ((java.util.HashMap) obj).get("similar_paste_seq"));
            }
            c01.ia.N(f9Var, c01.ia.F(hashMap2), false);
        }
        try {
            this.f523650f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 255L, 1L, false);
            if (e17.toString().contains("UNIQUE constraint failed")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "fallback to insert");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
                this.f523650f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
            } else {
                throw e17;
            }
        } catch (java.lang.IllegalStateException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSendMsg", e18, "", new java.lang.Object[0]);
        }
        if (this.f523650f == -1) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 255L, 1L, false);
        } else if (((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(str)) {
            vg3.v3 v3Var = (vg3.v3) i95.n0.c(vg3.v3.class);
            java.lang.String r17 = c01.z1.r();
            long j17 = this.f523650f;
            java.lang.String Q0 = f9Var.Q0();
            u63.e eVar = (u63.e) v3Var;
            eVar.getClass();
            eVar.Bi(str, r17, str2, j17, c01.id.e(), Q0);
        }
        if (this.f523650f != -1) {
            z17 = true;
            str3 = null;
        } else {
            str3 = null;
            z17 = false;
        }
        iz5.a.g(str3, z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.f523650f);
    }

    public final void H(java.lang.String str) {
        int mo807x6c193ac1 = mo807x6c193ac1(m47995xb7ba1aa7(), this.f523648d);
        if (mo807x6c193ac1 == -2) {
            this.f523648d.mo815x76e0bfae(0, 0, str, this);
        } else if (mo807x6c193ac1 < 0) {
            this.f523648d.mo815x76e0bfae(3, -1, str, this);
        }
    }

    public final void I(int i17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) this.f523653i.get(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSendMsg", "markMsgFailed for id:%d", java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        J(f9Var);
    }

    public final void J(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        f9Var.r1(5);
        jx3.f.INSTANCE.mo68477x336bdfd8(111L, 30L, 1L, true);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(f9Var.m124847x74d37ac6(), f9Var, true);
        java.util.Iterator it = ((java.util.ArrayList) f523647r).iterator();
        while (it.hasNext()) {
            c01.w8 w8Var = (c01.w8) it.next();
            f9Var.j();
            w8Var.getClass();
        }
    }

    public final void K(int i17) {
        java.util.List list = this.f523653i;
        if (list == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, sendingList is null");
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        if (i17 >= linkedList.size() || i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, index:%d, sendingList.size:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(linkedList.size()));
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList.get(i17);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363 c5991xa0d42363 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5991xa0d42363();
        c5991xa0d42363.f136286g.f88994a = f9Var;
        c5991xa0d42363.e();
        f9Var.m124847x74d37ac6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.List] */
    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s sVar, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        java.util.ArrayList arrayList;
        this.f523648d = u0Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ez5();
        lVar.f152198b = new r45.fz5();
        lVar.f152199c = "/cgi-bin/micromsg-bin/newsendmsg";
        lVar.f152200d = 522;
        lVar.f152201e = 237;
        lVar.f152202f = 1000000237;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f523649e = a17;
        r45.ez5 ez5Var = (r45.ez5) a17.f152243a.f152217a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f523657p;
        if (f9Var == null) {
            arrayList = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().c6(this.f523652h);
        } else {
            if (f9Var.P0() != 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSendMsg", "msg:%d status:%d should not be resend !", java.lang.Long.valueOf(this.f523657p.m124847x74d37ac6()), java.lang.Integer.valueOf(this.f523657p.P0()));
            }
            this.f523657p.r1(1);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(this.f523650f, this.f523657p);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(this.f523657p);
            this.f523657p = null;
            arrayList = arrayList2;
        }
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneSendMsg", "no sending message");
            return -2;
        }
        java.util.List list = this.f523653i;
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) arrayList.get(i17);
            if (f9Var2.A0() == 1) {
                r45.ll4 ll4Var = new r45.ll4();
                r45.du5 du5Var = new r45.du5();
                du5Var.f454289d = f9Var2.Q0();
                du5Var.f454290e = true;
                ll4Var.f461105d = du5Var;
                ll4Var.f461108g = (int) (f9Var2.mo78012x3fdd41df() / 1000);
                ll4Var.f461107f = f9Var2.mo78013xfb85f7b0();
                ll4Var.f461106e = f9Var2.j();
                ll4Var.f461109h = c01.y1.a(c01.z1.r(), f9Var2.mo78012x3fdd41df()).hashCode();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Bi(f9Var2.Q0())) {
                    ll4Var.f461111m = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().X(f9Var2.Q0());
                }
                if (this.f523658q == null) {
                    this.f523658q = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).f523597d;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "using message source assembler %s", this.f523658q);
                this.f523658q.j(ll4Var, f9Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "reqCmd.MsgSource:%s", ll4Var.f461110i);
                ez5Var.f455384e.add(ll4Var);
                ez5Var.f455383d = ez5Var.f455384e.size();
                linkedList.add(f9Var2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "Req MsgSource %s", ll4Var.f461110i);
            }
        }
        int mo9409x10f9447a = mo9409x10f9447a(sVar, this.f523649e, this);
        if (mo9409x10f9447a < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "mark all failed. do scene %d", java.lang.Integer.valueOf(mo9409x10f9447a));
            for (int i18 = 0; i18 < ((java.util.LinkedList) list).size(); i18++) {
                I(i18);
            }
        }
        return mo9409x10f9447a;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 522;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean z17;
        int i27;
        java.util.List list = this.f523653i;
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "mark all failed. onGYNetEnd. errType:%d errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68477x336bdfd8(111L, i18 + 40, 1L, true);
            fVar.mo68477x336bdfd8(111L, 253L, 1L, false);
            if (i19 == 413) {
                int mo75928xcd1e8d8 = this.f523649e.f152243a.f152217a.mo75928xcd1e8d8();
                int i28 = this.f523652h / 2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "send msgs req exceed max limit, size %s, sendMsgMaxNum %s, newSendMsgMaxNum %s", java.lang.Integer.valueOf(mo75928xcd1e8d8), java.lang.Integer.valueOf(this.f523652h), java.lang.Integer.valueOf(i28));
                if (this.f523652h != 1) {
                    this.f523652h = i28;
                    H(str);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "one msg exceed?????");
                for (int i29 = 0; i29 < ((java.util.LinkedList) list).size(); i29++) {
                    I(i29);
                }
                this.f523648d.mo815x76e0bfae(i18, i19, str, this);
                for (int i37 = 0; i37 < ((java.util.LinkedList) list).size(); i37++) {
                    K(i37);
                }
                return;
            }
            if (i18 == 3 || i18 == 9 || i18 == 7 || i18 == 8 || i18 == 1) {
                this.f523648d.mo815x76e0bfae(i18, i19, str, this);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "Message delivery failed due to network reasons.");
                return;
            }
            for (int i38 = 0; i38 < ((java.util.LinkedList) list).size(); i38++) {
                I(i38);
            }
            this.f523648d.mo815x76e0bfae(i18, i19, str, this);
            for (int i39 = 0; i39 < ((java.util.LinkedList) list).size(); i39++) {
                K(i39);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "send fail, continue send SENDING msg");
            H(str);
            return;
        }
        r45.fz5 fz5Var = (r45.fz5) this.f523649e.f152244b.f152233a;
        java.util.LinkedList linkedList = fz5Var.f456284e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(fz5Var.f456285f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList2 = (java.util.LinkedList) list;
        if (linkedList2.size() == linkedList.size()) {
            int i47 = 0;
            while (true) {
                int size = linkedList.size();
                java.util.List list2 = this.f523656o;
                if (i47 >= size) {
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) list2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext total  [%d]msgs sent successfully, [%d]msgs need verifypsw", java.lang.Integer.valueOf(i47 - arrayList2.size()), java.lang.Integer.valueOf(arrayList2.size()));
                    break;
                }
                r45.ml4 ml4Var = (r45.ml4) linkedList.get(i47);
                if (ml4Var.f462159d != 0 || x51.o1.K) {
                    jx3.f.INSTANCE.mo68477x336bdfd8(111L, 252L, 1L, false);
                    int i48 = ml4Var.f462159d;
                    if (i48 == -49 || x51.o1.K) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext send msg failed: item ret code[%d], index[%d], testVerifyPsw[%b], retryVerifyCount[%d]", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i47), java.lang.Boolean.valueOf(x51.o1.K), java.lang.Integer.valueOf(this.f523654m));
                        if (this.f523655n) {
                            ((java.util.ArrayList) list2).add((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList2.get(i47));
                        } else {
                            int i49 = this.f523654m;
                            if (i49 < 0) {
                                I(i47);
                                this.f523648d.mo815x76e0bfae(4, ml4Var.f462159d, str, this);
                                K(i47);
                                return;
                            } else {
                                this.f523655n = true;
                                this.f523654m = i49 - 1;
                                ((java.util.ArrayList) list2).add((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList2.get(i47));
                                gm0.j1.e().j(new w11.q0(this, str));
                            }
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "send msg fail ret = %s MsgId=%s MsgSource=%s", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(ml4Var.f462161f), ml4Var.f462167o);
                        I(i47);
                        this.f523648d.mo815x76e0bfae(4, ml4Var.f462159d, str, this);
                        K(i47);
                    }
                } else {
                    long m124847x74d37ac6 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList2.get(i47)).m124847x74d37ac6();
                    java.lang.String Q0 = ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList2.get(i47)).Q0();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "msg local id = " + m124847x74d37ac6 + ", SvrId = " + ml4Var.f462166n + " sent successfully!");
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(Q0, m124847x74d37ac6);
                    Li.o1(ml4Var.f462166n);
                    c01.ia.P(Li, ml4Var.f462167o, false);
                    if (10007 == x51.o1.f533597q && (i27 = x51.o1.f533598r) != 0) {
                        Li.o1(i27);
                        x51.o1.f533598r = 0;
                    }
                    if (((Li.F & 512) > 0) && Li.mo78013xfb85f7b0() == 42) {
                        ((ce0.e) ((xg3.t0) i95.n0.c(xg3.t0.class))).getClass();
                        z17 = true;
                        com.p314xaae8f345.mm.p957x53236a1b.g1.L(Li, 21, 1);
                    } else {
                        z17 = true;
                    }
                    Li.r1(2);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(m124847x74d37ac6, Li, z17);
                    if (list == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, sendingList is null");
                    } else {
                        java.util.LinkedList linkedList3 = (java.util.LinkedList) list;
                        if (i47 >= linkedList3.size() || i47 < 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "publishMsgSendSuccessEvent, index:%d, sendingList.size:%d", java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(linkedList3.size()));
                        } else {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li2 = pt0.f0.Li(((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList3.get(i47)).Q0(), ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) linkedList3.get(i47)).m124847x74d37ac6());
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5993x579c3db0 c5993x579c3db0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5993x579c3db0();
                            c5993x579c3db0.f136288g.f89192a = Li2;
                            c5993x579c3db0.e();
                        }
                    }
                    arrayList.add(java.lang.Integer.valueOf(i47));
                    if (1 == ml4Var.f462165m) {
                        jx3.f fVar2 = jx3.f.INSTANCE;
                        fVar2.r(11942, true, false, java.lang.Long.valueOf(ml4Var.f462166n));
                        fVar2.r(11945, false, true, java.lang.Long.valueOf(ml4Var.f462166n));
                        fVar2.r(11946, false, false, java.lang.Long.valueOf(ml4Var.f462166n));
                        fVar2.mo68477x336bdfd8(90L, 0L, 1L, false);
                        fVar2.mo68477x336bdfd8(90L, 1L, 1L, true);
                    }
                }
                i47++;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "summerdktext send finish, continue send SENDING msg verifyingPsw[%b]", java.lang.Boolean.valueOf(this.f523655n));
        if (this.f523655n) {
            this.f523648d.mo815x76e0bfae(i18, i19, str, this);
        } else {
            H(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCount */
    public int mo11249xbf5a7574() {
        return 10;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityLimitCountReach */
    public boolean mo48014x3a8bbc5f() {
        boolean mo48014x3a8bbc5f = super.mo48014x3a8bbc5f();
        if (mo48014x3a8bbc5f) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 254L, 1L, false);
        }
        return mo48014x3a8bbc5f;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: securityVerificationChecked */
    public com.p314xaae8f345.mm.p944x882e457a.o1 mo11250x9215ac(com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var) {
        return this.f523653i.size() > 0 ? com.p314xaae8f345.mm.p944x882e457a.o1.EOk : com.p314xaae8f345.mm.p944x882e457a.o1.EFailed;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: uniqueInNetsceneQueue */
    public boolean mo48023x99a7e80c() {
        return true;
    }

    public r0(java.lang.String str, java.lang.String str2, int i17, int i18, long j17) {
        java.lang.String str3;
        this.f523652h = 15;
        this.f523653i = new java.util.LinkedList();
        this.f523654m = 3;
        this.f523655n = false;
        this.f523656o = new java.util.ArrayList();
        this.f523657p = null;
        this.f523658q = null;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.r1(1);
        f9Var.u1(str);
        f9Var.e1(c01.w9.o(str));
        f9Var.j1(1);
        f9Var.d1(str2);
        f9Var.m124850x7650bebc(i17);
        if (i18 == 1 && i17 == 42) {
            f9Var.t3();
        }
        java.lang.String wi6 = ((w11.j1) ((vg3.m4) i95.n0.c(vg3.m4.class))).wi(f9Var);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wi6)) {
            f9Var.u3(wi6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", f9Var.G);
        }
        try {
            this.f523650f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
            this.f523651g = str;
        } catch (com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 e17) {
            jx3.f.INSTANCE.mo68477x336bdfd8(111L, 255L, 1L, false);
            if (e17.toString().contains("UNIQUE constraint failed")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneSendMsg", "fallback to insert");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().tb();
                this.f523650f = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().N9(f9Var, true);
            } else {
                throw e17;
            }
        } catch (java.lang.IllegalStateException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSendMsg", e18, "", new java.lang.Object[0]);
        }
        if (this.f523650f == -1 || !((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).wi(str)) {
            str3 = "MicroMsg.NetSceneSendMsg";
        } else {
            vg3.v3 v3Var = (vg3.v3) i95.n0.c(vg3.v3.class);
            java.lang.String r17 = c01.z1.r();
            long j18 = this.f523650f;
            java.lang.String Q0 = f9Var.Q0();
            u63.e eVar = (u63.e) v3Var;
            eVar.getClass();
            str3 = "MicroMsg.NetSceneSendMsg";
            eVar.Bi(str, r17, str2, j18, c01.id.e(), Q0);
        }
        iz5.a.g(null, this.f523650f != -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "new msg inserted to db , local id = " + this.f523650f);
    }

    public r0(long j17, int i17, java.lang.String str) {
        this.f523652h = 15;
        this.f523653i = new java.util.LinkedList();
        this.f523654m = 3;
        this.f523655n = false;
        this.f523656o = new java.util.ArrayList();
        this.f523657p = null;
        this.f523658q = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "resend msg , local id = " + j17);
        this.f523650f = j17;
        this.f523651g = str;
        this.f523657p = pt0.f0.Li(str, j17);
    }

    public r0() {
        this.f523652h = 15;
        this.f523653i = new java.util.LinkedList();
        this.f523654m = 3;
        this.f523655n = false;
        this.f523656o = new java.util.ArrayList();
        this.f523657p = null;
        this.f523658q = null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
    }
}

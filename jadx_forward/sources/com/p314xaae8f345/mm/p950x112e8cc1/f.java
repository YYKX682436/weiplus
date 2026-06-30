package com.p314xaae8f345.mm.p950x112e8cc1;

/* loaded from: classes11.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: i, reason: collision with root package name */
    public static final mo3.l f152769i = new mo3.l(true);

    /* renamed from: m, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p950x112e8cc1.f f152770m;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p950x112e8cc1.d f152771d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.m1 f152772e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f152773f = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f152774g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p950x112e8cc1.e f152775h = new com.p314xaae8f345.mm.p950x112e8cc1.c(this);

    public static com.p314xaae8f345.mm.p950x112e8cc1.f d() {
        if (f152770m == null) {
            synchronized (com.p314xaae8f345.mm.p950x112e8cc1.f.class) {
                if (f152770m == null) {
                    f152770m = new com.p314xaae8f345.mm.p950x112e8cc1.f();
                }
            }
        }
        return f152770m;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "[cancel]...");
        this.f152774g = false;
        this.f152773f.clear();
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f152772e;
        if (m1Var != null) {
            com.p314xaae8f345.mm.p944x882e457a.z2.b(m1Var);
            g(null, -1, new java.util.LinkedList());
        }
        this.f152775h = null;
    }

    public void b(java.lang.String str) {
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.d3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).n(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "[clearConversationDeliverCount] username:%s", str);
            r45.uc3 uc3Var = new r45.uc3();
            uc3Var.f468744d = x51.j1.i(str);
            uc3Var.f468745e = 0;
            uc3Var.f468749i = 0;
            uc3Var.f468746f = 0;
            uc3Var.f468747g = 0;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = uc3Var;
            lVar.f152198b = new r45.vc3();
            lVar.f152199c = "/cgi-bin/micromsg-bin/getcrmsg";
            lVar.f152200d = 805;
            lVar.f152201e = 0;
            lVar.f152202f = 0;
            com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), null, false);
        }
    }

    public void c(java.lang.String str, long j17, long j18, int i17, com.p314xaae8f345.mm.p950x112e8cc1.e eVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "[fetch] chatroomId:" + str + " msgSeq:" + j17 + " filterSeq:" + j18 + " upDownFlag:" + i17 + " isRunning=" + this.f152774g);
        this.f152775h = eVar;
        r45.uc3 uc3Var = new r45.uc3();
        uc3Var.f468744d = x51.j1.i(str);
        uc3Var.f468745e = (int) j17;
        uc3Var.f468749i = (int) j18;
        uc3Var.f468746f = 18;
        uc3Var.f468747g = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = uc3Var;
        lVar.f152198b = new r45.vc3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcrmsg";
        lVar.f152200d = 805;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        if (this.f152774g) {
            this.f152773f.add(lVar.a());
        } else {
            this.f152774g = true;
            this.f152772e = com.p314xaae8f345.mm.p944x882e457a.z2.e(lVar.a(), this, true, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "[callback] errType:%d errCode:%d errMsg:%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f152772e = null;
        try {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (m1Var.mo808xfb85f7b0() != 805) {
                g(oVar, -1, linkedList2);
                com.p314xaae8f345.mm.p944x882e457a.o oVar2 = (com.p314xaae8f345.mm.p944x882e457a.o) this.f152773f.poll();
                if (oVar2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f152773f.size()));
                    this.f152774g = true;
                    this.f152772e = com.p314xaae8f345.mm.p944x882e457a.z2.e(oVar2, this, true, null);
                } else {
                    this.f152774g = false;
                }
                return 0;
            }
            if (i17 != 0 || i18 != 0 || oVar == null) {
                g(oVar, -1, linkedList2);
                com.p314xaae8f345.mm.p944x882e457a.o oVar3 = (com.p314xaae8f345.mm.p944x882e457a.o) this.f152773f.poll();
                if (oVar3 == null) {
                    this.f152774g = false;
                    return 0;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f152773f.size()));
                this.f152774g = true;
                this.f152772e = com.p314xaae8f345.mm.p944x882e457a.z2.e(oVar3, this, true, null);
                return 0;
            }
            r45.uc3 uc3Var = (r45.uc3) oVar.f152243a.f152217a;
            r45.vc3 vc3Var = (r45.vc3) oVar.f152244b.f152233a;
            if (vc3Var != null && (linkedList = vc3Var.f469629e) != null) {
                if (linkedList.size() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetChatroomMsgFetcher", "[callback] fetch size is 0! [%s:%s] isUpFlag:%s ChatroomId:%s", java.lang.Integer.valueOf(uc3Var.f468745e), java.lang.Integer.valueOf(uc3Var.f468749i), java.lang.Integer.valueOf(uc3Var.f468747g), x51.j1.g(uc3Var.f468744d));
                    g(oVar, 0, linkedList2);
                    com.p314xaae8f345.mm.p944x882e457a.o oVar4 = (com.p314xaae8f345.mm.p944x882e457a.o) this.f152773f.poll();
                    if (oVar4 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f152773f.size()));
                        this.f152774g = true;
                        this.f152772e = com.p314xaae8f345.mm.p944x882e457a.z2.e(oVar4, this, true, null);
                    } else {
                        this.f152774g = false;
                    }
                    return 0;
                }
                try {
                    vg3.w3 w3Var = (vg3.w3) i95.n0.c(vg3.w3.class);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa("MicroMsg.GetChatroomMsgFetcher" + hashCode());
                    java.util.Iterator it = f(vc3Var.f469629e, uc3Var.f468747g == 1, x51.j1.g(uc3Var.f468744d)).iterator();
                    while (it.hasNext()) {
                        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = (com.p314xaae8f345.mm.p944x882e457a.p0) it.next();
                        mo3.l lVar = f152769i;
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.b2) w3Var).getClass();
                        com.p314xaae8f345.mm.p944x882e457a.q0 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.a2.b(p0Var, com.p314xaae8f345.mm.p642xad8b531f.x1.e(), lVar);
                        if (b17 != null) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = b17.f152276a;
                            if (f9Var == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetChatroomMsgFetcher", "ddMsgReturn.msg == null！may be revoke msg");
                            } else {
                                linkedList2.add(f9Var);
                            }
                        } else {
                            linkedList2.add(e(p0Var.f152259a, p0Var));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "addMsgReturn == null! addMsgInfo addMsg type:%s", java.lang.Integer.valueOf(p0Var.f152259a.f459093g));
                        }
                    }
                    com.p314xaae8f345.mm.p944x882e457a.o oVar5 = (com.p314xaae8f345.mm.p944x882e457a.o) this.f152773f.poll();
                    if (oVar5 == null) {
                        this.f152774g = false;
                        return 0;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f152773f.size()));
                    this.f152774g = true;
                    this.f152772e = com.p314xaae8f345.mm.p944x882e457a.z2.e(oVar5, this, true, null);
                    return 0;
                } finally {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa("MicroMsg.GetChatroomMsgFetcher" + hashCode());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "[callback] chatroomId:" + x51.j1.g(uc3Var.f468744d) + " AddMsgList size:" + vc3Var.f469629e.size());
                    g(oVar, 0, linkedList2);
                }
            }
            g(oVar, -1, linkedList2);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(vc3Var == null);
            objArr[1] = java.lang.Boolean.valueOf(vc3Var.f469629e == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GetChatroomMsgFetcher", "[callback] resp == null? %b resp.AddMsgList == null? %b", objArr);
            com.p314xaae8f345.mm.p944x882e457a.o oVar6 = (com.p314xaae8f345.mm.p944x882e457a.o) this.f152773f.poll();
            if (oVar6 == null) {
                this.f152774g = false;
                return 0;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f152773f.size()));
            this.f152774g = true;
            this.f152772e = com.p314xaae8f345.mm.p944x882e457a.z2.e(oVar6, this, true, null);
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.p944x882e457a.o oVar7 = (com.p314xaae8f345.mm.p944x882e457a.o) this.f152773f.poll();
            if (oVar7 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f152773f.size()));
                this.f152774g = true;
                this.f152772e = com.p314xaae8f345.mm.p944x882e457a.z2.e(oVar7, this, true, null);
            } else {
                this.f152774g = false;
            }
            throw th6;
        }
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 e(r45.j4 j4Var, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
        f9Var.o1(j4Var.f459101r);
        f9Var.e1(p0Var.f152264f);
        f9Var.n1(j4Var.f459102s);
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        java.lang.String g18 = x51.j1.g(j4Var.f459092f);
        if (((com.p314xaae8f345.mm.p2621x8fb0427b.ka) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).s0(g17) || ((java.lang.String) gm0.j1.u().c().l(2, "")).equals(g17)) {
            f9Var.j1(1);
            f9Var.u1(g18);
            f9Var.r1(j4Var.f459095i);
        } else {
            f9Var.j1(0);
            f9Var.u1(g17);
            int i17 = j4Var.f459095i;
            if (i17 <= 3) {
                i17 = 3;
            }
            f9Var.r1(i17);
        }
        if (j4Var.f459093g == 10000) {
            f9Var.r1(4);
        }
        f9Var.f1(2);
        return f9Var;
    }

    public final java.util.LinkedList f(java.util.List list, boolean z17, java.lang.String str) {
        java.lang.Class<vg3.x3> cls;
        java.util.Iterator it;
        long j17;
        long j18;
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var;
        java.lang.Class<vg3.x3> cls2 = vg3.x3.class;
        long m07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls2))).Ni()).m0(str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = list.iterator();
        long j19 = 0;
        long j27 = 0;
        while (it6.hasNext()) {
            r45.j4 j4Var = (r45.j4) it6.next();
            long j28 = j4Var.f459098o * 1000;
            if (j27 == j19) {
                final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(cls2))).cj();
                final java.lang.String g17 = x51.j1.g(j4Var.f459091e);
                final long j29 = j4Var.f459102s;
                cj6.getClass();
                cls = cls2;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                    it = it6;
                    j17 = j28;
                } else {
                    final java.lang.String X8 = cj6.X8(g17);
                    if (cj6.Da(X8)) {
                        it = it6;
                        j17 = j28;
                        f9Var = ot0.c3.l().g("getBeforeSeqLastMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$z2
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                return ot0.z2.f430355a.w(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, g17, j29);
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$a3
                            @Override // yz5.a
                            /* renamed from: invoke */
                            public final java.lang.Object mo152xb9724478() {
                                com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                                g9Var.getClass();
                                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                                android.database.Cursor f17 = g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(g17) + "AND msgSeq<" + j29 + " order by msgSeq DESC limit 1", null, 2);
                                if (f17.moveToFirst()) {
                                    f9Var2.mo9015xbf5d97fd(f17);
                                }
                                f17.close();
                                return f9Var2;
                            }
                        });
                    } else {
                        it = it6;
                        j17 = j28;
                        if (cj6.Pb(X8)) {
                            f9Var = ot0.z2.f430355a.w(cj6.f275522r, X8, g17, j29);
                        } else {
                            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                            android.database.Cursor f17 = cj6.f275522r.f("select * from " + X8 + " where" + cj6.Z8(g17) + "AND msgSeq<" + j29 + " order by msgSeq DESC limit 1", null, 2);
                            if (f17.moveToFirst()) {
                                f9Var2.mo9015xbf5d97fd(f17);
                            }
                            f17.close();
                            f9Var = f9Var2;
                        }
                    }
                }
                j18 = 1000;
                if (f9Var.mo78012x3fdd41df() / 1000 == j4Var.f459098o) {
                    j17 = f9Var.mo78012x3fdd41df() + 1;
                }
            } else {
                cls = cls2;
                it = it6;
                j17 = j28;
                j18 = 1000;
            }
            if (j27 / j18 == j17 / j18) {
                j27++;
                p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var, true, false, z17, j27);
            } else {
                p0Var = new com.p314xaae8f345.mm.p944x882e457a.p0(j4Var, true, false, z17, j17);
                j27 = j17;
            }
            if (m07 < j27) {
                linkedList.add(p0Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetChatroomMsgFetcher", "this conversation[%s] has delete before! lastDeleteCreateTime:%s curTime:%s", str, java.lang.Long.valueOf(m07), java.lang.Long.valueOf(j27));
            }
            it6 = it;
            cls2 = cls;
            j19 = 0;
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f4 A[LOOP:1: B:65:0x02ee->B:67:0x02f4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0458  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.p314xaae8f345.mm.p944x882e457a.o r39, int r40, java.util.LinkedList r41) {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p950x112e8cc1.f.g(com.tencent.mm.modelbase.o, int, java.util.LinkedList):void");
    }
}

package com.tencent.mm.modelgetchatroommsg;

/* loaded from: classes11.dex */
public class f implements com.tencent.mm.modelbase.e3 {

    /* renamed from: i, reason: collision with root package name */
    public static final mo3.l f71236i = new mo3.l(true);

    /* renamed from: m, reason: collision with root package name */
    public static com.tencent.mm.modelgetchatroommsg.f f71237m;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelgetchatroommsg.d f71238d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f71239e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f71240f = new java.util.concurrent.ConcurrentLinkedDeque();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f71241g = false;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelgetchatroommsg.e f71242h = new com.tencent.mm.modelgetchatroommsg.c(this);

    public static com.tencent.mm.modelgetchatroommsg.f d() {
        if (f71237m == null) {
            synchronized (com.tencent.mm.modelgetchatroommsg.f.class) {
                if (f71237m == null) {
                    f71237m = new com.tencent.mm.modelgetchatroommsg.f();
                }
            }
        }
        return f71237m;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "[cancel]...");
        this.f71241g = false;
        this.f71240f.clear();
        com.tencent.mm.modelbase.m1 m1Var = this.f71239e;
        if (m1Var != null) {
            com.tencent.mm.modelbase.z2.b(m1Var);
            g(null, -1, new java.util.LinkedList());
        }
        this.f71242h = null;
    }

    public void b(java.lang.String str) {
        if (((com.tencent.mm.storage.d3) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).wi()).n(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "[clearConversationDeliverCount] username:%s", str);
            r45.uc3 uc3Var = new r45.uc3();
            uc3Var.f387211d = x51.j1.i(str);
            uc3Var.f387212e = 0;
            uc3Var.f387216i = 0;
            uc3Var.f387213f = 0;
            uc3Var.f387214g = 0;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = uc3Var;
            lVar.f70665b = new r45.vc3();
            lVar.f70666c = "/cgi-bin/micromsg-bin/getcrmsg";
            lVar.f70667d = 805;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.z2.d(lVar.a(), null, false);
        }
    }

    public void c(java.lang.String str, long j17, long j18, int i17, com.tencent.mm.modelgetchatroommsg.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "[fetch] chatroomId:" + str + " msgSeq:" + j17 + " filterSeq:" + j18 + " upDownFlag:" + i17 + " isRunning=" + this.f71241g);
        this.f71242h = eVar;
        r45.uc3 uc3Var = new r45.uc3();
        uc3Var.f387211d = x51.j1.i(str);
        uc3Var.f387212e = (int) j17;
        uc3Var.f387216i = (int) j18;
        uc3Var.f387213f = 18;
        uc3Var.f387214g = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = uc3Var;
        lVar.f70665b = new r45.vc3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcrmsg";
        lVar.f70667d = 805;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        if (this.f71241g) {
            this.f71240f.add(lVar.a());
        } else {
            this.f71241g = true;
            this.f71239e = com.tencent.mm.modelbase.z2.e(lVar.a(), this, true, null);
        }
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "[callback] errType:%d errCode:%d errMsg:%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        this.f71239e = null;
        try {
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            if (m1Var.getType() != 805) {
                g(oVar, -1, linkedList2);
                com.tencent.mm.modelbase.o oVar2 = (com.tencent.mm.modelbase.o) this.f71240f.poll();
                if (oVar2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f71240f.size()));
                    this.f71241g = true;
                    this.f71239e = com.tencent.mm.modelbase.z2.e(oVar2, this, true, null);
                } else {
                    this.f71241g = false;
                }
                return 0;
            }
            if (i17 != 0 || i18 != 0 || oVar == null) {
                g(oVar, -1, linkedList2);
                com.tencent.mm.modelbase.o oVar3 = (com.tencent.mm.modelbase.o) this.f71240f.poll();
                if (oVar3 == null) {
                    this.f71241g = false;
                    return 0;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f71240f.size()));
                this.f71241g = true;
                this.f71239e = com.tencent.mm.modelbase.z2.e(oVar3, this, true, null);
                return 0;
            }
            r45.uc3 uc3Var = (r45.uc3) oVar.f70710a.f70684a;
            r45.vc3 vc3Var = (r45.vc3) oVar.f70711b.f70700a;
            if (vc3Var != null && (linkedList = vc3Var.f388096e) != null) {
                if (linkedList.size() <= 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.GetChatroomMsgFetcher", "[callback] fetch size is 0! [%s:%s] isUpFlag:%s ChatroomId:%s", java.lang.Integer.valueOf(uc3Var.f387212e), java.lang.Integer.valueOf(uc3Var.f387216i), java.lang.Integer.valueOf(uc3Var.f387214g), x51.j1.g(uc3Var.f387211d));
                    g(oVar, 0, linkedList2);
                    com.tencent.mm.modelbase.o oVar4 = (com.tencent.mm.modelbase.o) this.f71240f.poll();
                    if (oVar4 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f71240f.size()));
                        this.f71241g = true;
                        this.f71239e = com.tencent.mm.modelbase.z2.e(oVar4, this, true, null);
                    } else {
                        this.f71241g = false;
                    }
                    return 0;
                }
                try {
                    vg3.w3 w3Var = (vg3.w3) i95.n0.c(vg3.w3.class);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().aa("MicroMsg.GetChatroomMsgFetcher" + hashCode());
                    java.util.Iterator it = f(vc3Var.f388096e, uc3Var.f387214g == 1, x51.j1.g(uc3Var.f387211d)).iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.modelbase.p0 p0Var = (com.tencent.mm.modelbase.p0) it.next();
                        mo3.l lVar = f71236i;
                        ((com.tencent.mm.plugin.messenger.foundation.b2) w3Var).getClass();
                        com.tencent.mm.modelbase.q0 b17 = com.tencent.mm.plugin.messenger.foundation.a2.b(p0Var, com.tencent.mm.booter.x1.e(), lVar);
                        if (b17 != null) {
                            com.tencent.mm.storage.f9 f9Var = b17.f70743a;
                            if (f9Var == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.GetChatroomMsgFetcher", "ddMsgReturn.msg == null！may be revoke msg");
                            } else {
                                linkedList2.add(f9Var);
                            }
                        } else {
                            linkedList2.add(e(p0Var.f70726a, p0Var));
                            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "addMsgReturn == null! addMsgInfo addMsg type:%s", java.lang.Integer.valueOf(p0Var.f70726a.f377560g));
                        }
                    }
                    com.tencent.mm.modelbase.o oVar5 = (com.tencent.mm.modelbase.o) this.f71240f.poll();
                    if (oVar5 == null) {
                        this.f71241g = false;
                        return 0;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f71240f.size()));
                    this.f71241g = true;
                    this.f71239e = com.tencent.mm.modelbase.z2.e(oVar5, this, true, null);
                    return 0;
                } finally {
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Pa("MicroMsg.GetChatroomMsgFetcher" + hashCode());
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "[callback] chatroomId:" + x51.j1.g(uc3Var.f387211d) + " AddMsgList size:" + vc3Var.f388096e.size());
                    g(oVar, 0, linkedList2);
                }
            }
            g(oVar, -1, linkedList2);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(vc3Var == null);
            objArr[1] = java.lang.Boolean.valueOf(vc3Var.f388096e == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.GetChatroomMsgFetcher", "[callback] resp == null? %b resp.AddMsgList == null? %b", objArr);
            com.tencent.mm.modelbase.o oVar6 = (com.tencent.mm.modelbase.o) this.f71240f.poll();
            if (oVar6 == null) {
                this.f71241g = false;
                return 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f71240f.size()));
            this.f71241g = true;
            this.f71239e = com.tencent.mm.modelbase.z2.e(oVar6, this, true, null);
            return 0;
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.modelbase.o oVar7 = (com.tencent.mm.modelbase.o) this.f71240f.poll();
            if (oVar7 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomMsgFetcher", "do next next... %s", java.lang.Integer.valueOf(this.f71240f.size()));
                this.f71241g = true;
                this.f71239e = com.tencent.mm.modelbase.z2.e(oVar7, this, true, null);
            } else {
                this.f71241g = false;
            }
            throw th6;
        }
    }

    public final com.tencent.mm.storage.f9 e(r45.j4 j4Var, com.tencent.mm.modelbase.p0 p0Var) {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.o1(j4Var.f377568r);
        f9Var.e1(p0Var.f70731f);
        f9Var.n1(j4Var.f377569s);
        java.lang.String g17 = x51.j1.g(j4Var.f377558e);
        java.lang.String g18 = x51.j1.g(j4Var.f377559f);
        if (((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).s0(g17) || ((java.lang.String) gm0.j1.u().c().l(2, "")).equals(g17)) {
            f9Var.j1(1);
            f9Var.u1(g18);
            f9Var.r1(j4Var.f377562i);
        } else {
            f9Var.j1(0);
            f9Var.u1(g17);
            int i17 = j4Var.f377562i;
            if (i17 <= 3) {
                i17 = 3;
            }
            f9Var.r1(i17);
        }
        if (j4Var.f377560g == 10000) {
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
        com.tencent.mm.modelbase.p0 p0Var;
        java.lang.Class<vg3.x3> cls2 = vg3.x3.class;
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).Ni()).m0(str);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it6 = list.iterator();
        long j19 = 0;
        long j27 = 0;
        while (it6.hasNext()) {
            r45.j4 j4Var = (r45.j4) it6.next();
            long j28 = j4Var.f377565o * 1000;
            if (j27 == j19) {
                final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).cj();
                final java.lang.String g17 = x51.j1.g(j4Var.f377558e);
                final long j29 = j4Var.f377569s;
                cj6.getClass();
                cls = cls2;
                com.tencent.mm.storage.f9 f9Var = null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                    it = it6;
                    j17 = j28;
                } else {
                    final java.lang.String X8 = cj6.X8(g17);
                    if (cj6.Da(X8)) {
                        it = it6;
                        j17 = j28;
                        f9Var = ot0.c3.l().g("getBeforeSeqLastMsg", new yz5.a() { // from class: com.tencent.mm.storage.g9$$z2
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                return ot0.z2.f348822a.w(com.tencent.mm.storage.g9.this.f193989r, X8, g17, j29);
                            }
                        }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$a3
                            @Override // yz5.a
                            public final java.lang.Object invoke() {
                                com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                                g9Var.getClass();
                                com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                                android.database.Cursor f17 = g9Var.f193989r.f("select * from " + X8 + " where" + g9Var.Z8(g17) + "AND msgSeq<" + j29 + " order by msgSeq DESC limit 1", null, 2);
                                if (f17.moveToFirst()) {
                                    f9Var2.convertFrom(f17);
                                }
                                f17.close();
                                return f9Var2;
                            }
                        });
                    } else {
                        it = it6;
                        j17 = j28;
                        if (cj6.Pb(X8)) {
                            f9Var = ot0.z2.f348822a.w(cj6.f193989r, X8, g17, j29);
                        } else {
                            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                            android.database.Cursor f17 = cj6.f193989r.f("select * from " + X8 + " where" + cj6.Z8(g17) + "AND msgSeq<" + j29 + " order by msgSeq DESC limit 1", null, 2);
                            if (f17.moveToFirst()) {
                                f9Var2.convertFrom(f17);
                            }
                            f17.close();
                            f9Var = f9Var2;
                        }
                    }
                }
                j18 = 1000;
                if (f9Var.getCreateTime() / 1000 == j4Var.f377565o) {
                    j17 = f9Var.getCreateTime() + 1;
                }
            } else {
                cls = cls2;
                it = it6;
                j17 = j28;
                j18 = 1000;
            }
            if (j27 / j18 == j17 / j18) {
                j27++;
                p0Var = new com.tencent.mm.modelbase.p0(j4Var, true, false, z17, j27);
            } else {
                p0Var = new com.tencent.mm.modelbase.p0(j4Var, true, false, z17, j17);
                j27 = j17;
            }
            if (m07 < j27) {
                linkedList.add(p0Var);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.GetChatroomMsgFetcher", "this conversation[%s] has delete before! lastDeleteCreateTime:%s curTime:%s", str, java.lang.Long.valueOf(m07), java.lang.Long.valueOf(j27));
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
    public final void g(com.tencent.mm.modelbase.o r39, int r40, java.util.LinkedList r41) {
        /*
            Method dump skipped, instructions count: 1673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelgetchatroommsg.f.g(com.tencent.mm.modelbase.o, int, java.util.LinkedList):void");
    }
}

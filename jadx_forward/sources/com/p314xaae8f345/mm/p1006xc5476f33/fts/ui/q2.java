package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class q2 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 F;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f219684J;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f219685q;

    /* renamed from: r, reason: collision with root package name */
    public final g23.k f219686r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f219687s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f219688t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f219689u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f219690v;

    /* renamed from: w, reason: collision with root package name */
    public int f219691w;

    /* renamed from: x, reason: collision with root package name */
    public int f219692x;

    /* renamed from: y, reason: collision with root package name */
    public int f219693y;

    /* renamed from: z, reason: collision with root package name */
    public int f219694z;

    public q2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, int i17) {
        super(w0Var);
        this.f219689u = true;
        boolean z17 = false;
        this.f219690v = false;
        this.f219691w = -1;
        this.f219692x = -1;
        this.f219693y = -1;
        this.f219694z = 1;
        this.F = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.r2(this, android.os.Looper.getMainLooper());
        this.G = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.H = -1;
        this.f219686r = new g23.k();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(16);
        hashSet.add(32);
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            hashSet.add(256);
        }
        hashSet.add(48);
        hashSet.add(51);
        hashSet.add(64);
        hashSet.add(128);
        hashSet.add(96);
        hashSet.add(97);
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
            hashSet.add(98);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f524489e) {
            hashSet.add(129);
        }
        hashSet.add(112);
        hashSet.add(133);
        if (gm0.j1.a()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b c6019x2a86117b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6019x2a86117b();
            c6019x2a86117b.e();
            if (c6019x2a86117b.f136313h.f89109a) {
                z17 = true;
            }
        }
        if (z17) {
            hashSet.add(144);
        }
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f524488d) {
            hashSet.add(272);
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20670xe37ef71e()) == 1) {
            hashSet.add(304);
        }
        this.f219685q = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(hashSet, h(), this, i17);
        if (((w50.k) ((x50.j) i95.n0.c(x50.j.class))).f524489e) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x0(activity, "SettingSearch_Local", null), 3, null);
        }
    }

    @Override // t13.j
    public void a(t13.k kVar, java.lang.String str, boolean z17) {
        int i17;
        int i18;
        int i19;
        if (!this.f219690v && (i17 = this.H) >= 0) {
            java.util.List list = this.f219685q;
            java.util.LinkedList linkedList = (java.util.LinkedList) list;
            if (i17 < linkedList.size() && ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).f484624d.f432694a) {
                if (kVar instanceof j23.y) {
                    this.f219692x = this.H;
                } else if (kVar instanceof j23.g) {
                    this.f219691w = this.H;
                }
                if (this.f219692x >= 0 && (i18 = this.f219691w) >= 0) {
                    t13.k kVar2 = (t13.k) linkedList.get(i18);
                    if (kVar2 instanceof j23.g) {
                        this.f219690v = true;
                        if (((j23.g) kVar2).f378804p && (i19 = this.f219692x) < this.f219691w) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "tryReSortUIUnit, relevantSearchUIUnitIdx: (%d)<->chatRoomUIUnitIdx: (%d)", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f219691w));
                            java.util.Collections.swap(list, this.f219691w, this.f219692x);
                            int i27 = this.f219691w;
                            this.f219691w = this.f219692x;
                            this.f219692x = i27;
                        }
                    }
                }
            }
        }
        boolean z18 = kVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a;
        g23.k kVar3 = this.f219686r;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.a) kVar;
            if (str.equals(this.f219583g)) {
                q(aVar.f219543o);
            }
            try {
                if (aVar.r() > 0 && this.A == 0) {
                    long c17 = c01.id.c() - this.f219584h;
                    this.A = c17;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.j(9, c17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstItemTime=%d", java.lang.Long.valueOf(this.A));
                }
            } catch (java.util.ConcurrentModificationException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSMainAdapter", e17, "", new java.lang.Object[0]);
            }
            int mo9548xfb85f7b0 = aVar.mo9548xfb85f7b0();
            if (mo9548xfb85f7b0 != 16) {
                if (mo9548xfb85f7b0 != 32) {
                    if (mo9548xfb85f7b0 == 48 && this.D == 0) {
                        long c18 = c01.id.c() - this.f219584h;
                        this.D = c18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstGetChatroomTime=%d", java.lang.Long.valueOf(c18));
                        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.j(6, this.D);
                    }
                } else if (this.C == 0) {
                    long c19 = c01.id.c() - this.f219584h;
                    this.C = c19;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstGetContactTime=%d", java.lang.Long.valueOf(c19));
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.j(3, this.C);
                }
            } else if (this.B == 0) {
                long c27 = c01.id.c() - this.f219584h;
                this.B = c27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "firstGetTopHitsTime=%d", java.lang.Long.valueOf(c27));
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.j(0, this.B);
            }
            kVar3.getClass();
            for (t13.i iVar : aVar.f219542n) {
                int size = iVar.f496103f.size() + (iVar.f496101d ? 1 : 0);
                int i28 = iVar.f496102e;
                if (i28 != -32) {
                    if (i28 != -27) {
                        if (i28 == -13) {
                            kVar3.f349486r = size;
                            kVar3.f349487s = kVar3.d(iVar);
                        } else if (i28 == -11) {
                            kVar3.f349485q = size;
                        } else if (i28 == -24) {
                            kVar3.f349477i = size;
                        } else if (i28 == -23) {
                            kVar3.f349479k = size;
                            kVar3.f349480l = kVar3.d(iVar);
                        } else if (i28 == -8) {
                            kVar3.f349472d = size;
                        } else if (i28 != -7) {
                            if (i28 == -6) {
                                kVar3.f349483o = size;
                            } else if (i28 == -4) {
                                kVar3.f349473e = size;
                            } else if (i28 == -3) {
                                if (iVar.f496103f.size() > 0) {
                                    java.util.List list2 = iVar.f496103f;
                                    if (((p13.y) list2.get(list2.size() - 1)).f432720e.equals("create_chatroom\u200b")) {
                                        kVar3.f349475g = 1;
                                        kVar3.f349474f = size - 1;
                                    }
                                }
                                kVar3.f349474f = size;
                            } else if (i28 != -2) {
                                if (i28 == -1) {
                                    kVar3.f349484p = size;
                                }
                            } else if (iVar.f496103f.size() <= 0 || !((p13.y) iVar.f496103f.get(0)).f432720e.equals("create_talker_message\u200b")) {
                                kVar3.f349481m = size;
                            } else {
                                kVar3.f349482n = 1;
                                kVar3.f349481m = size - 1;
                            }
                        }
                    }
                    kVar3.f349476h = size;
                    kVar3.f349478j = kVar3.d(iVar);
                } else {
                    kVar3.f349492x = size;
                }
            }
        } else if (kVar instanceof j23.y) {
            j23.y yVar = (j23.y) kVar;
            if (str.equals(this.f219583g)) {
                q(yVar.f378825h);
            }
            kVar3.f349490v = yVar.e();
        }
        kVar3.D = s();
        new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s2(this, kVar, str).run();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void c() {
        super.c();
        for (t13.k kVar : this.f219685q) {
            kVar.mo63601x92b73cc2();
            kVar.c();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        g23.k kVar;
        int i18;
        j23.y yVar;
        int i19;
        java.util.List list = this.f219685q;
        java.util.Iterator it = list.iterator();
        u13.g gVar = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            t13.k kVar2 = (t13.k) it.next();
            u13.g b17 = kVar2.b(i17);
            kVar2.d();
            if (b17 != null) {
                gVar = b17;
                break;
            }
            gVar = b17;
        }
        if (gVar != null) {
            gVar.f505301k = java.lang.String.valueOf(o13.p.f423784d);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it6 = list.iterator();
            int i27 = 0;
            while (true) {
                boolean hasNext = it6.hasNext();
                kVar = this.f219686r;
                if (!hasNext) {
                    break;
                }
                t13.k kVar3 = (t13.k) it6.next();
                linkedList.addAll(kVar3.g());
                if ((kVar3 instanceof j23.y) && i17 > (i19 = (yVar = (j23.y) kVar3).f378835u)) {
                    i27 = (yVar.f378829o ? 0 : yVar.f378834t) - 1;
                    kVar.K = i19;
                    kVar.f349468J = i27;
                }
            }
            kVar.I = linkedList;
            int size = linkedList.size();
            while (true) {
                size--;
                if (size < 0) {
                    i18 = i17 + i27;
                    break;
                }
                if (i17 > ((java.lang.Integer) linkedList.get(size)).intValue()) {
                    i18 = (i17 - size) + i27;
                    break;
                }
            }
            gVar.f505299i = i18;
            this.f219694z = i18 + 1;
            gVar.f505296f = 1;
            gVar.f505306p = this.f219586m.f219617a;
        }
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTS.FTSMainAdapter", "Create Data Item Error: getCount-%d position-%d", java.lang.Integer.valueOf(getCount()), java.lang.Integer.valueOf(i17));
        }
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        int i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f219686r.f349469a) && !this.f219687s) {
            g23.k kVar = this.f219686r;
            if (kVar.B != 0) {
                kVar.L = z13.f.Y6(h()).b7();
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.l(this.f219686r);
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.i(this.f219686r);
            }
        }
        int i18 = this.f219692x;
        if (i18 >= 0 && (i17 = this.f219691w) >= 0 && i18 > i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "doSearch, relevantSearchUIUnitIdx=%d, chatRoomUIUnitIdx=%d, query=%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.f219691w), this.f219583g);
            java.util.Collections.swap(this.f219685q, this.f219691w, this.f219692x);
        }
        this.f219687s = false;
        this.f219688t = false;
        this.f219684J = false;
        this.H = -1;
        this.I = false;
        this.f219686r.e();
        long g17 = o13.n.g(3);
        o13.p.f423784d = g17;
        g23.k kVar2 = this.f219686r;
        kVar2.B = g17;
        kVar2.f349469a = this.f219583g;
        kVar2.f349470b = c01.id.c();
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.f219689u = true;
        this.f219690v = false;
        this.f219691w = -1;
        this.f219692x = -1;
        this.f219693y = -1;
        this.f219694z = 1;
        if (this.f219586m.f219618b) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.fts.ui.q2$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2 q2Var = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q2.this;
                    q2Var.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "[fts][sug] onlyWebSearch notifyLocalSearchEnd directly");
                    q2Var.l(10, true);
                    q2Var.t(false, false);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 0L, false);
            return;
        }
        boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("filehelper");
        hashSet.add("gh_051d9102de63");
        boolean s17 = c01.z1.s();
        if (!s17) {
            s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("BindQQSwitch"), 1) == 1;
        }
        if (!s17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "summerqq BindQQSwitch off");
            hashSet.add(java.lang.String.valueOf(22));
            hashSet.add(java.lang.String.valueOf(23));
        }
        hashSet.add("62");
        if (u11.c.f((java.lang.String) gm0.j1.u().c().l(274436, null))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSMainAdapter", "checkLookVisibility EuropeanUnionCountry");
            hashSet.add("65");
        }
        ((zq1.a0) gm0.j1.s(zq1.a0.class)).getClass();
        hashSet.add("63");
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20305xd648a222()) == 0 || c01.e2.a0()) {
            hashSet.add("96");
        }
        ((ab5.a) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.b5.class))).getClass();
        if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("appbrandcustomerservicemsg") != null)) {
            hashSet.add(java.lang.String.valueOf(69));
        }
        if (!((ab5.j) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.j5.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(71));
        }
        if (!((l41.b2) ((j41.y) i95.n0.c(j41.y.class))).wi()) {
            hashSet.add(java.lang.String.valueOf(74));
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_b4af18eac3d5", true).r2()) {
            hashSet.add(java.lang.String.valueOf(73));
        }
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n("gh_e087bb5b95e6", true).r2()) {
            hashSet.add(java.lang.String.valueOf(76));
        }
        if (mo168058x74219ae7 || ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).bj()) {
            hashSet.add(java.lang.String.valueOf(79));
            hashSet.add(java.lang.String.valueOf(80));
            hashSet.add(java.lang.String.valueOf(28));
        }
        if (((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Vi() || !((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Bi()) {
            hashSet.add(java.lang.String.valueOf(18));
        }
        if (c01.z1.x()) {
            hashSet.add(java.lang.String.valueOf(27));
        }
        if (((bw.k) i95.n0.c(bw.k.class)) == null || !zv.q.f557612a.f()) {
            hashSet.add(java.lang.String.valueOf(88));
        }
        if (mo168058x74219ae7) {
            hashSet.add(java.lang.String.valueOf(78));
        }
        hashSet.add("1@fackuser");
        java.util.Iterator it = ((java.util.HashSet) ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri()).iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true).r2()) {
                hashSet.add(str);
            }
        }
        q(hashSet);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void g() {
        boolean z17 = this.f219688t;
        g23.k kVar = this.f219686r;
        if (!z17) {
            this.f219688t = true;
            if (!this.f219684J) {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.n(this.f219583g, false, s(), 0, kVar);
            }
        }
        if (!this.f219687s) {
            this.f219687s = true;
            kVar.L = z13.f.Y6(h()).b7();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.l(kVar);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.i(kVar);
        }
        kVar.e();
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g gVar, boolean z17) {
        java.util.Iterator it = this.f219685q.iterator();
        while (it.hasNext() && !(z17 = ((t13.k) it.next()).a(view, gVar, z17))) {
        }
        boolean z18 = this.f219688t;
        g23.k kVar = this.f219686r;
        if (!z18 && !(gVar instanceof e23.s0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.n(this.f219583g, true, s(), 0, kVar);
            this.f219688t = true;
        }
        if (gVar.f505305o) {
            kVar.b(gVar);
            kVar.L = z13.f.Y6(h()).b7();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f(gVar, kVar);
            return true;
        }
        if (gVar instanceof e23.x) {
            this.f219684J = true;
            kVar.b(gVar);
            kVar.L = z13.f.Y6(h()).b7();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f(gVar, kVar);
        } else if (gVar instanceof e23.a0) {
            kVar.L = z13.f.Y6(h()).b7();
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.x2.f(gVar, kVar);
            kVar.b(gVar);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void m(android.content.Context context, u13.g gVar) {
        super.m(context, gVar);
        g23.k kVar = this.f219686r;
        kVar.getClass();
        int i17 = gVar.f505291a;
        if (i17 == -1 || i17 == 0 || i17 == 11) {
            return;
        }
        long c17 = c01.id.c();
        java.util.Iterator it = ((java.util.ArrayList) kVar.N).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p13.e eVar = (p13.e) it.next();
            if (eVar.f432607b == gVar.f505292b) {
                eVar.f432610e = c17 - kVar.f349470b;
                eVar.f432616k = c17;
                break;
            }
        }
        java.lang.String wi6 = ((w50.k) ((x50.j) i95.n0.c(x50.j.class))).wi(gVar);
        if (wi6 != "") {
            ((java.util.ArrayList) kVar.M).add(wi6);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        super.onScroll(absListView, i17, i18, i19);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2 activityC15607x502bbbb2 = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15607x502bbbb2) this.f219580d;
        activityC15607x502bbbb2.getClass();
        int headerViewsCount = ((android.widget.ListView) absListView).getHeaderViewsCount();
        if (activityC15607x502bbbb2.V1 == 1 && absListView.getLastVisiblePosition() >= activityC15607x502bbbb2.L1.getCount() + headerViewsCount && activityC15607x502bbbb2.L1.I && activityC15607x502bbbb2.N1.getVisibility() == 0) {
            activityC15607x502bbbb2.V1 = 2;
            g23.k kVar = activityC15607x502bbbb2.L1.f219686r;
            kVar.getClass();
            long c17 = c01.id.c();
            java.util.Iterator it = ((java.util.ArrayList) kVar.N).iterator();
            while (it.hasNext()) {
                p13.e eVar = (p13.e) it.next();
                if ("SearchContactBar".equals(eVar.f432612g)) {
                    eVar.f432610e = c17 - kVar.f349470b;
                    eVar.f432616k = c17;
                }
            }
        }
        activityC15607x502bbbb2.m67437x4bd5310().B3(new fi0.g(activityC15607x502bbbb2.b7(), o13.p.f423784d, absListView));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        super.onScrollStateChanged(absListView, i17);
        if (i17 == 2) {
            this.E = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).G();
        } else {
            this.E = false;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.F;
            n3Var.mo50303x856b99f0(1);
            n3Var.mo50307xb9e94560(1, 200L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void p() {
        this.F.mo50303x856b99f0(1);
        super.p();
    }

    public final void q(java.util.HashSet hashSet) {
        int i17 = this.H + 1;
        this.H = i17;
        java.util.List list = this.f219685q;
        if (i17 < ((java.util.LinkedList) list).size()) {
            t13.k kVar = (t13.k) ((java.util.LinkedList) list).get(this.H);
            if (kVar.mo9548xfb85f7b0() == 32) {
                ((j23.i) kVar).f378806p = this.f219586m.f219619c;
            }
            kVar.f(this.f219583g, this.G, hashSet, o13.p.f423784d);
        }
    }

    public java.lang.String r(int i17) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            z13.f.Y6(h()).U6(jSONObject2);
            jSONObject.put("intention", this.f219686r.H ? 1 : 2);
            jSONObject.put("sectionpos", i17);
            jSONObject.put("uistyle", jSONObject2.optInt("uiStyle", 0));
            jSONObject.put("isfromvoice", jSONObject2.optInt("isFromVoice", 0));
            jSONObject.put("changeReason", jSONObject2.optInt("changeReason", 0));
            jSONObject.put("isaskrealpeople", jSONObject2.optInt("isAskRealPeople", 0));
            jSONObject.put("isdeepthink", jSONObject2.optInt("isDeepThink", 0));
            jSONObject.put("actiontype", jSONObject2.optInt("actionType", 0));
            return fp.s0.b(jSONObject.toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSMainAdapter", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public int s() {
        java.util.Iterator it = this.f219685q.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((t13.k) it.next()).e();
        }
        return i17;
    }

    public void t(boolean z17, boolean z18) {
        if (h() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) {
            j75.f m67437x4bd5310 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0) h()).m67437x4bd5310();
            java.lang.String str = this.f219583g;
            g23.k kVar = this.f219686r;
            m67437x4bd5310.B3(new fi0.a(str, kVar.B, kVar.H, z17, z18, this.f219586m.f219617a));
        }
    }
}

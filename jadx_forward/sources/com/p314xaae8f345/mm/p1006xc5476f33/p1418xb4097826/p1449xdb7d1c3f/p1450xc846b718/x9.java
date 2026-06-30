package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class x9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2 {
    public int A;
    public boolean B;
    public int C;
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb D;
    public final java.util.concurrent.CopyOnWriteArraySet E;
    public final java.util.List F;
    public final java.util.concurrent.ConcurrentHashMap G;

    /* renamed from: m, reason: collision with root package name */
    public final zy2.ba f187540m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na f187541n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f187542o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a2 f187543p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.oa f187544q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 f187545r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f187546s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f187547t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f187548u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f187549v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f187550w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f187551x;

    /* renamed from: y, reason: collision with root package name */
    public long f187552y;

    /* renamed from: z, reason: collision with root package name */
    public long f187553z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(zy2.ba storage) {
        super(storage);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        this.f187540m = storage;
        this.f187541n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na(this);
        this.f187542o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.q9(this));
        this.f187543p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a2(this);
        this.f187544q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.oa();
        this.f187546s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v9(this));
        this.f187547t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p9(this));
        this.f187548u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.m9(this));
        this.f187549v = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.s9.f187395d);
        this.f187550w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e9(this));
        this.f187551x = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.r9.f187341d);
        this.E = new java.util.concurrent.CopyOnWriteArraySet();
        this.F = kz5.c0.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h9.f187089d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i9.f187130d);
        this.G = new java.util.concurrent.ConcurrentHashMap();
    }

    public static boolean l1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 x9Var, r45.vs2 vs2Var, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z19 = (i17 & 4) != 0 ? true : z17;
        boolean z27 = (i17 & 8) != 0 ? false : z18;
        x9Var.getClass();
        java.util.LinkedList show_infos = vs2Var.f470022g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos, "show_infos");
        java.util.Iterator it = show_infos.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) obj2).f455425i, str)) {
                break;
            }
        }
        r45.f03 f03Var = (r45.f03) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleShowInfoForAppPush removeShowInfo path:");
        sb6.append(str);
        sb6.append(" isIgnoreDependency:");
        sb6.append(z19);
        sb6.append(" ignoreFreqLimit:");
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f455432s) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
        if (f03Var != null && f03Var.f455432s == 1) {
            return false;
        }
        if (f03Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a, vs2Var, f03Var, 2, null, 1L, 8, null);
            if (z27) {
                java.util.LinkedList<r45.f03> show_infos2 = vs2Var.f470022g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(show_infos2, "show_infos");
                for (r45.f03 f03Var2 : show_infos2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f03Var2);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.m(x2Var, vs2Var, f03Var2, 2, null, 1L, 8, null);
                }
            }
        }
        return hc2.u0.g(vs2Var, str, z19) != null;
    }

    @Override // zy2.ia
    public org.json.JSONObject A(r45.vs2 ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        return hc2.u0.a(ctrInfo);
    }

    @Override // zy2.ia
    public jz5.l A0(r45.vs2 ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        java.util.LinkedList linkedList = ctrlInfo.f470022g;
        if (linkedList == null) {
            return null;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.f03) it.next()).f455425i, "FinderEntrance")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(this, "FinderEntrance", hc2.u0.b(ctrlInfo), false, false, 12, null);
                if (S0 != null) {
                    return new jz5.l(S0, S0.I0("FinderEntrance"));
                }
                return null;
            }
        }
        return null;
    }

    @Override // zy2.ia
    public void B(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1 i18 = i1();
        r45.vs2 vs2Var = new r45.vs2();
        java.util.LinkedList linkedList = vs2Var.f470022g;
        r45.f03 f03Var = new r45.f03();
        f03Var.f455421e = i17;
        f03Var.f455425i = "finder_wx_private_msg_entrance";
        linkedList.add(f03Var);
        i18.k(vs2Var);
    }

    @Override // zy2.ia
    public java.util.List C(java.lang.String source, java.lang.String path, yz5.l filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List n17 = h1().n(path, g92.b.f351302e.T0(), false, false);
        synchronized (n17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : n17) {
                if (((java.lang.Boolean) filter.mo146xb9724478(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) it.next();
                F(jbVar.f65874xb5f7102a, source);
                boolean L = L(jbVar);
                if (L) {
                    linkedList.add(jbVar);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", source + " [revokeRedDot] " + jbVar + ",ret=" + L);
            }
        }
        return linkedList;
    }

    @Override // zy2.ia
    public boolean C0() {
        ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).getClass();
        return (c01.z1.h() & 8192) != 8192;
    }

    @Override // zy2.ia
    public void D0(r45.ts2 redDot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDot, "redDot");
        long c17 = c01.id.c() - gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.vs2 vs2Var = (r45.vs2) redDot.m75936x14adae67(1);
        if (vs2Var != null) {
            arrayList.add(vs2Var);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(redDot.m75941xfb821914(2), "getCtrl_info_list(...)");
        if (!r5.isEmpty()) {
            arrayList.addAll(redDot.m75941xfb821914(2));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<r45.vs2> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (hashSet.add(((r45.vs2) obj).f470036x)) {
                arrayList2.add(obj);
            }
        }
        for (r45.vs2 vs2Var2 : arrayList2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyRedDot] overFreq=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.qb qbVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.qb.f187325a;
            sb6.append(c17 >= qbVar.m());
            sb6.append(' ');
            sb6.append(hc2.u0.e(vs2Var2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
            if (!hc2.u0.c(vs2Var2) && c17 < qbVar.m()) {
                hc2.u0.f(vs2Var2, false, 1, null);
                java.util.LinkedList linkedList = vs2Var2.f470022g;
                if (linkedList != null) {
                    pm0.v.d0(linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t9.f187411d);
                }
            }
            r45.vs2 vs2Var3 = (r45.vs2) redDot.m75936x14adae67(1);
            int i17 = vs2Var3 != null ? vs2Var3.f470020e : 0;
            if (hc2.u0.c(vs2Var2) || !(i17 == 2 || i17 == 1 || i17 == 29)) {
                zy2.fa.D(this, vs2Var2, "notifyRedDot", null, true, null, 20, null);
            } else {
                i1().k(vs2Var2);
            }
        }
    }

    @Override // zy2.ia
    public boolean E() {
        return ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).Ai();
    }

    @Override // zy2.ia
    public void F(r45.vs2 vs2Var, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (vs2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb();
            jbVar.t0(vs2Var);
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.a(jbVar.T0());
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.G;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8 z8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8) concurrentHashMap.get(a17);
            if (z8Var != null) {
                if (!(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z8Var.f187607b, vs2Var.f470023h) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "notifyTabTip"))) {
                    z8Var = null;
                }
                if (z8Var != null) {
                    concurrentHashMap.remove(a17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[clearEnterTabTipsExtInfo] PATH=" + a17 + " tips_id=" + vs2Var.f470023h + " source=" + source);
                }
            }
        }
    }

    @Override // zy2.la
    public void F0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e3 e3Var) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).K(z17, e3Var);
    }

    @Override // zy2.ia
    public int G() {
        return this.C;
    }

    @Override // zy2.ia
    public java.lang.String G0(int i17) {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.a(i17);
    }

    @Override // zy2.ia
    public void H() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        java.lang.Object obj;
        java.util.Map x17 = h1().x();
        for (java.lang.String str : kz5.n0.S0(x17.keySet())) {
            java.util.List list = (java.util.List) x17.get(str);
            r45.f03 f03Var = null;
            if (list != null) {
                java.util.ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj).I0(str) != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj;
            } else {
                jbVar = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a, "resetNotifyAllPathWithCrlInfo", false, str, jbVar != null ? jbVar.I0(str) : null, jbVar, null, p(str, jbVar), 32, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            if (jbVar != null) {
                f03Var = jbVar.I0(str);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.l(x2Var, jbVar, f03Var, 11, null, 0L, 24, null);
        }
    }

    @Override // zy2.ia
    public void H0(int i17, int i18, int i19, int i27, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        i1().j(i17, i18, i19, i27, username);
    }

    @Override // zy2.ia
    public void I(boolean z17) {
        if (!z17) {
            nc2.g.f417641a.d("#setEnableShowEntranceRedDot");
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_NEAR_BY_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }

    @Override // zy2.fa
    public r45.f03 I0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return b0(path, g92.b.f351302e.T0());
    }

    @Override // zy2.ia
    public void J(java.lang.String source, java.util.LinkedList revokeList) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revokeList, "revokeList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" [revokeFinderPopup] ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(revokeList, 10));
        java.util.Iterator it = revokeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.at5) it.next()).m75945x2fec8307(0));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
        java.util.Iterator it6 = revokeList.iterator();
        while (it6.hasNext()) {
            r45.at5 at5Var = (r45.at5) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c17 = c(at5Var.m75945x2fec8307(0));
            if (c17 != null) {
                boolean L = L(c17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[revokeFinderPopup] ret=" + L + " revokeId=" + at5Var.m75945x2fec8307(0) + " removeRedDot=" + c17);
                if (L) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    int m55856xfb85f7b0 = c17.m55856xfb85f7b0();
                    java.lang.String str = c17.f65880x11c19d58;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String m75945x2fec8307 = at5Var.m75945x2fec8307(0);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    o3Var.vj(m55856xfb85f7b0, str, m75945x2fec8307, 1);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    int m55856xfb85f7b02 = c17.m55856xfb85f7b0();
                    java.lang.String str2 = c17.f65880x11c19d58;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String m75945x2fec83072 = at5Var.m75945x2fec8307(0);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    o3Var2.vj(m55856xfb85f7b02, str2, m75945x2fec83072, 0);
                }
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotManagerV1", "[revokeFinderPopup] " + at5Var.m75945x2fec8307(0) + " no found.");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f187549v).mo141623x754a37bb();
                java.lang.String m75945x2fec83073 = at5Var.m75945x2fec8307(0);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                concurrentHashMap.put(m75945x2fec83073, at5Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                java.lang.String m75945x2fec83074 = at5Var.m75945x2fec8307(0);
                if (m75945x2fec83074 == null) {
                    m75945x2fec83074 = "";
                }
                o3Var3.vj(0, "", m75945x2fec83074, 0);
            }
        }
    }

    @Override // zy2.ia
    public void K(r45.c21 entranceRedDot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entranceRedDot, "entranceRedDot");
        r45.vs2 vs2Var = (r45.vs2) entranceRedDot.m75936x14adae67(0);
        if (vs2Var == null || hc2.u0.c(vs2Var)) {
            return;
        }
        i1().k(vs2Var);
    }

    @Override // zy2.fa
    public boolean L(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi() && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.f3.a(java.lang.Integer.valueOf(ctrInfo.m55856xfb85f7b0()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[clearCtrlInfo] 青少年模式且只看关注的模式下只delete关注的红点展示");
            return false;
        }
        java.util.HashSet s17 = h1().s(ctrInfo);
        java.lang.String str = ctrInfo.f65883xdec927b;
        if (str == null) {
            str = "";
        }
        o1("clearCtrlInfo", s17, str, null, null);
        java.lang.String str2 = ctrInfo.f65874xb5f7102a.f470023h;
        boolean z17 = !(str2 == null || str2.length() == 0);
        if (z17) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) a17).W6(ctrInfo, false);
        }
        return z17;
    }

    @Override // zy2.fa
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return zy2.ia.S0(this, path, g92.b.f351302e.T0(), false, false, 12, null);
    }

    @Override // zy2.la
    public void M0(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.U0() && j1() && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di(activity)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = L0("FinderEntrance");
            r45.f03 I0 = L0 != null ? L0.I0("FinderEntrance") : null;
            if (L0 != null && I0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.h(x2Var, "2", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 1, 0, null, 0, 1, null, 0, null, 7616, null);
            }
        }
        int Q6 = ((ey2.t0) pf5.u.f435469a.e(c61.l7.class).a(ey2.t0.class)).Q6();
        boolean z17 = activity.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
        if (!z17 && j1()) {
            N("FinderEntrance");
            N("FinderMentionEntrance");
            N("Discovery");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e2.f187019a = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e2.f187020b = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e2.f187021c = "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[exitFinderBefore] isSourceFromShareToTimeline=" + z17 + " needClearRedDotWhenEnter=" + j1() + ", tabType=" + Q6);
    }

    @Override // zy2.fa
    public java.util.Set N(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return T0(path, null);
    }

    @Override // zy2.fa
    public java.util.concurrent.CopyOnWriteArraySet N0() {
        return this.E;
    }

    @Override // zy2.ia
    public java.util.Set O(java.lang.String path, int[] iArr, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return zy2.ia.E0(this, path, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.f9(iArr), false, username, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0275  */
    @Override // zy2.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set P(java.lang.String r28, r45.tt2 r29, java.util.LinkedList r30) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9.P(java.lang.String, r45.tt2, java.util.LinkedList):java.util.Set");
    }

    @Override // zy2.ia
    public r45.xs2 Q(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8 z8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8) this.G.get(path);
        if (z8Var != null) {
            return z8Var.f187606a;
        }
        return null;
    }

    @Override // zy2.la
    public void Q0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5893x481fedbf event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).J(event);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c4 a17 = a1();
        synchronized (a17) {
            a17.d(event);
        }
    }

    @Override // zy2.ia
    public void R(boolean z17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Lj(1, z17 ? 1 : 2);
    }

    @Override // zy2.ia
    public int R0() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = L0("FinderEntrance");
        if ((L0 != null ? L0.I0("FinderEntrance") : null) == null) {
            return 0;
        }
        int m75939xb282bd08 = L0.N.m75939xb282bd08(13);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[getAliveTabType] cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms enterAction :" + m75939xb282bd08);
        return m75939xb282bd08;
    }

    @Override // zy2.ia
    public zy2.z8 S() {
        return i1();
    }

    @Override // zy2.ia
    public void T(java.lang.String path, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.t) ((jz5.n) this.f187548u).mo141623x754a37bb();
        tVar.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.s(tVar, path, username));
    }

    @Override // zy2.ia
    public java.util.Set T0(java.lang.String path, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return O(path, iArr, g92.b.f351302e.T0());
    }

    @Override // zy2.la
    public void U(r45.at2 at2Var) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).P(at2Var);
    }

    @Override // zy2.ia
    public int U0(java.lang.String path) {
        int Z0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = L0(path);
        if (L0 == null) {
            return 0;
        }
        if (L0.P0()) {
            synchronized (L0) {
                Z0 = L0.Z0(path);
            }
        } else {
            Z0 = L0.Z0(path);
        }
        h1().r(L0);
        return Z0;
    }

    @Override // zy2.la
    public void V() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "onFinderHomeTaskBackground:");
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // zy2.ia
    public java.lang.String V0(java.lang.String path) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8 z8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8) this.G.get(path);
        return (z8Var == null || (str = z8Var.f187607b) == null) ? "" : str;
    }

    @Override // zy2.ia
    public java.util.Set W() {
        return h1().u();
    }

    @Override // zy2.ia
    public int W0() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).z();
    }

    @Override // zy2.ia
    public java.util.Set X(java.lang.String path, yz5.l call, boolean z17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb i17 = i(path, username, false, false);
        r45.f03 I0 = i17 != null ? i17.I0(path) : null;
        java.util.HashSet p17 = p1("disposeRedDotAtPath", path, call, z17, username);
        o1("", p17, username, i17, I0);
        return p17;
    }

    @Override // zy2.la
    public void Z() {
    }

    @Override // zy2.fa
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb a(java.lang.String path, java.lang.String tipsUuid, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsUuid, "tipsUuid");
        return h1().a(path, tipsUuid, z17, z18);
    }

    @Override // zy2.ia
    public void a0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb enterCtrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterCtrlInfo, "enterCtrlInfo");
        int T0 = enterCtrlInfo.T0();
        java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.a(T0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[saveEnterTabTipsExtInfo] tabType=");
        sb6.append(T0);
        sb6.append(" PATH=");
        sb6.append(a17);
        sb6.append(" ctrlType=");
        sb6.append(enterCtrlInfo.m55856xfb85f7b0());
        sb6.append(" feedId=");
        r45.xs2 xs2Var = enterCtrlInfo.N;
        sb6.append(pm0.v.u(xs2Var.m75942xfb822ef2(3)));
        sb6.append("bubbleId=");
        r45.bz2 bz2Var = (r45.bz2) xs2Var.m75936x14adae67(23);
        sb6.append(pm0.v.u(bz2Var != null ? bz2Var.f452703g : 0L));
        sb6.append(" showBubbleType=");
        r45.bz2 bz2Var2 = (r45.bz2) xs2Var.m75936x14adae67(23);
        java.lang.String str = null;
        sb6.append(bz2Var2 != null ? java.lang.Integer.valueOf(bz2Var2.f452700d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.G;
        java.lang.String field_tipsId = enterCtrlInfo.f65880x11c19d58;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tipsId, "field_tipsId");
        concurrentHashMap.put(a17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8(xs2Var, field_tipsId));
        r45.bz2 bz2Var3 = (r45.bz2) xs2Var.m75936x14adae67(23);
        pf5.u uVar = pf5.u.f435469a;
        if (bz2Var3 != null) {
            if (!(bz2Var3.f452700d > 0)) {
                bz2Var3 = null;
            }
            if (bz2Var3 != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(bz2Var3.f452700d);
                if (valueOf != null) {
                    valueOf.intValue();
                    r45.ox2 a18 = r45.ox2.a(valueOf.intValue());
                    if (a18 != null) {
                        int ordinal = a18.ordinal();
                        if (ordinal == 0) {
                            str = "finder_tl_city_tab";
                        } else if (ordinal != 1) {
                            if (ordinal == 2) {
                                str = "TLRecommendTab";
                            } else if (ordinal == 3) {
                                str = "TLFollow";
                            } else if (ordinal == 4) {
                                str = "TLPersonalCenter";
                            }
                        }
                    }
                }
                if (str == null) {
                    str = "";
                }
                r45.xs2 xs2Var2 = new r45.xs2();
                xs2Var2.set(3, java.lang.Long.valueOf(bz2Var3.f452703g));
                java.lang.String m75945x2fec8307 = xs2Var.m75945x2fec8307(1);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                xs2Var2.set(1, m75945x2fec8307);
                xs2Var2.set(7, xs2Var.m75934xbce7f2f(7));
                java.lang.String field_tipsId2 = enterCtrlInfo.f65880x11c19d58;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tipsId2, "field_tipsId");
                concurrentHashMap.put(str, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8(xs2Var2, field_tipsId2));
                p012xc85e97e9.p093xedfae76a.c1 a19 = uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
                bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) a19).R6(bz2Var3.f452700d == 1 ? 1 : 3);
                if (R6 != null) {
                    R6.e(true, "BubbleShow");
                }
            }
        }
        if (enterCtrlInfo.f65875xb5fc3ab6 == 26) {
            p012xc85e97e9.p093xedfae76a.c1 a27 = uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a27, "get(...)");
            bs2.n1 R62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) a27).R6(T0);
            if (R62 != null) {
                R62.e(true, "sns_delivery");
            }
        }
    }

    @Override // zy2.ia
    public boolean b(java.lang.String path, java.util.List ctrlTypeList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlTypeList, "ctrlTypeList");
        return h1().b(path, ctrlTypeList);
    }

    @Override // zy2.ia
    public r45.f03 b0(java.lang.String path, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(this, path, str, false, false, 12, null);
        if (S0 != null) {
            return S0.I0(path);
        }
        return null;
    }

    @Override // zy2.fa
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c(java.lang.String str) {
        return h1().c(str);
    }

    @Override // zy2.ia
    public void c0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "onFinderInitSuccessfully...");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na naVar = this.f187541n;
        naVar.c();
        naVar.b();
        i1().m();
    }

    @Override // zy2.la
    public java.util.HashMap d(java.lang.String username, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return h1().d(username, list);
    }

    @Override // zy2.ia
    public void d0(r45.qk2 finderNotice) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderNotice, "finderNotice");
        zy2.fa.D(this, (r45.vs2) finderNotice.m75936x14adae67(1), "notifyNotice", null, true, null, 20, null);
    }

    @Override // zy2.fa
    public boolean e(int i17, java.lang.String username, yz5.l filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        o1("clearCtrlInfo", h1().e(i17, username, filter), username, null, null);
        return !r8.isEmpty();
    }

    @Override // zy2.la
    public zy2.ga e0() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va h17 = h1();
        if (h17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8) h17;
        }
        return null;
    }

    @Override // zy2.ia
    public java.util.LinkedList f(int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return h1().f(i17, username);
    }

    @Override // zy2.ia
    public boolean f0() {
        return ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).wi();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f1(java.lang.String r29, r45.vs2 r30) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9.f1(java.lang.String, r45.vs2):com.tencent.mm.plugin.finder.extension.reddot.jb");
    }

    @Override // zy2.fa
    public void g(java.lang.String groupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        h1().g(groupId);
    }

    @Override // zy2.fa
    public void g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb info, java.lang.String path, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.HashSet hashSet = new java.util.HashSet();
        r45.f03 I0 = info.I0(path);
        hashSet.addAll(h1().m("clearShowInfoAtCtrlInfo", info, path, z17, str == null ? "" : str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j9.f187150d));
        h1().t(path, info);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[clearShowInfoAtCtrlInfo] path=" + path + " tipsId=" + info.f65880x11c19d58 + " removePathSet=" + hashSet + " , maybeRemoveShowInfo=" + hc2.z0.b(I0, 0));
        java.lang.String field_username = info.f65883xdec927b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_username, "field_username");
        o1("clearShowInfoAtCtrlInfo", hashSet, field_username, info, I0);
    }

    public final java.util.List g1(java.lang.String tag, java.util.List list, java.lang.String checkPath, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkPath, "checkPath");
        if ((list == null || list.isEmpty()) || !z18 || !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).m()) {
            return list;
        }
        java.util.HashMap d17 = d(g92.b.f351302e.T0(), z17 ? kz5.b0.c(checkPath) : null);
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).E(tag, checkPath, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj, d17)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // zy2.fa
    public boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo, java.lang.String path, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return h1().h(ctrlInfo, path, j17, z17);
    }

    @Override // zy2.ia
    public boolean h0(int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e r07 = r0(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[containsTabTipsExtInfo] tabType=");
        sb6.append(i17);
        sb6.append(" isContains=");
        sb6.append(r07.m75939xb282bd08(2) != 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
        return r07.m75939xb282bd08(2) != 0;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va h1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va) ((jz5.n) this.f187550w).mo141623x754a37bb();
    }

    @Override // zy2.ia
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb i(java.lang.String path, java.lang.String str, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        return h1().i(path, str, z17, z18);
    }

    @Override // zy2.fa
    public java.util.HashMap i0(java.lang.String path, java.lang.String prefix, java.lang.String suffix, java.lang.String localConfig) {
        java.lang.String str;
        java.lang.Object opt;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suffix, "suffix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localConfig, "localConfig");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = L0(path);
        if (L0 == null) {
            return hashMap;
        }
        r45.f03 I0 = L0.I0(path);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e c19795xce8b809e = L0.f65881x115e537f;
        org.json.JSONObject v07 = L0.v0();
        java.lang.String field_tipsId = L0.f65880x11c19d58;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tipsId, "field_tipsId");
        hashMap.put(prefix + "tipsid" + suffix, field_tipsId);
        hashMap.put(prefix + "ctrltype" + suffix, java.lang.Integer.valueOf(L0.f65875xb5fc3ab6));
        java.lang.String str2 = prefix + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714 + suffix;
        if (I0 == null || (str = I0.f455425i) == null) {
            str = "";
        }
        hashMap.put(str2, str);
        hashMap.put(prefix + "feedid" + suffix, pm0.v.u(c19795xce8b809e.m75942xfb822ef2(0)));
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_reddot_ext_report_params, "", true);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            localConfig = localConfig + Zi;
        }
        java.util.List<java.lang.String> f07 = r26.n0.f0(localConfig, new java.lang.String[]{";"}, false, 0, 6, null);
        if (!f07.isEmpty()) {
            for (java.lang.String str3 : f07) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) && (opt = v07.opt(str3)) != null) {
                    hashMap.put(prefix + str3 + suffix, opt);
                }
            }
        }
        return hashMap;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1 i1() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e1) ((jz5.n) this.f187542o).mo141623x754a37bb();
    }

    @Override // zy2.la
    public void j() {
        h1().j();
    }

    @Override // zy2.ia
    public zy2.ma j0() {
        return this.f187541n;
    }

    public final boolean j1() {
        return ((java.lang.Boolean) ((jz5.n) this.f187551x).mo141623x754a37bb()).booleanValue();
    }

    @Override // zy2.ia
    public void k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 swipeView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(swipeView, "swipeView");
        h1().k(swipeView, i17);
    }

    @Override // zy2.la
    public void k0() {
        kc2.g1 b17 = b1();
        if (b17 != null) {
            com.p314xaae8f345.mm.app.w.INSTANCE.p((kc2.r) ((jz5.n) b17.f387913d).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var = this.f187545r;
        if (w3Var != null) {
            com.p314xaae8f345.mm.app.w.INSTANCE.p(w3Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.oa oaVar = this.f187544q;
        oaVar.f187287b.mo48814x2efc64();
        oaVar.f187288c.mo48814x2efc64();
    }

    public final void k1(java.lang.String str, int i17, java.lang.String str2) {
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb> n17 = h1().n("Discovery", str2, true, true);
        synchronized (n17) {
            z17 = false;
            z18 = false;
            z19 = false;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : n17) {
                if (!jbVar.y0(str)) {
                    z18 = true;
                } else if (jbVar.f65874xb5f7102a.f470019d <= i17) {
                    z19 = true;
                }
            }
        }
        if (z18 && z19) {
            synchronized (n17) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 : n17) {
                    if (jbVar2.y0(str)) {
                        zy2.fa.J0(this, jbVar2, "Discovery", true, null, 8, null);
                    }
                }
            }
        } else {
            z17 = z19;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "handleClearDiscoveryRedDot isClear:" + z17 + ", hasOtherPath:" + z18 + ", ctrlInfoByPath:" + n17 + ", path:" + str);
        if (z17) {
            X("Discovery", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.n9.f187261d, true, str2);
        }
    }

    @Override // zy2.ia
    public void l(boolean z17, java.lang.String path, zy2.na dslRenderInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dslRenderInfo, "dslRenderInfo");
        a1().b(z17, path, dslRenderInfo);
    }

    @Override // zy2.ia
    public boolean l0(r45.d33 wxMention) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxMention, "wxMention");
        i1().l(wxMention);
        return true;
    }

    @Override // zy2.ia
    public void m(int i17, int i18, int i19, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        i1().i(i17, i18, i19, username);
    }

    @Override // zy2.ia
    public boolean m0(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = L0(path);
        if (L0 == null) {
            return false;
        }
        boolean u07 = L0.u0(path);
        h1().r(L0);
        return u07;
    }

    public final void m1(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        for (jz5.l lVar : h1().q(source, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.o9(this, source))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) lVar.f384366d;
            java.util.Set set = (java.util.Set) lVar.f384367e;
            r45.vs2 field_ctrInfo = jbVar.f65874xb5f7102a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_ctrInfo, "field_ctrInfo");
            n1(hc2.u0.b(field_ctrInfo), source, set);
            h1().w(jbVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
    
        if ((r13 != null ? r13.I0("finder_tl_city_tab") : null) != null) goto L26;
     */
    @Override // zy2.la
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9.n(int, boolean):void");
    }

    public final void n1(java.lang.String str, java.lang.String str2, java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = str.length() == 0 ? zy2.ia.S0(this, str3, g92.b.f351302e.T0(), false, false, 12, null) : zy2.ia.S0(this, str3, str, false, false, 12, null);
            r45.f03 I0 = S0 != null ? S0.I0(str3) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyRedDotAdd] source=");
            sb6.append(str2);
            sb6.append(' ');
            sb6.append(S0 != null ? S0.f65880x11c19d58 : null);
            sb6.append(" ,path:");
            sb6.append(I0 != null ? I0.f455425i : null);
            sb6.append('(');
            sb6.append(str3);
            sb6.append(") businessType=");
            sb6.append(S0 != null ? java.lang.Integer.valueOf(S0.f65873xe412923f) : null);
            sb6.append(" count:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f455421e) : null);
            sb6.append(" clearType:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f455424h) : null);
            sb6.append(" parent:");
            sb6.append(I0 != null ? I0.f455426m : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
            if (S0 != null && I0 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a, "buildPathWithCtrInfo", true, str3, I0, S0, null, p(str3, S0), 32, null);
            }
        }
    }

    @Override // zy2.ia
    public void o(r45.vt2 revoke) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(revoke, "revoke");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[revokeTabTips] ");
        java.util.LinkedList m75941xfb821914 = revoke.m75941xfb821914(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRevoke_tab_tips_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.wt2) it.next()).m75945x2fec8307(0));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb6.toString());
        pm0.v.O("Finder.RedDotManagerV1", new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w9(revoke, this));
    }

    @Override // zy2.ia
    public void o0(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        Z0().c(source, ctrlInfo);
    }

    public final void o1(java.lang.String str, java.util.HashSet hashSet, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2;
        jz5.f0 f0Var;
        r45.vs2 vs2Var;
        java.lang.String str4;
        r45.vs2 vs2Var2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        r45.vs2 vs2Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 = jbVar;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str8 = (java.lang.String) it.next();
            boolean p17 = p(str8, jbVar3);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(this, str8, str2, false, false, 12, null);
            if (S0 != null) {
                r45.f03 I0 = S0.I0(str8);
                if (I0 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    java.lang.String str9 = str + " disposeRedDotAtPath_show";
                    if (jbVar3 == null || (vs2Var3 = jbVar3.f65874xb5f7102a) == null || (str6 = vs2Var3.f470029q) == null) {
                        str6 = str2;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
                    str3 = str8;
                    jbVar2 = jbVar3;
                    aaVar.a(str9, false, str8, f03Var, jbVar, str6, p17);
                    java.lang.String str10 = str + " disposeRedDotAtPath_show";
                    r45.vs2 vs2Var4 = S0.f65874xb5f7102a;
                    java.lang.String str11 = (vs2Var4 == null || (str7 = vs2Var4.f470029q) == null) ? str2 : str7;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str11);
                    aaVar.a(str10, true, str3, I0, S0, str11, p(str3, S0));
                } else {
                    str3 = str8;
                    jbVar2 = jbVar3;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                    java.lang.String str12 = str + " disposeRedDotAtPath";
                    java.lang.String str13 = (jbVar2 == null || (vs2Var2 = jbVar2.f65874xb5f7102a) == null || (str5 = vs2Var2.f470029q) == null) ? str2 : str5;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str13);
                    aaVar2.a(str12, false, str3, f03Var, jbVar, str13, p17);
                }
                f0Var = jz5.f0.f384359a;
            } else {
                str3 = str8;
                jbVar2 = jbVar3;
                f0Var = null;
            }
            if (f0Var == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa aaVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186886a;
                java.lang.String str14 = str + " disposeRedDotAtPath_null";
                java.lang.String str15 = (jbVar2 == null || (vs2Var = jbVar2.f65874xb5f7102a) == null || (str4 = vs2Var.f470029q) == null) ? str2 : str4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str15);
                aaVar3.a(str14, false, str3, f03Var, jbVar, str15, p17);
            }
            jbVar3 = jbVar2;
        }
    }

    @Override // zy2.fa
    public boolean p(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).C(str, jbVar);
    }

    @Override // zy2.la
    public void p0() {
        this.f187552y = c01.id.c() - this.f187553z;
        Z0().f187578b = false;
        if (this.B && this.A == 2 && this.f187552y <= ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderFastEnterTime", 0) * 1000) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0) + 1;
            if (r17 > 3) {
                r17 = 3;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotManagerV1", "[exitFinder] current fastLevel=" + r17);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, java.lang.Integer.valueOf(r17));
        } else if (this.f187552y > ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderFastEnterTime", 0) * 1000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotManagerV1", "[exitFinder] revert fastLevel=0");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0);
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    public final java.util.HashSet p1(java.lang.String str, java.lang.String str2, yz5.l lVar, boolean z17, java.lang.String str3) {
        java.lang.Object obj;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(str2);
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : h1().n(str2, str3, false, false)) {
            java.util.Iterator it = this.F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((java.lang.Boolean) ((yz5.l) obj).mo146xb9724478(jbVar)).booleanValue()) {
                    break;
                }
            }
            if (((yz5.l) obj) == null) {
                hashSet.addAll(h1().m(str, jbVar, str2, z17, str3, lVar));
            }
        }
        return hashSet;
    }

    @Override // zy2.la
    /* renamed from: prepare */
    public void mo55799xed060d07() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotManagerV1", "[prepare] not main process!");
            return;
        }
        kc2.g1 b17 = b1();
        if (b17 != null) {
            b17.k().mo50293x3498a0(new kc2.x0(b17));
        }
        a1().c();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).L("Finder.RedDotManagerV1");
        m1("[prepare]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a2 a2Var = this.f187543p;
        a2Var.getClass();
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        gm0.j1.b().c();
        rn3.i.Ni().f479488h.f233932a.put("FinderNewTipsTransform", a2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na naVar = this.f187541n;
        naVar.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotTransform", "initPostRecordTemplateRedDotListener >> addListener");
        naVar.f187262a.N0().add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ma());
        zy2.fa.y0(this, 1005, null, null, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3(this);
        w3Var.f187493f.mo48813x58998cd();
        pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v3(w3Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.w3.a(w3Var, "setup", null, 0L, 6, null);
        com.p314xaae8f345.mm.app.w.INSTANCE.a(w3Var);
        this.f187545r = w3Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.oa oaVar = this.f187544q;
        oaVar.f187287b.mo48813x58998cd();
        oaVar.f187288c.mo48813x58998cd();
        i1().n();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u) ((jz5.n) this.f187508c).mo141623x754a37bb()).a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0().add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g3());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[prepare] " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms hashCode=" + hashCode());
        h1().v();
    }

    @Override // zy2.la
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3 actionType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        this.f187516k = false;
        kc2.g1 b17 = b1();
        if (b17 != null) {
            b17.b(false, actionType, null);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).j(actionType);
    }

    @Override // zy2.ia
    public r45.xs2 q0(java.lang.String path, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8 z8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z8) this.G.remove(path);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[clearEnterTabTipsExtInfo] path=" + path + " result=" + z8Var + " source=" + source);
        if (z8Var != null) {
            return z8Var.f187606a;
        }
        return null;
    }

    public final void q1(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a9 a9Var, java.util.HashSet hashSet) {
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a9 a9Var2 = a9Var;
        if (!(!hashSet.isEmpty()) || !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[buildPathWithCtrInfo] " + str + " disable simul expose check,changePath=" + hashSet + '!');
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jz5.l n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).n(sb6, true);
        if (n17 != null) {
            java.util.List list = (java.util.List) n17.f384366d;
            java.util.List<java.util.Map.Entry> list2 = (java.util.List) n17.f384367e;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(list);
            linkedList.addAll(list2);
            for (java.util.Map.Entry entry : list2) {
                boolean z17 = !hashSet.contains(entry.getKey());
                java.lang.String str4 = (java.lang.String) entry.getKey();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i4 i4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i4) entry.getValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar2 = i4Var.f187120a;
                if (a9Var2 != com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a9.f186883e || z17) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("expose_cnt", java.lang.Integer.valueOf(i4Var.f187122c));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.sb.a("red_dot_abandon_simul", jbVar2, hashMap);
                } else {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("expose_cnt", java.lang.Integer.valueOf(i4Var.f187122c));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.sb.a("red_dot_ban_when_rece_simul", jbVar2, hashMap2);
                }
                java.lang.String str5 = a9Var2 + "_buildPathWithCtrInfo_" + jbVar2.f65882x5364c75d;
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z2.f187576c.a(str4)) {
                    str2 = str5;
                    jbVar = jbVar2;
                    str3 = str4;
                    for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar3 : zy2.ia.Y(this, str5, str4, null, 4, null)) {
                        hashSet.removeAll(kz5.n0.X0(jbVar3.J0()));
                        o0(str2, jbVar3);
                    }
                } else {
                    str2 = str5;
                    str3 = str4;
                    r45.f03 I0 = jbVar2.I0(str3);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u9 u9Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.u9.f187446d;
                    g92.b bVar = g92.b.f351302e;
                    jbVar = jbVar2;
                    java.util.HashSet p17 = p1(str2, str3, u9Var, false, bVar.T0());
                    if (z17) {
                        sb6.append(" dispose " + str3 + "; removePathSet=" + p17 + ';');
                        o1(str2, p17, bVar.T0(), jbVar, I0);
                    } else {
                        sb6.append(" remove " + str3 + "; removePathSet=" + p17 + ';');
                        hashSet.remove(str3);
                    }
                }
                java.util.LinkedList linkedList2 = linkedList;
                java.util.List list3 = list;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).H(str2, str3, jbVar, linkedList2, list3);
                a9Var2 = a9Var;
                list = list3;
                linkedList = linkedList2;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[buildPathWithCtrInfo] ");
            sb7.append(str);
            sb7.append(' ');
            sb6.append(" final changePath=" + hashSet + ')');
            sb7.append((java.lang.Object) sb6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", sb7.toString());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2, zy2.la
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.b3 actionType, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        super.r(actionType, h0Var);
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).f187190i) {
            this.f187510e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5(this, ((c61.l7) i95.n0.c(c61.l7.class)).mk());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).i(actionType, h0Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.v) ((jz5.n) this.f187547t).mo141623x754a37bb()).a();
    }

    @Override // zy2.ia
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e r0(int i17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e t17 = t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ba.a(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "[getTabTipsExtInfo] tabType=" + i17 + " extInfo{tab_type=" + t17.m75939xb282bd08(2) + " object_id=" + pm0.v.u(t17.m75942xfb822ef2(0)) + '}');
        return t17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x2, zy2.la
    public void s(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r screen, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb pref, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screen, "screen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pref, "pref");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.s(screen, pref, source);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).G(screen, pref, source);
    }

    @Override // zy2.la
    public void s0() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).d();
    }

    @Override // zy2.ia
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e t(java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = L0(path);
        return L0 != null ? L0.W0() : new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19795xce8b809e();
    }

    @Override // zy2.fa
    public r45.bt2 t0(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187510e).u(i17);
    }

    @Override // zy2.ia
    public void u(r45.xb1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x3) ((jz5.n) this.f187546s).mo141623x754a37bb()).b(resp);
    }

    @Override // zy2.ia
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb u0() {
        return this.D;
    }

    @Override // zy2.ia
    public boolean v() {
        vd0.o2 o2Var = (vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class));
        o2Var.getClass();
        return (((c01.z1.h() & 8192) > 8192L ? 1 : ((c01.z1.h() & 8192) == 8192L ? 0 : -1)) != 0) || o2Var.Ai();
    }

    @Override // zy2.ia
    public void v0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerV1", "updateFindMoreFriendUI");
        ((ey2.h) pf5.u.f435469a.e(c61.l7.class).a(ey2.h.class)).O6();
    }

    @Override // zy2.fa
    public void w(r45.vs2 local, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(local, "local");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        f1(source, local);
    }

    @Override // zy2.fa
    public java.util.List w0(java.lang.String path, java.lang.String finderUserName, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        return h1().n(path, finderUserName, z17, z18);
    }

    @Override // zy2.ia
    public java.util.LinkedList x(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x3) ((jz5.n) this.f187546s).mo141623x754a37bb()).a(source);
    }

    @Override // zy2.fa
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb x0(r45.vs2 vs2Var, java.lang.String source, java.util.HashSet changePathSet, boolean z17, jz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changePathSet, "changePathSet");
        if (d1()) {
            return f1(source, vs2Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotManagerV1", "[addNewRedDotCtrlInfo] source=" + source + ", " + hc2.u0.e(vs2Var) + ",but accountNotReady");
        return null;
    }

    @Override // zy2.ia
    public java.util.Set y(java.lang.String path, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        return zy2.ia.E0(this, path, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g9.f187074d, false, username, 4, null);
    }

    @Override // zy2.ia
    public void z(java.lang.String path, java.lang.String tipsUuid, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsUuid, "tipsUuid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        a1().a(path, tipsUuid, ctrlInfo);
    }

    @Override // zy2.ia
    public void z0(boolean z17) {
        if (!z17) {
            nc2.g.f417641a.b("Finder.RedDotManagerV1", "#setEnableShowFinderLiveEntranceRedDot");
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }
}

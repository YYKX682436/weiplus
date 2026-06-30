package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class x9 extends com.tencent.mm.plugin.finder.extension.reddot.x2 {
    public int A;
    public boolean B;
    public int C;
    public com.tencent.mm.plugin.finder.extension.reddot.jb D;
    public final java.util.concurrent.CopyOnWriteArraySet E;
    public final java.util.List F;
    public final java.util.concurrent.ConcurrentHashMap G;

    /* renamed from: m, reason: collision with root package name */
    public final zy2.ba f106007m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.na f106008n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f106009o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.a2 f106010p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.oa f106011q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.w3 f106012r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f106013s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f106014t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f106015u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f106016v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f106017w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f106018x;

    /* renamed from: y, reason: collision with root package name */
    public long f106019y;

    /* renamed from: z, reason: collision with root package name */
    public long f106020z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(zy2.ba storage) {
        super(storage);
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f106007m = storage;
        this.f106008n = new com.tencent.mm.plugin.finder.extension.reddot.na(this);
        this.f106009o = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.q9(this));
        this.f106010p = new com.tencent.mm.plugin.finder.extension.reddot.a2(this);
        this.f106011q = new com.tencent.mm.plugin.finder.extension.reddot.oa();
        this.f106013s = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.v9(this));
        this.f106014t = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.p9(this));
        this.f106015u = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.m9(this));
        this.f106016v = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.s9.f105862d);
        this.f106017w = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.e9(this));
        this.f106018x = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.r9.f105808d);
        this.E = new java.util.concurrent.CopyOnWriteArraySet();
        this.F = kz5.c0.i(com.tencent.mm.plugin.finder.extension.reddot.h9.f105556d, com.tencent.mm.plugin.finder.extension.reddot.i9.f105597d);
        this.G = new java.util.concurrent.ConcurrentHashMap();
    }

    public static boolean l1(com.tencent.mm.plugin.finder.extension.reddot.x9 x9Var, r45.vs2 vs2Var, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z19 = (i17 & 4) != 0 ? true : z17;
        boolean z27 = (i17 & 8) != 0 ? false : z18;
        x9Var.getClass();
        java.util.LinkedList show_infos = vs2Var.f388489g;
        kotlin.jvm.internal.o.f(show_infos, "show_infos");
        java.util.Iterator it = show_infos.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.o.b(((r45.f03) obj2).f373892i, str)) {
                break;
            }
        }
        r45.f03 f03Var = (r45.f03) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleShowInfoForAppPush removeShowInfo path:");
        sb6.append(str);
        sb6.append(" isIgnoreDependency:");
        sb6.append(z19);
        sb6.append(" ignoreFreqLimit:");
        sb6.append(f03Var != null ? java.lang.Integer.valueOf(f03Var.f373899s) : null);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
        if (f03Var != null && f03Var.f373899s == 1) {
            return false;
        }
        if (f03Var != null) {
            com.tencent.mm.plugin.finder.report.x2.m(com.tencent.mm.plugin.finder.report.x2.f125429a, vs2Var, f03Var, 2, null, 1L, 8, null);
            if (z27) {
                java.util.LinkedList<r45.f03> show_infos2 = vs2Var.f388489g;
                kotlin.jvm.internal.o.f(show_infos2, "show_infos");
                for (r45.f03 f03Var2 : show_infos2) {
                    com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                    kotlin.jvm.internal.o.d(f03Var2);
                    com.tencent.mm.plugin.finder.report.x2.m(x2Var, vs2Var, f03Var2, 2, null, 1L, 8, null);
                }
            }
        }
        return hc2.u0.g(vs2Var, str, z19) != null;
    }

    @Override // zy2.ia
    public org.json.JSONObject A(r45.vs2 ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        return hc2.u0.a(ctrInfo);
    }

    @Override // zy2.ia
    public jz5.l A0(r45.vs2 ctrlInfo) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        java.util.LinkedList linkedList = ctrlInfo.f388489g;
        if (linkedList == null) {
            return null;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((r45.f03) it.next()).f373892i, "FinderEntrance")) {
                com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this, "FinderEntrance", hc2.u0.b(ctrlInfo), false, false, 12, null);
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
        com.tencent.mm.plugin.finder.extension.reddot.e1 i18 = i1();
        r45.vs2 vs2Var = new r45.vs2();
        java.util.LinkedList linkedList = vs2Var.f388489g;
        r45.f03 f03Var = new r45.f03();
        f03Var.f373888e = i17;
        f03Var.f373892i = "finder_wx_private_msg_entrance";
        linkedList.add(f03Var);
        i18.k(vs2Var);
    }

    @Override // zy2.ia
    public java.util.List C(java.lang.String source, java.lang.String path, yz5.l filter) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(filter, "filter");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List n17 = h1().n(path, g92.b.f269769e.T0(), false, false);
        synchronized (n17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : n17) {
                if (((java.lang.Boolean) filter.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) it.next();
                F(jbVar.field_ctrInfo, source);
                boolean L = L(jbVar);
                if (L) {
                    linkedList.add(jbVar);
                }
                com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", source + " [revokeRedDot] " + jbVar + ",ret=" + L);
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
        kotlin.jvm.internal.o.g(redDot, "redDot");
        long c17 = c01.id.c() - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, 0L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        r45.vs2 vs2Var = (r45.vs2) redDot.getCustom(1);
        if (vs2Var != null) {
            arrayList.add(vs2Var);
        }
        kotlin.jvm.internal.o.f(redDot.getList(2), "getCtrl_info_list(...)");
        if (!r5.isEmpty()) {
            arrayList.addAll(redDot.getList(2));
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList<r45.vs2> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (hashSet.add(((r45.vs2) obj).f388503x)) {
                arrayList2.add(obj);
            }
        }
        for (r45.vs2 vs2Var2 : arrayList2) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyRedDot] overFreq=");
            com.tencent.mm.plugin.finder.extension.reddot.qb qbVar = com.tencent.mm.plugin.finder.extension.reddot.qb.f105792a;
            sb6.append(c17 >= qbVar.m());
            sb6.append(' ');
            sb6.append(hc2.u0.e(vs2Var2));
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
            if (!hc2.u0.c(vs2Var2) && c17 < qbVar.m()) {
                hc2.u0.f(vs2Var2, false, 1, null);
                java.util.LinkedList linkedList = vs2Var2.f388489g;
                if (linkedList != null) {
                    pm0.v.d0(linkedList, com.tencent.mm.plugin.finder.extension.reddot.t9.f105878d);
                }
            }
            r45.vs2 vs2Var3 = (r45.vs2) redDot.getCustom(1);
            int i17 = vs2Var3 != null ? vs2Var3.f388487e : 0;
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
        kotlin.jvm.internal.o.g(source, "source");
        if (vs2Var != null) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = new com.tencent.mm.plugin.finder.extension.reddot.jb();
            jbVar.t0(vs2Var);
            java.lang.String a17 = com.tencent.mm.plugin.finder.extension.reddot.ba.a(jbVar.T0());
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.G;
            com.tencent.mm.plugin.finder.extension.reddot.z8 z8Var = (com.tencent.mm.plugin.finder.extension.reddot.z8) concurrentHashMap.get(a17);
            if (z8Var != null) {
                if (!(kotlin.jvm.internal.o.b(z8Var.f106074b, vs2Var.f388490h) || kotlin.jvm.internal.o.b(source, "notifyTabTip"))) {
                    z8Var = null;
                }
                if (z8Var != null) {
                    concurrentHashMap.remove(a17);
                    com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[clearEnterTabTipsExtInfo] PATH=" + a17 + " tips_id=" + vs2Var.f388490h + " source=" + source);
                }
            }
        }
    }

    @Override // zy2.la
    public void F0(boolean z17, com.tencent.mm.plugin.finder.extension.reddot.e3 e3Var) {
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).K(z17, e3Var);
    }

    @Override // zy2.ia
    public int G() {
        return this.C;
    }

    @Override // zy2.ia
    public java.lang.String G0(int i17) {
        return com.tencent.mm.plugin.finder.assist.w2.a(i17);
    }

    @Override // zy2.ia
    public void H() {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
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
                        if (((com.tencent.mm.plugin.finder.extension.reddot.jb) obj).I0(str) != null) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
            } else {
                jbVar = null;
            }
            com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "resetNotifyAllPathWithCrlInfo", false, str, jbVar != null ? jbVar.I0(str) : null, jbVar, null, p(str, jbVar), 32, null);
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            if (jbVar != null) {
                f03Var = jbVar.I0(str);
            }
            com.tencent.mm.plugin.finder.report.x2.l(x2Var, jbVar, f03Var, 11, null, 0L, 24, null);
        }
    }

    @Override // zy2.ia
    public void H0(int i17, int i18, int i19, int i27, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        i1().j(i17, i18, i19, i27, username);
    }

    @Override // zy2.ia
    public void I(boolean z17) {
        if (!z17) {
            nc2.g.f336108a.d("#setEnableShowEntranceRedDot");
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_NEAR_BY_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }

    @Override // zy2.fa
    public r45.f03 I0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return b0(path, g92.b.f269769e.T0());
    }

    @Override // zy2.ia
    public void J(java.lang.String source, java.util.LinkedList revokeList) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(revokeList, "revokeList");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(source);
        sb6.append(" [revokeFinderPopup] ");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(revokeList, 10));
        java.util.Iterator it = revokeList.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.at5) it.next()).getString(0));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
        java.util.Iterator it6 = revokeList.iterator();
        while (it6.hasNext()) {
            r45.at5 at5Var = (r45.at5) it6.next();
            com.tencent.mm.plugin.finder.extension.reddot.jb c17 = c(at5Var.getString(0));
            if (c17 != null) {
                boolean L = L(c17);
                com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[revokeFinderPopup] ret=" + L + " revokeId=" + at5Var.getString(0) + " removeRedDot=" + c17);
                if (L) {
                    com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    int type = c17.getType();
                    java.lang.String str = c17.field_tipsId;
                    if (str == null) {
                        str = "";
                    }
                    java.lang.String string = at5Var.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    o3Var.vj(type, str, string, 1);
                } else {
                    com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    int type2 = c17.getType();
                    java.lang.String str2 = c17.field_tipsId;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String string2 = at5Var.getString(0);
                    if (string2 == null) {
                        string2 = "";
                    }
                    o3Var2.vj(type2, str2, string2, 0);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("Finder.RedDotManagerV1", "[revokeFinderPopup] " + at5Var.getString(0) + " no found.");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) ((jz5.n) this.f106016v).getValue();
                java.lang.String string3 = at5Var.getString(0);
                if (string3 == null) {
                    string3 = "";
                }
                concurrentHashMap.put(string3, at5Var);
                com.tencent.mm.plugin.finder.report.o3 o3Var3 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                java.lang.String string4 = at5Var.getString(0);
                if (string4 == null) {
                    string4 = "";
                }
                o3Var3.vj(0, "", string4, 0);
            }
        }
    }

    @Override // zy2.ia
    public void K(r45.c21 entranceRedDot) {
        kotlin.jvm.internal.o.g(entranceRedDot, "entranceRedDot");
        r45.vs2 vs2Var = (r45.vs2) entranceRedDot.getCustom(0);
        if (vs2Var == null || hc2.u0.c(vs2Var)) {
            return;
        }
        i1().k(vs2Var);
    }

    @Override // zy2.fa
    public boolean L(com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi() && !com.tencent.mm.plugin.finder.extension.reddot.f3.a(java.lang.Integer.valueOf(ctrInfo.getType()))) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[clearCtrlInfo] 青少年模式且只看关注的模式下只delete关注的红点展示");
            return false;
        }
        java.util.HashSet s17 = h1().s(ctrInfo);
        java.lang.String str = ctrInfo.field_username;
        if (str == null) {
            str = "";
        }
        o1("clearCtrlInfo", s17, str, null, null);
        java.lang.String str2 = ctrInfo.field_ctrInfo.f388490h;
        boolean z17 = !(str2 == null || str2.length() == 0);
        if (z17) {
            androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) a17).W6(ctrInfo, false);
        }
        return z17;
    }

    @Override // zy2.fa
    public com.tencent.mm.plugin.finder.extension.reddot.jb L0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return zy2.ia.S0(this, path, g92.b.f269769e.T0(), false, false, 12, null);
    }

    @Override // zy2.la
    public void M0(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (com.tencent.mm.plugin.finder.storage.t70.f127590a.U0() && j1() && ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di(activity)) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0("FinderEntrance");
            r45.f03 I0 = L0 != null ? L0.I0("FinderEntrance") : null;
            if (L0 != null && I0 != null) {
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.x2.h(x2Var, "2", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 1, 0, null, 0, 1, null, 0, null, 7616, null);
            }
        }
        int Q6 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).Q6();
        boolean z17 = activity.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
        if (!z17 && j1()) {
            N("FinderEntrance");
            N("FinderMentionEntrance");
            N("Discovery");
        }
        com.tencent.mm.plugin.finder.extension.reddot.e2.f105486a = -1;
        com.tencent.mm.plugin.finder.extension.reddot.e2.f105487b = 0L;
        com.tencent.mm.plugin.finder.extension.reddot.e2.f105488c = "";
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[exitFinderBefore] isSourceFromShareToTimeline=" + z17 + " needClearRedDotWhenEnter=" + j1() + ", tabType=" + Q6);
    }

    @Override // zy2.fa
    public java.util.Set N(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return T0(path, null);
    }

    @Override // zy2.fa
    public java.util.concurrent.CopyOnWriteArraySet N0() {
        return this.E;
    }

    @Override // zy2.ia
    public java.util.Set O(java.lang.String path, int[] iArr, java.lang.String username) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        return zy2.ia.E0(this, path, new com.tencent.mm.plugin.finder.extension.reddot.f9(iArr), false, username, 4, null);
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x9.P(java.lang.String, r45.tt2, java.util.LinkedList):java.util.Set");
    }

    @Override // zy2.ia
    public r45.xs2 Q(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.z8 z8Var = (com.tencent.mm.plugin.finder.extension.reddot.z8) this.G.get(path);
        if (z8Var != null) {
            return z8Var.f106073a;
        }
        return null;
    }

    @Override // zy2.la
    public void Q0(com.tencent.mm.autogen.events.RedDotExposureEventEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).J(event);
        com.tencent.mm.plugin.finder.extension.reddot.c4 a17 = a1();
        synchronized (a17) {
            a17.d(event);
        }
    }

    @Override // zy2.ia
    public void R(boolean z17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Lj(1, z17 ? 1 : 2);
    }

    @Override // zy2.ia
    public int R0() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0("FinderEntrance");
        if ((L0 != null ? L0.I0("FinderEntrance") : null) == null) {
            return 0;
        }
        int integer = L0.N.getInteger(13);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[getAliveTabType] cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms enterAction :" + integer);
        return integer;
    }

    @Override // zy2.ia
    public zy2.z8 S() {
        return i1();
    }

    @Override // zy2.ia
    public void T(java.lang.String path, java.lang.String username) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.extension.reddot.t tVar = (com.tencent.mm.plugin.finder.extension.reddot.t) ((jz5.n) this.f106015u).getValue();
        tVar.getClass();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.extension.reddot.s(tVar, path, username));
    }

    @Override // zy2.ia
    public java.util.Set T0(java.lang.String path, int[] iArr) {
        kotlin.jvm.internal.o.g(path, "path");
        return O(path, iArr, g92.b.f269769e.T0());
    }

    @Override // zy2.la
    public void U(r45.at2 at2Var) {
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).P(at2Var);
    }

    @Override // zy2.ia
    public int U0(java.lang.String path) {
        int Z0;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0(path);
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
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "onFinderHomeTaskBackground:");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // zy2.ia
    public java.lang.String V0(java.lang.String path) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.z8 z8Var = (com.tencent.mm.plugin.finder.extension.reddot.z8) this.G.get(path);
        return (z8Var == null || (str = z8Var.f106074b) == null) ? "" : str;
    }

    @Override // zy2.ia
    public java.util.Set W() {
        return h1().u();
    }

    @Override // zy2.ia
    public int W0() {
        return ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).z();
    }

    @Override // zy2.ia
    public java.util.Set X(java.lang.String path, yz5.l call, boolean z17, java.lang.String username) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.extension.reddot.jb i17 = i(path, username, false, false);
        r45.f03 I0 = i17 != null ? i17.I0(path) : null;
        java.util.HashSet p17 = p1("disposeRedDotAtPath", path, call, z17, username);
        o1("", p17, username, i17, I0);
        return p17;
    }

    @Override // zy2.la
    public void Z() {
    }

    @Override // zy2.fa
    public com.tencent.mm.plugin.finder.extension.reddot.jb a(java.lang.String path, java.lang.String tipsUuid, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(tipsUuid, "tipsUuid");
        return h1().a(path, tipsUuid, z17, z18);
    }

    @Override // zy2.ia
    public void a0(com.tencent.mm.plugin.finder.extension.reddot.jb enterCtrlInfo) {
        kotlin.jvm.internal.o.g(enterCtrlInfo, "enterCtrlInfo");
        int T0 = enterCtrlInfo.T0();
        java.lang.String a17 = com.tencent.mm.plugin.finder.extension.reddot.ba.a(T0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[saveEnterTabTipsExtInfo] tabType=");
        sb6.append(T0);
        sb6.append(" PATH=");
        sb6.append(a17);
        sb6.append(" ctrlType=");
        sb6.append(enterCtrlInfo.getType());
        sb6.append(" feedId=");
        r45.xs2 xs2Var = enterCtrlInfo.N;
        sb6.append(pm0.v.u(xs2Var.getLong(3)));
        sb6.append("bubbleId=");
        r45.bz2 bz2Var = (r45.bz2) xs2Var.getCustom(23);
        sb6.append(pm0.v.u(bz2Var != null ? bz2Var.f371170g : 0L));
        sb6.append(" showBubbleType=");
        r45.bz2 bz2Var2 = (r45.bz2) xs2Var.getCustom(23);
        java.lang.String str = null;
        sb6.append(bz2Var2 != null ? java.lang.Integer.valueOf(bz2Var2.f371167d) : null);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.G;
        java.lang.String field_tipsId = enterCtrlInfo.field_tipsId;
        kotlin.jvm.internal.o.f(field_tipsId, "field_tipsId");
        concurrentHashMap.put(a17, new com.tencent.mm.plugin.finder.extension.reddot.z8(xs2Var, field_tipsId));
        r45.bz2 bz2Var3 = (r45.bz2) xs2Var.getCustom(23);
        pf5.u uVar = pf5.u.f353936a;
        if (bz2Var3 != null) {
            if (!(bz2Var3.f371167d > 0)) {
                bz2Var3 = null;
            }
            if (bz2Var3 != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(bz2Var3.f371167d);
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
                xs2Var2.set(3, java.lang.Long.valueOf(bz2Var3.f371170g));
                java.lang.String string = xs2Var.getString(1);
                if (string == null) {
                    string = "";
                }
                xs2Var2.set(1, string);
                xs2Var2.set(7, xs2Var.getByteString(7));
                java.lang.String field_tipsId2 = enterCtrlInfo.field_tipsId;
                kotlin.jvm.internal.o.f(field_tipsId2, "field_tipsId");
                concurrentHashMap.put(str, new com.tencent.mm.plugin.finder.extension.reddot.z8(xs2Var2, field_tipsId2));
                androidx.lifecycle.c1 a19 = uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
                kotlin.jvm.internal.o.f(a19, "get(...)");
                bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) a19).R6(bz2Var3.f371167d == 1 ? 1 : 3);
                if (R6 != null) {
                    R6.e(true, "BubbleShow");
                }
            }
        }
        if (enterCtrlInfo.field_ctrType == 26) {
            androidx.lifecycle.c1 a27 = uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
            kotlin.jvm.internal.o.f(a27, "get(...)");
            bs2.n1 R62 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) a27).R6(T0);
            if (R62 != null) {
                R62.e(true, "sns_delivery");
            }
        }
    }

    @Override // zy2.ia
    public boolean b(java.lang.String path, java.util.List ctrlTypeList) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(ctrlTypeList, "ctrlTypeList");
        return h1().b(path, ctrlTypeList);
    }

    @Override // zy2.ia
    public r45.f03 b0(java.lang.String path, java.lang.String str) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this, path, str, false, false, 12, null);
        if (S0 != null) {
            return S0.I0(path);
        }
        return null;
    }

    @Override // zy2.fa
    public com.tencent.mm.plugin.finder.extension.reddot.jb c(java.lang.String str) {
        return h1().c(str);
    }

    @Override // zy2.ia
    public void c0() {
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "onFinderInitSuccessfully...");
        com.tencent.mm.plugin.finder.extension.reddot.na naVar = this.f106008n;
        naVar.c();
        naVar.b();
        i1().m();
    }

    @Override // zy2.la
    public java.util.HashMap d(java.lang.String username, java.util.List list) {
        kotlin.jvm.internal.o.g(username, "username");
        return h1().d(username, list);
    }

    @Override // zy2.ia
    public void d0(r45.qk2 finderNotice) {
        kotlin.jvm.internal.o.g(finderNotice, "finderNotice");
        zy2.fa.D(this, (r45.vs2) finderNotice.getCustom(1), "notifyNotice", null, true, null, 20, null);
    }

    @Override // zy2.fa
    public boolean e(int i17, java.lang.String username, yz5.l filter) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(filter, "filter");
        o1("clearCtrlInfo", h1().e(i17, username, filter), username, null, null);
        return !r8.isEmpty();
    }

    @Override // zy2.la
    public zy2.ga e0() {
        com.tencent.mm.plugin.finder.extension.reddot.va h17 = h1();
        if (h17 instanceof com.tencent.mm.plugin.finder.extension.reddot.k8) {
            return (com.tencent.mm.plugin.finder.extension.reddot.k8) h17;
        }
        return null;
    }

    @Override // zy2.ia
    public java.util.LinkedList f(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
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
    public final com.tencent.mm.plugin.finder.extension.reddot.jb f1(java.lang.String r29, r45.vs2 r30) {
        /*
            Method dump skipped, instructions count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x9.f1(java.lang.String, r45.vs2):com.tencent.mm.plugin.finder.extension.reddot.jb");
    }

    @Override // zy2.fa
    public void g(java.lang.String groupId) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        h1().g(groupId);
    }

    @Override // zy2.fa
    public void g0(com.tencent.mm.plugin.finder.extension.reddot.jb info, java.lang.String path, boolean z17, java.lang.String str) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(path, "path");
        java.util.HashSet hashSet = new java.util.HashSet();
        r45.f03 I0 = info.I0(path);
        hashSet.addAll(h1().m("clearShowInfoAtCtrlInfo", info, path, z17, str == null ? "" : str, com.tencent.mm.plugin.finder.extension.reddot.j9.f105617d));
        h1().t(path, info);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[clearShowInfoAtCtrlInfo] path=" + path + " tipsId=" + info.field_tipsId + " removePathSet=" + hashSet + " , maybeRemoveShowInfo=" + hc2.z0.b(I0, 0));
        java.lang.String field_username = info.field_username;
        kotlin.jvm.internal.o.f(field_username, "field_username");
        o1("clearShowInfoAtCtrlInfo", hashSet, field_username, info, I0);
    }

    public final java.util.List g1(java.lang.String tag, java.util.List list, java.lang.String checkPath, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(checkPath, "checkPath");
        if ((list == null || list.isEmpty()) || !z18 || !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).m()) {
            return list;
        }
        java.util.HashMap d17 = d(g92.b.f269769e.T0(), z17 ? kz5.b0.c(checkPath) : null);
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).E(tag, checkPath, (com.tencent.mm.plugin.finder.extension.reddot.jb) obj, d17)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // zy2.fa
    public boolean h(com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, java.lang.String path, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(path, "path");
        return h1().h(ctrlInfo, path, j17, z17);
    }

    @Override // zy2.ia
    public boolean h0(int i17) {
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r07 = r0(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[containsTabTipsExtInfo] tabType=");
        sb6.append(i17);
        sb6.append(" isContains=");
        sb6.append(r07.getInteger(2) != 0);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
        return r07.getInteger(2) != 0;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.va h1() {
        return (com.tencent.mm.plugin.finder.extension.reddot.va) ((jz5.n) this.f106017w).getValue();
    }

    @Override // zy2.ia
    public com.tencent.mm.plugin.finder.extension.reddot.jb i(java.lang.String path, java.lang.String str, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        return h1().i(path, str, z17, z18);
    }

    @Override // zy2.fa
    public java.util.HashMap i0(java.lang.String path, java.lang.String prefix, java.lang.String suffix, java.lang.String localConfig) {
        java.lang.String str;
        java.lang.Object opt;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(suffix, "suffix");
        kotlin.jvm.internal.o.g(localConfig, "localConfig");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0(path);
        if (L0 == null) {
            return hashMap;
        }
        r45.f03 I0 = L0.I0(path);
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = L0.field_tipsShowEntranceExtInfo;
        org.json.JSONObject v07 = L0.v0();
        java.lang.String field_tipsId = L0.field_tipsId;
        kotlin.jvm.internal.o.f(field_tipsId, "field_tipsId");
        hashMap.put(prefix + "tipsid" + suffix, field_tipsId);
        hashMap.put(prefix + "ctrltype" + suffix, java.lang.Integer.valueOf(L0.field_ctrType));
        java.lang.String str2 = prefix + com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH + suffix;
        if (I0 == null || (str = I0.f373892i) == null) {
            str = "";
        }
        hashMap.put(str2, str);
        hashMap.put(prefix + "feedid" + suffix, pm0.v.u(finderTipsShowEntranceExtInfo.getLong(0)));
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_finder_reddot_ext_report_params, "", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            localConfig = localConfig + Zi;
        }
        java.util.List<java.lang.String> f07 = r26.n0.f0(localConfig, new java.lang.String[]{";"}, false, 0, 6, null);
        if (!f07.isEmpty()) {
            for (java.lang.String str3 : f07) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && (opt = v07.opt(str3)) != null) {
                    hashMap.put(prefix + str3 + suffix, opt);
                }
            }
        }
        return hashMap;
    }

    public final com.tencent.mm.plugin.finder.extension.reddot.e1 i1() {
        return (com.tencent.mm.plugin.finder.extension.reddot.e1) ((jz5.n) this.f106009o).getValue();
    }

    @Override // zy2.la
    public void j() {
        h1().j();
    }

    @Override // zy2.ia
    public zy2.ma j0() {
        return this.f106008n;
    }

    public final boolean j1() {
        return ((java.lang.Boolean) ((jz5.n) this.f106018x).getValue()).booleanValue();
    }

    @Override // zy2.ia
    public void k(androidx.recyclerview.widget.RecyclerView swipeView, int i17) {
        kotlin.jvm.internal.o.g(swipeView, "swipeView");
        h1().k(swipeView, i17);
    }

    @Override // zy2.la
    public void k0() {
        kc2.g1 b17 = b1();
        if (b17 != null) {
            com.tencent.mm.app.w.INSTANCE.p((kc2.r) ((jz5.n) b17.f306380d).getValue());
        }
        com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var = this.f106012r;
        if (w3Var != null) {
            com.tencent.mm.app.w.INSTANCE.p(w3Var);
        }
        com.tencent.mm.plugin.finder.extension.reddot.oa oaVar = this.f106011q;
        oaVar.f105754b.dead();
        oaVar.f105755c.dead();
    }

    public final void k1(java.lang.String str, int i17, java.lang.String str2) {
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.List<com.tencent.mm.plugin.finder.extension.reddot.jb> n17 = h1().n("Discovery", str2, true, true);
        synchronized (n17) {
            z17 = false;
            z18 = false;
            z19 = false;
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : n17) {
                if (!jbVar.y0(str)) {
                    z18 = true;
                } else if (jbVar.field_ctrInfo.f388486d <= i17) {
                    z19 = true;
                }
            }
        }
        if (z18 && z19) {
            synchronized (n17) {
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 : n17) {
                    if (jbVar2.y0(str)) {
                        zy2.fa.J0(this, jbVar2, "Discovery", true, null, 8, null);
                    }
                }
            }
        } else {
            z17 = z19;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "handleClearDiscoveryRedDot isClear:" + z17 + ", hasOtherPath:" + z18 + ", ctrlInfoByPath:" + n17 + ", path:" + str);
        if (z17) {
            X("Discovery", com.tencent.mm.plugin.finder.extension.reddot.n9.f105728d, true, str2);
        }
    }

    @Override // zy2.ia
    public void l(boolean z17, java.lang.String path, zy2.na dslRenderInfo) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(dslRenderInfo, "dslRenderInfo");
        a1().b(z17, path, dslRenderInfo);
    }

    @Override // zy2.ia
    public boolean l0(r45.d33 wxMention) {
        kotlin.jvm.internal.o.g(wxMention, "wxMention");
        i1().l(wxMention);
        return true;
    }

    @Override // zy2.ia
    public void m(int i17, int i18, int i19, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        i1().i(i17, i18, i19, username);
    }

    @Override // zy2.ia
    public boolean m0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0(path);
        if (L0 == null) {
            return false;
        }
        boolean u07 = L0.u0(path);
        h1().r(L0);
        return u07;
    }

    public final void m1(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        for (jz5.l lVar : h1().q(source, new com.tencent.mm.plugin.finder.extension.reddot.o9(this, source))) {
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) lVar.f302833d;
            java.util.Set set = (java.util.Set) lVar.f302834e;
            r45.vs2 field_ctrInfo = jbVar.field_ctrInfo;
            kotlin.jvm.internal.o.f(field_ctrInfo, "field_ctrInfo");
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.x9.n(int, boolean):void");
    }

    public final void n1(java.lang.String str, java.lang.String str2, java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = str.length() == 0 ? zy2.ia.S0(this, str3, g92.b.f269769e.T0(), false, false, 12, null) : zy2.ia.S0(this, str3, str, false, false, 12, null);
            r45.f03 I0 = S0 != null ? S0.I0(str3) : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[notifyRedDotAdd] source=");
            sb6.append(str2);
            sb6.append(' ');
            sb6.append(S0 != null ? S0.field_tipsId : null);
            sb6.append(" ,path:");
            sb6.append(I0 != null ? I0.f373892i : null);
            sb6.append('(');
            sb6.append(str3);
            sb6.append(") businessType=");
            sb6.append(S0 != null ? java.lang.Integer.valueOf(S0.field_businessType) : null);
            sb6.append(" count:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f373888e) : null);
            sb6.append(" clearType:");
            sb6.append(I0 != null ? java.lang.Integer.valueOf(I0.f373891h) : null);
            sb6.append(" parent:");
            sb6.append(I0 != null ? I0.f373893m : null);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
            if (S0 != null && I0 != null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "buildPathWithCtrInfo", true, str3, I0, S0, null, p(str3, S0), 32, null);
            }
        }
    }

    @Override // zy2.ia
    public void o(r45.vt2 revoke) {
        kotlin.jvm.internal.o.g(revoke, "revoke");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[revokeTabTips] ");
        java.util.LinkedList list = revoke.getList(0);
        kotlin.jvm.internal.o.f(list, "getRevoke_tab_tips_info(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.wt2) it.next()).getString(0));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb6.toString());
        pm0.v.O("Finder.RedDotManagerV1", new com.tencent.mm.plugin.finder.extension.reddot.w9(revoke, this));
    }

    @Override // zy2.ia
    public void o0(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        Z0().c(source, ctrlInfo);
    }

    public final void o1(java.lang.String str, java.util.HashSet hashSet, java.lang.String str2, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        java.lang.String str3;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2;
        jz5.f0 f0Var;
        r45.vs2 vs2Var;
        java.lang.String str4;
        r45.vs2 vs2Var2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        r45.vs2 vs2Var3;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = jbVar;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str8 = (java.lang.String) it.next();
            boolean p17 = p(str8, jbVar3);
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this, str8, str2, false, false, 12, null);
            if (S0 != null) {
                r45.f03 I0 = S0.I0(str8);
                if (I0 != null) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    java.lang.String str9 = str + " disposeRedDotAtPath_show";
                    if (jbVar3 == null || (vs2Var3 = jbVar3.field_ctrInfo) == null || (str6 = vs2Var3.f388496q) == null) {
                        str6 = str2;
                    }
                    kotlin.jvm.internal.o.d(str6);
                    str3 = str8;
                    jbVar2 = jbVar3;
                    aaVar.a(str9, false, str8, f03Var, jbVar, str6, p17);
                    java.lang.String str10 = str + " disposeRedDotAtPath_show";
                    r45.vs2 vs2Var4 = S0.field_ctrInfo;
                    java.lang.String str11 = (vs2Var4 == null || (str7 = vs2Var4.f388496q) == null) ? str2 : str7;
                    kotlin.jvm.internal.o.d(str11);
                    aaVar.a(str10, true, str3, I0, S0, str11, p(str3, S0));
                } else {
                    str3 = str8;
                    jbVar2 = jbVar3;
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar2 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    java.lang.String str12 = str + " disposeRedDotAtPath";
                    java.lang.String str13 = (jbVar2 == null || (vs2Var2 = jbVar2.field_ctrInfo) == null || (str5 = vs2Var2.f388496q) == null) ? str2 : str5;
                    kotlin.jvm.internal.o.d(str13);
                    aaVar2.a(str12, false, str3, f03Var, jbVar, str13, p17);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                str3 = str8;
                jbVar2 = jbVar3;
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa aaVar3 = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                java.lang.String str14 = str + " disposeRedDotAtPath_null";
                java.lang.String str15 = (jbVar2 == null || (vs2Var = jbVar2.field_ctrInfo) == null || (str4 = vs2Var.f388496q) == null) ? str2 : str4;
                kotlin.jvm.internal.o.d(str15);
                aaVar3.a(str14, false, str3, f03Var, jbVar, str15, p17);
            }
            jbVar3 = jbVar2;
        }
    }

    @Override // zy2.fa
    public boolean p(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        return ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).C(str, jbVar);
    }

    @Override // zy2.la
    public void p0() {
        this.f106019y = c01.id.c() - this.f106020z;
        Z0().f106045b = false;
        if (this.B && this.A == 2 && this.f106019y <= ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderFastEnterTime", 0) * 1000) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0) + 1;
            if (r17 > 3) {
                r17 = 3;
            }
            com.tencent.mars.xlog.Log.w("Finder.RedDotManagerV1", "[exitFinder] current fastLevel=" + r17);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, java.lang.Integer.valueOf(r17));
        } else if (this.f106019y > ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderFastEnterTime", 0) * 1000) {
            com.tencent.mars.xlog.Log.w("Finder.RedDotManagerV1", "[exitFinder] revert fastLevel=0");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    public final java.util.HashSet p1(java.lang.String str, java.lang.String str2, yz5.l lVar, boolean z17, java.lang.String str3) {
        java.lang.Object obj;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(str2);
        for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : h1().n(str2, str3, false, false)) {
            java.util.Iterator it = this.F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((java.lang.Boolean) ((yz5.l) obj).invoke(jbVar)).booleanValue()) {
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
    public void prepare() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("Finder.RedDotManagerV1", "[prepare] not main process!");
            return;
        }
        kc2.g1 b17 = b1();
        if (b17 != null) {
            b17.k().post(new kc2.x0(b17));
        }
        a1().c();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).L("Finder.RedDotManagerV1");
        m1("[prepare]");
        com.tencent.mm.plugin.finder.extension.reddot.a2 a2Var = this.f106010p;
        a2Var.getClass();
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        gm0.j1.b().c();
        rn3.i.Ni().f397955h.f152399a.put("FinderNewTipsTransform", a2Var);
        com.tencent.mm.plugin.finder.extension.reddot.na naVar = this.f106008n;
        naVar.e();
        com.tencent.mars.xlog.Log.i("Finder.RedDotTransform", "initPostRecordTemplateRedDotListener >> addListener");
        naVar.f105729a.N0().add(new com.tencent.mm.plugin.finder.extension.reddot.ma());
        zy2.fa.y0(this, 1005, null, null, 6, null);
        com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var = new com.tencent.mm.plugin.finder.extension.reddot.w3(this);
        w3Var.f105960f.alive();
        pm0.v.X(new com.tencent.mm.plugin.finder.extension.reddot.v3(w3Var));
        com.tencent.mm.plugin.finder.extension.reddot.w3.a(w3Var, "setup", null, 0L, 6, null);
        com.tencent.mm.app.w.INSTANCE.a(w3Var);
        this.f106012r = w3Var;
        com.tencent.mm.plugin.finder.extension.reddot.oa oaVar = this.f106011q;
        oaVar.f105754b.alive();
        oaVar.f105755c.alive();
        i1().n();
        ((com.tencent.mm.plugin.finder.extension.reddot.u) ((jz5.n) this.f105975c).getValue()).a();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0().add(new com.tencent.mm.plugin.finder.extension.reddot.g3());
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[prepare] " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms hashCode=" + hashCode());
        h1().v();
    }

    @Override // zy2.la
    public void q(com.tencent.mm.plugin.finder.extension.reddot.b3 actionType) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        this.f105983k = false;
        kc2.g1 b17 = b1();
        if (b17 != null) {
            b17.b(false, actionType, null);
        }
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).j(actionType);
    }

    @Override // zy2.ia
    public r45.xs2 q0(java.lang.String path, java.lang.String source) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.finder.extension.reddot.z8 z8Var = (com.tencent.mm.plugin.finder.extension.reddot.z8) this.G.remove(path);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[clearEnterTabTipsExtInfo] path=" + path + " result=" + z8Var + " source=" + source);
        if (z8Var != null) {
            return z8Var.f106073a;
        }
        return null;
    }

    public final void q1(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.a9 a9Var, java.util.HashSet hashSet) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        com.tencent.mm.plugin.finder.extension.reddot.a9 a9Var2 = a9Var;
        if (!(!hashSet.isEmpty()) || !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).m()) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[buildPathWithCtrInfo] " + str + " disable simul expose check,changePath=" + hashSet + '!');
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        jz5.l n17 = ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).n(sb6, true);
        if (n17 != null) {
            java.util.List list = (java.util.List) n17.f302833d;
            java.util.List<java.util.Map.Entry> list2 = (java.util.List) n17.f302834e;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(list);
            linkedList.addAll(list2);
            for (java.util.Map.Entry entry : list2) {
                boolean z17 = !hashSet.contains(entry.getKey());
                java.lang.String str4 = (java.lang.String) entry.getKey();
                com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var = (com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue();
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = i4Var.f105587a;
                if (a9Var2 != com.tencent.mm.plugin.finder.extension.reddot.a9.f105350e || z17) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("expose_cnt", java.lang.Integer.valueOf(i4Var.f105589c));
                    com.tencent.mm.plugin.finder.extension.reddot.sb.a("red_dot_abandon_simul", jbVar2, hashMap);
                } else {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("expose_cnt", java.lang.Integer.valueOf(i4Var.f105589c));
                    com.tencent.mm.plugin.finder.extension.reddot.sb.a("red_dot_ban_when_rece_simul", jbVar2, hashMap2);
                }
                java.lang.String str5 = a9Var2 + "_buildPathWithCtrInfo_" + jbVar2.field_tips_uuid;
                if (com.tencent.mm.plugin.finder.extension.reddot.z2.f106043c.a(str4)) {
                    str2 = str5;
                    jbVar = jbVar2;
                    str3 = str4;
                    for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 : zy2.ia.Y(this, str5, str4, null, 4, null)) {
                        hashSet.removeAll(kz5.n0.X0(jbVar3.J0()));
                        o0(str2, jbVar3);
                    }
                } else {
                    str2 = str5;
                    str3 = str4;
                    r45.f03 I0 = jbVar2.I0(str3);
                    com.tencent.mm.plugin.finder.extension.reddot.u9 u9Var = com.tencent.mm.plugin.finder.extension.reddot.u9.f105913d;
                    g92.b bVar = g92.b.f269769e;
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
                ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).H(str2, str3, jbVar, linkedList2, list3);
                a9Var2 = a9Var;
                list = list3;
                linkedList = linkedList2;
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[buildPathWithCtrInfo] ");
            sb7.append(str);
            sb7.append(' ');
            sb6.append(" final changePath=" + hashSet + ')');
            sb7.append((java.lang.Object) sb6);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", sb7.toString());
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.x2, zy2.la
    public void r(com.tencent.mm.plugin.finder.extension.reddot.b3 actionType, com.tencent.mm.ui.base.preference.h0 h0Var) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        super.r(actionType, h0Var);
        if (((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).f105657i) {
            this.f105977e = new com.tencent.mm.plugin.finder.extension.reddot.l5(this, ((c61.l7) i95.n0.c(c61.l7.class)).mk());
        }
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).i(actionType, h0Var);
        ((com.tencent.mm.plugin.finder.extension.reddot.v) ((jz5.n) this.f106014t).getValue()).a();
    }

    @Override // zy2.ia
    public com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r0(int i17) {
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo t17 = t(com.tencent.mm.plugin.finder.extension.reddot.ba.a(i17));
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "[getTabTipsExtInfo] tabType=" + i17 + " extInfo{tab_type=" + t17.getInteger(2) + " object_id=" + pm0.v.u(t17.getLong(0)) + '}');
        return t17;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.x2, zy2.la
    public void s(com.tencent.mm.ui.base.preference.r screen, com.tencent.mm.ui.base.preference.Preference pref, com.tencent.mm.ui.base.preference.n0 source) {
        kotlin.jvm.internal.o.g(screen, "screen");
        kotlin.jvm.internal.o.g(pref, "pref");
        kotlin.jvm.internal.o.g(source, "source");
        super.s(screen, pref, source);
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).G(screen, pref, source);
    }

    @Override // zy2.la
    public void s0() {
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).d();
    }

    @Override // zy2.ia
    public com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo t(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0(path);
        return L0 != null ? L0.W0() : new com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo();
    }

    @Override // zy2.fa
    public r45.bt2 t0(int i17) {
        return ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).u(i17);
    }

    @Override // zy2.ia
    public void u(r45.xb1 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        ((com.tencent.mm.plugin.finder.extension.reddot.x3) ((jz5.n) this.f106013s).getValue()).b(resp);
    }

    @Override // zy2.ia
    public com.tencent.mm.plugin.finder.extension.reddot.jb u0() {
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
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerV1", "updateFindMoreFriendUI");
        ((ey2.h) pf5.u.f353936a.e(c61.l7.class).a(ey2.h.class)).O6();
    }

    @Override // zy2.fa
    public void w(r45.vs2 local, java.lang.String source) {
        kotlin.jvm.internal.o.g(local, "local");
        kotlin.jvm.internal.o.g(source, "source");
        f1(source, local);
    }

    @Override // zy2.fa
    public java.util.List w0(java.lang.String path, java.lang.String finderUserName, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        return h1().n(path, finderUserName, z17, z18);
    }

    @Override // zy2.ia
    public java.util.LinkedList x(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return ((com.tencent.mm.plugin.finder.extension.reddot.x3) ((jz5.n) this.f106013s).getValue()).a(source);
    }

    @Override // zy2.fa
    public com.tencent.mm.plugin.finder.extension.reddot.jb x0(r45.vs2 vs2Var, java.lang.String source, java.util.HashSet changePathSet, boolean z17, jz5.l lVar) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(changePathSet, "changePathSet");
        if (d1()) {
            return f1(source, vs2Var);
        }
        com.tencent.mars.xlog.Log.e("Finder.RedDotManagerV1", "[addNewRedDotCtrlInfo] source=" + source + ", " + hc2.u0.e(vs2Var) + ",but accountNotReady");
        return null;
    }

    @Override // zy2.ia
    public java.util.Set y(java.lang.String path, java.lang.String username) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        return zy2.ia.E0(this, path, com.tencent.mm.plugin.finder.extension.reddot.g9.f105541d, false, username, 4, null);
    }

    @Override // zy2.ia
    public void z(java.lang.String path, java.lang.String tipsUuid, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(tipsUuid, "tipsUuid");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        a1().a(path, tipsUuid, ctrlInfo);
    }

    @Override // zy2.ia
    public void z0(boolean z17) {
        if (!z17) {
            nc2.g.f336108a.b("Finder.RedDotManagerV1", "#setEnableShowFinderLiveEntranceRedDot");
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }
}

package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class d8 extends com.tencent.mm.plugin.finder.extension.reddot.x2 {
    public boolean A;
    public int B;
    public com.tencent.mm.plugin.finder.extension.reddot.jb C;
    public final java.util.concurrent.ConcurrentHashMap D;
    public final java.util.concurrent.ConcurrentHashMap E;
    public final java.util.concurrent.CopyOnWriteArraySet F;
    public final java.util.List G;
    public final java.util.concurrent.ConcurrentHashMap H;
    public final java.util.concurrent.ConcurrentHashMap I;

    /* renamed from: m, reason: collision with root package name */
    public final zy2.ba f105460m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.na f105461n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f105462o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.a2 f105463p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.oa f105464q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.w3 f105465r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f105466s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f105467t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f105468u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f105469v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f105470w;

    /* renamed from: x, reason: collision with root package name */
    public long f105471x;

    /* renamed from: y, reason: collision with root package name */
    public long f105472y;

    /* renamed from: z, reason: collision with root package name */
    public int f105473z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(zy2.ba storage) {
        super(storage);
        kotlin.jvm.internal.o.g(storage, "storage");
        this.f105460m = storage;
        this.f105461n = new com.tencent.mm.plugin.finder.extension.reddot.na(this);
        this.f105462o = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.t7(this));
        this.f105463p = new com.tencent.mm.plugin.finder.extension.reddot.a2(this);
        this.f105464q = new com.tencent.mm.plugin.finder.extension.reddot.oa();
        this.f105466s = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.y7(this));
        this.f105467t = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.c8(this));
        this.f105468u = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.s7(this));
        this.f105469v = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.p7(this));
        this.f105470w = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.u7.f105909d);
        this.D = new java.util.concurrent.ConcurrentHashMap();
        this.E = new java.util.concurrent.ConcurrentHashMap();
        this.F = new java.util.concurrent.CopyOnWriteArraySet();
        this.G = kz5.c0.i(com.tencent.mm.plugin.finder.extension.reddot.l7.f105690d, com.tencent.mm.plugin.finder.extension.reddot.m7.f105709d);
        this.H = new java.util.concurrent.ConcurrentHashMap();
        this.I = new java.util.concurrent.ConcurrentHashMap();
    }

    public static boolean l1(com.tencent.mm.plugin.finder.extension.reddot.d8 d8Var, r45.vs2 vs2Var, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        java.lang.Object obj2;
        boolean z19 = (i17 & 4) != 0 ? true : z17;
        boolean z27 = (i17 & 8) != 0 ? false : z18;
        d8Var.getClass();
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
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb6.toString());
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
        java.util.List list = (java.util.List) this.D.get(path);
        if (list != null) {
            synchronized (list) {
                java.util.ArrayList<com.tencent.mm.plugin.finder.extension.reddot.jb> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (((java.lang.Boolean) filter.invoke(obj)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : arrayList) {
                    F(jbVar.field_ctrInfo, source);
                    boolean L = L(jbVar);
                    if (L) {
                        linkedList.add(jbVar);
                    }
                    com.tencent.mars.xlog.Log.i("Finder.RedDotManager", source + " [revokeRedDot] " + jbVar + ",ret=" + L);
                }
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
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb6.toString());
            if (!hc2.u0.c(vs2Var2) && c17 < qbVar.m()) {
                hc2.u0.f(vs2Var2, false, 1, null);
                java.util.LinkedList linkedList = vs2Var2.f388489g;
                if (linkedList != null) {
                    pm0.v.d0(linkedList, com.tencent.mm.plugin.finder.extension.reddot.v7.f105928d);
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
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.H;
            com.tencent.mm.plugin.finder.extension.reddot.z6 z6Var = (com.tencent.mm.plugin.finder.extension.reddot.z6) concurrentHashMap.get(a17);
            if (z6Var != null) {
                if (!(kotlin.jvm.internal.o.b(z6Var.f106069b, vs2Var.f388490h) || kotlin.jvm.internal.o.b(source, "notifyTabTip"))) {
                    z6Var = null;
                }
                if (z6Var != null) {
                    concurrentHashMap.remove(a17);
                    com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[clearEnterTabTipsExtInfo] PATH=" + a17 + " tips_id=" + vs2Var.f388490h + " source=" + source);
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
        return this.B;
    }

    @Override // zy2.ia
    public java.lang.String G0(int i17) {
        return com.tencent.mm.plugin.finder.assist.w2.a(i17);
    }

    @Override // zy2.ia
    public void H() {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        java.lang.Object obj;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.D;
        java.util.Enumeration keys = concurrentHashMap.keys();
        kotlin.jvm.internal.o.f(keys, "keys(...)");
        java.util.ArrayList<java.lang.String> list = java.util.Collections.list(keys);
        kotlin.jvm.internal.o.f(list, "list(...)");
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "resetNotifyAllPathWithCrlInfo#reset, list:" + list);
        java.util.HashMap hashMap = new java.util.HashMap(concurrentHashMap);
        concurrentHashMap.clear();
        for (java.lang.String str : list) {
            java.util.List list2 = (java.util.List) hashMap.get(str);
            r45.f03 f03Var = null;
            if (list2 != null) {
                java.util.ListIterator listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    kotlin.jvm.internal.o.d(str);
                    if (((com.tencent.mm.plugin.finder.extension.reddot.jb) obj).I0(str) != null) {
                        break;
                    }
                }
                jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
            } else {
                jbVar = null;
            }
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            kotlin.jvm.internal.o.d(str);
            com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, "resetNotifyAllPathWithCrlInfo", false, str, jbVar != null ? jbVar.I0(str) : null, jbVar, null, p(str, jbVar), 32, null);
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
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb6.toString());
        java.util.Iterator it6 = revokeList.iterator();
        while (it6.hasNext()) {
            r45.at5 at5Var = (r45.at5) it6.next();
            com.tencent.mm.plugin.finder.extension.reddot.jb c17 = c(at5Var.getString(0));
            if (c17 != null) {
                boolean L = L(c17);
                com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[revokeFinderPopup] ret=" + L + " revokeId=" + at5Var.getString(0) + " removeRedDot=" + c17);
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
                com.tencent.mars.xlog.Log.w("Finder.RedDotManager", "[revokeFinderPopup] " + at5Var.getString(0) + " no found.");
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.I;
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
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[clearCtrlInfo] 青少年模式且只看关注的模式下只delete关注的红点展示");
            return false;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "clearCtrlInfo removeRedDot=" + ctrInfo.field_tips_uuid);
        java.util.Iterator it = ctrInfo.J0().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.util.List list = (java.util.List) this.D.get(str);
            if (list != null) {
                pm0.v.G(list, new com.tencent.mm.plugin.finder.extension.reddot.h7(ctrInfo));
            }
            java.lang.String str2 = ctrInfo.field_username;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            jz5.f0 f0Var = null;
            boolean p17 = p(str, null);
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0(str);
            if (L0 != null) {
                r45.f03 I0 = L0.I0(str);
                if (I0 != null) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    aaVar.a("clearCtrlInfo_show", false, str, null, null, str3, p17);
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, "clearCtrlInfo_show", true, str, I0, L0, null, p(str, L0), 32, null);
                } else {
                    com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("clearCtrlInfo", false, str, null, null, str3, p17);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("clearCtrlInfo_null", false, str, null, null, str3, p17);
            }
        }
        if (!ctrInfo.A0(this.f105460m, true)) {
            return false;
        }
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) a17).W6(ctrInfo, false);
        return true;
    }

    @Override // zy2.fa
    public com.tencent.mm.plugin.finder.extension.reddot.jb L0(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return zy2.ia.S0(this, path, g92.b.f269769e.T0(), false, false, 12, null);
    }

    @Override // zy2.la
    public void M0(android.app.Activity activity) {
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        e42.c0 c0Var = e42.c0.clicfg_finder_unable_exit_finder_report_click;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "禁止退出视频号返回发现页时上报红点点击事件", c0Var, java.lang.Boolean.valueOf(z18), false, com.tencent.mm.plugin.finder.storage.ki0.f127077d, 8, null)).booleanValue() && t70Var.U0() && j1() && ((com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class))).Di(activity)) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0("FinderEntrance");
            r45.f03 I0 = L0 != null ? L0.I0("FinderEntrance") : null;
            if (L0 != null && I0 != null) {
                com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                com.tencent.mm.plugin.finder.report.x2.h(x2Var, "2", L0, I0, 2, nyVar != null ? nyVar.V6() : null, 1, 0, null, 0, 1, null, 0, null, 7616, null);
            }
        }
        int Q6 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).Q6();
        boolean z19 = activity.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
        if (!z19 && j1()) {
            if (this.f105976d) {
                N("FinderEntrance");
            }
            N("FinderMentionEntrance");
            N("Discovery");
        }
        com.tencent.mm.plugin.finder.extension.reddot.e2.f105486a = -1;
        com.tencent.mm.plugin.finder.extension.reddot.e2.f105487b = 0L;
        com.tencent.mm.plugin.finder.extension.reddot.e2.f105488c = "";
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[exitFinderBefore] isSourceFromShareToTimeline=" + z19 + " needClearRedDotWhenEnter=" + j1() + " tabType=" + Q6);
    }

    @Override // zy2.fa
    public java.util.Set N(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        return T0(path, null);
    }

    @Override // zy2.fa
    public java.util.concurrent.CopyOnWriteArraySet N0() {
        return this.F;
    }

    @Override // zy2.ia
    public java.util.Set O(java.lang.String path, int[] iArr, java.lang.String username) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        return zy2.ia.E0(this, path, new com.tencent.mm.plugin.finder.extension.reddot.j7(iArr), false, username, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027f  */
    @Override // zy2.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set P(java.lang.String r40, r45.tt2 r41, java.util.LinkedList r42) {
        /*
            Method dump skipped, instructions count: 1581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.d8.P(java.lang.String, r45.tt2, java.util.LinkedList):java.util.Set");
    }

    @Override // zy2.ia
    public r45.xs2 Q(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.z6 z6Var = (com.tencent.mm.plugin.finder.extension.reddot.z6) this.H.get(path);
        if (z6Var != null) {
            return z6Var.f106068a;
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
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[getAliveTabType] cost=" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + "ms enterAction :" + integer);
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
        com.tencent.mm.plugin.finder.extension.reddot.t tVar = (com.tencent.mm.plugin.finder.extension.reddot.t) ((jz5.n) this.f105469v).getValue();
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
        com.tencent.mm.plugin.finder.extension.reddot.jb.o1(L0, this.f105460m, false, 2, null);
        return Z0;
    }

    @Override // zy2.la
    public void V() {
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "onFinderHomeTaskBackground:");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    @Override // zy2.ia
    public java.lang.String V0(java.lang.String path) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mm.plugin.finder.extension.reddot.z6 z6Var = (com.tencent.mm.plugin.finder.extension.reddot.z6) this.H.get(path);
        return (z6Var == null || (str = z6Var.f106069b) == null) ? "" : str;
    }

    @Override // zy2.ia
    public java.util.Set W() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.D.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Iterable iterable = (java.lang.Iterable) ((java.util.Map.Entry) it.next()).getValue();
            synchronized (iterable) {
                java.util.Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    hashSet.add((com.tencent.mm.plugin.finder.extension.reddot.jb) it6.next());
                }
            }
        }
        return hashSet;
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
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disposeRedDotAtPath_");
        sb6.append(i17 != null ? i17.field_tips_uuid : null);
        java.util.HashSet n17 = n1(sb6.toString(), path, call, z17, username);
        m1("", n17, username, i17, I0);
        return n17;
    }

    @Override // zy2.la
    public void Z() {
    }

    @Override // zy2.fa
    public com.tencent.mm.plugin.finder.extension.reddot.jb a(java.lang.String path, java.lang.String tipsUuid, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(tipsUuid, "tipsUuid");
        java.util.List list = (java.util.List) this.D.get(path);
        java.lang.Object obj = null;
        if (list != null) {
            synchronized (list) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj2;
                    boolean z19 = (jbVar.z0(g92.b.f269769e.T0()) && kotlin.jvm.internal.o.b(jbVar.field_tips_uuid, tipsUuid)) && com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a.a("getByTipsUuid", path);
                    if (z17) {
                        z19 = z19 && !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).C(path, jbVar);
                    }
                    if (z19) {
                        arrayList2.add(obj2);
                    }
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List g17 = g1("getByTipsUuid", arrayList, path, z17, z18);
        if (g17 == null) {
            return null;
        }
        synchronized (g17) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator.previous();
                if (((com.tencent.mm.plugin.finder.extension.reddot.jb) previous).I0(path) != null) {
                    obj = previous;
                    break;
                }
            }
        }
        return (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // zy2.ia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0(com.tencent.mm.plugin.finder.extension.reddot.jb r17) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.d8.a0(com.tencent.mm.plugin.finder.extension.reddot.jb):void");
    }

    @Override // zy2.ia
    public boolean b(java.lang.String path, java.util.List ctrlTypeList) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(ctrlTypeList, "ctrlTypeList");
        java.util.List list = (java.util.List) this.D.get(path);
        int i17 = -1;
        if (list != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (ctrlTypeList.contains(java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.extension.reddot.jb) it.next()).getType()))) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
        }
        return i17 >= 0;
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
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.E;
        if (str == null) {
            str = "";
        }
        return (com.tencent.mm.plugin.finder.extension.reddot.jb) concurrentHashMap.get(str);
    }

    @Override // zy2.ia
    public void c0() {
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "onFinderInitSuccessfully...");
        com.tencent.mm.plugin.finder.extension.reddot.na naVar = this.f105461n;
        naVar.c();
        naVar.b();
        i1().m();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032 A[SYNTHETIC] */
    @Override // zy2.la
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.HashMap d(java.lang.String r13, java.util.List r14) {
        /*
            r12 = this;
            java.lang.String r0 = "username"
            kotlin.jvm.internal.o.g(r13, r0)
            com.tencent.mm.plugin.finder.extension.reddot.g4 r0 = com.tencent.mm.plugin.finder.extension.reddot.l5.H
            java.util.List r0 = r0.e()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.ConcurrentHashMap r4 = r12.D
            java.lang.Object r4 = r4.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L12
            monitor-enter(r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lab
            r5.<init>()     // Catch: java.lang.Throwable -> Lab
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> Lab
        L32:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> Lab
            r8 = 1
            r9 = 0
            if (r7 == 0) goto L70
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lab
            r10 = r7
            com.tencent.mm.plugin.finder.extension.reddot.jb r10 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r10     // Catch: java.lang.Throwable -> Lab
            boolean r11 = r10.z0(r13)     // Catch: java.lang.Throwable -> Lab
            if (r11 == 0) goto L69
            if (r14 == 0) goto L51
            boolean r11 = r14.contains(r3)     // Catch: java.lang.Throwable -> Lab
            if (r11 != r8) goto L51
            r11 = r8
            goto L52
        L51:
            r11 = r9
        L52:
            if (r11 != 0) goto L5e
            com.tencent.mm.plugin.finder.extension.reddot.ua r11 = r12.f105977e     // Catch: java.lang.Throwable -> Lab
            com.tencent.mm.plugin.finder.extension.reddot.l5 r11 = (com.tencent.mm.plugin.finder.extension.reddot.l5) r11     // Catch: java.lang.Throwable -> Lab
            boolean r10 = r11.C(r3, r10)     // Catch: java.lang.Throwable -> Lab
            if (r10 != 0) goto L69
        L5e:
            com.tencent.mm.plugin.finder.extension.reddot.y8 r10 = com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a     // Catch: java.lang.Throwable -> Lab
            java.lang.String r11 = "collectFindTabRedDot"
            boolean r10 = r10.a(r11, r3)     // Catch: java.lang.Throwable -> Lab
            if (r10 == 0) goto L69
            goto L6a
        L69:
            r8 = r9
        L6a:
            if (r8 == 0) goto L32
            r5.add(r7)     // Catch: java.lang.Throwable -> Lab
            goto L32
        L70:
            monitor-exit(r4)
            monitor-enter(r5)
            int r4 = r5.size()     // Catch: java.lang.Throwable -> La8
            java.util.ListIterator r4 = r5.listIterator(r4)     // Catch: java.lang.Throwable -> La8
        L7a:
            boolean r6 = r4.hasPrevious()     // Catch: java.lang.Throwable -> La8
            if (r6 == 0) goto L93
            java.lang.Object r6 = r4.previous()     // Catch: java.lang.Throwable -> La8
            r7 = r6
            com.tencent.mm.plugin.finder.extension.reddot.jb r7 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r7     // Catch: java.lang.Throwable -> La8
            r45.f03 r7 = r7.I0(r3)     // Catch: java.lang.Throwable -> La8
            if (r7 == 0) goto L8f
            r7 = r8
            goto L90
        L8f:
            r7 = r9
        L90:
            if (r7 == 0) goto L7a
            goto L94
        L93:
            r6 = r1
        L94:
            monitor-exit(r5)
            com.tencent.mm.plugin.finder.extension.reddot.jb r6 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r6
            if (r6 == 0) goto L12
            if (r2 != 0) goto La0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        La0:
            java.lang.Object r3 = r2.put(r3, r6)
            com.tencent.mm.plugin.finder.extension.reddot.jb r3 = (com.tencent.mm.plugin.finder.extension.reddot.jb) r3
            goto L12
        La8:
            r13 = move-exception
            monitor-exit(r5)
            throw r13
        Lab:
            r13 = move-exception
            monitor-exit(r4)
            throw r13
        Lae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.d8.d(java.lang.String, java.util.List):java.util.HashMap");
    }

    @Override // zy2.ia
    public void d0(r45.qk2 finderNotice) {
        kotlin.jvm.internal.o.g(finderNotice, "finderNotice");
        zy2.fa.D(this, (r45.vs2) finderNotice.getCustom(1), "notifyNotice", null, true, null, 20, null);
    }

    @Override // zy2.fa
    public boolean e(int i17, java.lang.String username, yz5.l filter) {
        java.lang.String str;
        java.util.HashSet hashSet;
        boolean z17;
        java.util.HashMap hashMap;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(filter, "filter");
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi() && !com.tencent.mm.plugin.finder.extension.reddot.f3.a(java.lang.Integer.valueOf(i17))) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[clearCtrlInfo] 青少年模式且只看关注的模式下只clear关注的红点展示");
            return false;
        }
        java.util.HashMap h17 = h1(i17, filter, username);
        boolean z18 = true;
        if (!h17.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[clearCtrlInfo] type=" + i17 + " removeRedDot clearMap=" + h17);
        }
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (java.util.Map.Entry entry : h17.entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.util.List list = (java.util.List) this.D.get(str2);
            if (list != null) {
                pm0.v.G(list, new com.tencent.mm.plugin.finder.extension.reddot.i7(entry));
            }
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : (java.lang.Iterable) entry.getValue()) {
                if (!hashSet2.contains(jbVar)) {
                    l75.e0 e0Var = com.tencent.mm.plugin.finder.extension.reddot.jb.Q;
                    jbVar.A0(this.f105460m, z18);
                    hashSet2.add(jbVar);
                }
            }
            jz5.f0 f0Var = null;
            boolean p17 = p(str2, null);
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this, str2, username, false, false, 12, null);
            if (S0 != null) {
                r45.f03 I0 = S0.I0(str2);
                if (I0 != null ? z18 : false) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    str = str2;
                    hashSet = hashSet2;
                    z17 = z18;
                    hashMap = h17;
                    aaVar.a("clearCtrlInfo2_show", false, str2, null, null, username, p17);
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, "clearCtrlInfo2_show", true, str, I0, S0, null, p(str, S0), 32, null);
                } else {
                    str = str2;
                    hashSet = hashSet2;
                    z17 = z18;
                    hashMap = h17;
                    com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("clearCtrlInfo2", false, str2, null, null, username, p17);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                str = str2;
                hashSet = hashSet2;
                z17 = z18;
                hashMap = h17;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("clearCtrlInfo2_null", false, str, null, null, username, p17);
            }
            z18 = z17;
            h17 = hashMap;
            hashSet2 = hashSet;
        }
        return h17.isEmpty() ^ z18;
    }

    @Override // zy2.la
    public zy2.ga e0() {
        return null;
    }

    @Override // zy2.ia
    public java.util.LinkedList f(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.util.HashMap h17 = h1(i17, com.tencent.mm.plugin.finder.extension.reddot.q7.f105788d, username);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = h17.entrySet().iterator();
        while (it.hasNext()) {
            linkedList.addAll((java.util.Collection) ((java.util.Map.Entry) it.next()).getValue());
        }
        return linkedList;
    }

    @Override // zy2.ia
    public boolean f0() {
        return ((vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class))).wi();
    }

    public final java.util.HashSet f1(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.a7 a7Var) {
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        boolean z18;
        boolean z19;
        java.lang.String str4;
        java.lang.StringBuilder sb6;
        jz5.f0 f0Var;
        java.util.List list;
        java.lang.String str5;
        java.lang.String str6;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2;
        java.lang.StringBuilder sb7;
        java.lang.String str7;
        boolean z27;
        java.util.HashSet hashSet = new java.util.HashSet();
        r45.vs2 vs2Var = jbVar.field_ctrInfo;
        if (vs2Var == null || (str2 = vs2Var.f388496q) == null) {
            str2 = "";
        }
        java.lang.String str8 = str2;
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[buildPathWithCtrInfo] source=" + str + " username=" + str8 + ' ' + hc2.u0.e(jbVar.field_ctrInfo) + " revokeId=" + jbVar.field_revokeId);
        if (com.tencent.mars.xlog.Log.isDebug()) {
            jbVar.W0().getString(5);
            java.lang.String str9 = jbVar.field_ctrInfo.f388499t;
        }
        java.util.Iterator it = jbVar.J0().iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String str10 = (java.lang.String) it.next();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.D;
            java.util.List list2 = (java.util.List) concurrentHashMap.get(str10);
            if (list2 == null) {
                list2 = java.util.Collections.synchronizedList(new java.util.LinkedList());
                kotlin.jvm.internal.o.d(list2);
                concurrentHashMap.put(str10, list2);
            }
            if (jbVar.z0(str8)) {
                pm0.v.G(list2, new com.tencent.mm.plugin.finder.extension.reddot.b7(jbVar));
                list2.add(jbVar);
                kz5.g0.t(list2, mz5.a.a(com.tencent.mm.plugin.finder.extension.reddot.c7.f105443d, com.tencent.mm.plugin.finder.extension.reddot.d7.f105459d));
                hashSet.add(str10);
            }
        }
        java.lang.String str11 = jbVar.field_revokeId;
        if (str11 != null) {
            this.E.put(str11, jbVar);
        }
        java.lang.String str12 = "expose_cnt";
        if ((!hashSet.isEmpty()) && ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).m()) {
            com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
            com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            e42.c0 c0Var = e42.c0.clicfg_finder_reddot_add_freq_ctrl_expose_liimt_check_opt;
            if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
                z18 = true;
            } else {
                java.lang.String str13 = com.tencent.mm.sdk.platformtools.z.f193105a;
                z18 = false;
            }
            if (z18 || z65.c.a()) {
                z19 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z19 = false;
            }
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "是否优化新加红点时判断红点超过同屏x个限制检查", c0Var, java.lang.Boolean.valueOf(z19), false, com.tencent.mm.plugin.finder.storage.wf0.f128251d, 8, null)).booleanValue()) {
                java.util.List e17 = com.tencent.mm.plugin.finder.extension.reddot.l5.H.e();
                if (!hashSet.isEmpty()) {
                    java.util.Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        if (e17.contains((java.lang.String) it6.next())) {
                            z27 = true;
                            break;
                        }
                    }
                }
                z27 = false;
                if (!z27) {
                    com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[buildPathWithCtrInfo] not need simul expose check,changePath=" + hashSet + '!');
                    str3 = "expose_cnt";
                }
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("removeRedDotOutOfMaxExpose");
            jz5.l n17 = ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).n(sb8, true);
            java.lang.String str14 = "[buildPathWithCtrInfo] ";
            if (n17 != null) {
                java.util.List list3 = (java.util.List) n17.f302833d;
                java.util.List<java.util.Map.Entry> list4 = (java.util.List) n17.f302834e;
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                linkedList2.addAll(list3);
                linkedList2.addAll(list4);
                for (java.util.Map.Entry entry : list4) {
                    boolean contains = hashSet.contains(entry.getKey()) ^ z17;
                    java.lang.String str15 = (java.lang.String) entry.getKey();
                    com.tencent.mm.plugin.finder.extension.reddot.i4 i4Var = (com.tencent.mm.plugin.finder.extension.reddot.i4) entry.getValue();
                    java.lang.StringBuilder sb9 = sb8;
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = i4Var.f105587a;
                    java.util.LinkedList linkedList3 = linkedList2;
                    if (a7Var != com.tencent.mm.plugin.finder.extension.reddot.a7.f105343e || contains) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put(str12, java.lang.Integer.valueOf(i4Var.f105589c));
                        com.tencent.mm.plugin.finder.extension.reddot.sb.a("red_dot_abandon_simul", jbVar3, hashMap);
                    } else {
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put(str12, java.lang.Integer.valueOf(i4Var.f105589c));
                        com.tencent.mm.plugin.finder.extension.reddot.sb.a("red_dot_ban_when_rece_simul", jbVar3, hashMap2);
                    }
                    java.lang.String str16 = a7Var + "_buildPathWithCtrInfo_" + jbVar3.field_tips_uuid;
                    if (com.tencent.mm.plugin.finder.extension.reddot.z2.f106043c.a(str15)) {
                        linkedList = linkedList3;
                        str7 = str16;
                        list = list3;
                        str5 = str14;
                        str6 = str12;
                        for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar4 : zy2.ia.Y(this, str16, str15, null, 4, null)) {
                            hashSet.removeAll(kz5.n0.X0(jbVar4.J0()));
                            o0(str7, jbVar4);
                        }
                        sb7 = sb9;
                        jbVar2 = jbVar3;
                    } else {
                        list = list3;
                        str5 = str14;
                        str6 = str12;
                        linkedList = linkedList3;
                        r45.f03 I0 = jbVar3.I0(str15);
                        com.tencent.mm.plugin.finder.extension.reddot.w7 w7Var = com.tencent.mm.plugin.finder.extension.reddot.w7.f105968d;
                        g92.b bVar2 = g92.b.f269769e;
                        jbVar2 = jbVar3;
                        sb7 = sb9;
                        str7 = str16;
                        java.util.HashSet n18 = n1(str16, str15, w7Var, false, bVar2.T0());
                        if (contains) {
                            sb7.append(" dispose " + str15 + "; removePathSet=" + n18 + ';');
                            m1(str7, n18, bVar2.T0(), jbVar2, I0);
                        } else {
                            sb7.append(" remove " + str15 + "; removePathSet=" + n18 + ';');
                            hashSet.remove(str15);
                        }
                    }
                    ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).H(str7, str15, jbVar2, linkedList, list);
                    sb8 = sb7;
                    linkedList2 = linkedList;
                    list3 = list;
                    str14 = str5;
                    str12 = str6;
                    z17 = true;
                }
                sb6 = sb8;
                str3 = str12;
                str4 = str14;
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder(str4);
                sb6.append(" final changePath=" + hashSet + ')');
                sb10.append((java.lang.Object) sb6);
                com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb10.toString());
                f0Var = jz5.f0.f302826a;
            } else {
                str4 = "[buildPathWithCtrInfo] ";
                sb6 = sb8;
                str3 = "expose_cnt";
                f0Var = null;
            }
            if (f0Var == null) {
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder(str4);
                sb6.append(" findOutOfMaxExposeList is null!");
                sb11.append((java.lang.Object) sb6);
                com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb11.toString());
            }
        } else {
            str3 = "expose_cnt";
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[buildPathWithCtrInfo] disable simul expose check,changePath=" + hashSet + '!');
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            java.lang.String str17 = (java.lang.String) it7.next();
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = str8.length() == 0 ? zy2.ia.S0(this, str17, g92.b.f269769e.T0(), false, false, 12, null) : zy2.ia.S0(this, str17, str8, false, false, 12, null);
            r45.f03 I02 = S0 != null ? S0.I0(str17) : null;
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("[buildPathWithCtrInfo] source=");
            sb12.append(str);
            sb12.append(' ');
            sb12.append(S0 != null ? S0.field_tipsId : null);
            sb12.append(" ,path:");
            sb12.append(I02 != null ? I02.f373892i : null);
            sb12.append('(');
            sb12.append(str17);
            sb12.append(") businessType=");
            sb12.append(S0 != null ? java.lang.Integer.valueOf(S0.field_businessType) : null);
            sb12.append(" count:");
            sb12.append(I02 != null ? java.lang.Integer.valueOf(I02.f373888e) : null);
            sb12.append(" clearType:");
            sb12.append(I02 != null ? java.lang.Integer.valueOf(I02.f373891h) : null);
            sb12.append(" parent:");
            sb12.append(I02 != null ? I02.f373893m : null);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb12.toString());
            if (S0 != null && I02 != null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "buildPathWithCtrInfo", true, str17, I02, S0, null, p(str17, S0), 32, null);
            }
        }
        if (a7Var == com.tencent.mm.plugin.finder.extension.reddot.a7.f105343e && (!hashSet.isEmpty())) {
            java.util.Iterator it8 = hashSet.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                java.lang.String str18 = (java.lang.String) it8.next();
                if (p(str18, jbVar)) {
                    java.lang.Integer k17 = ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).k(com.tencent.mm.plugin.finder.extension.reddot.l5.H.c(str18, jbVar));
                    java.util.HashMap hashMap3 = new java.util.HashMap();
                    hashMap3.put(str3, java.lang.Integer.valueOf(k17 != null ? k17.intValue() : 0));
                    com.tencent.mm.plugin.finder.extension.reddot.sb.a("red_dot_ban_when_rece", jbVar, hashMap3);
                    com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[buildPathWithCtrInfo] source=" + str + " path:" + str18 + " is ban, exposeCnt:" + k17);
                }
            }
        }
        return hashSet;
    }

    @Override // zy2.fa
    public void g(java.lang.String groupId) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.D.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Iterable<com.tencent.mm.plugin.finder.extension.reddot.jb> iterable = (java.lang.Iterable) ((java.util.Map.Entry) it.next()).getValue();
            synchronized (iterable) {
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : iterable) {
                    if (kotlin.jvm.internal.o.b(jbVar.field_ctrInfo.f388500u, groupId)) {
                        arrayList.add(jbVar);
                    }
                }
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            L((com.tencent.mm.plugin.finder.extension.reddot.jb) it6.next());
        }
    }

    @Override // zy2.fa
    public void g0(com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, java.lang.String path, boolean z17, java.lang.String str) {
        java.lang.String str2;
        jz5.f0 f0Var;
        java.util.List list;
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(path, "path");
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
        r45.f03 I0 = ctrlInfo.I0(path);
        java.util.LinkedList q17 = com.tencent.mm.plugin.finder.extension.reddot.jb.q1(ctrlInfo, path, z17, 0, str, 4, null);
        boolean z18 = true;
        if (ctrlInfo.n1(this.f105460m, true)) {
            hashSet.addAll(q17);
        }
        if (ctrlInfo.h1() && (list = (java.util.List) this.D.get(path)) != null) {
            list.remove(ctrlInfo);
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[clearShowInfoAtCtrlInfo] path=" + path + " tipsId=" + ctrlInfo.field_tipsId + " removePathSet=" + hashSet + " , maybeRemoveShowInfo=" + hc2.z0.b(I0, 0));
        for (java.lang.String str3 : hashSet) {
            boolean p17 = p(str3, ctrlInfo);
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = L0(str3);
            if (L0 != null) {
                r45.f03 I02 = L0.I0(str3);
                if (I02 != null ? z18 : false) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    str2 = str3;
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, "clearShowInfoAtCtrlInfo_show", false, str3, I0, ctrlInfo, null, p17, 32, null);
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, "clearShowInfoAtCtrlInfo_show", true, str2, I02, L0, null, p(path, L0), 32, null);
                } else {
                    str2 = str3;
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "clearShowInfoAtCtrlInfo", false, str2, I0, ctrlInfo, null, p17, 32, null);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                str2 = str3;
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, "clearShowInfoAtCtrlInfo_null", false, str2, I0, ctrlInfo, null, p17, 32, null);
            }
            z18 = true;
        }
    }

    public final java.util.List g1(java.lang.String str, java.util.List list, java.lang.String str2, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        if ((list == null || list.isEmpty()) || !z18 || !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).m()) {
            return list;
        }
        java.util.HashMap d17 = d(g92.b.f269769e.T0(), z17 ? kz5.b0.c(str2) : null);
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).E(str, str2, (com.tencent.mm.plugin.finder.extension.reddot.jb) obj, d17)) {
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
        boolean l17 = ctrlInfo.l1(path, j17, z17);
        if (l17) {
            com.tencent.mm.plugin.finder.extension.reddot.jb.o1(ctrlInfo, this.f105460m, false, 2, null);
        }
        return l17;
    }

    @Override // zy2.ia
    public boolean h0(int i17) {
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r07 = r0(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[containsTabTipsExtInfo] tabType=");
        sb6.append(i17);
        sb6.append(" isContains=");
        sb6.append(r07.getInteger(2) != 0);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb6.toString());
        return r07.getInteger(2) != 0;
    }

    public final java.util.HashMap h1(int i17, yz5.l filter, java.lang.String username) {
        kotlin.jvm.internal.o.g(filter, "filter");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "getCtrlInfoMap type:" + i17 + " username=" + username);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.D.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Iterable<com.tencent.mm.plugin.finder.extension.reddot.jb> iterable = (java.lang.Iterable) entry.getValue();
            synchronized (iterable) {
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : iterable) {
                    if (jbVar.F0(username) && (jbVar.field_ctrInfo.f388487e == i17 || i17 == Integer.MIN_VALUE)) {
                        if (((java.lang.Boolean) filter.invoke(jbVar)).booleanValue()) {
                            java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(str);
                            if (linkedList == null) {
                                linkedList = new java.util.LinkedList();
                                hashMap.put(str, linkedList);
                            }
                            linkedList.add(jbVar);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // zy2.ia
    public com.tencent.mm.plugin.finder.extension.reddot.jb i(java.lang.String path, java.lang.String str, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.o.g(path, "path");
        java.util.List list = (java.util.List) this.D.get(path);
        java.lang.Object obj = null;
        if (list != null) {
            synchronized (list) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) obj2;
                    boolean z19 = jbVar.z0(str) && com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a.a("ctrlInfoAtPath", path) && !jbVar.d1(path, "ctrlInfoAtPath");
                    if (z17) {
                        z19 = z19 && !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).C(path, jbVar);
                    }
                    if (z19) {
                        arrayList2.add(obj2);
                    }
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.lang.Integer valueOf = arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null;
        java.util.List g17 = g1("ctrlInfoAtPath", arrayList, path, z17, z18);
        java.lang.Integer valueOf2 = g17 != null ? java.lang.Integer.valueOf(g17.size()) : null;
        if (g17 == null && ((java.lang.Boolean) ((jz5.n) this.f105973a).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "ctrlInfoAtPath " + path + " but reddot is null!");
        } else if (((java.lang.Boolean) ((jz5.n) this.f105973a).getValue()).booleanValue()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ctrlInfoAtPath path=");
            sb6.append(path);
            sb6.append(" originSize=");
            sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            sb6.append(" firstFilterSize=");
            sb6.append(valueOf);
            sb6.append(" secondFilterSize=");
            sb6.append(valueOf2);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb6.toString());
        }
        if (g17 == null) {
            return null;
        }
        synchronized (g17) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                java.lang.Object previous = listIterator.previous();
                if (((com.tencent.mm.plugin.finder.extension.reddot.jb) previous).I0(path) != null) {
                    obj = previous;
                    break;
                }
            }
        }
        return (com.tencent.mm.plugin.finder.extension.reddot.jb) obj;
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
        return (com.tencent.mm.plugin.finder.extension.reddot.e1) ((jz5.n) this.f105462o).getValue();
    }

    @Override // zy2.la
    public void j() {
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "onAccountChange");
    }

    @Override // zy2.ia
    public zy2.ma j0() {
        return this.f105461n;
    }

    public final boolean j1() {
        return ((java.lang.Boolean) ((jz5.n) this.f105470w).getValue()).booleanValue();
    }

    @Override // zy2.ia
    public void k(androidx.recyclerview.widget.RecyclerView swipeView, int i17) {
        kotlin.jvm.internal.o.g(swipeView, "swipeView");
        ((com.tencent.mm.plugin.finder.extension.reddot.la) ((jz5.n) this.f105467t).getValue()).a(swipeView, i17);
    }

    @Override // zy2.la
    public void k0() {
        kc2.g1 b17 = b1();
        if (b17 != null) {
            com.tencent.mm.app.w.INSTANCE.p((kc2.r) ((jz5.n) b17.f306380d).getValue());
        }
        com.tencent.mm.plugin.finder.extension.reddot.w3 w3Var = this.f105465r;
        if (w3Var != null) {
            com.tencent.mm.app.w.INSTANCE.p(w3Var);
        }
        com.tencent.mm.plugin.finder.extension.reddot.oa oaVar = this.f105464q;
        oaVar.f105754b.dead();
        oaVar.f105755c.dead();
    }

    public final void k1(java.lang.String str, int i17, java.lang.String str2) {
        boolean z17;
        boolean z18;
        boolean z19;
        java.util.List<com.tencent.mm.plugin.finder.extension.reddot.jb> O0 = zy2.fa.O0(this, "Discovery", str2, false, false, 12, null);
        synchronized (O0) {
            z17 = false;
            z18 = false;
            z19 = false;
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : O0) {
                if (!jbVar.y0(str)) {
                    z18 = true;
                } else if (jbVar.field_ctrInfo.f388486d <= i17) {
                    z19 = true;
                }
            }
        }
        if (z18 && z19) {
            synchronized (O0) {
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 : O0) {
                    if (jbVar2.y0(str)) {
                        zy2.fa.J0(this, jbVar2, "Discovery", true, null, 8, null);
                    }
                }
            }
        } else {
            z17 = z19;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "handleClearDiscoveryRedDot isClear:" + z17 + ", hasOtherPath:" + z18 + ", ctrlInfoByPath:" + O0 + ", path:" + str);
        if (z17) {
            X("Discovery", com.tencent.mm.plugin.finder.extension.reddot.r7.f105806d, true, str2);
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
        com.tencent.mm.plugin.finder.extension.reddot.jb.o1(L0, this.f105460m, false, 2, null);
        return u07;
    }

    public final void m1(java.lang.String str, java.util.HashSet hashSet, java.lang.String str2, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        java.lang.String str3;
        jz5.f0 f0Var;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            boolean p17 = p(str4, jbVar);
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this, str4, str2, false, false, 12, null);
            if (S0 != null) {
                r45.f03 I0 = S0.I0(str4);
                if (I0 != null) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    str3 = str4;
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, str + " disposeRedDotAtPath_show", false, str4, f03Var, jbVar, null, p17, 32, null);
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, str + " disposeRedDotAtPath_show", true, str3, I0, S0, null, p(str3, S0), 32, null);
                } else {
                    str3 = str4;
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, str + " disposeRedDotAtPath", false, str3, f03Var, jbVar, null, p17, 32, null);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                str3 = str4;
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.b(com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a, str + " disposeRedDotAtPath_null", false, str3, f03Var, jbVar, null, p17, 32, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if ((r13 != null ? r13.I0("finder_tl_city_tab") : null) != null) goto L26;
     */
    @Override // zy2.la
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.d8.n(int, boolean):void");
    }

    public final java.util.HashSet n1(java.lang.String str, java.lang.String str2, yz5.l lVar, boolean z17, java.lang.String str3) {
        java.lang.Object obj;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(str2);
        java.util.List list = (java.util.List) this.D.get(str2);
        if (list != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) it.next();
                    java.util.Iterator it6 = this.G.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it6.next();
                        if (((java.lang.Boolean) ((yz5.l) obj).invoke(jbVar)).booleanValue()) {
                            break;
                        }
                    }
                    if (((yz5.l) obj) == null && ((java.lang.Boolean) lVar.invoke(jbVar)).booleanValue()) {
                        java.util.LinkedList q17 = com.tencent.mm.plugin.finder.extension.reddot.jb.q1(jbVar, str2, z17, 0, str3, 4, null);
                        if (q17.size() > 0 && jbVar.n1(this.f105460m, true)) {
                            hashSet.addAll(q17);
                        }
                        if (jbVar.h1()) {
                            it.remove();
                        }
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", str + " removeRedDotAtPath path=" + str2 + " removePathSet=" + hashSet + " hash=" + hashCode() + ' ' + j40.o.f297604a.b());
        return hashSet;
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
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", sb6.toString());
        pm0.v.O("Finder.RedDotManager", new com.tencent.mm.plugin.finder.extension.reddot.b8(revoke, this));
    }

    @Override // zy2.ia
    public void o0(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        Z0().c(source, ctrlInfo);
    }

    @Override // zy2.fa
    public boolean p(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        return ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).C(str, jbVar);
    }

    @Override // zy2.la
    public void p0() {
        this.f105471x = c01.id.c() - this.f105472y;
        Z0().f106045b = false;
        if (this.A && this.f105473z == 2 && this.f105471x <= ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderFastEnterTime", 0) * 1000) {
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0) + 1;
            if (r17 > 3) {
                r17 = 3;
            }
            com.tencent.mars.xlog.Log.w("Finder.RedDotManager", "[exitFinder] current fastLevel=" + r17);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, java.lang.Integer.valueOf(r17));
        } else if (this.f105471x > ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderFastEnterTime", 0) * 1000) {
            com.tencent.mars.xlog.Log.w("Finder.RedDotManager", "[exitFinder] revert fastLevel=0");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033d  */
    @Override // zy2.la
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void prepare() {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.d8.prepare():void");
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
        com.tencent.mm.plugin.finder.extension.reddot.z6 z6Var = (com.tencent.mm.plugin.finder.extension.reddot.z6) this.H.remove(path);
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[clearEnterTabTipsExtInfo] path=" + path + " result=" + z6Var + " source=" + source);
        if (z6Var != null) {
            return z6Var.f106068a;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.x2, zy2.la
    public void r(com.tencent.mm.plugin.finder.extension.reddot.b3 actionType, com.tencent.mm.ui.base.preference.h0 h0Var) {
        kotlin.jvm.internal.o.g(actionType, "actionType");
        super.r(actionType, h0Var);
        if (((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).f105657i) {
            this.f105977e = new com.tencent.mm.plugin.finder.extension.reddot.l5(this, ((c61.l7) i95.n0.c(c61.l7.class)).mk());
        }
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).i(actionType, h0Var);
        ((com.tencent.mm.plugin.finder.extension.reddot.v) ((jz5.n) this.f105468u).getValue()).a();
    }

    @Override // zy2.ia
    public com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo r0(int i17) {
        com.tencent.mm.protocal.protobuf.FinderTipsShowEntranceExtInfo t17 = t(com.tencent.mm.plugin.finder.extension.reddot.ba.a(i17));
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[getTabTipsExtInfo] tabType=" + i17 + " extInfo{tab_type=" + t17.getInteger(2) + " object_id=" + pm0.v.u(t17.getLong(0)) + '}');
        return t17;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.x2, zy2.la
    public void s(com.tencent.mm.ui.base.preference.r screen, com.tencent.mm.ui.base.preference.Preference pref, com.tencent.mm.ui.base.preference.n0 source) {
        kotlin.jvm.internal.o.g(screen, "screen");
        kotlin.jvm.internal.o.g(pref, "pref");
        kotlin.jvm.internal.o.g(source, "source");
        super.s(screen, pref, source);
        ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).G(screen, pref, source);
        Y0(true, "clickEntry");
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
        ((com.tencent.mm.plugin.finder.extension.reddot.x3) ((jz5.n) this.f105466s).getValue()).b(resp);
    }

    @Override // zy2.ia
    public com.tencent.mm.plugin.finder.extension.reddot.jb u0() {
        return this.C;
    }

    @Override // zy2.ia
    public boolean v() {
        vd0.o2 o2Var = (vd0.o2) ((wd0.s1) i95.n0.c(wd0.s1.class));
        o2Var.getClass();
        return (((c01.z1.h() & 8192) > 8192L ? 1 : ((c01.z1.h() & 8192) == 8192L ? 0 : -1)) != 0) || o2Var.Ai();
    }

    @Override // zy2.ia
    public void v0() {
        com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "updateFindMoreFriendUI");
        ((ey2.h) pf5.u.f353936a.e(c61.l7.class).a(ey2.h.class)).O6();
    }

    @Override // zy2.fa
    public void w(r45.vs2 local, java.lang.String source) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(local, "local");
        kotlin.jvm.internal.o.g(source, "source");
        int i17 = local.f388487e;
        java.lang.String str2 = local.f388496q;
        if (str2 == null) {
            str2 = "";
        }
        jz5.l A0 = A0(local);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.util.Map.Entry entry : this.D.entrySet()) {
            synchronized (entry.getValue()) {
                java.lang.String str3 = (java.lang.String) entry.getKey();
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) it.next();
                    if (jbVar.field_ctrInfo.f388487e == i17 && jbVar.F0(str2)) {
                        java.lang.Object obj = hashMap.get(str3);
                        if (obj == null) {
                            obj = new java.util.LinkedList();
                            hashMap.put(str3, obj);
                        }
                        ((java.util.LinkedList) obj).add(jbVar);
                        it.remove();
                    }
                }
            }
        }
        if (!hashMap.isEmpty()) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotManager", "[reBuildPathWithCtrInfo] type=" + i17 + " clearMap=" + hashMap + " source=" + source);
        }
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        while (it6.hasNext()) {
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 : (java.lang.Iterable) ((java.util.Map.Entry) it6.next()).getValue()) {
                zy2.ba baVar = this.f105460m;
                l75.e0 e0Var = com.tencent.mm.plugin.finder.extension.reddot.jb.Q;
                jbVar2.A0(baVar, true);
            }
        }
        x0(local, source, new java.util.HashSet(), false, A0);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            if (!r10.contains(entry2.getKey())) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (java.util.Map.Entry entry3 : linkedHashMap.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry3.getKey();
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 : (java.lang.Iterable) entry3.getValue()) {
                zy2.ba baVar2 = this.f105460m;
                l75.e0 e0Var2 = com.tencent.mm.plugin.finder.extension.reddot.jb.Q;
                jbVar3.A0(baVar2, true);
            }
            java.lang.String str5 = local.f388496q;
            if (str5 == null) {
                str5 = "";
            }
            java.lang.String str6 = str5;
            jz5.f0 f0Var = null;
            boolean p17 = p(str4, null);
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(this, str4, local.f388496q, false, false, 12, null);
            if (S0 != null) {
                r45.f03 I0 = S0.I0(str4);
                if (I0 != null) {
                    com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                    str = str4;
                    aaVar.a("reBuildPathWithCtrInfo_show", false, str4, null, null, str6, p17);
                    com.tencent.mm.plugin.finder.extension.reddot.aa.b(aaVar, "reBuildPathWithCtrInfo_show", true, str, I0, S0, null, p(str, S0), 32, null);
                } else {
                    str = str4;
                    com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("reBuildPathWithCtrInfo", false, str, null, null, str6, p17);
                }
                f0Var = jz5.f0.f302826a;
            } else {
                str = str4;
            }
            if (f0Var == null) {
                com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a.a("reBuildPathWithCtrInfo_null", false, str, null, null, str6, p17);
            }
        }
    }

    @Override // zy2.fa
    public java.util.List w0(java.lang.String path, java.lang.String finderUserName, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry entry : this.D.entrySet()) {
            synchronized (entry.getValue()) {
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : (java.util.List) entry.getValue()) {
                    if (jbVar.F0(finderUserName) && jbVar.I0(path) != null && com.tencent.mm.plugin.finder.extension.reddot.y8.f106036a.a("getCtrlInfoByPath", path)) {
                        if (z17 ? !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).C(path, jbVar) : true) {
                            hashSet.add(jbVar);
                        }
                    }
                }
            }
        }
        if ((!hashSet.isEmpty()) && z18 && ((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).m()) {
            java.util.HashMap M = zy2.la.M(this, finderUserName, null, 2, null);
            java.util.Iterator it = hashSet.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                if (((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105977e).E("getCtrlInfoByPath", path, (com.tencent.mm.plugin.finder.extension.reddot.jb) next, M)) {
                    it.remove();
                }
            }
        }
        return kz5.n0.S0(hashSet);
    }

    @Override // zy2.ia
    public java.util.LinkedList x(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return ((com.tencent.mm.plugin.finder.extension.reddot.x3) ((jz5.n) this.f105466s).getValue()).a(source);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ef, code lost:
    
        if (r1 == null) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0278 A[EDGE_INSN: B:116:0x0278->B:117:0x0278 BREAK  A[LOOP:3: B:103:0x024a->B:123:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[LOOP:3: B:103:0x024a->B:123:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    @Override // zy2.fa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.extension.reddot.jb x0(r45.vs2 r29, java.lang.String r30, java.util.HashSet r31, boolean r32, jz5.l r33) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.d8.x0(r45.vs2, java.lang.String, java.util.HashSet, boolean, jz5.l):com.tencent.mm.plugin.finder.extension.reddot.jb");
    }

    @Override // zy2.ia
    public java.util.Set y(java.lang.String path, java.lang.String username) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        return zy2.ia.E0(this, path, com.tencent.mm.plugin.finder.extension.reddot.k7.f105629d, false, username, 4, null);
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
            nc2.g.f336108a.b("Finder.RedDotManager", "#setEnableShowFinderLiveEntranceRedDot");
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ENABLE_SHOW_ENTRANCE_REDDOT_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }
}

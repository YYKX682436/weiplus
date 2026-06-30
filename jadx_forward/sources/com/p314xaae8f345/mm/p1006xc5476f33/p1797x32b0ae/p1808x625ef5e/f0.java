package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e;

/* loaded from: classes15.dex */
public class f0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public static long f225465d;

    /* renamed from: e, reason: collision with root package name */
    public static long f225466e;

    static {
        e70.z zVar = (e70.z) i95.n0.c(e70.z.class);
        int i17 = e70.z.G0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c0 c0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.c0();
        d83.u uVar = (d83.u) zVar;
        uVar.getClass();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            uVar.Di();
            uVar.Ni();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = uVar.f308570o;
            if (concurrentHashMap.containsKey("BIZ_TYPE_LITEAPP")) {
                return;
            }
            concurrentHashMap.put("BIZ_TYPE_LITEAPP", c0Var);
        }
    }

    public f0() {
        super(0);
    }

    public static boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.f0 f0Var) {
        java.lang.String str;
        java.lang.String str2;
        f0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p.f225682a.b(7, new com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943());
        if (j62.e.g().j("clicfg_liteapp_disable_update", "0", false, true).equalsIgnoreCase("1")) {
            return false;
        }
        boolean equalsIgnoreCase = j62.e.g().j("clicfg_liteapp_use_batch_update", "1", false, true).equalsIgnoreCase("1");
        com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 m65924x3e9425e = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1814x6a710b1.C16268x2bf8259f.INSTANCE.m65924x3e9425e("no");
        boolean l17 = j62.e.g().l("clicfg_liteapp_update_use_ilink", true, true, true);
        java.util.List asList = java.util.Arrays.asList(j62.e.g().j("clicfg_liteapp_use_raven_list", "", true, true).split(","));
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.HashSet hashSet3 = new java.util.HashSet();
        java.util.HashSet hashSet4 = new java.util.HashSet();
        hashSet4.add("wxalite2ceddca8b296458a527661862c5664b2");
        hashSet4.add("wxalite7b438b4916cd2a37426d5538ac2d3807");
        hashSet4.add("wxalitecd3434f9a28b4db218f4730961d39d55");
        hashSet4.add("wxalite1af500fa066e5b60505c414cd42cacbc");
        hashSet4.add("wxalite0c45e912005759856ea55eb382e8c509");
        hashSet4.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f225483d);
        if (!equalsIgnoreCase) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().h(m65924x3e9425e);
        } else if (asList.contains(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
            hashSet2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        } else {
            hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466);
        }
        java.util.Iterator it = hashSet4.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            if (!hashSet.contains(str3) && com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().F(str3, false)) {
                if (!equalsIgnoreCase) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(str3, false, 3, 60000L, null, null);
                } else if (asList.contains(str3)) {
                    hashSet2.add(str3);
                } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().I(str3)) {
                    hashSet3.add(str3);
                } else {
                    hashSet.add(str3);
                }
            }
        }
        java.util.List<com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441> A = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().A();
        if (A != null && !A.isEmpty()) {
            for (com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 c3712x3ed8a441 : A) {
                if (!"game".equals(c3712x3ed8a441.f14361x117d5bfa)) {
                    if (!((java.util.HashMap) q80.g0.f442215d1).containsKey(c3712x3ed8a441.f14359x58b7f1c)) {
                        if (!equalsIgnoreCase) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().l(c3712x3ed8a441.f14359x58b7f1c, false, 3, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d, null, null);
                        } else if (asList.contains(c3712x3ed8a441.f14359x58b7f1c)) {
                            hashSet2.add(c3712x3ed8a441.f14359x58b7f1c);
                        } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().I(c3712x3ed8a441.f14359x58b7f1c)) {
                            hashSet3.add(c3712x3ed8a441.f14359x58b7f1c);
                        } else {
                            hashSet.add(c3712x3ed8a441.f14359x58b7f1c);
                        }
                    }
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(hashSet3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashSet);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(hashSet2);
        if (!arrayList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "payAppIdList not empty, do batch");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f(arrayList, 60000L, m65924x3e9425e);
        } else if (j62.e.g().j("clicfg_enable_pay_lite_app_force_batch_android", "1", false, true).equals("1")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "payAppIdList empty, do force batch");
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s().f(arrayList, 60000L, m65924x3e9425e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "payAppIdList empty, do nothing");
        }
        int i17 = 50;
        if (equalsIgnoreCase && !arrayList2.isEmpty()) {
            if (l17) {
                arrayList3.addAll(arrayList2);
            } else {
                int i18 = 0;
                for (int i19 = 1; i18 <= arrayList2.size() - i19; i19 = 1) {
                    int size = arrayList2.size() - i18;
                    if (size > i17) {
                        size = i17;
                    }
                    int i27 = i18 + size;
                    java.util.List<java.lang.String> subList = arrayList2.subList(i18, i27);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1 s17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.g1.s();
                    s17.p();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    com.p314xaae8f345.p362xadfe2b3.gen.AbstractC3700xe41a2874 abstractC3700xe41a2874 = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y1 y1Var = null;
                    for (java.lang.String str4 : subList) {
                        if (str4.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466)) {
                            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3710x879b31ef u17 = s17.u(abstractC3700xe41a2874);
                            if (s17.G(u17)) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y1 y1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.y1(s17);
                                java.lang.String str5 = (u17 == null || (str2 = u17.f14329xd0d13783) == null || str2.isEmpty()) ? "" : u17.f14329xd0d13783;
                                oq1.r rVar = new oq1.r();
                                rVar.f428901a = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466;
                                rVar.f428902b = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37141xc474b466;
                                rVar.f428903c = str5;
                                arrayList4.add(rVar);
                                y1Var = y1Var2;
                            }
                        } else {
                            com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441 y17 = s17.y(str4, abstractC3700xe41a2874);
                            if (s17.H(y17)) {
                                if (s17.m(str4, y17, false, 3, 60000L, null, null)) {
                                    java.lang.String str6 = (y17 == null || (str = y17.f14368xd0d13783) == null || str.isEmpty()) ? "" : y17.f14368xd0d13783;
                                    oq1.r rVar2 = new oq1.r();
                                    rVar2.f428901a = str4;
                                    rVar2.f428902b = str4;
                                    rVar2.f428903c = str6;
                                    arrayList4.add(rVar2);
                                }
                                abstractC3700xe41a2874 = null;
                            }
                        }
                        abstractC3700xe41a2874 = null;
                    }
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap(s17.f225484e);
                    if (arrayList4.isEmpty()) {
                        i18 = i27;
                    } else {
                        s17.M(subList, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55702xce94d634, true);
                        if (m65924x3e9425e != null) {
                            m65924x3e9425e.mo28872x7725562c(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3703xde990546.BATCH_CHECK_PACKAGE_UPDATE, "Tinker");
                        }
                        oq1.l lVar = (oq1.l) i95.n0.c(oq1.l.class);
                        i18 = i27;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.i1 i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.i1(s17, concurrentHashMap, y1Var, subList, m65924x3e9425e);
                        ((nq1.d) lVar).getClass();
                        nq1.s sVar = (nq1.s) ((oq1.m) i95.n0.c(oq1.m.class));
                        sVar.m134976x2690a4ac();
                        sVar.f420504d.getClass();
                        gm0.j1.d().g(new z73.d(arrayList4, i1Var));
                    }
                    i17 = 50;
                }
            }
        }
        if (!equalsIgnoreCase || arrayList3.isEmpty()) {
            return false;
        }
        int i28 = 0;
        while (i28 <= arrayList3.size() - 1) {
            int size2 = arrayList3.size() - i28;
            if (size2 > 50) {
                size2 = 50;
            }
            int i29 = size2 + i28;
            arrayList3.subList(i28, i29);
            i28 = i29;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47 c5147x8f44fd47 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5147x8f44fd47) abstractC20979x809547d1;
        if (gm0.j1.a()) {
            try {
                ka3.u.f387620r.a().h(new org.json.JSONObject(), false, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "init in checkerListenr registerProxyService");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppLite.LiteAppCheckerListener", e17, "", new java.lang.Object[0]);
            }
            if (!c5147x8f44fd47.f135497g.f87945a) {
                if (gm0.j1.a()) {
                    ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
                    if (f225465d == 0) {
                        f225465d = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LITE_APP_UPDATE_LAST_TIME_LONG, 0L)).longValue();
                    }
                    if (f225466e == 0) {
                        f225466e = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LITE_APP_CLEAN_LAST_TIME_LONG, 0L)).longValue();
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    long j17 = currentTimeMillis - f225465d;
                    if (j17 >= 86400000 || j17 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's time to update lite app, duration:%d", java.lang.Long.valueOf(j17));
                        f225465d = currentTimeMillis;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LITE_APP_UPDATE_LAST_TIME_LONG, java.lang.Long.valueOf(currentTimeMillis));
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.d0(this));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's not time to update lite app. please wait %d second", java.lang.Long.valueOf((86400000 - j17) / 1000));
                    }
                    if (currentTimeMillis - f225466e >= 259200000) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's time to clean lite app.");
                        f225466e = currentTimeMillis;
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LITE_APP_CLEAN_LAST_TIME_LONG, java.lang.Long.valueOf(currentTimeMillis));
                        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1808x625ef5e.e0(this));
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppLite.LiteAppCheckerListener", "It's not time to clean lite app. please wait %d second", java.lang.Long.valueOf((86400000 - j17) / 100));
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppLite.LiteAppCheckerListener", "callback fail. account not ready.");
                }
            }
        }
        return false;
    }
}

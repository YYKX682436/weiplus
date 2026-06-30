package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f270416d = new java.util.HashMap();

    public f() {
        gm0.j1.n().f354821b.a(452, this);
    }

    public void a(int i17, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 h3Var) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h(this, i17, h3Var));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(final int i17, final int i18, final java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppCenterNetSceneService", "onSceneEnd, the scene is not a instance of NetSceneAppCenter");
            return;
        }
        final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v3 v3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v3) m1Var;
        java.util.Set set = (java.util.Set) ((java.util.HashMap) this.f270416d).get(java.lang.Integer.valueOf(v3Var.f270641f));
        if (set != null && set.size() > 0) {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.addAll(set);
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3 h3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.h3) it.next();
                if (h3Var != null && set.contains(h3Var)) {
                    h3Var.a(i17, i18, str, v3Var.f270642g);
                }
            }
        }
        fs.g.c(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m3.class, java.lang.Integer.valueOf(v3Var.f270641f), new fs.o(i17, i18, str, v3Var) { // from class: com.tencent.mm.pluginsdk.model.app.f$$a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f270417a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f270418b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.v3 f270419c;

            {
                this.f270419c = v3Var;
            }

            @Override // fs.o
            public final boolean a(fs.n nVar) {
                boolean z17;
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 u3Var = this.f270419c.f270642g;
                ((mt.t) ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m3) nVar)).getClass();
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5 c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5.c();
                c17.getClass();
                if (gm0.j1.a()) {
                    c17.f270676a = false;
                    if (u3Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SuggestionAppListLogic", "scene == null");
                    } else if (this.f270417a == 0 && this.f270418b == 0 && u3Var.b() == 4) {
                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z3 z3Var = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z3) u3Var;
                        int i19 = ((r45.uo3) z3Var.f270623d.f152244b.f152233a).f469059d;
                        java.util.LinkedList linkedList = z3Var.f270712e;
                        if (linkedList == null || linkedList.size() <= 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SuggestionAppListLogic", "empty suggestAppList");
                        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a == null || ap3.e.a() == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SuggestionAppListLogic", "wrong environment");
                        } else {
                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                            java.util.Iterator it6 = linkedList.iterator();
                            while (it6.hasNext()) {
                                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it6.next();
                                java.lang.String str2 = mVar.f67372x453d1e07;
                                linkedList2.add(mVar.f67370x28d45f97);
                            }
                            ((kt.a) ap3.e.a()).getClass();
                            zo3.p.Ni().c(linkedList2);
                            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (ap3.e.a() == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
                            } else {
                                ((kt.a) ap3.e.a()).getClass();
                                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
                                Ri.getClass();
                                android.database.Cursor m145256x1d3f4980 = Ri.m145256x1d3f4980("select * from AppInfo where status = 5 order by modifyTime asc", new java.lang.String[0]);
                                if (m145256x1d3f4980 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
                                    m145256x1d3f4980 = null;
                                }
                                if (m145256x1d3f4980 != null) {
                                    while (m145256x1d3f4980.moveToNext()) {
                                        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar2 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                                        mVar2.mo9015xbf5d97fd(m145256x1d3f4980);
                                        if (mVar2.f67391x10a0fed7 == 1) {
                                            if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.r(context, mVar2.f67370x28d45f97)) {
                                                mVar2.f67391x10a0fed7 = 4;
                                                ((kt.a) ap3.e.a()).getClass();
                                                zo3.p.Ri().mo9952xce0038c9(mVar2, new java.lang.String[0]);
                                            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar2.f67390xda9bc3b3)) {
                                                arrayList.add(mVar2);
                                            }
                                        } else if (mVar2.f67390xda9bc3b3 != null) {
                                            arrayList.add(mVar2);
                                        }
                                    }
                                    m145256x1d3f4980.close();
                                }
                            }
                            if (arrayList.size() > 0) {
                                ((kt.a) ap3.e.a()).getClass();
                                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri2 = zo3.p.Ri();
                                java.util.Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar3 = (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it7.next();
                                    if (mVar3.f67370x28d45f97 != null) {
                                        java.util.Iterator it8 = linkedList.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                z17 = false;
                                                break;
                                            }
                                            java.lang.String str3 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m) it8.next()).f67370x28d45f97;
                                            if (str3 != null && mVar3.f67370x28d45f97.equals(str3)) {
                                                z17 = true;
                                                break;
                                            }
                                        }
                                        if (!z17) {
                                            if (com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.q(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, mVar3)) {
                                                mVar3.f67391x10a0fed7 = 1;
                                            } else {
                                                mVar3.f67391x10a0fed7 = 4;
                                            }
                                            Ri2.mo9952xce0038c9(mVar3, new java.lang.String[0]);
                                        }
                                    }
                                }
                            }
                            gm0.j1.i();
                            gm0.j1.u().c().A(352275, java.lang.System.currentTimeMillis());
                            c17.f270680e = java.lang.System.currentTimeMillis();
                        }
                    }
                }
                return false;
            }
        });
    }
}

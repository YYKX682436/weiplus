package mt;

/* loaded from: classes8.dex */
public class q implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5 c17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.x5.c();
        c17.getClass();
        boolean a17 = gm0.j1.a();
        java.util.List list = c17.f270679d;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd account not ready");
            c17.f270681f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        c17.f270677b = false;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SuggestionAppListLogic", "scene == null");
            c17.f270681f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            c17.f270681f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "getServiceAppList onSceneEnd : errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.p314xaae8f345.mm.p944x882e457a.o oVar = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.y3) m1Var).f270691e;
        r45.pe4 pe4Var = (oVar == null || (fVar = oVar.f152244b.f152233a) == null) ? null : (r45.pe4) fVar;
        if (pe4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SuggestionAppListLogic", "resp == null");
            c17.f270681f = 0;
            ((java.util.LinkedList) list).clear();
            return;
        }
        java.util.LinkedList linkedList = pe4Var.f464515d;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SuggestionAppListLogic", "Service_appinfo empty");
            ((kt.a) ap3.e.a()).getClass();
            c17.f(zo3.p.Ri(), list);
            c17.f270681f = 0;
            ((java.util.LinkedList) list).clear();
            gm0.j1.i();
            gm0.j1.u().c().A(352276, java.lang.System.currentTimeMillis());
            c17.f270683h = java.lang.System.currentTimeMillis();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "offset = %d, count = %s", java.lang.Integer.valueOf(c17.f270681f), java.lang.Integer.valueOf(linkedList.size()));
        ((kt.a) ap3.e.a()).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.qe4 qe4Var = (r45.qe4) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "service info: %s, %s, %s, %s, %s, %s", qe4Var.f465430i, java.lang.Integer.valueOf(qe4Var.f465431m), java.lang.Integer.valueOf(qe4Var.f465435q), java.lang.Integer.valueOf(qe4Var.f465434p), java.lang.Integer.valueOf(qe4Var.f465432n), qe4Var.f465425d);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qe4Var.f465425d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qe4Var.f465430i)) {
                int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
                l75.e0 e0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m.f270516f2;
                boolean z17 = true;
                if ("wx3cc22b542de028d4".equals(qe4Var.f465425d)) {
                    qe4Var.f465432n = ~(qe4Var.f465432n ^ com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53182x14a8432);
                } else if ("wx6fa7e3bab7e15415".equals(qe4Var.f465425d)) {
                    if (qe4Var.f465435q <= 0) {
                        if (c01.z1.G() && c01.z1.m() == 0 && intValue == 1) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(965, 33);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(965, 35);
                        }
                    }
                } else if ("wxce6f23b478a3a2a2".equals(qe4Var.f465425d) && qe4Var.f465435q <= 0) {
                    if (c01.z1.G() && c01.z1.m() == 0 && intValue == 1) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(965, 32);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(965, 34);
                    }
                }
                ((java.util.LinkedList) list).add(qe4Var.f465425d);
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(qe4Var.f465425d);
                if (h17 != null) {
                    if (h17.f67387x8aa40beb == qe4Var.f465432n && h17.f67388x728ca6b == qe4Var.f465431m && h17.f319924x1 == qe4Var.f465434p && h17.f67389x84b4f099 == qe4Var.f465435q) {
                        java.lang.String str2 = h17.f67372x453d1e07;
                        if (str2 == null) {
                            str2 = "";
                        }
                        java.lang.String str3 = qe4Var.f465430i;
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str2.equals(str3)) {
                            java.lang.String str4 = h17.f67373x634ac1e1;
                            if (str4 == null) {
                                str4 = "";
                            }
                            java.lang.String str5 = qe4Var.f465426e;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (str4.equals(str5)) {
                                java.lang.String str6 = h17.f67375x634ac3bb;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                java.lang.String str7 = qe4Var.f465427f;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                if (str6.equals(str7)) {
                                    java.lang.String str8 = h17.f67374x634ac23b;
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    java.lang.String str9 = qe4Var.f465439u;
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    if (str8.equals(str9)) {
                                        java.lang.String str10 = h17.f319908l1;
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        java.lang.String str11 = qe4Var.f465429h;
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        if (str10.equals(str11)) {
                                            java.lang.String str12 = h17.f319926y0;
                                            if (str12 == null) {
                                                str12 = "";
                                            }
                                            java.lang.String str13 = qe4Var.f465428g;
                                            if (str13 == null) {
                                                str13 = "";
                                            }
                                            if (str12.equals(str13)) {
                                                java.lang.String str14 = h17.f319914p1;
                                                if (str14 == null) {
                                                    str14 = "";
                                                }
                                                java.lang.String str15 = qe4Var.f465433o;
                                                if (str15 == null) {
                                                    str15 = "";
                                                }
                                                if (str14.equals(str15)) {
                                                    z17 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (z17) {
                        java.lang.String str16 = h17.f319908l1;
                        java.lang.String str17 = h17.f319926y0;
                        c17.a(h17, qe4Var);
                        boolean mo9952xce0038c9 = Ri.mo9952xce0038c9(h17, new java.lang.String[0]);
                        if (str16 == null) {
                            str16 = "";
                        }
                        java.lang.String str18 = qe4Var.f465429h;
                        if (str18 == null) {
                            str18 = "";
                        }
                        if (!str16.equals(str18)) {
                            java.lang.String str19 = qe4Var.f465429h;
                            if (str19 == null) {
                                str19 = "";
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_list".concat(str19));
                            zo3.p.Di().a(h17.f67370x28d45f97, 5);
                        }
                        if (str17 == null) {
                            str17 = "";
                        }
                        java.lang.String str20 = qe4Var.f465428g;
                        if (str20 == null) {
                            str20 = "";
                        }
                        if (!str17.equals(str20)) {
                            java.lang.String str21 = qe4Var.f465428g;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "update serviceApp.app_icon_url_panel".concat(str21 != null ? str21 : ""));
                            zo3.p.Di().a(h17.f67370x28d45f97, 4);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "update app: AppID = %s, ret = %s", qe4Var.f465425d, java.lang.Boolean.valueOf(mo9952xce0038c9));
                    }
                } else {
                    h17 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                    h17.f67370x28d45f97 = qe4Var.f465425d;
                    c17.a(h17, qe4Var);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "insert app: AppID = %s, ret = %s", qe4Var.f465425d, java.lang.Boolean.valueOf(Ri.mo880xb970c2b9(h17)));
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67384x996f3ea)) {
                    linkedList2.add(qe4Var.f465425d);
                }
            }
        }
        if (linkedList2.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SuggestionAppListLogic", "needGetOpenIdList %d", java.lang.Integer.valueOf(linkedList2.size()));
            zo3.p.Ui().c(linkedList2);
        }
        if (linkedList.size() == 20) {
            int i19 = c17.f270681f + 20;
            c17.f270681f = i19;
            c17.b(c17.f270678c, i19);
        } else {
            c17.f(Ri, list);
            c17.f270681f = 0;
            ((java.util.LinkedList) list).clear();
        }
        gm0.j1.i();
        gm0.j1.u().c().A(352276, java.lang.System.currentTimeMillis());
        c17.f270683h = java.lang.System.currentTimeMillis();
    }
}

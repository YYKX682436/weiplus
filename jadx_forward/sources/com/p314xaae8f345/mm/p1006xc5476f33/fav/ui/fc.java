package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class fc extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public fc() {
        super(0);
    }

    public static void b(o72.l5 l5Var) {
        o72.r2 re6;
        r45.bq0 bq0Var;
        o72.d3 d3Var = o72.d3.f424854a;
        if (o72.d3.f424858e || l5Var.mo47948x7f0c4558() == null || l5Var.mo47948x7f0c4558().mo13821x7f35c2d1() == null || l5Var.mo47948x7f0c4558().mo13821x7f35c2d1().mo150578x7f2fddf8() != -435 || (re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(l5Var.f424932f)) == null || (bq0Var = re6.f67640x5ab01132) == null || bq0Var.f452497f == null) {
            return;
        }
        bq0Var.s(bq0Var.E + 2);
        re6.f67640x5ab01132.f(wo.w0.k());
        re6.f67644x3059914a = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "dealModifyResult localId:%s, version:%s", java.lang.Long.valueOf(re6.f67645x88be67a1), java.lang.Integer.valueOf(re6.f67640x5ab01132.E));
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().lf(re6, dm.i4.f66867x2a5c95c7);
        ((a82.o0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).aj()).T6();
    }

    public final java.lang.String c(r45.gp0 gp0Var) {
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(gp0Var));
        if (r6Var.m()) {
            return r6Var.o();
        }
        if (gp0Var.G == null) {
            return "";
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.I() + kk.k.g(gp0Var.G.getBytes()));
        return r6Var2.m() ? r6Var2.o() : "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String[] strArr;
        java.lang.String str;
        r45.bq0 bq0Var;
        r45.xs4 xs4Var;
        java.util.LinkedList linkedList;
        r45.xs4 xs4Var2;
        char c17;
        r45.bq0 bq0Var2;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "event.data.type = " + c5432x35bb364f.f135776g.f90061a);
        am.z9 z9Var = c5432x35bb364f.f135776g;
        int i17 = z9Var.f90061a;
        am.aa aaVar = c5432x35bb364f.f135777h;
        if (i17 == 2) {
            r45.gp0 gp0Var = z9Var.f90066f;
            if (gp0Var != null) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.x(gp0Var));
                if (r6Var.m()) {
                    aaVar.f87669c = r6Var.o();
                }
                com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(z9Var.f90066f));
                if (r6Var2.m()) {
                    aaVar.f87670d = r6Var2.o();
                }
            }
        } else if (i17 != 4) {
            int i18 = 21;
            if (i17 == 21) {
                aaVar.f87669c = ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.w6.b(z9Var.f90068h, z9Var.f90074n)).toString();
            } else if (i17 == 27) {
                r45.gp0 gp0Var2 = z9Var.f90066f;
                if (gp0Var2 != null) {
                    aaVar.f87669c = new com.p314xaae8f345.mm.vfs.r6(o72.x1.x(gp0Var2)).o();
                    aaVar.f87670d = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(z9Var.f90066f)).o();
                }
            } else if (i17 != 28) {
                int i19 = 7;
                int i27 = 14;
                int i28 = 5;
                switch (i17) {
                    case 6:
                        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(null);
                        aaVar.f87667a = 0;
                        break;
                    case 7:
                        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).mo49775xc84af884(null);
                        aaVar.f87667a = 0;
                        break;
                    case 8:
                        aaVar.f87673g = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().u2();
                        aaVar.f87667a = 0;
                        break;
                    case 9:
                        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
                        if (F == null) {
                            aaVar.f87672f = null;
                        } else {
                            aaVar.f87672f = o72.x1.L(F.f67657x2262335f, F.f67640x5ab01132, F.f67653xef67d413);
                        }
                        aaVar.f87667a = 0;
                        break;
                    case 10:
                        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(z9Var.f90068h, ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e), z9Var.f90079s);
                        aaVar.f87667a = 0;
                        break;
                    case 11:
                        o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = z9Var.f90069i;
                        if (F2 == null) {
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
                            strArr = null;
                        } else {
                            r45.gp0 J2 = o72.x1.J(F2);
                            java.lang.String[] strArr2 = new java.lang.String[2];
                            o72.a2 a2Var = new o72.a2(F2, J2);
                            int i29 = F2.f67657x2262335f;
                            if (i29 != 5) {
                                if (i29 != 18) {
                                    if (i29 == 10) {
                                        r45.aq0 aq0Var = F2.f67640x5ab01132.f452513y;
                                        if (aq0Var != null) {
                                            strArr2[1] = aq0Var.f451725h;
                                        }
                                    } else if (i29 == 11) {
                                        r45.aq0 aq0Var2 = F2.f67640x5ab01132.f452513y;
                                        if (aq0Var2 != null) {
                                            strArr2[1] = aq0Var2.f451725h;
                                        }
                                    } else if (i29 != 14) {
                                        if (i29 == 15) {
                                            r45.mq0 mq0Var = F2.f67640x5ab01132.C;
                                            if (mq0Var != null) {
                                                strArr2[1] = mq0Var.f462272h;
                                            }
                                        } else if (J2 != null) {
                                            strArr2[0] = o72.x1.X(J2);
                                            strArr2[1] = J2.G;
                                            n3Var.mo50293x3498a0(a2Var);
                                        }
                                    }
                                }
                                java.util.LinkedList linkedList2 = F2.f67640x5ab01132.f452497f;
                                if (linkedList2 != null) {
                                    java.util.Iterator it = linkedList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            r45.gp0 gp0Var3 = (r45.gp0) it.next();
                                            int i37 = gp0Var3.I;
                                            if (i37 == 2) {
                                                str = o72.x1.x(gp0Var3);
                                                n3Var.mo50293x3498a0(a2Var);
                                            } else if (i37 == 15) {
                                                str = o72.x1.X(gp0Var3);
                                                n3Var.mo50293x3498a0(a2Var);
                                            }
                                        } else {
                                            str = null;
                                        }
                                    }
                                    strArr2[0] = str;
                                }
                                strArr2[1] = J2.G;
                            } else {
                                r45.tq0 tq0Var = F2.f67640x5ab01132.f452501m;
                                if (J2 != null) {
                                    java.lang.String str2 = tq0Var == null ? null : tq0Var.f468203m;
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                        str2 = J2.G;
                                    }
                                    strArr2[0] = o72.x1.X(J2);
                                    strArr2[1] = str2;
                                    n3Var.mo50293x3498a0(a2Var);
                                } else if (tq0Var != null) {
                                    strArr2[1] = tq0Var.f468203m;
                                }
                            }
                            strArr = strArr2;
                        }
                        aaVar.f87670d = strArr[0];
                        aaVar.f87671e = strArr[1];
                        aaVar.f87667a = 0;
                        break;
                    case 12:
                        int i38 = z9Var.f90080t;
                        long j17 = z9Var.f90065e;
                        java.lang.Runnable runnable = z9Var.f90070j;
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = o72.x1.f425048a;
                        o72.x1.l(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17), true, runnable, i38, null);
                        break;
                    case 13:
                        o72.r2 F3 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
                        o72.x1.e(F3);
                        if (F3 == null && (bq0Var = z9Var.f90064d) != null) {
                            F3 = new o72.r2();
                            new r45.bq0();
                            F3.f67657x2262335f = 18;
                            F3.f67640x5ab01132 = bq0Var;
                        }
                        java.util.LinkedList linkedList3 = new java.util.LinkedList();
                        linkedList3.add(F3);
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6();
                        f6Var.f182380a = z9Var.f90081u;
                        f6Var.f182381b = z9Var.f90071k;
                        f6Var.f182382c = z9Var.f90072l;
                        f6Var.f182384e = linkedList3;
                        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.h(z9Var.f90068h, f6Var, z9Var.f90070j);
                        break;
                    case 14:
                        if (o72.x1.i0(z9Var.f90066f)) {
                            aaVar.f87667a = 1;
                            break;
                        } else {
                            aaVar.f87667a = 0;
                            break;
                        }
                    case 15:
                        o72.x1.D0(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e), true);
                        break;
                    case 16:
                        o72.x1.C0(((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e), true);
                        break;
                    case 17:
                        aaVar.f87667a = o72.x1.c0(z9Var.f90066f.K);
                        break;
                    case 18:
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(7);
                        java.util.ArrayList R = o72.x1.R(null, null, arrayList, null, null, null);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it6 = R.iterator();
                        while (it6.hasNext()) {
                            o72.r2 r2Var = (o72.r2) it6.next();
                            r45.bq0 bq0Var3 = r2Var.f67640x5ab01132;
                            r45.jq0 jq0Var = bq0Var3.f452495d;
                            int i39 = r2Var.f67657x2262335f;
                            if (i39 != i19) {
                                int i47 = 32;
                                if (i39 != 32 && i39 != i18) {
                                    if (i39 == i27 && (linkedList = bq0Var3.f452497f) != null) {
                                        java.util.Iterator it7 = linkedList.iterator();
                                        while (it7.hasNext()) {
                                            r45.gp0 gp0Var4 = (r45.gp0) it7.next();
                                            int i48 = gp0Var4.I;
                                            if (i48 == i19 || i48 == i47 || i48 == 29) {
                                                b21.r a17 = b21.s.a(6, null, gp0Var4.f456937d, gp0Var4.f456941f, gp0Var4.A, gp0Var4.E, gp0Var4.C, gp0Var4.T, o72.x1.D(), c(gp0Var4), "", jq0Var.f459583w);
                                                a17.f98895x = gp0Var4.f456954m2;
                                                a17.f98888q = gp0Var4.f456958o2;
                                                r45.hp0 hp0Var = gp0Var4.J1;
                                                if (hp0Var != null && (xs4Var2 = hp0Var.C) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var2.m75945x2fec8307(11))) {
                                                    a17.P = gp0Var4.J1.C.m75945x2fec8307(11);
                                                }
                                                arrayList2.add(a17);
                                                i18 = 21;
                                                i19 = 7;
                                                i47 = 32;
                                                i27 = 14;
                                            }
                                        }
                                    }
                                }
                            }
                            r45.gp0 J3 = o72.x1.J(r2Var);
                            b21.r a18 = b21.s.a(6, null, J3.f456937d, J3.f456941f, J3.A, J3.E, J3.C, J3.T, o72.x1.D(), c(J3), "", jq0Var.f459583w);
                            a18.f98895x = J3.f456954m2;
                            a18.f98888q = J3.f456958o2;
                            r45.hp0 hp0Var2 = J3.J1;
                            if (hp0Var2 != null && (xs4Var = hp0Var2.C) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(11))) {
                                a18.P = J3.J1.C.m75945x2fec8307(11);
                            }
                            arrayList2.add(a18);
                            i18 = 21;
                            i19 = 7;
                            i27 = 14;
                        }
                        aaVar.f87674h = arrayList2;
                        break;
                    case 19:
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                            c5432x35bb364f.f();
                        }
                        if (z9Var.f90065e == -1) {
                            java.lang.String str3 = z9Var.f90062b;
                            r45.bq0 bq0Var4 = z9Var.f90064d;
                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d4.c(str3, bq0Var4.f452497f, -1L, bq0Var4.f452505q);
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d4.d(c5432x35bb364f);
                        }
                        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                            c5432x35bb364f.f();
                            break;
                        }
                        break;
                    default:
                        switch (i17) {
                            case 30:
                                o72.x1.i(c5432x35bb364f);
                                break;
                            case 31:
                                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = z9Var.f90076p;
                                if (m1Var instanceof o72.l5) {
                                    o72.l5 l5Var = (o72.l5) m1Var;
                                    b(l5Var);
                                    aaVar.f87669c = l5Var.f424937n;
                                    break;
                                } else {
                                    aaVar.f87669c = "";
                                    break;
                                }
                            case 32:
                                o72.r2 F4 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
                                if (F4 == null && (bq0Var2 = z9Var.f90064d) != null) {
                                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = o72.x1.f425048a;
                                    F4 = new o72.r2();
                                    new r45.bq0();
                                    F4.f67657x2262335f = 18;
                                    F4.f67640x5ab01132 = bq0Var2;
                                }
                                o72.b3 b3Var = new o72.b3();
                                aaVar.f87667a = (!b3Var.c(F4, false, false) || o72.x1.l0(F4)) ? 0 : 1;
                                aaVar.f87675i = b3Var.a(F4, false, false);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] event.result.ret have set = " + aaVar.f87667a);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] event.result.isPause have set = " + aaVar.f87675i);
                                aaVar.f87669c = "";
                                if (F4 == null) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] itemInfo==null,event.result.ret set true");
                                    aaVar.f87675i = true;
                                    aaVar.f87669c = null;
                                    break;
                                }
                                break;
                            case 33:
                                o72.r2 F5 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
                                if (F5 != null) {
                                    F5.f67640x5ab01132.d(z9Var.f90064d.f452497f);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().xb(F5, dm.i4.f66867x2a5c95c7);
                                    break;
                                }
                                break;
                            case 34:
                                o72.r2 F6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
                                if (F6 != null && F6.f67657x2262335f == 18) {
                                    z9Var.f90064d = F6.f67640x5ab01132;
                                    break;
                                }
                                break;
                            case 35:
                                android.content.Context context = z9Var.f90068h;
                                if (0 >= o72.x1.f425051d) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but favLocalId is null, return");
                                    break;
                                } else {
                                    o72.r2 F7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(o72.x1.f425051d);
                                    o72.x1.f425051d = 0L;
                                    if (F7 == null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but iteminfo is null, return");
                                        break;
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav ,go on");
                                        if (context == null) {
                                            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                        }
                                        android.content.Intent intent = new android.content.Intent();
                                        intent.putExtra("key_fav_scene", 5);
                                        intent.putExtra("key_fav_item_id", F7.f67645x88be67a1);
                                        o72.x1.L0(context, ".ui.FavTagEditUI", intent, null);
                                        break;
                                    }
                                }
                            case 36:
                                aaVar.f87667a = o72.x1.n0() ? 1 : 0;
                                break;
                            case 37:
                                o72.x1.q0(z9Var.f90068h, z9Var.f90063c, z9Var.f90062b, z9Var.f90075o, z9Var.f90067g);
                                break;
                            case 38:
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_UPLOAD_FAV_ITEM %s", z9Var.f90077q);
                                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z9Var.f90077q)) {
                                    java.lang.String[] split = z9Var.f90077q.split(";");
                                    java.util.LinkedList linkedList4 = new java.util.LinkedList();
                                    linkedList4.addAll(java.util.Arrays.asList(split));
                                    if (linkedList4.size() > 0) {
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                        java.util.Iterator it8 = linkedList4.iterator();
                                        while (it8.hasNext()) {
                                            try {
                                                int intValue = java.lang.Integer.valueOf((java.lang.String) it8.next()).intValue();
                                                if (intValue > 0) {
                                                    o72.r2 re6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(intValue);
                                                    r45.mp0 mp0Var = new r45.mp0();
                                                    mp0Var.f462257d = intValue;
                                                    if (re6 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(re6.f67660x4b6e9352)) {
                                                        mp0Var.f462258e = re6.f67660x4b6e9352;
                                                    }
                                                    arrayList3.add(mp0Var);
                                                }
                                            } catch (java.lang.Exception unused) {
                                            }
                                        }
                                        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Zi(arrayList3);
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "do scene NetSceneCheckFavItem");
                                        break;
                                    }
                                }
                                break;
                            case 39:
                                try {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_RESEND_FAV_ITEM %s %s", z9Var.f90077q, z9Var.f90078r);
                                    int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(z9Var.f90077q, -1);
                                    java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(z9Var.f90078r.split(";"));
                                    java.util.HashSet hashSet = new java.util.HashSet();
                                    hashSet.addAll(P1);
                                    o72.r2 re7 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(P);
                                    if (re7 == null) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "NotFound %d", java.lang.Integer.valueOf(P));
                                        o72.v2.b(8);
                                        break;
                                    } else {
                                        r45.eq0 eq0Var = new r45.eq0();
                                        eq0Var.f455203d = P;
                                        boolean z17 = false;
                                        for (r45.gp0 gp0Var5 : re7.f67640x5ab01132.f452497f) {
                                            boolean z18 = z17;
                                            if (hashSet.remove(gp0Var5.T + "#0")) {
                                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var5.f456971u)) {
                                                    gp0Var5.a0(((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi());
                                                    o72.v2.b(2);
                                                }
                                                if (com.p314xaae8f345.mm.vfs.w6.j(o72.x1.x(gp0Var5))) {
                                                    gp0Var5.f456935b2 = 1;
                                                    gp0Var5.f456936c2 = true;
                                                    o72.x1.d0(gp0Var5, re7, 0, false);
                                                    o72.v2.b(3);
                                                    z18 = true;
                                                } else {
                                                    o72.v2.b(i28);
                                                    r45.ns0 ns0Var = new r45.ns0();
                                                    ns0Var.f463169d = gp0Var5.T;
                                                    ns0Var.f463170e = 0;
                                                    ns0Var.f463171f = 4;
                                                    eq0Var.f455204e.add(ns0Var);
                                                    z18 = z17;
                                                }
                                            }
                                            if (hashSet.remove(gp0Var5.T + "#1")) {
                                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gp0Var5.f456971u)) {
                                                    gp0Var5.a0(((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi());
                                                    o72.v2.b(2);
                                                }
                                                if (com.p314xaae8f345.mm.vfs.w6.j(o72.x1.X(gp0Var5))) {
                                                    c17 = 65535;
                                                    gp0Var5.f456935b2 = -1;
                                                    gp0Var5.f456936c2 = true;
                                                    o72.x1.e0(gp0Var5, re7, 0);
                                                    o72.v2.b(3);
                                                    z18 = true;
                                                } else {
                                                    c17 = 65535;
                                                    o72.v2.b(5);
                                                    r45.ns0 ns0Var2 = new r45.ns0();
                                                    ns0Var2.f463169d = gp0Var5.T;
                                                    ns0Var2.f463170e = 1;
                                                    ns0Var2.f463171f = 4;
                                                    eq0Var.f455204e.add(ns0Var2);
                                                }
                                            } else {
                                                c17 = 65535;
                                            }
                                            i28 = 5;
                                            z17 = z18;
                                        }
                                        if (hashSet.size() > 0) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "not found url data item %s", hashSet.toString());
                                            o72.v2.c(4, hashSet.size());
                                            java.util.Iterator it9 = hashSet.iterator();
                                            while (it9.hasNext()) {
                                                try {
                                                    java.lang.String[] split2 = ((java.lang.String) it9.next()).split("#");
                                                    r45.ns0 ns0Var3 = new r45.ns0();
                                                    ns0Var3.f463169d = split2[0];
                                                    ns0Var3.f463170e = java.lang.Integer.valueOf(split2[1]).intValue();
                                                    ns0Var3.f463171f = 3;
                                                    eq0Var.f455204e.add(ns0Var3);
                                                } catch (java.lang.Exception unused2) {
                                                }
                                            }
                                        }
                                        if (eq0Var.f455204e.size() > 0) {
                                            com.p314xaae8f345.mm.p1006xc5476f33.fav.o oVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class));
                                            oVar.getClass();
                                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fav.m(oVar, new y72.a(eq0Var)));
                                        }
                                        if (z17) {
                                            if (re7.f67657x2262335f == 18) {
                                                r45.bq0 bq0Var5 = re7.f67640x5ab01132;
                                                bq0Var5.s(bq0Var5.E + 1);
                                                re7.f67640x5ab01132.f(wo.w0.k());
                                            }
                                            re7.f67644x3059914a = 15;
                                            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().lf(re7, dm.i4.f66867x2a5c95c7);
                                            ((a82.v) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
                                            o72.v2.b(6);
                                            break;
                                        } else {
                                            o72.v2.b(7);
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavoriteOperationListener", "do not has upload data item");
                                            break;
                                        }
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Fav.FavoriteOperationListener", e17, "TYPE_NEW_XML_RESEND_FAV_ITEM", new java.lang.Object[0]);
                                    break;
                                }
                            case 40:
                                aaVar.f87676j = o72.x1.A(z9Var.f90064d);
                                break;
                        }
                }
            } else {
                o72.r2 F8 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
                if (F8 == null) {
                    o72.x1.z0(z9Var.f90066f, true, z9Var.f90073m, z9Var.f90065e);
                    o72.x1.B0(z9Var.f90066f, true, z9Var.f90073m, z9Var.f90065e);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z9Var.f90075o)) {
                    o72.x1.y0(F8, z9Var.f90066f, true);
                } else {
                    o72.x1.A0(F8, z9Var.f90066f, true);
                }
            }
        } else {
            o72.r2 F9 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f90065e);
            if (F9 != null && F9.f67653xef67d413.f466629e != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                aaVar.f87668b = arrayList4;
                arrayList4.addAll(F9.f67653xef67d413.f466629e);
            }
        }
        return false;
    }
}

package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class fc extends com.tencent.mm.sdk.event.n {
    public fc() {
        super(0);
    }

    public static void b(o72.l5 l5Var) {
        o72.r2 re6;
        r45.bq0 bq0Var;
        o72.d3 d3Var = o72.d3.f343321a;
        if (o72.d3.f343325e || l5Var.getReqResp() == null || l5Var.getReqResp().getRespObj() == null || l5Var.getReqResp().getRespObj().getRetCode() != -435 || (re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(l5Var.f343399f)) == null || (bq0Var = re6.field_favProto) == null || bq0Var.f370964f == null) {
            return;
        }
        bq0Var.s(bq0Var.E + 2);
        re6.field_favProto.f(wo.w0.k());
        re6.field_itemStatus = 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "dealModifyResult localId:%s, version:%s", java.lang.Long.valueOf(re6.field_localId), java.lang.Integer.valueOf(re6.field_favProto.E));
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().lf(re6, dm.i4.COL_LOCALID);
        ((a82.o0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).aj()).T6();
    }

    public final java.lang.String c(r45.gp0 gp0Var) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.X(gp0Var));
        if (r6Var.m()) {
            return r6Var.o();
        }
        if (gp0Var.G == null) {
            return "";
        }
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(o72.x1.I() + kk.k.g(gp0Var.G.getBytes()));
        return r6Var2.m() ? r6Var2.o() : "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String[] strArr;
        java.lang.String str;
        r45.bq0 bq0Var;
        r45.xs4 xs4Var;
        java.util.LinkedList linkedList;
        r45.xs4 xs4Var2;
        char c17;
        r45.bq0 bq0Var2;
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = (com.tencent.mm.autogen.events.FavoriteOperationEvent) iEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "event.data.type = " + favoriteOperationEvent.f54243g.f8528a);
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        int i17 = z9Var.f8528a;
        am.aa aaVar = favoriteOperationEvent.f54244h;
        if (i17 == 2) {
            r45.gp0 gp0Var = z9Var.f8533f;
            if (gp0Var != null) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.x(gp0Var));
                if (r6Var.m()) {
                    aaVar.f6136c = r6Var.o();
                }
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(o72.x1.X(z9Var.f8533f));
                if (r6Var2.m()) {
                    aaVar.f6137d = r6Var2.o();
                }
            }
        } else if (i17 != 4) {
            int i18 = 21;
            if (i17 == 21) {
                aaVar.f6136c = ((java.lang.String) com.tencent.mm.plugin.fav.ui.w6.b(z9Var.f8535h, z9Var.f8541n)).toString();
            } else if (i17 == 27) {
                r45.gp0 gp0Var2 = z9Var.f8533f;
                if (gp0Var2 != null) {
                    aaVar.f6136c = new com.tencent.mm.vfs.r6(o72.x1.x(gp0Var2)).o();
                    aaVar.f6137d = new com.tencent.mm.vfs.r6(o72.x1.X(z9Var.f8533f)).o();
                }
            } else if (i17 != 28) {
                int i19 = 7;
                int i27 = 14;
                int i28 = 5;
                switch (i17) {
                    case 6:
                        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(null);
                        aaVar.f6134a = 0;
                        break;
                    case 7:
                        ((l75.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).remove(null);
                        aaVar.f6134a = 0;
                        break;
                    case 8:
                        aaVar.f6140g = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().u2();
                        aaVar.f6134a = 0;
                        break;
                    case 9:
                        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
                        if (F == null) {
                            aaVar.f6139f = null;
                        } else {
                            aaVar.f6139f = o72.x1.L(F.field_type, F.field_favProto, F.field_tagProto);
                        }
                        aaVar.f6134a = 0;
                        break;
                    case 10:
                        ((x82.i) ((o72.l4) i95.n0.c(o72.l4.class))).wi(z9Var.f8535h, ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e), z9Var.f8546s);
                        aaVar.f6134a = 0;
                        break;
                    case 11:
                        o72.r2 F2 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
                        com.tencent.mm.sdk.platformtools.n3 n3Var = z9Var.f8536i;
                        if (F2 == null) {
                            com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
                            com.tencent.mars.xlog.Log.w("MicroMsg.Fav.FavApiLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
                            strArr = null;
                        } else {
                            r45.gp0 J2 = o72.x1.J(F2);
                            java.lang.String[] strArr2 = new java.lang.String[2];
                            o72.a2 a2Var = new o72.a2(F2, J2);
                            int i29 = F2.field_type;
                            if (i29 != 5) {
                                if (i29 != 18) {
                                    if (i29 == 10) {
                                        r45.aq0 aq0Var = F2.field_favProto.f370980y;
                                        if (aq0Var != null) {
                                            strArr2[1] = aq0Var.f370192h;
                                        }
                                    } else if (i29 == 11) {
                                        r45.aq0 aq0Var2 = F2.field_favProto.f370980y;
                                        if (aq0Var2 != null) {
                                            strArr2[1] = aq0Var2.f370192h;
                                        }
                                    } else if (i29 != 14) {
                                        if (i29 == 15) {
                                            r45.mq0 mq0Var = F2.field_favProto.C;
                                            if (mq0Var != null) {
                                                strArr2[1] = mq0Var.f380739h;
                                            }
                                        } else if (J2 != null) {
                                            strArr2[0] = o72.x1.X(J2);
                                            strArr2[1] = J2.G;
                                            n3Var.post(a2Var);
                                        }
                                    }
                                }
                                java.util.LinkedList linkedList2 = F2.field_favProto.f370964f;
                                if (linkedList2 != null) {
                                    java.util.Iterator it = linkedList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            r45.gp0 gp0Var3 = (r45.gp0) it.next();
                                            int i37 = gp0Var3.I;
                                            if (i37 == 2) {
                                                str = o72.x1.x(gp0Var3);
                                                n3Var.post(a2Var);
                                            } else if (i37 == 15) {
                                                str = o72.x1.X(gp0Var3);
                                                n3Var.post(a2Var);
                                            }
                                        } else {
                                            str = null;
                                        }
                                    }
                                    strArr2[0] = str;
                                }
                                strArr2[1] = J2.G;
                            } else {
                                r45.tq0 tq0Var = F2.field_favProto.f370968m;
                                if (J2 != null) {
                                    java.lang.String str2 = tq0Var == null ? null : tq0Var.f386670m;
                                    if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                        str2 = J2.G;
                                    }
                                    strArr2[0] = o72.x1.X(J2);
                                    strArr2[1] = str2;
                                    n3Var.post(a2Var);
                                } else if (tq0Var != null) {
                                    strArr2[1] = tq0Var.f386670m;
                                }
                            }
                            strArr = strArr2;
                        }
                        aaVar.f6137d = strArr[0];
                        aaVar.f6138e = strArr[1];
                        aaVar.f6134a = 0;
                        break;
                    case 12:
                        int i38 = z9Var.f8547t;
                        long j17 = z9Var.f8532e;
                        java.lang.Runnable runnable = z9Var.f8537j;
                        com.tencent.mm.sdk.platformtools.o4 o4Var2 = o72.x1.f343515a;
                        o72.x1.l(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17), true, runnable, i38, null);
                        break;
                    case 13:
                        o72.r2 F3 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
                        o72.x1.e(F3);
                        if (F3 == null && (bq0Var = z9Var.f8531d) != null) {
                            F3 = new o72.r2();
                            new r45.bq0();
                            F3.field_type = 18;
                            F3.field_favProto = bq0Var;
                        }
                        java.util.LinkedList linkedList3 = new java.util.LinkedList();
                        linkedList3.add(F3);
                        com.tencent.mm.plugin.fav.ui.f6 f6Var = new com.tencent.mm.plugin.fav.ui.f6();
                        f6Var.f100847a = z9Var.f8548u;
                        f6Var.f100848b = z9Var.f8538k;
                        f6Var.f100849c = z9Var.f8539l;
                        f6Var.f100851e = linkedList3;
                        com.tencent.mm.plugin.fav.ui.x5.h(z9Var.f8535h, f6Var, z9Var.f8537j);
                        break;
                    case 14:
                        if (o72.x1.i0(z9Var.f8533f)) {
                            aaVar.f6134a = 1;
                            break;
                        } else {
                            aaVar.f6134a = 0;
                            break;
                        }
                    case 15:
                        o72.x1.D0(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e), true);
                        break;
                    case 16:
                        o72.x1.C0(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e), true);
                        break;
                    case 17:
                        aaVar.f6134a = o72.x1.c0(z9Var.f8533f.K);
                        break;
                    case 18:
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(7);
                        java.util.ArrayList R = o72.x1.R(null, null, arrayList, null, null, null);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it6 = R.iterator();
                        while (it6.hasNext()) {
                            o72.r2 r2Var = (o72.r2) it6.next();
                            r45.bq0 bq0Var3 = r2Var.field_favProto;
                            r45.jq0 jq0Var = bq0Var3.f370962d;
                            int i39 = r2Var.field_type;
                            if (i39 != i19) {
                                int i47 = 32;
                                if (i39 != 32 && i39 != i18) {
                                    if (i39 == i27 && (linkedList = bq0Var3.f370964f) != null) {
                                        java.util.Iterator it7 = linkedList.iterator();
                                        while (it7.hasNext()) {
                                            r45.gp0 gp0Var4 = (r45.gp0) it7.next();
                                            int i48 = gp0Var4.I;
                                            if (i48 == i19 || i48 == i47 || i48 == 29) {
                                                b21.r a17 = b21.s.a(6, null, gp0Var4.f375404d, gp0Var4.f375408f, gp0Var4.A, gp0Var4.E, gp0Var4.C, gp0Var4.T, o72.x1.D(), c(gp0Var4), "", jq0Var.f378050w);
                                                a17.f17362x = gp0Var4.f375421m2;
                                                a17.f17355q = gp0Var4.f375425o2;
                                                r45.hp0 hp0Var = gp0Var4.J1;
                                                if (hp0Var != null && (xs4Var2 = hp0Var.C) != null && !com.tencent.mm.sdk.platformtools.t8.K0(xs4Var2.getString(11))) {
                                                    a17.P = gp0Var4.J1.C.getString(11);
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
                            b21.r a18 = b21.s.a(6, null, J3.f375404d, J3.f375408f, J3.A, J3.E, J3.C, J3.T, o72.x1.D(), c(J3), "", jq0Var.f378050w);
                            a18.f17362x = J3.f375421m2;
                            a18.f17355q = J3.f375425o2;
                            r45.hp0 hp0Var2 = J3.J1;
                            if (hp0Var2 != null && (xs4Var = hp0Var2.C) != null && !com.tencent.mm.sdk.platformtools.t8.K0(xs4Var.getString(11))) {
                                a18.P = J3.J1.C.getString(11);
                            }
                            arrayList2.add(a18);
                            i18 = 21;
                            i19 = 7;
                            i27 = 14;
                        }
                        aaVar.f6141h = arrayList2;
                        break;
                    case 19:
                        if (com.tencent.mars.xlog.Log.isDebug()) {
                            favoriteOperationEvent.f();
                        }
                        if (z9Var.f8532e == -1) {
                            java.lang.String str3 = z9Var.f8529b;
                            r45.bq0 bq0Var4 = z9Var.f8531d;
                            com.tencent.mm.plugin.fav.ui.d4.c(str3, bq0Var4.f370964f, -1L, bq0Var4.f370972q);
                        } else {
                            com.tencent.mm.plugin.fav.ui.d4.d(favoriteOperationEvent);
                        }
                        if (com.tencent.mars.xlog.Log.isDebug()) {
                            favoriteOperationEvent.f();
                            break;
                        }
                        break;
                    default:
                        switch (i17) {
                            case 30:
                                o72.x1.i(favoriteOperationEvent);
                                break;
                            case 31:
                                com.tencent.mm.modelbase.m1 m1Var = z9Var.f8543p;
                                if (m1Var instanceof o72.l5) {
                                    o72.l5 l5Var = (o72.l5) m1Var;
                                    b(l5Var);
                                    aaVar.f6136c = l5Var.f343404n;
                                    break;
                                } else {
                                    aaVar.f6136c = "";
                                    break;
                                }
                            case 32:
                                o72.r2 F4 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
                                if (F4 == null && (bq0Var2 = z9Var.f8531d) != null) {
                                    com.tencent.mm.sdk.platformtools.o4 o4Var3 = o72.x1.f343515a;
                                    F4 = new o72.r2();
                                    new r45.bq0();
                                    F4.field_type = 18;
                                    F4.field_favProto = bq0Var2;
                                }
                                o72.b3 b3Var = new o72.b3();
                                aaVar.f6134a = (!b3Var.c(F4, false, false) || o72.x1.l0(F4)) ? 0 : 1;
                                aaVar.f6142i = b3Var.a(F4, false, false);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] event.result.ret have set = " + aaVar.f6134a);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] event.result.isPause have set = " + aaVar.f6142i);
                                aaVar.f6136c = "";
                                if (F4 == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavoriteOperationListener", "[TYPE_NOTE_SEND_FILTER_RESULT] itemInfo==null,event.result.ret set true");
                                    aaVar.f6142i = true;
                                    aaVar.f6136c = null;
                                    break;
                                }
                                break;
                            case 33:
                                o72.r2 F5 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
                                if (F5 != null) {
                                    F5.field_favProto.d(z9Var.f8531d.f370964f);
                                    ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().xb(F5, dm.i4.COL_LOCALID);
                                    break;
                                }
                                break;
                            case 34:
                                o72.r2 F6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
                                if (F6 != null && F6.field_type == 18) {
                                    z9Var.f8531d = F6.field_favProto;
                                    break;
                                }
                                break;
                            case 35:
                                android.content.Context context = z9Var.f8535h;
                                if (0 >= o72.x1.f343518d) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but favLocalId is null, return");
                                    break;
                                } else {
                                    o72.r2 F7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(o72.x1.f343518d);
                                    o72.x1.f343518d = 0L;
                                    if (F7 == null) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav,try to add tag ,but iteminfo is null, return");
                                        break;
                                    } else {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavApiLogic", "addTagWhenAddToFav ,go on");
                                        if (context == null) {
                                            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                        }
                                        android.content.Intent intent = new android.content.Intent();
                                        intent.putExtra("key_fav_scene", 5);
                                        intent.putExtra("key_fav_item_id", F7.field_localId);
                                        o72.x1.L0(context, ".ui.FavTagEditUI", intent, null);
                                        break;
                                    }
                                }
                            case 36:
                                aaVar.f6134a = o72.x1.n0() ? 1 : 0;
                                break;
                            case 37:
                                o72.x1.q0(z9Var.f8535h, z9Var.f8530c, z9Var.f8529b, z9Var.f8542o, z9Var.f8534g);
                                break;
                            case 38:
                                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_UPLOAD_FAV_ITEM %s", z9Var.f8544q);
                                if (!com.tencent.mm.sdk.platformtools.t8.K0(z9Var.f8544q)) {
                                    java.lang.String[] split = z9Var.f8544q.split(";");
                                    java.util.LinkedList linkedList4 = new java.util.LinkedList();
                                    linkedList4.addAll(java.util.Arrays.asList(split));
                                    if (linkedList4.size() > 0) {
                                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                        java.util.Iterator it8 = linkedList4.iterator();
                                        while (it8.hasNext()) {
                                            try {
                                                int intValue = java.lang.Integer.valueOf((java.lang.String) it8.next()).intValue();
                                                if (intValue > 0) {
                                                    o72.r2 re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(intValue);
                                                    r45.mp0 mp0Var = new r45.mp0();
                                                    mp0Var.f380724d = intValue;
                                                    if (re6 != null && !com.tencent.mm.sdk.platformtools.t8.K0(re6.field_xml)) {
                                                        mp0Var.f380725e = re6.field_xml;
                                                    }
                                                    arrayList3.add(mp0Var);
                                                }
                                            } catch (java.lang.Exception unused) {
                                            }
                                        }
                                        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Zi(arrayList3);
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "do scene NetSceneCheckFavItem");
                                        break;
                                    }
                                }
                                break;
                            case 39:
                                try {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "TYPE_NEW_XML_RESEND_FAV_ITEM %s %s", z9Var.f8544q, z9Var.f8545r);
                                    int P = com.tencent.mm.sdk.platformtools.t8.P(z9Var.f8544q, -1);
                                    java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(z9Var.f8545r.split(";"));
                                    java.util.HashSet hashSet = new java.util.HashSet();
                                    hashSet.addAll(P1);
                                    o72.r2 re7 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(P);
                                    if (re7 == null) {
                                        com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "NotFound %d", java.lang.Integer.valueOf(P));
                                        o72.v2.b(8);
                                        break;
                                    } else {
                                        r45.eq0 eq0Var = new r45.eq0();
                                        eq0Var.f373670d = P;
                                        boolean z17 = false;
                                        for (r45.gp0 gp0Var5 : re7.field_favProto.f370964f) {
                                            boolean z18 = z17;
                                            if (hashSet.remove(gp0Var5.T + "#0")) {
                                                if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var5.f375438u)) {
                                                    gp0Var5.a0(((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi());
                                                    o72.v2.b(2);
                                                }
                                                if (com.tencent.mm.vfs.w6.j(o72.x1.x(gp0Var5))) {
                                                    gp0Var5.f375402b2 = 1;
                                                    gp0Var5.f375403c2 = true;
                                                    o72.x1.d0(gp0Var5, re7, 0, false);
                                                    o72.v2.b(3);
                                                    z18 = true;
                                                } else {
                                                    o72.v2.b(i28);
                                                    r45.ns0 ns0Var = new r45.ns0();
                                                    ns0Var.f381636d = gp0Var5.T;
                                                    ns0Var.f381637e = 0;
                                                    ns0Var.f381638f = 4;
                                                    eq0Var.f373671e.add(ns0Var);
                                                    z18 = z17;
                                                }
                                            }
                                            if (hashSet.remove(gp0Var5.T + "#1")) {
                                                if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var5.f375438u)) {
                                                    gp0Var5.a0(((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).wi());
                                                    o72.v2.b(2);
                                                }
                                                if (com.tencent.mm.vfs.w6.j(o72.x1.X(gp0Var5))) {
                                                    c17 = 65535;
                                                    gp0Var5.f375402b2 = -1;
                                                    gp0Var5.f375403c2 = true;
                                                    o72.x1.e0(gp0Var5, re7, 0);
                                                    o72.v2.b(3);
                                                    z18 = true;
                                                } else {
                                                    c17 = 65535;
                                                    o72.v2.b(5);
                                                    r45.ns0 ns0Var2 = new r45.ns0();
                                                    ns0Var2.f381636d = gp0Var5.T;
                                                    ns0Var2.f381637e = 1;
                                                    ns0Var2.f381638f = 4;
                                                    eq0Var.f373671e.add(ns0Var2);
                                                }
                                            } else {
                                                c17 = 65535;
                                            }
                                            i28 = 5;
                                            z17 = z18;
                                        }
                                        if (hashSet.size() > 0) {
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "not found url data item %s", hashSet.toString());
                                            o72.v2.c(4, hashSet.size());
                                            java.util.Iterator it9 = hashSet.iterator();
                                            while (it9.hasNext()) {
                                                try {
                                                    java.lang.String[] split2 = ((java.lang.String) it9.next()).split("#");
                                                    r45.ns0 ns0Var3 = new r45.ns0();
                                                    ns0Var3.f381636d = split2[0];
                                                    ns0Var3.f381637e = java.lang.Integer.valueOf(split2[1]).intValue();
                                                    ns0Var3.f381638f = 3;
                                                    eq0Var.f373671e.add(ns0Var3);
                                                } catch (java.lang.Exception unused2) {
                                                }
                                            }
                                        }
                                        if (eq0Var.f373671e.size() > 0) {
                                            com.tencent.mm.plugin.fav.o oVar = (com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class));
                                            oVar.getClass();
                                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fav.m(oVar, new y72.a(eq0Var)));
                                        }
                                        if (z17) {
                                            if (re7.field_type == 18) {
                                                r45.bq0 bq0Var5 = re7.field_favProto;
                                                bq0Var5.s(bq0Var5.E + 1);
                                                re7.field_favProto.f(wo.w0.k());
                                            }
                                            re7.field_itemStatus = 15;
                                            ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().lf(re7, dm.i4.COL_LOCALID);
                                            ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).V6();
                                            o72.v2.b(6);
                                            break;
                                        } else {
                                            o72.v2.b(7);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavoriteOperationListener", "do not has upload data item");
                                            break;
                                        }
                                    }
                                } catch (java.lang.Exception e17) {
                                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Fav.FavoriteOperationListener", e17, "TYPE_NEW_XML_RESEND_FAV_ITEM", new java.lang.Object[0]);
                                    break;
                                }
                            case 40:
                                aaVar.f6143j = o72.x1.A(z9Var.f8531d);
                                break;
                        }
                }
            } else {
                o72.r2 F8 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
                if (F8 == null) {
                    o72.x1.z0(z9Var.f8533f, true, z9Var.f8540m, z9Var.f8532e);
                    o72.x1.B0(z9Var.f8533f, true, z9Var.f8540m, z9Var.f8532e);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(z9Var.f8542o)) {
                    o72.x1.y0(F8, z9Var.f8533f, true);
                } else {
                    o72.x1.A0(F8, z9Var.f8533f, true);
                }
            }
        } else {
            o72.r2 F9 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(z9Var.f8532e);
            if (F9 != null && F9.field_tagProto.f385096e != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                aaVar.f6135b = arrayList4;
                arrayList4.addAll(F9.field_tagProto.f385096e);
            }
        }
        return false;
    }
}

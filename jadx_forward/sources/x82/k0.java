package x82;

/* loaded from: classes9.dex */
public abstract class k0 {
    public static void a(r45.jq0 jq0Var, android.content.Intent intent) {
        intent.putExtra("geta8key_scene", 14);
        if (jq0Var != null) {
            intent.putExtra("geta8key_username", o72.c3.b(jq0Var));
            intent.putExtra("msgUsername", jq0Var.f459569f);
            intent.putExtra("serverMsgID", jq0Var.f459579s);
        }
    }

    public static java.lang.String b(r45.op0 op0Var) {
        if (op0Var == null) {
            return "";
        }
        if (!op0Var.f463954u.isEmpty()) {
            r45.np0 np0Var = (r45.np0) op0Var.f463954u.getLast();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(np0Var.f463099f)) {
                return np0Var.f463099f;
            }
        }
        return op0Var.f463948o;
    }

    public static java.lang.String c(o72.r2 r2Var) {
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        if (bq0Var == null) {
            return null;
        }
        r45.tq0 tq0Var = bq0Var.f452501m;
        if (tq0Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var.f468203m)) {
            return r2Var.f67640x5ab01132.f452501m.f468203m;
        }
        java.util.LinkedList linkedList = r2Var.f67640x5ab01132.f452497f;
        if (linkedList == null || linkedList.size() != 1) {
            return null;
        }
        return ((r45.gp0) linkedList.get(0)).f456945h;
    }

    public static void d(android.content.Context context, o72.r2 r2Var, boolean z17, int i17, r45.dq0 dq0Var) {
        r45.bq0 bq0Var;
        java.util.LinkedList linkedList;
        boolean z18;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625();
        c5773x64e6b625.f136087g.f56x88be67a1 = r2Var.f67645x88be67a1;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2Var.E1) && (bq0Var = r2Var.f67640x5ab01132) != null && (linkedList = bq0Var.f452497f) != null && linkedList.size() > 0) {
            java.util.Iterator it = r2Var.f67640x5ab01132.f452497f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z18 = false;
                    break;
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((r45.gp0) it.next()).T, r2Var.E1)) {
                    z18 = true;
                    break;
                } else {
                    c5773x64e6b625.f136087g.f90113c++;
                }
            }
            int i18 = c5773x64e6b625.f136087g.f90113c;
            if (!z18) {
                c5773x64e6b625.f136087g.f90113c = 0;
            } else if (r2Var.f67657x2262335f == 18) {
                c5773x64e6b625.f136087g.f90113c--;
            }
        }
        if (r2Var.f67645x88be67a1 == -1) {
            c5773x64e6b625.f136087g.f90121k = 4;
        } else if (((y30.q) ((z30.u) i95.n0.c(z30.u.class))).wi()) {
            o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.f67645x88be67a1);
            if (F != null) {
                c5773x64e6b625.f136087g.f90112b = o72.r2.G0(F);
                r2Var = F;
            } else {
                c5773x64e6b625.f136087g.f90112b = r2Var.f67660x4b6e9352;
            }
        } else {
            c5773x64e6b625.f136087g.f90112b = r2Var.f67660x4b6e9352;
        }
        c5773x64e6b625.f136087g.f90114d = context;
        android.os.Bundle bundle = new android.os.Bundle();
        r45.sp0 sp0Var = r2Var.f67640x5ab01132.G;
        if (sp0Var != null) {
            bundle.putString("noteauthor", sp0Var.f467424d);
            bundle.putString("noteeditor", sp0Var.f467425e);
        }
        bundle.putLong("edittime", r2Var.f67659xa783a79b);
        bundle.putInt("favId", r2Var.f67643xc8a07680);
        bundle.putInt("favUpdateSeq", r2Var.f67658x266f95d1);
        if (i17 != 0) {
            bundle.putInt("favSourceType", i17);
        }
        am.zl zlVar = c5773x64e6b625.f136087g;
        zlVar.f90118h = bundle;
        zlVar.f55x5ab01132 = r2Var.f67640x5ab01132;
        zlVar.f90111a = 2;
        zlVar.f90122l = z17;
        zlVar.f90123m = dq0Var;
        c5773x64e6b625.e();
    }

    public static void e(android.content.Context context, o72.r2 r2Var, boolean z17, r45.dq0 dq0Var) {
        r45.gp0 J2 = o72.x1.J(r2Var);
        if (J2 != null) {
            bw5.ar0 ar0Var = bw5.ar0.TingScene_Fav;
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            if (o72.x1.t0(ar0Var, J2, o72.x1.x(J2))) {
                return;
            }
        }
        if (dq0Var != null && dq0Var.f454192m == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_detail_info_id", r2Var.f67645x88be67a1);
            intent.putExtra("show_share", z17);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2Var.E1)) {
                intent.putExtra("key_detail_open_way", 1);
            } else {
                intent.putExtra("key_detail_data_id", r2Var.E1);
                intent.putExtra("key_detail_open_way", 2);
            }
            o(dq0Var, intent);
            o72.z2.b("FavoriteFileDetailUI", dq0Var.f454189g);
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            o72.x1.L0(context, ".ui.detail.FavoriteFileDetailUI", intent, null);
            return;
        }
        if (dq0Var != null && dq0Var.f454192m == 2) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            ((ht.a) vVar).Di((android.app.Activity) context, o72.x1.x(J2), null, J2.K, 2);
            return;
        }
        if (o72.x1.i0(J2)) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(o72.x1.x(J2))) {
                f(context, r2Var, dq0Var);
                return;
            }
            java.lang.String valueOf = r2Var != null ? java.lang.String.valueOf(r2Var.f67643xc8a07680) : null;
            d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
            b70.e eVar = (b70.e) i95.n0.c(b70.e.class);
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            iVar.Ja(((a70.e) eVar).Ai(J2, valueOf, null, o72.x1.x(J2)));
            if (!com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d.i7(J2)) {
                jt.v vVar2 = (jt.v) i95.n0.c(jt.v.class);
                ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                java.lang.String x17 = o72.x1.x(J2);
                java.lang.String str = J2.K;
                java.lang.String str2 = J2.f456937d;
                ((ht.a) vVar2).getClass();
                if (!com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.j(0L, "", x17, str, str2, 2, null)) {
                    return;
                }
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_detail_info_id", r2Var.f67645x88be67a1);
        intent2.putExtra("key_detail_data_id", J2.T);
        intent2.putExtra("show_share", z17);
        o(dq0Var, intent2);
        o72.z2.b("FavoriteFileDetailUI", dq0Var.f454189g);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(context, ".ui.detail.FavoriteFileDetailUI", intent2, null);
    }

    public static void f(android.content.Context context, o72.r2 r2Var, r45.dq0 dq0Var) {
        android.content.Intent intent = new android.content.Intent();
        n(r2Var, dq0Var, intent);
        o72.z2.b("FavoriteImgDetailUI", dq0Var.f454189g);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(context, ".ui.detail.FavoriteImgDetailUI", intent, null);
    }

    public static void g(android.content.Context context, o72.r2 r2Var, boolean z17, r45.dq0 dq0Var) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", r2Var.f67645x88be67a1);
        intent.putExtra("show_share", z17);
        intent.putExtra("prePublishId", "msgrecord_detail");
        intent.putExtra("preChatTYPE", 15);
        o(dq0Var, intent);
        o72.z2.b("FavRecordDetailUI", dq0Var.f454189g);
        j45.l.j(context, "record", ".ui.FavRecordDetailUI", intent, null);
    }

    public static void h(android.content.Context context, o72.r2 r2Var, r45.dq0 dq0Var) {
        o72.o3.b(o72.k3.PlayIcon, r2Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", r2Var.f67645x88be67a1);
        o(dq0Var, intent);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(context, ".ui.detail.FavoriteSightDetailUI", intent, null);
    }

    public static void i(android.content.Context context, o72.r2 r2Var, r45.dq0 dq0Var) {
        boolean z17;
        r45.qp0 qp0Var;
        r45.gp0 J2 = o72.x1.J(r2Var);
        r45.jp0 jp0Var = J2.O1;
        boolean z18 = false;
        if (jp0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var.f459531d)) {
            z17 = false;
        } else {
            o72.o3.b(o72.k3.EnterCompleteVideo, r2Var);
            java.lang.String X = o72.x1.X(J2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KFromTimeLine", false);
            intent.putExtra("KStremVideoUrl", jp0Var.f459531d);
            intent.putExtra("StreamWording", jp0Var.f459533f);
            intent.putExtra("StremWebUrl", jp0Var.f459534g);
            intent.putExtra("KThumUrl", jp0Var.f459536i);
            intent.putExtra("KSta_StremVideoAduxInfo", jp0Var.f459537m);
            intent.putExtra("KSta_StremVideoPublishId", jp0Var.f459538n);
            intent.putExtra("KSta_SourceType", 2);
            intent.putExtra("KSta_Scene", o72.l3.Fav.f424929d);
            intent.putExtra("KSta_FromUserName", r2Var.f67642xd3939c3a);
            intent.putExtra("KSta_FavID", r2Var.f67643xc8a07680);
            intent.putExtra("KSta_SnsStatExtStr", J2.R1);
            intent.putExtra("KBlockFav", true);
            intent.putExtra("KMediaId", "fakeid_" + r2Var.f67643xc8a07680);
            intent.putExtra("KThumbPath", X);
            intent.putExtra("KMediaVideoTime", jp0Var.f459532e);
            intent.putExtra("KMediaTitle", jp0Var.f459535h);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                j45.l.j(context, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "use new stream video play UI");
            } else {
                j45.l.j(context, "sns", ".ui.VideoAdPlayerUI", intent, null);
            }
            z17 = true;
        }
        if (z17) {
            return;
        }
        r45.hp0 hp0Var = J2.J1;
        if (hp0Var == null || (qp0Var = hp0Var.f457903x) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "handleMpVideoItem favMpMsgItem is null");
        } else {
            s82.x0.l(context, qp0Var, J2, false);
            z18 = true;
        }
        if (z18) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2.M) && J2.R > 0) {
            android.content.Intent intent2 = new android.content.Intent();
            n(r2Var, dq0Var, intent2);
            o72.z2.b("FavoriteSightDetailUI", dq0Var.f454189g);
            ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
            o72.x1.L0(context, ".ui.detail.FavoriteSightDetailUI", intent2, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "full md5[%s], fullsize[%d], start use url", J2.M, java.lang.Long.valueOf(J2.R));
        java.lang.String str = o72.x1.J(r2Var).A;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = o72.x1.J(r2Var).E;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "onClick video url null, return");
            h(context, r2Var, dq0Var);
            return;
        }
        android.content.Intent intent3 = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("key_snsad_statextstr", J2.R1);
        bundle.putLong("favlocalid", r2Var.f67645x88be67a1);
        intent3.putExtra("jsapiargs", bundle);
        intent3.putExtra("rawUrl", str);
        intent3.putExtra("is_favorite_item", true);
        intent3.putExtra("fav_local_id", r2Var.f67645x88be67a1);
        a(r2Var.f67640x5ab01132.f452495d, intent3);
        intent3.putExtra("key_enable_teen_mode_check", true);
        intent3.putExtra("key_enable_fts_quick", true);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        k82.c.f386420a.e(r2Var.f67645x88be67a1, 5);
    }

    public static void j(android.content.Context context, long j17, java.lang.String str, int i17, o72.r2 r2Var, boolean z17, r45.dq0 dq0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "click WNNoteItem, handleWNNoteItem, msgLocalId: " + j17 + ", favScene: " + i17);
        if (j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "handleClickNoteFromChatting, msgLocalId: " + j17 + ", favScene: " + i17);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a c5824x69fbb00a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5824x69fbb00a();
            am.sn snVar = c5824x69fbb00a.f136132g;
            snVar.f89439c = context;
            snVar.f89437a = j17;
            snVar.f89442f = str;
            snVar.f89440d = false;
            snVar.f89438b = r2Var.f67660x4b6e9352;
            snVar.f89443g = i17;
            snVar.f89445i = 0;
            c5824x69fbb00a.e();
        } else {
            d(context, r2Var, z17, 0, dq0Var);
        }
        o72.z2.b("NoteEditorUI", dq0Var.f454189g);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x05e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(android.content.Context r19, o72.r2 r20, boolean r21, r45.dq0 r22) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x82.k0.k(android.content.Context, o72.r2, boolean, r45.dq0):void");
    }

    public static void l(r35.i1 i1Var, android.content.Context context, o72.r2 r2Var) {
        r45.aq0 aq0Var;
        r45.mq0 mq0Var;
        java.lang.String str;
        java.lang.Object obj;
        java.util.LinkedList linkedList;
        r45.aq0 aq0Var2;
        r45.mq0 mq0Var2;
        android.text.SpannableString spannableString;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String r17;
        if (r2Var == null || context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
            return;
        }
        r45.gp0 J2 = o72.x1.J(r2Var);
        r45.gp0 J3 = o72.x1.J(r2Var);
        int i17 = r2Var.f67657x2262335f;
        if (5 == i17) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(J3));
            if (r6Var.m()) {
                obj = r6Var.o();
            } else {
                r45.tq0 tq0Var = r2Var.f67640x5ab01132.f452501m;
                java.lang.String str6 = tq0Var == null ? null : tq0Var.f468203m;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str6)) {
                    str6 = J3.G;
                }
                java.lang.String h17 = o72.x1.h(str6);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17);
                obj = h17;
                if (K0) {
                    obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78435x7b83bce4);
                }
            }
        } else if ((11 == i17 || 10 == i17) && (aq0Var = r2Var.f67640x5ab01132.f452513y) != null) {
            java.lang.String h18 = o72.x1.h(aq0Var.f451725h);
            boolean K02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h18);
            obj = h18;
            if (K02) {
                obj = java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
            }
        } else if ((15 == i17 || 12 == i17) && (mq0Var = r2Var.f67640x5ab01132.C) != null) {
            java.lang.String h19 = o72.x1.h(mq0Var.f462272h);
            boolean K03 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h19);
            obj = h19;
            if (K03) {
                obj = java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
            }
        } else if (2 == i17 || 7 == i17 || 21 == i17 || 32 == i17 || 33 == i17 || 16 == i17 || 4 == i17) {
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(J3));
            if (r6Var2.m()) {
                obj = r6Var2.o();
            } else {
                java.lang.String h27 = o72.x1.h(J3.G);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h27)) {
                    o72.x1.A0(r2Var, J3, true);
                    str = o72.x1.X(J3);
                } else {
                    str = h27;
                }
                boolean K04 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
                obj = str;
                if (K04) {
                    int i18 = r2Var.f67657x2262335f;
                    if (i18 != 2) {
                        if (i18 != 7) {
                            if (i18 == 21) {
                                obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80683x65f07627);
                            } else if (i18 != 32) {
                                obj = i18 != 33 ? java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).oj()) : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78435x7b83bce4);
                            }
                        }
                        obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80683x65f07627);
                    } else {
                        obj = java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).mj());
                    }
                }
            }
        } else {
            if (3 != i17) {
                int i19 = 6;
                if (6 != i17) {
                    int i27 = 8;
                    if (8 == i17) {
                        obj = java.lang.Integer.valueOf(o25.y.a(J3.K));
                    } else if (17 == i17) {
                        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(J3.f456941f);
                        java.lang.String str7 = D3.f277891a;
                        if (str7 == null || str7.length() == 0) {
                            obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
                        } else {
                            spannableString = new android.text.SpannableString(D3.f277891a);
                            obj = spannableString;
                        }
                    } else if (14 == i17 && (linkedList = r2Var.f67640x5ab01132.f452497f) != null) {
                        java.util.Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            r45.gp0 gp0Var = (r45.gp0) it.next();
                            int i28 = gp0Var.I;
                            if (i28 != 1) {
                                if (i28 == 3) {
                                    obj = java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).aj());
                                    break;
                                }
                                if (i28 == i19) {
                                    obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78424x902f66d4);
                                    break;
                                }
                                if (i28 == i27 || i28 == 10130) {
                                    obj = java.lang.Integer.valueOf(o25.y.a(gp0Var.K));
                                    break;
                                }
                                if (i28 == 2 || i28 == 7 || i28 == 29 || i28 == 32 || i28 == 33 || i28 == 15 || i28 == 4) {
                                    com.p314xaae8f345.mm.vfs.r6 r6Var3 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(gp0Var));
                                    if (r6Var3.m()) {
                                        obj = r6Var3.o();
                                    } else {
                                        java.lang.String h28 = o72.x1.h(gp0Var.G);
                                        boolean K05 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h28);
                                        obj = h28;
                                        if (K05) {
                                            int i29 = gp0Var.I;
                                            obj = i29 != 2 ? (i29 == 7 || i29 == 29 || i29 == 32) ? java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80683x65f07627) : i29 != 33 ? java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).oj()) : java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78435x7b83bce4) : java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).mj());
                                        }
                                    }
                                } else if (i28 == 5) {
                                    com.p314xaae8f345.mm.vfs.r6 r6Var4 = new com.p314xaae8f345.mm.vfs.r6(o72.x1.X(gp0Var));
                                    if (r6Var4.m()) {
                                        obj = r6Var4.o();
                                    } else {
                                        r45.tq0 tq0Var2 = gp0Var.J1.f457888f;
                                        java.lang.String str8 = tq0Var2 == null ? null : tq0Var2.f468203m;
                                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                                            str8 = gp0Var.G;
                                        }
                                        java.lang.String h29 = o72.x1.h(str8);
                                        boolean K06 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h29);
                                        obj = h29;
                                        if (K06) {
                                            obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78435x7b83bce4);
                                        }
                                    }
                                } else {
                                    if (i28 == 22) {
                                        obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f80119x628f1c9a);
                                        break;
                                    }
                                    if ((i28 == 10 || i28 == 11) && (aq0Var2 = gp0Var.J1.f457889g) != null) {
                                        java.lang.String h37 = o72.x1.h(aq0Var2.f451725h);
                                        boolean K07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h37);
                                        obj = h37;
                                        if (K07) {
                                            obj = java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
                                        }
                                    } else if ((i28 == 12 || i28 == 14) && (mq0Var2 = gp0Var.J1.f457890h) != null) {
                                        java.lang.String h38 = o72.x1.h(mq0Var2.f462272h);
                                        boolean K08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h38);
                                        obj = h38;
                                        if (K08) {
                                            obj = java.lang.Integer.valueOf(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).bj());
                                        }
                                    } else if (i28 == 16) {
                                        com.p314xaae8f345.mm.p2621x8fb0427b.y8 D32 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(gp0Var.f456941f);
                                        java.lang.String str9 = D32.f277891a;
                                        if (str9 == null || str9.length() == 0) {
                                            obj = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
                                        } else {
                                            spannableString = new android.text.SpannableString(D32.f277891a);
                                            obj = spannableString;
                                        }
                                    } else {
                                        i27 = 8;
                                        i19 = 6;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            obj = null;
        }
        if (obj instanceof java.lang.String) {
            str2 = (java.lang.String) obj;
        } else {
            if (obj instanceof java.lang.Integer) {
                ((java.lang.Integer) obj).intValue();
            }
            str2 = null;
        }
        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
        r45.tq0 tq0Var3 = bq0Var.f452501m;
        int i37 = r2Var.f67657x2262335f;
        if (i37 == 1) {
            i1Var.i(bq0Var.f452507s);
            i1Var.f450668b.f293354b.Q = 2;
            i1Var.b(new x82.p(r2Var, context));
            return;
        }
        if (i37 == 2) {
            i1Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str2), 3);
            return;
        }
        if (i37 == 14) {
            java.lang.String str10 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e6.a(context, r2Var).f182364a;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572068xv));
            stringBuffer.append(str10);
            i1Var.i(stringBuffer.toString());
            return;
        }
        if (i37 == 16) {
            i1Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str2), 2);
            return;
        }
        if (i37 == 24) {
            r45.op0 op0Var = bq0Var.P;
            if (op0Var != null) {
                str3 = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f572122za) + op0Var.f463945i;
            } else {
                str3 = null;
            }
            i1Var.i(str3);
            return;
        }
        switch (i37) {
            case 4:
                i1Var.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(str2), 2);
                return;
            case 5:
                if (tq0Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var3.f468197d)) {
                    str4 = null;
                    str5 = null;
                } else {
                    str4 = tq0Var3.f468197d;
                    str5 = tq0Var3.f468199f;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    str4 = J2.f456937d;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                    J2.getClass();
                }
                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572122za));
                stringBuffer2.append(str4);
                i1Var.i(stringBuffer2.toString());
                return;
            case 6:
                r45.pp0 pp0Var = bq0Var.f452499h;
                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572003vz);
                if (pp0Var != null) {
                    string3 = string3 + pp0Var.f464805m;
                }
                i1Var.i(string3);
                return;
            case 7:
                break;
            case 8:
                java.lang.String str11 = bq0Var.f452505q;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str11)) {
                    str11 = J2.f456937d;
                }
                java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571963uv));
                stringBuffer3.append(str11);
                i1Var.i(stringBuffer3.toString());
                return;
            default:
                switch (i37) {
                    case 18:
                        java.lang.String string4 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572039x0);
                        java.lang.String replaceAll = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e6.a(context, r2Var).f182365b.replaceAll("\n", " ");
                        java.lang.StringBuffer stringBuffer4 = new java.lang.StringBuffer(string4);
                        stringBuffer4.append(replaceAll);
                        i1Var.i(stringBuffer4.toString());
                        return;
                    case 19:
                        if (bq0Var.I != null) {
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571627kq) + r2Var.f67640x5ab01132.f452505q;
                        } else {
                            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571627kq);
                        }
                        i1Var.i(string);
                        return;
                    case 20:
                        r45.kv2 kv2Var = bq0Var.M;
                        if (kv2Var != null) {
                            string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571965ux) + kv2Var.m75945x2fec8307(4);
                        } else {
                            string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571965ux);
                        }
                        i1Var.i(string2);
                        return;
                    case 21:
                        break;
                    default:
                        switch (i37) {
                            case 32:
                                break;
                            case 33:
                                java.lang.String str12 = J2.f456937d;
                                r45.hp0 hp0Var = J2.J1;
                                java.lang.StringBuffer stringBuffer5 = new java.lang.StringBuffer(il4.d.p(context, hp0Var != null ? hp0Var.G : null));
                                stringBuffer5.append(str12);
                                i1Var.i(stringBuffer5.toString());
                                return;
                            case 34:
                                r45.ev2 ev2Var = bq0Var.Q;
                                if (ev2Var != null) {
                                    r17 = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571967mv4) + ev2Var.m75945x2fec8307(1);
                                } else {
                                    r17 = i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571967mv4);
                                }
                                i1Var.i(r17);
                                return;
                            default:
                                java.lang.String str13 = (tq0Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var3.f468197d)) ? null : tq0Var3.f468197d;
                                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str13)) {
                                    str13 = J2.f456937d;
                                }
                                java.lang.StringBuffer stringBuffer6 = new java.lang.StringBuffer(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571542ic));
                                stringBuffer6.append(str13);
                                i1Var.i(stringBuffer6.toString());
                                return;
                        }
                }
        }
        java.lang.String str14 = (tq0Var3 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(tq0Var3.f468197d)) ? null : tq0Var3.f468197d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str14)) {
            str14 = J2.f456937d;
        }
        r45.hp0 hp0Var2 = J2.J1;
        r45.xs4 xs4Var = hp0Var2 != null ? hp0Var2.C : null;
        java.lang.StringBuffer stringBuffer7 = new java.lang.StringBuffer(il4.l.e(context, xs4Var != null ? xs4Var.m75939xb282bd08(18) : 0));
        stringBuffer7.append(str14);
        i1Var.i(stringBuffer7.toString());
    }

    public static void m(r35.i1 i1Var, android.content.Context context, int i17, o72.r2 r2Var, long j17, java.lang.String str) {
        if (r2Var == null || context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
            return;
        }
        r45.gp0 J2 = o72.x1.J(r2Var);
        int i18 = r2Var.f67657x2262335f;
        if (i18 == 1) {
            i1Var.b(new x82.r(r2Var, context));
            return;
        }
        if (i18 == 2) {
            i1Var.b(new x82.v(r2Var, J2, context));
            return;
        }
        if (i18 != 4) {
            if (i18 == 5) {
                i1Var.b(new x82.t(context, r2Var));
                return;
            }
            if (i18 == 6) {
                i1Var.b(new x82.s(r2Var.f67640x5ab01132.f452499h, context));
                return;
            }
            if (i18 == 8) {
                i1Var.b(new x82.q(context, r2Var));
                return;
            }
            if (i18 == 14) {
                i1Var.b(new x82.u(context, r2Var));
                return;
            }
            if (i18 != 16) {
                if (i18 == 18) {
                    i1Var.b(new x82.y(context, j17, str, i17, r2Var));
                    return;
                } else if (i18 == 20) {
                    i1Var.b(new x82.z(r2Var, context));
                    return;
                } else {
                    if (i18 != 24) {
                        return;
                    }
                    i1Var.b(new x82.b0(r2Var, context));
                    return;
                }
            }
        }
        i1Var.b(new x82.x(r2Var, context));
    }

    public static void n(o72.r2 r2Var, r45.dq0 dq0Var, android.content.Intent intent) {
        o(dq0Var, intent);
        intent.putExtra("key_detail_info_id", r2Var.f67645x88be67a1);
        intent.putExtra("key_detail_data_id", r2Var.E1);
    }

    public static void o(r45.dq0 dq0Var, android.content.Intent intent) {
        intent.putExtra("key_detail_fav_scene", dq0Var.f454186d);
        intent.putExtra("key_detail_fav_sub_scene", dq0Var.f454187e);
        intent.putExtra("key_detail_fav_index", dq0Var.f454188f);
        intent.putExtra("key_detail_fav_query", dq0Var.f454190h);
        intent.putExtra("key_detail_fav_sessionid", dq0Var.f454189g);
        intent.putExtra("key_detail_fav_tags", dq0Var.f454191i);
        intent.putExtra("key_detail_fav_is_search", dq0Var.f454193n);
        intent.putExtra("key_detail_fav_search_index", dq0Var.f454194o);
        intent.putExtra("key_detail_fav_ori_index", dq0Var.f454195p);
        intent.putExtra("key_detail_fav_general_msg_type", dq0Var.f454196q);
    }
}

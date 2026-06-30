package oo4;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final oo4.d f428730a = new oo4.d();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f428731b = kz5.c0.i(13, 14, 16);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f428732c = jz5.h.b(oo4.c.f428729d);

    public final int a(int i17) {
        boolean z17 = true;
        if (((((i17 == 1 || i17 == 2) || i17 == 7) || i17 == 8) || i17 == 18) || i17 == 15) {
            return 1;
        }
        if (i17 == 12) {
            return 2;
        }
        if (i17 != 13 && i17 != 16) {
            z17 = false;
        }
        if (z17) {
            return 1000;
        }
        return i17 == 17 ? 3 : 0;
    }

    public final int b(int i17) {
        if (i17 == 1) {
            return 1;
        }
        if (i17 != 2) {
            if (i17 != 3) {
                if (i17 == 14) {
                    return 3;
                }
                switch (i17) {
                    case 7:
                    case 8:
                        return 1;
                    case 9:
                        break;
                    case 10:
                        break;
                    default:
                        return 0;
                }
            }
            return 1000;
        }
        return 2;
    }

    public final r45.ej2 c(bw5.jr reportInfoScene) {
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoScene, "reportInfoScene");
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.m(reportInfoScene);
    }

    public final java.util.Map d(android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        long j17 = 0;
        if (bundle != null) {
            j17 = bundle.getLong("key_ref_feed_id", 0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderRefFeedId by parse:" + j17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderRefFeedId by default");
        }
        int i18 = 0;
        if (bundle != null) {
            i17 = bundle.getInt("key_ref_enter_scene", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderRefEnterScene by parse:" + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderRefEnterScene by default:");
            i17 = 0;
        }
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String str4 = "";
        if (bundle != null) {
            str = bundle.getString("key_click_tab_context_id", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by parse:" + str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderClickTabContextId by default:");
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (bundle != null) {
            str2 = bundle.getString("FINDER_CONTEXT_ID", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by parse:" + str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by default:");
            str2 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        if (bundle != null) {
            i18 = bundle.getInt("key_from_comment_scene", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderCommentScene by parse:" + i18);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderCommentScene by default:");
        }
        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(i18));
        lVarArr[3] = new jz5.l("source_feedid", pm0.v.u(j17));
        lVarArr[4] = new jz5.l("enterscene", java.lang.Integer.valueOf(i17));
        if (bundle != null) {
            str3 = bundle.getString("KEY_EDIT_ID", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getEditId by parse:" + str3);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getEditId by default");
            str3 = "";
        }
        lVarArr[5] = new jz5.l("editid", str3);
        if (bundle != null) {
            str4 = bundle.getString("KEY_TEMPLATE_ID", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getTemplateId by parse:" + str4);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineEditorModelParser", "getTemplateId by default");
        }
        lVarArr[6] = new jz5.l("templateid", str4);
        lVarArr[7] = new jz5.l("video_music_bussid", 8);
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        lVarArr[8] = new jz5.l("finder_post_sessionid", ((qs2.q) ((w40.e) c17)).hj());
        return kz5.c1.k(lVarArr);
    }

    public final java.util.Map e(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        if (c16997xb0aa383a == null) {
            return new java.util.LinkedHashMap();
        }
        r45.pg4 pg4Var = c16997xb0aa383a.A;
        java.lang.String str2 = pg4Var != null ? pg4Var.f464557m : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String e17 = c16997xb0aa383a.e();
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("view_id", str);
        lVarArr[1] = new jz5.l("songid", e17);
        lVarArr[2] = new jz5.l("listenid", e17);
        lVarArr[3] = new jz5.l("like_feedid", str2);
        java.lang.String str3 = c16997xb0aa383a.D;
        lVarArr[4] = new jz5.l("session_buffer", str3 != null ? str3 : "");
        return kz5.c1.l(lVarArr);
    }

    public final dy1.r f() {
        return (dy1.r) ((jz5.n) f428732c).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r17, bw5.jr r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oo4.d.g(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, bw5.jr, java.lang.String):void");
    }

    public final void h(int i17, android.os.Bundle bundle) {
        java.util.Map m17 = kz5.c1.m(d(bundle), kz5.b1.e(new jz5.l("view_id", "bgm_panel")));
        cy1.a aVar = (cy1.a) f();
        aVar.Ej("view_exp", m17, i17);
        aVar.Bj("bgm_panel", "view_exp", m17, 1, false);
    }

    public final void i(int i17, android.os.Bundle bundle) {
        ((cy1.a) f()).Bj("bgm_panel_tab", "view_exp", kz5.c1.m(d(bundle), kz5.b1.e(new jz5.l("bgm_panel_tab", java.lang.Integer.valueOf(b(i17))))), 1, false);
    }

    public final void j(int i17, java.lang.String viewId, android.os.Bundle bundle, java.util.Map dynamicMap, android.view.View view, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dynamicMap, "dynamicMap");
        java.util.Map m17 = kz5.c1.m(d(bundle), dynamicMap);
        if (z17) {
            if (i17 > 0) {
                ((cy1.a) f()).Ej("view_clk", m17, i17);
            }
            ((cy1.a) f()).Bj(viewId, "view_clk", m17, 1, false);
        }
        if (!z18 || view == null) {
            return;
        }
        cy1.a aVar = (cy1.a) f();
        aVar.pk(view, viewId);
        aVar.Tj(view, 32, 1, false);
        ((cy1.a) aVar.ik(view, 32, i17)).gk(view, m17);
    }

    public final void l(bw5.jr reportInfoScene, r45.ej2 ej2Var) {
        i95.m c17 = i95.n0.c(w40.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportInfoScene, "reportInfoScene");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.S(reportInfoScene, ej2Var);
    }
}

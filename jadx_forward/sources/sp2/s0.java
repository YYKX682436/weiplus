package sp2;

/* loaded from: classes2.dex */
public final class s0 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492735a;

    public s0(sp2.o2 o2Var) {
        this.f492735a = o2Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.util.Iterator it;
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        java.lang.String str3;
        org.json.JSONObject d17;
        java.lang.String num;
        java.lang.String num2;
        r45.s92 s92Var;
        dk2.hc hcVar;
        java.util.List list;
        r45.s92 s92Var2;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        r45.fa2 fa2Var;
        java.lang.String str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        java.lang.String str5 = "Finder.LiveEntranceFragmentViewCallback";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it6 = recordsSet.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            sp2.o2 o2Var = this.f492735a;
            if (!hasNext) {
                sp2.j.f492587a.c(o2Var.f492654a, recordsSet, null);
                return;
            }
            in5.j jVar = (in5.j) it6.next();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o2Var.f492654a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            rq2.w wVar = (rq2.w) zVar.a(activity).a(rq2.w.class);
            if (wVar != null) {
                in5.c cVar = jVar.f374603a;
                if (cVar instanceof vp2.e) {
                    wVar.f480436e = jVar.f374607e;
                } else {
                    boolean z18 = cVar instanceof vp2.o;
                    tp2.f fVar = o2Var.E;
                    it = it6;
                    r45.qt2 qt2Var = o2Var.f492660d;
                    if (z18) {
                        wVar.f480435d = jVar.f374607e;
                        cl0.g gVar = new cl0.g();
                        gVar.s("page_index", java.lang.Integer.valueOf(jVar.f374607e));
                        java.lang.String c17 = fVar.c(jVar.f374607e, jVar.f374608f, "onExpose");
                        java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(1);
                        java.lang.String gVar2 = gVar.toString();
                        wVar.P6(c17, m75945x2fec8307, "main_page_focus_list", gVar2 != null ? r26.i0.t(gVar2, ",", ";", false) : null);
                    } else {
                        boolean z19 = cVar instanceof vp2.l0;
                        java.lang.String str6 = "";
                        if (z19) {
                            vp2.l0 l0Var = z19 ? (vp2.l0) cVar : null;
                            if (l0Var != null && (fa2Var = l0Var.f520473d) != null && (str4 = fa2Var.f455660f) != null) {
                                str6 = str4;
                            }
                            wVar.f480438g.put(str6, java.lang.Integer.valueOf(jVar.f374607e));
                            cl0.g gVar3 = new cl0.g();
                            gVar3.s("page_index", java.lang.Integer.valueOf(jVar.f374607e));
                            gVar3.s("column_id", str6);
                            java.lang.String c18 = fVar.c(jVar.f374607e, jVar.f374608f, "onExpose");
                            java.lang.String m75945x2fec83072 = qt2Var.m75945x2fec8307(1);
                            java.lang.String gVar4 = gVar3.toString();
                            wVar.P6(c18, m75945x2fec83072, "main_page_column", gVar4 != null ? r26.i0.t(gVar4, ",", ";", false) : null);
                        } else if (cVar instanceof vp2.b0) {
                            int i17 = jVar.f374607e;
                            wVar.f480437f = i17;
                            wVar.P6(fVar.c(i17, jVar.f374608f, "onExpose"), qt2Var.m75945x2fec8307(1), "main_page_recmd_more", "");
                        } else {
                            boolean z27 = cVar instanceof vp2.h0;
                            if (z27 ? true : cVar instanceof vp2.e0) {
                                str2 = str5;
                                z17 = true;
                            } else {
                                z17 = cVar instanceof wp2.b;
                                str2 = str5;
                            }
                            if (z17) {
                                boolean z28 = cVar instanceof vp2.e0;
                                int i18 = z28 ? 2 : 1;
                                cl0.g gVar5 = new cl0.g();
                                int i19 = wVar.f480437f;
                                if (i19 < 0) {
                                    i19 = 0;
                                }
                                gVar5.s("page_index", java.lang.Integer.valueOf(i19));
                                gVar5.s("card_type", java.lang.Integer.valueOf(i18));
                                int i27 = jVar.f374607e;
                                int i28 = wVar.f480437f;
                                if (i28 < 0) {
                                    i28 = 0;
                                }
                                gVar5.s("card_index", java.lang.Integer.valueOf(i27 - i28));
                                wp2.b bVar = cVar instanceof wp2.b ? (wp2.b) cVar : null;
                                gVar5.s("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) ? "" : java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)));
                                vp2.e0 e0Var = z28 ? (vp2.e0) cVar : null;
                                if (e0Var == null || (oa2Var = e0Var.f520450d) == null || (h32Var = (r45.h32) oa2Var.m75936x14adae67(0)) == null || (str3 = h32Var.m75945x2fec8307(4)) == null) {
                                    str3 = "";
                                }
                                gVar5.s("Noticeid", str3);
                                r45.dk2 dk2Var = o2Var.A;
                                if (dk2Var != null && (s92Var2 = (r45.s92) dk2Var.m75936x14adae67(12)) != null) {
                                    gVar5.s("card_size", s92Var2.m75939xb282bd08(0) == 0 ? "16:9" : "4:3");
                                }
                                boolean z29 = cVar instanceof vp2.u;
                                if (z29) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.convertdata.LiveReplayConvertData");
                                    gVar5.s("ref_objectid", pm0.v.u(((vp2.u) cVar).getFeedObject().m59251x5db1b11()));
                                }
                                if (z27) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.convertdata.NpsSurveyConvertData");
                                    dk2.bc bcVar = ((vp2.h0) cVar).f520458e;
                                    gVar5.s("options_list", (bcVar == null || (hcVar = bcVar.f314789c) == null || (list = hcVar.f315116e) == null) ? null : kz5.n0.g0(list, "#", null, null, 0, null, sp2.q0.f492719d, 30, null));
                                }
                                java.lang.String str7 = z27 ? "square_nps_quest_card" : z29 ? "play_back_video_card" : "main_page_recmd_card";
                                java.lang.String c19 = fVar.c(jVar.f374607e, jVar.f374608f, "onExpose");
                                java.lang.String m75945x2fec83073 = qt2Var.m75945x2fec8307(1);
                                java.lang.String gVar6 = gVar5.toString();
                                wVar.P6(c19, m75945x2fec83073, str7, gVar6 != null ? r26.i0.t(gVar6, ",", ";", false) : null);
                                cq2.r rVar = cq2.r.f302977a;
                                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
                                int o17 = o2Var.o(jVar.f374607e, cVar);
                                so2.j5 j5Var = (so2.j5) cVar;
                                r45.dk2 dk2Var2 = o2Var.A;
                                d17 = rVar.d(abstractActivityC21394xb3d2c0cf, o17, j5Var, (dk2Var2 == null || (s92Var = (r45.s92) dk2Var2.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? true : o2Var.v(), (r21 & 128) != 0);
                                if (!(cVar instanceof so2.j5)) {
                                    j5Var = null;
                                }
                                o2Var.i(d17, j5Var);
                                boolean z37 = cVar instanceof vp2.e0;
                                if (z37) {
                                    vp2.e0 e0Var2 = z37 ? (vp2.e0) cVar : null;
                                    if (e0Var2 != null) {
                                        ml2.d dVar = o2Var.C;
                                        int i29 = jVar.f374607e;
                                        ml2.x1 x1Var = ml2.x1.f409735f;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                        java.lang.String str8 = (nyVar == null || (num2 = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num2;
                                        java.lang.String jSONObject = d17.toString();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                                        dVar.h(e0Var2, i29, x1Var, str8, "", jSONObject);
                                    }
                                } else {
                                    wp2.b bVar2 = cVar instanceof wp2.b ? (wp2.b) cVar : null;
                                    if (bVar2 != null) {
                                        ml2.d dVar2 = o2Var.C;
                                        int i37 = jVar.f374607e;
                                        ml2.x1 x1Var2 = ml2.x1.f409735f;
                                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                        java.lang.String str9 = (nyVar2 == null || (num = java.lang.Integer.valueOf(nyVar2.f216913n).toString()) == null) ? "" : num;
                                        java.lang.String jSONObject2 = d17.toString();
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                                        dVar2.h(bVar2, i37, x1Var2, str9, "", jSONObject2);
                                    }
                                }
                            } else {
                                boolean z38 = cVar instanceof vp2.c;
                                if (z38) {
                                    vp2.c cVar2 = z38 ? (vp2.c) cVar : null;
                                    if (cVar2 != null) {
                                        r45.le1 le1Var = cVar2.f520443d;
                                        if (le1Var.B == 2) {
                                            java.lang.String m75945x2fec83074 = qt2Var.m75945x2fec8307(1);
                                            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                                            jSONObject3.putOpt("topic_id", le1Var.f460888o);
                                            int i38 = jVar.f374607e;
                                            int i39 = wVar.f480437f;
                                            if (i39 < 0) {
                                                i39 = 0;
                                            }
                                            jSONObject3.putOpt("card_index", java.lang.Integer.valueOf(i38 - i39));
                                            java.lang.String jSONObject4 = jSONObject3.toString();
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
                                            wVar.P6("", m75945x2fec83074, "main_page_chatroom_card", r26.i0.t(jSONObject4, ",", ";", false));
                                        }
                                    }
                                } else {
                                    str = str2;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "handleExposeReport unknown feed:" + cVar);
                                    str5 = str;
                                    it6 = it;
                                }
                            }
                            str = str2;
                            str5 = str;
                            it6 = it;
                        }
                    }
                    str = str5;
                    str5 = str;
                    it6 = it;
                }
            }
            it = it6;
            str = str5;
            str5 = str;
            it6 = it;
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        org.json.JSONObject d17;
        r45.s92 s92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.c cVar = item.f374603a;
        boolean z17 = cVar instanceof vp2.b0;
        sp2.o2 o2Var = this.f492735a;
        if (z17) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o2Var.f492654a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((rq2.w) pf5.z.f435481a.a(activity).a(rq2.w.class)).f480437f = item.f374607e;
        }
        cq2.r rVar = cq2.r.f302977a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
        int o17 = o2Var.o(item.f374607e, cVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        so2.j5 j5Var = (so2.j5) cVar;
        r45.dk2 dk2Var = o2Var.A;
        d17 = rVar.d(abstractActivityC21394xb3d2c0cf, o17, j5Var, (dk2Var == null || (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? true : o2Var.v(), (r21 & 128) != 0);
        o2Var.i(d17, cVar instanceof so2.j5 ? (so2.j5) cVar : null);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f491911e = d17;
        }
        sp2.j.e(sp2.j.f492587a, o2Var.f492654a, item, d17, null, 8, null);
        vp2.c cVar2 = cVar instanceof vp2.c ? (vp2.c) cVar : null;
        if (cVar2 != null) {
            xq2.e.f537582a.a(cVar2);
        }
    }
}

package iq2;

/* loaded from: classes2.dex */
public final class h extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375280a;

    public h(iq2.d0 d0Var) {
        this.f375280a = d0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.util.Iterator it;
        java.lang.String str;
        org.json.JSONObject d17;
        java.lang.String num;
        java.lang.String num2;
        r45.s92 s92Var;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        iq2.d0 d0Var = this.f375280a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it6 = recordsSet.iterator();
        while (it6.hasNext()) {
            in5.j jVar = (in5.j) it6.next();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = d0Var.f375250a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            rq2.w wVar = (rq2.w) zVar.a(activity).a(rq2.w.class);
            if (wVar != null) {
                in5.c cVar = jVar.f374603a;
                boolean z17 = cVar instanceof vp2.c;
                r45.qt2 qt2Var = d0Var.f375263n;
                if (z17) {
                    vp2.c cVar2 = z17 ? (vp2.c) cVar : null;
                    if (cVar2 != null) {
                        r45.le1 le1Var = cVar2.f520443d;
                        if (le1Var.B == 2) {
                            java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(1);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.putOpt("topic_id", le1Var.f460888o);
                            jSONObject.putOpt("card_index", java.lang.Integer.valueOf(jVar.f374607e));
                            java.lang.String jSONObject2 = jSONObject.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                            wVar.P6("", m75945x2fec8307, "main_page_chatroom_card", r26.i0.t(jSONObject2, ",", ";", false));
                        } else {
                            java.lang.String m75945x2fec83072 = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                            jSONObject3.putOpt("topic_id", le1Var.f460888o);
                            wVar.P6("", m75945x2fec83072, "main_page_topic_card", jSONObject3.toString());
                        }
                    }
                } else {
                    boolean z18 = cVar instanceof wp2.b;
                    if (z18) {
                        boolean z19 = cVar instanceof vp2.e0;
                        it = it6;
                        int i17 = z19 ? 2 : 1;
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                        jSONObject4.putOpt("page_index", java.lang.Integer.valueOf(wVar.f480437f));
                        jSONObject4.putOpt("card_type", java.lang.Integer.valueOf(i17));
                        jSONObject4.putOpt("card_index", java.lang.Integer.valueOf(jVar.f374607e - wVar.f480437f));
                        wp2.b bVar = z18 ? (wp2.b) cVar : null;
                        jSONObject4.putOpt("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) ? "" : java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)));
                        vp2.e0 e0Var = z19 ? (vp2.e0) cVar : null;
                        if (e0Var == null || (oa2Var = e0Var.f520450d) == null || (h32Var = (r45.h32) oa2Var.m75936x14adae67(0)) == null || (str = h32Var.m75945x2fec8307(4)) == null) {
                            str = "";
                        }
                        jSONObject4.putOpt("Noticeid", str);
                        java.lang.String c17 = d0Var.f375273x.c(jVar.f374607e, jVar.f374608f, "onExpose");
                        java.lang.String m75945x2fec83073 = qt2Var.m75945x2fec8307(1);
                        java.lang.String jSONObject5 = jSONObject4.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject5, "toString(...)");
                        wVar.P6(c17, m75945x2fec83073, "main_page_recmd_card", r26.i0.t(jSONObject5, ",", ";", false));
                        cq2.r rVar = cq2.r.f302977a;
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d0Var.f375250a;
                        int i18 = jVar.f374607e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
                        r45.dk2 dk2Var = d0Var.f375269t;
                        d17 = rVar.d(abstractActivityC21394xb3d2c0cf, i18, abstractC14490x69736cb5, (dk2Var == null || (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 16) != 0 ? 0 : d0Var.f375252c.f382629b, (r21 & 32) != 0 ? 0 : d0Var.f(), (r21 & 64) != 0, (r21 & 128) != 0);
                        boolean z27 = cVar instanceof vp2.e0;
                        if (z27) {
                            vp2.e0 e0Var2 = z27 ? (vp2.e0) cVar : null;
                            if (e0Var2 != null) {
                                ml2.d dVar = d0Var.f375270u;
                                int i19 = jVar.f374607e;
                                ml2.x1 x1Var = ml2.x1.f409735f;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                java.lang.String str2 = (nyVar == null || (num2 = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num2;
                                java.lang.String jSONObject6 = d17.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
                                dVar.h(e0Var2, i19, x1Var, str2, "", jSONObject6);
                            }
                        } else {
                            wp2.b bVar2 = cVar instanceof wp2.b ? (wp2.b) cVar : null;
                            if (bVar2 != null) {
                                ml2.d dVar2 = d0Var.f375270u;
                                int i27 = jVar.f374607e;
                                ml2.x1 x1Var2 = ml2.x1.f409735f;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                java.lang.String str3 = (nyVar2 == null || (num = java.lang.Integer.valueOf(nyVar2.f216913n).toString()) == null) ? "" : num;
                                java.lang.String jSONObject7 = d17.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject7, "toString(...)");
                                dVar2.h(bVar2, i27, x1Var2, str3, "", jSONObject7);
                            }
                        }
                    } else {
                        it = it6;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(d0Var.f375254e, "handleExposeReport unknown feed:" + cVar);
                    }
                    it6 = it;
                }
            }
            it = it6;
            it6 = it;
        }
        sp2.j.f492587a.c(d0Var.f375250a, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        org.json.JSONObject d17;
        r45.s92 s92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        cq2.r rVar = cq2.r.f302977a;
        iq2.d0 d0Var = this.f375280a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d0Var.f375250a;
        int i17 = item.f374607e;
        in5.c cVar = item.f374603a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        so2.j5 j5Var = (so2.j5) cVar;
        r45.dk2 dk2Var = d0Var.f375269t;
        int i18 = 0;
        if (dk2Var != null && (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) != null) {
            i18 = s92Var.m75939xb282bd08(0);
        }
        d17 = rVar.d(abstractActivityC21394xb3d2c0cf, i17, j5Var, i18, (r21 & 16) != 0 ? 0 : d0Var.f375252c.f382629b, (r21 & 32) != 0 ? 0 : d0Var.f(), (r21 & 64) != 0, (r21 & 128) != 0);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f491911e = d17;
        }
        sp2.j.e(sp2.j.f492587a, d0Var.f375250a, item, d17, null, 8, null);
        vp2.c cVar2 = cVar instanceof vp2.c ? (vp2.c) cVar : null;
        if (cVar2 != null) {
            xq2.e.f537582a.a(cVar2);
        }
    }
}

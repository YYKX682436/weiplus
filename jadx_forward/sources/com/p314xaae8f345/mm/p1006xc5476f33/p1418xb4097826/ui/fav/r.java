package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav;

/* loaded from: classes2.dex */
public final class r extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x f210735a;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.x xVar) {
        this.f210735a = xVar;
    }

    @Override // in5.p
    public boolean b() {
        return false;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        int h17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.fav.C15106x1388ca00 fragment = this.f210735a.f210751b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(fragment).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null) {
            r45.qt2 V6 = nyVar.V6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded: size = ");
            sb6.append(recordsSet.size());
            sb6.append(", commentScene=");
            int i17 = 5;
            sb6.append(V6.m75939xb282bd08(5));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderProfileAllUIC", sb6.toString());
            java.util.Iterator it = recordsSet.iterator();
            while (it.hasNext()) {
                in5.j jVar = (in5.j) it.next();
                in5.c cVar = jVar.f374603a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
                if (abstractC14490x69736cb5 != null && ((h17 = abstractC14490x69736cb5.h()) == 2 || h17 == 4)) {
                    long j17 = jVar.f374604b;
                    long j18 = jVar.f374605c;
                    android.view.View view = jVar.f374608f;
                    if (view != null) {
                        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.teh);
                        java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
                        long longValue = l17 != null ? l17.longValue() : 0L;
                        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.tei);
                        java.lang.String str2 = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
                        java.lang.String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        long max = longValue == 0 ? j18 - j17 : java.lang.Math.max(longValue - j17, 0L);
                        if (str2.length() > 0) {
                            str3 = str2;
                        } else {
                            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec());
                            if (mb4Var != null) {
                                java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
                                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                                    java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(1);
                                    if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                                        str = "";
                                    } else {
                                        str = mb4Var.m75945x2fec8307(1) + mb4Var.m75945x2fec8307(19);
                                    }
                                } else {
                                    str = mb4Var.m75945x2fec8307(16) + mb4Var.m75945x2fec8307(20);
                                }
                                if (str != null) {
                                    str3 = str;
                                }
                            }
                        }
                        bu2.r rVar = bu2.r.f106092a;
                        boolean z17 = !rVar.b(hc2.o0.s(abstractC14490x69736cb5));
                        java.lang.String t17 = r26.i0.t(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), V6.m75939xb282bd08(i17)), ",", ";", false);
                        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[11];
                        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
                        lVarArr[1] = new jz5.l("finder_context_id", V6.m75945x2fec8307(1));
                        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
                        lVarArr[3] = new jz5.l("session_buffer", t17);
                        lVarArr[4] = new jz5.l("finder_username", abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c());
                        lVarArr[5] = new jz5.l("extra_info", V6.m75945x2fec8307(11));
                        lVarArr[6] = new jz5.l("white_pic_time", java.lang.Long.valueOf(max));
                        lVarArr[7] = new jz5.l("pic_index", 0);
                        lVarArr[8] = new jz5.l("is_livephoto", 0);
                        lVarArr[9] = new jz5.l("pic_url", str3);
                        lVarArr[10] = new jz5.l("first_expose", java.lang.Integer.valueOf(z17 ? 1 : 2));
                        ((cy1.a) rVar2).Bj("global_fav_feed_grid_item", "finder_photo_optimize", kz5.c1.k(lVarArr), 1, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGlobalFavViewCallback", "current feed: " + hc2.o0.t(abstractC14490x69736cb5) + ", whiteScreenTime: " + max + ", isFirstExposed: " + z17 + ", picUrl: " + str3);
                        rVar.a(hc2.o0.s(abstractC14490x69736cb5));
                    }
                }
                i17 = 5;
            }
        }
    }
}

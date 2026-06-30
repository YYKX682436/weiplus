package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class y0 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 f192665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f192666b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f192667c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f192668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f192669e;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var, r45.qt2 qt2Var, yz5.l lVar, yz5.l lVar2, float f17) {
        this.f192665a = a1Var;
        this.f192666b = qt2Var;
        this.f192667c = lVar;
        this.f192668d = lVar2;
        this.f192669e = f17;
    }

    @Override // in5.p
    public float a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return this.f192669e;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        int h17;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var;
        java.util.Iterator it;
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3> cls;
        java.lang.Long l17;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var2 = this.f192665a;
        r45.qt2 qt2Var = this.f192666b;
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3> cls2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class;
        java.lang.String str3 = ", commentScene=";
        int i17 = 4;
        if (a1Var2.H(qt2Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var2.f187711h, "onExposeTimeRecorded: size = " + recordsSet.size() + ", commentScene=" + a1Var2.f187708e);
            java.util.Iterator it6 = recordsSet.iterator();
            while (it6.hasNext()) {
                in5.j jVar = (in5.j) it6.next();
                in5.c cVar = jVar.f374603a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
                if (abstractC14490x69736cb5 != null && ((h17 = abstractC14490x69736cb5.h()) == 2 || h17 == i17)) {
                    str = str3;
                    long j17 = jVar.f374604b;
                    long j18 = jVar.f374605c;
                    android.view.View view = jVar.f374608f;
                    if (view != null) {
                        java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.teh);
                        if (tag instanceof java.lang.Long) {
                            l17 = (java.lang.Long) tag;
                            a1Var = a1Var2;
                        } else {
                            a1Var = a1Var2;
                            l17 = null;
                        }
                        long longValue = l17 != null ? l17.longValue() : 0L;
                        java.lang.Object tag2 = view.getTag(com.p314xaae8f345.mm.R.id.tei);
                        java.lang.String str4 = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
                        java.lang.String str5 = "";
                        if (str4 == null) {
                            str4 = "";
                        }
                        long max = longValue == 0 ? j18 - j17 : java.lang.Math.max(longValue - j17, 0L);
                        if (str4.length() > 0) {
                            str5 = str4;
                        } else {
                            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec());
                            if (mb4Var != null) {
                                java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
                                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                                    java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(1);
                                    if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                                        str2 = "";
                                    } else {
                                        str2 = mb4Var.m75945x2fec8307(1) + mb4Var.m75945x2fec8307(19);
                                    }
                                } else {
                                    str2 = mb4Var.m75945x2fec8307(16) + mb4Var.m75945x2fec8307(20);
                                }
                                if (str2 != null) {
                                    str5 = str2;
                                }
                            }
                        }
                        bu2.r rVar = bu2.r.f106092a;
                        boolean z17 = !rVar.b(hc2.o0.s(abstractC14490x69736cb5));
                        cls = cls2;
                        it = it6;
                        java.lang.String t17 = r26.i0.t(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(cls2)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), qt2Var.m75939xb282bd08(5)), ",", ";", false);
                        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[11];
                        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
                        lVarArr[1] = new jz5.l("finder_context_id", qt2Var.m75945x2fec8307(1));
                        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)));
                        lVarArr[3] = new jz5.l("session_buffer", t17);
                        lVarArr[4] = new jz5.l("finder_username", abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c());
                        lVarArr[5] = new jz5.l("extra_info", qt2Var.m75945x2fec8307(11));
                        lVarArr[6] = new jz5.l("white_pic_time", java.lang.Long.valueOf(max));
                        lVarArr[7] = new jz5.l("pic_index", 0);
                        lVarArr[8] = new jz5.l("is_livephoto", 0);
                        lVarArr[9] = new jz5.l("pic_url", str5);
                        lVarArr[10] = new jz5.l("first_expose", java.lang.Integer.valueOf(z17 ? 1 : 2));
                        ((cy1.a) rVar2).Bj("base_feed_grid_item", "finder_photo_optimize", kz5.c1.k(lVarArr), 1, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var.f187711h, "current feed: " + hc2.o0.t(abstractC14490x69736cb5) + ", whiteScreenTime: " + max + ", isFirstExposed: " + z17 + ", picUrl: " + str5);
                        rVar.a(hc2.o0.s(abstractC14490x69736cb5));
                    } else {
                        a1Var = a1Var2;
                        it = it6;
                        cls = cls2;
                    }
                } else {
                    a1Var = a1Var2;
                    it = it6;
                    cls = cls2;
                    str = str3;
                }
                i17 = 4;
                str3 = str;
                a1Var2 = a1Var;
                it6 = it;
                cls2 = cls;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a1 a1Var3 = a1Var2;
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3> cls3 = cls2;
        java.lang.String str6 = str3;
        if (a1Var3.G(qt2Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a1Var3.f187711h, "onExposeTimeRecorded: size = " + recordsSet.size() + str6 + qt2Var.m75939xb282bd08(5));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it7 = recordsSet.iterator();
            while (it7.hasNext()) {
                in5.j jVar2 = (in5.j) it7.next();
                if (jVar2.f374603a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    r45.ni4 ni4Var = new r45.ni4();
                    in5.c cVar2 = jVar2.f374603a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar2;
                    abstractC14490x69736cb52.n1(true);
                    linkedList2.add(abstractC14490x69736cb52);
                    ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb52.mo2128x1ed62e84()));
                    ni4Var.set(15, abstractC14490x69736cb52.w());
                    ni4Var.set(6, java.lang.Integer.valueOf(jVar2.f374607e));
                    so2.h3.f491925d.f(ni4Var, qt2Var.m75939xb282bd08(5), qt2Var.m75939xb282bd08(7));
                    ni4Var.set(5, java.lang.Integer.valueOf((int) jVar2.f374606d));
                    ni4Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(cls3)).ek(abstractC14490x69736cb52.mo2128x1ed62e84(), abstractC14490x69736cb52.w(), qt2Var.m75939xb282bd08(5)));
                    linkedList.add(ni4Var);
                    yz5.l lVar = this.f192667c;
                    if (lVar != null) {
                        lVar.mo146xb9724478(jVar2);
                    }
                    qt2Var.m75939xb282bd08(5);
                    abstractC14490x69736cb52.getFeedObject().getFeedObject().m76801x8010e5e4();
                    pm0.v.u(abstractC14490x69736cb52.mo2128x1ed62e84());
                }
            }
            so2.h3.f491925d.e(linkedList, linkedList2, qt2Var, -1);
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.c cVar = item.f374603a;
        if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
            java.lang.String str = this.f192665a.f187711h;
            r45.qt2 qt2Var = this.f192666b;
            qt2Var.m75939xb282bd08(5);
            abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4();
            pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
            r45.ni4 ni4Var = new r45.ni4();
            ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            ni4Var.set(15, abstractC14490x69736cb5.w());
            ni4Var.set(6, java.lang.Integer.valueOf(item.f374607e));
            ni4Var.set(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), qt2Var.m75939xb282bd08(5)));
            ni4Var.set(11, 1);
            so2.h3 h3Var = so2.h3.f491925d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(ni4Var);
            h3Var.d(linkedList);
        }
        yz5.l lVar = this.f192668d;
        if (lVar != null) {
            lVar.mo146xb9724478(item);
        }
    }
}

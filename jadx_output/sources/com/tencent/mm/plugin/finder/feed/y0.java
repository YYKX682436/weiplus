package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class y0 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a1 f111132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f111133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f111134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f111135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f111136e;

    public y0(com.tencent.mm.plugin.finder.feed.a1 a1Var, r45.qt2 qt2Var, yz5.l lVar, yz5.l lVar2, float f17) {
        this.f111132a = a1Var;
        this.f111133b = qt2Var;
        this.f111134c = lVar;
        this.f111135d = lVar2;
        this.f111136e = f17;
    }

    @Override // in5.p
    public float a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f111136e;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        int h17;
        java.lang.String str;
        com.tencent.mm.plugin.finder.feed.a1 a1Var;
        java.util.Iterator it;
        java.lang.Class<com.tencent.mm.plugin.finder.report.o3> cls;
        java.lang.Long l17;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mm.plugin.finder.feed.a1 a1Var2 = this.f111132a;
        r45.qt2 qt2Var = this.f111133b;
        java.lang.Class<com.tencent.mm.plugin.finder.report.o3> cls2 = com.tencent.mm.plugin.finder.report.o3.class;
        java.lang.String str3 = ", commentScene=";
        int i17 = 4;
        if (a1Var2.H(qt2Var)) {
            com.tencent.mars.xlog.Log.i(a1Var2.f106178h, "onExposeTimeRecorded: size = " + recordsSet.size() + ", commentScene=" + a1Var2.f106175e);
            java.util.Iterator it6 = recordsSet.iterator();
            while (it6.hasNext()) {
                in5.j jVar = (in5.j) it6.next();
                in5.c cVar = jVar.f293070a;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
                if (baseFinderFeed != null && ((h17 = baseFinderFeed.h()) == 2 || h17 == i17)) {
                    str = str3;
                    long j17 = jVar.f293071b;
                    long j18 = jVar.f293072c;
                    android.view.View view = jVar.f293075f;
                    if (view != null) {
                        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.teh);
                        if (tag instanceof java.lang.Long) {
                            l17 = (java.lang.Long) tag;
                            a1Var = a1Var2;
                        } else {
                            a1Var = a1Var2;
                            l17 = null;
                        }
                        long longValue = l17 != null ? l17.longValue() : 0L;
                        java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.tei);
                        java.lang.String str4 = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
                        java.lang.String str5 = "";
                        if (str4 == null) {
                            str4 = "";
                        }
                        long max = longValue == 0 ? j18 - j17 : java.lang.Math.max(longValue - j17, 0L);
                        if (str4.length() > 0) {
                            str5 = str4;
                        } else {
                            r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(baseFinderFeed.getFeedObject().getMediaList());
                            if (mb4Var != null) {
                                java.lang.String string = mb4Var.getString(16);
                                if (string == null || string.length() == 0) {
                                    java.lang.String string2 = mb4Var.getString(1);
                                    if (string2 == null || string2.length() == 0) {
                                        str2 = "";
                                    } else {
                                        str2 = mb4Var.getString(1) + mb4Var.getString(19);
                                    }
                                } else {
                                    str2 = mb4Var.getString(16) + mb4Var.getString(20);
                                }
                                if (str2 != null) {
                                    str5 = str2;
                                }
                            }
                        }
                        bu2.r rVar = bu2.r.f24559a;
                        boolean z17 = !rVar.b(hc2.o0.s(baseFinderFeed));
                        cls = cls2;
                        it = it6;
                        java.lang.String t17 = r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(cls2)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), qt2Var.getInteger(5)), ",", ";", false);
                        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[11];
                        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
                        lVarArr[1] = new jz5.l("finder_context_id", qt2Var.getString(1));
                        lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(qt2Var.getInteger(5)));
                        lVarArr[3] = new jz5.l("session_buffer", t17);
                        lVarArr[4] = new jz5.l("finder_username", baseFinderFeed.getFeedObject().getUserName());
                        lVarArr[5] = new jz5.l("extra_info", qt2Var.getString(11));
                        lVarArr[6] = new jz5.l("white_pic_time", java.lang.Long.valueOf(max));
                        lVarArr[7] = new jz5.l("pic_index", 0);
                        lVarArr[8] = new jz5.l("is_livephoto", 0);
                        lVarArr[9] = new jz5.l("pic_url", str5);
                        lVarArr[10] = new jz5.l("first_expose", java.lang.Integer.valueOf(z17 ? 1 : 2));
                        ((cy1.a) rVar2).Bj("base_feed_grid_item", "finder_photo_optimize", kz5.c1.k(lVarArr), 1, false);
                        com.tencent.mars.xlog.Log.i(a1Var.f106178h, "current feed: " + hc2.o0.t(baseFinderFeed) + ", whiteScreenTime: " + max + ", isFirstExposed: " + z17 + ", picUrl: " + str5);
                        rVar.a(hc2.o0.s(baseFinderFeed));
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
        com.tencent.mm.plugin.finder.feed.a1 a1Var3 = a1Var2;
        java.lang.Class<com.tencent.mm.plugin.finder.report.o3> cls3 = cls2;
        java.lang.String str6 = str3;
        if (a1Var3.G(qt2Var)) {
            com.tencent.mars.xlog.Log.i(a1Var3.f106178h, "onExposeTimeRecorded: size = " + recordsSet.size() + str6 + qt2Var.getInteger(5));
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it7 = recordsSet.iterator();
            while (it7.hasNext()) {
                in5.j jVar2 = (in5.j) it7.next();
                if (jVar2.f293070a instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    r45.ni4 ni4Var = new r45.ni4();
                    in5.c cVar2 = jVar2.f293070a;
                    kotlin.jvm.internal.o.e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar2;
                    baseFinderFeed2.n1(true);
                    linkedList2.add(baseFinderFeed2);
                    ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed2.getItemId()));
                    ni4Var.set(15, baseFinderFeed2.w());
                    ni4Var.set(6, java.lang.Integer.valueOf(jVar2.f293074e));
                    so2.h3.f410392d.f(ni4Var, qt2Var.getInteger(5), qt2Var.getInteger(7));
                    ni4Var.set(5, java.lang.Integer.valueOf((int) jVar2.f293073d));
                    ni4Var.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(cls3)).ek(baseFinderFeed2.getItemId(), baseFinderFeed2.w(), qt2Var.getInteger(5)));
                    linkedList.add(ni4Var);
                    yz5.l lVar = this.f111134c;
                    if (lVar != null) {
                        lVar.invoke(jVar2);
                    }
                    qt2Var.getInteger(5);
                    baseFinderFeed2.getFeedObject().getFeedObject().getNickname();
                    pm0.v.u(baseFinderFeed2.getItemId());
                }
            }
            so2.h3.f410392d.e(linkedList, linkedList2, qt2Var, -1);
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        in5.c cVar = item.f293070a;
        if (cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
            java.lang.String str = this.f111132a.f106178h;
            r45.qt2 qt2Var = this.f111133b;
            qt2Var.getInteger(5);
            baseFinderFeed.getFeedObject().getFeedObject().getNickname();
            pm0.v.u(baseFinderFeed.getItemId());
            r45.ni4 ni4Var = new r45.ni4();
            ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            ni4Var.set(15, baseFinderFeed.w());
            ni4Var.set(6, java.lang.Integer.valueOf(item.f293074e));
            ni4Var.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), baseFinderFeed.w(), qt2Var.getInteger(5)));
            ni4Var.set(11, 1);
            so2.h3 h3Var = so2.h3.f410392d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(ni4Var);
            h3Var.d(linkedList);
        }
        yz5.l lVar = this.f111135d;
        if (lVar != null) {
            lVar.invoke(item);
        }
    }
}

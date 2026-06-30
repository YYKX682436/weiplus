package xn2;

/* loaded from: classes2.dex */
public final class w extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f537117b;

    public w(xn2.p0 p0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f537116a = p0Var;
        this.f537117b = c1163xf1deaba4;
    }

    public static final int f(xn2.p0 p0Var) {
        java.util.Iterator it = p0Var.j().m56388xcaeb60d0().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((so2.j5) it.next()) instanceof zn2.a) {
                return i17;
            }
            i17++;
        }
        return -1;
    }

    @Override // ym5.m0
    public float b(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return ((java.lang.Number) ((jz5.n) this.f537116a.G).mo141623x754a37bb()).floatValue();
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        int i17;
        int i18;
        r45.vx0 vx0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        xn2.p0 p0Var = this.f537116a;
        if (p0Var.f537086k) {
            p0Var.d();
            p0Var.k().c();
            java.util.HashSet hashSet = new java.util.HashSet();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f537117b;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper");
            int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5) layoutManager).w();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = c1163xf1deaba4.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.megavideo.topstory.flow.LinearLayoutManagerWrapper");
            int y17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.C14436x2022d0d5) layoutManager2).y();
            p0Var.f537098w = java.lang.Math.max(p0Var.f537098w, y17);
            int f17 = f(p0Var);
            p0Var.k().f("ViewIdMainFeed", y17 - f17);
            java.util.HashSet hashSet2 = p0Var.D;
            int i19 = 1;
            boolean z17 = !hashSet2.isEmpty();
            java.util.HashMap hashMap = p0Var.E;
            if (z17) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    jz5.o oVar = (jz5.o) it.next();
                    int intValue = ((java.lang.Number) oVar.f384375e).intValue();
                    java.lang.Object obj = oVar.f384375e;
                    if (intValue < w17 || ((java.lang.Number) obj).intValue() > y17) {
                        if (f17 < 0) {
                            f17 = f(p0Var);
                        }
                        int intValue2 = (((java.lang.Number) obj).intValue() - f17) + i19;
                        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                        zn2.a aVar = (zn2.a) oVar.f384376f;
                        boolean rj6 = ((c61.p2) ybVar).rj(aVar.getFeedObject().m59299x6bf53a6c());
                        java.lang.Object obj2 = oVar.f384374d;
                        java.lang.Long l17 = (java.lang.Long) hashMap.get(obj2);
                        if (l17 == null) {
                            l17 = java.lang.Long.valueOf(currentTimeMillis);
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
                        long longValue = currentTimeMillis - l17.longValue();
                        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                        jz5.l[] lVarArr = new jz5.l[11];
                        i17 = y17;
                        i18 = w17;
                        int i27 = f17;
                        lVarArr[0] = new jz5.l("view_id", "long_video_card");
                        lVarArr[1] = new jz5.l("finder_context_id", p0Var.f537077b);
                        lVarArr[2] = new jz5.l("comment_scene", 281);
                        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(((java.lang.Number) obj2).longValue()));
                        lVarArr[4] = new jz5.l("card_idex", java.lang.Integer.valueOf(intValue2));
                        lVarArr[5] = new jz5.l("refresh_num", java.lang.Integer.valueOf(p0Var.f537085j));
                        r45.ru2 m76771x17e42f9f = aVar.getFeedObject().getFeedObject().m76771x17e42f9f();
                        lVarArr[6] = new jz5.l("recommend_reason", m76771x17e42f9f != null ? m76771x17e42f9f.m75945x2fec8307(0) : null);
                        r45.dm2 m76806xdef68064 = aVar.getFeedObject().getFeedObject().m76806xdef68064();
                        lVarArr[7] = new jz5.l("collection_id", pm0.v.u((m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? 0L : vx0Var.m75942xfb822ef2(0)));
                        lVarArr[8] = new jz5.l("follow_type", java.lang.Integer.valueOf(rj6 ? 1 : 0));
                        lVarArr[9] = new jz5.l("session_buffer", aVar.getFeedObject().getFeedObject().m76829x97edf6c0());
                        lVarArr[10] = new jz5.l("expose_time_ms", java.lang.Long.valueOf(longValue));
                        ((cy1.a) rVar).yj("view_unexp", null, kz5.c1.k(lVarArr), 1, true);
                        hashSet.add(oVar);
                        f17 = i27;
                    } else {
                        i17 = y17;
                        i18 = w17;
                    }
                    y17 = i17;
                    w17 = i18;
                    i19 = 1;
                }
            }
            java.util.Iterator it6 = hashSet.iterator();
            while (it6.hasNext()) {
                hashMap.remove(((jz5.o) it6.next()).f384374d);
            }
            hashSet2.removeAll(hashSet);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.util.Iterator it7 = exposedHolders.iterator();
            while (it7.hasNext()) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it7.next();
                if (k3Var instanceof in5.s0) {
                    java.lang.Object obj3 = ((in5.s0) k3Var).f374658i;
                    if (obj3 instanceof zn2.a) {
                        zn2.a aVar2 = (zn2.a) obj3;
                        if (!hashMap.containsKey(java.lang.Long.valueOf(aVar2.mo2128x1ed62e84()))) {
                            int f18 = f17 < 0 ? f(p0Var) : f17;
                            java.util.Iterator it8 = p0Var.j().m56388xcaeb60d0().iterator();
                            int i28 = 0;
                            while (true) {
                                if (!it8.hasNext()) {
                                    i28 = -1;
                                    break;
                                } else {
                                    if (((so2.j5) it8.next()).mo2128x1ed62e84() == aVar2.mo2128x1ed62e84()) {
                                        break;
                                    } else {
                                        i28++;
                                    }
                                }
                            }
                            int i29 = i28;
                            p0Var.f(aVar2, i29, f18, currentTimeMillis2);
                            if (!p0Var.j().f202426p && p0Var.e() - i29 <= p0Var.j().f202425o) {
                                xn2.a.a(p0Var, false, 1, null);
                            }
                            f17 = f18;
                        }
                    }
                }
            }
        }
    }
}

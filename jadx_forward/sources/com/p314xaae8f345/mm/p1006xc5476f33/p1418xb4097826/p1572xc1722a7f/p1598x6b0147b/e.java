package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class e implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f f203718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f203719c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f203720d;

    public e(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f fVar, boolean z17, db2.u3 u3Var) {
        this.f203717a = i17;
        this.f203718b = fVar;
        this.f203719c = z17;
        this.f203720d = u3Var;
    }

    @Override // db2.z2
    /* renamed from: onCgiBack */
    public void mo11127x7a59302d(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        java.lang.String l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptors, "interceptors");
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d(new java.util.LinkedList(), i17, i18, str);
            dVar.f189299d = this.f203718b.f203721g;
            dVar.f189303h = 1;
            dVar.f189305j = resp.f309453h;
            dVar.f189309n = resp.m75934xbce7f2f(2);
            this.f203720d.a(dVar, this.f203717a);
            return;
        }
        int i19 = 4;
        if (this.f203717a == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyVideoFeedFetcher", "tabType=" + this.f203718b.f203721g + " headWording=" + resp.m75945x2fec8307(3) + " endWording=" + resp.m75945x2fec8307(4) + " prefetch_last_feed_count=" + resp.m75939xb282bd08(8) + " continueFlag:" + resp.f309449d);
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, resp.m75945x2fec8307(3));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, resp.m75945x2fec8307(4));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_NUM_INT_SYNC, java.lang.Integer.valueOf(resp.m75939xb282bd08(8)));
        }
        if (((r45.fx2) resp.m75936x14adae67(17)) != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC;
            r45.fx2 fx2Var = (r45.fx2) resp.m75936x14adae67(17);
            c17.x(u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(fx2Var != null ? fx2Var.mo14344x5f01b1f6() : null));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
            int i27 = this.f203718b.f203721g;
            r45.fx2 S6 = c14614xb913e379.S6();
            java.util.Iterator it = c14614xb913e379.f204076e.iterator();
            while (it.hasNext()) {
                ((bs2.n1) it.next()).p(i27, S6);
            }
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f89);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_HEADER_WORDING_STRING_SYNC, string);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f88);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.Object m18 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_FOOTER_WORDING_STRING_SYNC, string2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m18, "null cannot be cast to non-null type kotlin.String");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = m75941xfb821914.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
            jz5.g gVar = hc2.o0.f361869a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
            int m76964x7f025288 = m76802x2dd01666 != null ? m76802x2dd01666.m76964x7f025288() : 0;
            if (m76964x7f025288 == 2 || m76964x7f025288 == i19 || m76964x7f025288 == 9) {
                r13 = true;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderExt", " isAcceptNearbyVideoObj return for invalid mediaType:" + m76964x7f025288);
            }
            if (r13) {
                arrayList.add(next);
            }
            i19 = 4;
        }
        if (arrayList.size() < resp.m75941xfb821914(1).size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.NearbyVideoFeedFetcher", "[onCgiBack] has filter some feed. valid=" + arrayList.size() + " raw=" + resp.m75941xfb821914(1).size());
        }
        boolean z17 = resp.m75939xb282bd08(6) > 0;
        java.util.List j17 = cu2.u.f303974a.j(arrayList, hc2.d0.d(this.f203718b.f203721g), this.f203718b.f203722h);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it7 = ((java.util.ArrayList) j17).iterator();
        while (it7.hasNext()) {
            arrayList2.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it7.next()));
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d dVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d(linkedList, i17, i18, str);
        dVar2.f189299d = this.f203718b.f203721g;
        dVar2.f189307l = resp.f309450e;
        dVar2.f189306k = resp.f309451f;
        dVar2.f189303h = resp.f309449d;
        dVar2.f189301f = arrayList;
        dVar2.f189305j = resp.f309453h;
        dVar2.f189309n = resp.m75934xbce7f2f(2);
        dVar2.f189308m = (r45.lw0) resp.m75936x14adae67(14);
        dVar2.f189302g = resp.m75939xb282bd08(5);
        dVar2.f189304i = resp.m75939xb282bd08(6) != 0;
        dVar2.f189310o = (r45.bx2) resp.m75936x14adae67(18);
        if (this.f203717a != 2) {
            cu2.u.f303974a.m(linkedList, hc2.d0.d(this.f203718b.f203721g), "", z17);
        }
        int i28 = this.f203717a;
        if (i28 == 0 || i28 == 1) {
            so2.h3.f491925d.j(this.f203718b.f203721g, arrayList);
        }
        if (this.f203719c) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 c19 = hc2.d0.c(this.f203718b.f203721g);
            if (resp.m75934xbce7f2f(2) == null) {
                l17 = null;
            } else {
                com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(2);
                l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
            }
            c18.x(c19, l17);
        }
        this.f203718b.f203724m = resp.f309453h;
        this.f203720d.a(dVar2, this.f203717a);
    }
}

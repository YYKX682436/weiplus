package eb2;

/* loaded from: classes2.dex */
public final class j0 implements db2.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f332315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f332316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb2.m0 f332317c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db2.u3 f332319e;

    public j0(int i17, db2.n3 n3Var, eb2.m0 m0Var, boolean z17, db2.u3 u3Var) {
        this.f332315a = i17;
        this.f332316b = n3Var;
        this.f332317c = m0Var;
        this.f332318d = z17;
        this.f332319e = u3Var;
    }

    @Override // db2.z2
    /* renamed from: onCgiBack */
    public void mo11127x7a59302d(int i17, int i18, java.lang.String str, db2.c3 resp, java.util.List interceptors) {
        boolean z17;
        java.util.ArrayList arrayList;
        r45.nx2 nx2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        java.lang.String l17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(interceptors, "interceptors");
        if (i17 == 0 && i18 == 0) {
            if (this.f332315a == 0) {
                db2.o3.a(resp, this.f332316b.f309612d, this.f332317c.f332366u);
            }
            r45.fx2 fx2Var = (r45.fx2) resp.m75936x14adae67(17);
            pf5.u uVar = pf5.u.f435469a;
            if (fx2Var != null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC;
                r45.fx2 fx2Var2 = (r45.fx2) resp.m75936x14adae67(17);
                c17.x(u3Var, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(fx2Var2 != null ? fx2Var2.mo14344x5f01b1f6() : null));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379 c14614xb913e379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
                int i19 = this.f332316b.f309612d;
                r45.fx2 S6 = c14614xb913e379.S6();
                java.util.Iterator it = c14614xb913e379.f204076e.iterator();
                while (it.hasNext()) {
                    ((bs2.n1) it.next()).p(i19, S6);
                }
            }
            eb2.f0 f0Var = this.f332317c.f332357i;
            if (f0Var != null) {
                f0Var.f332275a = null;
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
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : m75941xfb821914) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                if (hc2.o0.C(c19792x256d2725)) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() < resp.m75941xfb821914(1).size()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f332317c.f332366u, "[onCgiBack] has filter some feed. valid=" + arrayList2.size() + " raw=" + resp.m75941xfb821914(1).size());
                pm0.z.a(xy2.b.f539688b, "finderStreamReturnInvalidFeed", true, null, null, false, false, new eb2.i0(this.f332316b, this.f332315a, arrayList2, resp), 60, null);
            }
            boolean z18 = resp.m75939xb282bd08(6) > 0;
            java.util.List j17 = cu2.u.f303974a.j(arrayList2, hc2.d0.d(this.f332316b.f309612d), this.f332317c.f332356h);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(j17, 10));
            java.util.Iterator it6 = ((java.util.ArrayList) j17).iterator();
            while (it6.hasNext()) {
                arrayList3.add(cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()));
            }
            java.util.LinkedList linkedList = new java.util.LinkedList(arrayList3);
            r45.of6 of6Var = (r45.of6) resp.m75936x14adae67(29);
            if (of6Var != null) {
                db2.n3 n3Var = this.f332316b;
                eb2.m0 m0Var = this.f332317c;
                p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(c61.l7.class).a(ey2.i.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                int i27 = n3Var.f309612d;
                r45.qt2 qt2Var = m0Var.f332356h;
                cu2.t tVar = cu2.u.f303974a;
                z17 = z18;
                java.util.LinkedList m75941xfb8219142 = of6Var.m75941xfb821914(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb8219142) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj2;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d27252);
                    if (hc2.o0.C(c19792x256d27252)) {
                        arrayList4.add(obj2);
                    }
                }
                java.util.List j18 = tVar.j(arrayList4, hc2.d0.d(i27), qt2Var);
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(j18, 10));
                for (java.util.Iterator it7 = ((java.util.ArrayList) j18).iterator(); it7.hasNext(); it7 = it7) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it7.next());
                    p17.getFeedObject().m59427x8150691c(c01.id.e() + of6Var.m75939xb282bd08(1));
                    arrayList5.add(p17);
                    arrayList2 = arrayList2;
                }
                arrayList = arrayList2;
                java.util.LinkedList linkedList2 = new java.util.LinkedList(arrayList5);
                if (of6Var.m75939xb282bd08(2) == 0) {
                    ((ey2.b1) uVar.e(c61.l7.class).a(ey2.b1.class)).R6(linkedList2, hc2.d0.b(i27), 2);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveBackupInfo tabType:");
                    sb6.append(i27);
                    sb6.append(" list:");
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                    java.util.Iterator it8 = linkedList2.iterator();
                    while (it8.hasNext()) {
                        arrayList6.add(hc2.b0.h((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) it8.next(), false, 1, null));
                    }
                    sb6.append(arrayList6);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBackupFeedListVM", sb6.toString());
                }
            } else {
                z17 = z18;
                arrayList = arrayList2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d(linkedList, i17, i18, str);
            dVar.f189299d = this.f332316b.f309612d;
            dVar.f189307l = java.lang.Math.min(resp.f309450e, arrayList.size());
            java.lang.Math.min(resp.f309452g, arrayList.size());
            dVar.f189306k = resp.f309451f;
            dVar.f189303h = resp.f309449d;
            dVar.f189301f = arrayList;
            dVar.f189305j = resp.f309453h;
            boolean z19 = this.f332317c.f332361p;
            dVar.f189309n = resp.m75934xbce7f2f(2);
            dVar.f189308m = (r45.lw0) resp.m75936x14adae67(14);
            dVar.f189302g = resp.m75939xb282bd08(5);
            dVar.f189304i = resp.m75939xb282bd08(6) != 0;
            dVar.f189310o = (r45.bx2) resp.m75936x14adae67(18);
            dVar.f189311p = resp;
            eb2.m0 m0Var2 = this.f332317c;
            m0Var2.getClass();
            java.util.Iterator it9 = interceptors.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                fb2.m mVar = (fb2.m) it9.next();
                if (mVar.c(dVar, m0Var2.f332355g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m0Var2.f332366u, "[onCgiBack] before Interceptor is interrupted by " + mVar);
                    break;
                }
            }
            if (this.f332315a != 2 && this.f332317c.f332360o != 1) {
                cu2.u.f303974a.m(linkedList, hc2.d0.d(this.f332316b.f309612d), "", z17);
            }
            eb2.m0 m0Var3 = this.f332317c;
            m0Var3.getClass();
            java.util.Iterator it10 = interceptors.iterator();
            while (true) {
                if (!it10.hasNext()) {
                    break;
                }
                fb2.m mVar2 = (fb2.m) it10.next();
                if (mVar2.b(dVar, m0Var3.f332355g)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(m0Var3.f332366u, "[onCgiBack] after Interceptor is interrupted by " + mVar2);
                    break;
                }
            }
            so2.h3.f491925d.j(this.f332316b.f309612d, arrayList);
            if (this.f332318d) {
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c18 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 c19 = hc2.d0.c(this.f332316b.f309612d);
                if (resp.m75934xbce7f2f(2) == null) {
                    l17 = null;
                } else {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = resp.m75934xbce7f2f(2);
                    l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(m75934xbce7f2f != null ? m75934xbce7f2f.g() : null);
                }
                c18.x(c19, l17);
                java.util.Iterator it11 = this.f332317c.f332363r.f338987n.iterator();
                while (it11.hasNext()) {
                }
            }
            this.f332317c.f332361p = resp.f309453h;
            this.f332319e.a(dVar, this.f332315a);
            int i28 = this.f332315a;
            if ((i28 == 0 || i28 == 1 || i28 == 4) && ((nx2Var = (r45.nx2) resp.d().m75936x14adae67(30)) == null || nx2Var.m75939xb282bd08(6) == 0)) {
                java.util.Iterator it12 = linkedList.iterator();
                while (true) {
                    if (!it12.hasNext()) {
                        abstractC14490x69736cb5 = null;
                        break;
                    }
                    so2.j5 j5Var = (so2.j5) it12.next();
                    abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                    if (abstractC14490x69736cb5 != null) {
                        break;
                    }
                }
                if (abstractC14490x69736cb5 != null && resp.d().m75942xfb822ef2(12) != 0) {
                    pm0.z.b(xy2.b.f539688b, "finderCgiBackWrongRedDotFeed", resp.d().m75942xfb822ef2(12) == abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11(), null, null, false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.c2(resp, abstractC14490x69736cb5), 60, null);
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d dVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d(new java.util.LinkedList(), i17, i18, str);
            dVar2.f189299d = this.f332316b.f309612d;
            dVar2.f189303h = 1;
            dVar2.f189305j = resp.f309453h;
            dVar2.f189309n = resp.m75934xbce7f2f(2);
            this.f332319e.a(dVar2, this.f332315a);
        }
        eb2.f0 f0Var2 = this.f332317c.f332357i;
        if (f0Var2 != null) {
            f0Var2.f332276b = null;
        }
        if (f0Var2 == null) {
            return;
        }
        f0Var2.f332281g = false;
    }
}

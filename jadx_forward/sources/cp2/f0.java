package cp2;

/* loaded from: classes2.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f302331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.v0 f302332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f302333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14502xf3fed801 f302334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, cp2.v0 v0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14502xf3fed801 c14502xf3fed801) {
        super(0);
        this.f302331d = c0Var;
        this.f302332e = v0Var;
        this.f302333f = i17;
        this.f302334g = c14502xf3fed801;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList<so2.j5> linkedList;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        r45.dd2 dd2Var;
        cp2.v0 v0Var = this.f302332e;
        boolean Q6 = v0Var.f302470q.Q6(v0Var.v());
        java.util.LinkedList linkedList2 = new java.util.LinkedList(((ey2.c3) pf5.u.f435469a.e(c61.l7.class).a(ey2.c3.class)).O6(v0Var.v()).f339102b);
        java.util.Iterator it = linkedList2.iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((so2.j5) it.next()) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) {
                break;
            }
            i18++;
        }
        java.util.Iterator it6 = linkedList2.iterator();
        int i19 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i19 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it6.next();
            if ((j5Var instanceof so2.h4) && ((so2.h4) j5Var).f491934e > i18) {
                break;
            }
            i19++;
        }
        java.util.LinkedList<so2.j5> linkedList3 = (i18 == -1 || i18 >= linkedList2.size()) ? new java.util.LinkedList() : new java.util.LinkedList(linkedList2.subList(0, i18));
        if (i18 == -1 || i19 >= linkedList2.size() || !(linkedList2.get(i18) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys)) {
            linkedList = new java.util.LinkedList();
        } else {
            java.lang.Object obj = linkedList2.get(i18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderStreamCardFeed");
            linkedList = new java.util.LinkedList(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) obj).f192727f);
        }
        for (so2.j5 j5Var2 : linkedList3) {
            if (j5Var2 instanceof so2.h1) {
                so2.h1 h1Var = (so2.h1) j5Var2;
                r45.nw1 m59258xd0557130 = h1Var.getFeedObject().m59258xd0557130();
                if (!(m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "canTimelineRefresh isHardRefresh for beforeFollowDataList feed:".concat(pm0.v.u(h1Var.getFeedObject().getFeedObject().m76784x5db1b11())));
                    Q6 = true;
                }
            }
        }
        for (so2.j5 j5Var3 : linkedList) {
            if (j5Var3 instanceof so2.h1) {
                so2.h1 h1Var2 = (so2.h1) j5Var3;
                r45.nw1 m59258xd05571302 = h1Var2.getFeedObject().m59258xd0557130();
                if (!(m59258xd05571302 != null && m59258xd05571302.m75939xb282bd08(2) == 1)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", "canTimelineRefresh isHardRefresh for followDataList feed:".concat(pm0.v.u(h1Var2.getFeedObject().getFeedObject().m76784x5db1b11())));
                    Q6 = true;
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f302331d;
        c0Var.f391645d = Q6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initData] canTimelineRefresh=");
        sb6.append(c0Var.f391645d);
        sb6.append(" targetPageForceRefreshFlag:");
        sb6.append(v0Var.f302465i);
        sb6.append(", incrementCount=");
        int i27 = this.f302333f;
        sb6.append(i27);
        sb6.append(" memoryCacheFlag:");
        sb6.append(v0Var.v());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.NearbyLivePresenter", sb6.toString());
        if (c0Var.f391645d || v0Var.f302465i) {
            v0Var.f302464h = 0;
            v0Var.c(0L, false);
        } else {
            v0Var.f302464h = 1;
            int v17 = v0Var.v();
            ey2.c3 c3Var = v0Var.f302470q;
            ey2.x2 O6 = c3Var.O6(v17);
            int i28 = O6.f339103c;
            int i29 = O6.f339104d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14502xf3fed801 c14502xf3fed801 = this.f302334g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14502xf3fed801.getF204960d(), "[initData] canTimelineRefresh " + c0Var.f391645d + " fromPreload:" + O6.f339108h + " lastPos=" + i28 + " fromTopPixel=" + i29);
            zo2.e eVar = v0Var.f302472s;
            if (eVar != null) {
                eVar.f556383b = i28;
                eVar.f556384c = i29;
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 g17 = ((cp2.q1) v0Var.z()).g();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = g17 != null ? g17.getLayoutManager() : null;
            if (layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) layoutManager;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i29));
                arrayList.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c1164x587b7ff1, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                c1164x587b7ff1.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(c1164x587b7ff1, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$3$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                g17.post(new cp2.d0(layoutManager, i28, i29, v0Var));
            }
            v0Var.m(O6.f339110j);
            int i37 = c3Var.O6(v0Var.v()).f339109i;
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = v0Var.f302466m;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) componentCallbacksC1101xa17d4670 : null;
            java.util.LinkedList m75941xfb8219143 = (c14521x246f2bd == null || (dd2Var = c14521x246f2bd.f203052s) == null) ? null : dd2Var.m75941xfb821914(6);
            if (m75941xfb8219143 == null) {
                m75941xfb8219143 = new java.util.LinkedList();
            }
            if (i37 != 0 && m75941xfb8219143.size() > 0) {
                r45.dd2 dd2Var2 = new r45.dd2();
                int i38 = 0;
                r45.dd2 dd2Var3 = dd2Var2;
                int i39 = -1;
                for (java.lang.Object obj2 : m75941xfb8219143) {
                    int i47 = i38 + 1;
                    if (i38 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    r45.dd2 dd2Var4 = (r45.dd2) obj2;
                    if (dd2Var4.m75939xb282bd08(0) == i37) {
                        i39 = i38;
                        dd2Var3 = dd2Var4;
                    }
                    i38 = i47;
                }
                int i48 = i39 + 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14502xf3fed801.getF204960d(), "init subTab position subTabId:" + i37 + " subIndex:" + i39 + " realIndex:" + i48);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = ((cp2.q1) v0Var.z()).o();
                if (i48 > 0) {
                    if (o17 != null && (mo7946xf939df19 = o17.mo7946xf939df19()) != null) {
                        i17 = mo7946xf939df19.mo1894x7e414b06();
                    }
                    if (i48 < i17) {
                        r45.dd2 dd2Var5 = v0Var.f302467n;
                        if (dd2Var5 != null && (m75941xfb8219142 = dd2Var5.m75941xfb821914(6)) != null) {
                            m75941xfb8219142.clear();
                        }
                        r45.dd2 dd2Var6 = v0Var.f302467n;
                        if (dd2Var6 != null && (m75941xfb821914 = dd2Var6.m75941xfb821914(6)) != null) {
                            m75941xfb821914.add(dd2Var3);
                        }
                        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = v0Var.f302466m;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd2 = componentCallbacksC1101xa17d46702 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) componentCallbacksC1101xa17d46702 : null;
                        if (c14521x246f2bd2 != null) {
                            c14521x246f2bd2.f203053t = dd2Var3;
                        }
                        if (o17 != null) {
                            o17.post(new cp2.e0(v0Var, i48, o17));
                        }
                    }
                }
            }
            if (i27 <= 0) {
                v0Var.g(null);
            }
            if (O6.f339108h) {
                v0Var.p("fromPreload");
                tq2.d.f502763a.b("onHitPreloadEnd");
            } else {
                tq2.d.f502763a.b("onHitCache");
            }
        }
        qq2.b bVar = v0Var.f302471r;
        if (bVar != null) {
            bVar.f447469g = true;
        }
        return jz5.f0.f384359a;
    }
}

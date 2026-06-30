package sc2;

/* loaded from: classes2.dex */
public final class a6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f487291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487292c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f487294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f487295f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f487296g;

    public a6(xc2.p0 p0Var, sc2.d6 d6Var, in5.s0 s0Var, android.view.View view, r45.wf6 wf6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str) {
        this.f487290a = p0Var;
        this.f487291b = d6Var;
        this.f487292c = s0Var;
        this.f487293d = view;
        this.f487294e = wf6Var;
        this.f487295f = abstractC14490x69736cb5;
        this.f487296g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.tt0 tt0Var;
        java.util.LinkedList m75941xfb821914;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.List list;
        java.lang.Object obj5;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        r45.wf6 wf6Var;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        xc2.p0 p0Var = this.f487290a;
        p0Var.f534769b = elapsedRealtime;
        int i17 = fVar.f152148a;
        android.view.View view = this.f487293d;
        in5.s0 s0Var = this.f487292c;
        sc2.d6 d6Var = this.f487291b;
        if (i17 == 0 && fVar.f152149b == 0) {
            java.util.LinkedList m75941xfb8219143 = ((r45.ov0) fVar.f152151d).m75941xfb821914(1);
            if (m75941xfb8219143 != null) {
                java.util.Iterator it = m75941xfb8219143.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.tt0 tt0Var2 = (r45.tt0) ((r45.dl2) obj2).m75936x14adae67(18);
                    if ((tt0Var2 == null || (m75941xfb8219142 = tt0Var2.m75941xfb821914(0)) == null || !(m75941xfb8219142.isEmpty() ^ true)) ? false : true) {
                        break;
                    }
                }
                r45.dl2 dl2Var = (r45.dl2) obj2;
                if (dl2Var != null && (tt0Var = (r45.tt0) dl2Var.m75936x14adae67(18)) != null && (m75941xfb821914 = tt0Var.m75941xfb821914(0)) != null) {
                    java.util.Iterator it6 = m75941xfb821914.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it6.next();
                        if (((r45.wf6) obj3).m75939xb282bd08(2) == this.f487294e.m75939xb282bd08(2)) {
                            break;
                        }
                    }
                    r45.wf6 wf6Var2 = (r45.wf6) obj3;
                    if (wf6Var2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f487295f;
                        android.content.Context context = view.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        java.lang.Object obj6 = sc2.d6.A;
                        r45.wf6 wf6Var3 = d6Var.f84682m;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = p0Var.f534767a;
                        if (wf6Var3 == null) {
                            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e28622.m76521x7528c3fb();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
                            java.util.Iterator it7 = m76521x7528c3fb.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    wf6Var = 0;
                                    break;
                                }
                                wf6Var = it7.next();
                                if (((r45.wf6) wf6Var).m75939xb282bd08(2) == 24) {
                                    break;
                                }
                            }
                            wf6Var3 = wf6Var;
                        }
                        java.util.LinkedList<r45.wf6> m76521x7528c3fb2 = c19786x6a1e28622.m76521x7528c3fb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb2, "getStyle(...)");
                        boolean d07 = pm0.v.d0(m76521x7528c3fb2, new sc2.w5(wf6Var3));
                        if (d07) {
                            c19786x6a1e28622.m76521x7528c3fb().add(wf6Var2);
                        }
                        pf5.u uVar = pf5.u.f435469a;
                        xc2.k0 k0Var = (xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class);
                        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
                        }
                        java.util.Set set = (java.util.Set) k0Var.W6(d6Var.f84678f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n, d6Var.f84679g).mo3195x754a37bb();
                        if (set != null) {
                            java.util.Iterator it8 = set.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it8.next();
                                xc2.t tVar = (xc2.t) obj4;
                                r45.wf6 wf6Var4 = d6Var.f84682m;
                                if (wf6Var4 != null && tVar.f534834c == wf6Var4.m75939xb282bd08(1)) {
                                    break;
                                }
                            }
                            xc2.t tVar2 = (xc2.t) obj4;
                            if (tVar2 != null && (list = tVar2.f534835d) != null) {
                                java.util.Iterator it9 = list.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = it9.next();
                                    java.lang.String m76501xf2fd2296 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) obj5).m76501xf2fd2296();
                                    xc2.p0 p0Var2 = d6Var.f84680h;
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m76501xf2fd2296, (p0Var2 == null || (c19786x6a1e2862 = p0Var2.f534767a) == null) ? null : c19786x6a1e2862.m76501xf2fd2296())) {
                                        break;
                                    }
                                }
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) obj5;
                                if (c19786x6a1e28623 != null) {
                                    java.util.LinkedList<r45.wf6> m76521x7528c3fb3 = c19786x6a1e28623.m76521x7528c3fb();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb3, "getStyle(...)");
                                    if (pm0.v.d0(m76521x7528c3fb3, new sc2.v5(wf6Var3))) {
                                        c19786x6a1e28623.m76521x7528c3fb().add(wf6Var2);
                                    } else {
                                        d07 = false;
                                    }
                                }
                            }
                        }
                        d6Var.f84682m = wf6Var2;
                        java.lang.Object obj7 = s0Var.f374658i;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = obj7 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj7 : null;
                        boolean z17 = abstractC14490x69736cb52 != null && abstractC14490x69736cb5.mo2128x1ed62e84() == abstractC14490x69736cb52.mo2128x1ed62e84();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((sc2.k2) d6Var).C, "startAsyncLodPolling: source=" + this.f487296g + ", replace style, ret=" + d07 + ", isSameFeed=" + z17);
                        if (z17) {
                            sc2.q8 q8Var = p0Var.f534766J;
                            if ((q8Var != null ? q8Var.f487712c : 1) == 2) {
                                d6Var.I(abstractC14490x69736cb5, s0Var, view, p0Var, "asyncLoadPolling", d6Var.M(p0Var), false);
                                d6Var.Y(s0Var, view, "startAsyncLodPolling");
                            } else {
                                d6Var.J(abstractC14490x69736cb5, s0Var, view, p0Var, d6Var.P(p0Var), "asyncLoadPolling");
                            }
                        }
                        return jz5.f0.f384359a;
                    }
                }
            }
        }
        if (d6Var.f487372z) {
            d6Var.X(s0Var, view, "polling");
        }
        return jz5.f0.f384359a;
    }
}

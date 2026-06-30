package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.b0.class)
/* loaded from: classes9.dex */
public final class v4 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.b0, xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public ic5.f f281646e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f281647f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f281648g = new java.util.LinkedHashMap();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void E() {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this, android.os.Looper.getMainLooper());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ((java.util.LinkedHashMap) this.f281647f).clear();
            ((java.util.LinkedHashMap) this.f281648g).clear();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this);
        }
    }

    @Override // yn.d
    public void V(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar;
        android.view.View O0;
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ic5.f fVar = this.f281646e;
            if (fVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
                throw null;
            }
            fVar.f371972a = true;
            sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
            java.lang.Object p17 = this.f280113d.p();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p17, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p17;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null || (O0 = (kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).O0(j17)) == null) {
                return;
            }
            int top = O0.getTop() - c1163xf1deaba4.getPaddingTop();
            kVar.h(new java.lang.Object());
            c1163xf1deaba4.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.s4(c1163xf1deaba4, this, kVar, c1162x665295de, top, j17));
        }
    }

    @Override // yn.d
    public void X() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            ic5.f fVar = this.f281646e;
            if (fVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
                throw null;
            }
            fVar.f371972a = false;
            java.lang.Object p17 = this.f280113d.p();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(p17, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p17;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null) {
                return;
            }
            sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
            int w17 = ((c1162x665295de.w() + c1162x665295de.y()) / 2) - this.f280113d.p().mo75761x118cb524();
            java.util.ArrayList arrayList = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).I.f233598o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getDataMap(...)");
            rd5.d dVar = (rd5.d) kz5.n0.a0(arrayList, w17);
            long m124847x74d37ac6 = (dVar == null || (f9Var = dVar.f475787d.f526833b) == null) ? -1L : f9Var.m124847x74d37ac6();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
            android.view.View O0 = kVar.O0(m124847x74d37ac6);
            int top = O0 != null ? O0.getTop() - c1163xf1deaba4.getPaddingTop() : 0;
            kVar.h(new java.lang.Object());
            c1163xf1deaba4.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t4(c1163xf1deaba4, this, zVar, m124847x74d37ac6, c1162x665295de, top));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        this.f281646e = new ic5.f();
    }

    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var != null ? l0Var.f535943a : null, this.f280113d.x())) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var != null ? l0Var.f535944b : null, "delete")) {
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var != null ? l0Var.f535944b : null, "update")) {
                        return;
                    }
                }
                java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> arrayList = l0Var.f535945c;
                if (arrayList != null) {
                    for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : arrayList) {
                        java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) this.f281648g).get(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                        if (str != null) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l0Var.f535944b, "update") && !f9Var.P2()) {
                                boolean z17 = false;
                                if (f9Var.m78014x7b98c171() || f9Var.J2()) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(f9Var.Q0(), f9Var.m124847x74d37ac6());
                                    if (k17 != null && k17.P2()) {
                                        z17 = true;
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNotifyChange: update msgId:");
                                    sb6.append(f9Var.m124847x74d37ac6());
                                    sb6.append(" groupId:");
                                    sb6.append(str);
                                    sb6.append(" oriMsgType:");
                                    sb6.append(f9Var.P2());
                                    sb6.append(" dbMsgType:");
                                    sb6.append(k17 != null ? java.lang.Integer.valueOf(k17.mo78013xfb85f7b0()) : null);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupComponent", sb6.toString());
                                }
                                if (!z17) {
                                }
                            }
                            java.util.Map map = this.f281647f;
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4 p4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4) ((java.util.LinkedHashMap) map).get(str);
                            if (p4Var != null) {
                                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u4 u4Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.u4(f9Var);
                                java.util.List list = p4Var.f281206b;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "onNotifyChange: deleted:" + kz5.h0.B(list, u4Var) + " msgId:" + f9Var.m124847x74d37ac6() + " [" + kz5.n0.g0(p4Var.f281206b, null, null, null, 0, null, null, 63, null) + "] groupId:" + str);
                                if (list.size() <= 1) {
                                    map.remove(str);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void m0(rd5.d msgData) {
        boolean z17;
        fd5.c cVar;
        we5.s0 s0Var;
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "expandMsg");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w4.f281683a < 500) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemMediaGroupComponent", "mediaGroup op ignored by global cooldown");
            z17 = true;
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.w4.f281683a = currentTimeMillis;
            z17 = false;
        }
        if (z17) {
            return;
        }
        ic5.f fVar = this.f281646e;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
            throw null;
        }
        java.lang.String a17 = fVar.a(msgData.f475787d.f526833b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemMediaGroupComponent", "expandMsg groupId: ".concat(a17));
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) this.f281647f;
        java.lang.Object obj = linkedHashMap.get(a17);
        if (obj == null) {
            obj = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4(a17, null, 0, 6, null);
            linkedHashMap.put(a17, obj);
        }
        java.util.List list2 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4) obj).f281206b;
        list2.clear();
        qd5.i iVar = msgData instanceof qd5.i ? (qd5.i) msgData : null;
        if (iVar != null && (s0Var = iVar.f443444o) != null && (list = s0Var.f526920a) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                if (!((rd5.d) obj2).f475787d.f526833b.P2()) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rd5.d dVar = (rd5.d) it.next();
                this.f281648g.put(java.lang.Long.valueOf(dVar.f475787d.f526833b.m124847x74d37ac6()), a17);
                arrayList2.add(java.lang.Long.valueOf(dVar.f475787d.f526833b.m124847x74d37ac6()));
            }
            list2.addAll(arrayList2);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4 o4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.o4) ((sb5.a0) this.f280113d.f542241c.a(sb5.a0.class));
        o4Var.getClass();
        if (!r26.n0.N(a17)) {
            o4Var.f281155g.add(a17);
        }
        java.lang.Object p17 = this.f280113d.p();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = p17 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p17 : null;
        if (c1163xf1deaba4 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i2.c(c1163xf1deaba4, a17, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q4(this, o4Var, a17));
        }
        java.lang.Object p18 = this.f280113d.p();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = p18 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p18 : null;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba42 != null ? c1163xf1deaba42.getLayoutManager() : null;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 c21844xd4ff61b8 = layoutManager instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8) layoutManager : null;
        if (c21844xd4ff61b8 != null && (cVar = (fd5.c) c21844xd4ff61b8.W(fd5.c.class)) != null) {
            cVar.c();
        }
        ic5.f fVar2 = this.f281646e;
        if (fVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
            throw null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg = msgData.f475787d.f526833b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (!fVar2.f371972a) {
            java.lang.String a18 = fVar2.a(msg);
            if (!r26.n0.N(a18)) {
                fVar2.f371973b.add(a18);
            }
        }
        sb5.z zVar = (sb5.z) this.f280113d.f542241c.a(sb5.z.class);
        if (zVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).h(new java.lang.Object());
        }
    }

    public java.lang.String n0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        ic5.f fVar = this.f281646e;
        if (fVar != null) {
            return fVar.a(msgInfo);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
        throw null;
    }

    public boolean o0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4 p4Var;
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        if (!((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            return false;
        }
        ic5.f fVar = this.f281646e;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaGroupMsgHelper");
            throw null;
        }
        java.lang.String a17 = fVar.a(msgInfo);
        if (r26.n0.N(a17) || (p4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p4) ((java.util.LinkedHashMap) this.f281647f).get(a17)) == null || (list = p4Var.f281206b) == null) {
            return false;
        }
        java.lang.Long l17 = (java.lang.Long) kz5.n0.Z(list);
        return l17 != null && l17.longValue() == msgInfo.m124847x74d37ac6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void z() {
        if (((kc5.x) ((wg3.j) i95.n0.c(wg3.j.class))).Di()) {
            java.lang.Object p17 = this.f280113d.p();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = p17 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) p17 : null;
            if (c1163xf1deaba4 == null) {
                return;
            }
            n3.t1 t1Var = new n3.t1(c1163xf1deaba4);
            while (t1Var.hasNext()) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) ((android.view.View) t1Var.next()).findViewById(com.p314xaae8f345.mm.R.id.sr8);
                if (c22100x47612006 != null) {
                    c22100x47612006.z();
                }
            }
        }
    }
}

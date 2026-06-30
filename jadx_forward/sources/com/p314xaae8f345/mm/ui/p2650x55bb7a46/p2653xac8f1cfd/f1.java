package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fg.class)
/* loaded from: classes9.dex */
public final class f1 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fg {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f280534e = new java.util.HashSet(256);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f280535f = new java.util.ArrayList(256);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f280536g = new java.util.HashSet(256);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f280537h = new java.util.ArrayList(256);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f280538i = new java.util.LinkedHashMap();

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void J() {
        sc5.f fVar = sc5.f.f488100a;
        if (sc5.f.f488102c) {
            if (!this.f280535f.isEmpty()) {
                java.util.List S0 = kz5.n0.S0(this.f280535f);
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(S0, 10));
                java.util.Iterator it = S0.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((jz5.l) it.next()).f384366d);
                }
                fVar.f(arrayList);
            }
            long a17 = hq.d.a();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f280538i).entrySet()) {
                m0((com.p314xaae8f345.mm.p2621x8fb0427b.f9) entry.getKey(), a17 - ((java.lang.Number) entry.getValue()).longValue());
            }
            if (!this.f280537h.isEmpty()) {
                sc5.f fVar2 = sc5.f.f488100a;
                java.util.List S02 = kz5.n0.S0(this.f280537h);
                if (sc5.f.f488102c && !S02.isEmpty()) {
                    ((ku5.t0) ku5.t0.f394148d).h(new sc5.e(S02), "ChatMsgReadReportManager");
                }
            }
            ((java.util.LinkedHashMap) this.f280538i).clear();
            this.f280534e.clear();
            this.f280536g.clear();
            this.f280535f.clear();
            this.f280537h.clear();
        }
    }

    @Override // yn.d
    public void Y(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, in5.w0 w0Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        java.util.Map.Entry c17;
        java.util.LinkedList linkedList2;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2;
        sc5.f fVar = sc5.f.f488100a;
        if (sc5.f.f488102c) {
            java.util.Map map = this.f280538i;
            if (w0Var != null && (linkedList2 = w0Var.f374689i) != null && !linkedList2.isEmpty()) {
                long a17 = hq.d.a();
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    in5.c cVar = ((in5.x0) it.next()).f374691a;
                    rd5.d dVar = cVar instanceof rd5.d ? (rd5.d) cVar : null;
                    if (dVar != null && (f9Var2 = dVar.f475787d.f526833b) != null) {
                        long m124847x74d37ac6 = f9Var2.m124847x74d37ac6();
                        if (m124847x74d37ac6 > 0 && this.f280534e.add(java.lang.Long.valueOf(m124847x74d37ac6))) {
                            this.f280535f.add(new jz5.l(f9Var2, java.lang.Long.valueOf(hq.d.a())));
                        }
                        map.put(f9Var2, java.lang.Long.valueOf(a17));
                    }
                }
            }
            if (w0Var == null || (linkedList = w0Var.f374688h) == null || linkedList.isEmpty()) {
                return;
            }
            long a18 = hq.d.a();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                in5.c cVar2 = ((in5.x0) it6.next()).f374691a;
                rd5.d dVar2 = cVar2 instanceof rd5.d ? (rd5.d) cVar2 : null;
                if (dVar2 != null && (f9Var = dVar2.f475787d.f526833b) != null && (c17 = fo1.f.c(map, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.e1(f9Var))) != null) {
                    m0(f9Var, a18 - ((java.lang.Number) c17.getValue()).longValue());
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void a() {
        sc5.f.f488100a.d();
    }

    public final void m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17) {
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        if (m124847x74d37ac6 > 0 && j17 > 100 && this.f280536g.add(java.lang.Long.valueOf(m124847x74d37ac6))) {
            this.f280537h.add(new jz5.l(f9Var, java.lang.Long.valueOf(j17)));
        }
    }
}

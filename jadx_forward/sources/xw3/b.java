package xw3;

/* loaded from: classes.dex */
public final class b extends ym3.a {

    /* renamed from: g, reason: collision with root package name */
    public static final xw3.a f539260g = new xw3.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final r45.dp5 f539261d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f539262e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f539263f;

    public b(r45.dp5 initItem, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initItem, "initItem");
        this.f539261d = initItem;
        this.f539262e = z17;
        this.f539263f = new java.util.LinkedList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j a(v65.i scope, ym3.c request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        u26.k0 k0Var = new u26.k0();
        ym3.d dVar = new ym3.d(request);
        dVar.f544682c.addAll(this.f539263f);
        k0Var.e(dVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    public final r45.dp5 d(java.lang.String key, r45.dp5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(item.m75945x2fec8307(0), key)) {
            return item;
        }
        if (item.m75939xb282bd08(2) != 1) {
            return null;
        }
        java.util.LinkedList<r45.dp5> m75941xfb821914 = item.m75941xfb821914(5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSubItemList(...)");
        for (r45.dp5 dp5Var : m75941xfb821914) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dp5Var);
            r45.dp5 d17 = d(key, dp5Var);
            if (d17 != null) {
                return d17;
            }
        }
        return null;
    }

    @Override // ym3.f
    /* renamed from: onCreate */
    public void mo10202x3e5a77bb() {
        java.util.LinkedList linkedList = this.f539263f;
        linkedList.clear();
        boolean z17 = this.f539262e;
        xw3.a aVar = f539260g;
        r45.dp5 dp5Var = this.f539261d;
        if (z17) {
            java.lang.String k17 = bm5.o1.f104252a.k(bm5.h0.RepairerConfig_Inner_TopKey_String, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Repairer.RepairerDataSource", "favKeyString: ".concat(k17));
            int i17 = 0;
            for (java.lang.Object obj : r26.n0.f0(k17, new java.lang.String[]{","}, false, 0, 6, null)) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dp5 d17 = d((java.lang.String) obj, dp5Var);
                if (d17 != null) {
                    r45.ep5 ep5Var = (r45.ep5) d17.m75936x14adae67(12);
                    linkedList.add(new ex3.e(i17, 0, d17, aVar.a(d17, ep5Var != null && ep5Var.m75939xb282bd08(0) == 1)));
                }
                i17 = i18;
            }
        }
        java.util.LinkedList m75941xfb821914 = dp5Var.m75941xfb821914(5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getSubItemList(...)");
        int i19 = 0;
        for (java.lang.Object obj2 : m75941xfb821914) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.dp5 dp5Var2 = (r45.dp5) obj2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dp5Var2);
            r45.ep5 ep5Var2 = (r45.ep5) dp5Var2.m75936x14adae67(12);
            linkedList.add(new ex3.e(i19, 1, dp5Var2, aVar.a(dp5Var2, ep5Var2 != null && ep5Var2.m75939xb282bd08(0) == 1)));
            i19 = i27;
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public final class o2 extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 implements t13.j {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f219665q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f219666r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219667s;

    /* renamed from: t, reason: collision with root package name */
    public int f219668t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f219669u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219670v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var, java.util.HashSet searchTypeSet, int i17) {
        super(w0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchTypeSet, "searchTypeSet");
        android.content.Context h17 = h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getContext(...)");
        this.f219665q = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Vi(searchTypeSet, h17, this, i17);
        this.f219667s = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f219668t = -1;
        this.f219670v = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n2(this, android.os.Looper.getMainLooper());
    }

    @Override // t13.j
    public void a(t13.k unit, java.lang.String query, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unit, "unit");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        if (query.equals(this.f219583g)) {
            q();
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.m2(this, unit, query).run();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void c() {
        super.c();
        java.util.LinkedList<t13.k> linkedList = this.f219665q;
        if (linkedList != null) {
            for (t13.k kVar : linkedList) {
                kVar.mo63601x92b73cc2();
                kVar.c();
            }
        }
        this.f219670v.mo50303x856b99f0(1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public u13.g d(int i17) {
        java.util.LinkedList linkedList = this.f219665q;
        u13.g gVar = null;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext() && (gVar = ((t13.k) it.next()).b(i17)) == null) {
            }
        }
        return gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void f() {
        this.f219666r = false;
        this.f219668t = -1;
        q();
        g23.j.f349467e = 0L;
        java.lang.String str = this.f219583g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getQuery(...)");
        g23.j.f349466d = str;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0 c6662x813c26a0 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6662x813c26a0();
        c6662x813c26a0.q(g23.j.f349465c);
        c6662x813c26a0.f140076d = 4L;
        c6662x813c26a0.f140077e = g23.j.f349464b;
        c6662x813c26a0.p(g23.j.f349466d);
        c6662x813c26a0.f140079g = g23.j.f349467e;
        c6662x813c26a0.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + c6662x813c26a0.m());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public void g() {
        super.g();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0
    public boolean k(android.view.View view, u13.g ftsDataItem, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsDataItem, "ftsDataItem");
        java.util.LinkedList linkedList = this.f219665q;
        if (linkedList == null) {
            return false;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            if (((t13.k) it.next()).a(view, ftsDataItem, z17)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0, android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.onScrollStateChanged(view, i17);
        if (i17 == 2) {
            this.f219669u = true;
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).g();
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.i1) p94.w0.d()).G();
        } else {
            this.f219669u = false;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.fts.n) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).bj()).f219302c) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f219670v;
            n3Var.mo50303x856b99f0(1);
            n3Var.mo50307xb9e94560(1, 200L);
        }
    }

    public final void q() {
        java.util.LinkedList linkedList = this.f219665q;
        if (linkedList != null) {
            int i17 = this.f219668t + 1;
            this.f219668t = i17;
            if (i17 < linkedList.size()) {
                java.lang.Object obj = linkedList.get(this.f219668t);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                ((t13.k) obj).f(this.f219583g, this.f219667s, new java.util.HashSet(), 0L);
            }
        }
    }
}

package r01;

/* loaded from: classes8.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j16 f449711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449712e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f449713f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f449714g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r01.r1 f449715h;

    public p1(r01.r1 r1Var, r45.j16 j16Var, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        this.f449715h = r1Var;
        this.f449711d = j16Var;
        this.f449712e = str;
        this.f449713f = f9Var;
        this.f449714g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f449715h.e(this.f449711d, this.f449712e);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f449713f;
        if (f9Var == null || !f9Var.t2()) {
            this.f449715h.b(this.f449712e, 10, 0, 0.0f, 0.0f, 0, null, this.f449714g, this.f449711d, null);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.m124847x74d37ac6(), f9Var.j()).f430114i;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
            this.f449715h.b(this.f449712e, 10, 0, 0.0f, 0.0f, 0, null, this.f449714g, this.f449711d, null);
            return;
        }
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            ot0.s0 s0Var = (ot0.s0) it.next();
            java.lang.String str = s0Var.f430295e;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                android.net.Uri parse = android.net.Uri.parse(str);
                try {
                    java.lang.String queryParameter = parse.getQueryParameter("mid");
                    java.lang.String queryParameter2 = parse.getQueryParameter("idx");
                    r45.y30 y30Var = new r45.y30();
                    y30Var.f472268d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(queryParameter, 0L);
                    y30Var.f472269e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(queryParameter2, 0);
                    y30Var.f472270f = s0Var.f430312v;
                    y30Var.f472271g = s0Var.f430309s;
                    linkedList.add(y30Var);
                } catch (java.lang.UnsupportedOperationException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportLocation", "UnsupportedOperationException %s", e17.getMessage());
                }
            }
        }
        this.f449715h.b(this.f449712e, 10, 0, 0.0f, 0.0f, 0, linkedList, this.f449714g, this.f449711d, null);
    }
}

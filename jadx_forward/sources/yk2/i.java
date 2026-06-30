package yk2;

/* loaded from: classes3.dex */
public final class i extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f544327f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.ViewGroup root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f544325e = response;
        r45.v32 v32Var = (r45.v32) response.m75936x14adae67(31);
        if (v32Var != null) {
            boolean m75933x41a8a7f2 = v32Var.m75933x41a8a7f2(2);
            android.view.ViewGroup viewGroup = this.f544324d;
            if (!m75933x41a8a7f2) {
                viewGroup.setVisibility(8);
                return;
            }
            if (!this.f544327f) {
                this.f544327f = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
                java.lang.String b17 = b();
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                a4Var.a(b17, "", b52.b.b(), "person_page_product_orderid", "");
            }
            viewGroup.setVisibility(0);
        }
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_product_orderid", "");
        android.content.Context context = this.f544324d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.lk2 lk2Var = this.f544325e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = lk2Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) lk2Var.m75936x14adae67(32) : null;
        if (c19786x6a1e2862 == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.f77502x92235c1b, 3);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        xc2.y2 y2Var = xc2.y2.f534876a;
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534768a0 = hashMap;
        xc2.y2.P(y2Var, context, p0Var, 0, false, null, 0.0f, 60, null);
    }
}

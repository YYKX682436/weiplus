package yk2;

/* loaded from: classes3.dex */
public final class j extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f544328f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f544325e = response;
        r45.v32 v32Var = (r45.v32) response.m75936x14adae67(31);
        if (v32Var != null) {
            boolean m75933x41a8a7f2 = v32Var.m75933x41a8a7f2(3);
            android.view.ViewGroup viewGroup = this.f544324d;
            if (!m75933x41a8a7f2) {
                viewGroup.setVisibility(8);
                return;
            }
            if (!this.f544328f) {
                this.f544328f = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
                java.lang.String b17 = b();
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                a4Var.a(b17, "", b52.b.b(), "person_page_buy", "");
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
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_buy", "");
        android.content.Intent intent = new android.content.Intent();
        r45.lk2 lk2Var = this.f544325e;
        if (lk2Var != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) lk2Var.m75936x14adae67(37)) != null) {
            intent.putExtra("KEY_PURCHASE_PAY_MIC_COURSE_JUMP_INTENT", c19786x6a1e2862.mo14344x5f01b1f6());
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context = this.f544324d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        r45.lk2 lk2Var2 = this.f544325e;
        int m75939xb282bd08 = lk2Var2 != null ? lk2Var2.m75939xb282bd08(29) : 0;
        r45.lk2 lk2Var3 = this.f544325e;
        int m75939xb282bd082 = lk2Var3 != null ? lk2Var3.m75939xb282bd08(12) : 0;
        r45.lk2 lk2Var4 = this.f544325e;
        int m75939xb282bd083 = lk2Var4 != null ? lk2Var4.m75939xb282bd08(33) : 0;
        r45.lk2 lk2Var5 = this.f544325e;
        int m75939xb282bd084 = lk2Var5 != null ? lk2Var5.m75939xb282bd08(35) : 0;
        r45.lk2 lk2Var6 = this.f544325e;
        int m75939xb282bd085 = lk2Var6 != null ? lk2Var6.m75939xb282bd08(36) : 0;
        ((c61.p2) ybVar).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).nk(context, intent, m75939xb282bd08, m75939xb282bd082, m75939xb282bd083, m75939xb282bd084, m75939xb282bd085);
    }
}

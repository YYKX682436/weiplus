package com.p314xaae8f345.mm.ui.p2649x8f4dc54e;

/* loaded from: classes11.dex */
public class l extends com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 {

    /* renamed from: J, reason: collision with root package name */
    public final java.util.HashMap f279585J;
    public final java.lang.String K;

    public l(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.ui.y9 y9Var) {
        super(context, y9Var);
        this.K = str;
        this.f279585J = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        s(((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).s(1, null, this.K, -1));
        com.p314xaae8f345.mm.ui.y9 y9Var = this.f294144h;
        if (y9Var != null) {
            y9Var.b(null);
        }
        notifyDataSetChanged();
    }

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2
    public void x(final com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var, boolean z17, final int i17, final boolean z18, final android.view.View view) {
        if (l4Var == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable() { // from class: com.tencent.mm.ui.brandservice.l$$a
            @Override // java.lang.Runnable
            public final void run() {
                android.view.View view2 = view;
                if (view2 == null) {
                    return;
                }
                int i18 = z18 ? 8 : 32;
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = l4Var;
                int i19 = l4Var2.d1() > 0 ? 1 : 0;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("raw_user_name", l4Var2.h1());
                hashMap.put("element_type", "biz_bar_page");
                hashMap.put("element", 6);
                hashMap.put("if_red_dot", java.lang.Integer.valueOf(i19));
                hashMap.put("pos", java.lang.Integer.valueOf(i17));
                cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
                aVar.pk(view2, "brand_service_session_view");
                aVar.gk(view2, hashMap);
                aVar.Tj(view2, i18, 12, false);
            }
        });
        com.p314xaae8f345.mm.ui.p2649x8f4dc54e.m mVar = (com.p314xaae8f345.mm.ui.p2649x8f4dc54e.m) this.f279585J.get(l4Var.h1());
        if (mVar == null) {
            mVar = new com.p314xaae8f345.mm.ui.p2649x8f4dc54e.m();
            this.f279585J.put(l4Var.h1(), mVar);
        }
        if (mVar.f279591p > 0) {
            return;
        }
        mVar.f459545g = z17;
        mVar.f459549n = mVar.f459549n || l4Var.d1() > 0;
        int i18 = i17 + 1;
        mVar.f459548m = i18;
        if (z18) {
            mVar.f279591p = i18;
        }
        mVar.f459547i = (int) (java.lang.System.currentTimeMillis() / 1000);
        if (l4Var.R0() == mVar.f279590o) {
            return;
        }
        mVar.f279590o = l4Var.R0();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var.h1());
        if (q57 == null || !q57.t2()) {
            return;
        }
        ot0.m0 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(q57.m124847x74d37ac6(), q57.j());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(Di.f430114i) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((ot0.s0) Di.f430114i.get(0)).f430295e)) {
            return;
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(((ot0.s0) Di.f430114i.get(0)).f430295e);
            mVar.f459543e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
            mVar.f459544f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("idx"), 0);
        } catch (java.lang.UnsupportedOperationException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", e17.getMessage());
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ConversationAdapter", "exposeLog exp %s", e18.getMessage());
        }
    }
}

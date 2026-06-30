package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class p extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.aef;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m76184x8010e5e4;
        so2.i0 item = (so2.i0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = item.f491948d;
        boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(c19782x23db1cfa.m76197x6c03c64c());
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (S3) {
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(c19782x23db1cfa.m76175x6d346f39(), null, 2, null);
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.e_n);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411490h));
        } else {
            java.lang.String m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39();
            if (m76175x6d346f39 == null || m76175x6d346f39.length() == 0) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e_n), c19782x23db1cfa.m76197x6c03c64c(), null);
            } else {
                vo0.d l17 = g1Var.l();
                mn2.n nVar2 = new mn2.n(c19782x23db1cfa.m76175x6d346f39(), null, 2, null);
                android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.e_n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
                l17.c(nVar2, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f411494o));
            }
        }
        java.lang.String m76184x8010e5e42 = c19782x23db1cfa.m76184x8010e5e4();
        if (m76184x8010e5e42 == null || m76184x8010e5e42.length() == 0) {
            java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
            m76184x8010e5e4 = "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m76197x6c03c64c)) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                m76184x8010e5e4 = c61.yb.md((c61.yb) c17, m76197x6c03c64c == null ? "" : m76197x6c03c64c, "", false, 4, null);
            }
        } else {
            m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e_o);
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(holder.f374654e, m76184x8010e5e4));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}

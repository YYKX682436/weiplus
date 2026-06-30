package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class b implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c f186732d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c cVar) {
        this.f186732d = cVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.qj2 qj2Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.c cVar = this.f186732d;
            if (i17 < cVar.f186735e.size()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = cVar.m158354x19263085();
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m158354x19263085 : null;
                android.app.Activity m81193x1252e2cf = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81193x1252e2cf() : null;
                java.lang.Object obj = cVar.f186735e.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                zb2.b bVar = (zb2.b) obj;
                r45.bn2 bn2Var = (r45.bn2) bVar.f552791d.m75936x14adae67(1);
                if (bn2Var == null) {
                    return;
                }
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.util.Map c17 = d2Var.c(context);
                c17.put("native_drama_id", pm0.v.u(cVar.f186737g));
                r45.oj2 oj2Var = bVar.f552791d;
                c17.put("feed_id", pm0.v.u(oj2Var.m75942xfb822ef2(0)));
                c17.put("native_drama_item_num", java.lang.Integer.valueOf(bn2Var.m75939xb282bd08(2)));
                hc2.v0.b(itemView, "native_drama_item", "view_clk", 0, c17, null, 20, null);
                if (m81193x1252e2cf != null && (m81193x1252e2cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f) m81193x1252e2cf).k7(bVar, cVar.f186737g);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                long j17 = cVar.f186737g;
                long m75942xfb822ef2 = oj2Var.m75942xfb822ef2(0);
                r45.bn2 bn2Var2 = (r45.bn2) oj2Var.m75936x14adae67(1);
                i0Var.ak(context, null, j17, m75942xfb822ef2, null, (bn2Var2 == null || (qj2Var = (r45.qj2) bn2Var2.m75936x14adae67(0)) == null) ? null : qj2Var.m75945x2fec8307(1), cVar.f186738h, cVar.f186739i, cVar.f186740m, cVar.f186742o);
            }
        }
    }
}

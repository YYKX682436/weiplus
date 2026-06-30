package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1;

/* loaded from: classes2.dex */
public final class r implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 f186803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f186804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f186805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186806g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f186807h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186808i;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var, r45.qj2 qj2Var, long j17, java.lang.String str, int i17, java.lang.String str2) {
        this.f186803d = e0Var;
        this.f186804e = qj2Var;
        this.f186805f = j17;
        this.f186806g = str;
        this.f186807h = i17;
        this.f186808i = str2;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.qj2 qj2Var;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (i17 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1444xb118f8f1.e0 e0Var = this.f186803d;
            if (i17 < e0Var.f186759p.size()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = e0Var.m158354x19263085();
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) m158354x19263085 : null;
                android.app.Activity m81193x1252e2cf = abstractActivityC22579xbed01a37 != null ? abstractActivityC22579xbed01a37.m81193x1252e2cf() : null;
                java.lang.Object obj = e0Var.f186759p.get(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                zb2.b bVar = (zb2.b) obj;
                r45.bn2 bn2Var = (r45.bn2) bVar.f552791d.m75936x14adae67(1);
                if (bn2Var == null) {
                    return;
                }
                e0Var.f186767x = i17;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = e0Var.f186761r;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeRv");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
                if (mo7946xf939df19 != null) {
                    mo7946xf939df19.m8146xced61ae5();
                }
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                java.util.Map c17 = d2Var.c(context);
                r45.qj2 qj2Var2 = this.f186804e;
                c17.put("native_drama_id", pm0.v.u(qj2Var2.m75942xfb822ef2(0)));
                r45.oj2 oj2Var = bVar.f552791d;
                c17.put("feed_id", pm0.v.u(oj2Var.m75942xfb822ef2(0)));
                c17.put("native_drama_item_num", java.lang.Integer.valueOf(bn2Var.m75939xb282bd08(2)));
                hc2.v0.b(itemView, "native_drama_item", "view_clk", 0, c17, null, 20, null);
                if (m81193x1252e2cf != null && (m81193x1252e2cf instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f)) {
                    e0Var.f186765v = oj2Var.m75942xfb822ef2(0);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1442x5b67a67.p1445x8438d441.ActivityC13722xc5bc5e9f) m81193x1252e2cf).k7(bVar, qj2Var2.m75942xfb822ef2(0));
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                long m75942xfb822ef2 = qj2Var2.m75942xfb822ef2(0);
                long m75942xfb822ef22 = oj2Var.m75942xfb822ef2(0);
                r45.bn2 bn2Var2 = (r45.bn2) oj2Var.m75936x14adae67(1);
                i0Var.ak(context, null, m75942xfb822ef2, m75942xfb822ef22, null, (bn2Var2 == null || (qj2Var = (r45.qj2) bn2Var2.m75936x14adae67(0)) == null) ? null : qj2Var.m75945x2fec8307(1), this.f186805f, this.f186806g, this.f186807h, this.f186808i);
            }
        }
    }
}

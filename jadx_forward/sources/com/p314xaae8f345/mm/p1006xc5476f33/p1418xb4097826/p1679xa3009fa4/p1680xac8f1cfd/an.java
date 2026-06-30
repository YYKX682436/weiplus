package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class an implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn f215320d;

    public an(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn mnVar) {
        this.f215320d = mnVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        java.util.List m56388xcaeb60d0;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn mnVar = this.f215320d;
            if (a07 < mnVar.S6().m56393xfb854877()) {
                so2.u1 u1Var = (so2.u1) holder.f374658i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bc bcVar = mnVar.f216716h;
                if (bcVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                    throw null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = bcVar.f188103t;
                so2.j5 j5Var = (abstractC13919x46aff122 == null || (m56388xcaeb60d0 = abstractC13919x46aff122.m56388xcaeb60d0()) == null) ? null : (so2.j5) kz5.n0.Z(m56388xcaeb60d0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
                if (abstractC14490x69736cb5 != null && abstractC14490x69736cb5.mo2128x1ed62e84() == u1Var.mo2128x1ed62e84()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoNewFormUIC", "onGridItemClick: click same item, position = " + a07 + ", id = " + pm0.v.u(u1Var.mo2128x1ed62e84()));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoNewFormUIC", "onGridItemClick: position = " + a07 + ", id = " + pm0.v.u(u1Var.mo2128x1ed62e84()));
                android.app.Activity context = mnVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d.class)).Q6(), false, null, false, null, 14, null);
                mnVar.P6(u1Var);
                mnVar.S6().f188966d = u1Var.getFeedObject().m59251x5db1b11();
                mnVar.S6().d(u1Var.getFeedObject().m59276x6c285d75());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                android.app.Activity context2 = mnVar.m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedid", pm0.v.u(mnVar.f216712d));
                jSONObject.put("recommend_feedid", pm0.v.u(mnVar.f216712d));
                jSONObject.put("recommend_feed_location_id", a07);
                r45.ru2 m76771x17e42f9f = u1Var.getFeedObject().getFeedObject().m76771x17e42f9f();
                if (m76771x17e42f9f == null || (str = m76771x17e42f9f.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                jSONObject.put("recommend_reason", str);
                jSONObject.put("expose_type", mnVar.f216713e);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "more_recommend_feed", 1, jSONObject, false, null, 48, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.a(mnVar.m80379x76847179(), u1Var, 54);
            }
        }
    }
}

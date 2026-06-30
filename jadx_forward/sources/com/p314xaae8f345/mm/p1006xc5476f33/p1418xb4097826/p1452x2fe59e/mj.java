package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class mj implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj f188918d;

    public mj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar) {
        this.f188918d = xjVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar = this.f188918d;
            if (a07 < xjVar.f192606b.e().m56393xfb854877()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = xjVar.f192606b;
                tlVar.getClass();
                so2.u1 u1Var = (so2.u1) holder.f374658i;
                java.lang.Object obj = tlVar.f().f374658i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
                if (abstractC14490x69736cb5 != null && abstractC14490x69736cb5.mo2128x1ed62e84() == u1Var.mo2128x1ed62e84()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "onGridItemClick: click same item, position = " + a07 + ", id = " + pm0.v.u(u1Var.mo2128x1ed62e84()));
                    return;
                }
                tlVar.f190614s.f189369a = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoShareContract", "onGridItemClick: position = " + a07 + ", id = " + pm0.v.u(u1Var.mo2128x1ed62e84()));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl.b(tlVar, u1Var, null, a07, 2, null);
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = tlVar.f190602d;
                if (context.getIntent().getIntExtra("key_reuqest_scene", 0) == 40) {
                    long j17 = vn2.u0.f519920a.j(u1Var.getFeedObject());
                    if (j17 > 0) {
                        java.lang.Object obj2 = tlVar.f().f374658i;
                        so2.u1 u1Var2 = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
                        if (u1Var2 != null) {
                            u1Var2.f492165f = true;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) tlVar.f().p(com.p314xaae8f345.mm.R.id.e_k);
                        if (c15196x85976f5f != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.Z(c15196x85976f5f, j17, 3, 0.0f, false, null, 28, null);
                        }
                    }
                }
                tlVar.e().f188966d = u1Var.getFeedObject().m59251x5db1b11();
                tlVar.e().d(u1Var.getFeedObject().m59276x6c285d75());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedid", pm0.v.u(tlVar.e().f188966d));
                jSONObject.put("feed_location_id", a07);
                r45.ru2 m76771x17e42f9f = u1Var.getFeedObject().getFeedObject().m76771x17e42f9f();
                if (m76771x17e42f9f == null || (str = m76771x17e42f9f.m75945x2fec8307(0)) == null) {
                    str = "";
                }
                jSONObject.put("recommend_reason", str);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "more_recommend_feed", 1, jSONObject, false, null, 48, null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.l0.f206642a.a(context, u1Var, 54);
            }
        }
    }
}

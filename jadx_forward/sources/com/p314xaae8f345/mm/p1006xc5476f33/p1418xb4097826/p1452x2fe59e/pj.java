package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class pj extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f190259a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj f190260b;

    public pj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar) {
        this.f190260b = xjVar;
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar;
        java.lang.String str;
        fc2.q f76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.HashSet hashSet2 = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            hashSet = this.f190259a;
            xjVar = this.f190260b;
            if (!hasNext) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                if (u1Var != null) {
                    hashSet2.add(java.lang.Long.valueOf(u1Var.mo2128x1ed62e84()));
                    if (!hashSet.contains(java.lang.Long.valueOf(u1Var.mo2128x1ed62e84()))) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s0Var.f374655f;
                        in5.n0 n0Var = f2Var instanceof in5.n0 ? (in5.n0) f2Var : null;
                        int m8183xf806b362 = s0Var.m8183xf806b362();
                        int a07 = n0Var != null ? m8183xf806b362 - n0Var.a0() : m8183xf806b362 - 1;
                        if (i17 < a07) {
                            i17 = a07;
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = xjVar.f192605a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("feedid", pm0.v.u(xjVar.f192606b.f190617v));
                        jSONObject.put("feed_location_id", a07);
                        r45.ru2 m76771x17e42f9f = u1Var.getFeedObject().getFeedObject().m76771x17e42f9f();
                        if (m76771x17e42f9f == null || (str = m76771x17e42f9f.m75945x2fec8307(0)) == null) {
                            str = "";
                        }
                        jSONObject.put("recommend_reason", str);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "more_recommend_feed", 0, jSONObject, false, null, 48, null);
                        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context2 = xjVar.f192605a;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        if (nyVar2 != null && (f76 = nyVar2.f7()) != null) {
                            fc2.s sVar = new fc2.s(1);
                            sVar.f342514e = u1Var;
                            f76.a(sVar);
                        }
                    }
                }
            }
        }
        ao2.a aVar = xjVar.f192606b.f190603e;
        if (aVar != null) {
            aVar.f("ViewIdRelatedFeed", i17);
        }
        hashSet.clear();
        hashSet.addAll(hashSet2);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class en extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f215813a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn f215814b;

    public en(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn mnVar) {
        this.f215814b = mnVar;
    }

    @Override // ym5.m0
    public boolean a(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        if (k3Var == null) {
            return false;
        }
        ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
        android.view.View itemView = k3Var.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ((wo2.k) gVar).getClass();
        return !dp2.a.f323716a.b(1, itemView, 0.2f);
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String str;
        fc2.q f76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.HashSet hashSet2 = this.f215813a;
            if (!hasNext) {
                hashSet2.clear();
                hashSet2.addAll(hashSet);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f374658i;
                so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                if (u1Var != null) {
                    hashSet.add(java.lang.Long.valueOf(u1Var.mo2128x1ed62e84()));
                    if (!hashSet2.contains(java.lang.Long.valueOf(u1Var.mo2128x1ed62e84()))) {
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = s0Var.f374655f;
                        in5.n0 n0Var = f2Var instanceof in5.n0 ? (in5.n0) f2Var : null;
                        int m8183xf806b362 = s0Var.m8183xf806b362();
                        int a07 = n0Var != null ? m8183xf806b362 - n0Var.a0() : m8183xf806b362 - 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mn mnVar = this.f215814b;
                        android.app.Activity context = mnVar.m80379x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("feedid", pm0.v.u(mnVar.f216712d));
                        jSONObject.put("recommend_feedid", pm0.v.u(u1Var.mo2128x1ed62e84()));
                        jSONObject.put("recommend_feed_location_id", a07);
                        r45.ru2 m76771x17e42f9f = u1Var.getFeedObject().getFeedObject().m76771x17e42f9f();
                        if (m76771x17e42f9f == null || (str = m76771x17e42f9f.m75945x2fec8307(0)) == null) {
                            str = "";
                        }
                        jSONObject.put("recommend_reason", str);
                        jSONObject.put("expose_type", mnVar.f216713e);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "more_recommend_feed", 0, jSONObject, false, null, 48, null);
                        android.app.Activity context2 = mnVar.m80379x76847179();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                        if (nyVar2 != null && (f76 = nyVar2.f7()) != null) {
                            fc2.s sVar = new fc2.s(1);
                            sVar.f342514e = u1Var;
                            f76.a(sVar);
                        }
                    }
                }
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class qn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn f190370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.k4 f190371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f190372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f190373g;

    public qn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar, so2.k4 k4Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, int i17) {
        this.f190370d = rnVar;
        this.f190371e = k4Var;
        this.f190372f = f2Var;
        this.f190373g = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.l95 l95Var;
        r45.e95 e95Var;
        if (menuItem.getItemId() == 10002) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.rn rnVar = this.f190370d;
            rnVar.getClass();
            so2.k4 k4Var = this.f190371e;
            boolean z17 = true;
            java.lang.String poiId = k4Var.f491987d.m75945x2fec8307(1);
            if (poiId != null && poiId.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hn hnVar = rnVar.f190462e;
                hnVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
                i95.m c17 = i95.n0.c(cq.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dn dnVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dn.f188111d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.en enVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.en.f188196d;
                java.lang.String friendUsername = hnVar.f188465d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(friendUsername, "friendUsername");
                pm0.v.T(new bq.w1(friendUsername, poiId).l(), new cq.h1(dnVar, enVar));
            }
            r45.v96 v96Var = (r45.v96) k4Var.f491987d.m75936x14adae67(0);
            if (v96Var != null && (l95Var = v96Var.f469542d) != null && (e95Var = l95Var.f460774d) != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("poi_name", e95Var.f454698e);
                i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14064x3f930afd context = rnVar.f190461d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij(o3Var, 1, "profile_poiMngmt_del", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
            }
            if (rnVar.f190462e.f188469h.remove(k4Var)) {
                this.f190372f.m8155x27702c4(this.f190373g);
            }
        }
    }
}

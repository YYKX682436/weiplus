package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class qn implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rn f108837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.k4 f108838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.f2 f108839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f108840g;

    public qn(com.tencent.mm.plugin.finder.feed.rn rnVar, so2.k4 k4Var, androidx.recyclerview.widget.f2 f2Var, int i17) {
        this.f108837d = rnVar;
        this.f108838e = k4Var;
        this.f108839f = f2Var;
        this.f108840g = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.l95 l95Var;
        r45.e95 e95Var;
        if (menuItem.getItemId() == 10002) {
            com.tencent.mm.plugin.finder.feed.rn rnVar = this.f108837d;
            rnVar.getClass();
            so2.k4 k4Var = this.f108838e;
            boolean z17 = true;
            java.lang.String poiId = k4Var.f410454d.getString(1);
            if (poiId != null && poiId.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                com.tencent.mm.plugin.finder.feed.hn hnVar = rnVar.f108929e;
                hnVar.getClass();
                kotlin.jvm.internal.o.g(poiId, "poiId");
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.feed.dn dnVar = com.tencent.mm.plugin.finder.feed.dn.f106578d;
                com.tencent.mm.plugin.finder.feed.en enVar = com.tencent.mm.plugin.finder.feed.en.f106663d;
                java.lang.String friendUsername = hnVar.f106932d;
                kotlin.jvm.internal.o.g(friendUsername, "friendUsername");
                pm0.v.T(new bq.w1(friendUsername, poiId).l(), new cq.h1(dnVar, enVar));
            }
            r45.v96 v96Var = (r45.v96) k4Var.f410454d.getCustom(0);
            if (v96Var != null && (l95Var = v96Var.f388009d) != null && (e95Var = l95Var.f379241d) != null) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("poi_name", e95Var.f373165e);
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c18;
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
                com.tencent.mm.plugin.finder.feed.ui.FinderPoiManageUI context = rnVar.f108928d;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "profile_poiMngmt_del", t17, nyVar != null ? nyVar.V6() : null, null, 16, null);
            }
            if (rnVar.f108929e.f106936h.remove(k4Var)) {
                this.f108839f.notifyItemRemoved(this.f108840g);
            }
        }
    }
}

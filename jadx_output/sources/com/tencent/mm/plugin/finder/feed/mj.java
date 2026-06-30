package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class mj implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f107385d;

    public mj(com.tencent.mm.plugin.finder.feed.xj xjVar) {
        this.f107385d = xjVar;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.tencent.mm.plugin.finder.feed.xj xjVar = this.f107385d;
            if (a07 < xjVar.f111073b.e().getSize()) {
                com.tencent.mm.plugin.finder.feed.tl tlVar = xjVar.f111073b;
                tlVar.getClass();
                so2.u1 u1Var = (so2.u1) holder.f293125i;
                java.lang.Object obj = tlVar.f().f293125i;
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
                if (baseFinderFeed != null && baseFinderFeed.getItemId() == u1Var.getItemId()) {
                    com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "onGridItemClick: click same item, position = " + a07 + ", id = " + pm0.v.u(u1Var.getItemId()));
                    return;
                }
                tlVar.f109081s.f107836a = null;
                com.tencent.mars.xlog.Log.i("FinderLongVideoShareContract", "onGridItemClick: position = " + a07 + ", id = " + pm0.v.u(u1Var.getItemId()));
                com.tencent.mm.plugin.finder.feed.tl.b(tlVar, u1Var, null, a07, 2, null);
                com.tencent.mm.ui.MMActivity context = tlVar.f109069d;
                if (context.getIntent().getIntExtra("key_reuqest_scene", 0) == 40) {
                    long j17 = vn2.u0.f438387a.j(u1Var.getFeedObject());
                    if (j17 > 0) {
                        java.lang.Object obj2 = tlVar.f().f293125i;
                        so2.u1 u1Var2 = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
                        if (u1Var2 != null) {
                            u1Var2.f410632f = true;
                        }
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) tlVar.f().p(com.tencent.mm.R.id.e_k);
                        if (finderVideoLayout != null) {
                            com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, j17, 3, 0.0f, false, null, 28, null);
                        }
                    }
                }
                tlVar.e().f107433d = u1Var.getFeedObject().getId();
                tlVar.e().d(u1Var.getFeedObject().getObjectNonceId());
                com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedid", pm0.v.u(tlVar.e().f107433d));
                jSONObject.put("feed_location_id", a07);
                r45.ru2 flow_card_recommand_reason = u1Var.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
                if (flow_card_recommand_reason == null || (str = flow_card_recommand_reason.getString(0)) == null) {
                    str = "";
                }
                jSONObject.put("recommend_reason", str);
                com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "more_recommend_feed", 1, jSONObject, false, null, 48, null);
                com.tencent.mm.plugin.finder.report.l0.f125109a.a(context, u1Var, 54);
            }
        }
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.tl f108732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f108733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f108734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f108735g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(com.tencent.mm.plugin.finder.feed.tl tlVar, so2.u1 u1Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, in5.s0 s0Var) {
        super(0);
        this.f108732d = tlVar;
        this.f108733e = u1Var;
        this.f108734f = finderItem;
        this.f108735g = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.feed.tl tlVar = this.f108732d;
        com.tencent.mm.ui.MMActivity context = tlVar.f109069d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("first_feedid", pm0.v.u(tlVar.f109084v));
        jSONObject.put("feedid", pm0.v.u(((so2.j5) this.f108735g.f293125i).getItemId()));
        so2.u1 u1Var = this.f108733e;
        jSONObject.put("next_feedid", pm0.v.u(u1Var.getItemId()));
        r45.ru2 flow_card_recommand_reason = u1Var.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
        if (flow_card_recommand_reason == null || (str = flow_card_recommand_reason.getString(0)) == null) {
            str = "";
        }
        jSONObject.put("recommend_reason", str);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "next_feed_play", 1, jSONObject, false, null, 48, null);
        com.tencent.mm.plugin.finder.feed.tl.b(this.f108732d, this.f108733e, null, 0, 6, null);
        vn2.u0 u0Var = vn2.u0.f438387a;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f108734f;
        long j17 = u0Var.j(finderItem);
        if (j17 <= 0) {
            r45.no2 playhistory_info = finderItem.getFeedObject().getPlayhistory_info();
            j17 = playhistory_info != null ? playhistory_info.getInteger(0) : 0;
        }
        long j18 = j17;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) tlVar.f().p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null) {
            com.tencent.mm.plugin.finder.video.FinderVideoLayout.Z(finderVideoLayout, j18, 3, 0.0f, false, null, 28, null);
        }
        com.tencent.mm.plugin.finder.report.l0.f125109a.a(tlVar.f109069d, u1Var, 54);
        return jz5.f0.f302826a;
    }
}

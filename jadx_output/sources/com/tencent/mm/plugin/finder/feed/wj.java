package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f110988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f110989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FeedData f110990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f110991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f110992h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(so2.u1 u1Var, com.tencent.mm.plugin.finder.feed.xj xjVar, com.tencent.mm.plugin.finder.storage.FeedData feedData, in5.s0 s0Var, yz5.a aVar) {
        super(0);
        this.f110988d = u1Var;
        this.f110989e = xjVar;
        this.f110990f = feedData;
        this.f110991g = s0Var;
        this.f110992h = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        r45.rz0 rz0Var;
        r45.dm2 object_extend = this.f110988d.getFeedObject().getFinderObject().getObject_extend();
        int integer = (object_extend == null || (rz0Var = (r45.rz0) object_extend.getCustom(38)) == null) ? 0 : rz0Var.getInteger(0);
        com.tencent.mm.plugin.finder.feed.xj xjVar = this.f110989e;
        int i17 = xjVar.f111072a.getResources().getConfiguration().orientation == 2 ? 2 : 1;
        com.tencent.mm.ui.MMActivity context = xjVar.f111072a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        long itemId = ((so2.j5) this.f110991g.f293125i).getItemId();
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f110990f;
        kotlin.jvm.internal.o.g(feedData, "feedData");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[8];
        if (V6 == null || (str = V6.getString(2)) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (V6 == null || (str2 = V6.getString(1)) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : "");
        lVarArr[3] = new jz5.l("feedid", pm0.v.u(feedData.getId()));
        lVarArr[4] = new jz5.l("screen_type", java.lang.Integer.valueOf(i17));
        lVarArr[5] = new jz5.l("last_completed_feedid", pm0.v.u(itemId));
        lVarArr[6] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(integer));
        java.lang.String sessionBuffer = feedData.getSessionBuffer();
        lVarArr[7] = new jz5.l("session_buffer", sessionBuffer != null ? sessionBuffer : "");
        ((cy1.a) rVar).yj("autoplay_next_feed", null, kz5.c1.k(lVarArr), 1, true);
        this.f110992h.invoke();
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class uj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FeedData f110813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f110814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f110815f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f110816g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f110817h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f110818i;

    public uj(com.tencent.mm.plugin.finder.storage.FeedData feedData, com.tencent.mm.plugin.finder.feed.xj xjVar, boolean z17, in5.s0 s0Var, int i17, yz5.a aVar) {
        this.f110813d = feedData;
        this.f110814e = xjVar;
        this.f110815f = z17;
        this.f110816g = s0Var;
        this.f110817h = i17;
        this.f110818i = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.MMActivity context = this.f110814e.f111072a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        int i17 = this.f110815f ? 1 : 2;
        long itemId = ((so2.j5) this.f110816g.f293125i).getItemId();
        com.tencent.mm.plugin.finder.storage.FeedData feedData = this.f110813d;
        kotlin.jvm.internal.o.g(feedData, "feedData");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[9];
        lVarArr[0] = new jz5.l("view_id", "card_continue_play_button");
        if (V6 == null || (str = V6.getString(2)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_tab_context_id", str);
        if (V6 == null || (str2 = V6.getString(1)) == null) {
            str2 = "";
        }
        lVarArr[2] = new jz5.l("finder_context_id", str2);
        lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : "");
        lVarArr[4] = new jz5.l("feedid", pm0.v.u(feedData.getId()));
        lVarArr[5] = new jz5.l("screen_type", java.lang.Integer.valueOf(i17));
        lVarArr[6] = new jz5.l("last_completed_feedid", pm0.v.u(itemId));
        lVarArr[7] = new jz5.l("continue_play_type", java.lang.Integer.valueOf(this.f110817h));
        java.lang.String sessionBuffer = feedData.getSessionBuffer();
        lVarArr[8] = new jz5.l("session_buffer", sessionBuffer != null ? sessionBuffer : "");
        ((cy1.a) rVar).yj("view_clk", null, kz5.c1.k(lVarArr), 1, true);
        this.f110818i.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$updateEndHintLayout$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

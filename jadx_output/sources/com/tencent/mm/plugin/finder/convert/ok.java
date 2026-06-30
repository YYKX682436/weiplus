package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ok implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.pk f104204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f104205g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k8 f104206h;

    public ok(in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.convert.pk pkVar, int i17, com.tencent.mm.plugin.finder.feed.k8 k8Var) {
        this.f104202d = s0Var;
        this.f104203e = baseFinderFeed;
        this.f104204f = pkVar;
        this.f104205g = i17;
        this.f104206h = k8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdFollow$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        in5.s0 s0Var = this.f104202d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f104203e;
        b6Var.b(V6, "follow", false, baseFinderFeed.getItemId(), (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? "" : null);
        com.tencent.mm.plugin.finder.convert.pk.R6(this.f104204f, 3, baseFinderFeed.getFeedObject().getId(), baseFinderFeed.getFeedObject().getDupFlag(), this.f104205g, this.f104202d, 0, 0, 96, null);
        ya2.g gVar = ya2.h.f460484a;
        java.lang.String str = baseFinderFeed.getFeedObject().field_username;
        r45.xk bizInfo = baseFinderFeed.getFeedObject().getBizInfo();
        if (!ya2.g.h(gVar, str, bizInfo != null ? bizInfo.getString(0) : null, false, false, 12, null)) {
            com.tencent.mm.plugin.finder.feed.k8.Q1(this.f104206h, this.f104203e, true, 0, null, 12, null);
            this.f104204f.Q6(this.f104202d, 0, this.f104203e, 2, this.f104206h, null);
            com.tencent.mm.autogen.events.FinderFeedUiActionEvent finderFeedUiActionEvent = new com.tencent.mm.autogen.events.FinderFeedUiActionEvent();
            am.fb fbVar = finderFeedUiActionEvent.f54275g;
            fbVar.f6664b = 10000;
            fbVar.f6663a = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i).getItemId();
            fbVar.f6669g = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i).w();
            finderFeedUiActionEvent.e();
        }
        if (s0Var.getAdapterPosition() == 0) {
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zu2.q qVar = ((zu2.a0) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(zu2.a0.class)).f475694f;
            if (qVar != null) {
                qVar.a();
                qVar.d("follow");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedSnsAdUIC$refreshAdFollow$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d;

/* loaded from: classes4.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe0.l0 f250356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe0.o0 f250357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a f250358f;

    public c0(xe0.l0 l0Var, xe0.o0 o0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a c18248x5f8bb60a) {
        this.f250356d = l0Var;
        this.f250357e = o0Var;
        this.f250358f = c18248x5f8bb60a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xe0.o0 o0Var = this.f250357e;
        xe0.l0 l0Var = this.f250356d;
        ((we0.j1) l0Var).nj("sns_timeline_head_status_icon", "view_clk", o0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a c18248x5f8bb60a = this.f250358f;
        if (((we0.j1) l0Var).tj(c18248x5f8bb60a.m80379x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70872x785f3b2c(c18248x5f8bb60a))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.HeaderUIC", "status span click, showForbidToastWhenNotFoundStatus");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.HeaderUIC", "status span click");
        android.app.Activity m80379x76847179 = c18248x5f8bb60a.m80379x76847179();
        java.lang.String username = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70872x785f3b2c(c18248x5f8bb60a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        we0.j1 j1Var = (we0.j1) l0Var;
        j1Var.sj(m80379x76847179, new bi4.h1(username, 15, 156L, false, false, new bi4.g1(bi4.f1.f102575e, 0L, 2, null), new bi4.i1(0.0f, 0, 3, null), null));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$3");
    }
}

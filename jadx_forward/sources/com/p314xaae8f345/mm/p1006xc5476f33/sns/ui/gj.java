package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class gj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe0.l0 f249969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jj f249970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe0.o0 f249972g;

    public gj(xe0.l0 l0Var, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jj jjVar, java.lang.String str, xe0.o0 o0Var) {
        this.f249969d = l0Var;
        this.f249970e = jjVar;
        this.f249971f = str;
        this.f249972g = o0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsHeaderImprove$setUserName$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.jj jjVar = this.f249970e;
        android.content.Context context = jjVar.getContext();
        xe0.l0 l0Var = this.f249969d;
        java.lang.String username = this.f249971f;
        if (((we0.j1) l0Var).tj(context, username)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsHeader", "status span click, showForbidToastWhenNotFoundStatus");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsHeaderImprove$setUserName$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsHeader", "status span click");
        if (jjVar.getContext() instanceof android.app.Activity) {
            android.content.Context context2 = jjVar.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            bi4.h1 h1Var = new bi4.h1(username, 16, 154L, false, false, new bi4.g1(bi4.f1.f102575e, 0L, 2, null), new bi4.i1(0.0f, 0, 3, null), null);
            ((we0.j1) l0Var).sj((android.app.Activity) context2, h1Var);
            ((we0.j1) l0Var).nj("sns_personal_status_icon", "view_clk", this.f249972g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsHeaderImprove$setUserName$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SnsHeaderImprove$setUserName$1$2");
    }
}

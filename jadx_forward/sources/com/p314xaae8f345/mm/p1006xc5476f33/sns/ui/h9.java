package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class h9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9 f250025d;

    public h9(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9 j9Var) {
        this.f250025d = j9Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9 j9Var = this.f250025d;
        if (!com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.o(j9Var))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightWidget", "click videopath is not exist " + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.o(j9Var));
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
            return;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.p(j9Var) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.p(j9Var).dismiss();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
            j9Var.f251030p = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
        }
        m34.n nVar = new m34.n(j9Var.f251490c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
        j9Var.f251030p = nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$602", "com.tencent.mm.plugin.sns.ui.SightWidget");
        m34.n p17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.p(j9Var);
        java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.o(j9Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$700", "com.tencent.mm.plugin.sns.ui.SightWidget");
        java.lang.String str = j9Var.f251023i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$700", "com.tencent.mm.plugin.sns.ui.SightWidget");
        p17.f404894f = o17;
        p17.f404895g = str;
        m34.n p18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.p(j9Var);
        p18.f404896h = 0;
        p18.f404897i = 0;
        p18.f404898m = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.j9.p(j9Var).show();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.SightWidget$2");
    }
}

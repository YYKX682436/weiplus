package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d;

/* loaded from: classes4.dex */
public final class a0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a f250345d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a c18248x5f8bb60a) {
        this.f250345d = c18248x5f8bb60a;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.app.Activity context = this.f250345d.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd c18246x9a0ff9cd = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2189x2eefaa.C18246x9a0ff9cd.class);
        c18246x9a0ff9cd.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("debugInsertToList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        boolean z17 = false;
        xc4.p n17 = ((zc4.b) c18246x9a0ff9cd.S6().f233598o.get(0)).n();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i17 = 1; i17 < 5; i17++) {
            arrayList2.add(((zc4.b) c18246x9a0ff9cd.S6().f233598o.get(0)).n());
        }
        int i18 = 0;
        for (java.util.Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            xc4.p pVar = new xc4.p();
            pVar.mo9762xbf5d97fd(((xc4.p) next).t0(), z17);
            long j17 = i18;
            pVar.m125487x53b40971(n17.y0() + j17 + 1);
            pVar.f72763xa3c65b86 = n17.f72763xa3c65b86 + j17 + 1;
            pVar.mo125484x6e018feb(n17.m125473x3fdd41df());
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.q(c18246x9a0ff9cd.S6(), new zc4.b(pVar, true), false, 2, null);
            z17 = false;
            i18 = i19;
        }
        db5.t7.m123883x26a183b(c18246x9a0ff9cd.m80379x76847179(), "Debug Mock:InsertToList", z17 ? 1 : 0).show();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("debugInsertToList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadNickName$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLongClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadNickName$2$2");
        return true;
    }
}

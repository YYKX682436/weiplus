package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a f250398d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a c18248x5f8bb60a) {
        this.f250398d = c18248x5f8bb60a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadAvatar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (z65.c.a()) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_TRIGGER_CRASH_INT_SYNC, 0);
            if (r17 == 1) {
                java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("trigger sns crash");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
                throw illegalArgumentException;
            }
            if (r17 == 2) {
                java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("trigger Pag crash:org.libpag.PAGView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
                throw illegalArgumentException2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.p2190xb734e28d.C18248x5f8bb60a.m70877x52c11da4(this.f250398d);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/header/ImproveHeaderUIC$loadAvatar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.header.ImproveHeaderUIC$loadAvatar$2$1");
    }
}

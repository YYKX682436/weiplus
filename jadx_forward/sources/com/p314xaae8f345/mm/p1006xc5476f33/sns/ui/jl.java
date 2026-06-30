package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class jl implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d f251054d;

    public jl(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d) {
        this.f251054d = activityC18078x319f375d;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.Z;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d activityC18078x319f375d = this.f251054d;
        boolean z17 = activityC18078x319f375d.f248814u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1400", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        if (!z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "onListViewScoll %s", java.lang.Integer.valueOf(i17));
        if (i17 == 2) {
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc m45812x9cf0d20b = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b();
            boolean mo45921xfba3e90a = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45921xfba3e90a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            int i19 = activityC18078x319f375d.f248811r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            m45812x9cf0d20b.mo46128x89c4face(mo45921xfba3e90a, i19);
            int mo46127x5f00c26e = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45921xfba3e90a(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45920xf787e91c(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45919xa8e1bf81(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45922x8993ac0d(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45923xa8e20257() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45924x8a78faba(), 705, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45918xf43e41bd(), "MicroMsg.SnsMsgUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1502", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            activityC18078x319f375d.f248811r = mo46127x5f00c26e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1502", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            int i27 = activityC18078x319f375d.f248811r;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1500", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMsgUI", "summer hardcoder sns startPerformance [%s]", java.lang.Integer.valueOf(i27));
        }
        if (absListView.getLastVisiblePosition() != absListView.getCount() - 1) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
            return;
        }
        if ((!activityC18078x319f375d.C || activityC18078x319f375d.B) && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().f() > 0) {
            if (activityC18078x319f375d.B) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Aj().p1();
            }
            activityC18078x319f375d.C = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).t();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).t();
        }
        if (i17 == 0) {
            int count = absListView.getCount();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.bm T6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d);
            T6.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            int i28 = T6.f249488p;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
            if (count < i28) {
                absListView.getCount();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTotalCount", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18078x319f375d.T6(activityC18078x319f375d).mo735xb0dfc7d8(null, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$12", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$12");
    }
}

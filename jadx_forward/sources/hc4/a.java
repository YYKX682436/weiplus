package hc4;

/* loaded from: classes14.dex */
public final class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.AbstractActivityC18202xf0ff5de8 f361890d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.AbstractActivityC18202xf0ff5de8 abstractActivityC18202xf0ff5de8) {
        this.f361890d = abstractActivityC18202xf0ff5de8;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.AbstractActivityC18202xf0ff5de8.f250161r;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.AbstractActivityC18202xf0ff5de8 abstractActivityC18202xf0ff5de8 = this.f361890d;
        abstractActivityC18202xf0ff5de8.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        if (i17 != 0) {
            if ((i17 == 1 || i17 == 2) && !abstractActivityC18202xf0ff5de8.f250171p) {
                abstractActivityC18202xf0ff5de8.f250171p = true;
                abstractActivityC18202xf0ff5de8.f250170o = java.lang.System.currentTimeMillis();
            }
        } else if (abstractActivityC18202xf0ff5de8.f250171p) {
            abstractActivityC18202xf0ff5de8.f250171p = false;
            hc4.e eVar = abstractActivityC18202xf0ff5de8.f250168m;
            eVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long j17 = eVar.f361896c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long currentTimeMillis = j17 + (java.lang.System.currentTimeMillis() - abstractActivityC18202xf0ff5de8.f250170o);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            eVar.f361896c = currentTimeMillis;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
    }
}

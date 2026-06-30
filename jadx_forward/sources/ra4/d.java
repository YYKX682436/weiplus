package ra4;

/* loaded from: classes4.dex */
public class d implements com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f475086d;

    static {
        java.util.regex.Pattern.compile("\\{richtext:([\\s\\S]*?)\\}");
        java.util.regex.Pattern.compile("\\{sex:([\\s\\S]*?):([\\s\\S]*?):([\\s\\S]*?)\\}");
    }

    public d() {
        new java.util.HashMap();
        new java.util.HashSet();
        new java.util.HashSet();
        this.f475086d = new java.util.HashMap();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1
    public void a(int i17, java.lang.String str, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        java.util.HashMap hashMap = this.f475086d;
        if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
            ra4.c cVar = (ra4.c) hashMap.get(java.lang.Long.valueOf(j17));
            if (cVar.f475085a == -1) {
                cVar.f475085a = java.lang.System.currentTimeMillis();
            }
            cVar.getClass();
            cVar.getClass();
            cVar.a(0, 0, 0, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemRemove", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g1
    public void b(int i17, java.lang.String str, long j17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onItemAdd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.AbstractC18285x291d0ca5.BaseViewHolder baseViewHolder) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        if (baseViewHolder == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
            return;
        }
        android.view.ViewStub viewStub = baseViewHolder.f250792a0;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
        android.view.ViewStub viewStub2 = baseViewHolder.f250794b0;
        if (viewStub2 != null) {
            viewStub2.setVisibility(8);
        }
        if (baseViewHolder.f250810j0.getVisibility() == 8) {
            android.view.View view = baseViewHolder.f250810j0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (baseViewHolder.f250807i.getVisibility() == 8) {
            baseViewHolder.f250807i.setVisibility(0);
        }
        if (baseViewHolder.f250805h.getVisibility() == 8) {
            android.view.View view2 = baseViewHolder.f250805h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/newabtest/SnSABTestMgr", "dismissAbTestView", "(Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem$BaseViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dismissAbTestView", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnSABTestMgr", "onSceneend " + i17 + " errCode " + i18);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5771x7d3761c6().e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.newabtest.SnSABTestMgr");
    }
}

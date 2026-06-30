package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class on extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.rn f108668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on(com.tencent.mm.plugin.finder.feed.rn rnVar) {
        super(1);
        this.f108668d = rnVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View findViewById;
        com.tencent.mm.plugin.finder.feed.rn rnVar = this.f108668d;
        com.tencent.mm.plugin.finder.feed.hn hnVar = rnVar.f108929e;
        hnVar.f106935g = null;
        hnVar.g(false, 1);
        if (rnVar.f108929e.f106936h.size() == 0 && (findViewById = rnVar.f108928d.findViewById(com.tencent.mm.R.id.f484229dg3)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = rnVar.f108930f;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.setVisibility(8);
            android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.lbi);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderPoiManageUIContract$PoiManageViewCallback", "startLoadingByInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

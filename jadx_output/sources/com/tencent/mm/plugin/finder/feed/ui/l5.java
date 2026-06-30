package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI f110257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI) {
        super(1);
        this.f110257d = finderHorizontalVideoHalfFeedUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.getHasMore()) {
            com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI finderHorizontalVideoHalfFeedUI = this.f110257d;
            com.tencent.mm.plugin.finder.feed.xb xbVar = finderHorizontalVideoHalfFeedUI.f109293y;
            if (xbVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = xbVar.o().getF213435x();
            android.view.View findViewById = f213435x != null ? f213435x.findViewById(com.tencent.mm.R.id.m6l) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.xb xbVar2 = finderHorizontalVideoHalfFeedUI.f109293y;
            if (xbVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = xbVar2.o().getF213435x();
            android.view.View findViewById2 = f213435x2 != null ? f213435x2.findViewById(com.tencent.mm.R.id.ile) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view = findViewById2;
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderHorizontalVideoHalfFeedUI$initOnCreate$3$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

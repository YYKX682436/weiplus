package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI f110254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
        super(1);
        this.f110254d = finderFeedRelatedTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI = this.f110254d;
        android.view.View view = finderFeedRelatedTimelineUI.H;
        if (view == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$4", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (it instanceof com.tencent.mm.plugin.finder.feed.model.m1) {
            java.lang.String str = ((com.tencent.mm.plugin.finder.feed.model.m1) it).f108172a;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                finderFeedRelatedTimelineUI.E = str;
                finderFeedRelatedTimelineUI.setMMTitle(str);
            }
        }
        return jz5.f0.f302826a;
    }
}

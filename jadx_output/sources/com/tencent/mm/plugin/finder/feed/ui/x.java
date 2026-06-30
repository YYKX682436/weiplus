package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1 f110713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI f110714e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI$feedLoader$2$1 finderAlbumTimelineUI$feedLoader$2$1, com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI) {
        super(1);
        this.f110713d = finderAlbumTimelineUI$feedLoader$2$1;
        this.f110714e = finderAlbumTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse resp = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(resp, "resp");
        int size = getSize();
        com.tencent.mm.plugin.finder.feed.ui.FinderAlbumTimelineUI finderAlbumTimelineUI = this.f110714e;
        if (size == 0) {
            android.view.View findViewById = finderAlbumTimelineUI.findViewById(com.tencent.mm.R.id.f484219df1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById2 = finderAlbumTimelineUI.findViewById(com.tencent.mm.R.id.f484219df1);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/FinderAlbumTimelineUI$initOnCreate$3$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

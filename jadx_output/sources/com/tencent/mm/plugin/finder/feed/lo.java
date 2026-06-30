package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.no f107316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(com.tencent.mm.plugin.finder.feed.no noVar) {
        super(0);
        this.f107316d = noVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view;
        com.tencent.mm.plugin.finder.feed.to toVar = this.f107316d.f108588e;
        android.view.View findViewById = (toVar == null || (view = toVar.f109098o) == null) ? null : view.findViewById(com.tencent.mm.R.id.ilh);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter$loadMoreData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderPostPlaySquareContainerContract$Presenter$loadMoreData$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

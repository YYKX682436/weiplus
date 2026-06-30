package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class yf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.dg f110770d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(com.tencent.mm.plugin.finder.feed.ui.dg dgVar) {
        super(0);
        this.f110770d = dgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f110770d.f106424g;
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = i0Var instanceof com.tencent.mm.plugin.finder.feed.ui.lg ? (com.tencent.mm.plugin.finder.feed.ui.lg) i0Var : null;
        if (lgVar != null && (findViewById = lgVar.f106968d.findViewById(com.tencent.mm.R.id.imn)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onBeginInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onBeginInit", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

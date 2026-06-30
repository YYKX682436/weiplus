package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class kj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.xj f107219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj(com.tencent.mm.plugin.finder.feed.xj xjVar) {
        super(0);
        this.f107219d = xjVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f107219d.f111072a.findViewById(com.tencent.mm.R.id.frr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$endHintLayout$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/FinderLongVideoRelViewCallback$endHintLayout$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return findViewById;
    }
}

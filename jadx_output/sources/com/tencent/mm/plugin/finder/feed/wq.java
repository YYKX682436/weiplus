package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wq extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.kr f111004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(com.tencent.mm.plugin.finder.feed.kr krVar) {
        super(1);
        this.f111004d = krVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.xr xrVar = this.f111004d.f107247x;
        if (xrVar != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = xrVar.f111098g;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            android.view.View f213435x = refreshLoadMoreLayout.getF213435x();
            if (f213435x != null && (textView = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setText(com.tencent.mm.R.string.f491896el3);
            }
            android.view.View f213435x2 = refreshLoadMoreLayout.getF213435x();
            android.widget.TextView textView2 = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            android.view.View f213435x3 = refreshLoadMoreLayout.getF213435x();
            android.view.View findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback", "onFetchEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

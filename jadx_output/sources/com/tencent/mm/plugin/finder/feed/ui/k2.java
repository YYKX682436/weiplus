package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI f110210d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI) {
        super(1);
        this.f110210d = finderFeedRelatedTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelatedTimelineUI finderFeedRelatedTimelineUI = this.f110210d;
        android.view.View view = finderFeedRelatedTimelineUI.H;
        if (view == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.feed.o9 o9Var = finderFeedRelatedTimelineUI.f109241z;
        if (o9Var == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        android.view.View f213435x = o9Var.o().getF213435x();
        if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.plugin.finder.feed.o9 o9Var2 = finderFeedRelatedTimelineUI.f109241z;
        if (o9Var2 == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        android.view.View f213435x2 = o9Var2.o().getF213435x();
        if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setTextColor(finderFeedRelatedTimelineUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        com.tencent.mm.plugin.finder.feed.o9 o9Var3 = finderFeedRelatedTimelineUI.f109241z;
        if (o9Var3 == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        android.view.View f213435x3 = o9Var3.o().getF213435x();
        android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.feed.o9 o9Var4 = finderFeedRelatedTimelineUI.f109241z;
        if (o9Var4 == null) {
            kotlin.jvm.internal.o.o("mViewCallback");
            throw null;
        }
        android.view.View f213435x4 = o9Var4.o().getF213435x();
        android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderFeedRelatedTimelineUI$initOnCreate$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

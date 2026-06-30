package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class bi extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader f109709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPlayTimelineUI f109710e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader, com.tencent.mm.plugin.finder.feed.ui.FinderPostPlayTimelineUI finderPostPlayTimelineUI) {
        super(1);
        this.f109709d = finderPostPlayLoader;
        this.f109710e = finderPostPlayTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.w5 it = (com.tencent.mm.plugin.finder.feed.model.w5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!this.f109709d.f107564i) {
            com.tencent.mm.plugin.finder.feed.ui.FinderPostPlayTimelineUI finderPostPlayTimelineUI = this.f109710e;
            com.tencent.mm.plugin.finder.feed.wo woVar = finderPostPlayTimelineUI.f109498y;
            if (woVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = woVar.o().getF213435x();
            if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.plugin.finder.feed.wo woVar2 = finderPostPlayTimelineUI.f109498y;
            if (woVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = woVar2.o().getF213435x();
            if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(finderPostPlayTimelineUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            com.tencent.mm.plugin.finder.feed.wo woVar3 = finderPostPlayTimelineUI.f109498y;
            if (woVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = woVar3.o().getF213435x();
            android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.feed.wo woVar4 = finderPostPlayTimelineUI.f109498y;
            if (woVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = woVar4.o().getF213435x();
            android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlayTimelineUI$createFeedLoader$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderPostPlayTimelineUI$createFeedLoader$1$3", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderPostPlayLoader$FinderPostPlayLoaderResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

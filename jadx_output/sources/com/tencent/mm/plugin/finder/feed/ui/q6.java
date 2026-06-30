package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class q6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamFeedUI f110445d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamFeedUI finderLbsStreamFeedUI) {
        super(1);
        this.f110445d = finderLbsStreamFeedUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamFeedUI finderLbsStreamFeedUI = this.f110445d;
        com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = finderLbsStreamFeedUI.f109311v;
        if (baseFinderFeedLoader == null) {
            kotlin.jvm.internal.o.o("feedLoader");
            throw null;
        }
        if (((com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader) baseFinderFeedLoader).f107471f != 0) {
            com.tencent.mm.plugin.finder.feed.ec ecVar = finderLbsStreamFeedUI.f109310u;
            if (ecVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View view = ecVar.f106185r;
            android.widget.TextView textView3 = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f484050cu2) : null;
            if (textView3 != null) {
                android.content.res.Resources resources = finderLbsStreamFeedUI.getContext().getResources();
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader2 = finderLbsStreamFeedUI.f109311v;
                if (baseFinderFeedLoader2 == null) {
                    kotlin.jvm.internal.o.o("feedLoader");
                    throw null;
                }
                textView3.setText(resources.getString(com.tencent.mm.R.string.cuu, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.feed.model.FinderLbsStreamFeedLoader) baseFinderFeedLoader2).f107471f)));
            }
        }
        if (!((com.tencent.mm.plugin.finder.feed.model.x2) it).getHasMore()) {
            com.tencent.mm.plugin.finder.feed.ec ecVar2 = finderLbsStreamFeedUI.f109310u;
            if (ecVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = ecVar2.f106180m.getF213435x();
            if (f213435x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.ec ecVar3 = finderLbsStreamFeedUI.f109310u;
            if (ecVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = ecVar3.f106180m.getF213435x();
            if (f213435x2 != null && (textView2 = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.plugin.finder.feed.ec ecVar4 = finderLbsStreamFeedUI.f109310u;
            if (ecVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = ecVar4.f106180m.getF213435x();
            if (f213435x3 != null && (textView = (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(finderLbsStreamFeedUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            com.tencent.mm.plugin.finder.feed.ec ecVar5 = finderLbsStreamFeedUI.f109310u;
            if (ecVar5 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = ecVar5.f106180m.getF213435x();
            android.widget.TextView textView4 = f213435x4 != null ? (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.feed.ec ecVar6 = finderLbsStreamFeedUI.f109310u;
            if (ecVar6 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x5 = ecVar6.f106180m.getF213435x();
            android.view.View findViewById = f213435x5 != null ? f213435x5.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamFeedUI$initOnCreate$1$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

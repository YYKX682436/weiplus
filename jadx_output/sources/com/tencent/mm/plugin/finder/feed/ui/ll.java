package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ll extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader f110280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI f110281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader finderProfileFeedLoader, com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI finderSnsGridFeedUI) {
        super(1);
        this.f110280d = finderProfileFeedLoader;
        this.f110281e = finderSnsGridFeedUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View findViewById;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!((com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader.ProfileResponse) it).getHasMore() && this.f110280d.getDataListJustForAdapter().size() != 0) {
            com.tencent.mm.plugin.finder.feed.ui.FinderSnsGridFeedUI finderSnsGridFeedUI = this.f110281e;
            com.tencent.mm.plugin.finder.feed.xs xsVar = finderSnsGridFeedUI.f109553u;
            if (xsVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = xsVar.f106180m.getF213435x();
            if (f213435x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.feed.xs xsVar2 = finderSnsGridFeedUI.f109553u;
            if (xsVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = xsVar2.f106180m.getF213435x();
            android.widget.TextView textView = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.feed.xs xsVar3 = finderSnsGridFeedUI.f109553u;
            if (xsVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = xsVar3.f106180m.getF213435x();
            if (f213435x3 != null && (findViewById = f213435x3.findViewById(com.tencent.mm.R.id.ilg)) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderSnsGridFeedUI$initOnCreate$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int argb = android.graphics.Color.argb(13, 255, 255, 255);
                findViewById.findViewById(com.tencent.mm.R.id.bdv).setBackground(finderSnsGridFeedUI.getDrawable(com.tencent.mm.R.drawable.f481636yq));
                findViewById.findViewById(com.tencent.mm.R.id.i0a).setBackgroundColor(argb);
                findViewById.findViewById(com.tencent.mm.R.id.m3v).setBackgroundColor(argb);
            }
        }
        return jz5.f0.f302826a;
    }
}

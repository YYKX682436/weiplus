package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class lk extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader f110278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryTimeLineUI f110279e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(com.tencent.mm.plugin.finder.feed.model.FinderSelfHistoryLoader finderSelfHistoryLoader, com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryTimeLineUI finderSelfHistoryTimeLineUI) {
        super(1);
        this.f110278d = finderSelfHistoryLoader;
        this.f110279e = finderSelfHistoryTimeLineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.w7 it = (com.tencent.mm.plugin.finder.feed.model.w7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!this.f110278d.f107645f) {
            com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryTimeLineUI finderSelfHistoryTimeLineUI = this.f110279e;
            com.tencent.mm.plugin.finder.feed.ts tsVar = finderSelfHistoryTimeLineUI.f109543y;
            if (tsVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = tsVar.o().getF213435x();
            if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.plugin.finder.feed.ts tsVar2 = finderSelfHistoryTimeLineUI.f109543y;
            if (tsVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = tsVar2.o().getF213435x();
            if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(finderSelfHistoryTimeLineUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            com.tencent.mm.plugin.finder.feed.ts tsVar3 = finderSelfHistoryTimeLineUI.f109543y;
            if (tsVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = tsVar3.o().getF213435x();
            android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.feed.ts tsVar4 = finderSelfHistoryTimeLineUI.f109543y;
            if (tsVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = tsVar4.o().getF213435x();
            android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryTimeLineUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryTimeLineUI$createFeedLoader$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class hk extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment f110125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment finderSelfHistoryContentFragment) {
        super(1);
        this.f110125d = finderSelfHistoryContentFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.w7 it = (com.tencent.mm.plugin.finder.feed.model.w7) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderSelfHistoryContentFragment finderSelfHistoryContentFragment = this.f110125d;
        if (finderSelfHistoryContentFragment.isAdded()) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback = finderSelfHistoryContentFragment.f109540w;
            if (playHistoryViewCallback == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = playHistoryViewCallback.f106180m.getF213435x();
            if (f213435x != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryContentFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryContentFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback2 = finderSelfHistoryContentFragment.f109540w;
            if (playHistoryViewCallback2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = playHistoryViewCallback2.f106180m.getF213435x();
            android.widget.TextView textView = f213435x2 != null ? (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback3 = finderSelfHistoryContentFragment.f109540w;
            if (playHistoryViewCallback3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = playHistoryViewCallback3.f106180m.getF213435x();
            android.view.View findViewById = f213435x3 != null ? f213435x3.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryContentFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfHistoryContentFragment$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/FinderSelfHistoryLoader$SelfHistoryResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderSelfHistoryContract.PlayHistoryViewCallback playHistoryViewCallback4 = finderSelfHistoryContentFragment.f109540w;
            if (playHistoryViewCallback4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = playHistoryViewCallback4.f106180m.getF213435x();
            android.widget.TextView textView2 = f213435x4 != null ? (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.q0e) : null;
            if (textView2 != null) {
                textView2.setText(finderSelfHistoryContentFragment.getResources().getString(com.tencent.mm.R.string.man, java.lang.String.valueOf(it.f108433a)));
            }
        }
        return jz5.f0.f302826a;
    }
}

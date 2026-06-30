package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class lt extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f107326d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt(com.tencent.mm.plugin.finder.feed.yt ytVar) {
        super(1);
        this.f107326d = ytVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View f213435x;
        android.view.View f213435x2;
        android.view.View f213435x3;
        android.widget.TextView textView;
        android.view.View f213435x4;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f107326d;
        if (ytVar.g().getDataListJustForAdapter().size() > 4) {
            com.tencent.mm.view.RefreshLoadMoreLayout f17 = ytVar.h().f();
            android.view.View view = null;
            android.view.View f213435x5 = f17 != null ? f17.getF213435x() : null;
            if (f213435x5 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f213435x5, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f213435x5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f213435x5, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.view.RefreshLoadMoreLayout f18 = ytVar.h().f();
            if (f18 != null && (f213435x4 = f18.getF213435x()) != null && (textView2 = (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout f19 = ytVar.h().f();
            if (f19 != null && (f213435x3 = f19.getF213435x()) != null && (textView = (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(ytVar.f111197d.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            com.tencent.mm.view.RefreshLoadMoreLayout f27 = ytVar.h().f();
            android.widget.TextView textView3 = (f27 == null || (f213435x2 = f27.getF213435x()) == null) ? null : (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.tencent.mm.view.RefreshLoadMoreLayout f28 = ytVar.h().f();
            if (f28 != null && (f213435x = f28.getF213435x()) != null) {
                view = f213435x.findViewById(com.tencent.mm.R.id.ilg);
            }
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = view;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/FinderTimelineLbsMixPresenter$onAttach$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class pj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI f110425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj(com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI finderRelatedTimelineUI) {
        super(1);
        this.f110425d = finderRelatedTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderRelatedTimelineUI finderRelatedTimelineUI = this.f110425d;
        com.tencent.mm.plugin.finder.feed.js jsVar = finderRelatedTimelineUI.f109532z;
        if (jsVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x = jsVar.o().getF213435x();
        if (f213435x != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(f213435x, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f213435x.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(f213435x, "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.feed.js jsVar2 = finderRelatedTimelineUI.f109532z;
        if (jsVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x2 = jsVar2.o().getF213435x();
        if (f213435x2 != null && (textView2 = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.plugin.finder.feed.js jsVar3 = finderRelatedTimelineUI.f109532z;
        if (jsVar3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x3 = jsVar3.o().getF213435x();
        if (f213435x3 != null && (textView = (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setTextColor(finderRelatedTimelineUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        com.tencent.mm.plugin.finder.feed.js jsVar4 = finderRelatedTimelineUI.f109532z;
        if (jsVar4 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x4 = jsVar4.o().getF213435x();
        android.widget.TextView textView3 = f213435x4 != null ? (android.widget.TextView) f213435x4.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.feed.js jsVar5 = finderRelatedTimelineUI.f109532z;
        if (jsVar5 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x5 = jsVar5.o().getF213435x();
        android.view.View findViewById = f213435x5 != null ? f213435x5.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderRelatedTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

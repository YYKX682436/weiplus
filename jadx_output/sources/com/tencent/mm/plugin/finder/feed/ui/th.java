package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class th extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader f110571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI f110572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f110573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(com.tencent.mm.plugin.finder.feed.model.FinderPoiTimelineLoader finderPoiTimelineLoader, com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI finderPoiTimelineUI, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f110571d = finderPoiTimelineLoader;
        this.f110572e = finderPoiTimelineUI;
        this.f110573f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.feed.ui.th(this.f110571d, this.f110572e, this.f110573f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.feed.ui.th thVar = (com.tencent.mm.plugin.finder.feed.ui.th) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        thVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f110571d.getClass();
        com.tencent.mm.plugin.finder.feed.ui.FinderPoiTimelineUI finderPoiTimelineUI = this.f110572e;
        android.view.View view = finderPoiTimelineUI.A;
        if (view == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.finder.feed.go goVar = finderPoiTimelineUI.f109488y;
        if (goVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x = goVar.o().getF213435x();
        if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.plugin.finder.feed.go goVar2 = finderPoiTimelineUI.f109488y;
        if (goVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x2 = goVar2.o().getF213435x();
        if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setTextColor(this.f110573f);
        }
        com.tencent.mm.plugin.finder.feed.go goVar3 = finderPoiTimelineUI.f109488y;
        if (goVar3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x3 = goVar3.o().getF213435x();
        android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.feed.go goVar4 = finderPoiTimelineUI.f109488y;
        if (goVar4 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x4 = goVar4.o().getF213435x();
        android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderPoiTimelineUI$initOnCreate$1$3$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

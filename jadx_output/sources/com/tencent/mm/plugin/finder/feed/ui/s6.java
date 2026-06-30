package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class s6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI f110525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI finderLbsStreamListUI) {
        super(0);
        this.f110525d = finderLbsStreamListUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI finderLbsStreamListUI = this.f110525d;
        com.tencent.mm.plugin.finder.feed.ic icVar = finderLbsStreamListUI.f109315y;
        if (icVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x = icVar.o().getF213435x();
        if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.plugin.finder.feed.ic icVar2 = finderLbsStreamListUI.f109315y;
        if (icVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x2 = icVar2.o().getF213435x();
        if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setTextColor(finderLbsStreamListUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        com.tencent.mm.plugin.finder.feed.ic icVar3 = finderLbsStreamListUI.f109315y;
        if (icVar3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x3 = icVar3.o().getF213435x();
        android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.feed.ic icVar4 = finderLbsStreamListUI.f109315y;
        if (icVar4 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x4 = icVar4.o().getF213435x();
        android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view = findViewById;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

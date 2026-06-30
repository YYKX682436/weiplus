package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class rn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        super(0);
        this.f110509d = finderTopicTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = this.f110509d;
        com.tencent.mm.plugin.finder.feed.v20 v20Var = finderTopicTimelineUI.E;
        if (v20Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x = v20Var.o().getF213435x();
        if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView2.setText(com.tencent.mm.R.string.f491896el3);
        }
        com.tencent.mm.plugin.finder.feed.v20 v20Var2 = finderTopicTimelineUI.E;
        if (v20Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x2 = v20Var2.o().getF213435x();
        if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setTextColor(finderTopicTimelineUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
        com.tencent.mm.plugin.finder.feed.v20 v20Var3 = finderTopicTimelineUI.E;
        if (v20Var3 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.view.View f213435x3 = v20Var3.o().getF213435x();
        android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.feed.v20 v20Var4 = finderTopicTimelineUI.E;
        if (v20Var4 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout.I(v20Var4.o(), null, 1, null);
        com.tencent.mm.plugin.finder.feed.v20 v20Var5 = finderTopicTimelineUI.E;
        if (v20Var5 != null) {
            com.tencent.mm.view.RefreshLoadMoreLayout.r(v20Var5.o(), false, null, com.tencent.mm.plugin.finder.feed.ui.qn.f110464d, 3, null);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }
}

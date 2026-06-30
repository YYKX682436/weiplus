package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.IResponse f110788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI f110789e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI finderFollowTimelineUI) {
        super(0);
        this.f110788d = iResponse;
        this.f110789e = finderFollowTimelineUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        if (!this.f110788d.getHasMore()) {
            com.tencent.mm.plugin.finder.feed.ui.FinderFollowTimelineUI finderFollowTimelineUI = this.f110789e;
            com.tencent.mm.plugin.finder.feed.cb cbVar = finderFollowTimelineUI.f109252y;
            if (cbVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = cbVar.o().getF213435x();
            if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            com.tencent.mm.plugin.finder.feed.cb cbVar2 = finderFollowTimelineUI.f109252y;
            if (cbVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = cbVar2.o().getF213435x();
            if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(finderFollowTimelineUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            com.tencent.mm.plugin.finder.feed.cb cbVar3 = finderFollowTimelineUI.f109252y;
            if (cbVar3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = cbVar3.o().getF213435x();
            android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.feed.cb cbVar4 = finderFollowTimelineUI.f109252y;
            if (cbVar4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = cbVar4.o().getF213435x();
            android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

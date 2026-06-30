package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI f109690d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI bizProfileTimelineUI) {
        super(1);
        this.f109690d = bizProfileTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse it = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (!it.getHasMore()) {
            com.tencent.mm.plugin.finder.feed.ui.BizProfileTimelineUI bizProfileTimelineUI = this.f109690d;
            ab2.h0 h0Var = bizProfileTimelineUI.f109196y;
            if (h0Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x = h0Var.o().getF213435x();
            if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView2.setText(com.tencent.mm.R.string.f491896el3);
            }
            ab2.h0 h0Var2 = bizProfileTimelineUI.f109196y;
            if (h0Var2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x2 = h0Var2.o().getF213435x();
            if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                textView.setTextColor(bizProfileTimelineUI.getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            ab2.h0 h0Var3 = bizProfileTimelineUI.f109196y;
            if (h0Var3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x3 = h0Var3.o().getF213435x();
            android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            ab2.h0 h0Var4 = bizProfileTimelineUI.f109196y;
            if (h0Var4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            android.view.View f213435x4 = h0Var4.o().getF213435x();
            android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                android.view.View view = findViewById;
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/BizProfileTimelineUI$initOnCreate$1$2", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/IResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return jz5.f0.f302826a;
    }
}

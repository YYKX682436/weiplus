package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class bg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.dg f109707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f109708e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(com.tencent.mm.plugin.finder.feed.ui.dg dgVar, ym5.s3 s3Var) {
        super(0);
        this.f109707d = dgVar;
        this.f109708e = s3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.tencent.mm.plugin.finder.feed.i0 i0Var = this.f109707d.f106424g;
        com.tencent.mm.plugin.finder.feed.ui.lg lgVar = i0Var instanceof com.tencent.mm.plugin.finder.feed.ui.lg ? (com.tencent.mm.plugin.finder.feed.ui.lg) i0Var : null;
        if (lgVar != null) {
            ym5.s3 reason = this.f109708e;
            kotlin.jvm.internal.o.g(reason, "reason");
            lgVar.o().setEnableLoadMore(reason.f463521f);
            if (!reason.f463521f) {
                android.view.View f213435x = lgVar.o().getF213435x();
                if (f213435x != null && (textView2 = (android.widget.TextView) f213435x.findViewById(com.tencent.mm.R.id.ili)) != null) {
                    textView2.setText(com.tencent.mm.R.string.f491896el3);
                }
                android.view.View f213435x2 = lgVar.o().getF213435x();
                if (f213435x2 != null && (textView = (android.widget.TextView) f213435x2.findViewById(com.tencent.mm.R.id.ili)) != null) {
                    textView.setTextColor(lgVar.f106968d.getResources().getColor(com.tencent.mm.R.color.FG_2));
                }
                android.view.View f213435x3 = lgVar.o().getF213435x();
                android.widget.TextView textView3 = f213435x3 != null ? (android.widget.TextView) f213435x3.findViewById(com.tencent.mm.R.id.ili) : null;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                android.view.View f213435x4 = lgVar.o().getF213435x();
                android.view.View findViewById = f213435x4 != null ? f213435x4.findViewById(com.tencent.mm.R.id.ilg) : null;
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view = findViewById;
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback", "onLoadMoreEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = lgVar.getRecyclerView();
            recyclerView.post(new com.tencent.mm.plugin.finder.feed.ui.gg(recyclerView, lgVar));
        }
        return jz5.f0.f302826a;
    }
}

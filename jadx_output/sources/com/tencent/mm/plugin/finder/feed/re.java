package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes.dex */
public final class re implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f108904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z35 f108905e;

    public re(com.tencent.mm.plugin.finder.feed.af afVar, r45.z35 z35Var) {
        this.f108904d = afVar;
        this.f108905e = z35Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$setTopRightBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f108905e.getString(1));
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(this.f108904d.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$setTopRightBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

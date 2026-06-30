package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class lb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI f110265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.n01 f110266e;

    public lb(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI, r45.n01 n01Var) {
        this.f110265d = finderLivePostSecurityUI;
        this.f110266e = n01Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI finderLivePostSecurityUI = this.f110265d;
        java.lang.String str = finderLivePostSecurityUI.f109396v;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appealView click, url = ");
        r45.n01 n01Var = this.f110266e;
        sb6.append(n01Var.getString(6));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327957j2, finderLivePostSecurityUI.f7("160"), null, "160", null, null, false, 116, null);
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nk("161", com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI.g7(finderLivePostSecurityUI, null, null, 3, null));
        java.lang.String string = n01Var.getString(6);
        if (string != null) {
            com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSecurityUI.d7(finderLivePostSecurityUI, string);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLivePostSecurityUI$initContentView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class uc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.kd f110603d;

    public uc(com.tencent.mm.plugin.finder.feed.ui.kd kdVar) {
        this.f110603d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.feed.ui.kd kdVar = this.f110603d;
        kdVar.getClass();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_CHARGE_ANCHOR_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            kdVar.i0();
        } else {
            dt2.d dVar = new dt2.d(kdVar.f118183e, true, false, 0L);
            java.lang.String string = dVar.getContext().getResources().getString(com.tencent.mm.R.string.d9m);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = dVar.getContext().getResources().getString(com.tencent.mm.R.string.d9h);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            dVar.b(false, string, string2, new com.tencent.mm.plugin.finder.feed.ui.xc(kdVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class uc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd f192136d;

    public uc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar) {
        this.f192136d = kdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.kd kdVar = this.f192136d;
        kdVar.getClass();
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_CHARGE_ANCHOR_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            kdVar.i0();
        } else {
            dt2.d dVar = new dt2.d(kdVar.f199716e, true, false, 0L);
            java.lang.String string = dVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9m);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String string2 = dVar.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d9h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            dVar.b(false, string, string2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.xc(kdVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVisibilityModeConfigPanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

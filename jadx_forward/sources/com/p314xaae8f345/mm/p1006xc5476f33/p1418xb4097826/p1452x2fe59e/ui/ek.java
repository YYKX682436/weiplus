package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class ek implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14087x8f524d64 f191520d;

    public ek(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14087x8f524d64 activityC14087x8f524d64) {
        this.f191520d = activityC14087x8f524d64;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderSelfAggregationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14087x8f524d64 activityC14087x8f524d64 = this.f191520d;
        android.content.Intent from = activityC14087x8f524d64.getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        pm0.v.g(intent, from, "KEY_MIX_SEARCH_CUR_TAB", 7);
        pm0.v.g(intent, from, "KEY_MIX_SEARCH_MIX_SUB_TAB", 7);
        pm0.v.g(intent, from, "KEY_MIX_SEARCH_HISTORY_SUB_TAB", 7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14087x8f524d64.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, mo55332x76847179, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC14087x8f524d64.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        i0Var.Wj(mo55332x768471792, intent, 15, new java.util.ArrayList());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderSelfAggregationUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

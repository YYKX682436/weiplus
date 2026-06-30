package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 f183474d;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var) {
        this.f183474d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.c1 c1Var = this.f183474d;
        java.lang.Object clone = c1Var.m158359x1e885992().clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type android.content.Intent");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderActivityPostUIC", "cancelActivity");
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c1Var.m158354x19263085();
        m158354x19263085.setResult(-1, (android.content.Intent) clone);
        if (!m158354x19263085.isFinishing()) {
            m158354x19263085.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/uic/FinderActivityPostUIC$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

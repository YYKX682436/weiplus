package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2;

/* loaded from: classes.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 f203801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203802e;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1602x700681d2.l0 l0Var, java.lang.String str) {
        this.f203801d = l0Var;
        this.f203802e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context l17 = this.f203801d.l();
        pf5.z zVar = pf5.z.f435481a;
        if (!(l17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nr2.u0 u0Var = (nr2.u0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) l17).e(nr2.u0.class);
        if (u0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            u0Var.O6(view, this.f203802e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder$setPlayListHeader$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

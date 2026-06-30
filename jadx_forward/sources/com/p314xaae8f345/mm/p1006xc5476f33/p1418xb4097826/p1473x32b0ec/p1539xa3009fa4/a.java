package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b f198401d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b bVar) {
        this.f198401d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b bVar = this.f198401d;
        r45.xl6 xl6Var = bVar.f198448i;
        if (xl6Var != null && (m75945x2fec8307 = xl6Var.m75945x2fec8307(0)) != null) {
            pm0.z.b(xy2.b.f539688b, "AUTH_ERROR_4", false, null, null, false, false, null, 124, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.f198443d, "returnBack -4");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w7.f184189a.e(-4, m75945x2fec8307);
        }
        bVar.m158354x19263085().finish();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameFinishUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

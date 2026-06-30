package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class xa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb f198337d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.a52 f198338e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c52 f198339f;

    public xa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar, r45.a52 a52Var, r45.c52 c52Var) {
        this.f198337d = gbVar;
        this.f198338e = a52Var;
        this.f198339f = c52Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.gb gbVar = this.f198337d;
        wt2.a aVar = gbVar.R;
        if (aVar != null) {
            wt2.a.m4(aVar, this.f198338e, null, 2, null);
        }
        wt2.a aVar2 = gbVar.R;
        if (aVar2 != null && (q57 = aVar2.q5()) != null) {
            bf2.c cVar = bf2.c.f101131a;
            java.lang.String m75945x2fec8307 = this.f198339f.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            bf2.c.b(cVar, q57, 3, 3, m75945x2fec8307, 0, 16, null);
        }
        gbVar.s(true);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLivePromoteAddWidget$getItemView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

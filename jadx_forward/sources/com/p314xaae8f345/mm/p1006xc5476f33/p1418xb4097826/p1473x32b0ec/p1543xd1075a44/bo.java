package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class bo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e f199445d;

    public bo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e) {
        this.f199445d = c14402x32faa68e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveLocSingleTagLayout$updateTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14402x32faa68e c14402x32faa68e = this.f199445d;
        int indexOfChild = c14402x32faa68e.indexOfChild(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ao onTagClickListener = c14402x32faa68e.getOnTagClickListener();
        if (onTagClickListener != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ir irVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ir) onTagClickListener;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mr mrVar = irVar.f200225a;
            mrVar.h0(3);
            r45.c64 c64Var = (r45.c64) kz5.n0.a0(irVar.f200226b, indexOfChild);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTagClick] name = ");
            sb6.append(c64Var != null ? c64Var.f452844e : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mrVar.I, sb6.toString());
            r45.ze2 ze2Var = irVar.f200227c;
            if (c64Var != null) {
                ze2Var.set(3, c64Var.f452844e);
                ze2Var.set(5, c64Var.f452843d);
            }
            mrVar.f200646x1 = ze2Var;
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) mrVar.H.a(mm2.g1.class)).f410606n).k(ze2Var);
            mrVar.g0(ze2Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLocSingleTagLayout$updateTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

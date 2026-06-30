package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class ke implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f210966d;

    public ke(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949) {
        this.f210966d = activityC15059x3e98c949;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f210966d;
        ym5.n6 n6Var = activityC15059x3e98c949.B1;
        if (n6Var != null) {
            l45.n nVar = (l45.n) n6Var.m177317xc879b3f2();
            nVar.getClass();
            new l45.a(nVar).a(qk.g6.TEXT);
            n6Var.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.je(n6Var, activityC15059x3e98c949), 350L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSelectCoverUI$initCropLayout$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

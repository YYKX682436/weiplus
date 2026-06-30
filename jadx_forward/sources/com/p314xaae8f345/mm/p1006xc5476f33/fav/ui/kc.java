package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class kc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc f182766d;

    public kc(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.nc ncVar) {
        this.f182766d = ncVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/PhotoTransControl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        o72.e5 e5Var = this.f182766d.f182836e;
        if (e5Var != null) {
            e5Var.x2();
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0 c5227x1de104c0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0();
        am.r1 r1Var = c5227x1de104c0.f135560g;
        r1Var.f89290a = 1;
        r1Var.f89291b = this.f182766d.f182834c;
        c5227x1de104c0.f135560g.getClass();
        c5227x1de104c0.e();
        this.f182766d.b();
        this.f182766d.f182834c = 0;
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/PhotoTransControl$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

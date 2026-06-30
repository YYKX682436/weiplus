package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class l8 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f168391d;

    public l8(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        this.f168391d = n7Var;
    }

    public final void a(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168391d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46 abstractC12800x5824e46 = n7Var.Q1;
        if (abstractC12800x5824e46 == null || abstractC12800x5824e46.mo53619x7444f759() == 0) {
            return;
        }
        n7Var.Q1.g1();
        n7Var.R1.showAsDropDown(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.e(n7Var.mo48798x74292566(), n7Var.X1(), 21, "", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1(), 1, 0);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168391d;
        if (wa1.b.a(n7Var.mo32091x9a3f0ba2())) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (n7Var.mo32091x9a3f0ba2().e3()) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y0.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandTaskView is enable");
            if (n7Var.Z1.getAndSet(true)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.F3(n7Var, view, true, 1);
            } else {
                n7Var.m4(view, 1);
            }
            yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewWC", "AppBrandTaskView is disable");
        if (n7Var.Y1.getAndSet(true)) {
            a(view);
        } else {
            n7Var.n4();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.AbstractC12800x5824e46 abstractC12800x5824e46 = n7Var.Q1;
            if (abstractC12800x5824e46 != null) {
                abstractC12800x5824e46.m53625xbbdb1bed(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k8(this, view));
                n7Var.Q1.g1();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/appbrand/page/AppBrandPageViewWC$8", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

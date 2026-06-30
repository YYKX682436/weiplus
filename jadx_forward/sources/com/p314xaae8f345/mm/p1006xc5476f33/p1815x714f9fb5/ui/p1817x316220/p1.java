package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* loaded from: classes15.dex */
public class p1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 f226404d;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var) {
        this.f226404d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1 x1Var = this.f226404d;
        x1Var.getClass();
        com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a c20298x46d4560a = new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20298x46d4560a();
        boolean z17 = true;
        if (j62.e.g().c(c20298x46d4560a) != 1 && bm5.o1.f104252a.h(c20298x46d4560a) != 1) {
            z17 = false;
        }
        if (x1Var.f226453J) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var = x1Var.f226465t;
            int i17 = c0Var.f226293f;
            if (i17 >= 0 && i17 < c0Var.getCount()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 item = x1Var.f226465t.getItem(i17);
                if (z17) {
                    x1Var.v(item);
                } else {
                    x1Var.A(item, null, false);
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.c0 c0Var2 = x1Var.f226464s;
            int i18 = c0Var2.f226293f;
            if (i18 >= 0 && i18 < c0Var2.getCount()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.d0 item2 = x1Var.f226464s.getItem(i18);
                if (i18 != 0 || z17) {
                    x1Var.v(item2);
                } else {
                    x1Var.A(item2, null, false);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/location/ui/impl/SelectPoiMapUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

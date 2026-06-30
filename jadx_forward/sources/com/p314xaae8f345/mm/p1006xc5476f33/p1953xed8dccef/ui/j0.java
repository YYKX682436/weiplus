package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16815x2af38f74 f234840d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16815x2af38f74 c16815x2af38f74) {
        this.f234840d = c16815x2af38f74;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.C16815x2af38f74 c16815x2af38f74 = this.f234840d;
        int i17 = c16815x2af38f74.f234746m;
        if (i17 - 1 < c16815x2af38f74.f234745i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var = c16815x2af38f74.f234747n;
            if (k0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var).b(i17, 2);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        c16815x2af38f74.f234746m = i17 - 1;
        if (c16815x2af38f74.a()) {
            c16815x2af38f74.f234740d.setText("" + c16815x2af38f74.f234746m);
        }
        c16815x2af38f74.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var2 = c16815x2af38f74.f234747n;
        if (k0Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var2).a(c16815x2af38f74.f234746m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectAmountView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package cw1;

/* loaded from: classes12.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304917d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9) {
        this.f304917d = c13121x39a05fa9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = this.f304917d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c13121x39a05fa9.f177298i;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("filterList");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        cw1.n5 n5Var = mo7946xf939df19 instanceof cw1.n5 ? (cw1.n5) mo7946xf939df19 : null;
        if (n5Var != null && c13121x39a05fa9.f177301o.length > 1) {
            int i17 = 0;
            for (java.lang.Object obj : n5Var.f304714d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                cw1.o5 o5Var = (cw1.o5) obj;
                if (o5Var.f304736c > 0 && o5Var.f304737d == 0) {
                    n5Var.x(i17);
                }
                i17 = i18;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

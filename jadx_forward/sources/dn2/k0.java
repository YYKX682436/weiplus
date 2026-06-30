package dn2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dn2.l0 f323469d;

    public k0(dn2.l0 l0Var) {
        this.f323469d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingConsumedItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mm2.f6 f6Var = (mm2.f6) dk2.ef.f314905a.i(mm2.f6.class);
        boolean z17 = false;
        if (f6Var != null && f6Var.f410568i) {
            z17 = true;
        }
        dn2.l0 l0Var = this.f323469d;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null) {
                k0Var.mo46557x60d69242(qo0.b.f446882f2, null);
            }
        } else {
            l0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ShoppingConsumedItem", "clicked but shopping not available!");
        }
        l0Var.e(2);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/ShoppingConsumedItem$getView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

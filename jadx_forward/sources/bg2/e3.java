package bg2;

/* loaded from: classes2.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f101588d;

    public e3(bg2.z3 z3Var) {
        this.f101588d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$onFocusFeedCenter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.z3 z3Var = this.f101588d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z3Var.f498674d.f498681h;
        so2.h1 h1Var = abstractC14490x69736cb5 instanceof so2.h1 ? (so2.h1) abstractC14490x69736cb5 : null;
        if (h1Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$onFocusFeedCenter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.g gVar = (uc2.g) z3Var.O6(uc2.g.class);
        if (gVar != null) {
            in5.s0 s0Var = z3Var.f498674d.f498682i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            ((sb2.l) gVar).f7("7", s0Var, h1Var, view, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$onFocusFeedCenter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

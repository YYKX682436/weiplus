package bg2;

/* loaded from: classes2.dex */
public final class e3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20055d;

    public e3(bg2.z3 z3Var) {
        this.f20055d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$onFocusFeedCenter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bg2.z3 z3Var = this.f20055d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z3Var.f417141d.f417148h;
        so2.h1 h1Var = baseFinderFeed instanceof so2.h1 ? (so2.h1) baseFinderFeed : null;
        if (h1Var == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$onFocusFeedCenter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.g gVar = (uc2.g) z3Var.O6(uc2.g.class);
        if (gVar != null) {
            in5.s0 s0Var = z3Var.f417141d.f417149i;
            kotlin.jvm.internal.o.d(s0Var);
            kotlin.jvm.internal.o.d(view);
            ((sb2.l) gVar).f7("7", s0Var, h1Var, view, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingPromoteController$onFocusFeedCenter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

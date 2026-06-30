package rn2;

/* loaded from: classes15.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479281d;

    public g1(rn2.t2 t2Var) {
        this.f479281d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initGiftPrizeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.w wVar = this.f479281d.W;
        if (wVar != null) {
            rn2.t2 t2Var = wVar.f479435a;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(t2Var.f479386e);
            android.view.LayoutInflater from = android.view.LayoutInflater.from(t2Var.f479386e);
            android.view.View view2 = y1Var.f293560f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.deo, (android.view.ViewGroup) view2, false);
            inflate.findViewById(com.p314xaae8f345.mm.R.id.bys).setOnClickListener(new rn2.j(y1Var));
            inflate.findViewById(com.p314xaae8f345.mm.R.id.q4h).setOnClickListener(new rn2.k(y1Var, wVar));
            inflate.findViewById(com.p314xaae8f345.mm.R.id.q4f).setOnClickListener(new rn2.l(y1Var, wVar));
            zl2.r4.f555483a.Q2(inflate);
            y1Var.k(inflate);
            y1Var.s();
            y1Var.f293570s = rn2.m.f479329a;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initGiftPrizeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class q6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f87037d;

    public q6(com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        this.f87037d = v5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f87037d;
        al1.b bVar = (al1.b) v5Var.A1().a(v5Var.getF147807d(), al1.b.class);
        v5Var.H = bVar;
        bVar.getActionView().setId(v5Var.f87169z);
        v5Var.H.setBackButtonClickListener(new com.tencent.mm.plugin.appbrand.page.r6(v5Var));
        v5Var.H.setCloseButtonClickListener(new com.tencent.mm.plugin.appbrand.page.s6(v5Var));
        al1.b bVar2 = v5Var.H;
        bVar2.E.add(new com.tencent.mm.plugin.appbrand.page.t6(v5Var));
        bVar2.g(com.tencent.mm.plugin.appbrand.utils.d.f90400e.isEnable(), bVar2.getMainTitle());
        v5Var.H.setOptionButtonClickListener(new com.tencent.mm.plugin.appbrand.page.x6(v5Var));
        al1.l lVar = (al1.l) v5Var.A1().a(v5Var.getF147807d(), al1.l.class);
        v5Var.G = lVar;
        lVar.setId(com.tencent.mm.R.id.f483088w9);
        v5Var.G.setActuallyVisible(false);
        v5Var.G.setDeferStatusBarHeightChange(false);
        v5Var.G.addView(v5Var.H, new android.view.ViewGroup.LayoutParams(-1, -2));
        v5Var.R(v5Var.G);
        v5Var.U(v5Var.H);
        v5Var.R(v5Var.H);
        v5Var.G.D(v5Var.getF147807d());
        v5Var.F.addView(v5Var.G, -1, new android.view.ViewGroup.LayoutParams(-1, -2));
        v5Var.Q1().o(v5Var.H);
        if (v5Var.H.getParent() != v5Var.G) {
            throw new java.lang.IllegalAccessError("You should not modify actionbar's view hierarchy");
        }
    }
}

package dv2;

/* loaded from: classes10.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.m0 f325396d;

    public h0(dv2.m0 m0Var) {
        this.f325396d = m0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dv2.m0 m0Var = this.f325396d;
        android.view.View view2 = (android.view.View) ((jz5.n) m0Var.f325424d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view2, "access$getAddTagView(...)");
        hc2.p0.c(view2, "post_annotation_prompt", "view_clk", kz5.b1.e(new jz5.l("if_clk_empty", java.lang.Integer.valueOf((!r26.n0.N(m0Var.f325429i) ? 1 : 0) ^ 1))));
        java.util.Map Q6 = m0Var.Q6();
        m92.b P6 = m0Var.P6();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = P6 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) P6.u0().m75936x14adae67(43) : null;
        c61.ub ubVar = (c61.ub) ((jz5.n) m0Var.f325427g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ubVar, "<get-routerService>(...)");
        c61.ub.M8(ubVar, m0Var.m80379x76847179(), c19786x6a1e2862, Q6, null, new dv2.g0(m0Var), 8, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderPostAddTagUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

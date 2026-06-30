package im2;

/* loaded from: classes3.dex */
public final class q0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f374035d;

    public q0(im2.z3 z3Var) {
        this.f374035d = z3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.z3 z3Var = this.f374035d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80 c80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80) ((jz5.n) z3Var.f374202y0).mo141623x754a37bb();
        r45.h32 h32Var = new r45.h32();
        r45.vw4 vw4Var = z3Var.f374199x0;
        h32Var.set(18, java.lang.Integer.valueOf(vw4Var != null ? vw4Var.f470157d : 0));
        h32Var.set(14, java.lang.Integer.valueOf(z3Var.Y1));
        if (z3Var.f374167c2) {
            r45.q65 q65Var = new r45.q65();
            q65Var.set(0, java.lang.Boolean.TRUE);
            h32Var.set(10, q65Var);
        }
        c80Var.e0(h32Var, 2, new im2.p0(z3Var));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

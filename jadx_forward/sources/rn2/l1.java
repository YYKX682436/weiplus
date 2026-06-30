package rn2;

/* loaded from: classes3.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479326d;

    public l1(rn2.t2 t2Var) {
        this.f479326d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList linkedList;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.t2 t2Var = this.f479326d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t2Var.f479386e;
        t2Var.K = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(abstractActivityC21394xb3d2c0cf, 0, 2);
        android.view.View inflate = android.view.View.inflate(abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570451au1, null);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567253ir5)).getPaint(), 0.8f);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567250ir2);
        if (findViewById != null) {
            findViewById.setOnClickListener(new rn2.h2(t2Var));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = t2Var.K;
        if (z2Var != null) {
            z2Var.s(inflate);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(abstractActivityC21394xb3d2c0cf, null);
        c1163xf1deaba4.m7963x830bc99d(true);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(abstractActivityC21394xb3d2c0cf, 1, false));
        rn2.w2 w2Var = new rn2.w2();
        rn2.f fVar = t2Var.f479387f;
        if (fVar != null) {
            rn2.e eVar = ((rn2.c1) fVar).f479215y;
            linkedList = eVar.f479242k;
            if (linkedList.isEmpty()) {
                eVar.e();
            }
        } else {
            linkedList = null;
        }
        w2Var.f479440d = linkedList;
        w2Var.f479441e = new rn2.i2(t2Var);
        c1163xf1deaba4.mo7960x6cab2c8d(w2Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var2 = t2Var.K;
        if (z2Var2 != null) {
            z2Var2.j(c1163xf1deaba4);
        }
        android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
        if (layoutParams != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var3 = t2Var.K;
        if (z2Var3 != null) {
            z2Var3.C();
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f409126f, "");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

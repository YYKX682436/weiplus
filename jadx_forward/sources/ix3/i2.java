package ix3;

/* loaded from: classes7.dex */
public final class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.l2 f376980d;

    public i2(ix3.l2 l2Var) {
        this.f376980d = l2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ov.f0) ((pv.c0) i95.n0.c(pv.c0.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f();
        f17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174737r.clear();
        for (pv.a0 a0Var : pv.a0.m159036xcee59d22()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).remove("content_edu_" + a0Var.f440011d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174738s.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174739t = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.p4.f174740u = null;
        for (pv.b0 b0Var : pv.b0.m159039xcee59d22()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).remove(f17.e(b0Var));
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).remove("content_menu_clicked");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(f17.h()).remove("content_menu_all_not_show");
        dp.a.m125854x26a183b(this.f376980d.m80379x76847179(), "重置成功", 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerFloatBallDebugUIC$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

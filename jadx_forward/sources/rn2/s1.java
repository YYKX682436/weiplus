package rn2;

/* loaded from: classes3.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479374d;

    public s1(rn2.t2 t2Var) {
        this.f479374d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        df2.od odVar;
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.Integer[] numArr = {2, 3};
        rn2.t2 t2Var = this.f479374d;
        rn2.f fVar = t2Var.f479387f;
        if (!kz5.z.G(numArr, fVar != null ? java.lang.Integer.valueOf(((rn2.c1) fVar).f479215y.b()) : null)) {
            android.widget.EditText editText = t2Var.F;
            java.lang.String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
            if (obj == null || obj.length() == 0) {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = t2Var.f479386e;
                db5.t7.m123883x26a183b(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.drm), 0).show();
                yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        rn2.f fVar2 = t2Var.f479387f;
        if (fVar2 != null && ((rn2.c1) fVar2).f479215y.b() == 2) {
            if (fVar2 != null) {
                v65.i.c(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("FinderLiveLotteryCreateViewCallback", t2Var.f479386e, 0, 4, null), null, new rn2.r1(t2Var, ((rn2.c1) fVar2).q(), null), 1, null);
            }
        } else if (fVar2 != null) {
            rn2.c1 c1Var = (rn2.c1) fVar2;
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_LOTTERY_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            if (c1Var.f479214x == 0) {
                c1Var.h(null, 0);
            } else {
                c1Var.v();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e = dk2.ef.f314904J;
        if (c14197x319b1b9e != null && (odVar = (df2.od) c14197x319b1b9e.m56798x25fe639c(df2.od.class)) != null) {
            odVar.e7(r45.n72.kActionType_CreateLottery);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

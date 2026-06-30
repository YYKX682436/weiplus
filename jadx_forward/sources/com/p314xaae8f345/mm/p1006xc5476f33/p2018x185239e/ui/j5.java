package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f239315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b1 f239316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239317f;

    public j5(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b1 b1Var) {
        this.f239317f = activityC17133x39d21883;
        this.f239315d = str;
        this.f239316e = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(29405, 2, this.f239315d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.b1 b1Var = this.f239316e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0 v0Var = b1Var.f238329f;
        int i17 = v0Var.f238569a;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.url ：%s", v0Var.f238570b);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(this.f239317f.mo55332x76847179(), b1Var.f238329f.f238570b, false);
        } else if (i17 != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceDetailUI", "unsupported jump type");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.username ：%s", v0Var.f238571c);
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.v0 v0Var2 = b1Var.f238329f;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(v0Var2.f238571c, v0Var2.f238572d, 0, 1000);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceDetailUI$46", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

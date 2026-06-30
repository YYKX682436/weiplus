package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class u1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 f239499d;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 activityC17130xb547a358) {
        this.f239499d = activityC17130xb547a358;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 activityC17130xb547a358 = this.f239499d;
        if (activityC17130xb547a358.E == 56) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19821, 10, activityC17130xb547a358.f238710p1, 0);
        }
        if (activityC17130xb547a358.F == 65 && activityC17130xb547a358.Q != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceBusiResultUI", "mFinishBtn mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS");
            activityC17130xb547a358.Q.send(-1, null);
        }
        if (activityC17130xb547a358.E == 71) {
            new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1().e();
        }
        activityC17130xb547a358.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

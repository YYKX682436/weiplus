package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 f260289d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3) {
        this.f260289d = activityC19036x32c728a3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19036x32c728a3 activityC19036x32c728a3 = this.f260289d;
        if (activityC19036x32c728a3.f260263v) {
            activityC19036x32c728a3.F.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.atx);
            activityC19036x32c728a3.f260263v = false;
        } else {
            activityC19036x32c728a3.F.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aty);
            activityC19036x32c728a3.f260263v = true;
        }
        activityC19036x32c728a3.f260244J.a();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

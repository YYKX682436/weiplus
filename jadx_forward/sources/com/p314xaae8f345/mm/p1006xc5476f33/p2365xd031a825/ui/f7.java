package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 f261806d;

    public f7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950) {
        this.f261806d = activityC19119xf1f23950;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19119xf1f23950 activityC19119xf1f23950 = this.f261806d;
        java.lang.String string = activityC19119xf1f23950.m83105x7498fe14().getString("key_new_pwd1");
        java.lang.String m83156xc003f809 = activityC19119xf1f23950.f261608d.m83156xc003f809();
        java.lang.String string2 = activityC19119xf1f23950.m83105x7498fe14().getString("kreq_token");
        java.lang.String string3 = activityC19119xf1f23950.m83105x7498fe14().getString("key_verify_code");
        java.util.Objects.toString(activityC19119xf1f23950.f261610f);
        if (string == null || !string.equals(m83156xc003f809)) {
            com.p314xaae8f345.mm.p2802xd031a825.a.b(activityC19119xf1f23950, com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15117xb77c61b3);
        } else {
            at4.z0 z0Var = new at4.z0();
            z0Var.f95556b = activityC19119xf1f23950.f261608d.m83161xfb85ada3();
            z0Var.f95568n = activityC19119xf1f23950.f261610f;
            z0Var.f95558d = string2;
            z0Var.f95557c = string3;
            z0Var.f95561g = activityC19119xf1f23950.m83105x7498fe14().getBoolean("key_is_bind_bankcard", true);
            if (com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19119xf1f23950).r()) {
                z0Var.f95555a = "4";
            } else {
                z0Var.f95555a = "1";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 c19098xdf4bc178 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178) activityC19119xf1f23950.m83105x7498fe14().getParcelable("key_favor_pay_info");
            if (c19098xdf4bc178 != null) {
                z0Var.f95563i = c19098xdf4bc178.f261203g;
                z0Var.f95564j = c19098xdf4bc178.f261200d;
            }
            activityC19119xf1f23950.m83106x57340563().d(z0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

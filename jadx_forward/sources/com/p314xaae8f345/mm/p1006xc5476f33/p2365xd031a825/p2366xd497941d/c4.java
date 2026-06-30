package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class c4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339 f260883d;

    public c4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339 activityC19084x72adb339) {
        this.f260883d = activityC19084x72adb339;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String string = this.f260883d.m83105x7498fe14().getString("realname_verify_process_finish_confirm_btn_url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.mm.p2802xd031a825.a.c(this.f260883d.mo55332x76847179(), this.f260883d.m83105x7498fe14(), 0);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.a.c(this.f260883d.mo55332x76847179(), this.f260883d.m83105x7498fe14(), 0);
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.b4 b4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.b4(this, string);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b4Var, 10L, false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifySuccessUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

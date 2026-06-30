package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes8.dex */
public class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955 f260984d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955 activityC19080x8d358955) {
        this.f260984d = activityC19080x8d358955;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19080x8d358955 activityC19080x8d358955 = this.f260984d;
        activityC19080x8d358955.m83105x7498fe14().putBoolean("realname_verify_process_do_bind", true);
        com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19080x8d358955.mo55332x76847179(), activityC19080x8d358955.m83105x7498fe14());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyBindcardEntranceUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

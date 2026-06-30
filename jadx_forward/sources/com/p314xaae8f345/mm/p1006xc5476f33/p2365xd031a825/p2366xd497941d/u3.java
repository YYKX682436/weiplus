package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb f261036d;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19083x6e91f3eb activityC19083x6e91f3eb) {
        this.f261036d = activityC19083x6e91f3eb;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("wallet_lock_jsapi_scene", 2);
        if (com.p314xaae8f345.mm.p2802xd031a825.b.a().e()) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24826x2446a031(2, null);
        } else {
            j45.l.j(this.f261036d.mo55332x76847179(), "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

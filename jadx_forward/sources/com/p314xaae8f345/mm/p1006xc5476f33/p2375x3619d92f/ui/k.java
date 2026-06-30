package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes8.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19162xa40b1303 f262582d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19162xa40b1303 activityC19162xa40b1303) {
        this.f262582d = activityC19162xa40b1303;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardFinishUI", "click finish");
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5819x7bdf87fc().e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19162xa40b1303 activityC19162xa40b1303 = this.f262582d;
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = activityC19162xa40b1303.m83108x2b5a5a39();
        if (m83108x2b5a5a39 != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_process_result_code", -1);
            m83108x2b5a5a39.f(activityC19162xa40b1303.mo55332x76847179(), bundle);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletECardFinishUI", "process is null");
            activityC19162xa40b1303.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardFinishUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

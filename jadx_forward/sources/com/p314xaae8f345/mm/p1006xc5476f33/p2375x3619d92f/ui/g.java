package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes9.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19160x772fa748 f262578d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19160x772fa748 activityC19160x772fa748) {
        this.f262578d = activityC19160x772fa748;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardCheckOtherCardUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardCheckOtherCardUI", "do check card");
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19160x772fa748 activityC19160x772fa748 = this.f262578d;
        if (activityC19160x772fa748.f262552d.n() && activityC19160x772fa748.f262553e.n()) {
            activityC19160x772fa748.m83106x57340563().d(activityC19160x772fa748.f262552d.m83183xfb85ada3(), activityC19160x772fa748.f262553e.m83183xfb85ada3());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletECardCheckOtherCardUI", "input invalid");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardCheckOtherCardUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

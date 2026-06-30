package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19161x50d3ecde f262579d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19161x50d3ecde activityC19161x50d3ecde) {
        this.f262579d = activityC19161x50d3ecde;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19161x50d3ecde activityC19161x50d3ecde = this.f262579d;
        bundle.putInt("key_support_bankcard", activityC19161x50d3ecde.m83105x7498fe14().getInt("key_support_bankcard", 3));
        bundle.putInt("key_bind_scene", activityC19161x50d3ecde.m83105x7498fe14().getInt("key_bind_scene", -1));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC19161x50d3ecde.f262556d.m83183xfb85ada3())) {
            bundle.putString("key_bank_type", activityC19161x50d3ecde.f262557e.f261192s);
            bundle.putInt("key_bankcard_type", activityC19161x50d3ecde.f262557e.f261191r);
        }
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19161x50d3ecde);
        if (g17 != null) {
            g17.E(activityC19161x50d3ecde, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19110xc60f679.class, bundle, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardElementInputUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

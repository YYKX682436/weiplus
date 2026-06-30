package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f261816d;

    public g2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f261816d = activityC19108xd69d11c7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f261816d;
        bundle.putInt("key_support_bankcard", activityC19108xd69d11c7.m83105x7498fe14().getInt("key_support_bankcard", 3));
        bundle.putInt("key_bind_scene", activityC19108xd69d11c7.m83105x7498fe14().getInt("key_bind_scene", -1));
        activityC19108xd69d11c7.f261460t.m83183xfb85ada3();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        activityC19108xd69d11c7.mo48632xd46dd964();
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19108xd69d11c7);
        if (g17 != null) {
            g17.E(activityC19108xd69d11c7, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19104x725ad255.class, bundle, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

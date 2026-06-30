package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 f262198d;

    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2) {
        this.f262198d = activityC19109xac2e2ee2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19109xac2e2ee2 activityC19109xac2e2ee2 = this.f262198d;
        bundle.putInt("key_support_bankcard", activityC19109xac2e2ee2.m83105x7498fe14().getInt("key_support_bankcard", 3));
        bundle.putString("key_bank_type", activityC19109xac2e2ee2.f261493z.f261192s);
        bundle.putInt("key_bankcard_type", activityC19109xac2e2ee2.f261493z.f261191r);
        com.p314xaae8f345.mm.p2802xd031a825.a.g(activityC19109xac2e2ee2).E(activityC19109xac2e2ee2, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19110xc60f679.class, bundle, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardImportUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

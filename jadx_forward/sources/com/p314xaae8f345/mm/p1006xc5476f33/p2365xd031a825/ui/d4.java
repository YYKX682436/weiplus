package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes5.dex */
public class d4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 f261768d;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 activityC19113xc67f5986) {
        this.f261768d = activityC19113xc67f5986;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View view2;
        android.view.View view3;
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 c27990xda3033a3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 activityC19113xc67f5986 = this.f261768d;
        view2 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19113xc67f5986).f39900xbab696ce;
        if (!view2.isShown() && !activityC19113xc67f5986.f261534f) {
            view3 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19113xc67f5986).f39900xbab696ce;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c27990xda3033a3 = ((com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e) activityC19113xc67f5986).f39901x43041b74;
            c27990xda3033a3.setVisibility(0);
        }
        activityC19113xc67f5986.f261534f = false;
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

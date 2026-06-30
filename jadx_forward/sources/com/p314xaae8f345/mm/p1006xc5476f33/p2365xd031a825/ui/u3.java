package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class u3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 f262167d;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362) {
        this.f262167d = activityC19112x755f8362;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362 activityC19112x755f8362 = this.f262167d;
        activityC19112x755f8362.U6();
        if (activityC19112x755f8362.f261523r == 0) {
            activityC19112x755f8362.f261523r = 1;
            activityC19112x755f8362.V6();
        } else {
            activityC19112x755f8362.f261523r = 0;
        }
        activityC19112x755f8362.Z6();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCheckPwdUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 f262201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f262202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f262203f;

    public v4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 c19096xf9c99b43, android.content.Context context, android.app.Dialog dialog) {
        this.f262201d = c19096xf9c99b43;
        this.f262202e = context;
        this.f262203f = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 c19096xf9c99b43 = this.f262201d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIdCardTip", "go to: %s", java.lang.Integer.valueOf(c19096xf9c99b43.f261169n));
        int i17 = c19096xf9c99b43.f261169n;
        android.content.Context context = this.f262202e;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(context, c19096xf9c99b43.f261170o, false);
        } else {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5818x4f542c8f c5818x4f542c8f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5818x4f542c8f();
            c5818x4f542c8f.f136126g.f88888a = new java.lang.ref.WeakReference(context);
            c5818x4f542c8f.e();
        }
        android.app.Dialog dialog = this.f262203f;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

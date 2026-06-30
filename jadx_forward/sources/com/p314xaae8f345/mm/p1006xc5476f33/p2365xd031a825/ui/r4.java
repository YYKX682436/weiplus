package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes.dex */
public class r4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f262131e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f262132f;

    public r4(java.lang.String str, android.content.Context context, android.app.Dialog dialog) {
        this.f262130d = str;
        this.f262131e = context;
        this.f262132f = dialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f262130d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIdCardTip", "go to url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f262131e, intent);
        android.app.Dialog dialog = this.f262132f;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

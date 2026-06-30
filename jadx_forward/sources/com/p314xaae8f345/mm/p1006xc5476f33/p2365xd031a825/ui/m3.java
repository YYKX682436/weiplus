package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 f262022d;

    public m3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o3 o3Var) {
        this.f262022d = o3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletChangeBankcardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof java.lang.String) {
            android.content.Intent intent = new android.content.Intent();
            java.lang.String str = (java.lang.String) view.getTag();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletChangeBankcardAdapter", "go to url %s", str);
            intent.putExtra("rawUrl", str);
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("pay_channel", 1);
            android.content.Context context = this.f262022d.f262083d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ActivityC19031x1cc5b0e9.f260184z;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.U(context, intent, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletChangeBankcardAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

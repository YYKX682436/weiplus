package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes.dex */
public class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 f262144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f262145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f262146f;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19096xf9c99b43 c19096xf9c99b43, android.content.Context context, int i17) {
        this.f262144d = c19096xf9c99b43;
        this.f262145e = context;
        this.f262146f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f262144d.f261174s;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletIdCardTip", "go to url %s", str);
        intent.putExtra("rawUrl", str);
        intent.putExtra("geta8key_username", c01.z1.r());
        intent.putExtra("pay_channel", 1);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(this.f262145e, intent);
        if (this.f262146f == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16500, 4);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16500, 6);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletIdCardTip$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

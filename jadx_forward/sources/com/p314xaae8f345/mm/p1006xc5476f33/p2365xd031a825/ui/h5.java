package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes5.dex */
public class h5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f261838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f261839g;

    public h5(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1, java.lang.String str, java.lang.String str2, int i17) {
        this.f261839g = activityC19116x82bf90f1;
        this.f261836d = str;
        this.f261837e = str2;
        this.f261838f = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f261838f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String str = this.f261839g.f261565p;
        java.lang.String str2 = this.f261836d;
        java.lang.String str3 = this.f261837e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOrderInfoNewUI", "leadViewInfo click app username：%s，path：%s，version：%s ,mTransactionId：%s", str2, str3, valueOf, str);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.b0(str2, str3, i17, 8);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

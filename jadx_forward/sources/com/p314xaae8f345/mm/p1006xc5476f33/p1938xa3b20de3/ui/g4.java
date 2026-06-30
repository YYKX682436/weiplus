package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes4.dex */
public final class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h4 f234161d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h4 h4Var) {
        this.f234161d = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/offline/ui/WalletOfflineEnableUIC$showEnableTokenAlert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.h4 h4Var = this.f234161d;
        h4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOfflineEnableUIC", "goto pwd ui");
        android.content.Intent intent = new android.content.Intent(h4Var.m158354x19263085(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19111xd5a60886.class);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 4);
        h4Var.m158354x19263085().startActivityForResult(intent, 256);
        yj0.a.h(this, "com/tencent/mm/plugin/offline/ui/WalletOfflineEnableUIC$showEnableTokenAlert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

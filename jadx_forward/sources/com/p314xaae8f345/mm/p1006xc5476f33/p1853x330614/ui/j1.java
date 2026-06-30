package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k1 f229949d;

    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k1 k1Var) {
        this.f229949d = k1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/MallIndexUI$PosView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(5);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.k1 k1Var = this.f229949d;
        j45.l.j(k1Var.f229960h.mo55332x76847179(), "offline", ".ui.WalletOfflineEntranceUI", intent, null);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(9, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(11850, 5, 0);
        g0Var.d(14419, k1Var.f229960h.f229776h, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$PosView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

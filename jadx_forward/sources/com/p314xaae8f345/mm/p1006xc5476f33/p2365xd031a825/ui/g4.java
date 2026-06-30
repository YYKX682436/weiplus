package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class g4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4 f261818d;

    public g4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4 m4Var) {
        this.f261818d = m4Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.m4 m4Var = this.f261818d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.j4 j4Var = m4Var.f262028i;
        if (j4Var != null) {
            at4.o0 o0Var = j4Var.f261891g;
            m4Var.f262029m.a(m4Var.f262027h.g(o0Var.a(o0Var.f95444c, -1)));
        }
        m4Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletFavorDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

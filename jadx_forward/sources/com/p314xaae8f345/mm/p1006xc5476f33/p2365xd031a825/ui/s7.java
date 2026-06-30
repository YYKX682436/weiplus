package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class s7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f262149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 f262150e;

    public s7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 v7Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f262150e = v7Var;
        this.f262149d = onCancelListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f262149d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 v7Var = this.f262150e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.t7 t7Var = v7Var.f262222w;
        if (t7Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.w) t7Var).f260347a.finish();
        }
        v7Var.cancel();
        if (v7Var.A.isShown()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 0, 1, 0, 0, 0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 0, 0, 1, 0, 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

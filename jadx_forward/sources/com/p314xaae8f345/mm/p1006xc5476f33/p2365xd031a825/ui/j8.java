package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class j8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f261895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f261896e;

    public j8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f261896e = n8Var;
        this.f261895d = onCancelListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f261895d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f261896e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k8 k8Var = n8Var.E;
        if (k8Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.w0) k8Var).a();
        }
        n8Var.cancel();
        if (n8Var.M.isShown()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 0, 1, 0, 0, 0);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 0, 0, 1, 0, 0, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

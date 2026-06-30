package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes3.dex */
public class a8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f261672d;

    public a8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var) {
        this.f261672d = n8Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f261672d;
        n8Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "do req face id");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15817, 3);
        mz2.e1 e1Var = (mz2.e1) i95.n0.c(mz2.e1.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("face_auth_scene", 1);
        android.view.View view2 = n8Var.f262054d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "reqFaceIdAuth", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "reqFaceIdAuth", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((mz2.j2) e1Var).wi((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) n8Var.Z, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c8(n8Var), bundle);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

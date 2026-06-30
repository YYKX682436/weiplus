package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class m7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 f262033d;

    public m7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 v7Var) {
        this.f262033d = v7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 v7Var = this.f262033d;
        int i17 = v7Var.E;
        if (i17 == 0) {
            v7Var.A.setText(v7Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwy));
            v7Var.E = 1;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            v7Var.f262205J = android.os.SystemClock.elapsedRealtime();
            android.view.View view2 = v7Var.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v7Var.D.setVisibility(0);
            v7Var.C.setVisibility(8);
            v7Var.f262216q.setVisibility(8);
            android.view.View view3 = v7Var.f262210h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v7Var.f262212m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwq);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7.k(false);
            v7Var.K = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 1, 0, 0, 0, 2);
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(9, 1);
        } else if (i17 == 1) {
            v7Var.c();
        }
        if (v7Var.E == 1) {
            v7Var.h();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: is screen on: %b", java.lang.Boolean.valueOf(!v7Var.N));
            if (!v7Var.N) {
                v7Var.i();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

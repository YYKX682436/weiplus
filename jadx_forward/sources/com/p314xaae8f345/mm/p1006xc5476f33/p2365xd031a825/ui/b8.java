package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class b8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f261685d;

    public b8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var) {
        this.f261685d = n8Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f261685d;
        int i17 = n8Var.R;
        if (i17 == 0) {
            if (n8Var.S == 0) {
                n8Var.M.setText(n8Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwy));
                n8Var.R = 1;
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                n8Var.Y = android.os.SystemClock.elapsedRealtime();
                android.view.View view2 = n8Var.N;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n8Var.Q.setVisibility(0);
                n8Var.P.setVisibility(8);
                n8Var.f262068t.setVisibility(8);
                android.view.View view3 = n8Var.f262057g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFingerprint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n8Var.f262059i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwq);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8.u(false);
                n8Var.X.f273658x = 1;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 1, 0, 0, 0, 2);
                com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(9, 1);
            } else {
                n8Var.M.setText(n8Var.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kwy));
                n8Var.R = 2;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                n8Var.Y = android.os.SystemClock.elapsedRealtime();
                n8Var.D.setVisibility(0);
                n8Var.f262068t.setVisibility(8);
                android.view.View view4 = n8Var.f262057g;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFaceId", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToFaceId", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                n8Var.f262059i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwp);
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8.u(false);
                n8Var.X.f273658x = 1;
            }
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = n8Var.X;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 != null ? c19760x34448d56.f273642e : 0, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 19, "");
            n8Var.c();
        } else if (i17 == 2) {
            n8Var.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15817, 4);
        }
        if (n8Var.R == 1) {
            n8Var.h();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "hy: is screen on: %b", java.lang.Boolean.valueOf(!n8Var.f262075y0));
            if (!n8Var.f262075y0) {
                n8Var.i();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

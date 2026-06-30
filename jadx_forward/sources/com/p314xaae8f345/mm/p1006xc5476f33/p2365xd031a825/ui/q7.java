package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 f262121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 f262122e;

    public q7(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 v7Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8) {
        this.f262122e = v7Var;
        this.f262121d = c5820xc13f26f8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback");
        am.pn pnVar = this.f262121d.f136129h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 v7Var = this.f262122e;
        if (pnVar == null) {
            v7Var.K = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback, result == null");
            return;
        }
        int i17 = pnVar.f89168a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: payInfo soterAuthReq: %s", pnVar.f89172e);
            v7Var.K = 1;
            v7Var.L = pnVar.f89172e;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(v7Var.L);
                jSONObject.put("soter_type", "1");
                v7Var.L = jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletPwdCustomDialog", e17, "", new java.lang.Object[0]);
            }
            v7Var.M++;
            v7Var.C.setText("");
            v7Var.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 1, 0, 1, 0, 2);
            re4.n.f(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        v7Var.K = 0;
        v7Var.L = "";
        android.view.View view = v7Var.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        v7Var.C.setTextColor(v7Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
        v7Var.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.klt);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i18 = currentTimeMillis - v7Var.H;
        if (i18 > 1) {
            v7Var.H = currentTimeMillis;
            v7Var.G++;
            v7Var.M++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 1, 0, 1, 0, 2);
        boolean z17 = i17 == 2 || i17 == 10308;
        boolean z18 = pnVar.f89173f == 2;
        int i19 = v7Var.G;
        if ((z18 || (i19 < 3 && i18 > 1)) && !z17) {
            if (v7Var.I == null) {
                v7Var.I = na5.e.a(v7Var.getContext());
            }
            v7Var.D.setVisibility(8);
            v7Var.C.setVisibility(4);
            v7Var.I.reset();
            v7Var.I.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p7(this));
            v7Var.C.startAnimation(v7Var.I);
            re4.n.f(1);
            return;
        }
        if (i19 >= 3 || z17) {
            v7Var.h();
            v7Var.E = 0;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            v7Var.f262205J = android.os.SystemClock.elapsedRealtime();
            v7Var.A.setVisibility(8);
            android.view.View view2 = v7Var.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            v7Var.C.setVisibility(0);
            v7Var.C.setText(com.p314xaae8f345.mm.R.C30867xcad56011.klu);
            v7Var.C.setTextColor(v7Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561081aa5));
            v7Var.f262212m.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwv);
            v7Var.f262216q.setVisibility(0);
            if (!v7Var.f262210h.isShown()) {
                android.view.View view3 = v7Var.f262210h;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            re4.n.f(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7.k(true);
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class g8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 f261823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f261824e;

    public g8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5820xc13f26f8 c5820xc13f26f8) {
        this.f261824e = n8Var;
        this.f261823d = c5820xc13f26f8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback");
        am.pn pnVar = this.f261823d.f136129h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f261824e;
        if (pnVar == null) {
            n8Var.X.f273658x = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, result == null");
            return;
        }
        int i17 = pnVar.f89168a;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "hy: payInfo soterAuthReq: %s", pnVar.f89172e);
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = n8Var.X;
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d56 == null ? 0 : c19760x34448d56.f273642e, c19760x34448d56 == null ? "" : c19760x34448d56.f273647m, 22, "");
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = n8Var.X;
            c19760x34448d562.f273658x = 1;
            c19760x34448d562.A = pnVar.f89169b;
            c19760x34448d562.B = pnVar.f89170c;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((pz2.a) gm0.j1.s(pz2.a.class)).Uh());
                jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
                n8Var.X.G = jSONObject.toString();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletPwdDialog", e17, "", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d563 = n8Var.X;
            c19760x34448d563.C = pnVar.f89171d;
            c19760x34448d563.D++;
            n8Var.P.setText("");
            n8Var.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 1, 0, 1, 0, 2);
            re4.n.f(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "hy: FingerPrintAuthEvent callback, encrypted_pay_info & encrypted_rsa_sign is empty, idetify fail!");
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d564 = n8Var.X;
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.a2.a(c19760x34448d564 == null ? 0 : c19760x34448d564.f273642e, c19760x34448d564 == null ? "" : c19760x34448d564.f273647m, 23, "");
        n8Var.X.f273658x = 0;
        android.view.View view = n8Var.N;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n8Var.P.setTextColor(n8Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2y));
        n8Var.P.setText(com.p314xaae8f345.mm.R.C30867xcad56011.klt);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        int i18 = currentTimeMillis - n8Var.V;
        if (i18 > 1) {
            n8Var.V = currentTimeMillis;
            n8Var.U++;
            n8Var.X.D++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11977, 1, 1, 0, 1, 0, 2);
        boolean z17 = i17 == 2 || i17 == 10308;
        boolean z18 = pnVar.f89173f == 2;
        int i19 = n8Var.U;
        if ((z18 || (i19 < 3 && i18 > 1)) && !z17) {
            if (n8Var.W == null) {
                n8Var.W = na5.e.a(n8Var.getContext());
            }
            n8Var.Q.setVisibility(8);
            n8Var.P.setVisibility(4);
            n8Var.W.reset();
            n8Var.W.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.f8(this));
            n8Var.P.startAnimation(n8Var.W);
            re4.n.f(1);
            return;
        }
        if (i19 >= 3 || z17) {
            n8Var.h();
            n8Var.R = 0;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            n8Var.Y = android.os.SystemClock.elapsedRealtime();
            n8Var.M.setVisibility(8);
            android.view.View view2 = n8Var.N;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            n8Var.P.setVisibility(0);
            n8Var.P.setText(com.p314xaae8f345.mm.R.C30867xcad56011.klu);
            n8Var.P.setTextColor(n8Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561081aa5));
            n8Var.f262059i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.kwv);
            n8Var.f262068t.setVisibility(0);
            if (!n8Var.f262057g.isShown()) {
                android.view.View view3 = n8Var.f262057g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$7", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            re4.n.f(2);
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8.u(true);
        }
    }
}

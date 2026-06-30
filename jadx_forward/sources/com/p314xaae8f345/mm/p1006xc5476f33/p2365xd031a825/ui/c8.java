package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class c8 implements lz2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 f261710a;

    public c8(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var) {
        this.f261710a = n8Var;
    }

    @Override // lz2.a
    /* renamed from: onAuthCancel */
    public void mo11325x21a77981() {
        android.view.View view = this.f261710a.f262054d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthCancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // lz2.a
    /* renamed from: onAuthFail */
    public void mo11326xfa7237e5(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f261710a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "face id auth fail: %s, %s", valueOf, java.lang.Integer.valueOf(n8Var.X.D));
        android.view.View view = n8Var.f262054d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthFail", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog$6", "onAuthFail", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        n8Var.M.setVisibility(8);
        n8Var.c();
        n8Var.X.D++;
    }

    @Override // lz2.a
    /* renamed from: onAuthSuccess */
    public void mo11327x833155dc(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdDialog", "face id auth success");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.n8 n8Var = this.f261710a;
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = n8Var.X;
        c19760x34448d56.f273658x = 1;
        c19760x34448d56.A = "";
        c19760x34448d56.B = "";
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(((pz2.a) gm0.j1.s(pz2.a.class)).Uh());
            jSONObject.put("soter_type", ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().G());
            n8Var.X.G = jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletPwdDialog", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d562 = n8Var.X;
        c19760x34448d562.C = i17;
        c19760x34448d562.D = i18;
        n8Var.e();
    }
}

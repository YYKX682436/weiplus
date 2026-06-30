package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class rm implements w24.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea f243052a;

    public rm(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea) {
        this.f243052a = activityC17463xb337a9ea;
    }

    public void a(java.lang.String str) {
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea = this.f243052a;
        if (!K0) {
            if (activityC17463xb337a9ea.f242226p != 0) {
                activityC17463xb337a9ea.T6(str);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsSwitchAccountUI", "switch to %s, current %s", str, activityC17463xb337a9ea.f242224n);
            if (str.equals(activityC17463xb337a9ea.f242224n)) {
                activityC17463xb337a9ea.finish();
                return;
            } else {
                activityC17463xb337a9ea.W6();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).edit().putString("last_switch_account_to_wx_username", str).commit();
                return;
            }
        }
        if (activityC17463xb337a9ea.f242226p != 0) {
            android.content.Intent intent = new android.content.Intent(activityC17463xb337a9ea, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11453xa58e34bc.class);
            intent.putExtra("mobile_input_purpose", 1);
            intent.putExtra("from_switch_account", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17463xb337a9ea activityC17463xb337a9ea2 = this.f243052a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC17463xb337a9ea2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$5", "onClickAvatar", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC17463xb337a9ea2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC17463xb337a9ea2, "com/tencent/mm/plugin/setting/ui/setting/SettingsSwitchAccountUI$5", "onClickAvatar", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            db5.f.i(activityC17463xb337a9ea);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(((java.util.HashMap) activityC17463xb337a9ea.f242232v).size() > 1 ? 1 : 0);
        objArr[1] = 11;
        c01.uc ucVar = c01.uc.f119047c;
        objArr[2] = ucVar.f();
        objArr[3] = ucVar.e();
        objArr[4] = wo.w0.k();
        g0Var.d(14978, objArr);
        int g17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Global_AffiliateAccount_Int, -1);
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(274436, null);
        boolean z17 = (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("AffiliatedAcctRegSwitch", 0) == 0 && g17 == -1) ? false : true;
        ip.j b17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b();
        if (g17 == -1) {
            g17 = 0;
        }
        int b18 = b17.b("AffiliatedAcctRegScene", g17);
        if (!gm0.j1.b().n() || !"CN".equalsIgnoreCase(str2) || !z17) {
            android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0);
            sharedPreferences.edit().putString("last_switch_account_to_wx_username", "").commit();
            sharedPreferences.edit().putBoolean("last_switch_account_to_regui", false).commit();
            activityC17463xb337a9ea.W6();
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[5];
        objArr2[0] = java.lang.Integer.valueOf(((java.util.HashMap) activityC17463xb337a9ea.f242232v).size() > 1 ? 1 : 0);
        objArr2[1] = 12;
        objArr2[2] = ucVar.f();
        objArr2[3] = ucVar.e();
        objArr2[4] = wo.w0.k();
        g0Var.d(14978, objArr2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC17463xb337a9ea.mo55332x76847179(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.pm(this, b18);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.qm(this, b18);
        k0Var.v();
    }
}

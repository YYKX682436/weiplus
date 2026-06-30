package p61;

/* loaded from: classes5.dex */
public class a2 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d f433741a;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d activityC11363xeff3735d) {
        this.f433741a = activityC11363xeff3735d;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d activityC11363xeff3735d = this.f433741a;
        if (i17 != 2) {
            if (i17 == 3) {
                activityC11363xeff3735d.f154543q = bundle.getString("setpwd_ticket");
                return;
            }
            return;
        }
        int i18 = activityC11363xeff3735d.f154541o;
        if (i18 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "to startMySafedeviceListUI");
            if (!((c01.z1.o() & 16384) != 0)) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab c6199x6e6a85ab = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab();
                am.zz zzVar = c6199x6e6a85ab.f136453g;
                zzVar.f90150a = true;
                zzVar.f90151b = true;
                c6199x6e6a85ab.e();
            }
            activityC11363xeff3735d.W6(1);
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
            j45.l.j(activityC11363xeff3735d, "account", ".security.ui.MySafeDeviceListUI", intent, null);
            return;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "to RegByMobileSetPwdUI for reset pwd");
                activityC11363xeff3735d.finish();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.addFlags(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
                intent2.addFlags(603979776);
                intent2.putExtra("setpwd_ticket_type", 4);
                intent2.putExtra("setpwd_ticket", bundle.getString("setpwd_ticket", ""));
                j45.l.j(activityC11363xeff3735d, "account", ".ui.RegByMobileSetPwdUI", intent2, null);
                return;
            }
            if (i18 == 5) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "to finish  finishWizard for get phone number");
                activityC11363xeff3735d.W6(-1);
                return;
            }
            if (activityC11363xeff3735d.f154538i) {
                if (i18 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 3, 3);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 1, 2);
                }
            }
            if (activityC11363xeff3735d.f154541o == 0 && bundle.getBoolean("restart_wechat", false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "restart after bind mobile!");
                db5.e1.G(activityC11363xeff3735d, activityC11363xeff3735d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572349ax0), activityC11363xeff3735d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), false, new p61.z1(this));
                return;
            }
            android.content.Intent intent3 = new android.content.Intent(activityC11363xeff3735d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096.class);
            if (r61.e1.f474392i == 1) {
                int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096.f154512i;
                intent3.putExtra("intent_back_launcherui", true);
            }
            if (activityC11363xeff3735d.f154539m) {
                intent3.putExtra("WizardRootClass", com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class.getCanonicalName());
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11363xeff3735d, intent3);
            activityC11363xeff3735d.finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "to BindMContactStatusUI for change mobile");
        if (j62.e.g().i("clicfg_update_login_mobile_number_flag", 1, true, true) == 1 && gm0.j1.b().n()) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
            c01.b9 b9Var = c01.b9.f118602c;
            java.lang.String a17 = b9Var.a("login_user_name", "");
            java.lang.String a18 = b9Var.a("last_login_bind_mobile", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "updateMobile userId:%s lastLoginUserName:%s lastLoginBindMobile:%s", str, a17, a18);
            boolean startsWith = a17.startsWith("+");
            boolean z18 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a18);
            boolean z19 = startsWith && z18 && a17.contains(a18);
            if (z19) {
                java.lang.String str2 = activityC11363xeff3735d.f154535f;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c5 c5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c5();
                java.lang.String replace = str2.replace("+", "");
                java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c5.c(replace);
                if (c17 != null) {
                    replace = replace.substring(c17.length());
                }
                java.lang.String f17 = c5Var.f(c17, replace);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "try to update last login mobile mobile:%s formatMobile:%s", activityC11363xeff3735d.f154535f, f17);
                b9Var.d("last_login_bind_mobile", f17);
                b9Var.d("login_user_name", activityC11363xeff3735d.f154535f);
                c01.uc ucVar = c01.uc.f119047c;
                if (ucVar.f119049a.contains(str)) {
                    ucVar.h(str, "last_login_bind_mobile", f17);
                    ucVar.h(str, "login_user_name", activityC11363xeff3735d.f154535f);
                }
                gm0.j1.u().c().w(6, f17);
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LAST_LOGIN_USERNAME_STRING, activityC11363xeff3735d.f154535f);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "login not by mobile isUseMobileLogin:%s isBindMobile:%s isLoginWithBindMobile:%s", java.lang.Boolean.valueOf(startsWith), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            }
            z17 = false;
        } else {
            z17 = false;
        }
        if (bundle.getBoolean("restart_wechat", z17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMContactVerifyUI", "restart after change mobile!");
            db5.e1.G(activityC11363xeff3735d, activityC11363xeff3735d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572349ax0), activityC11363xeff3735d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), z17, new p61.y1(this));
        } else {
            db5.e1.V(activityC11363xeff3735d, activityC11363xeff3735d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), com.p314xaae8f345.mm.R.C30867xcad56011.afx, null);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11363xeff3735d, new android.content.Intent(activityC11363xeff3735d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096.class));
        }
    }
}

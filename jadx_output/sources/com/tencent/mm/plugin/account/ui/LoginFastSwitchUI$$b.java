package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class LoginFastSwitchUI$$b implements q61.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.LoginFastSwitchUI f73322a;

    public /* synthetic */ LoginFastSwitchUI$$b(com.tencent.mm.plugin.account.ui.LoginFastSwitchUI loginFastSwitchUI) {
        this.f73322a = loginFastSwitchUI;
    }

    public final void a(boolean z17, r45.pd4 pd4Var) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.account.ui.LoginFastSwitchUI loginFastSwitchUI = this.f73322a;
        loginFastSwitchUI.getClass();
        if (!valueOf.booleanValue()) {
            q61.j.e(q61.j.f360268h, 2, 3, 0, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginFastSwitchUI", "check login qrcode failed!");
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            loginFastSwitchUI.U6("", bool, bool);
            return;
        }
        if (pd4Var == null) {
            q61.j.e(q61.j.f360268h, 2, 3, 0, 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginFastSwitchUI", "check login qrcode failed! loginnotify invalid");
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            loginFastSwitchUI.U6("", bool2, bool2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginFastSwitchUI", "uuid %s, UUID %s, imgurl:%s, nickName:%s, status:%s, expire %d", pd4Var.f382959d, loginFastSwitchUI.f73317f, pd4Var.f382963h, pd4Var.f382965m, java.lang.Integer.valueOf(pd4Var.f382960e), java.lang.Integer.valueOf(pd4Var.f382966n));
        if (com.tencent.mm.sdk.platformtools.t8.N0(pd4Var.f382959d, loginFastSwitchUI.f73317f) || !loginFastSwitchUI.f73317f.equals(pd4Var.f382959d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginFastSwitchUI", "check login qrcode failed! uuid invalid");
            return;
        }
        int i17 = pd4Var.f382960e;
        if (i17 != 2) {
            if (i17 == 3) {
                q61.j.e(q61.j.f360268h, 2, 3, 0, 2);
                loginFastSwitchUI.U6(loginFastSwitchUI.getString(com.tencent.mm.R.string.naf), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
                return;
            } else {
                if (i17 != 4) {
                    loginFastSwitchUI.T6();
                    return;
                }
                q61.j.e(q61.j.f360268h, 2, 3, 0, 1);
                java.lang.String string = loginFastSwitchUI.getString(com.tencent.mm.R.string.n_j);
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                loginFastSwitchUI.U6(string, bool3, bool3);
                return;
            }
        }
        java.lang.String str = pd4Var.f382961f;
        java.lang.String str2 = pd4Var.f382962g;
        if (com.tencent.mm.sdk.platformtools.t8.N0(str, str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LoginFastSwitchUI", "login error when confirm, usename and pwd is empty or null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(ya.b.SUCCESS, true);
        intent.putExtra("err_msg", "");
        intent.putExtra("block", false);
        intent.putExtra("show_toast", false);
        intent.putExtra("UUID", loginFastSwitchUI.f73317f);
        intent.putExtra(dm.i4.COL_USERNAME, str);
        intent.putExtra("pwd", str2);
        loginFastSwitchUI.setResult(-1, intent);
        loginFastSwitchUI.finish();
        loginFastSwitchUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477830co);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.LoginFastSwitchUI$$b */
/* loaded from: classes4.dex */
public final /* synthetic */ class C11412xb40e8d95 implements q61.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11410x7839932d f154855a;

    public /* synthetic */ C11412xb40e8d95(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11410x7839932d activityC11410x7839932d) {
        this.f154855a = activityC11410x7839932d;
    }

    public final void a(boolean z17, r45.pd4 pd4Var) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11410x7839932d activityC11410x7839932d = this.f154855a;
        activityC11410x7839932d.getClass();
        if (!valueOf.booleanValue()) {
            q61.j.e(q61.j.f441801h, 2, 3, 0, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginFastSwitchUI", "check login qrcode failed!");
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            activityC11410x7839932d.U6("", bool, bool);
            return;
        }
        if (pd4Var == null) {
            q61.j.e(q61.j.f441801h, 2, 3, 0, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginFastSwitchUI", "check login qrcode failed! loginnotify invalid");
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            activityC11410x7839932d.U6("", bool2, bool2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginFastSwitchUI", "uuid %s, UUID %s, imgurl:%s, nickName:%s, status:%s, expire %d", pd4Var.f464492d, activityC11410x7839932d.f154850f, pd4Var.f464496h, pd4Var.f464498m, java.lang.Integer.valueOf(pd4Var.f464493e), java.lang.Integer.valueOf(pd4Var.f464499n));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(pd4Var.f464492d, activityC11410x7839932d.f154850f) || !activityC11410x7839932d.f154850f.equals(pd4Var.f464492d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoginFastSwitchUI", "check login qrcode failed! uuid invalid");
            return;
        }
        int i17 = pd4Var.f464493e;
        if (i17 != 2) {
            if (i17 == 3) {
                q61.j.e(q61.j.f441801h, 2, 3, 0, 2);
                activityC11410x7839932d.U6(activityC11410x7839932d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.naf), java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
                return;
            } else {
                if (i17 != 4) {
                    activityC11410x7839932d.T6();
                    return;
                }
                q61.j.e(q61.j.f441801h, 2, 3, 0, 1);
                java.lang.String string = activityC11410x7839932d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n_j);
                java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
                activityC11410x7839932d.U6(string, bool3, bool3);
                return;
            }
        }
        java.lang.String str = pd4Var.f464494f;
        java.lang.String str2 = pd4Var.f464495g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LoginFastSwitchUI", "login error when confirm, usename and pwd is empty or null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(ya.b.f77504xbb80cbe3, true);
        intent.putExtra("err_msg", "");
        intent.putExtra("block", false);
        intent.putExtra("show_toast", false);
        intent.putExtra("UUID", activityC11410x7839932d.f154850f);
        intent.putExtra(dm.i4.f66875xa013b0d5, str);
        intent.putExtra("pwd", str2);
        activityC11410x7839932d.setResult(-1, intent);
        activityC11410x7839932d.finish();
        activityC11410x7839932d.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559363co);
    }
}

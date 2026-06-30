package com.p314xaae8f345.mm.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.AccountExpiredUI */
/* loaded from: classes11.dex */
public class ActivityC21337x7f9078ec extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public int f278080d;

    /* renamed from: e, reason: collision with root package name */
    public int f278081e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f278082f;

    public final void T6() {
        java.util.Map d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountExpiredUI", "errType = " + this.f278080d + " errCode = " + this.f278081e + " errMsg = " + this.f278082f);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d.b(4, this.f278081e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountExpiredUI", "errCode not  -100, quit");
            finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class).putExtra("Intro_Switch", true).addFlags(67108864);
        gm0.j1.i();
        gm0.j1.b();
        java.lang.String str = gm0.m.f354768x;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AccountExpiredUI", "account expired=" + this.f278081e + " lastKickReason=" + str);
        new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5177x8d056a0c().e();
        gm0.m.o();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10 c5691xc916fb10 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5691xc916fb10();
        am.hj hjVar = c5691xc916fb10.f136017g;
        hjVar.getClass();
        hjVar.f88369a = 1;
        c5691xc916fb10.e();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        int i17 = this.f278081e;
        if (i17 == -2023) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1582L, 0L, 1L, false);
        } else if (i17 == -205) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1582L, 5L, 1L, false);
        } else if (i17 == -100) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1582L, 1L, 1L, false);
        } else if (i17 == -72) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1582L, 6L, 1L, false);
        } else if (i17 == -9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1582L, 4L, 1L, false);
        } else if (i17 == -4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1582L, 3L, 1L, false);
        } else if (i17 == -3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1582L, 2L, 1L, false);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            U6(this.f278080d, this.f278081e, this.f278082f, "empty!");
        } else {
            if (str != null && str.length() > 1024) {
                str.substring(0, 1024);
            }
            U6(this.f278080d, this.f278081e, this.f278082f, str);
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountExpiredUI", "account expired br showType[%d]", java.lang.Integer.valueOf(b17.f501933c));
                int i18 = b17.f501933c;
                if (i18 == 3 || i18 == 4) {
                    b17.c(this, new com.p314xaae8f345.mm.ui.a(this, b17, intent), new com.p314xaae8f345.mm.ui.b(this, intent));
                    return;
                }
                intent.putExtra("key_errType", this.f278080d);
                intent.putExtra("key_errCode", this.f278081e);
                intent.putExtra("key_errMsg", str);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI", "handleExpired", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/AccountExpiredUI", "handleExpired", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                db5.f.i(this);
                finish();
                return;
            }
            if (str.startsWith("<") && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "e", null)) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) d17.get(".e.Content"))) {
                str = (java.lang.String) d17.get(".e.Content");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountExpiredUI", "account expired summerauthkick errmsg=" + str + " |v=" + d17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountExpiredUI", "account expired lastKickReason[%s]", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gqn);
        }
        db5.e1.M(this, str, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), new com.p314xaae8f345.mm.ui.c(this, intent), new com.p314xaae8f345.mm.ui.d(this, intent));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountExpiredUI", "show kickout dialog by old logic.");
    }

    public final void U6(int i17, int i18, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6293x22abaa23 c6293x22abaa23 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6293x22abaa23();
        c6293x22abaa23.f136549e = i18;
        c6293x22abaa23.f136548d = i17;
        c6293x22abaa23.f136550f = c6293x22abaa23.b("errMsg", str, false);
        c6293x22abaa23.f136551g = c6293x22abaa23.b("lastKickReason", str2, false);
        c6293x22abaa23.k();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f278080d = getIntent().getIntExtra("key_errType", 0);
        this.f278081e = getIntent().getIntExtra("key_errCode", 0);
        this.f278082f = getIntent().getStringExtra("key_errMsg");
        if (this.f278080d != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountExpiredUI", "finish, errType = " + this.f278080d + " errCode = " + this.f278081e + " errMsg = " + this.f278082f);
            finish();
        }
        try {
            T6();
        } catch (java.lang.Exception unused) {
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }
}

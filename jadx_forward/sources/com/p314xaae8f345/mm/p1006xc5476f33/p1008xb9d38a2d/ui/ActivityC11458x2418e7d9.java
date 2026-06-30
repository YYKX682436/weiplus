package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/account/ui/PreCheckAffiliateAccountUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.account.ui.PreCheckAffiliateAccountUI */
/* loaded from: classes8.dex */
public final class ActivityC11458x2418e7d9 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public int f155077d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f155078e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f155079f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f155080g = java.lang.System.currentTimeMillis() + "";

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        switch (i17) {
            case 702:
                if (intent != null) {
                    android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bundleExtra);
                    java.util.Map map = (java.util.Map) bundleExtra.getSerializable("next_params");
                    if (map != null) {
                        this.f155079f = (java.lang.String) map.get("ticket");
                    }
                    if (this.f155079f != null) {
                        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbc, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), u11.b.d("CN"), "reg", 1, 0);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        c71.b.c(this, string, 703, false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23530, this.f155080g, wo.w0.k(), 0, 1, 1002, 0, null, java.lang.Integer.valueOf(this.f155077d));
                    } else {
                        setResult(0, intent);
                        finish();
                    }
                } else {
                    setResult(0, intent);
                    finish();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f155078e;
                if (u3Var != null) {
                    u3Var.dismiss();
                    return;
                }
                return;
            case 703:
                if (intent != null) {
                    android.os.Bundle bundleExtra2 = intent.getBundleExtra("result_data");
                    if (bundleExtra2 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bundleExtra2.getString("go_next", ""), "agree_privacy")) {
                        setResult(0, intent);
                        finish();
                    } else {
                        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648.class);
                        intent2.putExtra("RegTicket", this.f155079f);
                        intent2.putExtra("sessionID", this.f155080g);
                        intent2.putExtra("RegScene", this.f155077d);
                        startActivityForResult(intent2, 704);
                    }
                } else {
                    setResult(0, intent);
                    finish();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f155078e;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                    return;
                }
                return;
            case 704:
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f155078e;
                if (u3Var3 != null) {
                    u3Var3.dismiss();
                }
                setResult(i18, intent);
                finish();
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        this.f155078e = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
        this.f155077d = getIntent().getIntExtra("RegScene", 0);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5298;
        lVar.f152199c = "/cgi-bin/micromsg-bin/precheckaffiliatedacct";
        r45.tb5 tb5Var = new r45.tb5();
        tb5Var.f467808e = this.f155080g;
        fo3.s sVar = fo3.s.INSTANCE;
        byte[] h17 = sVar.h();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(h17);
        k57Var.f459929f = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.L9());
        k57Var.f459933m = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(k57Var.mo14344x5f01b1f6());
        tb5Var.f467807d = cu5Var3;
        tb5Var.f467809f = this.f155077d;
        lVar.f152197a = tb5Var;
        lVar.f152198b = new r45.ub5();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.he(this), false);
    }
}

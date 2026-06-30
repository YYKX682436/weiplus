package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI */
/* loaded from: classes9.dex */
public class ActivityC19034xfdf1f8b4 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: d, reason: collision with root package name */
    public r45.an6 f260223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f260224e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f260225f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f260226g = false;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo67598xf0aced2e(8);
        this.f260225f = getIntent().getStringExtra("INTENT_PAYFEE");
        this.f260224e = getIntent().getStringExtra("INTENT_TITLE");
        this.f260226g = getIntent().getIntExtra("INTENT_CAN_TOUCH", 0) == 1;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("INTENT_TOKENMESS");
        r45.an6 an6Var = new r45.an6();
        this.f260223d = an6Var;
        try {
            an6Var.mo11468x92b714fd(byteArrayExtra);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WalletPayCustomUI", e17, "", new java.lang.Object[0]);
        }
        r45.an6 an6Var2 = this.f260223d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayCustomUI", "mTokeMess packageex:%s busi_id:%s sign:%s can_use_touch %s mPayFee %s mTitle %s", an6Var2.f451689d, an6Var2.f451693h, an6Var2.f451690e, java.lang.Boolean.valueOf(this.f260226g), this.f260225f, this.f260224e);
        java.lang.String str = this.f260224e;
        java.lang.String str2 = this.f260225f;
        boolean z17 = this.f260226g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.u(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.v(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.w wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.w(this);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7.P;
        if (isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7 v7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.v7(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576328wh);
        android.widget.Button button = v7Var.f262207e;
        if (button != null) {
            v7Var.f262223x = null;
            button.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.r7(v7Var));
        }
        android.widget.ImageView imageView = v7Var.f262208f;
        if (imageView != null) {
            v7Var.f262224y = vVar;
            imageView.setVisibility(0);
            v7Var.f262208f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.s7(v7Var, vVar));
        }
        v7Var.setOnCancelListener(vVar);
        v7Var.setCancelable(true);
        v7Var.f262211i.setText(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            v7Var.f262213n.setVisibility(8);
        } else {
            v7Var.f262213n.setVisibility(0);
            v7Var.f262213n.setText(str2);
        }
        android.view.View view = v7Var.f262219t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        v7Var.f262222w = wVar;
        if (android.text.TextUtils.isEmpty("")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPwdCustomDialog", "ChargeFee is null");
            v7Var.f262220u.setVisibility(8);
        } else {
            v7Var.f262220u.setVisibility(0);
            v7Var.f262220u.setText("");
        }
        v7Var.f262217r = uVar;
        v7Var.F = z17;
        if (!c01.z1.I()) {
            v7Var.o();
        }
        v7Var.show();
        db5.e1.a(this, v7Var);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletPayCustomUI", "errorType %s errCode %s, errmsg %s, scene %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (!(m1Var instanceof ss4.c0)) {
            return false;
        }
        if (i17 == 0 && i18 == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("INTENT_RESULT_TOKEN", ((ss4.c0) m1Var).f493560d);
            intent.putExtras(getIntent());
            setResult(-1, intent);
        }
        finish();
        return false;
    }
}

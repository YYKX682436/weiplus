package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* renamed from: com.tencent.mm.ui.contact.SayHiEditUI */
/* loaded from: classes11.dex */
public class ActivityC22324x4f863f6a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f288067d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f288068e = null;

    public static void T6(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22324x4f863f6a activityC22324x4f863f6a) {
        activityC22324x4f863f6a.getClass();
        fo3.s.INSTANCE.O6(2, 1, 5);
        java.lang.String stringExtra = activityC22324x4f863f6a.getIntent().getStringExtra("Contact_User");
        int intExtra = activityC22324x4f863f6a.getIntent().getIntExtra("Contact_Scene", 18);
        java.lang.String stringExtra2 = activityC22324x4f863f6a.getIntent().getStringExtra("AntispamTicket");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(stringExtra);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(java.lang.Integer.valueOf(intExtra));
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            linkedList3.add(stringExtra2);
        }
        java.lang.String trim = activityC22324x4f863f6a.f288067d.getText().toString().trim();
        if (trim.length() > 50) {
            trim = trim.substring(0, 50);
        }
        r35.e4 e4Var = new r35.e4(activityC22324x4f863f6a.mo55332x76847179(), null);
        e4Var.f450627q = trim;
        e4Var.g(linkedList, linkedList2);
        activityC22324x4f863f6a.f288068e = db5.e1.Q(activityC22324x4f863f6a.mo55332x76847179(), activityC22324x4f863f6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC22324x4f863f6a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iin), true, true, new com.p314xaae8f345.mm.ui.p2690x38b72420.a9(activityC22324x4f863f6a, e4Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.chh;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.m9y);
        this.f288067d = c22621x7603e017;
        c22621x7603e017.requestFocus();
        this.f288067d.addTextChangedListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.b9(null));
        this.f288067d.setOnEditorActionListener(new com.p314xaae8f345.mm.ui.p2690x38b72420.x8(this));
        ck5.f b17 = ck5.f.b(this.f288067d);
        b17.f124094f = 0;
        b17.f124093e = 100;
        b17.d(null);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), new com.p314xaae8f345.mm.ui.p2690x38b72420.y8(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.p2690x38b72420.z8(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(30, this);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.h6c);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(30, this);
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        tm.a b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiEditUI", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        try {
            android.app.ProgressDialog progressDialog = this.f288068e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f288068e = null;
            }
            boolean z17 = true;
            if (i18 == -34 || i18 == -24) {
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.h6g, 0).show();
            } else if (i18 != -22) {
                z17 = false;
            } else {
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.h6d, 0).show();
            }
            if (z17) {
                return;
            }
            if (i17 == 0 && i18 == 0) {
                db5.e1.T(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572473bb2));
                finish();
                return;
            }
            java.lang.String str2 = "";
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && ((b17 = tm.a.b(str)) == null || (str2 = b17.f501932b) == null)) {
                str2 = str;
            }
            if (i17 == 4 && i18 == -24 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, str);
            } else if (i18 != -101 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.h6e, 0).show();
            } else {
                db5.e1.y(this, str2, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SayHiEditUI", "exception in onSceneEnd : " + e17.getMessage());
        }
    }
}

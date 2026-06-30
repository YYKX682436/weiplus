package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI */
/* loaded from: classes9.dex */
public class ActivityC17124xdeb27f2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f238624f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f238625g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f238626h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f238627i;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f238622d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f238623e = "";

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f238628m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.remittance.ui.F2FAppBrandRemittanceUI.1
        {
            this.f39173x3fe91575 = -1359897903;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1 c5207x4c38dee1) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5207x4c38dee1 c5207x4c38dee12 = c5207x4c38dee1;
            if (c5207x4c38dee12 == null) {
                return false;
            }
            am.e1 e1Var = c5207x4c38dee12.f135547g;
            if (!e1Var.f88051c) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "f2f appbrand callback data.pay_fail_reason :%s，event.data.pay_success_action: %s，event.data.pay_channel:%s ,event.data.app_id :%s ", java.lang.Integer.valueOf(e1Var.f88054f), java.lang.Integer.valueOf(e1Var.f88055g), java.lang.Integer.valueOf(e1Var.f88056h), e1Var.f88057i);
            if (e1Var.f88056h != 56) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "is not from F2FAppBrandRemittance，reutrn ");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17124xdeb27f2 activityC17124xdeb27f2 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17124xdeb27f2.this;
                if (!activityC17124xdeb27f2.f238622d.equals(e1Var.f88057i)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "is not the same appid ");
                } else if (e1Var.f88055g == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "event.data.pay_success_action == 1，reutrn ");
                } else {
                    int i17 = e1Var.f88054f;
                    if (i17 != 0) {
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    com.p314xaae8f345.mm.ui.o2 o2Var = com.p314xaae8f345.mm.ui.o2.CANCEL;
                                    if (i17 != 4) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "unknown pay failreason");
                                        activityC17124xdeb27f2.T6(o2Var, "");
                                    } else {
                                        activityC17124xdeb27f2.T6(o2Var, "");
                                    }
                                } else {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19821, 9, activityC17124xdeb27f2.f238622d, 0);
                                    activityC17124xdeb27f2.T6(com.p314xaae8f345.mm.ui.o2.SUCCESS, "");
                                }
                            }
                        }
                    }
                    activityC17124xdeb27f2.T6(com.p314xaae8f345.mm.ui.o2.FAIL, "pay fail");
                }
            }
            return true;
        }
    };

    /* renamed from: n, reason: collision with root package name */
    public final y60.e f238629n = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.h(this);

    public final void T6(java.lang.Enum r47, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "setActivityResultData result :%s , errmsg : %s", r47, str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_pay_result", r47);
        intent.putExtra("key_result_error_msg", str);
        setResult(-1, intent);
        finish();
    }

    public final void U6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "showErrorDialog,errMsg:%s", str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(mo55332x76847179());
        u1Var.u("");
        u1Var.g(str);
        u1Var.a(true);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.l_e);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.g(this));
        u1Var.q(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = u1Var.f293531c;
        if (j0Var != null) {
            this.f238627i = j0Var;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        T6(com.p314xaae8f345.mm.ui.o2.CANCEL, "");
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onCreate（）");
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().setFlags(1024, 1024);
        if (mo2533x106ab264() != null) {
            mo2533x106ab264().o();
        }
        this.f238622d = getIntent().getStringExtra("key_app_id");
        java.lang.String stringExtra = getIntent().getStringExtra("key_confirm_id");
        this.f238623e = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            T6(com.p314xaae8f345.mm.ui.o2.FAIL, "confirm_id is empty");
        }
        gm0.j1.d().a(2850, this);
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.u(this.f238623e, this.f238622d));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onDestroy()");
        super.onDestroy();
        android.widget.ImageView imageView = this.f238624f;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.graphics.Bitmap bitmap = this.f238625g;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        y60.e eVar = this.f238629n;
        ((x60.e) fVar).getClass();
        x51.w0.e(eVar);
        this.f238628m.mo48814x2efc64();
        gm0.j1.d().q(2850, this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onPause()");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onResume()");
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        android.view.View view;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "on Scene End：errType %s , errCode：%s，errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.u) {
            if (i17 != 0 || i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd faile show error dialog ");
                U6(str);
                return;
            }
            r45.xv xvVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2022x633fb29.u) m1Var).f238561f;
            if (xvVar == null) {
                xvVar = new r45.xv();
            }
            r45.xv xvVar2 = xvVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "NetSceneF2FMinniProgramConfirm on SceneEnd ok，retcode:%s, retMsg：%s", java.lang.Integer.valueOf(xvVar2.f471998d), xvVar2.f471999e);
            if (xvVar2.f471998d != 0) {
                U6(xvVar2.f471999e);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "showHalfDialog");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xvVar2.f472001g)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "res == null || Util.isNullOrNil(res.qrcode)");
                T6(com.p314xaae8f345.mm.ui.o2.FAIL, "get qrcode fail");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19821, 1, this.f238622d, 0);
            this.f238626h = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(mo55332x76847179(), 2, 3);
            android.view.View inflate = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a_r, null);
            ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.aa_)).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.e(this));
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dlv);
            textView.setText(xvVar2.f472000f);
            textView.getPaint().setFakeBoldText(true);
            this.f238626h.s(inflate);
            android.view.View inflate2 = android.view.View.inflate(mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a_q, null);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.dls);
            this.f238624f = imageView;
            imageView.setImageBitmap(null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xvVar2.f472002h)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "qrcode： res.head_img null");
                view = inflate2;
            } else {
                java.lang.String str2 = xvVar2.f472001g;
                java.lang.String str3 = xvVar2.f472002h;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "contentUrl： %s ， headUrl：%s", str2, str3);
                view = inflate2;
                this.f238625g = ww1.r.a(this, str2, c01.z1.r(), 1, str3, true, com.p314xaae8f345.mm.sdk.p2603x2137b148.j.d(this, 197.0f), this.f238629n, false, 1, 2.0f, false);
            }
            android.graphics.Bitmap bitmap = this.f238625g;
            if (bitmap == null || bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "qrcode： bmp null ");
            } else {
                this.f238624f.setImageBitmap(this.f238625g);
            }
            ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dlu)).setText(xvVar2.f472003i);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dlw);
            textView2.setText(xvVar2.f472004m);
            textView2.getPaint().setFakeBoldText(true);
            this.f238626h.j(view);
            this.f238626h.y(xvVar2.f472005n);
            this.f238626h.x(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f238626h;
            z2Var.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.f(this, xvVar2);
            z2Var.C();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f238626h;
        if (z2Var != null && !z2Var.h()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged：mHalfBottomDialog isShowHalfDialog %s, finish Activity", java.lang.Boolean.valueOf(this.f238626h.h()));
            this.f238626h = null;
            T6(com.p314xaae8f345.mm.ui.o2.CANCEL, "");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19821, 3, this.f238622d, 0);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f238627i;
        if (j0Var != null && !j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.F2FAppBrandRemittanceUI", "onWindowFocusChanged isShowing:%s,finish Activity", java.lang.Boolean.valueOf(this.f238627i.isShowing()));
            this.f238627i = null;
            T6(com.p314xaae8f345.mm.ui.o2.FAIL, "get qrcode fail");
        }
        super.onWindowFocusChanged(z17);
    }
}

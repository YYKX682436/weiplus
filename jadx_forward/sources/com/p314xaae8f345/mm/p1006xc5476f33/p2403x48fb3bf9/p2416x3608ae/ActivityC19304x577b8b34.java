package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity */
/* loaded from: classes12.dex */
public class ActivityC19304x577b8b34 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public int f265050f;

    /* renamed from: g, reason: collision with root package name */
    public int f265051g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f265052h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f265053i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f265054m;

    /* renamed from: d, reason: collision with root package name */
    public boolean f265048d = false;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f265049e = null;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f265055n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity.1
        {
            this.f39173x3fe91575 = 1280295539;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c1063) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c10632 = c5751x758c1063;
            if (c5751x758c10632 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewScanImageActivity", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                return false;
            }
            am.kl klVar = c5751x758c10632.f136072g;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewScanImageActivity", "notify Event: %d", java.lang.Integer.valueOf(klVar.f88701c));
            android.app.Activity activity = klVar.f88700b;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19304x577b8b34 activityC19304x577b8b34 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19304x577b8b34.this;
            if (activity != activityC19304x577b8b34 || !klVar.f88699a.equals(activityC19304x577b8b34.f265049e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebviewScanImageActivity", "not the same, eventStr: %s, origin: %s", klVar.f88699a, activityC19304x577b8b34.f265049e);
                return false;
            }
            int i17 = klVar.f88701c;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = activityC19304x577b8b34.f265055n;
            if (i17 == 0 || i17 == 1 || i17 == 2) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
                activityC19304x577b8b34.finish();
                return false;
            }
            if (i17 != 3) {
                return false;
            }
            abstractC20980x9b9ad01d.mo48814x2efc64();
            activityC19304x577b8b34.finish();
            return false;
        }
    };

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewScanImageActivity", "hy: on create");
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(getIntent().getStringExtra("img_gallery_session_id"))) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_string_for_url");
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                java.lang.String a17 = c01.n2.a("WebviewQrCode");
                c01.l2 c17 = c01.n2.d().c(a17, true);
                c17.i("url", stringExtra);
                c17.i("Contact_Sub_Scene", java.lang.Integer.valueOf(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(stringExtra) ? 1 : 6));
                c17.i("Contact_Scene_Note", stringExtra);
                getIntent().putExtra("img_gallery_session_id", a17);
            }
        }
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570732bo0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewScanImageActivity", "hy: on pause");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831 c5225x893b831 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831();
        am.p1 p1Var = c5225x893b831.f135558g;
        p1Var.f89127b = this;
        p1Var.f89126a = this.f265049e;
        c5225x893b831.e();
        this.f265055n.mo48814x2efc64();
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewScanImageActivity", "hy: on start");
        if (!this.f265048d && getIntent() != null) {
            this.f265049e = getIntent().getStringExtra("key_string_for_scan");
            this.f265050f = getIntent().getIntExtra("key_codetype_for_scan", 0);
            this.f265051g = getIntent().getIntExtra("key_codeversion_for_scan", 0);
            this.f265052h = getIntent().getStringExtra("key_string_for_url");
            this.f265053i = getIntent().getStringExtra("key_string_for_image_url");
            this.f265054m = getIntent().getStringExtra("key_string_for_wxapp_id");
            int intExtra = getIntent().getIntExtra("geta8key_init_request_id", 0);
            if (this.f265049e != null) {
                this.f265055n.mo48813x58998cd();
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
                am.r3 r3Var = c5292x67f91197.f135612g;
                r3Var.f89314b = this;
                r3Var.f89313a = this.f265049e;
                r3Var.f89316d = this.f265051g;
                r3Var.f89315c = this.f265050f;
                r3Var.f89317e = 6;
                r3Var.f89322j = this.f265053i;
                r3Var.f89321i = getIntent().getIntExtra("geta8key_scene", 40);
                r3Var.f89325m = getIntent().getStringExtra("key_file_path_for_scan");
                r3Var.f89327o = true;
                boolean booleanExtra = getIntent().getBooleanExtra("key_delete_file_after_deal", false);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3Var.f89325m)) {
                    r3Var.f89326n = com.p314xaae8f345.mm.vfs.w6.N(r3Var.f89325m, 0, -1);
                    java.lang.String str = r3Var.f89325m;
                    if (booleanExtra) {
                        com.p314xaae8f345.mm.vfs.w6.h(str);
                    }
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("stat_app_id", this.f265054m);
                bundle.putString("stat_url", this.f265052h);
                bundle.putInt("stat_scene", 4);
                bundle.putInt("geta8key_init_request_id", intExtra);
                bundle.putString("stat_send_msg_user", getIntent().getStringExtra("key_string_for_from_username"));
                bundle.putString("wxappPathWithQuery", getIntent().getStringExtra("wxappPathWithQuery"));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265054m)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewScanImageActivity", "addStatInfo4AppBrand, from h5");
                    bundle.putInt("LaunchCodeScene_ScanScene", 3);
                    bundle.putInt("pay_qrcode_session_type", 4);
                    bundle.putString("pay_qrcode_session_name", this.f265052h);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewScanImageActivity", "addStatInfo4AppBrand, from wxapp");
                    bundle.putInt("LaunchCodeScene_ScanScene", 5);
                    bundle.putInt("pay_qrcode_session_type", 5);
                    bundle.putString("pay_qrcode_session_name", this.f265054m);
                }
                java.lang.String stringExtra = getIntent().getStringExtra("payInitRawUrl");
                long longExtra = getIntent().getLongExtra("payInitTimestamp", 0L);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    stringExtra = this.f265052h;
                }
                if (longExtra == 0) {
                    longExtra = c01.id.a() / 1000;
                }
                bundle.putString("payInitRawUrl", stringExtra);
                bundle.putLong("payInitTimestamp", longExtra);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebviewScanImageActivity", "WebView scan initRawUrl: %s, initTimestamp: %d", stringExtra, java.lang.Long.valueOf(longExtra));
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f265054m)) {
                    java.lang.String stringExtra2 = getIntent().getStringExtra("key_string_for_url");
                    r45.nu3 nu3Var = new r45.nu3();
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                        try {
                            nu3Var.f463218d = xw4.b.c(stringExtra2);
                            jd0.d2 d2Var = (jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class));
                            d2Var.getClass();
                            d2Var.wi(c5292x67f91197);
                            r3Var.f89328p.f453814d.f452670i = nu3Var;
                        } catch (java.lang.Exception e17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebviewScanImageActivity", e17, "addDealQBarStrExtraInfo exception", new java.lang.Object[0]);
                        }
                    }
                } else {
                    r45.vm4 vm4Var = new r45.vm4();
                    vm4Var.f469893d = this.f265054m;
                    vm4Var.f469894e = getIntent().getIntExtra("key_int_for_wxapp_open_scene", 0);
                    ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ai(c5292x67f91197, 0, vm4Var);
                }
                r3Var.f89324l = bundle;
                c5292x67f91197.e();
            }
        }
        this.f265048d = true;
    }
}

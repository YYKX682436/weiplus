package com.p314xaae8f345.mm.ui.p2740x696c9db;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.tools.ShareScreenImgUI */
/* loaded from: classes11.dex */
public class ActivityC22525xd785bb4c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f291702h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f291703d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f291704e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f291705f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.net.Uri f291706g = null;

    public ActivityC22525xd785bb4c() {
        new com.p314xaae8f345.mm.ui.p2740x696c9db.aa(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c.T6():void");
    }

    public final void U6() {
        dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.j4b, 1).show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        if (r2 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c.V6(java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        android.content.Intent intent = getIntent();
        this.f291704e = intent;
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareScreenImgUI", "launch : fail, intent is null");
            U6();
            finish();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareScreenImgUI", "intent = " + this.f291704e);
        java.lang.String action = this.f291704e.getAction();
        this.f291706g = this.f291704e.getData();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareScreenImgUI", "launch : fail, action is null");
            U6();
            finish();
            return;
        }
        android.net.Uri uri = this.f291706g;
        java.lang.String str = q35.e.f441509a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.e1(this, uri)) {
            V6(action);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.fip) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.msk));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareScreenImgUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            V6(action);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "wizard_activity_result_code", 0);
        if (g17 == -1 || g17 == 0) {
            com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.d();
            mo43517x10010bd5();
        } else {
            if (g17 == 1) {
                finish();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShareScreenImgUI", "onCreate, should not reach here, resultCode = " + g17);
            finish();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareScreenImgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareScreenImgUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhi), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fic), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareScreenImgUI$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c.f291702h;
                    com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c activityC22525xd785bb4c = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c.this;
                    activityC22525xd785bb4c.getClass();
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22525xd785bb4c.mo55332x76847179();
                    ((sb0.f) jVar).getClass();
                    j35.u.g(mo55332x76847179);
                    activityC22525xd785bb4c.finish();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareScreenImgUI$$b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c.f291702h;
                    com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22525xd785bb4c.this.finish();
                }
            });
            return;
        }
        if (this.f291704e == null) {
            this.f291704e = getIntent();
        }
        android.content.Intent intent = this.f291704e;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        V6(this.f291704e.getAction());
    }
}

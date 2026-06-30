package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLivePrecheckLicenseUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/feed/ui/bc", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLivePrecheckLicenseUI */
/* loaded from: classes8.dex */
public final class ActivityC14025xcad1379e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 {
    public static final /* synthetic */ int I = 0;
    public boolean A;
    public boolean E;
    public int F;
    public long G;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f190936v;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.Button f190938x;

    /* renamed from: y, reason: collision with root package name */
    public az2.f f190939y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.p971x6de15a2e.r0 f190940z;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f190937w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.hc(this));
    public java.lang.String B = "";
    public java.lang.String C = "";
    public int D = 5;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 H = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gc(this), true);

    public final void d7(java.lang.String str) {
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(mo55332x76847179()) == -1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("licenseLoadUrl but non network, onNetworkChange is null:");
            sb6.append(this.f190940z == null);
            sb6.append('!');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePrecheckLicenseUI", sb6.toString());
            if (this.f190940z == null) {
                this.f190940z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.fc(this);
                gm0.j1.n().a(this.f190940z);
                return;
            }
            return;
        }
        if (this.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePrecheckLicenseUI", "licenseLoadUrl " + str + " but haveLoadWebView!");
            return;
        }
        this.A = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f190936v;
        if (c22633x83752a59 != null) {
            c22633x83752a59.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ec(this, str));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePrecheckLicenseUI", "licenseLoadUrl " + str + '!');
    }

    public final void e7() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.B, "TYPE_STANDARD") && this.D <= 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_COUNTDOWN_FINISH", true);
            setResult(0, intent);
        }
        finish();
    }

    public final void f7() {
        android.widget.Button button = this.f190938x;
        if (button == null) {
            return;
        }
        button.setText(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.B, "TYPE_LICENSE") ? this.D <= 0 ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5q) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5p, java.lang.Integer.valueOf(this.D)) : this.D <= 0 ? getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5m) : getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e5l, java.lang.Integer.valueOf(this.D)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ax_;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_COUNTDOWN_FINISH", false) : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePrecheckLicenseUI", "onActivityResult requestCode:" + i17 + ", resultCode:" + i18 + ", standardCountdownFinish:" + booleanExtra);
        if (i17 == 1001) {
            if (i18 == -1) {
                setResult(-1);
                finish();
            }
            this.E = booleanExtra;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        e7();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14025xcad1379e.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePrecheckLicenseUI", "onDestroy");
        super.onDestroy();
        this.H.d();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f190936v;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo52095x5cd39ffa();
        }
        this.f190936v = null;
        com.p314xaae8f345.mm.p971x6de15a2e.r0 r0Var = this.f190940z;
        if (r0Var != null) {
            gm0.j1.n().d(r0Var);
        }
        az2.f fVar = this.f190939y;
        if (fVar != null) {
            fVar.b();
        }
        this.f190939y = null;
    }
}

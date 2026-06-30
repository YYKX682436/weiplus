package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

@db5.a(m123858x6ac9171 = 17)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI */
/* loaded from: classes5.dex */
public class ActivityC17420x3d09cd46 extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: d, reason: collision with root package name */
    public int f241918d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f241919e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f241920f = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561774sa);

    /* renamed from: g, reason: collision with root package name */
    public float f241921g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f241922h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f241923i = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    public int f241924m;

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17420x3d09cd46 activityC17420x3d09cd46, android.widget.ImageView imageView, int i17) {
        activityC17420x3d09cd46.getClass();
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
        float g17 = j65.f.g() / f14.e.c(i17);
        if (layoutParams != null) {
            layoutParams.width = (int) (i65.a.f(activityC17420x3d09cd46.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561449iv) * g17);
            layoutParams.height = (int) (i65.a.f(activityC17420x3d09cd46.mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561449iv) * g17);
            imageView.setLayoutParams(layoutParams);
        }
    }

    public static float V6(android.content.Context context) {
        float n17 = i65.a.n(context);
        i65.a.x(context);
        if (n17 == 1.0f || n17 == i65.a.y(context) || n17 == i65.a.w(context) || n17 == i65.a.z(context) || n17 == i65.a.s(context) || n17 == i65.a.t(context) || n17 == i65.a.u(context) || n17 == i65.a.v(context)) {
            return n17;
        }
        i65.a.x(context);
        return 1.0f;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(this.f241918d), java.lang.Integer.valueOf(this.f241919e), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, java.lang.Integer.valueOf(this.f241918d), java.lang.Integer.valueOf(this.f241919e));
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clg;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.izv);
        float V6 = V6(mo55332x76847179());
        this.f241921g = V6;
        this.f241922h = V6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFontUI", "fontSizeBefore=" + this.f241921g);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f565177bk3);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_5);
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.a_6);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById(com.p314xaae8f345.mm.R.id.mpo);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById(com.p314xaae8f345.mm.R.id.mpm);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) findViewById(com.p314xaae8f345.mm.R.id.mpn);
        if (gm0.j1.a()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, c01.z1.r(), null);
        }
        int f17 = (int) (i65.a.f(mo55332x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561774sa) / j65.f.f379476g);
        this.f241920f = f17;
        c22624x85d690392.m84176x8e6ff544(f17);
        c22624x85d690393.m84176x8e6ff544(this.f241920f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17657x77c04133 c17657x77c04133 = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2079xd1075a44.C17657x77c04133) findViewById(com.p314xaae8f345.mm.R.id.gbg);
        float V62 = V6(mo55332x76847179());
        if (V62 != f14.e.a(mo55332x76847179())) {
            f14.e.e(mo55332x76847179(), V62);
        }
        if (V62 < i65.a.y(mo55332x76847179()) || V62 > i65.a.v(mo55332x76847179())) {
            V62 = i65.a.y(mo55332x76847179());
        }
        c17657x77c04133.m69111x6b90deaf(V62 == i65.a.y(mo55332x76847179()) ? 0 : V62 == i65.a.w(mo55332x76847179()) ? 2 : V62 == i65.a.z(mo55332x76847179()) ? 3 : V62 == i65.a.s(mo55332x76847179()) ? 4 : V62 == i65.a.t(mo55332x76847179()) ? 5 : V62 == i65.a.u(mo55332x76847179()) ? 6 : V62 == i65.a.v(mo55332x76847179()) ? 7 : 1);
        c17657x77c04133.m69110xb9da30c5(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.wb(this, c22624x85d69039, c22624x85d690392, c22624x85d690393, imageView, imageView2, imageView3));
        this.f241919e = i65.a.o(mo55332x76847179());
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xb(this));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yb(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getAction() != 1) {
            return super.onKeyDown(i17, keyEvent);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11609, java.lang.Integer.valueOf(this.f241918d), java.lang.Integer.valueOf(this.f241919e), 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsFontUI", "choose font size kvReport logID:%s , changeFontSize: %s, curFontSize:%s", 11609, java.lang.Integer.valueOf(this.f241918d), java.lang.Integer.valueOf(this.f241919e));
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(n14.e.class);
    }
}

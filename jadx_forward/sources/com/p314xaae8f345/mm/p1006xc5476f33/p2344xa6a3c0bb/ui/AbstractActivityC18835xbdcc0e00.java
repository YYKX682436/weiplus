package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI */
/* loaded from: classes15.dex */
public abstract class AbstractActivityC18835xbdcc0e00 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f257696w = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f257697d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f257698e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f257699f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4 f257700g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18848xa06e1dbc f257701h;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f257706p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f257707q;

    /* renamed from: i, reason: collision with root package name */
    public fq4.d0 f257702i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f257703m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f257704n = null;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f257705o = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f257708r = false;

    /* renamed from: s, reason: collision with root package name */
    public final fq4.a0 f257709s = new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.a(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f257710t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.b(this), true);

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f257711u = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.c(this), true);

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f257712v = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper(), new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.e(this));

    public void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseVoicePrintUI", "hideLoadingProgress: ");
        android.view.View view = this.f257707q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f257697d.setVisibility(0);
    }

    public void U6() {
        android.view.View view = this.f257706p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideRecorderBtnTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "hideRecorderBtnTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public abstract void V6();

    public abstract void W6();

    public void X6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseVoicePrintUI", "showLoadingProgress: ");
        android.view.View view = this.f257707q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "showLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "showLoadingProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f257697d.setVisibility(8);
    }

    public void Y6() {
        android.view.View view = this.f257706p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "startRecoderBtnPressCheck", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voiceprint/ui/BaseVoicePrintUI", "startRecoderBtnPressCheck", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        if (getIntent().hasExtra("trans_out_anim")) {
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, getIntent().getIntExtra("trans_out_anim", 0));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571137db5;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f257701h = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18848xa06e1dbc) findViewById(com.p314xaae8f345.mm.R.id.o_i);
        this.f257697d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.ln8);
        this.f257698e = findViewById(com.p314xaae8f345.mm.R.id.ln9);
        this.f257706p = findViewById(com.p314xaae8f345.mm.R.id.l3l);
        this.f257707q = findViewById(com.p314xaae8f345.mm.R.id.ln_);
        this.f257699f = findViewById(com.p314xaae8f345.mm.R.id.p89);
        this.f257700g = (com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.C18846x292f7cd4) findViewById(com.p314xaae8f345.mm.R.id.p8_);
        this.f257701h.a();
        this.f257700g.m72723x103d029d(this.f257697d);
        fq4.d0 d0Var = new fq4.d0();
        this.f257702i = d0Var;
        d0Var.f347119g = this.f257709s;
        this.f257697d.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.g(this));
        mo74406x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00.f257696w;
                com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.AbstractActivityC18835xbdcc0e00.this.finish();
                return true;
            }
        }, com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f257700g.f257750h.d();
        fq4.d0 d0Var = this.f257702i;
        if (d0Var != null) {
            d0Var.f347119g = null;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(fq4.u.a("voice_pt_voice_print_record.rec", false));
        if (r6Var.m()) {
            r6Var.l();
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(fq4.u.a("voice_pt_voice_print_noise_detect.rec", false));
        if (r6Var2.m()) {
            r6Var2.l();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseVoicePrintUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        } else if (i17 == 80 && iArr[0] != 0) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.a) this.f257709s).a();
        }
    }
}

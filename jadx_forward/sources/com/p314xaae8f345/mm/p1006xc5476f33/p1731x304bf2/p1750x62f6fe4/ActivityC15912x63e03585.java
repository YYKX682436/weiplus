package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.game.media.GameVideoDownloadUI */
/* loaded from: classes12.dex */
public class ActivityC15912x63e03585 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f221603s = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.m.b(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.l.ONE_WEEK) + "haowan/";

    /* renamed from: d, reason: collision with root package name */
    public int f221604d;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f221606f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f221607g;

    /* renamed from: h, reason: collision with root package name */
    public int f221608h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f221609i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f221610m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f221611n;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5.C15868x12159658 f221613p;

    /* renamed from: q, reason: collision with root package name */
    public i53.w3 f221614q;

    /* renamed from: e, reason: collision with root package name */
    public final i53.i4 f221605e = new i53.m3(this);

    /* renamed from: o, reason: collision with root package name */
    public long f221612o = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f221615r = 0;

    public final void T6(java.lang.String str) {
        i53.t3 t3Var = new i53.t3(this, findViewById(com.p314xaae8f345.mm.R.id.imn));
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dn.o oVar = new dn.o();
        oVar.f323318d = "task_GameVideoDownloadUI";
        oVar.f69601xaca5bdda = this.f221607g;
        oVar.M1 = str;
        oVar.H1 = 0;
        oVar.Z = 3;
        oVar.f323342y0 = 4;
        com.p314xaae8f345.mm.vfs.w6.u(com.p314xaae8f345.mm.vfs.w6.r(this.f221611n));
        oVar.f69595x6d25b0d9 = this.f221611n;
        oVar.f323348c2 = new i53.v3(this, currentTimeMillis, str, t3Var);
        this.f221612o = java.lang.System.currentTimeMillis();
        i53.w3 w3Var = new i53.w3(this, oVar);
        this.f221614q = w3Var;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(w3Var, 500L);
    }

    public final void U6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "cancel video download!");
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this.f221606f, 87, 8760, 1, 2, this.f221610m, this.f221615r, lj0.a.a(this.f221608h, V6(0)));
        int i17 = this.f221608h;
        if (i17 == 3) {
            ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai(this.f221609i, "video download cancel", this.f221610m, -2, "video download cancel");
        } else if (i17 == 5) {
            setResult(-1, new android.content.Intent().putExtra("webview_callback_err", 1));
        }
        finish();
    }

    public final java.util.Map V6(int i17) {
        long currentTimeMillis = this.f221612o != 0 ? java.lang.System.currentTimeMillis() - this.f221612o : 0L;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("costtime", java.lang.Long.valueOf(currentTimeMillis));
        hashMap.put("failid", java.lang.Integer.valueOf(i17));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bhy;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if ((this.f221604d == 11) || i17 != 223) {
            return;
        }
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.f221604d == 11) {
            ((i53.m3) this.f221605e).a();
        } else {
            U6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        m78583x85ccfe01(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        this.f221606f = this;
        int intExtra = getIntent().getIntExtra("game_from", -1);
        this.f221604d = intExtra;
        if (intExtra == 11) {
            i53.m3 m3Var = (i53.m3) this.f221605e;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m3Var.f370191a;
            java.lang.String stringExtra = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("video_url");
            java.lang.String stringExtra2 = abstractActivityC21394xb3d2c0cf.getIntent().getStringExtra("thumb_url");
            m3Var.f370194d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5.C15868x12159658) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565554cq2);
            abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.f565650d33).setOnClickListener(new i53.e3(m3Var));
            android.widget.ImageView imageView = (android.widget.ImageView) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.oz8);
            android.widget.ImageView imageView2 = (android.widget.ImageView) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.oyi);
            int h17 = r53.f.h(abstractActivityC21394xb3d2c0cf);
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams.width = h17;
            layoutParams.height = (h17 * 1080) / 1920;
            imageView2.setLayoutParams(layoutParams);
            imageView.setVisibility(8);
            imageView2.setVisibility(0);
            n11.a b17 = n11.a.b();
            o11.f fVar = new o11.f();
            fVar.f423611b = true;
            b17.i(stringExtra2, imageView, fVar.a(), new i53.g3(m3Var, imageView, imageView2));
            m3Var.f370193c = i53.m3.f370190f + "MMVideo_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(stringExtra) + ".mp4";
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MMVideo_");
            sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(stringExtra.getBytes()));
            m3Var.f370192b = sb6.toString();
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(abstractActivityC21394xb3d2c0cf)) {
                m3Var.b(stringExtra);
            } else {
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m3Var.f370191a;
                db5.e1.C(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpu), "", abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fps), abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpr), false, new i53.h3(m3Var, stringExtra), new i53.i3(m3Var));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameVideoDownloadPerform", "onCreate");
            return;
        }
        this.f221608h = getIntent().getIntExtra("from", -1);
        this.f221609i = getIntent().getStringExtra("business_type");
        this.f221610m = getIntent().getStringExtra("appid");
        java.lang.String stringExtra3 = getIntent().getStringExtra("video_url");
        java.lang.String stringExtra4 = getIntent().getStringExtra("thumb_url");
        this.f221615r = getIntent().getIntExtra("game_haowan_source_scene_id", 0);
        this.f221613p = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1740x373aa5.C15868x12159658) findViewById(com.p314xaae8f345.mm.R.id.f565554cq2);
        findViewById(com.p314xaae8f345.mm.R.id.f565650d33).setOnClickListener(new i53.n3(this));
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.oz8);
        android.widget.ImageView imageView4 = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.oyi);
        int h18 = r53.f.h(this.f221606f);
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) imageView4.getLayoutParams();
        layoutParams2.width = h18;
        layoutParams2.height = (h18 * 1080) / 1920;
        imageView4.setLayoutParams(layoutParams2);
        imageView3.setVisibility(8);
        imageView4.setVisibility(0);
        n11.a b18 = n11.a.b();
        o11.f fVar2 = new o11.f();
        fVar2.f423611b = true;
        b18.i(stringExtra4, imageView3, fVar2.a(), new i53.p3(this, imageView3, imageView4));
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("ext_data");
        if (bundleExtra != null) {
            this.f221611n = bundleExtra.getString("key_video_cache_path");
            this.f221607g = bundleExtra.getString("key_video_media_id");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "video cache path:%s", this.f221611n);
        if (!com.p314xaae8f345.mm.vfs.w6.j(this.f221611n)) {
            this.f221611n = f221603s + "MMVideo_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(stringExtra3) + ".mp4";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f221607g)) {
            this.f221607g = "MMVideo_" + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(stringExtra3);
        }
        if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(this) || this.f221608h != 3) {
            T6(stringExtra3);
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpv), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.fps), getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpr), false, new i53.q3(this, stringExtra3), new i53.r3(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoDownloadUI", "onCreate");
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.f(this, 87, 8760, 0, 1, this.f221610m, this.f221615r, lj0.a.a(this.f221608h, null));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!(this.f221604d == 11)) {
            i53.w3 w3Var = this.f221614q;
            if (w3Var != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(w3Var);
            }
            ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
            t21.o2.Di().g(this.f221607g, null);
            return;
        }
        i53.m3 m3Var = (i53.m3) this.f221605e;
        i53.l3 l3Var = m3Var.f370195e;
        if (l3Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(l3Var);
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        t21.o2.Di().g(m3Var.f370192b, null);
    }
}

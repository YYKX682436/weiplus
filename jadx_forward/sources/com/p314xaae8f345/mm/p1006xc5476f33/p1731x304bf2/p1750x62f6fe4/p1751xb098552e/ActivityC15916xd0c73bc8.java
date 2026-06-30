package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.game.media.background.GameFakeVideoUI */
/* loaded from: classes10.dex */
public class ActivityC15916xd0c73bc8 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f221634d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f221635e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f221636f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f221637g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f221638h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f221639i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f221640m;

    /* renamed from: n, reason: collision with root package name */
    public ru3.c f221641n;

    /* renamed from: o, reason: collision with root package name */
    public long f221642o;

    /* renamed from: p, reason: collision with root package name */
    public long f221643p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f221644q = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new j53.f(this), true);

    /* renamed from: r, reason: collision with root package name */
    public int f221645r = 0;

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bfr;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "on completion, startTime:%d", java.lang.Long.valueOf(this.f221642o));
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) this.f221635e).a(this.f221642o, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m78531x8f8cf1fb();
        getWindow().setFlags(1024, 1024);
        if (com.p314xaae8f345.mm.p642xad8b531f.b.d() != null) {
            com.p314xaae8f345.mm.p642xad8b531f.b.d().a();
        }
        this.f221634d = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.p0w);
        this.f221636f = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ght);
        this.f221637g = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f569096p06);
        this.f221638h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.oyr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.C15917xbbe862f9 c15917xbbe862f9 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.C15917xbbe862f9(this);
        this.f221635e = c15917xbbe862f9;
        c15917xbbe862f9.mo69326x360a109e(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f221637g.addView((android.view.View) this.f221635e, layoutParams);
        java.lang.String stringExtra = getIntent().getStringExtra("game_bg_mix_fake_local_id");
        if (stringExtra == null || !stringExtra.startsWith("weixin://bgmixid/")) {
            setResult(101);
            finish();
            return;
        }
        java.lang.String taskId = stringExtra.replace("weixin://bgmixid/", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "bgMixTaskId:%s", taskId);
        ((pc0.m2) ((qc0.j1) i95.n0.c(qc0.j1.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        lt3.g b17 = lt3.n.f402793a.b(taskId);
        if (b17 == null || b17.t0() == null) {
            setResult(102);
            finish();
            return;
        }
        java.lang.String str = b17.t0().f463904n;
        this.f221639i = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "videoPath:%s", str);
        r45.hi0 hi0Var = new r45.hi0();
        byte[] bArr = b17.f68200xeed4d673;
        if (bArr != null) {
            try {
                hi0Var.mo11468x92b714fd(bArr);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        this.f221642o = hi0Var.f457714e;
        this.f221643p = hi0Var.f457715f;
        ((pc0.c) ((qc0.x0) i95.n0.c(qc0.x0.class))).getClass();
        lt3.e eVar = lt3.e.f402742a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 c17034x841bd646 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646(this);
        this.f221641n = c17034x841bd646;
        this.f221637g.addView(c17034x841bd646, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f221641n.mo68062xa62b12b2(b17);
        this.f221635e.mo69318x764d819b(((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646) this.f221641n).f237423h);
        this.f221637g.setOnTouchListener(new j53.e(this));
        this.f221640m = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(this);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) this.f221635e).mo69303x360802();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 c17034x841bd646 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646) this.f221641n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: stopFakeLayer ");
        r45.hi0 hi0Var = c17034x841bd646.f237420e;
        sb6.append(hi0Var != null ? java.lang.Long.valueOf(hi0Var.f457729w) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17034x841bd646.f237419d, sb6.toString());
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = c17034x841bd646.f237421f;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100976x360802();
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc62 = c17034x841bd646.f237421f;
        if (interfaceC26164x73fc6bc62 != null) {
            interfaceC26164x73fc6bc62.mo100933x41012807();
        }
        c17034x841bd646.f237421f = null;
        int childCount = c17034x841bd646.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c17034x841bd646.getChildAt(i17);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) childAt).y();
            } else if (childAt instanceof zu3.v) {
                ((zu3.v) childAt).Q = false;
            }
        }
        c17034x841bd646.f237426n = false;
        android.widget.ImageView imageView = c17034x841bd646.f237424i;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.widget.ImageView imageView2 = c17034x841bd646.f237424i;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        zv3.g gVar = c17034x841bd646.f237425m;
        if (gVar != null) {
            gVar.c();
        }
        c17034x841bd646.f237425m = null;
        this.f221644q.d();
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        setResult(0);
        this.f221635e.mo69303x360802();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameFakeVideoUI", "play video error what %d extra %d.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) this.f221635e).mo69313x65825f6();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646 c17034x841bd646 = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.C17034x841bd646) this.f221641n;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: pauseFakeLayer ");
        r45.hi0 hi0Var = c17034x841bd646.f237420e;
        sb6.append(hi0Var != null ? java.lang.Long.valueOf(hi0Var.f457729w) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17034x841bd646.f237419d, sb6.toString());
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = c17034x841bd646.f237421f;
        if (interfaceC26164x73fc6bc6 != null) {
            interfaceC26164x73fc6bc6.mo100930x65825f6();
        }
        int childCount = c17034x841bd646.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = c17034x841bd646.getChildAt(i17);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) childAt).m64932x65825f6();
            } else if (childAt instanceof zu3.v) {
                ((zu3.v) childAt).Q = false;
            }
        }
        c17034x841bd646.f237426n = false;
        android.widget.ImageView imageView = c17034x841bd646.f237424i;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        android.widget.ImageView imageView2 = c17034x841bd646.f237424i;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        zv3.g gVar = c17034x841bd646.f237425m;
        if (gVar != null) {
            gVar.c();
        }
        c17034x841bd646.f237425m = null;
        super.onPause();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f221635e;
        if (f4Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.C15917xbbe862f9) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.C15917xbbe862f9) f4Var).setKeepScreenOn(false);
        }
        qp1.h0.b();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        setResult(-1);
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) this.f221635e).mo69330x68ac462();
        this.f221645r = ((int) (this.f221643p - this.f221642o)) / 1000;
        this.f221644q.c(500L, 500L);
        ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) this.f221635e).a(this.f221642o, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "onPrepared videoView.start duration:%d", java.lang.Integer.valueOf(this.f221645r));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, android.graphics.Matrix] */
    /* JADX WARN: Type inference failed for: r6v15 */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.ActivityC15916xd0c73bc8.onResume():void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        if (!this.f221635e.mo69311xc00617a4()) {
            return 0;
        }
        long mo69307x9746038c = this.f221635e.mo69307x9746038c();
        long j17 = this.f221643p;
        if (mo69307x9746038c < j17 || j17 >= this.f221635e.mo69286x51e8b0a()) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameFakeVideoUI", "currentPosition:%d reach endTime:%d, seekTo startTime:%d", java.lang.Integer.valueOf(this.f221635e.mo69307x9746038c()), java.lang.Long.valueOf(this.f221643p), java.lang.Long.valueOf(this.f221642o));
        this.f221635e.a(this.f221642o, true);
        return 0;
    }
}

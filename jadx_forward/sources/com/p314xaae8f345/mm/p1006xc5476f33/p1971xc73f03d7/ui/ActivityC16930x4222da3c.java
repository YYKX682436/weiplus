package com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui;

/* renamed from: com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage */
/* loaded from: classes8.dex */
public class ActivityC16930x4222da3c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int F = 0;
    public long B;
    public java.lang.String E;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f236343d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f236344e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ProgressBar f236345f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f236346g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f236347h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f236348i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f236349m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f236350n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f236351o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f236352p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f236353q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f236354r;

    /* renamed from: s, reason: collision with root package name */
    public int f236355s;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f236357u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f236358v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f236359w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f236360x;

    /* renamed from: y, reason: collision with root package name */
    public long f236361y;

    /* renamed from: t, reason: collision with root package name */
    public boolean f236356t = false;

    /* renamed from: z, reason: collision with root package name */
    public boolean f236362z = true;
    public int A = 0;
    public int C = 0;
    public boolean D = false;

    public static void T6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c, java.lang.String str) {
        activityC16930x4222da3c.getClass();
        java.lang.String n17 = com.p314xaae8f345.mm.vfs.w6.n(str);
        if (n17 == null || n17.length() == 0) {
            return;
        }
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).wi(activityC16930x4222da3c, str, n17, 3);
    }

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c) {
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(activityC16930x4222da3c.Z6(true));
        activityC16930x4222da3c.f236345f.setProgress((int) ((100 * k17) / activityC16930x4222da3c.f236361y));
        activityC16930x4222da3c.f236348i.setText(activityC16930x4222da3c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gpl, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(k17), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(activityC16930x4222da3c.f236361y)));
        if (activityC16930x4222da3c.A != 1 || (activityC16930x4222da3c.B == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16930x4222da3c.E))) {
            activityC16930x4222da3c.f236348i.setVisibility(8);
        } else {
            activityC16930x4222da3c.f236348i.setVisibility(0);
        }
    }

    public final void V6() {
        if (com.p314xaae8f345.mm.vfs.w6.j(Z6(true))) {
            com.p314xaae8f345.mm.vfs.w6.k(Z6(true));
            this.A = 2;
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(Z6(false))) {
            this.A = 3;
            return;
        }
        if (!com.p314xaae8f345.mm.vfs.w6.j(Y6())) {
            this.A = 0;
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.k(Y6()) == this.f236361y) {
            com.p314xaae8f345.mm.vfs.w6.P(this.f236354r, this.f236357u, X6());
            this.A = 3;
        } else if (com.p314xaae8f345.mm.vfs.w6.k(Y6()) <= this.f236361y) {
            this.A = 0;
        } else {
            com.p314xaae8f345.mm.vfs.w6.h(Y6());
            this.A = 4;
        }
    }

    public final void W6() {
        V6();
        int i17 = this.A;
        if (i17 == 4) {
            int i18 = this.C;
            if (i18 < 5) {
                this.C = i18 + 1;
                W6();
            } else {
                b7();
            }
        } else if (i17 == 3) {
            com.p314xaae8f345.mm.vfs.w6.P(this.f236354r, X6() + ".temp", X6());
            this.A = 3;
            b7();
        }
        java.lang.String Z6 = Z6(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AttachDownloadPage", "download attach url %s, isBigAttach %b", this.f236360x, java.lang.Boolean.valueOf(this.D));
        if (this.D) {
            this.E = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(this.f236360x);
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest c2CDownloadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadRequest();
            c2CDownloadRequest.f17792xcd096f43 = this.E;
            c2CDownloadRequest.url = this.f236360x;
            c2CDownloadRequest.m37861xfb0731c4(Z6);
            c2CDownloadRequest.f17782x37c415e = java.lang.String.format("cookie:%s", getIntent().getStringExtra("qqmail_cookie"), "");
            ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37789x737fa05e(c2CDownloadRequest, null, new os3.m(this), 0);
            return;
        }
        java.lang.String str = this.f236360x;
        java.lang.String stringExtra = getIntent().getStringExtra("qqmail_cookie");
        os3.a aVar = new os3.a(this);
        java.lang.String str2 = is3.d.f376014a;
        is3.c cVar = new is3.c(str, Z6, aVar);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("param_cookie", stringExtra);
        cVar.f(bundle);
    }

    public final java.lang.String X6() {
        java.lang.String str;
        java.lang.String str2;
        int hashCode = this.f236359w.hashCode() & 65535;
        int lastIndexOf = this.f236357u.lastIndexOf(".");
        if (lastIndexOf != -1) {
            str = this.f236357u.substring(0, lastIndexOf);
            java.lang.String str3 = this.f236357u;
            str2 = str3.substring(lastIndexOf, str3.length());
        } else {
            str = this.f236357u;
            str2 = "";
        }
        return java.lang.String.format("%s_%d%s", str, java.lang.Integer.valueOf(hashCode), str2);
    }

    public final java.lang.String Y6() {
        return this.f236354r + this.f236357u;
    }

    public final java.lang.String Z6(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f236354r);
        sb6.append(X6());
        sb6.append(!z17 ? "" : ".temp");
        return sb6.toString();
    }

    public final void a7() {
        android.view.View view = this.f236344e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236349m.setVisibility(8);
        this.f236350n.setVisibility(8);
        this.f236346g.setVisibility(0);
        this.f236347h.setVisibility(8);
        this.f236348i.setVisibility(8);
        this.f236352p.setVisibility(8);
        this.f236353q.setVisibility(8);
        this.f236346g.setOnClickListener(new os3.e(this));
        this.f236347h.setOnClickListener(new os3.f(this));
    }

    public final void b7() {
        int i17 = this.f236355s;
        if (i17 != 1) {
            if (i17 == 0) {
                android.view.View view = this.f236344e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f236349m.setVisibility(8);
                this.f236350n.setVisibility(0);
                this.f236348i.setVisibility(8);
                this.f236352p.setVisibility(0);
                this.f236353q.setVisibility(8);
                int i18 = this.A;
                if (i18 == 3) {
                    this.f236350n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpk);
                    m78501x43e00957(true);
                } else if (i18 == 2) {
                    this.f236350n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpr);
                } else {
                    this.f236350n.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gph);
                }
                this.f236352p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpj);
                this.f236350n.setOnClickListener(new os3.j(this));
                return;
            }
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.g1.a(this.f236357u)) {
            int i19 = this.A;
            if (i19 == 3) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_favorite", true);
                intent.putExtra("key_favorite_source_type", 9);
                intent.putExtra("key_image_path", Z6(false));
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.B(mo55332x76847179(), intent);
                finish();
                return;
            }
            if (i19 == 0 || this.f236362z) {
                this.C = 0;
                this.f236362z = false;
                W6();
                a7();
                return;
            }
        }
        android.view.View view2 = this.f236344e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "renderNotDownloadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f236352p.setVisibility(0);
        this.f236348i.setVisibility(8);
        this.f236349m.setVisibility(0);
        this.f236350n.setVisibility(8);
        this.f236353q.setVisibility(0);
        this.f236349m.setOnClickListener(new os3.g(this));
        if (this.A == 3) {
            this.f236352p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpq);
            this.f236353q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpn);
            this.f236353q.setOnClickListener(new os3.h(this));
            m78501x43e00957(true);
            return;
        }
        this.f236352p.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpq);
        if (this.A == 2) {
            this.f236353q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpp);
        } else {
            this.f236353q.setText(com.p314xaae8f345.mm.R.C30867xcad56011.gpo);
        }
        this.f236353q.setOnClickListener(new os3.i(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569693is;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f236343d = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) findViewById(com.p314xaae8f345.mm.R.id.f565658d45);
        this.f236344e = findViewById(com.p314xaae8f345.mm.R.id.d3v);
        this.f236345f = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.d3t);
        this.f236346g = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.f565653d40);
        this.f236347h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.d3z);
        this.f236348i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a68);
        this.f236349m = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.a6_);
        this.f236350n = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.a67);
        this.f236351o = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f564818a66);
        this.f236352p = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a69);
        this.f236353q = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.a6a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.g1.a(this.f236357u)) {
            this.f236343d.setBackgroundResource(com.p314xaae8f345.mm.R.raw.f78994x211254f4);
        } else {
            java.lang.String str = this.f236357u;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            java.lang.String lowerCase = str.toLowerCase();
            if (lowerCase.endsWith(".mp3") || lowerCase.endsWith(".wma") || lowerCase.endsWith(".mp4") || lowerCase.endsWith(".rm")) {
                this.f236343d.setImageResource(com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc);
            } else {
                this.f236343d.setImageResource(((ot.g) ((pt.m0) i95.n0.c(pt.m0.class))).fj(false, com.p314xaae8f345.mm.vfs.w6.n(this.f236357u), false, false));
            }
        }
        mo54448x9c8c0d33(new os3.b(this));
        mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80306x8f6ba587, new os3.d(this));
        m78501x43e00957(false);
        V6();
        if (this.A == 1) {
            a7();
        } else {
            b7();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f(this, i17, i18, intent, true, com.p314xaae8f345.mm.R.C30867xcad56011.brq, com.p314xaae8f345.mm.R.C30867xcad56011.brr, 3);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i17 = getResources().getConfiguration().orientation;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f236351o.getLayoutParams();
        if (i17 == 2) {
            layoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 60);
        } else if (i17 == 1) {
            layoutParams.bottomMargin = com.p314xaae8f345.mm.ui.zk.a(mo55332x76847179(), 120);
        }
        this.f236351o.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f236355s = getIntent().getIntExtra("is_preview", 0);
        this.f236356t = getIntent().getBooleanExtra("is_compress", false);
        this.f236357u = getIntent().getStringExtra("attach_name");
        this.f236358v = getIntent().getStringExtra("mail_id");
        this.f236359w = getIntent().getStringExtra("attach_id");
        this.f236360x = ks3.k0.c() + getIntent().getStringExtra("attach_url");
        this.f236361y = (long) getIntent().getIntExtra("total_size", 0);
        this.D = getIntent().getBooleanExtra("is_big_attach", false);
        this.f236354r = ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().d();
        mo54450xbf7c1df6(this.f236357u);
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().b(this.B);
        if (!this.D || com.p314xaae8f345.mm.vfs.w6.j(Y6()) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.E)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AttachDownloadPage", "onDestroy: cancel downloading big attach, delete temp file");
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37741x70920b1f(this.E);
        this.E = null;
        com.p314xaae8f345.mm.vfs.w6.h(Z6(true));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

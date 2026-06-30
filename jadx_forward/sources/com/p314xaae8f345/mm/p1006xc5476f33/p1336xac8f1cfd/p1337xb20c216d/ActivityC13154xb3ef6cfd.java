package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* renamed from: com.tencent.mm.plugin.component.editor.EditorFileUI */
/* loaded from: classes12.dex */
public class ActivityC13154xb3ef6cfd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    public static final /* synthetic */ int A = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final long f177990z = ip.c.k();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f177991d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f177992e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f177993f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21405x85fc1ce0 f177994g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f177995h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177996i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f177997m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f177998n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f177999o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f178000p;

    /* renamed from: s, reason: collision with root package name */
    public r45.gp0 f178003s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a f178004t;

    /* renamed from: y, reason: collision with root package name */
    public boolean f178009y;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f178001q = null;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f178002r = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();

    /* renamed from: u, reason: collision with root package name */
    public boolean f178005u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f178006v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f178007w = false;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.e f178008x = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.r(this);

    public final int T6() {
        int i17 = this.f178003s.I;
        if (i17 == 15) {
            return 4;
        }
        if (i17 == 10130) {
            return 8;
        }
        return i17;
    }

    public final void U6() {
        r45.jp0 jp0Var;
        if (this.f178004t.getFileStatus() != 1) {
            this.f178004t.mo65014x87c0aa90(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a abstractC16084xdca2b46a = this.f178004t;
            java.lang.String c17 = hx1.b.c(this.f178003s);
            if (c17 == null) {
                c17 = "";
            }
            abstractC16084xdca2b46a.mo65015xc5e6b9d6(c17);
            ((d73.i) i95.n0.c(d73.i.class)).Ja(this.f178004t);
            ((d73.i) i95.n0.c(d73.i.class)).Jc(this.f178004t);
        }
        if (T6() == 15 && (jp0Var = this.f178003s.O1) != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var.f459531d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178003s.O1.f459534g)) {
            this.f178006v = true;
            this.f177994g.setVisibility(8);
            android.view.View view = this.f177999o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f177993f.setVisibility(8);
            this.f177991d.setVisibility(8);
            this.f177992e.setVisibility(8);
            this.f177996i.setVisibility(8);
            java.lang.String c18 = hx1.b.c(this.f178003s);
            fp.k.b();
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.oy7);
            this.f178001q = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.n8.a(mo55332x76847179());
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            viewGroup.addView((android.view.View) this.f178001q, 0, layoutParams);
            this.f178001q.mo69326x360a109e(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.w(this));
            fp.k.b();
            if (c18 != null) {
                this.f178001q.mo69303x360802();
                this.f178001q.mo69327xab3268fe(c18);
            }
            fp.k.b();
        }
        if (T6() != 15 && T6() != 4) {
            android.view.View view2 = this.f177999o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f177993f.setVisibility(4);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178003s.A)) {
                this.f177991d.setVisibility(8);
            } else {
                this.f177991d.setVisibility(0);
            }
            this.f177992e.setVisibility(0);
            this.f177996i.setVisibility(0);
            return;
        }
        if (this.f178006v) {
            return;
        }
        android.view.View view3 = this.f177999o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f177993f.setVisibility(8);
        this.f177991d.setVisibility(8);
        this.f177992e.setVisibility(0);
        this.f177992e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cb9);
        this.f177996i.setVisibility(8);
        X6();
    }

    public final void V6() {
        this.f177993f.setVisibility(8);
        this.f177991d.setVisibility(8);
        this.f177992e.setVisibility(8);
        android.view.View view = this.f177999o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f177996i.setVisibility(0);
        if (this.f178003s.I == 4) {
            this.f177996i.setGravity(17);
            this.f177996i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cbv);
            return;
        }
        this.f177996i.setGravity(17);
        this.f177996i.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cbu);
        if (this.f178009y) {
            return;
        }
        this.f178009y = true;
    }

    public final void W6() {
        android.view.View view = this.f177999o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/EditorFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/component/editor/EditorFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f177992e.setVisibility(8);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178003s.A)) {
            this.f177991d.setVisibility(8);
        } else {
            this.f177991d.setVisibility(0);
        }
        this.f177993f.setVisibility(0);
        this.f177993f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cb7);
        this.f177996i.setVisibility(8);
    }

    public final void X6() {
        if (this.f178007w) {
            return;
        }
        this.f178007w = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_fav_path", hx1.b.c(this.f178003s));
        intent.putExtra("key_detail_fav_thumb_path", hx1.b.e(this.f178003s));
        intent.putExtra("key_detail_fav_video_duration", this.f178003s.f456981y);
        intent.putExtra("key_detail_statExtStr", this.f178003s.R1);
        intent.putExtra("key_detail_fav_video_scene_from", 1);
        intent.putExtra("key_detail_msg_uuid", this.f178003s.f456964q2);
        o72.x1.L0(this, ".ui.detail.FavoriteVideoPlayUI", intent, null);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a5e;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.f(this, i17, i18, intent, true, com.p314xaae8f345.mm.R.C30867xcad56011.brq, com.p314xaae8f345.mm.R.C30867xcad56011.brr, 5);
        if (i18 == -1 && i17 == 1001) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent != null ? intent.getStringExtra("custom_send_text") : null;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null);
            T6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.x xVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.x(this, Q);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.h(this, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(",")), stringExtra2, xVar));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f178003s = new r45.gp0();
        try {
            this.f178003s.mo11468x92b714fd(getIntent().getByteArrayExtra("data_item_key"));
        } catch (java.io.IOException unused) {
        }
        this.f177991d = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.l3u);
        this.f177992e = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.kio);
        this.f177993f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.f565648d31);
        this.f177994g = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) findViewById(com.p314xaae8f345.mm.R.id.h6y);
        this.f177995h = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.k3s);
        this.f177996i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568867ob5);
        this.f178000p = findViewById(com.p314xaae8f345.mm.R.id.f565653d40);
        this.f177999o = findViewById(com.p314xaae8f345.mm.R.id.d3v);
        this.f177997m = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.d3t);
        this.f177998n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.d3x);
        if (4 == T6()) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.cdy);
        } else if (15 == T6()) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ccx);
            findViewById(com.p314xaae8f345.mm.R.id.oy7).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3);
        } else {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.cav);
        }
        if (T6() == 4) {
            this.f177994g.setImageResource(com.p314xaae8f345.mm.R.raw.f78433xb28fb9bc);
        } else {
            this.f177994g.setImageResource(o25.y.a(this.f178003s.K));
        }
        this.f177995h.setText(this.f178003s.f456937d);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.j(this));
        this.f177992e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.k(this));
        java.lang.String str = this.f178003s.A;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f177991d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.l(this, str));
        }
        this.f177993f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.m(this));
        this.f178000p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.n(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a Ai = ((a70.e) ((b70.e) i95.n0.c(b70.e.class))).Ai(this.f178003s, null, null, hx1.b.c(null));
        this.f178004t = Ai;
        Ai.mo65016x22dcbf1d(1);
        this.f178004t.mo65014x87c0aa90(com.p314xaae8f345.mm.vfs.w6.j(hx1.b.c(this.f178003s)) ? 1 : 2);
        ((d73.i) i95.n0.c(d73.i.class)).Ja(this.f178004t);
        ((d73.i) i95.n0.c(d73.i.class)).Ma(this.f178004t);
        if (T6() != 15 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SightForwardEnable"), 0) == 1) {
            mo74404x84f07bce(0, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u(this));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EditorFileUI", "can not retransmit sight msg");
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178003s.f456967s) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178003s.f456971u);
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178003s.f456944g2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f178003s.f456940e2);
        if (!z17 && !z18) {
            V6();
        } else if (com.p314xaae8f345.mm.vfs.w6.j(hx1.b.c(this.f178003s))) {
            m78501x43e00957(true);
            U6();
        } else {
            W6();
            m78501x43e00957(false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d.b(this.f178008x);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f178001q;
        if (f4Var != null) {
            f4Var.mo69326x360a109e(null);
            this.f178001q.mo69303x360802();
            this.f178001q.mo69312x3f5eee52();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f fVar = com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.f.f178086d;
        fVar.e(this.f178003s.T);
        ((java.util.ArrayList) fVar.f178087a).remove(this.f178008x);
        if (this.f178004t != null) {
            ((d73.i) i95.n0.c(d73.i.class)).a9(this.f178004t);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f178001q;
        if (f4Var != null) {
            f4Var.mo69303x360802();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f178001q;
        if (f4Var != null) {
            f4Var.mo69330x68ac462();
        }
    }
}

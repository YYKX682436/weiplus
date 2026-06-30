package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* renamed from: com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI */
/* loaded from: classes12.dex */
public class ActivityC13592x95a8d706 extends com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43 implements o72.x3, l75.q0 {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f182169m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f182170n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda f182171o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f182172p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f182173q;

    /* renamed from: r, reason: collision with root package name */
    public o72.r2 f182174r;

    /* renamed from: s, reason: collision with root package name */
    public r45.gp0 f182175s;

    /* renamed from: t, reason: collision with root package name */
    public long f182176t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f182177u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f182178v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f182179w = false;

    /* renamed from: x, reason: collision with root package name */
    public boolean f182180x = false;

    /* renamed from: y, reason: collision with root package name */
    public final o72.b3 f182181y = new o72.b3();

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f182182z = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.m1(this);
    public boolean A = false;

    public static void Z6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13592x95a8d706 activityC13592x95a8d706, boolean z17, android.content.Context context) {
        r45.rp0 rp0Var;
        r45.gp0 J2 = o72.x1.J(activityC13592x95a8d706.f182174r);
        if (J2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteSightDetailUI", "goPlayView, but dataitem is null , exit");
            return;
        }
        r45.jp0 jp0Var = J2.O1;
        o72.u2 u2Var = activityC13592x95a8d706.f182133g;
        if (jp0Var != null && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var.f459531d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J2.O1.f459534g))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", "it is ad sight.use sight play");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_detail_fav_scene", u2Var.f425009a);
            intent.putExtra("key_detail_fav_sub_scene", u2Var.f425026r);
            intent.putExtra("key_detail_info_id", activityC13592x95a8d706.f182174r.f67645x88be67a1);
            intent.putExtra("key_detail_data_id", J2.T);
            intent.putExtra("key_detail_can_delete", false);
            o72.x1.L0(context, ".ui.detail.FavoriteFileDetailUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("key_detail_info_id", activityC13592x95a8d706.f182174r.f67645x88be67a1);
        intent2.putExtra("key_detail_fav_scene", u2Var.f425009a);
        intent2.putExtra("key_detail_fav_sub_scene", u2Var.f425026r);
        intent2.putExtra("key_detail_fav_path", o72.x1.x(J2));
        intent2.putExtra("key_detail_fav_thumb_path", o72.x1.X(J2));
        intent2.putExtra("key_detail_fav_video_duration", J2.f456981y);
        intent2.putExtra("key_detail_statExtStr", J2.R1);
        intent2.putExtra("key_detail_data_valid", z17);
        intent2.putExtra("key_detail_msg_uuid", J2.f456964q2);
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj("clicfg_media_gallery_ui_fav", "0").equals("1")) {
            o72.x1.L0(context, ".ui.detail.FavoriteVideoPlayUI", intent2, null);
            return;
        }
        r45.hp0 hp0Var = J2.J1;
        r45.qp0 qp0Var = hp0Var.f457902w;
        if (qp0Var == null) {
            qp0Var = hp0Var.f457903x;
        }
        if (qp0Var != null && (rp0Var = qp0Var.f465705q) != null) {
            intent2.putExtra("img_gallery_width", rp0Var.f466605f).putExtra("img_gallery_height", qp0Var.f465705q.f466606g).putExtra("img_gallery_left", qp0Var.f465705q.f466603d).putExtra("img_gallery_top", qp0Var.f465705q.f466604e);
        }
        try {
            pf5.j0.a(intent2, bi5.a.class);
            o72.x1.L0(context, "com.tencent.mm.ui.media.MediaGalleryContainerUI", intent2, null);
        } catch (java.lang.ClassNotFoundException unused) {
        }
    }

    @Override // o72.x3
    public void R4(o72.e2 e2Var) {
        java.lang.String str;
        if (e2Var == null || (str = e2Var.f67085xf604e54a) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, item is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, dataID is %s, field id is %s,offset is %d, total is %d,cdn status is %d, cdn type is %d (send or recieve)", this.f182175s.T, str, java.lang.Integer.valueOf(e2Var.f67090x90a9378), java.lang.Integer.valueOf(e2Var.f67094xeb1a61d6), java.lang.Integer.valueOf(e2Var.f67093x10a0fed7), java.lang.Integer.valueOf(e2Var.f67095x2262335f));
        if (e2Var.f67090x90a9378 > e2Var.f67094xeb1a61d6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, cdn offset length > cdn total length, do cdnLengthError()");
            if (1 == e2Var.f67095x2262335f) {
                e2Var.f67093x10a0fed7 = 2;
            } else {
                e2Var.f67093x10a0fed7 = 4;
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().A5(e2Var, new java.lang.String[0]);
            if (e2Var.f67095x2262335f == 0) {
                o72.x1.S0(e2Var);
            }
            if (e2Var.f67095x2262335f == 1) {
                o72.x1.P0(e2Var);
            }
        }
        if (e2Var.f67085xf604e54a.equals(this.f182175s.T)) {
            this.f182171o.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.n1(this, (int) e2Var.v0()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58 V6() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22623xe6f21e58) findViewById(com.p314xaae8f345.mm.R.id.mcm);
    }

    public final void a7() {
        java.lang.String x17 = o72.x1.x(this.f182175s);
        if (com.p314xaae8f345.mm.vfs.w6.j(x17)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("is265: ");
            ((vf0.h1) ((wf0.f1) i95.n0.c(wf0.f1.class))).getClass();
            sb6.append(x17 == null ? false : com.p314xaae8f345.mm.p962x4177e4be.j.h(x17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", sb6.toString());
            this.f182172p.mo69303x360802();
            this.f182172p.mo69318x764d819b(true);
            this.f182172p.mo69327xab3268fe(x17);
        }
    }

    public final void b7(boolean z17) {
        if (!this.f182174r.I0()) {
            o72.r2 r2Var = this.f182174r;
            if (r2Var.f67644x3059914a == 8) {
                k82.c.f386420a.e(this.f182176t, 1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f182175s.f456967s)) {
                    this.f182170n.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
                } else {
                    this.f182170n.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
                    if (z17) {
                        db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.brf));
                    }
                }
            } else if (r2Var.P0()) {
                k82.c.f386420a.e(this.f182176t, 4);
                this.f182170n.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
                if (z17) {
                    db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_9));
                }
            } else {
                if (this.f182174r.J0() || this.f182174r.Q0()) {
                    this.f182170n.setVisibility(8);
                    this.f182171o.setVisibility(0);
                    o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.f182175s.T);
                    if (Xf != null) {
                        this.f182171o.m81381x3ae760af((int) Xf.v0());
                    } else {
                        this.f182171o.m81381x3ae760af(0);
                    }
                    this.f182173q.setVisibility(0);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteSightDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                this.f182170n.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
            }
        } else {
            if (o72.x1.i0(this.f182175s)) {
                this.f182170n.setVisibility(8);
                this.f182171o.setVisibility(8);
                a7();
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.l1(this));
                return;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f182175s.f456967s)) {
                k82.c.f386420a.e(this.f182176t, 3);
                this.f182170n.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
                this.f182170n.setImageResource(com.p314xaae8f345.mm.R.raw.f81043x73ab7191);
            }
        }
        this.f182170n.setVisibility(0);
        this.f182171o.setVisibility(8);
        this.f182173q.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.acc;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1 || -1 != i18) {
            super.onActivityResult(i17, i18, intent);
            return;
        }
        java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
        java.lang.String stringExtra2 = intent == null ? null : intent.getStringExtra("custom_send_text");
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.o1(this, db5.e1.Q(mo55332x76847179(), "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.cax), true, false, null));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        o72.r2 r2Var = this.f182174r;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(r2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6 f6Var = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f6();
        f6Var.f182381b = stringExtra;
        f6Var.f182382c = stringExtra2;
        f6Var.f182384e = linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.x5.h(mo55332x76847179, f6Var, o1Var);
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(stringExtra);
        o72.o3.c(R4 ? o72.m3.Chatroom : o72.m3.Chat, this.f182174r, o72.n3.Samll, R4 ? c01.v1.o(stringExtra) : 0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.j.c(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c9u), null, this, null, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13589x120fb59a, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        this.f182176t = getIntent().getLongExtra("key_detail_info_id", -1L);
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f182176t);
        this.f182174r = F;
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteSightDetailUI", "id[%d] info is null, return", java.lang.Long.valueOf(this.f182176t));
            k82.c.f386420a.e(this.f182176t, 3);
            finish();
            return;
        }
        Y6(F);
        o72.o3.a(this.f182174r);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.y1.a(this, this.f182174r);
        this.f182175s = o72.x1.J(this.f182174r);
        this.f182170n = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.nhn);
        this.f182171o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) findViewById(com.p314xaae8f345.mm.R.id.f569091p01);
        this.f182169m = findViewById(com.p314xaae8f345.mm.R.id.f565285by4);
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20246x24701f66()) == 1) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.p0x);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/detail/FavoriteSightDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((cf0.c0) ((df0.t) i95.n0.c(df0.t.class))).getClass();
            this.f182172p = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465(this, null, 0, 6, null);
            ((android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.vmn)).addView((android.view.View) this.f182172p, new android.widget.FrameLayout.LayoutParams(-1, -1));
        } else {
            this.f182172p = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19745xad58a1a4) findViewById(com.p314xaae8f345.mm.R.id.p0x);
        }
        this.f182173q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p0l);
        this.f182169m.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.b1(this));
        this.f182172p.mo69326x360a109e(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.e1(this));
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.c_m));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.f1(this));
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.jzq, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.k1(this));
        if (com.p314xaae8f345.mm.vfs.w6.j(o72.x1.X(this.f182175s))) {
            android.graphics.Bitmap i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.i(this.f182175s, this.f182174r);
            if (i17 != null) {
                int width = i17.getWidth();
                int height = i17.getHeight();
                if (!this.A) {
                    this.A = true;
                    int i18 = com.p314xaae8f345.mm.ui.bk.h(mo55332x76847179()).x;
                    float dimensionPixelOffset = (getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561303er) * 2) + 0.5f;
                    android.view.ViewGroup.LayoutParams layoutParams = this.f182169m.getLayoutParams();
                    if (layoutParams == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavoriteSightDetailUI", "setViewResize, but params is null");
                    } else {
                        int i19 = i18 - ((int) dimensionPixelOffset);
                        layoutParams.width = i19;
                        layoutParams.height = (i19 * height) / width;
                        this.f182169m.setLayoutParams(layoutParams);
                    }
                }
                this.f182173q.setImageBitmap(i17);
                this.f182173q.setVisibility(0);
            }
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f182175s.f456945h)) {
            o72.x1.A0(this.f182174r, this.f182175s, true);
        }
        b7(false);
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).add(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Ia(this);
        o25.n1.c(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f182172p;
        if (f4Var != null) {
            f4Var.mo69326x360a109e(null);
            this.f182172p.mo69303x360802();
            this.f182172p.mo69312x3f5eee52();
        }
        ((l75.s0) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj()).mo49775xc84af884(this);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Y(this);
        super.onDestroy();
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", "on favitem change, notifyId:%s, curId:%d", str, java.lang.Long.valueOf(this.f182174r.f67645x88be67a1));
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(this.f182174r.f67645x88be67a1);
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavoriteSightDetailUI", "error, on notify change, cannot find info");
            finish();
            return;
        }
        this.f182174r = F;
        this.f182175s = o72.x1.J(F);
        o72.e2 Xf = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.f182175s.T);
        boolean z17 = false;
        if (Xf != null && !this.f182180x) {
            if (Xf.f67093x10a0fed7 == 4 && ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().Xf(this.f182175s.T).f67087x26b1b2e8 != 0) {
                o72.x1.y0(this.f182174r, this.f182175s, true);
                this.f182180x = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavoriteSightDetailUI", "FavoriteFileDetail download, check retry, return %B", java.lang.Boolean.valueOf(this.f182180x));
            z17 = this.f182180x;
        }
        if (z17) {
            return;
        }
        java.lang.Runnable runnable = this.f182182z;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(runnable, 500L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f182172p;
        if (f4Var != null) {
            f4Var.mo69303x360802();
        }
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.AbstractActivityC13588x8fdaaf43, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f182172p;
        if (f4Var != null) {
            if (!this.f182177u) {
                a7();
            } else if (!f4Var.mo69311xc00617a4()) {
                this.f182172p.mo69330x68ac462();
            }
            this.f182177u = false;
        }
    }
}

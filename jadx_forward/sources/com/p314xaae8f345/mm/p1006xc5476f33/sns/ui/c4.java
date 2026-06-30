package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class c4 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d C;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d D;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f249620d;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 f249623g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f249625i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f249626m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f249627n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f249628o;

    /* renamed from: p, reason: collision with root package name */
    public r45.jj4 f249629p;

    /* renamed from: q, reason: collision with root package name */
    public long f249630q;

    /* renamed from: u, reason: collision with root package name */
    public final int f249634u;

    /* renamed from: x, reason: collision with root package name */
    public final kd0.p2 f249637x;

    /* renamed from: y, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e3 f249638y;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 f249621e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880();

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f249622f = null;

    /* renamed from: h, reason: collision with root package name */
    public wd4.l1 f249624h = null;

    /* renamed from: r, reason: collision with root package name */
    public boolean f249631r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f249632s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f249633t = false;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f249635v = new java.util.ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 f249636w = null;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f249639z = new java.util.ArrayList();
    public final java.util.ArrayList A = new java.util.ArrayList();
    public final n34.m3 B = new n34.m3();

    public c4(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 n4Var, int i17) {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.C = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be72 = c5886xd11a0be7;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.this;
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.a(c4Var) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.b(c4Var) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryTitleManager", "not in recoging");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else if (c5886xd11a0be72 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryTitleManager", "receive invalid callbak");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else if (c5886xd11a0be72.f136194g.f87901a.equals(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.b(c4Var))) {
                    java.util.ArrayList a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.s6.f273431a.a(c5886xd11a0be72);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1802", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f249635v = a17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1802", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "recog result: " + com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.d(c4Var).size());
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f249623g.C2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.b(c4Var), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.d(c4Var));
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.d(c4Var))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.d(c4Var).get(0);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        c4Var.f249636w = c17261xe88a6357;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1202", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.c(c4Var) != null && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.a(c4Var) != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                            c4Var.f249633t = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.a(c4Var).e()).h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.c(c4Var).f240153e, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.c(c4Var).f240152d);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        boolean z17 = c4Var.f249626m;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = c4Var.f249627n;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        r45.jj4 jj4Var = c4Var.f249629p;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        c4Var.l(z17, c17933xe8d1b226, jj4Var, 2, null, 0);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f249625i = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryTitleManager", "not same filepath");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$11");
                return false;
            }
        };
        this.D = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c72 = c5885x60bd3c7;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.this;
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.a(c4Var) == null || com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.b(c4Var) == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryTitleManager", "not in recoging");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                } else if (c5885x60bd3c72.f136193g.f87811a.equals(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.b(c4Var))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1900", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f249623g.C2(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.b(c4Var), null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    c4Var.f249625i = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1002", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryTitleManager", "not same filepath");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$12");
                return false;
            }
        };
        this.E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13
            {
                this.f39173x3fe91575 = 1280295539;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c1063) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c10632 = c5751x758c1063;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                if (c5751x758c10632 != null) {
                    am.kl klVar = c5751x758c10632.f136072g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "notify Event: %d", java.lang.Integer.valueOf(klVar.f88701c));
                    android.app.Activity activity = klVar.f88700b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.this;
                    android.content.Context context2 = c4Var.f249620d;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    if (activity == ((android.app.Activity) context2) && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.c(c4Var) != null && klVar.f88699a.equals(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.c(c4Var).f240152d)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryTitleManager", "not the same");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryTitleManager", "event is null or not a instant of NotifyDealQBarStrResultEvent");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$13");
                return false;
            }
        };
        this.f249620d = context;
        this.f249634u = i17;
        this.f249623g = n4Var;
        ((android.app.Activity) context).getIntent().getStringExtra("sns_gallery_pre_title");
        kd0.x2 x2Var = (kd0.x2) i95.n0.c(kd0.x2.class);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e4 e4Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e4(this);
        ((jd0.q2) x2Var).getClass();
        this.f249637x = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636(context, e4Var);
    }

    public static /* synthetic */ wd4.l1 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        wd4.l1 l1Var = c4Var.f249624h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return l1Var;
    }

    public static /* synthetic */ java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        java.lang.String str = c4Var.f249625i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1000", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return str;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 c17261xe88a6357 = c4Var.f249636w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return c17261xe88a6357;
    }

    public static /* synthetic */ java.util.ArrayList d(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        java.util.ArrayList arrayList = c4Var.f249635v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return arrayList;
    }

    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e3 e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4 c4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.e3 e3Var = c4Var.f249638y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return e3Var;
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("backClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_cmd_list", h());
        android.content.Context context = this.f249620d;
        ((android.app.Activity) context).setResult(-1, intent);
        ((android.app.Activity) context).finish();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("backClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public void g(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (c17933xe8d1b226.m70430xdf5582ff() || c17933xe8d1b226.m70387x403f7b29()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().L0(c17933xe8d1b226.f38324x142bbdc6);
            h().a(c17933xe8d1b226.f38324x142bbdc6);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (gm0.j1.a()) {
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
            if (r17 == 1) {
                z17 = true;
            } else if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        }
        if (z17) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.sns.h.f299036b.a(c17933xe8d1b226.f68891x29d1292e, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.k4(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.xj().c(c17933xe8d1b226.f68891x29d1292e);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2(c17933xe8d1b226.f68891x29d1292e, 1);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(q2Var);
        android.content.Context context = this.f249620d;
        this.f249622f = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), this.f249620d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j9z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l4(this, q2Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWithDelSns", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCmdList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCmdList", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return this.f249621e;
    }

    public final java.lang.String i() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        r45.jj4 jj4Var = this.f249629p;
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "getMediaPath, mediaObj is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f249627n;
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "getMediaPath, snsInfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return null;
        }
        java.lang.String c17 = wd4.x0.c(wd4.x0.e(c17933xe8d1b226), jj4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMediaPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        return c17;
    }

    public void j(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "gotoPhotoEditUI: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.b(str, "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
            c16995x8ab634cd.f237223d = -1;
            b17.I = c16995x8ab634cd;
            fu3.e.f348413a.b(b17);
            ut3.m.f512715a.f(this.f249620d, 0, com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1, b17, 1, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("gotoPhotoEditUI", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public final void k(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 snsInfo) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("myMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (this.f249626m) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SNS_GROUP_INT_SYNC, 0);
            if (r17 == 0) {
                z17 = cc4.a.f122014a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
            } else if (r17 != 2) {
                if (cc4.a.f122014a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl false");
                    cc4.a.f122014a = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                z17 = false;
            } else {
                if (!cc4.a.f122014a) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsLabelRangeConfig", "enableNewLabelRangeControl true");
                    cc4.a.f122014a = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("enableNewLabelRangeControl", "com.tencent.mm.plugin.sns.ui.config.SnsLabelRangeConfig");
                z17 = true;
            }
            if (z17) {
                if (snsInfo.f68891x29d1292e != 0) {
                    arrayList.add(1015);
                }
            } else if (snsInfo.m70362xf8db520e() <= 0) {
                arrayList.add(1000);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj()) && com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj().equals(snsInfo.m70374x6bf53a6c())) {
                arrayList.add(1005);
            }
            this.B.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isStarFeed", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsInfo, "snsInfo");
            boolean z18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.l1.a(snsInfo.m70367x7525eefd())).f38980x988ba8e == 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStarFeed", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper");
            cc4.b bVar = cc4.b.f122015a;
            if (z18) {
                if (bVar.a()) {
                    arrayList.add(1018);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "isStarFeed >> %s", snsInfo.m70367x7525eefd());
                }
            } else if (bVar.b()) {
                arrayList.add(1017);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "no isStarFeed >> %s", snsInfo.m70367x7525eefd());
            }
            arrayList.add(-1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("myMenuItem", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    public void l(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, r45.jj4 jj4Var, int i17, android.view.View view, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        m(z17, c17933xe8d1b226, jj4Var, this.f249631r, this.f249632s, i17, view, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showInGallery", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(boolean r26, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r27, r45.jj4 r28, boolean r29, boolean r30, int r31, android.view.View r32, int r33) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.c4.m(boolean, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, boolean, boolean, int, android.view.View, int):void");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
        if (i17 != 0 || i18 != 0 || m1Var == null || !(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryTitleManager", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.mo808xfb85f7b0() + " @" + hashCode());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f249622f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2 q2Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.q2) m1Var;
        int L = q2Var.L();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n4 n4Var = this.f249623g;
        if (L == -1) {
            n4Var.s3(true, "", q2Var.L());
        } else if (L == 1) {
            h().a(q2Var.K());
            n4Var.s3(true, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", q2Var.K()), q2Var.L());
        } else if (L == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 h17 = h();
            int K = q2Var.K();
            h17.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            ((java.util.LinkedList) h17.f245555g).add(java.lang.Integer.valueOf(K));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            n4Var.s3(true, "", q2Var.L());
        } else if (L == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 h18 = h();
            int K2 = q2Var.K();
            h18.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            ((java.util.LinkedList) h18.f245555g).add(java.lang.Integer.valueOf(K2));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addChangeItem", "com.tencent.mm.plugin.sns.data.SnsCmdList");
            n4Var.s3(true, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.i("sns_table_", q2Var.K()), q2Var.L());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSceneEnd", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
    }
}

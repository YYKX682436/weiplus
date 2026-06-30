package com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui;

/* renamed from: com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI */
/* loaded from: classes9.dex */
public class ActivityC13137x38066d82 extends com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.AbstractActivityC13133x11a8215 {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f177801x = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb f177802d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f177803e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f177804f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f177805g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f177806h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f177807i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f177808m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d f177809n;

    /* renamed from: o, reason: collision with root package name */
    public android.util.SparseArray f177810o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.List f177811p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f177812q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f177813r;

    /* renamed from: s, reason: collision with root package name */
    public int f177814s;

    /* renamed from: u, reason: collision with root package name */
    public r45.tw4 f177816u;

    /* renamed from: t, reason: collision with root package name */
    public boolean f177815t = false;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f177817v = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.o0(this);

    /* renamed from: w, reason: collision with root package name */
    public final android.text.TextWatcher f177818w = new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.p0(this);

    public static boolean U6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.ActivityC13137x38066d82 activityC13137x38066d82) {
        boolean z17 = false;
        boolean z18 = false;
        for (int i17 = 0; i17 < activityC13137x38066d82.f177810o.size(); i17++) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) activityC13137x38066d82.f177810o.get(i17);
            int round = (int) java.lang.Math.round(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(viewOnFocusChangeListenerC22907xe18534c2.m83183xfb85ada3(), 0.0d) * 100.0d);
            ((java.util.ArrayList) activityC13137x38066d82.f177812q).set(i17, java.lang.Integer.valueOf(round));
            if (round > activityC13137x38066d82.f177814s) {
                viewOnFocusChangeListenerC22907xe18534c2.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.f560062a9);
                z17 = true;
            } else {
                if (round <= 0) {
                    z18 = true;
                }
                viewOnFocusChangeListenerC22907xe18534c2.m83194xb23f15e1(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c);
            }
        }
        if (z17) {
            if (!activityC13137x38066d82.f177807i.isShown()) {
                activityC13137x38066d82.f177807i.startAnimation(android.view.animation.AnimationUtils.loadAnimation(activityC13137x38066d82, com.p314xaae8f345.mm.R.C30854x2dc211.f559347c8));
                activityC13137x38066d82.f177807i.setVisibility(0);
            }
            activityC13137x38066d82.f177804f.setEnabled(false);
        } else if (z18) {
            activityC13137x38066d82.f177804f.setEnabled(false);
        } else {
            if (activityC13137x38066d82.f177807i.isShown()) {
                activityC13137x38066d82.f177807i.startAnimation(android.view.animation.AnimationUtils.loadAnimation(activityC13137x38066d82, com.p314xaae8f345.mm.R.C30854x2dc211.f559367cs));
                activityC13137x38066d82.f177807i.setVisibility(8);
            }
            activityC13137x38066d82.f177804f.setEnabled(true);
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cbr;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f177802d = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21499x297cf4cb) findViewById(com.p314xaae8f345.mm.R.id.lgr);
        com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d c22905xef04d72d = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22905xef04d72d) findViewById(com.p314xaae8f345.mm.R.id.pga);
        this.f177809n = c22905xef04d72d;
        c22905xef04d72d.a();
        this.f177809n.m83148xdedf72f8(this.f177816u);
        this.f177804f = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.lgq);
        this.f177807i = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgn);
        this.f177806h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.lgo);
        this.f177805g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById(com.p314xaae8f345.mm.R.id.lgs);
        this.f177803e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgt);
        this.f177808m = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.lgp);
        java.lang.String l17 = c01.z1.l();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(l17)) {
            l17 = c01.z1.b();
        }
        android.widget.TextView textView = this.f177803e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, l17));
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f177806h, c01.z1.r(), 0.06f);
        this.f177802d.setAdapter((android.widget.ListAdapter) new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.q0(this, null));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177813r)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f177805g;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.f177813r;
            float textSize = this.f177805g.getTextSize();
            ((ke0.e) xVar2).getClass();
            c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize));
        }
        this.f177807i.setText(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hpe, "" + java.lang.Math.round(this.f177814s / 100.0f)));
        if (this.f177815t) {
            this.f177804f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.how);
            this.f177808m.setVisibility(8);
        }
        this.f177804f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.l0(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.AbstractActivityC13133x11a8215, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hph);
        m83090x14f40144(1562);
        java.util.List O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1((java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_AMT_LIST_STRING_SYNC, ""), ",");
        this.f177811p = new java.util.ArrayList();
        if (O1.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardSetMoneyUI", "use client hardcode amt list");
            this.f177811p = java.util.Arrays.asList(yw1.d.f548138a);
        } else {
            java.util.Iterator it = O1.iterator();
            while (it.hasNext()) {
                this.f177811p.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) it.next(), 0)));
            }
        }
        this.f177812q = new java.util.ArrayList(this.f177811p);
        this.f177814s = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_QR_REWARD_MAX_AMT_INT_SYNC, java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059))).intValue();
        this.f177815t = getIntent().getBooleanExtra("key_first_flag", false);
        this.f177813r = getIntent().getStringExtra("key_desc_word");
        java.lang.String stringExtra = getIntent().getStringExtra("key_notice_item");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            try {
                r45.tw4 tw4Var = new r45.tw4();
                tw4Var.mo11468x92b714fd(android.util.Base64.decode(stringExtra, 2));
                this.f177816u = tw4Var;
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.QrRewardSetMoneyUI", e17, "", new java.lang.Object[0]);
            }
        }
        this.f177810o = new android.util.SparseArray();
        for (int i17 = 0; i17 < this.f177812q.size(); i17++) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cbp, (android.view.ViewGroup) null);
            viewOnFocusChangeListenerC22907xe18534c2.b(this.f177818w);
            int intValue = ((java.lang.Integer) this.f177812q.get(i17)).intValue();
            int i18 = intValue / 100;
            double d17 = intValue / 100.0d;
            if (d17 > i18) {
                viewOnFocusChangeListenerC22907xe18534c2.m83213x765074af(java.lang.String.format("%.2f", java.lang.Double.valueOf(d17)));
            } else {
                viewOnFocusChangeListenerC22907xe18534c2.m83213x765074af(java.lang.String.format("%d", java.lang.Integer.valueOf(i18)));
            }
            m83125x8f91b80(viewOnFocusChangeListenerC22907xe18534c2, 2, false);
            this.f177810o.put(i17, viewOnFocusChangeListenerC22907xe18534c2);
        }
        mo43517x10010bd5();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(1562);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f177817v);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (!(m1Var instanceof xw1.i)) {
            return false;
        }
        xw1.i iVar = (xw1.i) m1Var;
        iVar.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.n0(this, iVar));
        iVar.J(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.m0(this, iVar));
        if (!iVar.f539194h) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.QrRewardSetMoneyUI", "net error: %s", iVar);
        return false;
    }
}

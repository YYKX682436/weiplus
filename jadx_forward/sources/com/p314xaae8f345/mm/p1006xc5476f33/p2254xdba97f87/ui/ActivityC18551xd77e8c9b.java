package com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui;

/* renamed from: com.tencent.mm.plugin.talkroom.ui.TalkRoomUI */
/* loaded from: classes15.dex */
public class ActivityC18551xd77e8c9b extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 implements p21.d, com.p314xaae8f345.mm.p944x882e457a.u0 {
    public static final /* synthetic */ int P = 0;
    public android.view.animation.AlphaAnimation B;
    public android.view.animation.AlphaAnimation C;
    public android.view.animation.AlphaAnimation D;
    public android.view.animation.AlphaAnimation E;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f253990e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f253991f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Chronometer f253992g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f253993h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f253994i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f253995m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f253996n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.C18552xddf7b248 f253997o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.C18550x4e85dcba f253998p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f253999q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f254001s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f254002t;

    /* renamed from: r, reason: collision with root package name */
    public boolean f254000r = true;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f254003u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public int f254004v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f254005w = true;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f254006x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fh4.p(this), false);

    /* renamed from: y, reason: collision with root package name */
    public boolean f254007y = true;

    /* renamed from: z, reason: collision with root package name */
    public int f254008z = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fh4.q(this), true);
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public boolean I = false;

    /* renamed from: J, reason: collision with root package name */
    public final long f253989J = 500;
    public long K = 0;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 L = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fh4.k(this), false);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 M = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new fh4.o(this), false);
    public int N = 0;

    public static boolean O6(com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.ActivityC18551xd77e8c9b activityC18551xd77e8c9b, android.view.MotionEvent motionEvent) {
        if (activityC18551xd77e8c9b.F < 0.0f) {
            activityC18551xd77e8c9b.F = (activityC18551xd77e8c9b.f253993h.getWidth() - (activityC18551xd77e8c9b.f253993h.getPaddingLeft() * 2.0f)) / 2.0f;
            activityC18551xd77e8c9b.G = (activityC18551xd77e8c9b.f253993h.getWidth() * 1.0f) / 2.0f;
            activityC18551xd77e8c9b.H = (activityC18551xd77e8c9b.f253993h.getHeight() * 1.0f) / 2.0f;
        }
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        float f17 = x17 - activityC18551xd77e8c9b.G;
        float f18 = y17 - activityC18551xd77e8c9b.H;
        return java.lang.Math.sqrt((double) ((f17 * f17) + (f18 * f18))) < ((double) activityC18551xd77e8c9b.F);
    }

    @Override // p21.d
    public void J0(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.TalkRoomUI", "errType %d, errCode %d, errInfo %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        P6("");
    }

    @Override // p21.d
    public void J1(java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.TalkRoomUI", "onInitFailed %s", str);
        if (i17 != 4) {
            str2 = "";
        } else {
            if (i18 != -1) {
                this.f254000r = false;
                finish();
                return;
            }
            str2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jok);
        }
        P6(str2);
    }

    @Override // p21.d
    public void N4(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "onSeizeMicFailed");
        if (i17 == 340) {
            if (this.f254004v != 3) {
                return;
            } else {
                this.f254004v = 4;
            }
        } else if (this.f254004v != 1) {
            return;
        } else {
            this.f254004v = 2;
        }
        Q6();
        R6();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r5 r5Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r5(new fh4.j(this));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d6 d6Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.f274057a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.d6.e(context, com.p314xaae8f345.mm.R.C30867xcad56011.f574853jq4, com.p314xaae8f345.mm.sdk.p2603x2137b148.x5.f274618e, -1, false, r5Var);
    }

    @Override // p21.d
    public void P2(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "add %s,  del %s", str, str2);
        W6();
        if (this.f254005w) {
            return;
        }
        S6();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.M;
        if (!K0) {
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.job, c01.a2.e(str)), com.p314xaae8f345.mm.R.C30859x5a72f63.a8d);
            b4Var.c(3000L, 3000L);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        T6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jof, c01.a2.e(str2)), com.p314xaae8f345.mm.R.C30859x5a72f63.a8d);
        b4Var.c(3000L, 3000L);
    }

    @Override // p21.d
    public void P3() {
        if (!this.f254000r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
        } else {
            this.f254000r = false;
            finish();
        }
    }

    public final void P6(java.lang.String str) {
        if (!this.f254000r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "alertToFinish has exit, ignore ");
            return;
        }
        this.f254000r = false;
        dh4.l.Di().i();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(getApplication()) ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.jol) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.jok);
        }
        if (isFinishing()) {
            return;
        }
        db5.e1.t(this, str, "", new fh4.m(this));
    }

    public final void Q6() {
        int i17 = this.f254004v;
        if (i17 == 3 || i17 == 5) {
            this.f253997o.m71583xe8eaabf4(true);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f254002t)) {
            this.f253997o.m71583xe8eaabf4(false);
        } else {
            this.f253997o.m71583xe8eaabf4(true);
        }
    }

    @Override // p21.d
    public void R() {
        U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.joo), com.p314xaae8f345.mm.R.C30859x5a72f63.a8e);
    }

    public final void R6() {
        if (this.f254005w) {
            return;
        }
        if (dh4.l.Di().f314064z) {
            U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jom), com.p314xaae8f345.mm.R.C30859x5a72f63.a8e);
            this.f253998p.m71576x36212d01(null);
            this.f253995m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnq);
            Y6();
            return;
        }
        int i17 = this.f254004v;
        if (i17 == 0) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f254002t)) {
                U6(dh4.l.Di().k().size() == 1 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.jou) : "", com.p314xaae8f345.mm.R.C30859x5a72f63.a8d);
                this.f253998p.m71576x36212d01(null);
                this.f253995m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnq);
                Y6();
                return;
            }
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.f254002t;
            ((sg3.a) v0Var).getClass();
            T6(c01.a2.e(str), com.p314xaae8f345.mm.R.C30859x5a72f63.a8d);
            this.f253998p.m71576x36212d01(this.f254002t);
            this.f253995m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnq);
            X6(1);
            return;
        }
        if (i17 == 1) {
            U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.joa), com.p314xaae8f345.mm.R.C30859x5a72f63.a8d);
            this.f253995m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnt);
            return;
        }
        if (i17 == 2) {
            U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jop), com.p314xaae8f345.mm.R.C30859x5a72f63.a8e);
            this.f253995m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bns);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4) {
                U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.jor), com.p314xaae8f345.mm.R.C30859x5a72f63.a8e);
                this.f253995m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bns);
                Y6();
                return;
            } else if (i17 != 5) {
                return;
            }
        }
        U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.joq), com.p314xaae8f345.mm.R.C30859x5a72f63.a8d);
        this.f253998p.m71576x36212d01(c01.z1.r());
        this.f253995m.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnr);
        X6(2);
    }

    public final void S6() {
        int size = dh4.l.Di().k().size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "displayCount %d", java.lang.Integer.valueOf(size));
        this.f253991f.setText(java.lang.String.valueOf(size));
    }

    @Override // p21.d
    public void T0(java.lang.String str) {
    }

    @Override // p21.d
    public void T1() {
        R6();
    }

    public final void T6(java.lang.String str, int i17) {
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = this.f253990e.getTextSize();
        ((ke0.e) xVar).getClass();
        U6(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, str, textSize), i17);
    }

    @Override // p21.d
    public void U2() {
        R6();
    }

    public final void U6(java.lang.CharSequence charSequence, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence.toString())) {
            this.f253990e.startAnimation(this.E);
            return;
        }
        this.f253990e.setTextColor(getResources().getColor(i17));
        this.f253990e.setText(charSequence);
        this.f253990e.startAnimation(this.D);
    }

    public final void V6() {
        if (this.f254004v != 5) {
            return;
        }
        this.L.d();
        R6();
        Q6();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.jpy, new fh4.l(this));
        this.f254006x.c(1000L, 1000L);
    }

    public final void W6() {
        java.util.List k17 = dh4.l.Di().k();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            linkedList.add(((r45.nk6) it.next()).f463007e);
        }
        this.f253998p.m71577xc3c27395(linkedList);
    }

    public final void X6(int i17) {
        if (i17 == 0 || this.N != i17) {
            this.f253992g.setVisibility(0);
            this.f253992g.startAnimation(this.B);
            android.widget.Chronometer chronometer = this.f253992g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            chronometer.setBase(android.os.SystemClock.elapsedRealtime());
            this.f253992g.start();
            this.N = i17;
        }
    }

    public final void Y6() {
        if (this.N == 0) {
            return;
        }
        this.f253992g.stop();
        this.N = 0;
        this.f253992g.startAnimation(this.C);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
    }

    @Override // p21.d
    public void m3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess");
        if (this.f254004v != 1) {
            return;
        }
        this.f254004v = 5;
        long j17 = this.K;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        long j18 = this.f253989J;
        if (elapsedRealtime >= j18) {
            V6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "onSeizeMicSuccess waiting to execute");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.L;
        long elapsedRealtime2 = j18 - (android.os.SystemClock.elapsedRealtime() - this.K);
        b4Var.c(elapsedRealtime2, elapsedRealtime2);
    }

    @Override // p21.d
    public void n1() {
        this.f254005w = false;
        this.f253993h.setEnabled(true);
        this.f253993h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnu);
        this.f253994i.setVisibility(0);
        R6();
        S6();
        W6();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("enter_room_username");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TalkRoomUI", "onCreate talkRoomName : %s", stringExtra);
        this.f254001s = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            P6("");
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(stringExtra)) {
                ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                java.util.List m17 = c01.v1.m(stringExtra);
                if (m17 == null) {
                    c01.n8.a().c(stringExtra, 30);
                } else {
                    this.f254003u = m17;
                }
            } else {
                ((java.util.LinkedList) this.f254003u).clear();
                ((java.util.LinkedList) this.f254003u).add(stringExtra);
                ((java.util.LinkedList) this.f254003u).add(c01.z1.r());
            }
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new fh4.i(this, stringExtra));
        }
        setContentView(com.p314xaae8f345.mm.ui.id.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxn, (android.view.ViewGroup) null));
        this.f253999q = ((android.os.PowerManager) getSystemService("power")).newWakeLock(26, "TalkRoomUI Lock");
        this.f253996n = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f253990e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f567453jj3);
        this.f253991f = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cjm);
        this.f253994i = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.hck);
        this.f253992g = (android.widget.Chronometer) findViewById(com.p314xaae8f345.mm.R.id.bwf);
        this.f253995m = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.hzw);
        new fh4.b(this);
        this.f253994i.setOnClickListener(new fh4.s(this));
        findViewById(com.p314xaae8f345.mm.R.id.osz).setOnClickListener(new fh4.t(this));
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.jit);
        this.f253993h = imageButton;
        imageButton.setEnabled(false);
        this.f253993h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bnw);
        this.f253993h.setOnTouchListener(new fh4.w(this));
        this.f253997o = (com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.C18552xddf7b248) findViewById(com.p314xaae8f345.mm.R.id.p8_);
        findViewById(com.p314xaae8f345.mm.R.id.ohz).setOnTouchListener(new fh4.y(this, new fh4.x(this)));
        this.f253998p = (com.p314xaae8f345.mm.p1006xc5476f33.p2254xdba97f87.ui.C18550x4e85dcba) findViewById(com.p314xaae8f345.mm.R.id.a9z);
        this.f253996n.setOnClickListener(new fh4.z(this));
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.B = alphaAnimation;
        alphaAnimation.setDuration(300L);
        this.B.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.C = alphaAnimation2;
        alphaAnimation2.setDuration(300L);
        this.C.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation3 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        this.D = alphaAnimation3;
        alphaAnimation3.setDuration(300L);
        this.D.setFillAfter(true);
        android.view.animation.AlphaAnimation alphaAnimation4 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        this.E = alphaAnimation4;
        alphaAnimation4.setDuration(300L);
        this.E.setFillAfter(true);
        c01.d9.e().a(364, this);
        dh4.l.Di().a(this);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        dh4.l.Di().r(this);
        c01.d9.e().q(364, this);
        super.onDestroy();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 25) {
            i95.m c17 = i95.n0.c(ym1.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            xm1.h hVar = ((ym1.f) c17).f544669e;
            if (hVar == null) {
                hVar = new xm1.j();
                i95.m c18 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ((ym1.f) c18).f544669e = hVar;
                i95.m c19 = i95.n0.c(ym1.f.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ((ym1.f) c19).f544671g[0] = "music";
            }
            to.a.a(hVar.c(), 3, -1, 5);
            return true;
        }
        if (i17 != 24) {
            return super.onKeyDown(i17, keyEvent);
        }
        i95.m c27 = i95.n0.c(ym1.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
        xm1.h hVar2 = ((ym1.f) c27).f544669e;
        if (hVar2 == null) {
            hVar2 = new xm1.j();
            i95.m c28 = i95.n0.c(ym1.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
            ((ym1.f) c28).f544669e = hVar2;
            i95.m c29 = i95.n0.c(ym1.f.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
            ((ym1.f) c29).f544671g[0] = "music";
        }
        to.a.a(hVar2.c(), 3, 1, 5);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        sendBroadcast(new android.content.Intent("com.tencent.mm.ui.ACTION_DEACTIVE").setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b).putExtra("classname", getClass().getName()), com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
        android.os.PowerManager.WakeLock wakeLock = this.f253999q;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        wakeLock.release();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        this.A.d();
        dh4.l.Ai().f314094f = false;
        dh4.l.Ai().getClass();
        dh4.p Ai = dh4.l.Ai();
        if (Ai.f314093e) {
            Ai.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jon));
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Ai.f314092d)) {
            Ai.b(dh4.g0.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, dh4.l.Di().f314049h));
        } else {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = Ai.f314092d;
            ((sg3.a) v0Var).getClass();
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jos, c01.a2.e(str));
            Ai.a();
            Ai.b(string);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886 c5833x5f3d6886 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886();
        c5833x5f3d6886.f136140g.f87705a = false;
        c5833x5f3d6886.b(getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        sendBroadcast(new android.content.Intent("com.tencent.mm.ui.ACTION_ACTIVE").setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b).putExtra("isTalkroom", true).putExtra("classname", getClass().getName()), com.p314xaae8f345.mm.sdk.p2603x2137b148.v9.a());
        android.os.PowerManager.WakeLock wakeLock = this.f253999q;
        yj0.a.c(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        wakeLock.acquire();
        yj0.a.f(wakeLock, "com/tencent/mm/plugin/talkroom/ui/TalkRoomUI", "onResume", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        java.lang.String a17 = dh4.g0.a(this, this.f254001s);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = this.f253996n.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f253996n.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, a17, textSize));
        dh4.l.Ai().f314094f = true;
        dh4.l.Ai().getClass();
        dh4.l.Ai().a();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886 c5833x5f3d6886 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5833x5f3d6886();
        c5833x5f3d6886.f136140g.f87705a = true;
        c5833x5f3d6886.b(getMainLooper());
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        m1Var.mo808xfb85f7b0();
    }

    @Override // p21.d
    public void q5(java.lang.String str) {
        this.f254002t = str;
        Q6();
        R6();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.A;
        if (K0) {
            b4Var.d();
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f574850jq1, new fh4.n(this));
            b4Var.c(100L, 100L);
        }
    }
}

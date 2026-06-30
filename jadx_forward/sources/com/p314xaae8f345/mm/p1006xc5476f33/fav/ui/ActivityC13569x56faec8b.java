package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavPostVoiceUI */
/* loaded from: classes12.dex */
public class ActivityC13569x56faec8b extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {
    public static final int[] C = {0, 15, 30, 45, 60, 75, 90, 100};
    public static final int[] D = {com.p314xaae8f345.mm.R.C30861xcebc809e.bfx, com.p314xaae8f345.mm.R.C30861xcebc809e.bfy, com.p314xaae8f345.mm.R.C30861xcebc809e.bfz, com.p314xaae8f345.mm.R.C30861xcebc809e.f562298bg0, com.p314xaae8f345.mm.R.C30861xcebc809e.f562299bg1, com.p314xaae8f345.mm.R.C30861xcebc809e.f562300bg2, com.p314xaae8f345.mm.R.C30861xcebc809e.f562301bg3};

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f181906e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f181907f;

    /* renamed from: g, reason: collision with root package name */
    public long f181908g;

    /* renamed from: h, reason: collision with root package name */
    public long f181909h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f181910i;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Toast f181912n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f181913o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f181914p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f181915q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f181916r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f181917s;

    /* renamed from: t, reason: collision with root package name */
    public int f181918t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f181919u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f181920v;

    /* renamed from: w, reason: collision with root package name */
    public cv.b1 f181921w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f181922x;

    /* renamed from: m, reason: collision with root package name */
    public long f181911m = -1;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f181923y = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e4(this), true);

    /* renamed from: z, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f181924z = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.j4(this);
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 A = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.k4(this), true);
    public boolean B = false;

    public static void O6(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13569x56faec8b activityC13569x56faec8b) {
        activityC13569x56faec8b.f181906e.setKeepScreenOn(false);
        ((tl.y0) activityC13569x56faec8b.f181921w).b();
        activityC13569x56faec8b.f181923y.d();
        activityC13569x56faec8b.A.d();
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(activityC13569x56faec8b.f181922x);
        if (r6Var.m()) {
            r6Var.l();
        }
        activityC13569x56faec8b.R6();
    }

    public final void P6() {
        if (this.f181907f) {
            this.f181906e.setKeepScreenOn(true);
            this.f181906e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.awm);
            this.f181906e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cby);
            ((tl.y0) this.f181921w).b();
            long j17 = this.f181908g;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            this.f181909h = j18;
            boolean z18 = j18 < 800;
            this.f181923y.d();
            this.A.d();
            if (z18) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(this.f181922x);
                if (r6Var.m()) {
                    r6Var.l();
                }
                this.f181906e.setEnabled(false);
                this.f181906e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.awl);
                android.view.View view = this.f181914p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f181913o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f181924z.mo50307xb9e94560(0, 500L);
            } else {
                long j19 = this.f181909h;
                long j27 = j19 / 1000;
                java.lang.String str = this.f181922x;
                int i17 = (int) j19;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavPostLogic", "postVoice path null");
                } else {
                    o72.r2 r2Var = new o72.r2();
                    r2Var.f67657x2262335f = 3;
                    r2Var.f67651x76e81a5a = 6;
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.d4.f(r2Var);
                    r45.gp0 gp0Var = new r45.gp0();
                    gp0Var.A0(str);
                    gp0Var.n0(i17);
                    gp0Var.z0(true);
                    gp0Var.h0(r2Var.f67657x2262335f);
                    gp0Var.i0("amr");
                    r2Var.f67640x5ab01132.f452497f.add(gp0Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.a0.a(r2Var);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10648, 1, 0);
                }
                setResult(-1);
                finish();
                overridePendingTransition(0, 0);
            }
            this.f181907f = false;
        }
    }

    public final void Q6() {
        if (this.B) {
            return;
        }
        this.B = true;
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(300L);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        translateAnimation.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.m4(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.p6l);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dvh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f181920v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f181920v.startAnimation(alphaAnimation);
        findViewById(com.p314xaae8f345.mm.R.id.p6l).startAnimation(alphaAnimation);
        findViewById(com.p314xaae8f345.mm.R.id.dvh).startAnimation(translateAnimation);
    }

    public void R6() {
        android.view.View view = this.f181913o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f181914p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f181917s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f181916r;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f181919u.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c_2);
        this.f181906e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.awn);
        this.f181906e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cby);
        this.f181915q.setVisibility(4);
        this.f181907f = false;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.p314xaae8f345.mm.vfs.z2 m17;
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.ui.id.b(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.abu, (android.view.ViewGroup) null));
        this.f181915q = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p6m);
        this.f181916r = findViewById(com.p314xaae8f345.mm.R.id.p6n);
        this.f181917s = findViewById(com.p314xaae8f345.mm.R.id.p6p);
        this.f181913o = findViewById(com.p314xaae8f345.mm.R.id.p6t);
        this.f181914p = findViewById(com.p314xaae8f345.mm.R.id.p6u);
        this.f181919u = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.p6v);
        this.f181920v = findViewById(com.p314xaae8f345.mm.R.id.p6o);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.p6l);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f181920v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.p314xaae8f345.mm.R.id.p6l).setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.f4(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.dvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((bv.r0) ((cv.c1) i95.n0.c(cv.c1.class))).getClass();
        tl.y0 y0Var = new tl.y0();
        y0Var.f501724d = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.h4(this);
        this.f181921w = y0Var;
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dvg);
        this.f181906e = button;
        button.setOnTouchListener(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i4(this));
        R6();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = o72.x1.f425048a;
        java.lang.String str2 = o72.x1.C() + "/voice/";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, null);
        if (!(!m18.a() ? false : m18.f294799a.F(m18.f294800b))) {
            com.p314xaae8f345.mm.vfs.z2 m19 = b3Var.m(a17, m18);
            if (m19.a()) {
                m19.f294799a.r(m19.f294800b);
            }
        }
        do {
            str = str2 + "/" + java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str4 = a18.f294812f;
            if (str4 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
                }
            }
            m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        } while (!m17.a() ? false : m17.f294799a.F(m17.f294800b));
        this.f181922x = str;
        this.f181919u.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.g4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17) {
            return super.onKeyDown(i17, keyEvent);
        }
        Q6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        P6();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

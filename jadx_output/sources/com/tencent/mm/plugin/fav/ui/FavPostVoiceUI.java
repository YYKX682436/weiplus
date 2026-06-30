package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class FavPostVoiceUI extends com.tencent.mm.ui.MMBaseActivity {
    public static final int[] C = {0, 15, 30, 45, 60, 75, 90, 100};
    public static final int[] D = {com.tencent.mm.R.drawable.bfx, com.tencent.mm.R.drawable.bfy, com.tencent.mm.R.drawable.bfz, com.tencent.mm.R.drawable.f480765bg0, com.tencent.mm.R.drawable.f480766bg1, com.tencent.mm.R.drawable.f480767bg2, com.tencent.mm.R.drawable.f480768bg3};

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f100373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f100374f;

    /* renamed from: g, reason: collision with root package name */
    public long f100375g;

    /* renamed from: h, reason: collision with root package name */
    public long f100376h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100377i;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Toast f100379n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f100380o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f100381p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageView f100382q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f100383r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f100384s;

    /* renamed from: t, reason: collision with root package name */
    public int f100385t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f100386u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f100387v;

    /* renamed from: w, reason: collision with root package name */
    public cv.b1 f100388w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f100389x;

    /* renamed from: m, reason: collision with root package name */
    public long f100378m = -1;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f100390y = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.fav.ui.e4(this), true);

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f100391z = new com.tencent.mm.plugin.fav.ui.j4(this);
    public final com.tencent.mm.sdk.platformtools.b4 A = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.fav.ui.k4(this), true);
    public boolean B = false;

    public static void O6(com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI) {
        favPostVoiceUI.f100373e.setKeepScreenOn(false);
        ((tl.y0) favPostVoiceUI.f100388w).b();
        favPostVoiceUI.f100390y.d();
        favPostVoiceUI.A.d();
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(favPostVoiceUI.f100389x);
        if (r6Var.m()) {
            r6Var.l();
        }
        favPostVoiceUI.R6();
    }

    public final void P6() {
        if (this.f100374f) {
            this.f100373e.setKeepScreenOn(true);
            this.f100373e.setBackgroundResource(com.tencent.mm.R.drawable.awm);
            this.f100373e.setText(com.tencent.mm.R.string.cby);
            ((tl.y0) this.f100388w).b();
            long j17 = this.f100375g;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            this.f100376h = j18;
            boolean z18 = j18 < 800;
            this.f100390y.d();
            this.A.d();
            if (z18) {
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(this.f100389x);
                if (r6Var.m()) {
                    r6Var.l();
                }
                this.f100373e.setEnabled(false);
                this.f100373e.setBackgroundResource(com.tencent.mm.R.drawable.awl);
                android.view.View view = this.f100381p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f100380o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "setRcdTooShort", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f100391z.sendEmptyMessageDelayed(0, 500L);
            } else {
                long j19 = this.f100376h;
                long j27 = j19 / 1000;
                java.lang.String str = this.f100389x;
                int i17 = (int) j19;
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FavPostLogic", "postVoice path null");
                } else {
                    o72.r2 r2Var = new o72.r2();
                    r2Var.field_type = 3;
                    r2Var.field_sourceType = 6;
                    com.tencent.mm.plugin.fav.ui.d4.f(r2Var);
                    r45.gp0 gp0Var = new r45.gp0();
                    gp0Var.A0(str);
                    gp0Var.n0(i17);
                    gp0Var.z0(true);
                    gp0Var.h0(r2Var.field_type);
                    gp0Var.i0("amr");
                    r2Var.field_favProto.f370964f.add(gp0Var);
                    com.tencent.mm.plugin.fav.ui.a0.a(r2Var);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10648, 1, 0);
                }
                setResult(-1);
                finish();
                overridePendingTransition(0, 0);
            }
            this.f100374f = false;
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
        translateAnimation.setAnimationListener(new com.tencent.mm.plugin.fav.ui.m4(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.p6l);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dvh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f100387v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "playOutAnim", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100387v.startAnimation(alphaAnimation);
        findViewById(com.tencent.mm.R.id.p6l).startAnimation(alphaAnimation);
        findViewById(com.tencent.mm.R.id.dvh).startAnimation(translateAnimation);
    }

    public void R6() {
        android.view.View view = this.f100380o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f100381p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f100384s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f100383r;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "resetRcdStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100386u.setText(com.tencent.mm.R.string.c_2);
        this.f100373e.setBackgroundResource(com.tencent.mm.R.drawable.awn);
        this.f100373e.setText(com.tencent.mm.R.string.cby);
        this.f100382q.setVisibility(4);
        this.f100374f = false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mm.vfs.z2 m17;
        super.onCreate(bundle);
        setContentView(com.tencent.mm.ui.id.b(this).inflate(com.tencent.mm.R.layout.abu, (android.view.ViewGroup) null));
        this.f100382q = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.p6m);
        this.f100383r = findViewById(com.tencent.mm.R.id.p6n);
        this.f100384s = findViewById(com.tencent.mm.R.id.p6p);
        this.f100380o = findViewById(com.tencent.mm.R.id.p6t);
        this.f100381p = findViewById(com.tencent.mm.R.id.p6u);
        this.f100386u = (android.widget.TextView) findViewById(com.tencent.mm.R.id.p6v);
        this.f100387v = findViewById(com.tencent.mm.R.id.p6o);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.p6l);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f100387v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdHint", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById(com.tencent.mm.R.id.p6l).setOnTouchListener(new com.tencent.mm.plugin.fav.ui.f4(this));
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.dvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/fav/ui/FavPostVoiceUI", "initRcdBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((bv.r0) ((cv.c1) i95.n0.c(cv.c1.class))).getClass();
        tl.y0 y0Var = new tl.y0();
        y0Var.f420191d = new com.tencent.mm.plugin.fav.ui.h4(this);
        this.f100388w = y0Var;
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.dvg);
        this.f100373e = button;
        button.setOnTouchListener(new com.tencent.mm.plugin.fav.ui.i4(this));
        R6();
        com.tencent.mm.sdk.platformtools.o4 o4Var = o72.x1.f343515a;
        java.lang.String str2 = o72.x1.C() + "/voice/";
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, null);
        if (!(!m18.a() ? false : m18.f213266a.F(m18.f213267b))) {
            com.tencent.mm.vfs.z2 m19 = b3Var.m(a17, m18);
            if (m19.a()) {
                m19.f213266a.r(m19.f213267b);
            }
        }
        do {
            str = str2 + "/" + java.lang.System.currentTimeMillis();
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str4 = a18.f213279f;
            if (str4 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
        } while (!m17.a() ? false : m17.f213266a.F(m17.f213267b));
        this.f100389x = str;
        this.f100386u.post(new com.tencent.mm.plugin.fav.ui.g4(this));
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17) {
            return super.onKeyDown(i17, keyEvent);
        }
        Q6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        P6();
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}

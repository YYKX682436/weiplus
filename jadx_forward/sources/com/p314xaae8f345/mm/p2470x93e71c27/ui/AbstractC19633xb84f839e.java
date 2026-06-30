package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.AbstractVideoView */
/* loaded from: classes4.dex */
public abstract class AbstractC19633xb84f839e extends android.widget.RelativeLayout implements com.p314xaae8f345.mm.p2470x93e71c27.ui.f1, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.c4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.b4, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d4 {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public int G;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 H;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f271270J;
    public final m34.e K;
    public final android.view.View.OnClickListener L;
    public boolean M;
    public final java.lang.Runnable N;
    public final java.lang.Runnable P;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.c1 Q;
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 R;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f271271d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f271272e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f271273f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f271274g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f271275h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f271276i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ProgressBar f271277m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f271278n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf f271279o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 f271280p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f271281q;

    /* renamed from: r, reason: collision with root package name */
    public int f271282r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f271283s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 f271284t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.d1 f271285u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f271286v;

    /* renamed from: w, reason: collision with root package name */
    public final int f271287w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f271288x;

    /* renamed from: y, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f271289y;

    /* renamed from: z, reason: collision with root package name */
    public int f271290z;

    public AbstractC19633xb84f839e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean A() {
        long mo69309x53bc4617 = this.f271281q.mo69309x53bc4617();
        int mo69307x9746038c = this.f271281q.mo69307x9746038c();
        N();
        if (mo69309x53bc4617 <= 0 || mo69309x53bc4617 != this.F || mo69307x9746038c == this.G) {
            this.F = mo69309x53bc4617;
            this.G = mo69307x9746038c;
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s check surface is update error", N());
        a(this.G / 1000, true);
        return false;
    }

    public m34.e B() {
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.h(this);
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C(android.content.Context context) {
        return null;
    }

    public void D() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f271289y;
        n3Var.mo50303x856b99f0(1);
        n3Var.mo50305x3d8a09a2(2);
    }

    public void H(long j17, long j18, long j19, boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.mo69402x336bdfd8(j17, j18, j19, z17);
        }
    }

    public void I() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s init view ", N());
        android.view.LayoutInflater.from(this.f271273f).inflate(M(), this);
        this.f271275h = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.p0l);
        this.f271276i = (android.widget.RelativeLayout) findViewById(com.p314xaae8f345.mm.R.id.f569096p06);
        this.f271277m = (android.widget.ProgressBar) findViewById(com.p314xaae8f345.mm.R.id.ozc);
        this.f271278n = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.f569087oz2);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf c19744xe1ab67bf = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19744xe1ab67bf) findViewById(com.p314xaae8f345.mm.R.id.ozz);
        this.f271279o = c19744xe1ab67bf;
        this.f271280p = c19744xe1ab67bf;
        if (c19744xe1ab67bf != null) {
            c19744xe1ab67bf.mo69283xbdcdae58(this.K);
            this.f271279o.setOnClickListener(this.L);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 C = C(this.f271273f);
        this.f271281q = C;
        C.mo69326x360a109e(this);
        this.f271281q.mo69320x87223eb7(this);
        this.f271281q.mo69319xe6781b94(this);
        this.f271281q.mo69321x146557f1(this);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.f271276i.addView((android.view.View) this.f271281q, 0, layoutParams);
    }

    public boolean L() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        boolean z17 = false;
        if (f4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f4Var.getF256131m()) && this.E) {
            z17 = true;
        }
        N();
        return z17;
    }

    public int M() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570189zr;
    }

    public java.lang.String N() {
        return "" + hashCode();
    }

    public boolean O() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16347xceed145b);
    }

    public boolean P() {
        return false;
    }

    public void Q() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        if (e3Var.f272327a == 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            e3Var.f272327a = java.lang.System.currentTimeMillis();
        }
    }

    public void R() {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        long j17 = e3Var.f272332f;
        if (j17 > 0) {
            long j18 = e3Var.f272331e;
            if (j18 > 0) {
                int i19 = (int) ((j17 - j18) / 1000);
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(this.f271273f)) {
                    i17 = 70;
                    i18 = 74;
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(this.f271273f)) {
                    i17 = 75;
                    i18 = 79;
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(this.f271273f)) {
                    i17 = 80;
                    i18 = 84;
                } else {
                    if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(this.f271273f)) {
                        return;
                    }
                    i17 = 85;
                    i18 = 89;
                }
                int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(i19, new int[]{1, 2, 3, 4}, i17 + mo48229xc9e6d95a(), i18 + mo48229xc9e6d95a()));
                N();
                H(600L, q17, 1L, false);
            }
        }
    }

    public boolean S(double d17) {
        return a(d17, mo61531xc00617a4());
    }

    public void T() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f271289y;
        if (n3Var.mo50285x8fc9be06(1) || this.M) {
            return;
        }
        n3Var.mo50307xb9e94560(1, 500L);
    }

    public void T4(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s on get video size [%d, %d]", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
        if (b1Var != null) {
            b1Var.I(mo66135x23a7af9b(), mo48228x75e04be9(), i17, i18);
        }
        H(600L, mo48229xc9e6d95a() + 8, 1L, false);
    }

    public void U(boolean z17) {
        N();
        this.H.c(500L, 500L);
    }

    public void V() {
        this.H.d();
        this.I.d();
    }

    public void W(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 z0Var = this.f271280p;
        if (z0Var != null) {
            z0Var.c(i17);
        }
    }

    public final void X(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 z0Var = this.f271280p;
        if (z0Var != null) {
            z0Var.e(z17);
        }
    }

    public boolean a(double d17, boolean z17) {
        boolean L = L();
        int mo61527x6d590e18 = mo61527x6d590e18();
        int i17 = (mo61527x6d590e18 <= 0 || d17 <= ((double) mo61527x6d590e18)) ? (int) d17 : mo61527x6d590e18;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        boolean z18 = (f4Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f4Var.getF256131m())) ? false : true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(this.f271272e, "%s seek to [%d %s] seconds afterPlay[%b] isPrepared[%b] duration[%d] hadSetPath[%b]", N(), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d17), java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(L), java.lang.Integer.valueOf(mo61527x6d590e18), java.lang.Boolean.valueOf(z18));
        H(600L, mo48229xc9e6d95a() + 5, 1L, false);
        if (!L) {
            this.B = i17;
            if (z18) {
                this.A = true;
            } else {
                this.A = z17;
                mo48238x68ac462();
            }
        } else if (this.f271281q != null) {
            T();
            W(i17);
            this.f271281q.a(i17 * 1000, z17);
            return z17;
        }
        return false;
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s onUIDestroy", N());
        mo48239x360802();
        this.f271289y.mo50302x6b17ad39(null);
        V();
        this.f271270J.d();
        H(600L, mo48229xc9e6d95a() + 12, 1L, false);
    }

    public void e() {
        java.lang.String str = this.f271272e;
        java.lang.String N = N();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "%s onUIPause %s", N, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f271282r = mo61523x898ffe25();
        this.f271283s = mo61531xc00617a4();
        this.G = 0;
        this.F = 0;
        mo48231x65825f6();
        V();
        this.f271274g = false;
        H(600L, mo48229xc9e6d95a() + 11, 1L, false);
    }

    public void g() {
        java.lang.String str = this.f271272e;
        java.lang.String N = N();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "%s onUIResume %s", N, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        this.f271274g = true;
        H(600L, mo48229xc9e6d95a() + 10, 1L, false);
    }

    /* renamed from: getCacheTimeSec */
    public int mo48226x8a3f46d8() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getCurrPosMs */
    public int mo64621x25784152() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            return f4Var.mo69307x9746038c();
        }
        return 0;
    }

    /* renamed from: getCurrPosSec */
    public int mo61523x898ffe25() {
        if (this.f271281q != null) {
            return java.lang.Math.round((r0.mo69307x9746038c() * 1.0f) / 1000.0f);
        }
        return 0;
    }

    /* renamed from: getMediaId */
    public java.lang.String mo48228x75e04be9() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: getPlayerType */
    public int mo64625x6b2cfdb1() {
        return this.f271290z;
    }

    /* renamed from: getReportIdkey */
    public abstract int mo48229xc9e6d95a();

    /* renamed from: getSessionId */
    public java.lang.String mo66135x23a7af9b() {
        return "";
    }

    /* renamed from: getVideoDurationSec */
    public int mo61527x6d590e18() {
        if (this.f271281q != null) {
            return java.lang.Math.round((r0.mo69286x51e8b0a() * 1.0f) / 1000.0f);
        }
        return -1;
    }

    /* renamed from: getVideoSource */
    public int mo75325x17bb2740() {
        return 0;
    }

    public void i() {
        java.lang.Object obj = this.f271280p;
        if (obj != null) {
            this.f271278n.removeView((android.view.View) obj);
        }
    }

    /* renamed from: isPlaying */
    public boolean mo61531xc00617a4() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        boolean mo69311xc00617a4 = f4Var != null ? f4Var.mo69311xc00617a4() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s is playing[%b]", N(), java.lang.Boolean.valueOf(mo69311xc00617a4));
        return mo69311xc00617a4;
    }

    /* renamed from: onCompletion */
    public void mo9755xa6db431b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s onCompletion, curMs %d, duration %d", N(), java.lang.Integer.valueOf(mo61523x898ffe25()), java.lang.Integer.valueOf(mo61527x6d590e18()));
        W(mo61527x6d590e18());
        D();
        V();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
        if (b1Var != null) {
            b1Var.E(mo66135x23a7af9b(), mo48228x75e04be9());
        }
        this.G = 0;
        this.F = 0;
        H(600L, mo48229xc9e6d95a() + 7, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onError */
    public void mo9756xaf8aa769(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s onError info [%d %d] errorCount[%d]", N(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(this.C));
        H(600L, mo48229xc9e6d95a() + 90, 1L, false);
        int i19 = this.C + 1;
        this.C = i19;
        if (i19 <= 5) {
            int mo61523x898ffe25 = mo61523x898ffe25();
            int i27 = this.B;
            if (i27 == -1) {
                i27 = mo61523x898ffe25;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s onError now, try to start again. currPlaySec[%d] seekTimeWhenPrepared[%d] currPosSec[%d]", N(), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.B), java.lang.Integer.valueOf(mo61523x898ffe25));
            mo48239x360802();
            T();
            this.f271289y.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p2470x93e71c27.ui.c(this, i27), 200L);
            return;
        }
        H(600L, mo48229xc9e6d95a() + 92, 1L, false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        e3Var.f272337k = i17;
        e3Var.f272338l = i18;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
        if (b1Var != null) {
            java.lang.String mo66135x23a7af9b = mo66135x23a7af9b();
            java.lang.String mo48228x75e04be9 = mo48228x75e04be9();
            java.lang.String str = "MEDIA_ERR_SRC_NOT_SUPPORTED";
            if (i17 != -1010 && i17 != -1007) {
                str = "MEDIA_ERR_NETWORK";
                if (i17 != -1004 ? com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this.f271273f) : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(this.f271273f)) {
                    str = "MEDIA_ERR_DECODE";
                }
            }
            b1Var.N(mo66135x23a7af9b, mo48228x75e04be9, str, i17, i18);
        }
        mo48239x360802();
        D();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    /* renamed from: onPrepared */
    public void mo9757x58d5b73c() {
        int i17;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "video is onPrepared");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s onPrepared startWhenPrepared[%b] seekTimeWhenPrepared[%d] isPrepared[%b]", N(), java.lang.Boolean.valueOf(this.A), java.lang.Integer.valueOf(this.B), java.lang.Boolean.valueOf(this.E));
        this.E = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            f4Var.mo69322xfae314df(this);
        }
        mo61542xa7077af8(mo61527x6d590e18());
        boolean z17 = this.A;
        if (!z17) {
            int i19 = this.B;
            a(i19 <= -1 ? 0.0d : i19, z17);
        } else if (this.B <= -1) {
            if (mo48232x348b34() && O()) {
                this.I.c(1000L, 1000L);
            }
        } else if (j()) {
            mo48232x348b34();
        } else {
            a(this.B, this.A);
        }
        this.B = -1;
        this.A = true;
        this.G = 0;
        this.F = 0;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
        if (b1Var != null) {
            b1Var.o(mo66135x23a7af9b(), mo48228x75e04be9());
        }
        if (this.C > 0) {
            N();
            this.f271270J.c(5000L, 5000L);
        }
        H(600L, mo48229xc9e6d95a() + 2, 1L, false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        if (e3Var.f272328b == 0) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            e3Var.f272328b = java.lang.System.currentTimeMillis();
        }
        e3Var.f272336j = mo61527x6d590e18();
        long j17 = e3Var.f272327a;
        if (j17 > 0) {
            long j18 = e3Var.f272328b;
            if (j18 > 0) {
                int i27 = (int) ((j18 - j17) / 1000);
                if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(this.f271273f)) {
                    i17 = 20;
                    i18 = 24;
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(this.f271273f)) {
                    i17 = 25;
                    i18 = 29;
                } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(this.f271273f)) {
                    i17 = 30;
                    i18 = 34;
                } else {
                    if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(this.f271273f)) {
                        return;
                    }
                    i17 = 35;
                    i18 = 39;
                }
                int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(i27, new int[]{1, 2, 3, 4}, i17 + mo48229xc9e6d95a(), i18 + mo48229xc9e6d95a()));
                N();
                H(600L, q17, 1L, false);
            }
        }
    }

    /* renamed from: onSurfaceAvailable */
    public void mo48230xe037649b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s on surface available", N());
        U(false);
    }

    /* renamed from: pause */
    public boolean mo48231x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s pause", N());
        H(600L, mo48229xc9e6d95a() + 4, 1L, false);
        if (this.f271281q == null) {
            return false;
        }
        X(false);
        this.f271281q.mo69313x65825f6();
        V();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
        if (b1Var != null) {
            b1Var.i(mo66135x23a7af9b(), mo48228x75e04be9());
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.R.f272330d = java.lang.System.currentTimeMillis();
        return true;
    }

    /* renamed from: play */
    public boolean mo48232x348b34() {
        if (!this.f271274g) {
            java.lang.String str = this.f271272e;
            java.lang.String N = N();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "%s ui on pause now, why u call me to play? [%s]", N, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return false;
        }
        H(600L, mo48229xc9e6d95a() + 3, 1L, false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var == null) {
            return false;
        }
        boolean mo69330x68ac462 = f4Var.mo69330x68ac462();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s video play [%b] isPlayOnUiPause[%b]", N(), java.lang.Boolean.valueOf(mo69330x68ac462), java.lang.Boolean.valueOf(this.f271283s));
        X(mo69330x68ac462);
        if (mo69330x68ac462) {
            this.f271283s = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "play, start is true");
            U(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
            if (b1Var != null) {
                b1Var.l(mo66135x23a7af9b(), mo48228x75e04be9());
            }
        }
        return mo69330x68ac462;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.a4
    public int q(int i17, int i18) {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setCover */
    public void mo64626x52d31475(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s set cover", N());
        if (bitmap == null || bitmap.isRecycled() || (imageView = this.f271275h) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setFullDirection */
    public void mo64627xfa24986e(int i17) {
    }

    /* renamed from: setIMMVideoViewCallback */
    public void mo61532x526554de(com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var) {
        this.f271284t = b1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setIsShowBasicControls */
    public void mo64629xc2e9d13b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s is show seek bar[%b]", N(), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f271289y;
        if (z17) {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.ui.l(this));
        } else {
            n3Var.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.ui.a(this));
        }
    }

    /* renamed from: setLoop */
    public abstract /* synthetic */ void mo48236x764cf626(boolean z17);

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setLoopCompletionCallback */
    public void mo64630x8fda8107(com.p314xaae8f345.mm.p2470x93e71c27.ui.d1 d1Var) {
        this.f271285u = d1Var;
    }

    /* renamed from: setMute */
    public void mo61536x764d819b(boolean z17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            f4Var.mo69318x764d819b(z17);
        }
    }

    /* renamed from: setReporter */
    public void m75326x5d1e8363(com.p314xaae8f345.mm.p2470x93e71c27.ui.c1 c1Var) {
        this.Q = c1Var;
    }

    /* renamed from: setScaleType */
    public abstract /* synthetic */ void mo48237xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1 e1Var);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.f1
    /* renamed from: setVideoFooterView */
    public void mo64632xb9405cf9(com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 z0Var) {
        if (!(z0Var instanceof android.view.View)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f271272e, "%s set video footer view but is not view", N());
            return;
        }
        i();
        this.f271280p = z0Var;
        this.f271278n.addView((android.view.View) z0Var);
    }

    /* renamed from: setVideoTotalTime */
    public void mo61542xa7077af8(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.z0 z0Var = this.f271280p;
        if (z0Var == null || z0Var.mo69557xdf1112ec() == i17) {
            return;
        }
        this.f271280p.mo61298xa7077af8(i17);
    }

    /* renamed from: stop */
    public void mo48239x360802() {
        int i17;
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s stop", N());
        H(600L, mo48229xc9e6d95a() + 6, 1L, false);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            f4Var.mo69303x360802();
        }
        this.f271288x = false;
        this.B = -1;
        this.A = true;
        this.E = false;
        this.G = 0;
        this.F = 0;
        V();
        this.f271289y.mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p2470x93e71c27.ui.b(this), 10L);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.e3 e3Var = this.R;
        e3Var.f272329c = currentTimeMillis;
        if (e3Var.f272334h > 0) {
            if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(this.f271273f)) {
                i17 = 41;
                i18 = 45;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(this.f271273f)) {
                i17 = 46;
                i18 = 50;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(this.f271273f)) {
                i17 = 51;
                i18 = 55;
            } else if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(this.f271273f)) {
                i17 = 56;
                i18 = 60;
            }
            int q17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) jx3.f.y(e3Var.f272334h, new int[]{1, 2, 3, 4}, i17 + mo48229xc9e6d95a(), i18 + mo48229xc9e6d95a()));
            N();
            H(600L, q17, 1L, false);
        }
        if (e3Var.f272327a == 0) {
            return;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(e3Var.f272327a);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272328b);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272329c);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272330d);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272331e);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272332f);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272333g);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272334h);
        stringBuffer.append(",");
        long j17 = e3Var.f272328b;
        stringBuffer.append(j17 > 0 ? j17 - e3Var.f272327a : 0L);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272335i);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272336j);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272337k);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272338l);
        stringBuffer.append(",");
        stringBuffer.append(e3Var.f272339m);
        stringBuffer.append(",");
        long j18 = e3Var.f272339m;
        long j19 = e3Var.f272327a;
        stringBuffer.append(j18 > j19 ? j18 - j19 : 0L);
        stringBuffer.append(",");
        stringBuffer.append(mo64625x6b2cfdb1());
        stringBuffer.append(",");
        stringBuffer.append(mo75325x17bb2740());
        java.lang.String stringBuffer2 = stringBuffer.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s rpt video kv stat{%s}", N(), stringBuffer2);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.mo69404xbd3cda5f(14349, stringBuffer2);
        }
        e3Var.f272327a = 0L;
        e3Var.f272328b = 0L;
        e3Var.f272329c = 0L;
        e3Var.f272330d = 0L;
        e3Var.f272331e = 0L;
        e3Var.f272332f = 0L;
        e3Var.f272333g = 0L;
        e3Var.f272334h = 0;
        e3Var.f272335i = "";
        e3Var.f272336j = 0;
        e3Var.f272337k = 0;
        e3Var.f272338l = 0;
        e3Var.f272339m = 0L;
    }

    public void v() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s onTextureUpdate ", N());
        D();
    }

    public void z(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271272e, "%s on seek complete startPlay[%b]", N(), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = this.f271281q;
        if (f4Var != null) {
            f4Var.mo69322xfae314df(this);
        }
        D();
        X(z17);
        int mo61523x898ffe25 = mo61523x898ffe25();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f271271d, "onSeekComplete, startPlay is " + z17 + ", updateUI and currPosSec is " + mo61523x898ffe25);
        W(mo61523x898ffe25);
        if (z17) {
            U(false);
            this.f271283s = false;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = this.f271284t;
            if (b1Var != null) {
                b1Var.l(mo66135x23a7af9b(), mo48228x75e04be9());
            }
        }
    }

    public AbstractC19633xb84f839e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f271271d = "VideoView.AbstractVideoView";
        this.f271272e = "MicroMsg.AbstractVideoView";
        this.f271274g = true;
        this.f271282r = 0;
        this.f271283s = false;
        this.f271286v = false;
        this.f271288x = false;
        this.f271289y = new com.p314xaae8f345.mm.p2470x93e71c27.ui.d(this, android.os.Looper.getMainLooper());
        this.f271290z = 0;
        this.A = true;
        this.B = -1;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = 0L;
        this.G = 0;
        this.H = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.e(this), true);
        this.I = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.f(this), false);
        this.f271270J = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.g(this), true);
        this.K = B();
        this.L = new com.p314xaae8f345.mm.p2470x93e71c27.ui.i(this);
        this.M = false;
        this.N = new com.p314xaae8f345.mm.p2470x93e71c27.ui.j(this);
        this.P = new com.p314xaae8f345.mm.p2470x93e71c27.ui.k(this);
        this.Q = null;
        this.R = new com.p314xaae8f345.mm.p2470x93e71c27.ui.e3();
        this.f271273f = context;
        I();
    }

    public AbstractC19633xb84f839e(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17);
        this.f271271d = "VideoView.AbstractVideoView";
        this.f271272e = "MicroMsg.AbstractVideoView";
        this.f271274g = true;
        this.f271282r = 0;
        this.f271283s = false;
        this.f271286v = false;
        this.f271288x = false;
        this.f271289y = new com.p314xaae8f345.mm.p2470x93e71c27.ui.d(this, android.os.Looper.getMainLooper());
        this.f271290z = 0;
        this.A = true;
        this.B = -1;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = 0L;
        this.G = 0;
        this.H = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.e(this), true);
        this.I = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.f(this), false);
        this.f271270J = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p2470x93e71c27.ui.g(this), true);
        this.K = B();
        this.L = new com.p314xaae8f345.mm.p2470x93e71c27.ui.i(this);
        this.M = false;
        this.N = new com.p314xaae8f345.mm.p2470x93e71c27.ui.j(this);
        this.P = new com.p314xaae8f345.mm.p2470x93e71c27.ui.k(this);
        this.Q = null;
        this.R = new com.p314xaae8f345.mm.p2470x93e71c27.ui.e3();
        this.f271287w = i18;
        this.f271273f = context;
        I();
    }
}

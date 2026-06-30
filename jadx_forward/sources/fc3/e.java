package fc3;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: q, reason: collision with root package name */
    public static final fc3.a f342553q = new fc3.a(null);

    /* renamed from: r, reason: collision with root package name */
    public static android.graphics.Typeface f342554r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f342555s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.List f342556t;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f342557a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f342558b;

    /* renamed from: c, reason: collision with root package name */
    public final int f342559c;

    /* renamed from: d, reason: collision with root package name */
    public final fc3.s f342560d;

    /* renamed from: e, reason: collision with root package name */
    public int f342561e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f342562f;

    /* renamed from: g, reason: collision with root package name */
    public int f342563g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f342564h;

    /* renamed from: i, reason: collision with root package name */
    public long f342565i;

    /* renamed from: j, reason: collision with root package name */
    public long f342566j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f342567k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f342568l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f342569m;

    /* renamed from: n, reason: collision with root package name */
    public int f342570n;

    /* renamed from: o, reason: collision with root package name */
    public int f342571o;

    /* renamed from: p, reason: collision with root package name */
    public int f342572p;

    static {
        android.graphics.PointF pointF = new android.graphics.PointF(320.0f, 560.0f);
        f342555s = kz5.c0.i(new android.graphics.PointF(30.0f / pointF.x, 110.0f / pointF.y), new android.graphics.PointF(235.0f / pointF.x, 65.0f / pointF.y), new android.graphics.PointF(95.0f / pointF.x, 68.0f / pointF.y), new android.graphics.PointF(293.0f / pointF.x, 120.0f / pointF.y), new android.graphics.PointF(70.0f / pointF.x, 270.0f / pointF.y), new android.graphics.PointF(300.0f / pointF.x, 345.0f / pointF.y), new android.graphics.PointF(22.0f / pointF.x, 337.0f / pointF.y), new android.graphics.PointF(255.0f / pointF.x, 305.0f / pointF.y), new android.graphics.PointF(41.0f / pointF.x, 464.0f / pointF.y), new android.graphics.PointF(287.0f / pointF.x, 470.0f / pointF.y));
        f342556t = kz5.c0.i(new fc3.b(56.0f, 0.35f, 3.0f), new fc3.b(32.0f, 0.3f, 1.0f), new fc3.b(24.0f, 0.3f, 1.0f), new fc3.b(60.0f, 0.35f, 3.0f), new fc3.b(48.0f, 0.2f, 2.0f), new fc3.b(36.0f, 0.35f, 1.0f), new fc3.b(32.0f, 0.35f, 1.0f), new fc3.b(40.0f, 0.2f, 2.0f), new fc3.b(28.0f, 0.3f, 1.0f), new fc3.b(24.0f, 0.3f, 1.0f));
    }

    public e(android.content.Context context, android.widget.FrameLayout layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f342557a = context;
        this.f342558b = layout;
        this.f342559c = 800;
        this.f342560d = new fc3.s(context, layout);
        this.f342568l = "";
        this.f342569m = "";
        this.f342572p = 88;
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " pauseAllKeywordText");
        this.f342562f = null;
        this.f342563g = 0;
        this.f342566j = 0L;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f342564h;
        if (b4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var);
            if (b4Var.e()) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f342564h;
            if (b4Var2 != null) {
                b4Var2.d();
            }
            this.f342564h = null;
        }
    }

    public final void b() {
        try {
            if (f342554r == null) {
                java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.e() + "/WXfzysc.ttf";
                if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e5.p();
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    f342554r = android.graphics.Typeface.createFromFile(str);
                } else {
                    f342554r = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LuckyMoneyKeywordTextHelper", "ttf not exits:" + str);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
        fc3.s sVar = this.f342560d;
        sVar.f342615g = 1.0f;
        sVar.f342614f = 6.0f;
        sVar.f342612d = 3000L;
        sVar.f342618j = sVar.f342609a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560904p3);
        sVar.f342616h = false;
        sVar.f342622n = true;
        sVar.f342619k = f342554r;
        sVar.f342617i = new android.view.animation.DecelerateInterpolator(1.5f);
    }

    public final void c(java.util.List keywords) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keywords, "keywords");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " shootAllKeywordText:" + keywords.size());
            this.f342563g = 0;
            this.f342562f = keywords;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            this.f342566j = java.lang.System.currentTimeMillis();
            e();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
    }

    public final void d(java.lang.String text) {
        fc3.k walletText;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f342565i = java.lang.System.currentTimeMillis();
        android.widget.FrameLayout frameLayout = this.f342558b;
        android.graphics.PointF pointF = new android.graphics.PointF(frameLayout.getWidth() / 2, frameLayout.getHeight() - i65.a.b(this.f342557a, this.f342572p));
        fc3.s sVar = this.f342560d;
        sVar.getClass();
        sVar.f342613e = pointF;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " shootKeywordText:" + text + " startPos:" + sVar.f342613e + " posSize:" + this.f342561e);
        int i17 = this.f342561e;
        java.util.List list = f342555s;
        if (i17 < list.size()) {
            android.graphics.PointF pointF2 = (android.graphics.PointF) list.get(this.f342561e);
            fc3.b bVar = (fc3.b) f342556t.get(this.f342561e);
            android.graphics.PointF pointF3 = new android.graphics.PointF(pointF2.x * frameLayout.getWidth(), pointF2.y * frameLayout.getHeight());
            this.f342561e++;
            sVar.c(new fc3.k(text, pointF3, bVar.f342546a, bVar.f342547b, bVar.f342548c));
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) sVar.f342611c).iterator();
        while (true) {
            if (!it.hasNext()) {
                walletText = null;
                break;
            }
            walletText = (fc3.k) it.next();
            int i18 = walletText.f342589g;
            if (i18 != 4 && i18 != 5) {
                break;
            }
        }
        if ((walletText != null ? walletText.f342587e : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyKeywordTextHelper", "first text is null");
            return;
        }
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(walletText, "walletText");
        if (walletText.f342587e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletTextAnimator", sVar.hashCode() + " popText:" + walletText.f342583a + " withAnimation:true");
            walletText.f342589g = 4;
            android.widget.TextView textView = walletText.f342587e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
            textView.animate().alpha(0.0f).setDuration(500L).setListener(new fc3.l(sVar, walletText));
        } else {
            sVar.b(walletText);
        }
        android.widget.TextView textView2 = walletText.f342587e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView2);
        float x17 = textView2.getX();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(walletText.f342587e);
        float width = x17 + (r4.getWidth() / 2);
        android.widget.TextView textView3 = walletText.f342587e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView3);
        float y17 = textView3.getY();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(walletText.f342587e);
        sVar.c(new fc3.k(text, new android.graphics.PointF(width, y17 + (r5.getHeight() / 2)), walletText.f342585c, walletText.f342586d, walletText.f342588f));
    }

    public final void e() {
        try {
            java.util.List list = this.f342562f;
            if (list != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
                if (list.size() > this.f342563g) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " shootNextKeywordText:" + this.f342563g);
                    if (this.f342564h == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                        f0Var.f391649d = this.f342563g;
                        this.f342564h = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new fc3.d(this, f0Var), false);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f342564h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var);
                    if (b4Var.e()) {
                        java.util.List list2 = this.f342562f;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
                        java.lang.String timeMs = ((z21.c) list2.get(this.f342563g)).f551093b;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(timeMs, "timeMs");
                        long parseLong = java.lang.Long.parseLong(timeMs);
                        if (this.f342563g > 0) {
                            java.util.List list3 = this.f342562f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
                            java.lang.String timeMs2 = ((z21.c) list3.get(this.f342563g - 1)).f551093b;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(timeMs2, "timeMs");
                            parseLong -= java.lang.Long.parseLong(timeMs2);
                        }
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f342564h;
                        if (b4Var2 != null) {
                            b4Var2.c(parseLong, parseLong);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LuckyMoneyKeywordTextHelper", th6, "", new java.lang.Object[0]);
        }
    }

    public final void f(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyKeywordTextHelper", hashCode() + " stopAll withAnimation:" + z17);
        this.f342567k = false;
        this.f342560d.d(z17);
        this.f342562f = null;
        this.f342563g = 0;
        this.f342561e = 0;
        this.f342566j = 0L;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = this.f342564h;
        if (b4Var2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var2);
            if (!b4Var2.e() && (b4Var = this.f342564h) != null) {
                b4Var.d();
            }
        }
        this.f342564h = null;
    }
}

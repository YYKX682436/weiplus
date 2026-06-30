package ec4;

/* loaded from: classes10.dex */
public final class d0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f332654d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f332655e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f332656f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f332657g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f332658h;

    /* renamed from: i, reason: collision with root package name */
    public int f332659i;

    /* renamed from: m, reason: collision with root package name */
    public int f332660m;

    /* renamed from: n, reason: collision with root package name */
    public int f332661n;

    /* renamed from: o, reason: collision with root package name */
    public int f332662o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f332663p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f332664q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f332665r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f332666s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.GestureDetector f332667t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.VelocityTracker f332668u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f332669v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f332670w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f332671x;

    /* renamed from: y, reason: collision with root package name */
    public float f332672y;

    /* renamed from: z, reason: collision with root package name */
    public int f332673z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f332654d = jz5.h.b(new ec4.w(this));
        this.f332655e = jz5.h.b(new ec4.t(this));
        this.f332656f = jz5.h.b(new ec4.c0(this));
        this.f332657g = jz5.h.b(new ec4.b0(this));
        this.f332665r = "";
        this.f332672y = 1.0f;
    }

    public static final /* synthetic */ android.view.VelocityTracker O6(ec4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMVelocityTracker$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        android.view.VelocityTracker velocityTracker = d0Var.f332668u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMVelocityTracker$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return velocityTracker;
    }

    public static final /* synthetic */ android.view.View P6(ec4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        android.view.View h17 = d0Var.h();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return h17;
    }

    public static final /* synthetic */ boolean Q6(ec4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getScaled$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        boolean z17 = d0Var.f332669v;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getScaled$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return z17;
    }

    public static final /* synthetic */ android.view.View R6(ec4.d0 d0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        android.view.View U6 = d0Var.U6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return U6;
    }

    public static final /* synthetic */ void S6(ec4.d0 d0Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setLongPress$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        d0Var.f332670w = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setLongPress$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }

    public final android.widget.ImageView T6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f332657g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return imageView;
    }

    public final android.view.View U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f332656f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoContainer", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return view;
    }

    public final void V6(boolean z17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runExitAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoAniUIC", "runExitAni >> " + this.f332664q);
        int width = h().getWidth();
        int height = h().getHeight();
        int i18 = this.f332661n;
        if (i18 != 0 && (i17 = this.f332662o) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f332658h;
        if (s4Var != null) {
            s4Var.f292232f = width;
            s4Var.f292233g = height;
            s4Var.e(this.f332659i, this.f332660m, i18, this.f332662o);
            if (!(((double) this.f332672y) == 1.0d)) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var2 = this.f332658h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s4Var2);
                float f17 = 1;
                s4Var2.f292240n = f17 / this.f332672y;
                if (this.f332673z != 0 || this.A != 0) {
                    int width2 = ((int) ((h().getWidth() / 2) * (f17 - this.f332672y))) + this.f332673z;
                    int height2 = (int) (((h().getHeight() / 2) + this.A) - ((height / 2) * this.f332672y));
                    com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var3 = this.f332658h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s4Var3);
                    s4Var3.f292241o = width2;
                    s4Var3.f292242p = height2;
                }
            }
            android.view.View U6 = U6();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f332655e).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getGalleyBg", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            s4Var.d(U6, (android.view.View) mo141623x754a37bb, false, new ec4.a0(this, z17), null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runExitAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }

    public final android.view.View h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f332654d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRoot", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        this.f332659i = m158359x1e885992().getIntExtra("intent_left", 0);
        this.f332660m = m158359x1e885992().getIntExtra("intent_top", 0);
        this.f332662o = m158359x1e885992().getIntExtra("intent_height", 0);
        this.f332661n = m158359x1e885992().getIntExtra("intent_width", 0);
        this.f332663p = m158359x1e885992().getBooleanExtra("intent_video_is_preview", false);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("intent_video_thumb_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f332665r = stringExtra;
        this.f332658h = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(m158354x19263085());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoAniUIC", "thumbPath >> " + this.f332665r);
        T6().setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(this.f332665r, 1.0f));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsFakeVideoAniUIC", "runEnterAni >> " + this.f332664q);
        if (this.f332664q) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        } else {
            this.f332664q = true;
            com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f332658h;
            if (s4Var != null) {
                s4Var.e(this.f332659i, this.f332660m, this.f332661n, this.f332662o);
                android.view.ViewTreeObserver viewTreeObserver = U6().getViewTreeObserver();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewTreeObserver, "getViewTreeObserver(...)");
                viewTreeObserver.addOnPreDrawListener(new ec4.y(this, s4Var));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("runEnterAni", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        }
        if (!this.f332663p) {
            this.f332667t = new android.view.GestureDetector(m158354x19263085(), new ec4.u(this));
            U6().setOnTouchListener(new ec4.v(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
    }
}

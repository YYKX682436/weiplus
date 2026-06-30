package jz0;

/* loaded from: classes5.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f384116d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f384117e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f384118f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f384119g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.s4 f384120h;

    /* renamed from: i, reason: collision with root package name */
    public int f384121i;

    /* renamed from: m, reason: collision with root package name */
    public int f384122m;

    /* renamed from: n, reason: collision with root package name */
    public int f384123n;

    /* renamed from: o, reason: collision with root package name */
    public int f384124o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f384125p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f384126q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f384127r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnTouchListener f384128s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.GestureDetector f384129t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.VelocityTracker f384130u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f384131v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f384132w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f384133x;

    /* renamed from: y, reason: collision with root package name */
    public float f384134y;

    /* renamed from: z, reason: collision with root package name */
    public int f384135z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f384116d = jz5.h.b(new jz0.d(this));
        this.f384117e = jz5.h.b(new jz0.a(this));
        this.f384118f = jz5.h.b(new jz0.j(this));
        this.f384119g = jz5.h.b(new jz0.i(this));
        this.f384134y = 1.0f;
    }

    public final android.view.View O6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f384117e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.View P6() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f384118f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void Q6(boolean z17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "runExitAni >> " + this.f384126q);
        int width = h().getWidth();
        int height = h().getHeight();
        int i18 = this.f384123n;
        if (i18 != 0 && (i17 = this.f384124o) != 0) {
            height = (int) ((width / i18) * i17);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f384120h;
        if (s4Var != null) {
            s4Var.f292232f = width;
            s4Var.f292233g = height;
            s4Var.e(this.f384121i, this.f384122m, i18, this.f384124o);
            if (!(((double) this.f384134y) == 1.0d)) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var2 = this.f384120h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s4Var2);
                float f17 = 1;
                s4Var2.f292240n = f17 / this.f384134y;
                if (this.f384135z != 0 || this.A != 0) {
                    int width2 = ((int) ((h().getWidth() / 2) * (f17 - this.f384134y))) + this.f384135z;
                    int height2 = (int) (((h().getHeight() / 2) + this.A) - ((height / 2) * this.f384134y));
                    com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var3 = this.f384120h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s4Var3);
                    s4Var3.f292241o = width2;
                    s4Var3.f292242p = height2;
                }
            }
            s4Var.d(P6(), O6(), false, new jz0.h(this, z17), null);
        }
    }

    public final android.view.View h() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f384116d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        Q6(false);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f384121i = m158359x1e885992().getIntExtra("intent_left", 0);
        this.f384122m = m158359x1e885992().getIntExtra("intent_top", 0);
        this.f384124o = m158359x1e885992().getIntExtra("intent_height", 0);
        this.f384123n = m158359x1e885992().getIntExtra("intent_width", 0);
        this.f384125p = m158359x1e885992().getBooleanExtra("intent_video_is_preview", false);
        this.f384120h = new com.p314xaae8f345.mm.ui.p2740x696c9db.s4(m158354x19263085());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String stringExtra = ((com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p916x4268f0dc.sns.p923x5525d53f.ui.C11022x6fd7187b.class)).m158359x1e885992().getStringExtra("intent_video_thumb_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "onCreate, " + this.f384125p + ", thumbPath:" + stringExtra);
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f384119g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.ImageView) mo141623x754a37bb).setImageBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.j.a(stringExtra, 1.0f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Maas.FakeVideoAniUIC", "runEnterAni >> " + this.f384126q);
        if (!this.f384126q) {
            this.f384126q = true;
            com.p314xaae8f345.mm.ui.p2740x696c9db.s4 s4Var = this.f384120h;
            if (s4Var != null) {
                s4Var.e(this.f384121i, this.f384122m, this.f384123n, this.f384124o);
                android.view.ViewTreeObserver viewTreeObserver = P6().getViewTreeObserver();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewTreeObserver, "getViewTreeObserver(...)");
                viewTreeObserver.addOnPreDrawListener(new jz0.f(this, s4Var));
            }
        }
        if (this.f384125p) {
            return;
        }
        this.f384129t = new android.view.GestureDetector(m158354x19263085(), new jz0.b(this));
        this.f384128s = new jz0.c(this);
        P6().setOnTouchListener(this.f384128s);
    }
}

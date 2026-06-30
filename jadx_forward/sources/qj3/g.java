package qj3;

/* loaded from: classes10.dex */
public final class g implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f445409d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f445410e;

    /* renamed from: f, reason: collision with root package name */
    public final uj3.k f445411f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f445412g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f445413h;

    /* renamed from: i, reason: collision with root package name */
    public qk.o9 f445414i;

    /* renamed from: m, reason: collision with root package name */
    public ym5.w2 f445415m;

    /* renamed from: n, reason: collision with root package name */
    public l45.q f445416n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f445417o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f445418p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f445419q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f445420r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f445421s;

    /* renamed from: t, reason: collision with root package name */
    public qk.g6 f445422t;

    /* renamed from: u, reason: collision with root package name */
    public int f445423u;

    public g(android.widget.FrameLayout photoLayout, ju3.d0 status, uj3.k kVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(photoLayout, "photoLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f445409d = photoLayout;
        this.f445410e = status;
        this.f445411f = kVar;
        this.f445412g = jz5.h.b(qj3.f.f445408d);
        this.f445413h = jz5.h.b(qj3.e.f445407d);
        this.f445417o = photoLayout.getContext();
        this.f445419q = java.lang.String.valueOf(java.lang.System.currentTimeMillis() + hashCode());
        this.f445422t = qk.g6.DEFAULT;
        this.f445423u = -1;
    }

    public final void a(boolean z17, ct0.b config) {
        qk.o9 o9Var;
        uj3.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f445420r = true;
        android.widget.FrameLayout frameLayout = this.f445409d;
        frameLayout.setVisibility(0);
        if (z17) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f445413h).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            o9Var = (qk.o9) mo141623x754a37bb;
        } else {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f445412g).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            o9Var = (qk.o9) mo141623x754a37bb2;
        }
        this.f445414i = o9Var;
        if (this.f445419q == null) {
            this.f445419q = java.lang.String.valueOf(java.lang.System.currentTimeMillis() + hashCode());
        }
        qk.o9 o9Var2 = this.f445414i;
        if (o9Var2 != null) {
            qk.l9 l9Var = new qk.l9();
            l9Var.f445765b = true;
            l9Var.f445766c = false;
            l9Var.f445764a = qk.n9.SCREEN;
            l9Var.f445770g = false;
            l9Var.f445772i = config.f303751o;
            l9Var.f445773j = 0;
            l9Var.f445767d = this.f445419q;
            o9Var2.d(l9Var);
        }
        qk.o9 o9Var3 = this.f445414i;
        qk.s c17 = o9Var3 != null ? o9Var3.c(this.f445417o) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.view.MultiTalkDrawingView");
        ym5.w2 w2Var = (ym5.w2) c17;
        this.f445415m = w2Var;
        if (((bn5.g) w2Var.m177310x5143ab24()) != null && (kVar = this.f445411f) != null) {
            kVar.f509836c.contains(9);
        }
        ym5.w2 w2Var2 = this.f445415m;
        dn5.e eVar = w2Var2 != null ? (dn5.e) w2Var2.m177311xc3ab3d87() : null;
        if (eVar != null) {
            eVar.m125843x1adb0b7f(true);
        }
        ym5.w2 w2Var3 = this.f445415m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(w2Var3, "null cannot be cast to non-null type com.tencent.mm.view.MultiTalkDrawingView");
        l45.q m177317xc879b3f2 = w2Var3.m177317xc879b3f2();
        this.f445416n = m177317xc879b3f2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m177317xc879b3f2, "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter");
        ((l45.n) m177317xc879b3f2).f398012t = new qj3.b(this);
        frameLayout.addView(this.f445415m, new android.widget.FrameLayout.LayoutParams(-1, -1));
        ym5.w2 w2Var4 = this.f445415m;
        if (w2Var4 != null) {
            w2Var4.m160424xbe8e76ed(new qj3.c(this));
        }
        l45.q qVar = this.f445416n;
        if (qVar != null) {
            dl.u uVar = (dl.u) ((l45.n) qVar).d(qk.g6.DOODLE);
            if (uVar != null) {
                uVar.f316586o = new qj3.d(this);
            }
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        qk.g6 g6Var = this.f445422t;
        qk.g6 g6Var2 = qk.g6.CROP_PHOTO;
        if (g6Var != g6Var2) {
            return false;
        }
        this.f445422t = qk.g6.DEFAULT;
        l45.q qVar = this.f445416n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).b(g6Var2, 1, null);
        }
        return true;
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f445412g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((qk.o9) mo141623x754a37bb).f();
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) this.f445413h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        ((qk.o9) mo141623x754a37bb2).f();
        android.widget.FrameLayout frameLayout = this.f445409d;
        frameLayout.removeAllViews();
        frameLayout.setVisibility(8);
        l45.q qVar = this.f445416n;
        if (qVar != null) {
            ((l45.n) qVar).p();
        }
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        qk.g6 g6Var = qk.g6.DEFAULT;
        this.f445422t = g6Var;
        l45.q qVar = this.f445416n;
        if (qVar != null) {
            new l45.a((l45.n) qVar).a(g6Var);
        }
        l45.q qVar2 = this.f445416n;
        if (qVar2 != null) {
            new l45.a((l45.n) qVar2).b(g6Var, -1, null);
        }
    }
}

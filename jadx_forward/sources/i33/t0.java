package i33;

/* loaded from: classes10.dex */
public final class t0 extends i33.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f369780f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f369781g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f369782h;

    /* renamed from: i, reason: collision with root package name */
    public final int f369783i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f369784m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f369785n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f369786o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f369787p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f369788q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f369789r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f369790s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f369791t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f369792u;

    /* renamed from: v, reason: collision with root package name */
    public final float f369793v;

    /* renamed from: w, reason: collision with root package name */
    public final long f369794w;

    /* renamed from: x, reason: collision with root package name */
    public j33.c0 f369795x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f369796y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f369797z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f369780f = "MicroMsg.AlbumScrollBarUIC";
        this.f369783i = 2;
        this.f369784m = jz5.h.b(new i33.p0(this));
        this.f369785n = jz5.h.b(new i33.o0(this));
        this.f369786o = jz5.h.b(new i33.n0(this));
        this.f369787p = jz5.h.b(new i33.r0(activity));
        this.f369788q = jz5.h.b(new i33.f0(activity));
        this.f369789r = jz5.h.b(new i33.s0(activity));
        this.f369790s = jz5.h.b(new i33.e0(this));
        this.f369791t = jz5.h.b(new i33.d0(this));
        this.f369792u = jz5.h.b(new i33.k0(activity, this));
        this.f369793v = 1.0f;
        this.f369794w = 50L;
        this.f369797z = jz5.h.b(new i33.q0(this));
    }

    public static final void W6(i33.t0 t0Var) {
        if (t0Var.f369782h) {
            t0Var.f369782h = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f369780f, "scrollbar: event come, notifyModeChanged --> FULL_SCREEN_FOCUS");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = t0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            i33.z0 z0Var = (i33.z0) pf5.z.f435481a.a(activity).e(i33.z0.class);
            if (z0Var != null) {
                z0Var.W6(com.p314xaae8f345.mm.ui.q2.FULL_SCREEN_FOCUS);
            }
        }
    }

    @Override // i33.c
    public void V6(com.p314xaae8f345.mm.ui.q2 oldMode, com.p314xaae8f345.mm.ui.q2 newMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldMode, "oldMode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newMode, "newMode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectModeChanged: oldMode=");
        sb6.append(oldMode);
        sb6.append(", newMode=");
        sb6.append(newMode);
        sb6.append(", scrollBarFocusing=");
        sb6.append(Z6().getF220205e() == com.p314xaae8f345.mm.ui.q2.FULL_SCREEN_FOCUS);
        sb6.append(", scrollBarDragging=");
        sb6.append(this.f369781g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f369780f, sb6.toString());
        if (oldMode == newMode) {
            return;
        }
        if (newMode == com.p314xaae8f345.mm.ui.q2.NORMAL) {
            this.f369781g = false;
        } else {
            d7();
            Y6(true);
        }
    }

    public final void X6() {
        if (this.f369795x != null) {
            a7().removeCallbacks(this.f369795x);
            this.f369795x = null;
            a7().getVisibility();
        }
    }

    public final void Y6(boolean z17) {
        android.os.Vibrator vibrator;
        com.p314xaae8f345.mm.ui.q2 q2Var = com.p314xaae8f345.mm.ui.q2.FULL_SCREEN_FOCUS;
        com.p314xaae8f345.mm.ui.q2 q2Var2 = com.p314xaae8f345.mm.ui.q2.NORMAL;
        com.p314xaae8f345.mm.ui.q2 q2Var3 = z17 ? q2Var : q2Var2;
        java.util.Objects.toString(Z6().getF220205e());
        q2Var3.toString();
        if (Z6().getF220205e() != q2Var3) {
            if (z17 && (vibrator = (android.os.Vibrator) ((jz5.n) this.f369789r).mo141623x754a37bb()) != null) {
                vibrator.vibrate(this.f369794w);
            }
            java.lang.String str = "refreshScrollBarMode: oldMode=" + Z6().getF220205e() + ", newMode=" + q2Var3;
            java.lang.String str2 = this.f369780f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            if (Z6().getF220205e() == q2Var3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "refreshScrollBarMode: same mode, skip");
                return;
            }
            if (q2Var3 == q2Var2) {
                k33.d.a(Z6(), q2Var2, 500L, null, null, 4, null);
                return;
            }
            float translationY = a7().getTranslationY();
            float a17 = b7().a(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed) Z6()).c(b7().b(), q2Var3)) - translationY;
            if (this.f369781g) {
                k33.d.a(Z6(), q2Var, 100L, null, null, 4, null);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed) Z6()).b(q2Var, 100L, new i33.m0(this, translationY, a17), null);
            }
        }
    }

    public final k33.d Z6() {
        return (k33.d) ((jz5.n) this.f369786o).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15673xa51c39ca a7() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f369785n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15673xa51c39ca) mo141623x754a37bb;
    }

    public final j33.w b7() {
        return (j33.w) ((jz5.n) this.f369784m).mo141623x754a37bb();
    }

    public final void c7(long j17) {
        if (a7().getVisibility() == 0) {
            this.f369795x = new j33.c0(a7(), b7(), 0L, 0L, new i33.l0(this), null, 44, null);
            a7().postDelayed(this.f369795x, j17);
        }
    }

    public final void d7() {
        if (a7().getVisibility() != 0) {
            Y6(false);
            new j33.m(a7(), true, 0L, null, 12, null).run();
            j33.w b76 = b7();
            int b17 = b76.b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed c15676xd39461ed = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15676xd39461ed) b76.f378994b;
            a7().setTranslationY(b76.a(c15676xd39461ed.c(b17, c15676xd39461ed.f220205e)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f369780f, "showScrollBar: ");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f435481a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            i33.z0.Y6(z0Var, this, 0, 2, null);
        }
        T6().i(new i33.i0(this));
        T6().P(new i33.j0(this));
        a7().setOnTouchListener(new i33.g0(this, new android.view.GestureDetector(m80379x76847179(), new i33.h0(this)), new p3321xbce91901.jvm.p3324x21ffc6bd.e0()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        j33.c0 c0Var = this.f369795x;
        if (c0Var != null) {
            c0Var.f378955g = null;
            c0Var.f378956h = null;
        }
        a7().removeCallbacks(this.f369795x);
    }
}

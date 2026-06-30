package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class z5 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    public android.graphics.Bitmap A;
    public boolean B;
    public final int C;
    public long D;
    public final p3325xe03a0797.p3326xc267989b.y0 E;
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j5 F;
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k5 G;
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w4 H;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f233101d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f233102e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f233103f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f233104g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f233105h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f233106i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f233107m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f233108n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f233109o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f233110p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f233111q;

    /* renamed from: r, reason: collision with root package name */
    public kk4.d f233112r;

    /* renamed from: s, reason: collision with root package name */
    public long f233113s;

    /* renamed from: t, reason: collision with root package name */
    public long f233114t;

    /* renamed from: u, reason: collision with root package name */
    public long f233115u;

    /* renamed from: v, reason: collision with root package name */
    public float f233116v;

    /* renamed from: w, reason: collision with root package name */
    public fm3.q f233117w;

    /* renamed from: x, reason: collision with root package name */
    public int f233118x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Bitmap f233119y;

    /* renamed from: z, reason: collision with root package name */
    public int f233120z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f233101d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x5(this));
        this.f233102e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c5(this));
        this.f233103f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h5(this));
        this.f233104g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y5(this));
        this.f233105h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v5(this));
        this.f233106i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.b5(this));
        this.f233107m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.a5(this));
        this.f233108n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d5(activity));
        this.f233109o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z4(this));
        this.f233110p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l5(this));
        this.f233111q = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e5(this));
        this.f233118x = Integer.MAX_VALUE;
        this.f233120z = Integer.MAX_VALUE;
        this.C = i65.a.b(activity, 48);
        this.D = -1L;
        this.E = p3325xe03a0797.p3326xc267989b.z0.b();
        this.F = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.j5(this);
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k5(this);
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var) {
        gk4.b effector;
        fm3.q qVar = z5Var.f233117w;
        if (qVar != null) {
            int i17 = qVar.f345640e;
            if (qVar.f345647o == null || i17 > z5Var.f233118x) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "tryCatchFirstFrame, timeInMv:" + i17 + ", firstRenderTime:" + z5Var.f233118x);
            kk4.d dVar = z5Var.f233112r;
            if (dVar == null || (effector = dVar.getEffector()) == null) {
                return;
            }
            gk4.h0 h0Var = (gk4.h0) effector;
            h0Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w5(i17, z5Var);
            h0Var.F = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h0Var.f354089a, "request snapshot");
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x4 P6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x4) ((jz5.n) this.f233109o).mo141623x754a37bb();
    }

    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 Q6() {
        return (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.f233107m).mo141623x754a37bb();
    }

    public final android.widget.LinearLayout R6() {
        return (android.widget.LinearLayout) ((jz5.n) this.f233102e).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16696x18533e6c S6() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16696x18533e6c) ((jz5.n) this.f233110p).mo141623x754a37bb();
    }

    public final android.widget.ImageView T6() {
        return (android.widget.ImageView) ((jz5.n) this.f233105h).mo141623x754a37bb();
    }

    public final bm3.c U6() {
        return (bm3.c) ((jz5.n) this.f233101d).mo141623x754a37bb();
    }

    public final void V6() {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16682xd79fb962 c16682xd79fb962;
        int mo1894x7e414b06 = P6().mo1894x7e414b06();
        for (int i17 = 0; i17 < mo1894x7e414b06; i17++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = Q6().p0(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4 y4Var = p07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4 ? (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y4) p07 : null;
            if (y4Var != null && (c16682xd79fb962 = y4Var.f233088d) != null) {
                rm5.k kVar = c16682xd79fb962.f233143t;
                if (kVar != null) {
                    kVar.mo122875x5cd39ffa();
                }
                c16682xd79fb962.f233143t = null;
                c16682xd79fb962.f233132f = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16682xd79fb962.f233130d, "clearThumb");
                c16682xd79fb962.f233133g.clear();
                c16682xd79fb962.f233134h = null;
                c16682xd79fb962.postInvalidate();
            }
        }
        P6().f233060e = null;
        Q6().postInvalidate();
    }

    public final void W6(boolean z17) {
        kk4.b player;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerItemEditUIC", "setShow:" + z17);
        if (z17) {
            T6().setImageDrawable(null);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class)).U6();
            R6().setVisibility(0);
            R6().animate().alpha(1.0f).setDuration(250L).setListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m5(this)).start();
            return;
        }
        T6().setImageDrawable(null);
        kk4.d dVar = this.f233112r;
        if (dVar != null && (player = dVar.getPlayer()) != null) {
            kk4.b.i(player, false, false, 3, null);
        }
        V6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
        h4Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "resumeVideo");
        h4Var.R6().m8147xed6e4d18(h4Var.f232700n.f233397m);
        R6().animate().alpha(0.0f).withEndAction(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n5(this)).start();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        if (R6().getVisibility() != 0) {
            return super.mo2274xbdc3c5dc();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w4 w4Var = this.H;
        if (w4Var == null) {
            return true;
        }
        ((jm3.j0) w4Var).a(this.B);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        S6().m67377x111e8beb(-1);
        S6().m67379x12358a4e(i65.a.b(m158354x19263085(), 2));
        U6().f104032b.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f5(this));
        U6().f104033c.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g5(this));
        R6().setAlpha(0.0f);
        Q6().mo7960x6cab2c8d(P6());
        Q6().mo7967x900dcbe1((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) this.f233108n).mo141623x754a37bb());
        Q6().i(this.G);
        df0.q qVar = (df0.q) i95.n0.c(df0.q.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        ((cf0.q) qVar).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9((android.content.Context) context, false);
        this.f233112r = c18691x35cf85c9;
        c18691x35cf85c9.c();
        java.lang.Object obj = this.f233112r;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            view.setKeepScreenOn(true);
        }
        java.lang.Object obj2 = this.f233112r;
        android.view.View view2 = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
        if (view2 != null) {
            view2.setId(com.p314xaae8f345.mm.R.id.k0o);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f233104g).mo141623x754a37bb();
        java.lang.Object obj3 = this.f233112r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.view.View");
        frameLayout.addView((android.view.View) obj3, layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gk4.b effector;
        kk4.b player;
        kk4.d dVar = this.f233112r;
        if (dVar != null && (player = dVar.getPlayer()) != null) {
            player.mo143590x408b7293();
        }
        kk4.d dVar2 = this.f233112r;
        if (dVar2 != null && (effector = dVar2.getEffector()) != null) {
            gk4.h0 h0Var = (gk4.h0) effector;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = h0Var.f354093e;
            if (n3Var != null) {
                n3Var.mo50302x6b17ad39(null);
            }
            h0Var.e(new gk4.f0(h0Var));
        }
        rm5.c cVar = rm5.h.f479022h;
        rm5.h.f479023i.evictAll();
    }
}

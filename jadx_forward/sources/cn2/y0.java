package cn2;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Integer[] f125173n = {89, 64, java.lang.Integer.valueOf(be1.j0.f4220x366c91de)};

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f125174a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f125175b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f125176c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f125177d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f125178e;

    /* renamed from: f, reason: collision with root package name */
    public final android.animation.ObjectAnimator f125179f;

    /* renamed from: g, reason: collision with root package name */
    public final android.animation.ObjectAnimator f125180g;

    /* renamed from: h, reason: collision with root package name */
    public final android.animation.ObjectAnimator f125181h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f125182i;

    /* renamed from: j, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f125183j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f125184k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f125185l;

    /* renamed from: m, reason: collision with root package name */
    public final android.animation.AnimatorSet f125186m;

    public y0(android.view.ViewGroup bullet, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg plugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bullet, "bullet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        this.f125174a = bullet;
        this.f125175b = plugin;
        this.f125176c = jz5.h.b(new cn2.t0(this));
        this.f125177d = jz5.h.b(new cn2.s0(this));
        this.f125178e = jz5.h.b(new cn2.v0(this));
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(c(), "scaleX", 0.0f, 1.1f).setDuration(125L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
        this.f125179f = duration;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(c(), "scaleY", 0.0f, 1.1f).setDuration(125L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration2, "setDuration(...)");
        this.f125180g = duration2;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(c(), "alpha", 0.0f, 1.0f).setDuration(208L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration3, "setDuration(...)");
        this.f125181h = duration3;
        this.f125182i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        jz5.g b17 = jz5.h.b(new cn2.r0(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(c(), "scaleX", 1.1f, 1.0f).setDuration(83L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration4, "setDuration(...)");
        duration4.setStartDelay(125L);
        android.animation.ObjectAnimator duration5 = android.animation.ObjectAnimator.ofFloat(c(), "scaleY", 1.1f, 1.0f).setDuration(83L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration5, "setDuration(...)");
        duration5.setStartDelay(125L);
        c().setPivotX(0.0f);
        c().setPivotY(c().getMeasuredHeight());
        animatorSet.playTogether(duration, duration2, duration4, duration5, duration3);
        animatorSet.addListener((cn2.q0) ((jz5.n) b17).mo141623x754a37bb());
        this.f125186m = animatorSet;
    }

    public static final void a(cn2.y0 y0Var) {
        java.util.List cntQueue = y0Var.f125182i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cntQueue, "cntQueue");
        if (!cntQueue.isEmpty()) {
            y0Var.f125186m.start();
            return;
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = y0Var.f125183j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        y0Var.f125183j = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(y0Var.f125175b, null, null, new cn2.w0(y0Var, null), 3, null);
    }

    public final void b(int i17, int i18) {
        java.util.List list = this.f125182i;
        if (i17 <= i18) {
            while (true) {
                if (!kz5.z.G(f125173n, java.lang.Integer.valueOf(i17))) {
                    list.add(java.lang.Integer.valueOf(i17));
                }
                if (i17 == i18) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(list.size() - 8);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            for (long j17 = 0; j17 < longValue; j17++) {
                int j18 = e06.p.j(e06.p.m(1, list.size() - 1), c06.e.f119249d);
                list.size();
                list.remove(j18);
            }
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234 c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14323xd3329234) this.f125177d.mo141623x754a37bb();
    }

    public final void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveHotCommentWidget", "hotCommentWidget Reset");
        jz5.g gVar = this.f125178e;
        if (((android.animation.ObjectAnimator) ((jz5.n) gVar).mo141623x754a37bb()).isRunning()) {
            ((android.animation.ObjectAnimator) ((jz5.n) gVar).mo141623x754a37bb()).cancel();
        }
        android.animation.AnimatorSet animatorSet = this.f125186m;
        if (animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        this.f125182i.clear();
        this.f125174a.setVisibility(8);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f125183j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f125184k = null;
    }
}

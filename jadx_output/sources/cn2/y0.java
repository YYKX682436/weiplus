package cn2;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Integer[] f43640n = {89, 64, java.lang.Integer.valueOf(be1.j0.CTRL_INDEX)};

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f43641a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.mg f43642b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f43643c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f43644d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f43645e;

    /* renamed from: f, reason: collision with root package name */
    public final android.animation.ObjectAnimator f43646f;

    /* renamed from: g, reason: collision with root package name */
    public final android.animation.ObjectAnimator f43647g;

    /* renamed from: h, reason: collision with root package name */
    public final android.animation.ObjectAnimator f43648h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f43649i;

    /* renamed from: j, reason: collision with root package name */
    public kotlinx.coroutines.r2 f43650j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f43651k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.l f43652l;

    /* renamed from: m, reason: collision with root package name */
    public final android.animation.AnimatorSet f43653m;

    public y0(android.view.ViewGroup bullet, com.tencent.mm.plugin.finder.live.plugin.mg plugin) {
        kotlin.jvm.internal.o.g(bullet, "bullet");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f43641a = bullet;
        this.f43642b = plugin;
        this.f43643c = jz5.h.b(new cn2.t0(this));
        this.f43644d = jz5.h.b(new cn2.s0(this));
        this.f43645e = jz5.h.b(new cn2.v0(this));
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(c(), "scaleX", 0.0f, 1.1f).setDuration(125L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        this.f43646f = duration;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(c(), "scaleY", 0.0f, 1.1f).setDuration(125L);
        kotlin.jvm.internal.o.f(duration2, "setDuration(...)");
        this.f43647g = duration2;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(c(), "alpha", 0.0f, 1.0f).setDuration(208L);
        kotlin.jvm.internal.o.f(duration3, "setDuration(...)");
        this.f43648h = duration3;
        this.f43649i = java.util.Collections.synchronizedList(new java.util.ArrayList());
        jz5.g b17 = jz5.h.b(new cn2.r0(this));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(c(), "scaleX", 1.1f, 1.0f).setDuration(83L);
        kotlin.jvm.internal.o.f(duration4, "setDuration(...)");
        duration4.setStartDelay(125L);
        android.animation.ObjectAnimator duration5 = android.animation.ObjectAnimator.ofFloat(c(), "scaleY", 1.1f, 1.0f).setDuration(83L);
        kotlin.jvm.internal.o.f(duration5, "setDuration(...)");
        duration5.setStartDelay(125L);
        c().setPivotX(0.0f);
        c().setPivotY(c().getMeasuredHeight());
        animatorSet.playTogether(duration, duration2, duration4, duration5, duration3);
        animatorSet.addListener((cn2.q0) ((jz5.n) b17).getValue());
        this.f43653m = animatorSet;
    }

    public static final void a(cn2.y0 y0Var) {
        java.util.List cntQueue = y0Var.f43649i;
        kotlin.jvm.internal.o.f(cntQueue, "cntQueue");
        if (!cntQueue.isEmpty()) {
            y0Var.f43653m.start();
            return;
        }
        kotlinx.coroutines.r2 r2Var = y0Var.f43650j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        y0Var.f43650j = com.tencent.mm.plugin.finder.live.util.y.m(y0Var.f43642b, null, null, new cn2.w0(y0Var, null), 3, null);
    }

    public final void b(int i17, int i18) {
        java.util.List list = this.f43649i;
        if (i17 <= i18) {
            while (true) {
                if (!kz5.z.G(f43640n, java.lang.Integer.valueOf(i17))) {
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
                int j18 = e06.p.j(e06.p.m(1, list.size() - 1), c06.e.f37716d);
                list.size();
                list.remove(j18);
            }
        }
    }

    public final com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView c() {
        return (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) this.f43644d.getValue();
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("FinderLiveHotCommentWidget", "hotCommentWidget Reset");
        jz5.g gVar = this.f43645e;
        if (((android.animation.ObjectAnimator) ((jz5.n) gVar).getValue()).isRunning()) {
            ((android.animation.ObjectAnimator) ((jz5.n) gVar).getValue()).cancel();
        }
        android.animation.AnimatorSet animatorSet = this.f43653m;
        if (animatorSet.isRunning()) {
            animatorSet.cancel();
        }
        this.f43649i.clear();
        this.f43641a.setVisibility(8);
        kotlinx.coroutines.r2 r2Var = this.f43650j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f43651k = null;
    }
}

package cn2;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final cn2.p0 f43478a;

    /* renamed from: b, reason: collision with root package name */
    public final cn2.n f43479b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f43480c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f43481d;

    /* renamed from: e, reason: collision with root package name */
    public cn2.k f43482e;

    /* renamed from: f, reason: collision with root package name */
    public long f43483f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f43484g;

    /* renamed from: h, reason: collision with root package name */
    public org.libpag.PAGFile f43485h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.rfx.RfxPagFile f43486i;

    /* renamed from: j, reason: collision with root package name */
    public kotlinx.coroutines.r2 f43487j;

    public c0(cn2.p0 widget, cn2.n listener) {
        kotlin.jvm.internal.o.g(widget, "widget");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f43478a = widget;
        this.f43479b = listener;
        this.f43480c = "Finder.LiveCommentPlugin_BulletNew_Animation" + hashCode();
        this.f43484g = jz5.h.b(cn2.a0.f43466d);
    }

    public static final void a(cn2.c0 c0Var, android.view.View view) {
        kotlinx.coroutines.r2 r2Var = c0Var.f43487j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.b1v);
        com.tencent.mm.view.MMPAGView mMPAGView = findViewById instanceof com.tencent.mm.view.MMPAGView ? (com.tencent.mm.view.MMPAGView) findViewById : null;
        if (mMPAGView != null && mMPAGView.getVisibility() == 0) {
            if (mMPAGView != null) {
                mMPAGView.n();
            }
            if (mMPAGView == null) {
                return;
            }
            mMPAGView.setVisibility(4);
        }
    }

    public static final void b(cn2.c0 c0Var, android.view.View view) {
        cn2.j1 j1Var;
        c0Var.getClass();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.b1z);
        com.tencent.mm.plugin.finder.live.widget.bulletcommet.LightStartFrameLayout lightStartFrameLayout = findViewById instanceof com.tencent.mm.plugin.finder.live.widget.bulletcommet.LightStartFrameLayout ? (com.tencent.mm.plugin.finder.live.widget.bulletcommet.LightStartFrameLayout) findViewById : null;
        if (lightStartFrameLayout == null || (j1Var = lightStartFrameLayout.f117922e) == null) {
            return;
        }
        j1Var.b(1);
    }

    public static final void c(cn2.c0 c0Var, android.view.View view, android.graphics.Bitmap bitmap, long j17, float f17, float f18) {
        c0Var.getClass();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f484574er2);
        com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout flashFlightConstraintLayout = findViewById instanceof com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout ? (com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout) findViewById : null;
        if (flashFlightConstraintLayout != null) {
            kotlin.jvm.internal.o.g(bitmap, "bitmap");
            cn2.e1 e1Var = flashFlightConstraintLayout.f117920w;
            if (e1Var == null) {
                e1Var = new cn2.e1(flashFlightConstraintLayout);
            }
            flashFlightConstraintLayout.f117920w = e1Var;
            com.tencent.mars.xlog.Log.i(e1Var.f43499b, "play!");
            e1Var.f43503f = bitmap;
            e1Var.f43504g = f18;
            e1Var.f43508k = f17;
            if (e1Var.a().isRunning()) {
                e1Var.a().cancel();
            }
            e1Var.a().setDuration(j17);
            e1Var.a().start();
        }
    }

    public static final void d(cn2.c0 c0Var, android.view.View view, java.lang.Object obj, long j17, long j18) {
        kotlinx.coroutines.r2 r2Var = c0Var.f43487j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        c0Var.f43487j = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new cn2.q(view, obj, c0Var, j17, j18, null), 3, null);
    }

    public static final java.lang.Object e(cn2.c0 c0Var, android.view.View view, long j17, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        c0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        if (c0Var.i().isRunning()) {
            com.tencent.mars.xlog.Log.i(c0Var.f43480c, "startAnim but it's runing now!");
            c0Var.i().cancel();
        }
        c0Var.i().setDuration(j17);
        c0Var.i().addUpdateListener(new cn2.b0(view, i17, z17, new kotlin.jvm.internal.c0(), nVar));
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation", "startAnim", "(Landroid/view/View;JIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation", "startAnim", "(Landroid/view/View;JIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        c0Var.i().start();
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public static final void g(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation, boolean z17) {
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }

    public static final void k(kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation, boolean z17) {
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }

    public final java.lang.Object f(android.view.View view, long j17, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        if (view.getAlpha() <= 0.0f) {
            g(c0Var, nVar, false);
        } else {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(j17);
            ofFloat.addListener(new cn2.o(c0Var, nVar));
            ofFloat.start();
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r10, android.view.View r12, cn2.k r13, yz5.l r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn2.c0.h(long, android.view.View, cn2.k, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final android.animation.ValueAnimator i() {
        java.lang.Object value = ((jz5.n) this.f43484g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.animation.ValueAnimator) value;
    }

    public final void j(int i17) {
        com.tencent.mars.xlog.Log.i(this.f43480c, "hideAnim source:" + i17);
        kotlinx.coroutines.r2 r2Var = this.f43481d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f43481d = null;
    }
}

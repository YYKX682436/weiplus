package cn2;

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final cn2.p0 f125011a;

    /* renamed from: b, reason: collision with root package name */
    public final cn2.n f125012b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f125013c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f125014d;

    /* renamed from: e, reason: collision with root package name */
    public cn2.k f125015e;

    /* renamed from: f, reason: collision with root package name */
    public long f125016f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f125017g;

    /* renamed from: h, reason: collision with root package name */
    public org.p3363xbe4143f1.C29690xfae77312 f125018h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee f125019i;

    /* renamed from: j, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f125020j;

    public c0(cn2.p0 widget, cn2.n listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f125011a = widget;
        this.f125012b = listener;
        this.f125013c = "Finder.LiveCommentPlugin_BulletNew_Animation" + hashCode();
        this.f125017g = jz5.h.b(cn2.a0.f124999d);
    }

    public static final void a(cn2.c0 c0Var, android.view.View view) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = c0Var.f125020j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.b1v);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = findViewById instanceof com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b ? (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById : null;
        if (c22789xd23e9a9b != null && c22789xd23e9a9b.getVisibility() == 0) {
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.n();
            }
            if (c22789xd23e9a9b == null) {
                return;
            }
            c22789xd23e9a9b.setVisibility(4);
        }
    }

    public static final void b(cn2.c0 c0Var, android.view.View view) {
        cn2.j1 j1Var;
        c0Var.getClass();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.b1z);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14422x564c9a4b c14422x564c9a4b = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14422x564c9a4b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14422x564c9a4b) findViewById : null;
        if (c14422x564c9a4b == null || (j1Var = c14422x564c9a4b.f199455e) == null) {
            return;
        }
        j1Var.b(1);
    }

    public static final void c(cn2.c0 c0Var, android.view.View view, android.graphics.Bitmap bitmap, long j17, float f17, float f18) {
        c0Var.getClass();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14421xa34c3be7 c14421xa34c3be7 = findViewById instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14421xa34c3be7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1546x3dca443d.C14421xa34c3be7) findViewById : null;
        if (c14421xa34c3be7 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
            cn2.e1 e1Var = c14421xa34c3be7.f199453w;
            if (e1Var == null) {
                e1Var = new cn2.e1(c14421xa34c3be7);
            }
            c14421xa34c3be7.f199453w = e1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e1Var.f125032b, "play!");
            e1Var.f125036f = bitmap;
            e1Var.f125037g = f18;
            e1Var.f125041k = f17;
            if (e1Var.a().isRunning()) {
                e1Var.a().cancel();
            }
            e1Var.a().setDuration(j17);
            e1Var.a().start();
        }
    }

    public static final void d(cn2.c0 c0Var, android.view.View view, java.lang.Object obj, long j17, long j18) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = c0Var.f125020j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        c0Var.f125020j = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new cn2.q(view, obj, c0Var, j17, j18, null), 3, null);
    }

    public static final java.lang.Object e(cn2.c0 c0Var, android.view.View view, long j17, int i17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        c0Var.getClass();
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        if (c0Var.i().isRunning()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c0Var.f125013c, "startAnim but it's runing now!");
            c0Var.i().cancel();
        }
        c0Var.i().setDuration(j17);
        c0Var.i().addUpdateListener(new cn2.b0(view, i17, z17, new p3321xbce91901.jvm.p3324x21ffc6bd.c0(), nVar));
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation", "startAnim", "(Landroid/view/View;JIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentAnimation", "startAnim", "(Landroid/view/View;JIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        c0Var.i().start();
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    public static final void g(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17) {
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
    }

    public static final void k(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17) {
        if (c0Var.f391645d) {
            return;
        }
        c0Var.f391645d = true;
        interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17)));
    }

    public final java.lang.Object f(android.view.View view, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        if (view.getAlpha() <= 0.0f) {
            g(c0Var, nVar, false);
        } else {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(j17);
            ofFloat.addListener(new cn2.o(c0Var, nVar));
            ofFloat.start();
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
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
    public final java.lang.Object h(long r10, android.view.View r12, cn2.k r13, yz5.l r14, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r15) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn2.c0.h(long, android.view.View, cn2.k, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final android.animation.ValueAnimator i() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f125017g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.animation.ValueAnimator) mo141623x754a37bb;
    }

    public final void j(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f125013c, "hideAnim source:" + i17);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f125014d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f125014d = null;
    }
}

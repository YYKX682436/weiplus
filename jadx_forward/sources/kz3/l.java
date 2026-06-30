package kz3;

/* loaded from: classes15.dex */
public final class l implements sy3.c, kz3.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f395416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f395417b;

    /* renamed from: c, reason: collision with root package name */
    public ry3.m f395418c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f395419d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f395420e;

    /* renamed from: f, reason: collision with root package name */
    public sy3.a f395421f;

    /* renamed from: g, reason: collision with root package name */
    public long f395422g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f395423h;

    /* renamed from: i, reason: collision with root package name */
    public sy3.e f395424i;

    /* renamed from: j, reason: collision with root package name */
    public final kz3.m f395425j;

    /* renamed from: k, reason: collision with root package name */
    public final kz3.p f395426k;

    /* renamed from: l, reason: collision with root package name */
    public final kz3.w f395427l;

    /* renamed from: m, reason: collision with root package name */
    public uy3.j0 f395428m;

    /* renamed from: n, reason: collision with root package name */
    public final uy3.v f395429n;

    /* renamed from: o, reason: collision with root package name */
    public uy3.q f395430o;

    /* renamed from: p, reason: collision with root package name */
    public final kz3.g f395431p;

    /* renamed from: q, reason: collision with root package name */
    public final db5.e0 f395432q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f395433r;

    /* renamed from: s, reason: collision with root package name */
    public final kz3.i f395434s;

    public l(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f395425j = new kz3.n();
        this.f395427l = new kz3.w(this);
        this.f395429n = new kz3.h(this);
        this.f395431p = new kz3.g(this);
        this.f395432q = new kz3.j(this);
        this.f395434s = new kz3.i(this);
        this.f395416a = context;
        this.f395417b = i17;
        this.f395426k = new kz3.p(context, this);
    }

    public void a(android.view.View view) {
        this.f395419d = view;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) view).m45746x52d44d05(new kz3.f(this));
        }
        android.view.KeyEvent.Callback callback = this.f395419d;
        if (callback instanceof db5.f0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).mo79204xfe3d8052(this.f395432q);
        }
    }

    public boolean b(long j17) {
        boolean z17;
        kz3.m mVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "cancelImageOCR sessionId: %s, uploadFinish: %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f395423h));
        boolean z18 = false;
        if (j17 == 0 || this.f395423h) {
            z17 = false;
        } else {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(j17);
            z17 = true;
        }
        uy3.j0 j0Var = this.f395428m;
        if (j0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            if (j0Var.D()) {
                uy3.j0 j0Var2 = this.f395428m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var2);
                z18 = j0Var2.isShowing();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "cancelImageOCR dismiss dialog handled: %s", java.lang.Boolean.valueOf(z18));
                uy3.j0 j0Var3 = this.f395428m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var3);
                j0Var3.dismiss();
                z17 = true;
            }
        }
        if (z17 && (mVar = this.f395425j) != null) {
            kz3.n nVar = (kz3.n) mVar;
            if (nVar.f395435a == j17 && !nVar.f395436b) {
                nVar.f395436b = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21699, java.lang.String.valueOf(j17), 1, -1);
            }
        }
        return z18;
    }

    public boolean c() {
        uy3.j0 j0Var = this.f395428m;
        if (j0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            if (j0Var.isShowing()) {
                return true;
            }
        }
        return false;
    }

    public void d(android.content.res.Configuration configuration) {
        uy3.j0 j0Var = this.f395428m;
        if (j0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            if (j0Var.D()) {
                kz3.p pVar = this.f395426k;
                if (pVar != null) {
                    if (configuration != null && configuration.orientation == 2) {
                        pVar.n(false);
                        int i17 = pVar.f395452t;
                        if (i17 == 1) {
                            android.view.KeyEvent.Callback callback = pVar.f395442g;
                            if (callback instanceof db5.f0) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                                ((db5.f0) callback).f();
                            }
                            pVar.i(-1, -1);
                        } else if (i17 == 2) {
                            pVar.i(-1, -1);
                        }
                        if (pVar.f395442g instanceof db5.f0) {
                            pVar.m(true);
                            android.view.KeyEvent.Callback callback2 = pVar.f395442g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                            ((db5.f0) callback2).i();
                            return;
                        }
                        return;
                    }
                    if (configuration != null && configuration.orientation == 1) {
                        int i18 = pVar.f395452t;
                        if (i18 == 1) {
                            pVar.o();
                            pVar.g();
                            pVar.n(true);
                            pVar.i(pVar.k(), pVar.j());
                        } else if (i18 == 2) {
                            pVar.n(false);
                            pVar.i(-1, -1);
                        }
                        if (pVar.f395442g instanceof db5.f0) {
                            pVar.m(true);
                            android.view.KeyEvent.Callback callback3 = pVar.f395442g;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback3, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
                            ((db5.f0) callback3).i();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        android.view.View view = this.f395420e;
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams = null;
        }
        view.setLayoutParams(layoutParams);
    }

    public boolean e(android.view.MotionEvent motionEvent) {
        uy3.j0 j0Var;
        if (motionEvent != null && (j0Var = this.f395428m) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
            if (j0Var.isShowing() && (this.f395419d instanceof db5.f0)) {
                this.f395427l.c(db5.s.b(motionEvent, 0), db5.s.c(motionEvent, 0));
                return true;
            }
        }
        return false;
    }

    public final void f(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryImageOCRHelper", "onError errType: " + i17 + ", errCode: " + i18);
        sy3.e eVar = this.f395424i;
        if (eVar != null) {
            eVar.mo71154xaf8aa769(i17, i18);
        }
        kz3.m mVar = this.f395425j;
        if (mVar != null) {
            kz3.n nVar = (kz3.n) mVar;
            if (i18 == 202) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f395435a), 7, -1);
            } else if (i17 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f395435a), 6, -1);
            } else if (i18 == 301 || i18 == 201) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f395435a), 6, -1);
            } else if (i17 == 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f395435a), 8, -1);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21699, java.lang.String.valueOf(nVar.f395435a), 99, -1);
            }
        }
        boolean z17 = gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4;
        android.content.Context context = this.f395416a;
        if (!z17) {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            h(string);
            return;
        }
        boolean z18 = i18 == 101 || i18 == 102 || i18 == 999;
        if (i17 == 4) {
            if (z18) {
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                h(string2);
                return;
            } else {
                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_8);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                h(string3);
                return;
            }
        }
        if (i17 == 3 && z18) {
            java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
            h(string4);
        } else {
            java.lang.String string5 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
            h(string5);
        }
    }

    public void g() {
        kz3.p pVar = this.f395426k;
        if (pVar != null) {
            pVar.f395454v = false;
        }
        kz3.w wVar = this.f395427l;
        wVar.f395469f = 0.0f;
        wVar.f395468e = 0;
        wVar.f395470g = 0;
        uy3.q qVar = this.f395430o;
        if (qVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17272xd6a1a6fd) qVar).f240245d = null;
        }
        this.f395430o = null;
        this.f395428m = null;
        android.view.View view = this.f395419d;
        if (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.base.WxImageView");
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) view).m45746x52d44d05(null);
        }
        android.view.KeyEvent.Callback callback = this.f395419d;
        if (callback instanceof db5.f0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback).mo79204xfe3d8052(null);
        }
        this.f395419d = null;
        if (this.f395422g != 0) {
            ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).wi(this.f395422g);
            this.f395422g = 0L;
        }
        jz5.g gVar = kz3.d.f395405a;
        try {
            kz3.d.f395406b.clear();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BizImageOCRManager", th6, "clearOCRResult exception", new java.lang.Object[0]);
        }
    }

    public final void h(java.lang.String str) {
        android.content.Context context = this.f395416a;
        db5.e1.E(context, str, "", context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), false, null);
    }

    public long i(ry3.p pVar, ry3.m mVar, sy3.e eVar) {
        if (pVar == null) {
            return 0L;
        }
        this.f395423h = false;
        this.f395418c = mVar;
        this.f395424i = eVar;
        long j17 = pVar.f483060a;
        this.f395422g = j17;
        if (eVar != null) {
            eVar.c(j17);
        }
        kz3.m mVar2 = this.f395425j;
        if (mVar2 != null) {
            kz3.n nVar = (kz3.n) mVar2;
            nVar.f395435a = this.f395422g;
            nVar.f395436b = false;
        }
        if (!(gm0.j1.d().n() == 6 || gm0.j1.d().n() == 4)) {
            f(3, 301);
            return 0L;
        }
        android.view.KeyEvent.Callback callback = this.f395419d;
        kz3.w wVar = this.f395427l;
        if (callback != null) {
            wVar.f395471h = 0.01f;
            wVar.f395472i = 0.01f;
            db5.f0 f0Var = callback instanceof db5.f0 ? (db5.f0) callback : null;
            if (f0Var != null) {
                wVar.f395465b = new kz3.z(f0Var);
            }
        }
        sy3.a aVar = this.f395421f;
        if (aVar != null) {
            wVar.f395465b = aVar;
            wVar.f395468e = 1;
            wVar.f395471h = 0.0f;
            wVar.f395472i = 0.0f;
            wVar.d();
            aVar.e(new kz3.t(wVar));
        }
        wVar.f395466c = mVar2;
        android.view.KeyEvent.Callback callback2 = this.f395419d;
        if (callback2 instanceof db5.f0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(callback2, "null cannot be cast to non-null type com.tencent.mm.ui.base.IZoomableImageView");
            ((db5.f0) callback2).i();
        }
        ry3.j jVar = (ry3.j) i95.n0.c(ry3.j.class);
        kz3.k kVar = new kz3.k(this, pVar);
        yz3.w wVar2 = (yz3.w) jVar;
        wVar2.getClass();
        pVar.f483061b = 3;
        if (pVar.f483060a == 0) {
            pVar.f483060a = java.lang.System.currentTimeMillis();
        }
        ((iz3.s) ((jz5.n) wVar2.f550081d).mo141623x754a37bb()).d(pVar.f483060a, pVar, new yz3.u(kVar));
        long j18 = pVar.f483060a;
        this.f395422g = j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "startImageOCR uploadSessionId: %s, scene: %s", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(this.f395417b));
        return this.f395422g;
    }
}

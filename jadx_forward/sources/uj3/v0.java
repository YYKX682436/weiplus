package uj3;

/* loaded from: classes14.dex */
public abstract class v0 extends android.widget.RelativeLayout implements uj3.b {
    public boolean A;
    public float B;
    public wu5.c C;
    public wu5.c D;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 E;
    public volatile boolean F;

    /* renamed from: d, reason: collision with root package name */
    public uj3.k f509891d;

    /* renamed from: e, reason: collision with root package name */
    public int f509892e;

    /* renamed from: f, reason: collision with root package name */
    public int f509893f;

    /* renamed from: g, reason: collision with root package name */
    public uj3.k1 f509894g;

    /* renamed from: h, reason: collision with root package name */
    public long f509895h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.FrameLayout f509896i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f509897m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f509898n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f509899o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.FrameLayout f509900p;

    /* renamed from: q, reason: collision with root package name */
    public uj3.c f509901q;

    /* renamed from: r, reason: collision with root package name */
    public uj3.l0 f509902r;

    /* renamed from: s, reason: collision with root package name */
    public uj3.j1 f509903s;

    /* renamed from: t, reason: collision with root package name */
    public uj3.b0 f509904t;

    /* renamed from: u, reason: collision with root package name */
    public uj3.f1 f509905u;

    /* renamed from: v, reason: collision with root package name */
    public yj3.g f509906v;

    /* renamed from: w, reason: collision with root package name */
    public volatile android.view.Surface f509907w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f509908x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f509909y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f509910z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.A = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBitmapBackgroundRenderTarget */
    public final void m168138x599e34a6(android.view.Surface surface) {
        this.f509907w = surface;
    }

    public static /* synthetic */ void u(uj3.v0 v0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopScreenProjectSend");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        v0Var.t(z17);
    }

    @Override // uj3.b
    public int b() {
        return 1;
    }

    @Override // uj3.b
    public boolean c() {
        return this.f509909y;
    }

    @Override // uj3.b
    public boolean d() {
        return this.f509910z;
    }

    @Override // uj3.b
    public int e() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                return 90;
            }
            if (rotation == 2) {
                return 180;
            }
            if (rotation == 3) {
                return 270;
            }
        }
        return 0;
    }

    public void f(uj3.a status, android.os.Bundle bundle) {
        uj3.b0 b0Var;
        uj3.z zVar;
        qj3.h hVar;
        qj3.g m160244xafdb561a;
        ym5.w2 w2Var;
        bn5.g gVar;
        uj3.b0 b0Var2;
        uj3.z zVar2;
        qj3.h hVar2;
        qj3.g m160244xafdb561a2;
        ym5.w2 w2Var2;
        bn5.g gVar2;
        android.graphics.Bitmap n17;
        android.content.Context context;
        android.graphics.Bitmap n18;
        android.content.Context context2;
        android.graphics.Bitmap n19;
        android.content.Context context3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MultiTalkScreenProjectorView", "statusChange %s and param is %s", status, bundle);
        boolean z17 = true;
        switch (status.ordinal()) {
            case 0:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MultiTalkScreenProjectorView", "startScreenProjectSend", new java.lang.Object[0]);
                zj3.g.f554835a.b(2, 1);
                m168153x6f8da8db();
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().a0(101);
                m168177x209ad50f(true);
                return;
            case 1:
                zj3.g.f554835a.b(8, 1);
                u(this, false, 1, null);
                return;
            case 2:
                zj3.g.f554835a.b(7, 1);
                this.f509909y = true;
                android.widget.FrameLayout frameLayout = this.f509898n;
                if (frameLayout != null) {
                    frameLayout.setVisibility(4);
                }
                uj3.c cVar = this.f509901q;
                if (cVar != null && (hVar = cVar.f509783i) != null && (m160244xafdb561a = hVar.m160244xafdb561a()) != null && (w2Var = m160244xafdb561a.f445415m) != null && (gVar = (bn5.g) w2Var.m177310x5143ab24()) != null) {
                    gVar.m10957xcac06715(true);
                }
                m();
                if ((e() != 90 && e() != 270) || (b0Var = this.f509904t) == null || (zVar = b0Var.f509752g) == null) {
                    return;
                }
                zVar.f();
                return;
            case 3:
                zj3.g.f554835a.b(7, 1);
                uj3.c cVar2 = this.f509901q;
                if (cVar2 != null && (hVar2 = cVar2.f509783i) != null && (m160244xafdb561a2 = hVar2.m160244xafdb561a()) != null && (w2Var2 = m160244xafdb561a2.f445415m) != null && (gVar2 = (bn5.g) w2Var2.m177310x5143ab24()) != null) {
                    gVar2.m10957xcac06715(false);
                }
                this.f509909y = false;
                android.widget.FrameLayout frameLayout2 = this.f509898n;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                m();
                if ((e() != 90 && e() != 270) || (b0Var2 = this.f509904t) == null || (zVar2 = b0Var2.f509752g) == null) {
                    return;
                }
                zVar2.f();
                return;
            case 4:
                if (bundle != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().Q(bundle.getBoolean("mic_mute_status"));
                    return;
                }
                return;
            case 5:
                j();
                return;
            case 6:
                u(this, false, 1, null);
                return;
            case 7:
                if (bundle != null) {
                    java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("avatar_available_speaker");
                    uj3.b0 b0Var3 = this.f509904t;
                    if (b0Var3 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringArrayList);
                        b0Var3.f(stringArrayList);
                    } else {
                        z17 = false;
                    }
                    this.f509910z = z17;
                    return;
                }
                return;
            case 8:
                this.f509910z = false;
                return;
            case 9:
            case 11:
            case 12:
            case 13:
            default:
                return;
            case 10:
                if (this.f509909y || this.A) {
                    return;
                }
                ((ku5.t0) ku5.t0.f394148d).B(new uj3.u0(this));
                return;
            case 14:
                this.F = false;
                return;
            case 15:
                android.widget.FrameLayout frameLayout3 = this.f509896i;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(8);
                }
                m168174xf9306e11(false);
                return;
            case 16:
                android.view.View mo168119x43ae89e9 = mo168119x43ae89e9();
                if (mo168119x43ae89e9 == null || (n17 = n(mo168119x43ae89e9)) == null || (context = getContext()) == null) {
                    return;
                }
                sj3.h3 h3Var = new sj3.h3(n17, context);
                sj3.i3 i3Var = new sj3.i3(context);
                if (context instanceof android.app.Activity) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, h3Var, i3Var);
                    return;
                } else {
                    i3Var.run();
                    return;
                }
            case 17:
                android.view.View mo168119x43ae89e92 = mo168119x43ae89e9();
                if (mo168119x43ae89e92 == null || (n18 = n(mo168119x43ae89e92)) == null || (context2 = getContext()) == null) {
                    return;
                }
                sj3.j3 j3Var = new sj3.j3(n18, context2);
                sj3.k3 k3Var = new sj3.k3(context2);
                if (context2 instanceof android.app.Activity) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context2, j3Var, k3Var);
                    return;
                } else {
                    k3Var.run();
                    return;
                }
            case 18:
                android.view.View mo168119x43ae89e93 = mo168119x43ae89e9();
                if (mo168119x43ae89e93 == null || (n19 = n(mo168119x43ae89e93)) == null || (context3 = getContext()) == null) {
                    return;
                }
                sj3.l3 l3Var = new sj3.l3(n19, context3);
                sj3.m3 m3Var = new sj3.m3(context3);
                if (context3 instanceof android.app.Activity) {
                    ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context3, l3Var, m3Var);
                    return;
                } else {
                    m3Var.run();
                    return;
                }
        }
    }

    /* renamed from: getAvatarLayout */
    public final uj3.b0 m168139x1d9b1459() {
        return this.f509904t;
    }

    /* renamed from: getAvatarRoot */
    public final android.widget.FrameLayout m168140xd63819d1() {
        return this.f509900p;
    }

    /* renamed from: getBackgroundView */
    public abstract android.view.View mo168119x43ae89e9();

    /* renamed from: getBitmapRenderPrco */
    public final yj3.g m168141x8f5162a9() {
        return this.f509906v;
    }

    /* renamed from: getBottomRoot */
    public final android.widget.FrameLayout m168142x89f639a3() {
        return this.f509899o;
    }

    /* renamed from: getBottomUiLayout */
    public final uj3.l0 m168143x88dc271f() {
        return this.f509902r;
    }

    /* renamed from: getCurrentFileMd5 */
    public abstract /* synthetic */ java.lang.String mo168120x5cddb39f();

    @Override // uj3.b
    /* renamed from: getCurrentStatus */
    public boolean mo168117x430e7715() {
        return this.f509908x;
    }

    /* renamed from: getLayoutId */
    public abstract int mo168121x2ee31f5b();

    /* renamed from: getMCurrentPageHeight */
    public final int m168144x21a737f8() {
        return this.f509893f;
    }

    /* renamed from: getMCurrentPageWidth */
    public final int m168145xf166e8d5() {
        return this.f509892e;
    }

    /* renamed from: getMCurrentScale */
    public final float m168146xabd1b4a8() {
        return this.B;
    }

    /* renamed from: getMEditLayout */
    public final android.widget.FrameLayout m168147x1cab64eb() {
        return this.f509897m;
    }

    /* renamed from: getMReadyLayout */
    public final android.widget.FrameLayout m168148x3c65e76() {
        return this.f509896i;
    }

    /* renamed from: getMScreenReportData */
    public final uj3.k1 m168149x29665661() {
        return this.f509894g;
    }

    /* renamed from: getMStartTimes */
    public final long m168150x57a3ff1b() {
        return this.f509895h;
    }

    /* renamed from: getMultiTalkStrokeContext */
    public final uj3.c m168151xd74835c8() {
        return this.f509901q;
    }

    /* renamed from: getReadyUI */
    public final uj3.j1 m168152x7e334341() {
        return this.f509903s;
    }

    /* renamed from: getRenderBitmap */
    public final void m168153x6f8da8db() {
        if (this.C != null) {
            return;
        }
        this.D = ((ku5.t0) ku5.t0.f394148d).d(new uj3.o0(this), 1000L, 1000L);
        this.E = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("screen_project");
        this.C = ((ku5.t0) ku5.t0.f394148d).d(new uj3.n0(this), 0L, 1000 / ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitalk_screen_project_fps, 5));
    }

    /* renamed from: getScreenFuncConfig */
    public final uj3.k m168154x8dd3dc28() {
        return this.f509891d;
    }

    /* renamed from: getSendData */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 m168155xc62d6cc8() {
        return this.E;
    }

    /* renamed from: getTopRoot */
    public final android.widget.FrameLayout m168156xf9db3fa1() {
        return this.f509898n;
    }

    /* renamed from: getTopUiLayout */
    public final uj3.f1 m168157xd2b1fe1d() {
        return this.f509905u;
    }

    public void h() {
    }

    public void i() {
    }

    public final void j() {
        qj3.h hVar;
        bn5.g gVar;
        uj3.c cVar = this.f509901q;
        if (cVar == null || (hVar = cVar.f509783i) == null) {
            return;
        }
        qj3.g gVar2 = hVar.f445428o;
        gVar2.f445419q = null;
        ym5.w2 w2Var = gVar2.f445415m;
        if (w2Var == null || (gVar = (bn5.g) w2Var.m177310x5143ab24()) == null) {
            return;
        }
        java.util.Iterator it = ((l45.n) gVar.m10945xc879b3f2()).f397996d.iterator();
        while (it.hasNext()) {
            dl.b bVar = (dl.b) it.next();
            bVar.f316578g = null;
            bVar.d().mo168218x5a5b64d();
        }
        gVar.postInvalidate();
    }

    public void k() {
        yj3.g gVar = this.f509906v;
        if (gVar != null) {
            gVar.f544211d.removeCallbacksAndMessages(null);
            gVar.a(new yj3.c(gVar));
            android.os.HandlerThread handlerThread = gVar.f544212e;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            android.view.Surface surface = gVar.f544216i;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = gVar.f544214g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
    }

    public void l() {
        uj3.k1 k1Var = this.f509894g;
        if (k1Var != null) {
            long j17 = this.f509895h;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            k1Var.f509839b = android.os.SystemClock.elapsedRealtime() - j17;
        }
        uj3.k1 k1Var2 = null;
        this.f509907w = null;
        k();
        uj3.b0 b0Var = this.f509904t;
        if (b0Var != null) {
            b0Var.g();
        }
        setVisibility(8);
        wu5.c cVar = this.D;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.D = null;
        wu5.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.C = null;
        android.widget.FrameLayout frameLayout = this.f509896i;
        if (frameLayout != null) {
            frameLayout.clearAnimation();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.E;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.E;
        if (n3Var2 != null) {
            n3Var2.m77787xbe88f509();
        }
        this.E = null;
        uj3.j1 j1Var = this.f509903s;
        if (j1Var != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = j1Var.f509833j;
            b4Var.d();
            android.widget.TextView textView = j1Var.f509830g;
            if (textView != null) {
                textView.setScaleX(1.0f);
            }
            android.widget.TextView textView2 = j1Var.f509830g;
            if (textView2 != null) {
                textView2.setScaleY(1.0f);
            }
            j1Var.f509832i = j1Var.f509827d;
            b4Var.m77787xbe88f509();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().o().getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
        if (Ri != null) {
            Ri.a0(104);
        }
        uj3.k1 k1Var3 = this.f509894g;
        if (k1Var3 != null) {
            java.lang.String str = k1Var3.f509844g;
            long j18 = k1Var3.f509845h;
            java.lang.String str2 = k1Var3.f509846i;
            int i17 = k1Var3.f509838a;
            long j19 = k1Var3.f509839b;
            int i18 = k1Var3.f509847j;
            long j27 = k1Var3.f509840c;
            long j28 = k1Var3.f509841d;
            long j29 = k1Var3.f509842e;
            int i19 = k1Var3.f509843f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenProjectReportHelper", "reportScreenProjectDone,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", str, java.lang.Long.valueOf(j18), str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21350, str, java.lang.Long.valueOf(j18), str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j19), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j29), java.lang.Integer.valueOf(i19));
            k1Var2 = null;
        }
        this.f509894g = k1Var2;
    }

    public final void m() {
        uj3.c cVar = this.f509901q;
        if (cVar != null) {
            boolean z17 = cVar.f509785k;
            qj3.h hVar = cVar.f509783i;
            if (z17) {
                if (hVar != null) {
                    hVar.mo9067x901b6914(0);
                }
                if (hVar != null) {
                    hVar.f445427n.onClick(null);
                }
                cVar.f509785k = false;
                return;
            }
            if (hVar != null) {
                hVar.f445427n.onClick(null);
            }
            if (hVar != null) {
                hVar.mo9067x901b6914(0);
            }
            cVar.f509785k = true;
        }
    }

    public final android.graphics.Bitmap n(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int measuredWidth = view.getMeasuredWidth() - (view.getMeasuredWidth() % 4);
        int measuredHeight = view.getMeasuredHeight() - (view.getMeasuredHeight() % 4);
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            return null;
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(measuredHeight));
        arrayList.add(java.lang.Integer.valueOf(measuredWidth));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectRootView", "getBitmapShot", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectRootView", "getBitmapShot", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (createBitmap.isRecycled()) {
            return null;
        }
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        canvas.drawPaint(new android.graphics.Paint());
        canvas.setDrawFilter(new android.graphics.PaintFlagsDrawFilter(0, 3));
        view.draw(canvas);
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        uj3.k1 k1Var = this.f509894g;
        if (k1Var != null) {
            k1Var.f509842e = ((k1Var != null ? k1Var.f509842e : 0L) + elapsedRealtime2) / 2;
        }
        long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
        uj3.c cVar = this.f509901q;
        if (cVar != null) {
            cVar.a(canvas);
        }
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime3;
        uj3.k1 k1Var2 = this.f509894g;
        if (k1Var2 != null) {
            k1Var2.f509841d = ((k1Var2 != null ? k1Var2.f509841d : 0L) + elapsedRealtime4) / 2;
        }
        if (measuredWidth <= measuredHeight) {
            return createBitmap;
        }
        android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(createBitmap, 90.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w07, "rotate(...)");
        return w07;
    }

    public final void o() {
        android.content.res.Resources resources;
        if (!this.f509908x) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().h();
            return;
        }
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        android.content.res.Resources resources2 = getContext().getResources();
        java.lang.Integer num = null;
        aVar.f293262s = resources2 != null ? resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibt) : null;
        aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibs);
        aVar.E = new uj3.p0(this);
        android.content.Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null) {
            num = java.lang.Integer.valueOf(resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        aVar.W = num.intValue();
        aVar.f293266w = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg);
        aVar.F = uj3.q0.f509872d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uj3.v0.p():void");
    }

    public int q() {
        android.widget.FrameLayout frameLayout = this.f509898n;
        int i17 = frameLayout != null && frameLayout.getVisibility() == 0 ? 4 : false ? 4 : 0;
        android.widget.FrameLayout frameLayout2 = this.f509898n;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(i17);
        }
        android.widget.FrameLayout frameLayout3 = this.f509899o;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(i17);
        }
        android.widget.FrameLayout frameLayout4 = this.f509896i;
        if (frameLayout4 != null) {
            frameLayout4.setVisibility(i17);
        }
        return i17;
    }

    public void r(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator startDelay;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator alpha;
        android.widget.FrameLayout frameLayout;
        android.view.View view;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f509895h = android.os.SystemClock.elapsedRealtime();
        android.widget.FrameLayout frameLayout2 = this.f509897m;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(z17 ? 0 : 8);
        }
        uj3.l0 l0Var = this.f509902r;
        if (l0Var != null && (view = l0Var.f509852d) != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI", "showReaderContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/ScreenProjectBottomUI", "showReaderContent", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        uj3.c cVar = this.f509901q;
        if (cVar != null && (frameLayout = this.f509897m) != null) {
            frameLayout.addView(cVar.f509775a);
        }
        android.widget.FrameLayout frameLayout3 = this.f509896i;
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(0);
        }
        android.widget.FrameLayout frameLayout4 = this.f509896i;
        if (frameLayout4 != null) {
            frameLayout4.clearAnimation();
        }
        android.widget.FrameLayout frameLayout5 = this.f509896i;
        if (frameLayout5 == null || (animate = frameLayout5.animate()) == null || (startDelay = animate.setStartDelay(3000L)) == null || (duration = startDelay.setDuration(150L)) == null || (alpha = duration.alpha(0.0f)) == null) {
            return;
        }
        alpha.start();
    }

    public final void s(boolean z17) {
        android.view.View view;
        android.widget.FrameLayout frameLayout;
        uj3.c cVar = this.f509901q;
        if (cVar != null && (frameLayout = cVar.f509775a) != null) {
            frameLayout.setVisibility(0);
        }
        if (this.f509908x || this.A) {
            return;
        }
        uj3.b.a(this, uj3.a.f509726d, null, 2, null);
        uj3.f1 f1Var = this.f509905u;
        if (f1Var != null) {
            android.view.View view2 = f1Var.f509799d;
            android.content.Context context = f1Var.f509796a;
            if (view2 != null) {
                view2.setBackground(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.C30861xcebc809e.aft, android.graphics.Color.parseColor("#FA5151")));
            }
            sj3.n3 n3Var = sj3.o3.f490199e;
            if (n3Var.a(context) == 90 || n3Var.a(context) == 270) {
                android.widget.TextView textView = f1Var.f509800e;
                if (textView != null) {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ibs);
                }
            } else {
                android.widget.TextView textView2 = f1Var.f509800e;
                if (textView2 != null) {
                    textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ibl);
                }
            }
            if (!com.p314xaae8f345.mm.ui.b4.c(context) || (view = f1Var.f509798c) == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.a4.g(view, false);
        }
    }

    /* renamed from: setAvatarLayout */
    public final void m168158x53e40f65(uj3.b0 b0Var) {
        this.f509904t = b0Var;
    }

    /* renamed from: setAvatarLayoutOn */
    public final void m168159xeb1dd424(boolean z17) {
        this.f509910z = z17;
    }

    /* renamed from: setAvatarRoot */
    public final void m168160x45c67dd(android.widget.FrameLayout frameLayout) {
        this.f509900p = frameLayout;
    }

    /* renamed from: setBitmapRenderPrco */
    public final void m168161x334df7b5(yj3.g gVar) {
        this.f509906v = gVar;
    }

    /* renamed from: setBottomRoot */
    public final void m168162xb81a87af(android.widget.FrameLayout frameLayout) {
        this.f509899o = frameLayout;
    }

    /* renamed from: setBottomUiLayout */
    public final void m168163x50d28f2b(uj3.l0 l0Var) {
        this.f509902r = l0Var;
    }

    /* renamed from: setDoodleLayoutOn */
    public final void m168164x203c1be4(boolean z17) {
        this.f509909y = z17;
    }

    /* renamed from: setLockGenerateBitmap */
    public final void m168165x84bad511(boolean z17) {
        this.F = z17;
    }

    /* renamed from: setMCurrentPageHeight */
    public final void m168166xb8d2ba04(int i17) {
        this.f509893f = i17;
    }

    /* renamed from: setMCurrentPageWidth */
    public final void m168167xccfcf549(int i17) {
        this.f509892e = i17;
    }

    /* renamed from: setMCurrentScale */
    public final void m168168x3ea81b1c(float f17) {
        this.B = f17;
    }

    /* renamed from: setMEditLayout */
    public final void m168169xb310d85f(android.widget.FrameLayout frameLayout) {
        this.f509897m = frameLayout;
    }

    /* renamed from: setMReadyLayout */
    public final void m168170x3a0f5982(android.widget.FrameLayout frameLayout) {
        this.f509896i = frameLayout;
    }

    /* renamed from: setMScreenReportData */
    public final void m168171x4fc62d5(uj3.k1 k1Var) {
        this.f509894g = k1Var;
    }

    /* renamed from: setMStartTimes */
    public final void m168172xee09728f(long j17) {
        this.f509895h = j17;
    }

    /* renamed from: setMultiTalkStrokeContext */
    public final void m168173x98bd1d4(uj3.c cVar) {
        this.f509901q = cVar;
    }

    /* renamed from: setReadyNotAllowClick */
    public final void m168174xf9306e11(boolean z17) {
        this.A = z17;
        uj3.c cVar = this.f509901q;
        if (cVar != null) {
            boolean z18 = !z17;
            qj3.h hVar = cVar.f509783i;
            if (hVar != null) {
                hVar.m160249x18ba59ff(z18);
            }
        }
        uj3.l0 l0Var = this.f509902r;
        if (l0Var != null) {
            l0Var.f509861m = !z17;
        }
    }

    /* renamed from: setReadyUI */
    public final void m168175xf1a490b5(uj3.j1 j1Var) {
        this.f509903s = j1Var;
    }

    /* renamed from: setScreenFuncConfig */
    public final void m168176x31d07134(uj3.k kVar) {
        this.f509891d = kVar;
    }

    /* renamed from: setScreenProjectSending */
    public final void m168177x209ad50f(boolean z17) {
        this.f509908x = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231701m = z17;
    }

    /* renamed from: setSendData */
    public final void m168178xc0e5cdd4(com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var) {
        this.E = n3Var;
    }

    /* renamed from: setTopRoot */
    public final void m168179x6d4c8d15(android.widget.FrameLayout frameLayout) {
        this.f509898n = frameLayout;
    }

    /* renamed from: setTopUiLayout */
    public final void m168180x69177191(uj3.f1 f1Var) {
        this.f509905u = f1Var;
    }

    public final void t(boolean z17) {
        m168177x209ad50f(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.E;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = this.E;
        if (n3Var2 != null) {
            n3Var2.m77787xbe88f509();
        }
        this.E = null;
        wu5.c cVar = this.C;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.C = null;
        wu5.c cVar2 = this.D;
        if (cVar2 != null) {
            cVar2.cancel(false);
        }
        this.D = null;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().a0(102);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().a0(104);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().h();
    }
}

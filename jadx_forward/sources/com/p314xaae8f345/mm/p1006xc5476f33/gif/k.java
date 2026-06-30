package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes15.dex */
public class k extends com.p314xaae8f345.mm.p1006xc5476f33.gif.b {
    public long A;
    public int B;
    public boolean C;
    public int D;
    public int E;
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.x F;
    public int G;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f223669J;
    public final java.lang.Runnable K;
    public final java.lang.Runnable L;
    public final java.lang.Runnable M;
    public final java.lang.Runnable N;
    public final java.lang.Runnable P;
    public final java.lang.Runnable Q;

    /* renamed from: d, reason: collision with root package name */
    public boolean f223670d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f223671e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f223672f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f223673g;

    /* renamed from: h, reason: collision with root package name */
    public float f223674h;

    /* renamed from: i, reason: collision with root package name */
    public float f223675i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f223676m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Rect f223677n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f223678o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f223679p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Bitmap f223680q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f223681r;

    /* renamed from: s, reason: collision with root package name */
    public int f223682s;

    /* renamed from: t, reason: collision with root package name */
    public int f223683t;

    /* renamed from: u, reason: collision with root package name */
    public float f223684u;

    /* renamed from: v, reason: collision with root package name */
    public long f223685v;

    /* renamed from: w, reason: collision with root package name */
    public long f223686w;

    /* renamed from: x, reason: collision with root package name */
    public long f223687x;

    /* renamed from: y, reason: collision with root package name */
    public long f223688y;

    /* renamed from: z, reason: collision with root package name */
    public long f223689z;

    public k(android.content.res.Resources resources, int i17, boolean z17) {
        this.f223670d = true;
        this.f223671e = false;
        int[] iArr = new int[6];
        this.f223673g = iArr;
        this.f223674h = 1.0f;
        this.f223675i = 1.0f;
        this.f223677n = new android.graphics.Rect();
        this.f223678o = new android.graphics.Paint(6);
        this.f223681r = false;
        this.f223682s = 0;
        this.f223683t = -1;
        this.f223685v = 0L;
        this.f223686w = 0L;
        this.f223687x = 0L;
        this.f223688y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        this.I = true;
        this.f223669J = false;
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.gif.e(this);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.gif.f(this);
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.gif.g(this);
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.gif.h(this);
        this.P = new com.p314xaae8f345.mm.p1006xc5476f33.gif.i(this);
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.gif.j(this);
        this.f223669J = z17;
        java.io.InputStream openRawResource = resources.openRawResource(i17);
        if (openRawResource != null) {
            this.G = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f223672f = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class)).mo44475xdbc00c10(openRawResource, iArr);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f223672f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("input stream is null.");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void a() {
        this.f223670d = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void b() {
        this.f223671e = true;
        this.f223670d = false;
        long j17 = this.f223672f;
        this.f223672f = 0L;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class)).mo44476x408b7293(j17);
        this.f223679p = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void c() {
        this.f223671e = false;
        this.f223670d = true;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(this.N, 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void d() {
        if (this.f223671e) {
            return;
        }
        this.f223670d = true;
        java.lang.Runnable runnable = this.L;
        this.A = android.os.SystemClock.uptimeMillis();
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.f) runnable).run();
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 o3Var = this.H;
        if (o3Var != null) {
            o3Var.d(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.f223672f == 0) {
            return;
        }
        if (this.f223676m) {
            this.f223677n.set(getBounds());
            this.f223674h = this.f223677n.width() / this.f223673g[0];
            this.f223675i = this.f223677n.height() / this.f223673g[1];
            this.f223676m = false;
        }
        if (this.f223678o.getShader() != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMGIFDrawable", "colors drawRect ");
            canvas.drawRect(this.f223677n, this.f223678o);
            return;
        }
        if (this.f223688y == 0) {
            this.f223688y = java.lang.System.currentTimeMillis();
        }
        int[] iArr = this.f223679p;
        if (iArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFDrawable", "colors is null.");
        } else if (this.f223681r || this.f223680q == null) {
            int length = iArr.length;
            int[] iArr2 = this.f223673g;
            if (length == iArr2[0] * iArr2[1]) {
                canvas.scale(this.f223674h, this.f223675i);
                int[] iArr3 = this.f223673g;
                int i17 = iArr3[0];
                canvas.drawBitmap(iArr, 0, i17, 0.0f, 0.0f, i17, iArr3[1], true, this.f223678o);
            } else {
                canvas.scale(this.f223674h, this.f223675i);
                canvas.drawRGB(230, 230, 230);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFDrawable", "colors is not equal width*height. length:%d width:%d height:%d", java.lang.Integer.valueOf(iArr.length), java.lang.Integer.valueOf(this.f223673g[0]), java.lang.Integer.valueOf(this.f223673g[1]));
            }
        } else {
            canvas.scale(this.f223677n.width() / this.f223680q.getWidth(), this.f223677n.width() / this.f223680q.getHeight());
            canvas.drawBitmap(this.f223680q, 0.0f, 0.0f, this.f223678o);
        }
        this.f223689z = java.lang.System.currentTimeMillis() - this.f223688y;
        if (!this.C) {
            int[] iArr4 = this.f223673g;
            if (iArr4[2] >= 1) {
                if (iArr4[4] < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMGIFDrawable", "current index error. start first frame");
                }
                int i18 = this.D;
                if (i18 != 0 && this.E > i18 - 1) {
                    g(this.K, 0L);
                    return;
                } else {
                    if (this.I) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(this.Q, 0L);
                        this.I = false;
                        return;
                    }
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMGIFDrawable", "framecount:%d errorcode:%d no post and oversize:%b", java.lang.Integer.valueOf(this.f223673g[2]), java.lang.Integer.valueOf(this.f223673g[4]), java.lang.Boolean.valueOf(this.C));
    }

    public float e() {
        if (this.f223684u == 0.0f) {
            float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 2.0f;
            this.f223684u = g17;
            if (g17 < 1.0f) {
                this.f223684u = 1.0f;
            } else if (g17 > 2.0f) {
                this.f223684u = 2.0f;
            }
        }
        return this.f223684u;
    }

    public void f() {
        int[] iArr;
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMGIFDrawable", "gif info pointer:%d", java.lang.Long.valueOf(this.f223672f));
        if (this.f223672f == 0) {
            return;
        }
        this.f223682s = this.f223673g[2];
        this.B = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561924wm);
        if (this.f223669J || ((i17 = (iArr = this.f223673g)[0]) <= 1024 && iArr[1] <= 1024)) {
            int[] iArr2 = this.f223673g;
            this.f223679p = new int[iArr2[0] * iArr2[1]];
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMGIFDrawable", "emoji width or height over size. Width:%d Height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f223673g[1]));
        int i18 = this.B;
        this.f223679p = new int[i18 * i18];
        this.C = true;
        jx3.f.INSTANCE.mo68477x336bdfd8(401L, 2L, 1L, false);
    }

    /* renamed from: finalize */
    public void m65003xd764dc1e() {
        try {
            b();
        } catch (java.lang.Throwable unused) {
            super.finalize();
        }
    }

    public final void g(java.lang.Runnable runnable, long j17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + j17;
        this.A = uptimeMillis;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 o3Var = this.H;
        if (o3Var != null) {
            o3Var.mo50295x41bd0e60(runnable, uptimeMillis);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.f223673g[1] * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.f223673g[0] * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f223670d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f223676m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f223678o.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f223678o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f223670d = true;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(this.M, 0L);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f223670d = false;
        int i17 = this.G;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMGIFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276() || com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45880xd6d7f83d(), this.G);
            this.G = 0;
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(this.P, 300L);
    }

    public k(java.lang.String str, boolean z17) {
        this.f223670d = true;
        this.f223671e = false;
        int[] iArr = new int[6];
        this.f223673g = iArr;
        this.f223674h = 1.0f;
        this.f223675i = 1.0f;
        this.f223677n = new android.graphics.Rect();
        this.f223678o = new android.graphics.Paint(6);
        this.f223681r = false;
        this.f223682s = 0;
        this.f223683t = -1;
        this.f223685v = 0L;
        this.f223686w = 0L;
        this.f223687x = 0L;
        this.f223688y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        this.I = true;
        this.f223669J = false;
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.gif.e(this);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.gif.f(this);
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.gif.g(this);
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.gif.h(this);
        this.P = new com.p314xaae8f345.mm.p1006xc5476f33.gif.i(this);
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.gif.j(this);
        this.f223669J = z17;
        if (!android.text.TextUtils.isEmpty(str)) {
            this.G = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f223672f = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class)).mo44474x33210722(str, iArr);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f223672f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("file path is null.");
    }

    public k(java.lang.String str) {
        this.f223670d = true;
        this.f223671e = false;
        int[] iArr = new int[6];
        this.f223673g = iArr;
        this.f223674h = 1.0f;
        this.f223675i = 1.0f;
        this.f223677n = new android.graphics.Rect();
        this.f223678o = new android.graphics.Paint(6);
        this.f223681r = false;
        this.f223682s = 0;
        this.f223683t = -1;
        this.f223685v = 0L;
        this.f223686w = 0L;
        this.f223687x = 0L;
        this.f223688y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        this.I = true;
        this.f223669J = false;
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.gif.e(this);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.gif.f(this);
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.gif.g(this);
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.gif.h(this);
        this.P = new com.p314xaae8f345.mm.p1006xc5476f33.gif.i(this);
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.gif.j(this);
        if (!android.text.TextUtils.isEmpty(str)) {
            this.G = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f223672f = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class)).mo44474x33210722(kk.w.a(str, false), iArr);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f223672f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("file path is null.");
    }

    public k(java.io.InputStream inputStream) {
        this.f223670d = true;
        this.f223671e = false;
        int[] iArr = new int[6];
        this.f223673g = iArr;
        this.f223674h = 1.0f;
        this.f223675i = 1.0f;
        this.f223677n = new android.graphics.Rect();
        this.f223678o = new android.graphics.Paint(6);
        this.f223681r = false;
        this.f223682s = 0;
        this.f223683t = -1;
        this.f223685v = 0L;
        this.f223686w = 0L;
        this.f223687x = 0L;
        this.f223688y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        this.I = true;
        this.f223669J = false;
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.gif.e(this);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.gif.f(this);
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.gif.g(this);
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.gif.h(this);
        this.P = new com.p314xaae8f345.mm.p1006xc5476f33.gif.i(this);
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.gif.j(this);
        if (inputStream != null) {
            this.G = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f223672f = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class)).mo44475xdbc00c10(inputStream, iArr);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f223672f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("input stream is null.");
    }

    public k(byte[] bArr, java.lang.String str) {
        this(bArr, false);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.k5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.k5.class))).getClass();
        android.graphics.Bitmap a17 = ar.c.f94889a.a(str);
        if (a17 != null) {
            this.f223680q = a17;
        }
    }

    public k(byte[] bArr, boolean z17) {
        this.f223670d = true;
        this.f223671e = false;
        int[] iArr = new int[6];
        this.f223673g = iArr;
        this.f223674h = 1.0f;
        this.f223675i = 1.0f;
        this.f223677n = new android.graphics.Rect();
        this.f223678o = new android.graphics.Paint(6);
        this.f223681r = false;
        this.f223682s = 0;
        this.f223683t = -1;
        this.f223685v = 0L;
        this.f223686w = 0L;
        this.f223687x = 0L;
        this.f223688y = 0L;
        this.A = 0L;
        this.C = false;
        this.D = 0;
        this.E = 0;
        this.H = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        this.I = true;
        this.f223669J = false;
        this.K = new com.p314xaae8f345.mm.p1006xc5476f33.gif.e(this);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.gif.f(this);
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.gif.g(this);
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.gif.h(this);
        this.P = new com.p314xaae8f345.mm.p1006xc5476f33.gif.i(this);
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.gif.j(this);
        this.f223669J = z17;
        if (bArr != null) {
            this.G = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMGIFDrawable");
            try {
                this.f223672f = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class)).mo44472x4671af0(bArr, iArr);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMGIFDrawable", th6, "[-] Fail to open gif.", new java.lang.Object[0]);
                this.f223672f = 0L;
            }
            f();
            return;
        }
        throw new java.lang.NullPointerException("bytes is null.");
    }
}

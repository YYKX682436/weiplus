package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes15.dex */
public class u extends com.p314xaae8f345.mm.p1006xc5476f33.gif.b {
    public long A;
    public long B;
    public long C;
    public long D;
    public long E;
    public long F;
    public boolean G;
    public boolean H;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 I;

    /* renamed from: J, reason: collision with root package name */
    public int f223722J;
    public boolean K;
    public final java.lang.Runnable L;
    public final java.lang.Runnable M;
    public final java.lang.Runnable N;
    public java.lang.Runnable P;
    public int Q;
    public int R;
    public final java.lang.Runnable S;

    /* renamed from: d, reason: collision with root package name */
    public boolean f223723d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f223724e;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f223725f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f223726g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f223727h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f223728i;

    /* renamed from: m, reason: collision with root package name */
    public float f223729m;

    /* renamed from: n, reason: collision with root package name */
    public float f223730n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f223731o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f223732p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Paint f223733q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap[] f223734r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.Bitmap f223735s;

    /* renamed from: t, reason: collision with root package name */
    public int f223736t;

    /* renamed from: u, reason: collision with root package name */
    public int f223737u;

    /* renamed from: v, reason: collision with root package name */
    public int f223738v;

    /* renamed from: w, reason: collision with root package name */
    public int f223739w;

    /* renamed from: x, reason: collision with root package name */
    public int f223740x;

    /* renamed from: y, reason: collision with root package name */
    public int f223741y;

    /* renamed from: z, reason: collision with root package name */
    public float f223742z;

    public u(byte[] bArr, java.lang.String str) {
        this(bArr);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.g) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.k5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.k5.class))).getClass();
        android.graphics.Bitmap a17 = ar.c.f94889a.a(str);
        if (a17 != null) {
            this.f223735s = a17;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void a() {
        this.f223723d = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public synchronized void b() {
        synchronized (this.f223726g) {
            this.f223724e = true;
            this.f223723d = false;
            long j17 = this.f223725f;
            this.f223725f = 0L;
            this.I.mo50300x3fa464aa(this.L);
            if (((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79.class)).mo44493x92410e20(j17) == -906) {
                jx3.f.INSTANCE.mo68477x336bdfd8(401L, 10L, 1L, false);
            }
            this.f223734r = null;
            this.P = null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void c() {
        this.f223723d = true;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(this.N, 0L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.gif.b
    public void d() {
        if (this.f223724e) {
            return;
        }
        this.f223723d = true;
        java.lang.Runnable runnable = this.L;
        this.F = android.os.SystemClock.uptimeMillis();
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.gif.q) runnable).run();
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 o3Var = this.I;
        if (o3Var != null) {
            o3Var.d(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        boolean z17 = this.f223732p;
        android.graphics.Rect rect = this.f223731o;
        if (z17) {
            rect.set(getBounds());
            this.f223729m = rect.width() / this.f223738v;
            this.f223730n = rect.height() / this.f223739w;
            this.f223732p = false;
        }
        android.graphics.Paint paint = this.f223733q;
        if (paint.getShader() != null) {
            canvas.drawRect(rect, paint);
            return;
        }
        if (this.D == 0) {
            this.D = java.lang.System.currentTimeMillis();
        }
        boolean z18 = true;
        if (this.K) {
            this.f223736t = (this.f223736t + 1) % this.f223734r.length;
        }
        android.graphics.Bitmap[] bitmapArr = this.f223734r;
        int i17 = this.f223736t;
        android.graphics.Bitmap bitmap = bitmapArr[i17];
        if (bitmap == null) {
            bitmap = bitmapArr[(i17 + 1) % bitmapArr.length];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMWXGFDrawable", "use last decode bitmap %s  hash:[%s]", bitmap, java.lang.Integer.valueOf(hashCode()));
        }
        if (bitmap == null || bitmap.isRecycled() || this.f223724e) {
            android.graphics.Bitmap bitmap2 = this.f223735s;
            if (bitmap2 != null) {
                canvas.scale(rect.width() / bitmap2.getWidth(), rect.height() / bitmap2.getHeight());
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, paint);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GIF.MMWXGFDrawable", "Cpan draw bitmap failed. Bitmap buffer is null or recycle %s", java.lang.Integer.valueOf(hashCode()));
            }
        } else {
            canvas.scale(this.f223729m, this.f223730n);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        }
        this.E = java.lang.System.currentTimeMillis() - this.D;
        if (this.K) {
            int i18 = this.Q;
            if (i18 > 0 && this.f223741y == -1) {
                int i19 = this.R + 1;
                this.R = i19;
                if (i19 >= i18) {
                    this.f223723d = false;
                    f(this.P, this.B);
                    z18 = false;
                }
            }
            if (z18) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(this.S, 0L);
            }
            this.K = false;
        }
    }

    public float e() {
        if (this.f223742z == 0.0f) {
            float g17 = i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 2.0f;
            this.f223742z = g17;
            if (g17 < 1.0f) {
                this.f223742z = 1.0f;
            } else if (g17 > 2.0f) {
                this.f223742z = 2.0f;
            }
        }
        return this.f223742z;
    }

    public final void f(java.lang.Runnable runnable, long j17) {
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + j17;
        this.F = uptimeMillis;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 o3Var = this.I;
        if (o3Var != null) {
            o3Var.mo50295x41bd0e60(runnable, uptimeMillis);
        }
    }

    /* renamed from: finalize */
    public void m65005xd764dc1e() {
        try {
            b();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.GIF.MMWXGFDrawable", th6, "", new java.lang.Object[0]);
            super.finalize();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) (this.f223739w * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) (this.f223738v * e());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f223723d;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f223732p = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        this.f223733q.setAlpha(i17);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f223733q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f223723d = true;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.xa) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u6.class))).wi(this.M, 0L);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f223723d = false;
        int i17 = this.f223722J;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMWXGFDrawable", "summerhardcoder stopPerformance startPerformance:%x ", java.lang.Integer.valueOf(i17));
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276() || com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45880xd6d7f83d(), this.f223722J);
            this.f223722J = 0;
        }
    }

    public u(byte[] bArr) {
        this.f223723d = false;
        this.f223724e = false;
        this.f223726g = new java.lang.Object();
        int[] iArr = new int[4];
        this.f223727h = iArr;
        this.f223728i = new int[4];
        this.f223729m = 1.0f;
        this.f223730n = 1.0f;
        this.f223731o = new android.graphics.Rect();
        this.f223733q = new android.graphics.Paint(6);
        this.f223734r = new android.graphics.Bitmap[2];
        this.f223736t = 0;
        this.f223737u = 0;
        this.f223740x = 0;
        this.f223741y = -1;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.F = 0L;
        this.G = false;
        this.H = true;
        this.I = com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        this.K = true;
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.gif.q(this);
        this.M = new com.p314xaae8f345.mm.p1006xc5476f33.gif.r(this);
        this.N = new com.p314xaae8f345.mm.p1006xc5476f33.gif.s(this);
        this.Q = -1;
        this.R = 0;
        this.S = new com.p314xaae8f345.mm.p1006xc5476f33.gif.t(this);
        if (bArr != null) {
            this.f223722J = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45875xb66b7230(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45874xa37c7d95(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45884x685edb79(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45885xa37cc06b() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45886x1e9e8ece(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45873x11cbdb29(), "MicroMsg.GIF.MMWXGFDrawable");
            this.f223725f = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79.class)).mo44491xe871e070();
            if (this.f223725f != 0 && this.f223725f != -1 && this.f223725f != -901) {
                int mo44489x79127872 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79.class)).mo44489x79127872(this.f223725f, bArr, bArr.length);
                if (mo44489x79127872 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF decode buffer header failed. result:%d", java.lang.Integer.valueOf(mo44489x79127872));
                    if (mo44489x79127872 == -904) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(711L, 8L, 1L, false);
                    } else {
                        jx3.f.INSTANCE.mo68477x336bdfd8(711L, 3L, 1L, false);
                    }
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab(mo44489x79127872);
                }
                int mo44490xf44a514 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79.class)).mo44490xf44a514(this.f223725f, bArr, bArr.length, iArr);
                if (mo44490xf44a514 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan WXGF get option failed. result:%d", java.lang.Integer.valueOf(mo44490xf44a514));
                    if (mo44490xf44a514 == -903) {
                        jx3.f.INSTANCE.mo68477x336bdfd8(711L, 7L, 1L, false);
                    } else {
                        jx3.f.INSTANCE.mo68477x336bdfd8(711L, 3L, 1L, false);
                    }
                    throw new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab(mo44490xf44a514);
                }
                this.f223737u = iArr[0];
                int i17 = iArr[1];
                this.f223738v = i17;
                int i18 = iArr[2];
                this.f223739w = i18;
                int i19 = iArr[3];
                this.f223740x = i19;
                if (i19 <= 0) {
                    this.f223740x = 1;
                }
                if (i17 == 0 || i18 == 0) {
                    int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561924wm);
                    this.f223739w = h17;
                    this.f223738v = h17;
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan init wxam decoder failed. mWXGFJNIHandle:%d", java.lang.Long.valueOf(this.f223725f));
            if (this.f223725f == -901) {
                jx3.f.INSTANCE.mo68477x336bdfd8(711L, 5L, 1L, false);
            }
            jx3.f.INSTANCE.mo68477x336bdfd8(711L, 4L, 1L, false);
            throw new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16078xe0714eab(201);
        }
        throw new java.lang.NullPointerException("bytes is null.");
    }
}

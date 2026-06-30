package vp;

/* loaded from: classes16.dex */
public class k implements vp.w0, yp.i {
    public static android.graphics.Paint U;
    public static int V;
    public static final java.lang.StringBuilder Y;
    public static final java.util.Formatter Z;

    /* renamed from: p0, reason: collision with root package name */
    public static final android.os.Handler f520319p0;
    public long A;
    public long B;
    public java.lang.String C;
    public long D;
    public long E;
    public xp.d F;
    public final vp.x0 I;

    /* renamed from: J, reason: collision with root package name */
    public vp.w f520320J;
    public vp.j0 K;
    public int L;
    public vp.r M;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f520322e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f520323f;

    /* renamed from: g, reason: collision with root package name */
    public final yp.j f520324g;

    /* renamed from: h, reason: collision with root package name */
    public final vp.v0 f520325h;

    /* renamed from: i, reason: collision with root package name */
    public final vp.u f520326i;

    /* renamed from: m, reason: collision with root package name */
    public final vp.b f520327m;

    /* renamed from: n, reason: collision with root package name */
    public final vp.d0 f520328n;

    /* renamed from: o, reason: collision with root package name */
    public final zp.i f520329o;

    /* renamed from: p, reason: collision with root package name */
    public final zp.e f520330p;

    /* renamed from: q, reason: collision with root package name */
    public long f520331q;

    /* renamed from: r, reason: collision with root package name */
    public long f520332r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f520333s;

    /* renamed from: u, reason: collision with root package name */
    public long f520335u;

    /* renamed from: v, reason: collision with root package name */
    public long f520336v;

    /* renamed from: w, reason: collision with root package name */
    public long f520337w;

    /* renamed from: x, reason: collision with root package name */
    public int f520338x;

    /* renamed from: y, reason: collision with root package name */
    public int f520339y;

    /* renamed from: z, reason: collision with root package name */
    public int f520340z;
    public static final java.text.DecimalFormat S = new java.text.DecimalFormat("00.00");
    public static final java.text.DecimalFormat T = new java.text.DecimalFormat("00");
    public static final java.text.SimpleDateFormat W = new java.text.SimpleDateFormat("yy年M月d日 hh:mm:ss");
    public static final java.util.Date X = new java.util.Date();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f520321d = true;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f520334t = true;
    public final java.util.Queue G = new java.util.concurrent.LinkedBlockingDeque();
    public final java.util.List H = new java.util.LinkedList();
    public wp.e N = null;
    public android.graphics.Paint P = null;
    public boolean Q = false;
    public boolean R = false;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        Y = sb6;
        Z = new java.util.Formatter(sb6, java.util.Locale.getDefault());
        new android.graphics.Paint().setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        f520319p0 = new vp.q(android.os.Looper.getMainLooper());
    }

    public k(android.view.View view, xp.d dVar) {
        boolean z17;
        boolean z18;
        this.L = 0;
        this.F = dVar;
        xp.a aVar = dVar.f537373h;
        if (aVar != null) {
            z17 = aVar.f537347l;
            z18 = aVar.f537349n;
        } else {
            z17 = false;
            z18 = false;
        }
        yp.j a17 = yp.g.a(view, this, z17, z18);
        this.f520324g = a17;
        if (a17 == null) {
            throw new java.lang.RuntimeException("root view not a IDanmakuView");
        }
        a17.a(this);
        a17.mo177448xcc7da8b2(this);
        zp.i iVar = new zp.i();
        this.f520329o = iVar;
        zp.e eVar = new zp.e();
        this.f520330p = eVar;
        vp.b bVar = new vp.b();
        this.f520327m = bVar;
        this.f520328n = new vp.d0(dVar);
        this.f520325h = new vp.v0();
        this.I = new vp.y0(dVar, bVar, iVar, eVar);
        this.f520326i = new vp.u(dVar);
        vp.j0 j0Var = new vp.j0(this);
        this.K = j0Var;
        if (a17 instanceof yp.l) {
            j0Var.f520318e = 1;
        } else {
            xp.a aVar2 = dVar.f537373h;
            if (aVar2 != null) {
                j0Var.f520318e = aVar2.f537344i;
            }
        }
        if (aVar == null || !aVar.f537350o) {
            if (a17 instanceof yp.l) {
                this.L = 0;
            } else {
                this.L = 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "initUpdateMethod mUpdateMethod:" + this.L);
        } else {
            this.L = 0;
        }
        if (this.L == 0) {
            this.M = new vp.r(this, null);
        }
    }

    public static java.lang.String j(long j17) {
        if (j17 >= 86400000) {
            java.util.Date date = X;
            date.setTime(j17);
            return W.format(date);
        }
        long j18 = j17 / 1000;
        long j19 = j18 % 60;
        long j27 = (j18 / 60) % 60;
        long j28 = j18 / 3600;
        if (j19 < 0) {
            j19 = 0;
        }
        if (j27 < 0) {
            j27 = 0;
        }
        if (j28 < 0) {
            j28 = 0;
        }
        Y.setLength(0);
        java.util.Formatter formatter = Z;
        return j28 > 0 ? formatter.format("%d:%02d:%02d", java.lang.Long.valueOf(j28), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19)).toString() : formatter.format("%02d:%02d", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19)).toString();
    }

    @Override // vp.w0
    public int E6() {
        vp.v0 v0Var = this.f520325h;
        if (v0Var != null) {
            return ((java.util.ArrayList) v0Var.f520374c).size();
        }
        return 0;
    }

    @Override // vp.w0
    public void G1(wp.a danmaku) {
        java.util.List list;
        vp.v0 v0Var = this.f520325h;
        v0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmaku, "danmaku");
        synchronized (v0Var.f520373b) {
            v0Var.f520373b.remove(danmaku);
        }
        v0Var.f520375d.writeLock().lock();
        try {
            java.util.Iterator it = ((java.util.ArrayList) v0Var.f520374c).iterator();
            while (it.hasNext()) {
                ((java.util.List) it.next()).remove(danmaku);
            }
            v0Var.f520375d.writeLock().unlock();
            vp.y0 y0Var = (vp.y0) this.I;
            int size = ((java.util.ArrayList) y0Var.f520400k).size();
            int i17 = 0;
            while (true) {
                list = y0Var.f520387b;
                if (i17 >= size) {
                    break;
                }
                java.util.Iterator it6 = ((java.util.List) ((java.util.ArrayList) y0Var.f520400k).get(i17)).iterator();
                while (it6.hasNext()) {
                    wp.a aVar = (wp.a) it6.next();
                    if (aVar == danmaku) {
                        it6.remove();
                        y0Var.f520386a--;
                        ((java.util.LinkedList) list).add(aVar);
                        aVar.x(false);
                    }
                }
                i17++;
            }
            if (y0Var.f520401l == null) {
                return;
            }
            for (int i18 = 0; i18 < ((java.util.ArrayList) y0Var.f520401l).size(); i18++) {
                java.util.Iterator it7 = ((java.util.List) ((java.util.ArrayList) y0Var.f520401l).get(i18)).iterator();
                while (it7.hasNext()) {
                    wp.a aVar2 = (wp.a) it7.next();
                    if (aVar2 == danmaku) {
                        it7.remove();
                        y0Var.f520386a--;
                        ((java.util.LinkedList) list).add(aVar2);
                        aVar2.x(false);
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            v0Var.f520375d.writeLock().unlock();
            throw th6;
        }
    }

    @Override // vp.w0
    public void L4(wp.e eVar) {
        vp.j0 j0Var = this.K;
        j0Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 15;
        obtain.obj = eVar;
        if (j0Var.a()) {
            j0Var.f520314a.sendMessage(obtain);
        }
    }

    @Override // vp.w0
    public void N1(wp.a aVar, yp.o oVar) {
        vp.x0 x0Var = this.I;
        x0Var.getClass();
        aVar.f529886x = true;
        aVar.f529885w = true;
        float f17 = aVar.f529871i;
        vp.d0.e(x0Var.f520389d, aVar, oVar);
        float h17 = (aVar.f529871i + aVar.h()) / (f17 + aVar.h());
        aVar.f529867e.f556446a = ((float) r3.f556446a) * h17;
    }

    @Override // vp.w0
    public void U4() {
        vp.v0 v0Var = this.f520325h;
        if (v0Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(v0Var.f520382k, null, null, new vp.p0(v0Var, null), 3, null);
        }
    }

    @Override // vp.w0
    public void Z4(xp.d dVar) {
        vp.j0 j0Var = this.K;
        this.F.getClass();
        j0Var.c(0);
        vp.j0 j0Var2 = this.K;
        j0Var2.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 7;
        obtain.obj = dVar;
        if (j0Var2.a()) {
            j0Var2.f520314a.sendMessage(obtain);
        }
    }

    @Override // yp.i
    public void a() {
        yp.b bVar = this.I.f520388c;
        if (bVar.f545905a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.FALSE));
        }
        bVar.f545905a = false;
        this.f520323f = false;
        r();
        if (!this.f520321d) {
            this.K.b(14);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "surfaceDestroyed mIsQuited:" + this.f520321d);
    }

    @Override // yp.i
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "surfaceCreated");
    }

    @Override // yp.i
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "surfaceChanged");
        this.f520323f = true;
        yp.b bVar = this.I.f520388c;
        if (!bVar.f545905a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.TRUE));
        }
        bVar.f545905a = true;
        if (mo172409xc00617a4()) {
            vp.j0 j0Var = this.K;
            if (j0Var.a()) {
                j0Var.f520314a.removeMessages(4);
                j0Var.f520314a.sendEmptyMessage(4);
            }
        }
    }

    @Override // vp.w0
    /* renamed from: clear */
    public void mo172408x5a5b64d() {
        this.K.b(9);
        U4();
    }

    public final boolean d(wp.a aVar, zp.m mVar) {
        if (aVar == null) {
            this.f520320J.a(false);
            return false;
        }
        float e17 = aVar.e();
        float f17 = aVar.f();
        mVar.f556458d = e17;
        mVar.f556459e = f17;
        zp.d r17 = aVar.r(mVar);
        if (!((this.f520323f && !this.f520321d) && r17.f556440a != -1)) {
            this.f520320J.a(false);
            return false;
        }
        this.f520320J.a(true);
        r17.getClass();
        this.f520320J.b(aVar, mVar, r17);
        return true;
    }

    public final void e() {
        java.lang.StringBuilder sb6;
        yp.j jVar = this.f520324g;
        android.graphics.Canvas canvas = null;
        try {
            canvas = jVar.mo177447x18d65a63();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clearDrawing lockCanvas ");
            sb7.append(canvas == null ? "null" : java.lang.Integer.valueOf(canvas.hashCode()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", sb7.toString());
            if (canvas != null) {
                canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            }
            if (canvas != null) {
                try {
                    jVar.mo177450x65a3f1bb(canvas);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "clearDrawing unlockCanvas " + canvas.hashCode());
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    sb6 = new java.lang.StringBuilder("clearDrawing unlockCanvasAndPost exception: ");
                    sb6.append(canvas.hashCode());
                    sb6.append(th);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("surface_lock", sb6.toString());
                }
            }
        } catch (java.lang.Throwable th7) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("surface_lock", "clearDrawing lockCanvas exception: " + canvas.hashCode() + th7);
                try {
                    jVar.mo177450x65a3f1bb(canvas);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "clearDrawing unlockCanvas " + canvas.hashCode());
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    sb6 = new java.lang.StringBuilder("clearDrawing unlockCanvasAndPost exception: ");
                    sb6.append(canvas.hashCode());
                    sb6.append(th);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("surface_lock", sb6.toString());
                }
            } catch (java.lang.Throwable th9) {
                if (canvas != null) {
                    try {
                        jVar.mo177450x65a3f1bb(canvas);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("surface_lock", "clearDrawing unlockCanvas " + canvas.hashCode());
                    } catch (java.lang.Throwable th10) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("surface_lock", "clearDrawing unlockCanvasAndPost exception: " + canvas.hashCode() + th10);
                    }
                }
                throw th9;
            }
        }
    }

    @Override // vp.w0
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "pause(), isImmediately=" + z17);
        if (z17) {
            if (this.K.f520318e == 1) {
                m();
                return;
            }
        }
        this.K.b(3);
    }

    @Override // vp.w0
    public void f0(boolean z17) {
        this.f520334t = z17;
    }

    @Override // vp.w0
    public wp.a f5(int i17, java.lang.Object obj) {
        return this.f520326i.a(i17, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp.k.g():boolean");
    }

    public final void h(android.graphics.Canvas canvas) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            long j17 = uptimeMillis - this.f520335u;
            this.f520338x++;
            this.f520340z = (int) (this.f520340z + j17);
            if (j17 > 17) {
                this.f520339y++;
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DanmakuControllerAsync", "a draw block:" + j17);
                }
            }
            vp.v0 v0Var = this.f520325h;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = v0Var.f520375d;
            reentrantReadWriteLock.readLock().lock();
            java.util.List list = v0Var.f520374c;
            try {
                java.util.List list2 = (java.util.List) kz5.n0.Z(list);
                wp.a aVar = list2 != null ? (wp.a) kz5.n0.Z(list2) : null;
                if (aVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("DanmakuControllerAsync", "dataSource is Empty");
                    return;
                }
                if (this.f520338x % 60 != 1) {
                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                } else {
                    this.B = java.lang.Math.max(this.B, this.f520336v - this.f520335u);
                    this.A = java.lang.Math.max(this.A, this.f520337w - this.f520336v);
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016());
                    sb6.append(",t:");
                    sb6.append(j(android.os.SystemClock.uptimeMillis()));
                    sb6.append(",f:");
                    long j18 = this.f520330p.f556442b;
                    if (j18 == 0) {
                        j18 = 1;
                    }
                    sb6.append(1000 / j18);
                    sb6.append(",ds:");
                    sb6.append(this.I.f520386a);
                    sb6.append(",ts:");
                    sb6.append(((java.util.ArrayList) list).size());
                    sb6.append(",mt:");
                    java.text.DecimalFormat decimalFormat = T;
                    sb6.append(decimalFormat.format(this.f520336v - this.f520335u));
                    sb6.append(",lt:");
                    sb6.append(decimalFormat.format(this.f520337w - this.f520336v));
                    sb6.append(",dt:");
                    sb6.append(decimalFormat.format(uptimeMillis - this.f520337w));
                    sb6.append(",tt:");
                    sb6.append(decimalFormat.format(j17));
                    sb6.append(",jc:");
                    sb6.append(this.f520339y);
                    sb6.append(",mlt:");
                    sb6.append(this.A);
                    sb6.append(",mmt:");
                    sb6.append(this.B);
                    sb6.append(",jp:");
                    java.text.DecimalFormat decimalFormat2 = S;
                    sb6.append(decimalFormat2.format((this.f520339y * 100.0f) / this.f520338x));
                    sb6.append("%,at:");
                    sb6.append(decimalFormat2.format(this.f520340z / this.f520338x));
                    sb6.append(",fd:");
                    sb6.append(j(aVar.f529868f));
                    sb6.append(",cs:");
                    vp.b bVar = this.f520327m;
                    sb6.append(decimalFormat2.format((bVar.f520265a.f556437d / 1024.0f) / 1024.0f));
                    sb6.append(",uc:");
                    zp.c cVar = bVar.f520265a;
                    sb6.append(decimalFormat2.format((cVar.f556439f * 100.0f) / cVar.f556438e));
                    this.C = sb6.toString();
                }
                java.lang.String str2 = this.C;
                if (str2 != null) {
                    if (U == null) {
                        android.graphics.Paint paint = new android.graphics.Paint();
                        U = paint;
                        paint.setColor(-256);
                        U.setTextSize(xp.d.b().getResources().getDisplayMetrics().density * 12.5f);
                        android.graphics.Paint.FontMetrics fontMetrics = U.getFontMetrics();
                        V = (int) java.lang.Math.ceil(fontMetrics.descent - fontMetrics.ascent);
                    }
                    canvas.drawText(str2, 10.0f, canvas.getHeight() - V, U);
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
    }

    @Override // vp.w0
    public void h5() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "clearDrawingCache()");
        this.K.b(11);
    }

    public final void i(android.graphics.Canvas canvas) {
        wp.e eVar;
        if (canvas == null || (eVar = this.N) == null || eVar.f529891a == null) {
            return;
        }
        if (this.P == null) {
            android.graphics.Paint paint = new android.graphics.Paint(1);
            this.P = paint;
            paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        }
        wp.e eVar2 = this.N;
        canvas.drawBitmap(eVar2.f529891a, eVar2.f529892b, eVar2.f529893c, this.P);
    }

    @Override // vp.w0
    public void i6(vp.w wVar) {
        this.f520320J = wVar;
    }

    @Override // vp.w0
    /* renamed from: isPlaying */
    public boolean mo172409xc00617a4() {
        return !this.f520321d && this.f520322e;
    }

    @Override // vp.w0
    public void j5() {
        vp.j0 j0Var = this.K;
        this.F.getClass();
        j0Var.c(0);
        this.K.b(7);
    }

    public long k() {
        if (this.F.g()) {
            return android.os.SystemClock.uptimeMillis() - this.f520331q;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long j17 = this.D;
        if (uptimeMillis - j17 < 200 && !this.Q) {
            return (this.E + uptimeMillis) - j17;
        }
        this.Q = false;
        this.D = uptimeMillis;
        xp.g gVar = this.F.f537368c;
        long a17 = gVar == null ? -1L : gVar.a();
        this.E = a17;
        return a17;
    }

    @Override // vp.w0
    public void k0(wp.a aVar, boolean z17) {
        if (z17) {
            aVar.f529868f = this.f520329o.f556447a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "addNow: danmaku time = " + aVar.f529868f + " usePlayTime = " + z17);
        this.f520328n.d(aVar, new vp.n(this));
    }

    @Override // vp.w0
    public void k1(java.util.List list, boolean z17, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "addLastAll: size = " + list.size() + ", needPreMeasure = " + z17 + ", uiThreadBindInPreMeasure = " + z18);
        this.f520328n.c(list, java.lang.Boolean.valueOf(z18), new vp.o(this));
    }

    public boolean l() {
        boolean z17 = false;
        if (this.f520320J != null) {
            while (true) {
                java.util.Queue queue = this.G;
                if (queue.isEmpty()) {
                    break;
                }
                zp.m mVar = (zp.m) ((java.util.concurrent.LinkedBlockingDeque) queue).poll();
                wp.a d17 = this.I.d(mVar);
                if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 0) {
                    java.util.Objects.toString(mVar);
                    android.os.SystemClock.uptimeMillis();
                }
                if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                    z17 = d(d17, mVar);
                } else {
                    f520319p0.post(new vp.m(this, d17, mVar));
                }
            }
        }
        return z17;
    }

    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "handlePause()");
        r();
        this.f520322e = false;
        this.f520332r = this.F.g() ? this.f520329o.f556447a : this.f520330p.f556441a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
    }

    @Override // vp.w0
    public void n(long j17) {
        vp.j0 j0Var = this.K;
        this.F.getClass();
        j0Var.c(0);
        vp.j0 j0Var2 = this.K;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        j0Var2.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = valueOf;
        if (j0Var2.a()) {
            j0Var2.f520314a.sendMessage(obtain);
        }
    }

    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "handleResume()");
        if (!this.f520322e) {
            this.f520331q = android.os.SystemClock.uptimeMillis() - this.f520332r;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            zp.e eVar = this.f520330p;
            eVar.getClass();
            eVar.f556443c = android.os.SystemClock.uptimeMillis();
        }
        this.f520322e = true;
        this.C = null;
        if (mo172409xc00617a4()) {
            vp.j0 j0Var = this.K;
            if (j0Var.a()) {
                j0Var.f520314a.removeMessages(4);
                j0Var.f520314a.sendEmptyMessage(4);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.f520334t) {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 0) {
                java.util.Objects.toString(motionEvent);
            }
            if ((motionEvent.getAction() & 255) == 0) {
                y5(new android.graphics.Point((int) motionEvent.getX(), (int) motionEvent.getY()), 0);
            }
        }
        return false;
    }

    public final void p() {
        java.util.List<wp.a> list = this.H;
        vp.x0 x0Var = this.I;
        ((java.util.LinkedList) list).addAll(x0Var.f520387b);
        ((java.util.LinkedList) x0Var.f520387b).clear();
        for (wp.a aVar : list) {
            android.graphics.Bitmap bitmap = aVar.f529876n;
            if (bitmap != null) {
                aVar.f529876n = null;
                aVar.f529877o.setBitmap(null);
                this.f520327m.f520265a.b(bitmap);
            }
        }
        vp.w wVar = this.f520320J;
        if (wVar != null) {
            wVar.c(list);
        }
        for (final wp.a aVar2 : list) {
            this.F.c(aVar2).h(aVar2, true, new java.lang.Runnable() { // from class: vp.k$$a
                @Override // java.lang.Runnable
                public final void run() {
                    vp.k.this.f520326i.b(aVar2);
                }
            });
        }
        ((java.util.LinkedList) list).clear();
    }

    @Override // vp.w0
    /* renamed from: postInvalidate */
    public void mo172410x31e85dfb() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "postInvalidate()");
        android.os.Handler handler = this.K.f520314a;
        if (handler != null) {
            handler.removeMessages(13);
        }
        this.K.b(13);
    }

    public final void q(android.graphics.Canvas canvas) {
        if (canvas != null) {
            if (this.f520323f) {
                this.f520324g.mo177450x65a3f1bb(canvas);
            } else {
                this.f520324g.mo177449xcde7df44();
            }
        }
    }

    @Override // vp.w0
    /* renamed from: quit */
    public void mo172411x35224f() {
        this.f520321d = true;
        yp.b bVar = this.I.f520388c;
        if (bVar.f545905a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuDrawer", java.lang.String.format("set AsyncDrawContextValid:%b", java.lang.Boolean.FALSE));
        }
        bVar.f545905a = false;
        this.K.b(6);
        if (this.L == 0 && this.M != null) {
            android.view.Choreographer.getInstance().removeFrameCallback(this.M);
        }
        r();
    }

    public final void r() {
        android.os.Handler handler = this.K.f520314a;
        if (handler != null) {
            handler.removeMessages(4);
        }
    }

    @Override // vp.w0
    /* renamed from: release */
    public void mo172412x41012807() {
        if (!this.f520321d) {
            mo172411x35224f();
        }
        this.K.b(8);
        this.f520320J = null;
    }

    @Override // vp.w0
    /* renamed from: resume */
    public void mo172413xc84dc82d() {
        this.K.b(2);
    }

    public final void s(long j17) {
        if (this.L == 0 && this.M != null) {
            return;
        }
        r();
        if (this.f520323f && !this.f520321d && this.f520322e) {
            vp.j0 j0Var = this.K;
            if (j0Var.a()) {
                j0Var.f520314a.removeMessages(4);
                j0Var.f520314a.sendEmptyMessageDelayed(4, j17);
            }
        }
    }

    @Override // vp.w0
    /* renamed from: seek */
    public void mo172414x35ce78(long j17) {
        vp.j0 j0Var = this.K;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        j0Var.getClass();
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 5;
        obtain.obj = valueOf;
        if (j0Var.a()) {
            j0Var.f520314a.sendMessage(obtain);
        }
    }

    public final void t() {
        java.util.List list;
        java.util.Iterator it;
        boolean z17;
        java.lang.String str;
        java.util.List list2;
        boolean z18;
        java.util.List list3;
        zp.e eVar;
        int i17;
        java.lang.String str2;
        long j17;
        long k17 = k();
        vp.v0 v0Var = this.f520325h;
        v0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = v0Var.f520375d;
        if (reentrantReadWriteLock.readLock().tryLock()) {
            try {
                xp.i f17 = xp.d.f();
                boolean z19 = f17.f537395s;
                java.util.List list4 = v0Var.f520374c;
                int size = z19 ? ((java.util.ArrayList) list4).size() : java.lang.Math.min(f17.f537379c, ((java.util.ArrayList) list4).size());
                int i18 = 0;
                while (i18 < size) {
                    java.util.List list5 = (java.util.List) ((java.util.ArrayList) list4).get(i18);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it6 = list5.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            list = list4;
                            break;
                        }
                        wp.a aVar = (wp.a) it6.next();
                        long j18 = aVar.B;
                        if (j18 <= k17 || j18 > k17 + 300) {
                            list = list4;
                            it = it6;
                        } else {
                            list = list4;
                            it = it6;
                            if (j18 + aVar.f529867e.f556446a > k17 && !aVar.o()) {
                                arrayList2.add(aVar);
                                list4 = list;
                                it6 = it;
                            }
                        }
                        if (aVar.B > k17 + 300) {
                            break;
                        }
                        list4 = list;
                        it6 = it;
                    }
                    arrayList.add(arrayList2);
                    i18++;
                    list4 = list;
                }
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            if (it7.hasNext()) {
                if (!(it7.next() instanceof java.util.List)) {
                    z17 = false;
                    break;
                }
            } else {
                z17 = true;
                break;
            }
        }
        vp.x0 x0Var = this.I;
        java.lang.String str3 = "DanmakuControllerAsync";
        if (z17) {
            vp.y0 y0Var = (vp.y0) x0Var;
            long j19 = y0Var.f520390e.f556447a;
            int i19 = 0;
            while (i19 < arrayList.size()) {
                java.util.List<wp.a> list6 = (java.util.List) arrayList.get(i19);
                if (list6 != null && !list6.isEmpty()) {
                    for (wp.a aVar2 : list6) {
                        wp.f fVar = (wp.f) aVar2;
                        if (fVar.p(j19) || fVar.q(j19) || fVar.o()) {
                            str2 = str3;
                            j17 = j19;
                        } else {
                            if (!aVar2.n()) {
                                vp.d0.b(y0Var.f520389d, aVar2);
                            }
                            fVar.c();
                            str2 = str3;
                            j17 = j19;
                            fVar.f529866d = (aVar2.B - j19) + y0Var.f520391f.f556441a;
                            fVar.E = y0Var.f520399j[i19];
                            fVar.x(true);
                            ((java.util.List) ((java.util.ArrayList) y0Var.f520400k).get(i19)).add(fVar);
                        }
                        str3 = str2;
                        j19 = j17;
                    }
                }
                i19++;
                str3 = str3;
                j19 = j19;
            }
            str = str3;
        } else {
            str = "DanmakuControllerAsync";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preLayoutDanmakuMatrix contains invalid row type, expected List<BaseDanmaku>");
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = v0Var.f520377f;
        if (reentrantReadWriteLock2.readLock().tryLock()) {
            try {
                xp.i f18 = xp.d.f();
                boolean z27 = f18.f537395s;
                java.util.List list7 = v0Var.f520376e;
                int size2 = z27 ? ((java.util.ArrayList) list7).size() : java.lang.Math.min(f18.f537379c, ((java.util.ArrayList) list7).size());
                int i27 = 0;
                while (i27 < size2) {
                    java.util.List list8 = (java.util.List) ((java.util.ArrayList) list7).get(i27);
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator it8 = list8.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            list2 = list7;
                            break;
                        }
                        wp.a aVar3 = (wp.a) it8.next();
                        long j27 = aVar3.B;
                        long j28 = k17 + 300;
                        if (j27 <= j28) {
                            list2 = list7;
                            if (j27 + aVar3.f529867e.f556446a > k17 && !aVar3.o()) {
                                arrayList4.add(aVar3);
                                list7 = list2;
                            }
                        } else {
                            list2 = list7;
                        }
                        if (aVar3.B > j28) {
                            break;
                        } else {
                            list7 = list2;
                        }
                    }
                    arrayList3.add(arrayList4);
                    i27++;
                    list7 = list2;
                }
            } finally {
                reentrantReadWriteLock2.readLock().unlock();
            }
        }
        java.util.Iterator it9 = arrayList3.iterator();
        while (true) {
            if (it9.hasNext()) {
                if (!(it9.next() instanceof java.util.List)) {
                    z18 = false;
                    break;
                }
            } else {
                z18 = true;
                break;
            }
        }
        if (z18) {
            vp.y0 y0Var2 = (vp.y0) x0Var;
            java.lang.String str4 = y0Var2.f520396g;
            java.util.List list9 = y0Var2.f520401l;
            if (list9 == null || ((java.util.ArrayList) list9).isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str4, "addFollowDanmaku: skip, matrix=%s, followLines=%s", arrayList3, y0Var2.f520401l);
            } else {
                long j29 = y0Var2.f520390e.f556447a;
                for (int i28 = 0; i28 < arrayList3.size() && i28 < ((java.util.ArrayList) y0Var2.f520401l).size(); i28++) {
                    java.util.List<wp.a> list10 = (java.util.List) arrayList3.get(i28);
                    if (list10 != null && !list10.isEmpty()) {
                        for (wp.a aVar4 : list10) {
                            wp.f fVar2 = (wp.f) aVar4;
                            if (!fVar2.p(j29) && !fVar2.q(j29) && !fVar2.o()) {
                                if (!aVar4.n()) {
                                    vp.d0.b(y0Var2.f520389d, aVar4);
                                }
                                fVar2.c();
                                fVar2.f529866d = (aVar4.B - j29) + y0Var2.f520391f.f556441a;
                                fVar2.E = y0Var2.f520402m[i28];
                                fVar2.x(true);
                                ((java.util.List) ((java.util.ArrayList) y0Var2.f520401l).get(i28)).add(fVar2);
                            }
                        }
                    }
                }
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.util.List list11 = y0Var2.f520401l;
                if (list11 == null) {
                    i17 = 0;
                } else {
                    java.util.Iterator it10 = ((java.util.ArrayList) list11).iterator();
                    i17 = 0;
                    while (it10.hasNext()) {
                        i17 += ((java.util.List) it10.next()).size();
                    }
                }
                objArr[0] = java.lang.Integer.valueOf(i17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "addFollowDanmaku: added, totalFollowSize=%d", objArr);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "followDanmakuMatrix contains invalid row type, expected List<BaseDanmaku>");
        }
        vp.y0 y0Var3 = (vp.y0) x0Var;
        int size3 = ((java.util.ArrayList) y0Var3.f520400k).size();
        int i29 = 0;
        while (true) {
            list3 = y0Var3.f520387b;
            eVar = y0Var3.f520391f;
            if (i29 >= size3) {
                break;
            }
            java.util.Iterator it11 = ((java.util.List) ((java.util.ArrayList) y0Var3.f520400k).get(i29)).iterator();
            while (it11.hasNext()) {
                wp.a aVar5 = (wp.a) it11.next();
                if (aVar5.m(eVar.f556441a) || !aVar5.o()) {
                    it11.remove();
                    y0Var3.f520386a--;
                    ((java.util.LinkedList) list3).add(aVar5);
                    aVar5.x(false);
                }
            }
            i29++;
        }
        if (y0Var3.f520401l == null) {
            return;
        }
        for (int i37 = 0; i37 < ((java.util.ArrayList) y0Var3.f520401l).size(); i37++) {
            java.util.Iterator it12 = ((java.util.List) ((java.util.ArrayList) y0Var3.f520401l).get(i37)).iterator();
            while (it12.hasNext()) {
                wp.a aVar6 = (wp.a) it12.next();
                if (aVar6.m(eVar.f556441a) || !aVar6.o()) {
                    it12.remove();
                    y0Var3.f520386a--;
                    ((java.util.LinkedList) list3).add(aVar6);
                    aVar6.x(false);
                }
            }
        }
    }

    @Override // vp.w0
    public void t2() {
        this.Q = true;
    }

    @Override // vp.w0
    public java.util.List t6() {
        vp.x0 x0Var = this.I;
        if (x0Var instanceof vp.y0) {
            return ((vp.y0) x0Var).f520400k;
        }
        return null;
    }

    @Override // vp.w0
    public void v0(wp.a aVar, boolean z17) {
        if (z17) {
            aVar.f529868f = this.f520329o.f556447a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DanmakuControllerAsync", "addFollowDanmakuNow: danmaku time = " + aVar.f529868f + " usePlayTime = " + z17);
        this.f520328n.d(aVar, new vp.p(this));
    }

    @Override // vp.w0
    public boolean y5(android.graphics.Point point, int i17) {
        point.y -= (int) this.f520324g.b();
        zp.m mVar = new zp.m(this.f520330p.f556441a, point, i17);
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 0) {
            mVar.m179271x9616526c();
        }
        ((java.util.concurrent.LinkedBlockingDeque) this.G).add(mVar);
        boolean z17 = false;
        if (this.K.f520318e == 1) {
            return l();
        }
        try {
            if (this.I.d(mVar) != null) {
                z17 = true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("DanmakuControllerAsync", "addClickPoint:" + e17);
        }
        this.K.b(10);
        return z17;
    }
}

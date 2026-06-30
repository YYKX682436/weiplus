package si0;

/* loaded from: classes13.dex */
public final class l0 implements si0.o0 {
    public final android.animation.ValueAnimator.AnimatorUpdateListener A;
    public final android.animation.Animator.AnimatorListener B;
    public si0.b C;
    public long D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f489631a;

    /* renamed from: b, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f489632b;

    /* renamed from: c, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f489633c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f489634d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.LruCache f489635e;

    /* renamed from: f, reason: collision with root package name */
    public org.p3363xbe4143f1.C29699xf00d0af7 f489636f;

    /* renamed from: g, reason: collision with root package name */
    public org.p3363xbe4143f1.C29690xfae77312 f489637g;

    /* renamed from: h, reason: collision with root package name */
    public org.p3363xbe4143f1.C29703xc0897f57 f489638h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 f489639i;

    /* renamed from: j, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f489640j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b f489641k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f489642l;

    /* renamed from: m, reason: collision with root package name */
    public double f489643m;

    /* renamed from: n, reason: collision with root package name */
    public long f489644n;

    /* renamed from: o, reason: collision with root package name */
    public final android.animation.ValueAnimator f489645o;

    /* renamed from: p, reason: collision with root package name */
    public long f489646p;

    /* renamed from: q, reason: collision with root package name */
    public int f489647q;

    /* renamed from: r, reason: collision with root package name */
    public int f489648r;

    /* renamed from: s, reason: collision with root package name */
    public double f489649s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f489650t;

    /* renamed from: u, reason: collision with root package name */
    public final oz5.l f489651u;

    /* renamed from: v, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f489652v;

    /* renamed from: w, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f489653w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f489654x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f489655y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f489656z;

    /* JADX WARN: Multi-variable type inference failed */
    public l0(android.content.Context context, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 textureRegistry, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRegistry, "textureRegistry");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
        this.f489631a = context;
        this.f489632b = textureRegistry;
        this.f489633c = binaryMessenger;
        this.f489634d = "MicroMsg.FlutterPAGViewControllerOrigin@" + j17;
        this.f489635e = new android.util.LruCache(128);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        this.f489645o = ofFloat;
        this.f489649s = 1.0d;
        this.f489650t = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f489651u = ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c.J(1));
        this.f489654x = new java.util.LinkedList();
        this.f489655y = new java.util.LinkedList();
        this.f489656z = new java.util.LinkedList();
        si0.x xVar = new si0.x(this, j17);
        this.A = xVar;
        si0.c0 c0Var = new si0.c0(this, j17);
        this.B = c0Var;
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(xVar);
        ofFloat.addListener(c0Var);
        this.f489641k = new com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b(binaryMessenger, null, 2, 0 == true ? 1 : 0);
    }

    @Override // si0.o0
    public void a(com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 pagInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagInfo, "pagInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f489639i = pagInfo;
        this.f489649s = pagInfo.m88907x8ed9d6bd();
        this.f489640j = this.f489632b.m139631xfdf2a2c3();
        this.f489652v = p3325xe03a0797.p3326xc267989b.l.d(this.f489650t, this.f489651u, null, new si0.j0(this, pagInfo, callback, null), 2, null);
    }

    @Override // si0.o0
    public java.lang.Object b(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        io.p3284xd2ae381c.Log.i(this.f489634d, this + " flush start");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        synchronized (this.f489654x) {
            h0Var.f391656d = new java.util.LinkedList(this.f489654x);
            this.f489654x.clear();
        }
        synchronized (this.f489655y) {
            h0Var2.f391656d = new java.util.LinkedList(this.f489655y);
            this.f489655y.clear();
        }
        synchronized (this.f489656z) {
            h0Var3.f391656d = new java.util.LinkedList(this.f489656z);
            this.f489656z.clear();
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f489650t, this.f489651u, null, new si0.e0(this, h0Var, h0Var2, h0Var3, lVar, null), 2, null);
        return java.lang.Boolean.TRUE;
    }

    @Override // si0.o0
    public boolean c(int i17, com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24031xcb383f47 text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        io.p3284xd2ae381c.Log.i(this.f489634d, this + ", replaceText");
        synchronized (this.f489656z) {
            this.f489656z.add(new jz5.l(java.lang.Integer.valueOf(i17), text));
        }
        return true;
    }

    @Override // si0.o0
    public boolean d(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        synchronized (this.f489654x) {
            this.f489654x.add(new jz5.l(name, java.lang.Integer.valueOf(i17)));
        }
        return true;
    }

    @Override // si0.o0
    public boolean e(int i17, java.lang.String filepath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filepath, "filepath");
        io.p3284xd2ae381c.Log.i(this.f489634d, this + ", replaceImage");
        synchronized (this.f489655y) {
            this.f489655y.add(new jz5.l(java.lang.Integer.valueOf(i17), filepath));
        }
        return true;
    }

    @Override // si0.o0
    /* renamed from: release */
    public void mo164586x41012807() {
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f489640j;
        if (surfaceProducer != null) {
            surfaceProducer.mo138094x41012807();
        }
        this.f489640j = null;
        this.f489645o.cancel();
        p3325xe03a0797.p3326xc267989b.l.d(this.f489650t, this.f489651u, null, new si0.f0(this, null), 2, null);
        io.p3284xd2ae381c.Log.i(this.f489634d, "release");
    }

    @Override // si0.o0
    /* renamed from: seek */
    public void mo164587x35ce78(long j17) {
        p3325xe03a0797.p3326xc267989b.l.d(this.f489650t, this.f489651u, null, new si0.h0(this, j17, null), 2, null);
    }

    @Override // si0.o0
    /* renamed from: startPlay */
    public void mo164588x8113c2b6() {
        io.p3284xd2ae381c.Log.d(this.f489634d, "startPlay: ");
        long j17 = this.f489644n;
        android.animation.ValueAnimator valueAnimator = this.f489645o;
        valueAnimator.setCurrentPlayTime(j17);
        this.f489642l = false;
        valueAnimator.start();
        if (this.D != 0) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new si0.k0(this), this.D);
            this.D = 0L;
        } else {
            si0.b bVar = this.C;
            if (bVar != null) {
                bVar.f489570a.start();
            }
        }
    }

    @Override // si0.o0
    /* renamed from: stop */
    public void mo164589x360802() {
        io.p3284xd2ae381c.Log.d(this.f489634d, "stop: ");
        android.animation.ValueAnimator valueAnimator = this.f489645o;
        this.f489644n = valueAnimator.getCurrentPlayTime();
        this.f489642l = true;
        valueAnimator.cancel();
        si0.b bVar = this.C;
        if (bVar != null) {
            bVar.f489570a.pause();
        }
    }
}

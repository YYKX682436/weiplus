package si0;

/* loaded from: classes13.dex */
public final class v implements si0.o0 {
    public final android.animation.ValueAnimator.AnimatorUpdateListener A;
    public final android.animation.Animator.AnimatorListener B;
    public si0.b C;
    public long D;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f489711a;

    /* renamed from: b, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 f489712b;

    /* renamed from: c, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f489713c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f489714d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.LruCache f489715e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20948xd56d46d3 f489716f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20942x379cf5ee f489717g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.rfx.C20951x8730befb f489718h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 f489719i;

    /* renamed from: j, reason: collision with root package name */
    public io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer f489720j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b f489721k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f489722l;

    /* renamed from: m, reason: collision with root package name */
    public double f489723m;

    /* renamed from: n, reason: collision with root package name */
    public long f489724n;

    /* renamed from: o, reason: collision with root package name */
    public final android.animation.ValueAnimator f489725o;

    /* renamed from: p, reason: collision with root package name */
    public long f489726p;

    /* renamed from: q, reason: collision with root package name */
    public int f489727q;

    /* renamed from: r, reason: collision with root package name */
    public int f489728r;

    /* renamed from: s, reason: collision with root package name */
    public double f489729s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f489730t;

    /* renamed from: u, reason: collision with root package name */
    public final oz5.l f489731u;

    /* renamed from: v, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f489732v;

    /* renamed from: w, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f489733w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f489734x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedList f489735y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.LinkedList f489736z;

    /* JADX WARN: Multi-variable type inference failed */
    public v(android.content.Context context, io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 textureRegistry, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 binaryMessenger, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textureRegistry, "textureRegistry");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binaryMessenger, "binaryMessenger");
        this.f489711a = context;
        this.f489712b = textureRegistry;
        this.f489713c = binaryMessenger;
        this.f489714d = "MicroMsg.FlutterPAGViewController@" + j17;
        this.f489715e = new android.util.LruCache(128);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        this.f489725o = ofFloat;
        this.f489729s = 1.0d;
        this.f489730t = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f489731u = ((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c.J(1));
        this.f489734x = new java.util.LinkedList();
        this.f489735y = new java.util.LinkedList();
        this.f489736z = new java.util.LinkedList();
        si0.h hVar = new si0.h(this, j17);
        this.A = hVar;
        si0.m mVar = new si0.m(this, j17);
        this.B = mVar;
        ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(hVar);
        ofFloat.addListener(mVar);
        this.f489721k = new com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24045xac389d8b(binaryMessenger, null, 2, 0 == true ? 1 : 0);
    }

    @Override // si0.o0
    public void a(com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24030xcb335ec8 pagInfo, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagInfo, "pagInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f489719i = pagInfo;
        this.f489729s = pagInfo.m88907x8ed9d6bd();
        this.f489720j = this.f489712b.m139631xfdf2a2c3();
        this.f489732v = p3325xe03a0797.p3326xc267989b.l.d(this.f489730t, this.f489731u, null, new si0.t(this, pagInfo, callback, null), 2, null);
    }

    @Override // si0.o0
    public java.lang.Object b(yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        io.p3284xd2ae381c.Log.i(this.f489714d, this + " flush start");
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        synchronized (this.f489734x) {
            h0Var.f391656d = new java.util.LinkedList(this.f489734x);
            this.f489734x.clear();
        }
        synchronized (this.f489735y) {
            h0Var2.f391656d = new java.util.LinkedList(this.f489735y);
            this.f489735y.clear();
        }
        synchronized (this.f489736z) {
            h0Var3.f391656d = new java.util.LinkedList(this.f489736z);
            this.f489736z.clear();
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f489730t, this.f489731u, null, new si0.o(this, h0Var, h0Var2, h0Var3, lVar, null), 2, null);
        return java.lang.Boolean.TRUE;
    }

    @Override // si0.o0
    public boolean c(int i17, com.p314xaae8f345.p2845xc516c4b6.p2862xe289a9f3.C24031xcb383f47 text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        io.p3284xd2ae381c.Log.i(this.f489714d, this + ", replaceText");
        synchronized (this.f489736z) {
            this.f489736z.add(new jz5.l(java.lang.Integer.valueOf(i17), text));
        }
        return true;
    }

    @Override // si0.o0
    public boolean d(java.lang.String name, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        synchronized (this.f489734x) {
            this.f489734x.add(new jz5.l(name, java.lang.Integer.valueOf(i17)));
        }
        return true;
    }

    @Override // si0.o0
    public boolean e(int i17, java.lang.String filepath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filepath, "filepath");
        io.p3284xd2ae381c.Log.i(this.f489714d, this + ", replaceImage");
        synchronized (this.f489735y) {
            this.f489735y.add(new jz5.l(java.lang.Integer.valueOf(i17), filepath));
        }
        return true;
    }

    @Override // si0.o0
    /* renamed from: release */
    public void mo164586x41012807() {
        io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658.SurfaceProducer surfaceProducer = this.f489720j;
        if (surfaceProducer != null) {
            surfaceProducer.mo138094x41012807();
        }
        this.f489720j = null;
        this.f489725o.cancel();
        p3325xe03a0797.p3326xc267989b.l.d(this.f489730t, this.f489731u, null, new si0.p(this, null), 2, null);
        io.p3284xd2ae381c.Log.i(this.f489714d, "release");
    }

    @Override // si0.o0
    /* renamed from: seek */
    public void mo164587x35ce78(long j17) {
        p3325xe03a0797.p3326xc267989b.l.d(this.f489730t, this.f489731u, null, new si0.r(this, j17, null), 2, null);
    }

    @Override // si0.o0
    /* renamed from: startPlay */
    public void mo164588x8113c2b6() {
        io.p3284xd2ae381c.Log.d(this.f489714d, "startPlay: ");
        long j17 = this.f489724n;
        android.animation.ValueAnimator valueAnimator = this.f489725o;
        valueAnimator.setCurrentPlayTime(j17);
        this.f489722l = false;
        valueAnimator.start();
        if (this.D != 0) {
            new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new si0.u(this), this.D);
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
        io.p3284xd2ae381c.Log.d(this.f489714d, "stop: ");
        android.animation.ValueAnimator valueAnimator = this.f489725o;
        this.f489724n = valueAnimator.getCurrentPlayTime();
        this.f489722l = true;
        valueAnimator.cancel();
        si0.b bVar = this.C;
        if (bVar != null) {
            bVar.f489570a.pause();
        }
    }
}

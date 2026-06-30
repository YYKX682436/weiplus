package hk4;

/* loaded from: classes10.dex */
public final class n extends hk4.a {
    public volatile boolean A;
    public volatile boolean B;
    public final p3325xe03a0797.p3326xc267989b.y0 C;
    public p3325xe03a0797.p3326xc267989b.r2 D;
    public final java.lang.Runnable E;
    public long F;

    /* renamed from: l, reason: collision with root package name */
    public long f363490l;

    /* renamed from: m, reason: collision with root package name */
    public dk4.a f363491m;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.Bitmap f363496r;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f363498t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.HandlerThread f363499u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f363500v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f363501w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f363502x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f363503y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f363504z;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f363489k = "MicroMsg.MultiMediaImagePlayer@" + hashCode();

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f363492n = "";

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f363493o = "";

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f363494p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f363495q = "";

    /* renamed from: s, reason: collision with root package name */
    public final um5.b0 f363497s = new um5.b0(new com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18(), new com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18(), new com.p314xaae8f345.mm.p2825x7e128009.C22963xba2dd2fa());

    public n() {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.C = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
        this.E = new hk4.m(this);
    }

    public static final void p(hk4.n nVar) {
        if (nVar.f363499u == null) {
            int i17 = pu5.i.f440006b;
            android.os.HandlerThread a17 = pu5.f.a("MvMediaImagePlayer_FakePlayThread", -4);
            nVar.f363499u = a17;
            a17.start();
            android.os.HandlerThread handlerThread = nVar.f363499u;
            nVar.f363498t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(handlerThread != null ? handlerThread.getLooper() : null);
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        nVar.F = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = nVar.f363498t;
        java.lang.Runnable runnable = nVar.E;
        if (n3Var != null) {
            n3Var.mo50300x3fa464aa(runnable);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = nVar.f363498t;
        if (n3Var2 != null) {
            n3Var2.mo50297x7c4d7ca2(runnable, 33L);
        }
    }

    @Override // hk4.a
    public boolean a() {
        return this.f363502x;
    }

    @Override // hk4.a
    public boolean b() {
        return this.f363496r != null;
    }

    @Override // hk4.a
    public boolean c() {
        return this.f363503y;
    }

    @Override // hk4.a
    public hk4.b d() {
        return hk4.b.f363466e;
    }

    @Override // hk4.a
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "pause");
        this.F = 0L;
        this.f363502x = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f363498t;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        this.f363503y = false;
    }

    @Override // hk4.a
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "preloadMedia");
        q(null);
    }

    @Override // hk4.a
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "release");
        o();
        this.f363496r = null;
        this.f363504z = true;
    }

    @Override // hk4.a
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "resume, isPlaying:" + this.f363502x + ", isStarted:" + this.f363503y);
        if (this.f363502x) {
            return;
        }
        hk4.d dVar = new hk4.d(this, new hk4.j(this));
        if (this.f363496r == null) {
            q(new hk4.c(dVar));
        } else {
            dVar.mo152xb9724478();
        }
    }

    @Override // hk4.a
    public void i(long j17, yz5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "seek:" + j17);
        e();
        this.f363500v = j17;
        n();
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // hk4.a
    public void j(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "setLoop:" + z17);
        this.f363501w = z17;
    }

    @Override // hk4.a
    public void l(long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "setPlayRange:[" + j17 + ',' + j18 + ']');
        this.f363490l = j18 - j17;
    }

    @Override // hk4.a
    public void m(int i17, int i18) {
        this.f363455a = i17;
        this.f363456b = i18;
        r();
    }

    @Override // hk4.a
    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "start, isPlaying:" + this.f363502x + ", isStarted:" + this.f363503y);
        if (this.f363503y || this.f363502x) {
            return;
        }
        hk4.d dVar = new hk4.d(this, new hk4.k(this));
        if (this.f363496r == null) {
            q(new hk4.c(dVar));
        } else {
            dVar.mo152xb9724478();
        }
        this.f363503y = true;
        this.A = false;
        this.B = false;
    }

    @Override // hk4.a
    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "stop");
        this.f363502x = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f363498t;
        if (n3Var != null) {
            n3Var.mo50302x6b17ad39(null);
        }
        android.os.HandlerThread handlerThread = this.f363499u;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        this.f363499u = null;
        this.f363498t = null;
        this.f363503y = false;
        this.f363500v = 0L;
    }

    public final void q(yz5.a aVar) {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.D;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.C;
        if (r2Var == null || !r2Var.a()) {
            this.D = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new hk4.i(this, aVar, null), 3, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f363489k, "bitmap is loading, ignore this request");
        if (aVar != null) {
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new hk4.g(r2Var, this, aVar, null), 3, null);
        }
    }

    public final void r() {
        um5.b0 animation = this.f363497s;
        com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 c22964x8b2a0b18 = animation.f510668a;
        com.p314xaae8f345.mm.p2825x7e128009.C22963xba2dd2fa c22963xba2dd2fa = animation.f510670c;
        c22964x8b2a0b18.f296326b = this.f363455a / 2;
        c22964x8b2a0b18.f296327c = this.f363456b / 2;
        c22964x8b2a0b18.f296329e = 1;
        c22964x8b2a0b18.f296328d = 1.0f;
        android.graphics.Bitmap bitmap = this.f363496r;
        dk4.a aVar = this.f363491m;
        jk4.f fVar = aVar instanceof jk4.f ? (jk4.f) aVar : null;
        if (bitmap == null || fVar == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i17 = fVar.B;
        gk4.c animationType = i17 < gk4.c.m131708xcee59d22().length + (-1) ? gk4.c.m131708xcee59d22()[i17] : gk4.c.f354070d;
        c22963xba2dd2fa.f296323b = this.f363457c;
        c22963xba2dd2fa.f296324c = this.f363458d;
        int i18 = this.f363455a;
        int i19 = this.f363456b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        int i27 = i18 / 2;
        com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 c22964x8b2a0b182 = animation.f510668a;
        c22964x8b2a0b182.f296326b = i27;
        int i28 = i19 / 2;
        c22964x8b2a0b182.f296327c = i28;
        c22964x8b2a0b182.f296329e = 1;
        c22964x8b2a0b182.f296328d = 1.0f;
        com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 c22964x8b2a0b183 = animation.f510669b;
        c22964x8b2a0b183.f296326b = i27;
        c22964x8b2a0b183.f296327c = i28;
        c22964x8b2a0b183.f296328d = 1.0f;
        float f17 = (i19 * 1.0f) / height;
        int i29 = width / 10;
        switch (animationType.ordinal()) {
            case 1:
                c22964x8b2a0b182.f296329e = 0;
                c22964x8b2a0b182.f296328d = f17;
                int i37 = width / 2;
                int i38 = i29 / 2;
                c22964x8b2a0b182.f296326b = i37 + i38;
                c22964x8b2a0b183.f296328d = f17;
                c22964x8b2a0b183.f296326b = i37 - i38;
                return;
            case 2:
                c22964x8b2a0b182.f296329e = 0;
                c22964x8b2a0b182.f296328d = f17;
                int i39 = width / 2;
                int i47 = i29 / 2;
                c22964x8b2a0b182.f296326b = i39 - i47;
                c22964x8b2a0b183.f296328d = f17;
                c22964x8b2a0b183.f296326b = i39 + i47;
                return;
            case 3:
                c22964x8b2a0b182.f296329e = 4;
                c22964x8b2a0b182.f296328d = 1.05f;
                c22964x8b2a0b183.f296328d = 1.0f;
                return;
            case 4:
                c22964x8b2a0b182.f296329e = 4;
                c22964x8b2a0b182.f296328d = 1.0f;
                c22964x8b2a0b183.f296328d = 1.05f;
                return;
            case 5:
                c22964x8b2a0b182.f296329e = 3;
                c22964x8b2a0b182.f296328d = 1.05f;
                c22964x8b2a0b183.f296328d = 1.0f;
                return;
            case 6:
                c22964x8b2a0b182.f296329e = 3;
                c22964x8b2a0b182.f296328d = 1.0f;
                c22964x8b2a0b183.f296328d = 1.05f;
                return;
            default:
                return;
        }
    }
}

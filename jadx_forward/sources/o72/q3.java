package o72;

/* loaded from: classes12.dex */
public class q3 implements com.p314xaae8f345.mm.p944x882e457a.x0, com.p314xaae8f345.mm.p944x882e457a.y0, com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: p, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f424979p;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.c1 f424980d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f424981e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f424982f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f424983g;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f424985i;

    /* renamed from: n, reason: collision with root package name */
    public int f424987n;

    /* renamed from: h, reason: collision with root package name */
    public boolean f424984h = false;

    /* renamed from: m, reason: collision with root package name */
    public long f424986m = -1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f424988o = new java.util.LinkedList();

    public q3() {
        this.f424982f = true;
        ((com.p314xaae8f345.mm.app.o7) ((com.p314xaae8f345.mm.p944x882e457a.d1) i95.n0.c(com.p314xaae8f345.mm.p944x882e457a.d1.class))).getClass();
        sl.j jVar = new sl.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0);
        this.f424980d = jVar;
        java.lang.Boolean bool = (java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        this.f424983g = bool.booleanValue();
        boolean booleanValue = true ^ bool.booleanValue();
        this.f424982f = booleanValue;
        jVar.f490576p = this;
        jVar.f490575o = this;
        jVar.f(booleanValue);
        if (f424979p == null) {
            f424979p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (this.f424985i == null) {
            this.f424985i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        f();
        java.util.Iterator it = this.f424988o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).mo55316x42fe6352();
        }
    }

    public boolean b() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f424980d;
        if (c1Var != null) {
            return ((sl.j) c1Var).c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavVoiceLogic", "check is play, but player is null");
        return false;
    }

    public void c() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f424980d;
        if (c1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavVoiceLogic", "do pause, but player is null");
            return;
        }
        if (((sl.j) c1Var).c()) {
            d();
        }
        java.util.Iterator it = this.f424988o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).mo55317xb01dfb57();
        }
    }

    public boolean d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavVoiceLogic", "pause play");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f424980d;
        if (c1Var != null) {
            return ((sl.j) c1Var).d(true);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavVoiceLogic", "pause play error, player is null");
        return false;
    }

    public boolean e(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f424980d;
        if (c1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", str, java.lang.Integer.valueOf(i17));
            return false;
        }
        ((sl.j) c1Var).h(false);
        java.util.Iterator it = this.f424988o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).a(str, 0);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = f424979p;
        if (c21000x8b2f716 != null && !c21000x8b2f716.f273966h) {
            c21000x8b2f716.b(this);
            if (this.f424985i.a(new o72.p3(this))) {
                this.f424986m = 0L;
            } else {
                this.f424986m = -1L;
            }
        }
        this.f424981e = str;
        this.f424987n = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (((sl.j) c1Var).g(str, this.f424982f, true, i17)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
                return true;
            }
        }
        return false;
    }

    public void f() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f424980d;
        if (c1Var != null) {
            ((sl.j) c1Var).h(false);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = f424979p;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f424985i;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f424981e)) {
            return;
        }
        if (this.f424984h) {
            this.f424984h = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f424986m;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f424984h = true;
                return;
            }
        }
        this.f424984h = false;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f424980d;
        if (c1Var != null) {
            c1Var.getClass();
        }
        cv.y0 wi6 = ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi();
        if (this.f424983g) {
            if (c1Var != null) {
                ((sl.j) c1Var).f(false);
            }
            wi6.a(false);
            this.f424982f = false;
            return;
        }
        if (c1Var != null && !((sl.j) c1Var).c()) {
            ((sl.j) c1Var).f(true);
            this.f424982f = true;
        } else {
            if (((xm1.h) wi6).j()) {
                return;
            }
            if (c1Var != null) {
                ((sl.j) c1Var).f(z17);
            }
            this.f424982f = z17;
            if (z17) {
                return;
            }
            e(this.f424981e, this.f424987n);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.x0
    /* renamed from: onCompletion */
    public void mo11229xa6db431b() {
        f();
        java.util.Iterator it = this.f424988o.iterator();
        while (it.hasNext()) {
            ((z30.a0) it.next()).mo55316x42fe6352();
        }
    }
}

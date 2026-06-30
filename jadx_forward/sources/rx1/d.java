package rx1;

/* loaded from: classes12.dex */
public class d implements com.p314xaae8f345.mm.p944x882e457a.x0, com.p314xaae8f345.mm.p944x882e457a.y0, com.p314xaae8f345.mm.sdk.p2603x2137b148.q7 {

    /* renamed from: q, reason: collision with root package name */
    public static volatile rx1.d f482477q;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.c1 f482478d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f482479e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f482480f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f482481g;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 f482483i;

    /* renamed from: n, reason: collision with root package name */
    public int f482485n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 f482486o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f482482h = false;

    /* renamed from: m, reason: collision with root package name */
    public long f482484m = -1;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f482487p = new java.util.LinkedList();

    public d() {
        this.f482480f = true;
        ((com.p314xaae8f345.mm.app.o7) ((com.p314xaae8f345.mm.p944x882e457a.d1) i95.n0.c(com.p314xaae8f345.mm.p944x882e457a.d1.class))).getClass();
        sl.j jVar = new sl.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0);
        this.f482478d = jVar;
        java.lang.Boolean bool = (java.lang.Boolean) gm0.j1.u().c().l(26, java.lang.Boolean.FALSE);
        this.f482481g = bool.booleanValue();
        boolean booleanValue = true ^ bool.booleanValue();
        this.f482480f = booleanValue;
        jVar.f490576p = this;
        jVar.f490575o = this;
        jVar.f(booleanValue);
        if (this.f482486o == null) {
            this.f482486o = new com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        if (this.f482483i == null) {
            this.f482483i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.s7(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
    }

    public static rx1.d b() {
        if (f482477q == null) {
            synchronized (rx1.d.class) {
                if (f482477q == null) {
                    f482477q = new rx1.d();
                }
            }
        }
        return f482477q;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        e();
    }

    public boolean c() {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f482478d;
        if (c1Var != null) {
            return ((sl.j) c1Var).c();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
        return false;
    }

    public boolean d(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f482478d;
        if (c1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", str, java.lang.Integer.valueOf(i17));
            return false;
        }
        ((sl.j) c1Var).h(false);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f482486o;
        if (c21000x8b2f716 != null && !c21000x8b2f716.f273966h) {
            c21000x8b2f716.b(this);
            if (this.f482483i.a(new rx1.b(this))) {
                this.f482484m = 0L;
            } else {
                this.f482484m = -1L;
            }
        }
        this.f482479e = str;
        this.f482485n = i17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (((sl.j) c1Var).g(str, this.f482480f, true, i17)) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.a("keep_app_silent");
                for (rx1.c cVar : this.f482487p) {
                    if (cVar != null) {
                        cVar.d(str);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordVoiceHelper", "stop play");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("keep_app_silent");
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f482478d;
        if (c1Var != null) {
            ((sl.j) c1Var).h(false);
            for (rx1.c cVar : this.f482487p) {
                if (cVar != null) {
                    cVar.c();
                }
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.C21000x8b2f716 c21000x8b2f716 = this.f482486o;
        if (c21000x8b2f716 != null) {
            c21000x8b2f716.a();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.s7 s7Var = this.f482483i;
        if (s7Var != null) {
            s7Var.b();
        }
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.q7
    public void f1(boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f482479e)) {
            return;
        }
        if (this.f482482h) {
            this.f482482h = !z17;
            return;
        }
        if (!z17) {
            long j17 = this.f482484m;
            if (j17 != -1 && android.os.SystemClock.elapsedRealtime() - j17 > 400) {
                this.f482482h = true;
                return;
            }
        }
        this.f482482h = false;
        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = this.f482478d;
        if (c1Var != null) {
            c1Var.getClass();
        }
        if (this.f482481g) {
            if (c1Var != null) {
                ((sl.j) c1Var).f(false);
            }
            this.f482480f = false;
        } else {
            if (c1Var != null && !((sl.j) c1Var).c()) {
                ((sl.j) c1Var).f(true);
                this.f482480f = true;
                return;
            }
            if (c1Var != null) {
                ((sl.j) c1Var).f(z17);
            }
            this.f482480f = z17;
            if (z17) {
                return;
            }
            d(this.f482479e, this.f482485n);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.x0
    /* renamed from: onCompletion */
    public void mo11229xa6db431b() {
        e();
    }
}

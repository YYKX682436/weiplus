package re2;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f475921a;

    /* renamed from: b, reason: collision with root package name */
    public re2.a0 f475922b;

    /* renamed from: c, reason: collision with root package name */
    public long f475923c;

    /* renamed from: d, reason: collision with root package name */
    public r45.f50 f475924d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475925e;

    /* renamed from: f, reason: collision with root package name */
    public long f475926f;

    /* renamed from: g, reason: collision with root package name */
    public long f475927g;

    /* renamed from: h, reason: collision with root package name */
    public long f475928h;

    /* renamed from: i, reason: collision with root package name */
    public long f475929i;

    /* renamed from: j, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f475930j;

    /* renamed from: k, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 f475931k;

    /* renamed from: l, reason: collision with root package name */
    public final android.os.Handler f475932l;

    /* renamed from: m, reason: collision with root package name */
    public long f475933m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f475934n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f475935o;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f475936p;

    /* renamed from: q, reason: collision with root package name */
    public final re2.d0 f475937q;

    public e0(java.lang.String initiatorFinderUsername) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f475921a = initiatorFinderUsername;
        this.f475922b = re2.a0.f475888d;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 4, null, 4, null);
        this.f475930j = b17;
        this.f475931k = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(b17);
        this.f475932l = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f475933m = 3000L;
        this.f475937q = new re2.d0(this);
    }

    public void a() {
        int i17;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f3Var;
        re2.a0 a0Var = this.f475922b;
        re2.a0 a0Var2 = re2.a0.f475890f;
        if (a0Var == a0Var2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "destroy: phase=" + this.f475922b + " → DEAD");
        this.f475922b = a0Var2;
        this.f475932l.removeCallbacks(this.f475937q);
        this.f475935o = false;
        this.f475936p = false;
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        r45.f50 f50Var = null;
        mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
        if (n0Var != null && (f3Var = n0Var.f410798g) != null) {
            f50Var = (r45.f50) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.l2) f3Var).mo144003x754a37bb();
        }
        if (n0Var == null || f50Var == null || f50Var.f455546d != this.f475923c || (i17 = f50Var.f455547e) == 1 || i17 == 4) {
            return;
        }
        f50Var.f455547e = 1;
        n0Var.T6(f50Var, this.f475925e);
    }

    public final void b() {
        re2.a0 a0Var = this.f475922b;
        re2.a0 a0Var2 = re2.a0.f475889e;
        if (a0Var == a0Var2 || a0Var == re2.a0.f475890f || this.f475923c == 0) {
            return;
        }
        this.f475922b = a0Var2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "enterPolling: invitationId=" + this.f475923c + ", interval=" + this.f475933m + "ms");
        this.f475932l.postDelayed(this.f475937q, this.f475933m);
    }

    public abstract java.lang.String c();

    public final boolean d() {
        return this.f475922b != re2.a0.f475890f;
    }

    public final boolean e() {
        if (this.f475926f <= 0) {
            return false;
        }
        boolean z17 = java.lang.System.currentTimeMillis() >= this.f475926f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "[isExpiredByLocalTime] _expireTime=" + this.f475926f + ", expired=" + z17);
        return z17;
    }

    public final void f(int i17) {
        re2.a0 a0Var = this.f475922b;
        re2.a0 a0Var2 = re2.a0.f475890f;
        if (a0Var == a0Var2) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "markDead: phase=" + this.f475922b + " → DEAD, terminalStatus=" + i17);
        this.f475922b = a0Var2;
        this.f475932l.removeCallbacks(this.f475937q);
        this.f475935o = false;
        this.f475936p = false;
        r45.f50 f50Var = this.f475924d;
        if (f50Var == null) {
            f50Var = new r45.f50();
            f50Var.f455546d = this.f475923c;
        }
        f50Var.f455547e = i17;
        this.f475924d = f50Var;
        j();
    }

    public boolean g(int i17) {
        return false;
    }

    public void h() {
        if (this.f475922b != re2.a0.f475889e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onScreenshotDetected ignored: phase=" + this.f475922b);
            return;
        }
        if (this.f475923c == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "onScreenshotDetected: invitationId=" + this.f475923c + ", pollInFlight=" + this.f475934n);
        if (this.f475934n) {
            this.f475935o = true;
        } else {
            i();
        }
    }

    public final void i() {
        if (this.f475922b != re2.a0.f475889e) {
            return;
        }
        this.f475932l.removeCallbacks(this.f475937q);
        this.f475936p = true;
        this.f475932l.post(this.f475937q);
    }

    public final void j() {
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
            r45.f50 f50Var = this.f475924d;
            if (f50Var != null) {
                try {
                    r45.f50 f50Var2 = new r45.f50();
                    f50Var2.mo11468x92b714fd(f50Var.mo14344x5f01b1f6());
                    f50Var = f50Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(c(), "syncToSlice: deep copy failed, fallback to origin ref", e17);
                }
            } else {
                f50Var = null;
            }
            n0Var.T6(f50Var, this.f475925e);
        }
    }
}

package rp1;

/* loaded from: classes14.dex */
public final class v0 {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f480069f = jz5.h.b(rp1.o0.f480039d);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f480070a;

    /* renamed from: b, reason: collision with root package name */
    public volatile rp1.n0 f480071b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f480072c;

    /* renamed from: d, reason: collision with root package name */
    public rp1.p0 f480073d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f480074e;

    public v0(java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f480070a = "MicroMsg.FloatBallIdleHelper-".concat(type);
    }

    public final void a() {
        rp1.n0 n0Var = this.f480071b;
        wu5.c cVar = n0Var != null ? n0Var.f480019b : null;
        if (cVar == null) {
            return;
        }
        java.lang.String str = this.f480070a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cancelIdleTimer taskId: ");
        rp1.n0 n0Var2 = this.f480071b;
        sb6.append(n0Var2 != null ? java.lang.Long.valueOf(n0Var2.f480018a) : null);
        sb6.append(", isDone: ");
        sb6.append(cVar.isDone());
        sb6.append(", isCancelled: ");
        sb6.append(cVar.isCancelled());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (!cVar.isDone() && !cVar.isCancelled()) {
            cVar.cancel(false);
        }
        this.f480071b = null;
    }

    public final void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f480070a, "resetIdleState isChecking: " + this.f480074e + ", isIdle: " + this.f480072c);
        this.f480074e = false;
        d(false);
        if (this.f480071b != null) {
            ((ku5.t0) ku5.t0.f394148d).h(new rp1.s0(this), this.f480070a);
        }
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f480070a, "startCheckIdle isChecking: " + this.f480074e + ", isIdle: " + this.f480072c);
        if (this.f480074e) {
            return;
        }
        if (this.f480072c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f480070a, "startCheckIdle is already idle, not need check");
            return;
        }
        this.f480074e = true;
        ((ku5.t0) ku5.t0.f394148d).h(new rp1.t0(this), this.f480070a);
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f480070a, "updateIdleState idle: " + z17 + ", current: " + this.f480072c);
        if (this.f480072c != z17) {
            d75.b.g(new rp1.u0(this, z17));
        }
    }
}

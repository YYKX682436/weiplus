package k83;

/* loaded from: classes14.dex */
public abstract class f extends k83.b implements k83.a {

    /* renamed from: f, reason: collision with root package name */
    public boolean f386427f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f386428g = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public k83.e f386429h = null;

    @Override // k83.a
    public void a(int i17, java.lang.Object obj, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseIPCallTimerService", "timer request failed, type: %d, isLoop: %b, interval: %d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f386427f), java.lang.Integer.valueOf(k()));
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) obj;
        m(m1Var);
        k83.e eVar = this.f386429h;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p) eVar;
            if (pVar.i(i17, m1Var, i18, i19)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "onTimerFailed different room ignore");
            } else if (i17 == 2) {
                pVar.j(false);
            } else if (i17 == 5) {
                pVar.e(false);
            }
        }
        if (l()) {
            p();
        } else if (this.f386427f) {
            this.f386428g.mo50297x7c4d7ca2(new k83.d(this), k());
        }
    }

    @Override // k83.a
    public void b(int i17, java.lang.Object obj, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseIPCallTimerService", "timer request success!, type: %d, isLoop: %b, interval: %d", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f386427f), java.lang.Integer.valueOf(k()));
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) obj;
        n(m1Var);
        k83.e eVar = this.f386429h;
        if (eVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.p) eVar;
            if (pVar.i(i17, m1Var, i18, i19)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallSvrLogic", "onTimerSuccess different room ignore");
            } else if (i17 == 2) {
                pVar.j(true);
            } else if (i17 == 5) {
                pVar.e(true);
            }
        }
        if (this.f386427f) {
            this.f386428g.mo50297x7c4d7ca2(new k83.c(this), k());
        }
    }

    @Override // k83.b
    public void c() {
        super.c();
    }

    @Override // k83.b
    public void f() {
        this.f386423d = this;
        super.f();
    }

    @Override // k83.b
    public void j(k83.g gVar) {
        super.j(gVar);
        this.f386427f = true;
        e();
    }

    public abstract int k();

    public abstract boolean l();

    public abstract void m(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var);

    public abstract void n(com.p314xaae8f345.mm.p944x882e457a.m1 m1Var);

    public abstract void o();

    public void p() {
        this.f386427f = false;
        o();
        e();
    }
}

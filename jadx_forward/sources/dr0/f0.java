package dr0;

/* loaded from: classes12.dex */
public final class f0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f323955b;

    public f0(dr0.t0 t0Var) {
        this.f323955b = t0Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "bg, curr=".concat(dr0.t0.g(this.f323955b, currentTimeMillis)));
        dr0.t0 t0Var = this.f323955b;
        t0Var.f324080g = currentTimeMillis;
        long j17 = t0Var.f324081h;
        if (1 <= j17 && j17 < currentTimeMillis) {
            long j18 = currentTimeMillis - j17;
            t0Var.i().m46749x6aff37a6(this.f323955b.i().getAccFgMs() + j18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acc fgMin: ");
            long accFgMs = this.f323955b.i().getAccFgMs();
            long j19 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            sb6.append(accFgMs / j19);
            sb6.append(", last=");
            dr0.t0 t0Var2 = this.f323955b;
            sb6.append(dr0.t0.g(t0Var2, t0Var2.f324081h));
            sb6.append(", delta=");
            sb6.append(j18 / j19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", sb6.toString());
        }
        dr0.t0 t0Var3 = this.f323955b;
        t0Var3.f324081h = 0L;
        t0Var3.b(false);
        if (this.f323955b.f324074a) {
            dr0.a3 a17 = dr0.a3.f323936d.a();
            a17.getClass();
            if (dr0.j2.f323973b.a()) {
                ((ku5.t0) ku5.t0.f394148d).g(new dr0.u2(a17));
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            this.f323955b.i().m46667x2956a57a(false);
            this.f323955b.k();
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "fg, curr=".concat(dr0.t0.g(this.f323955b, currentTimeMillis)));
        this.f323955b.f324074a = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            dr0.a3.f323936d.a().d("fg");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).getClass();
            dr0.h1 h1Var = dr0.p1.f324022d;
            h1Var.a().k(false);
            if (h1Var.a().f324026c) {
                h1Var.a().m(false);
            }
            if (q01.a1.f440792a.b()) {
                ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.NetSceneTracker");
                ((ku5.t0) ku5.t0.f394148d).l(q01.v0.f440873d, 60000L, "MicroMsg.NetSceneTracker");
            }
            cr0.k4.f303202a.a();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            dr0.t0 t0Var = this.f323955b;
            t0Var.f324075b = 0;
            t0Var.i().m46667x2956a57a(true);
            dr0.q3.f324046t.h();
            dr0.q3.f324045s.h();
            this.f323955b.f324078e = 0L;
        }
        dr0.t0 t0Var2 = this.f323955b;
        t0Var2.f324081h = currentTimeMillis;
        long j17 = t0Var2.f324080g;
        if (1 <= j17 && j17 < currentTimeMillis) {
            long j18 = currentTimeMillis - j17;
            t0Var2.i().m46668x6e6e4915(j18);
            this.f323955b.i().m46740x6afd662a(this.f323955b.i().getAccBgMs() + j18);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acc bgMin: ");
            long accBgMs = this.f323955b.i().getAccBgMs();
            long j19 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
            sb6.append(accBgMs / j19);
            sb6.append(", last=");
            dr0.t0 t0Var3 = this.f323955b;
            sb6.append(dr0.t0.g(t0Var3, t0Var3.f324080g));
            sb6.append(", delta=");
            sb6.append(j18 / j19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", sb6.toString());
        }
        dr0.t0 t0Var4 = this.f323955b;
        t0Var4.f324080g = 0L;
        t0Var4.b(false);
    }
}

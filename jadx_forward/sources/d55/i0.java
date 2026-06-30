package d55;

/* loaded from: classes12.dex */
public class i0 extends d55.j0 {
    public i0(d55.j0 j0Var) {
        super(j0Var);
    }

    @Override // d55.j0
    public void j(int i17) {
        this.f308103m = java.lang.System.currentTimeMillis();
        d55.j c17 = d55.j.c(this.f308097d);
        this.f308106p = c17;
        c17.a();
        d55.j jVar = this.f308106p;
        long j17 = jVar.f308121a;
        java.lang.String str = jVar.f308122b;
        d55.k kVar = jVar.f308124d;
        this.f308105o = new d55.j(j17, str, new d55.k(kVar.f308130a, kVar.f308131b), jVar.f308123c);
        d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "#begin");
        this.f308125r = i17;
        long j18 = this.f308127t;
        if (j18 > 0) {
            this.f308128u = this.f308103m - j18;
        }
        long j19 = this.f308128u;
        if (j19 <= 0) {
            j19 = this.f308103m - this.f308106p.f308121a;
        }
        d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "recovery interval = " + j19);
        if (j19 < this.f308107q.f308091d) {
            d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "within interval, inc");
        } else {
            d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "over signal interval, clear point");
            b();
        }
        e();
        int i18 = this.f308105o.f308124d.f308130a;
        d55.o0.a(4, "MicroMsg.recovery.signalHandlerFallback", "recovery crashCount = " + i18);
        if (i18 < this.f308107q.f308088a) {
            i(true);
            return;
        }
        if (!f()) {
            d55.o0.a(5, "MicroMsg.recovery.signalHandlerFallback", "launch recovery fail");
            i(true);
            return;
        }
        if (i18 < this.f308107q.f308089b) {
            g(1);
        } else {
            g(2);
            a();
        }
        i(true);
        h();
    }
}

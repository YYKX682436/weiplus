package cl;

/* loaded from: classes7.dex */
public class v2 extends cl.u2 implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final long f124336h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f124337i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p159x477cd522.p160x333422.C1469x28b0ccd7 f124338m;

    public v2(cl.w2 w2Var, cl.q0 q0Var, int i17, com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a, com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7, boolean z17, long j17) {
        super(w2Var, q0Var, i17, c1474xd5ce209a);
        this.f124336h = j17;
        this.f124337i = z17;
        this.f124338m = c1469x28b0ccd7;
    }

    @Override // cl.u2
    public void b() {
        this.f124310g.f124347c.remove(this.f124309f);
        this.f124308e.mo15825x41012807();
        this.f124338m.mo15825x41012807();
    }

    public void e() {
        cl.a aVar = (cl.a) this.f124307d.f124257b;
        aVar.c();
        aVar.f124102b.l(this, this.f124336h, false);
    }

    public void run() {
        if (d()) {
            c(this.f124338m);
            if (d()) {
                if (this.f124337i) {
                    e();
                } else {
                    b();
                }
            }
        }
    }
}

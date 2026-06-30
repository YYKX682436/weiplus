package cl;

/* loaded from: classes7.dex */
public final class f0 extends cl.u3 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.ThreadLocal f124159q = new java.lang.ThreadLocal();

    /* renamed from: o, reason: collision with root package name */
    public final cl.g0 f124160o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f124161p;

    public f0(cl.g0 g0Var, boolean z17) {
        super("MicroMsg.NodeJSRuntimeLooper", z17);
        this.f124160o = g0Var;
        this.f124161p = true;
    }

    @Override // cl.u3
    public void c() {
        super.c();
        this.f124161p = ((cl.c0) this.f124160o).f124138a.A.m15853x5b586cbf(true);
    }

    @Override // cl.u3
    public void g() {
        super.g();
        this.f124161p = ((cl.c0) this.f124160o).f124138a.A.m15853x5b586cbf(false);
        f(new yz5.a() { // from class: cl.f0$$a
            @Override // yz5.a
            /* renamed from: invoke */
            public final java.lang.Object mo152xb9724478() {
                return "loopTask end: UvLoopAlive=" + cl.f0.this.f124161p;
            }
        });
    }

    @Override // cl.u3
    public void p() {
        super.p();
        cl.g0 g0Var = this.f124160o;
        if (g0Var != null) {
            cl.e0 e0Var = ((cl.c0) g0Var).f124138a;
            if (e0Var.A != null) {
                com.p314xaae8f345.mm.p2809x52b77bcb.C22922xb967cba0 c22922xb967cba0 = e0Var.D;
                if (c22922xb967cba0 != null) {
                    c22922xb967cba0.m83365x5cd39ffa();
                    e0Var.D = null;
                }
                e0Var.A.m15848xc0190dd();
            }
        }
    }

    @Override // cl.u3
    public void q() {
        cl.g0 g0Var = this.f124160o;
        if (g0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f124311a, "onQuit wakeUpUVLoop");
            com.p159x477cd522.p160x333422.C1459xa4933cc1 c1459xa4933cc1 = ((cl.c0) g0Var).f124138a.A;
            if (c1459xa4933cc1 != null) {
                c1459xa4933cc1.m15859xd0578d04();
            }
        }
    }

    @Override // cl.u3
    public void r() {
        com.p159x477cd522.p160x333422.C1459xa4933cc1 c1459xa4933cc1;
        cl.g0 g0Var = this.f124160o;
        if (g0Var == null || (c1459xa4933cc1 = ((cl.c0) g0Var).f124138a.A) == null) {
            return;
        }
        c1459xa4933cc1.m15859xd0578d04();
    }

    @Override // cl.u3
    public void s() {
        com.p159x477cd522.p160x333422.C1459xa4933cc1 c1459xa4933cc1;
        cl.g0 g0Var = this.f124160o;
        if (g0Var == null || d() || (c1459xa4933cc1 = ((cl.c0) g0Var).f124138a.A) == null) {
            return;
        }
        c1459xa4933cc1.m15859xd0578d04();
    }

    @Override // cl.u3
    public boolean u() {
        return !this.f124161p && super.u();
    }
}

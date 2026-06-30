package cl;

/* loaded from: classes7.dex */
public final class f0 extends cl.u3 {

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.ThreadLocal f42626q = new java.lang.ThreadLocal();

    /* renamed from: o, reason: collision with root package name */
    public final cl.g0 f42627o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f42628p;

    public f0(cl.g0 g0Var, boolean z17) {
        super("MicroMsg.NodeJSRuntimeLooper", z17);
        this.f42627o = g0Var;
        this.f42628p = true;
    }

    @Override // cl.u3
    public void c() {
        super.c();
        this.f42628p = ((cl.c0) this.f42627o).f42605a.A.handleMessage(true);
    }

    @Override // cl.u3
    public void g() {
        super.g();
        this.f42628p = ((cl.c0) this.f42627o).f42605a.A.handleMessage(false);
        f(new yz5.a() { // from class: cl.f0$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                return "loopTask end: UvLoopAlive=" + cl.f0.this.f42628p;
            }
        });
    }

    @Override // cl.u3
    public void p() {
        super.p();
        cl.g0 g0Var = this.f42627o;
        if (g0Var != null) {
            cl.e0 e0Var = ((cl.c0) g0Var).f42605a;
            if (e0Var.A != null) {
                com.tencent.mm.weapp_core.TimerBinding timerBinding = e0Var.D;
                if (timerBinding != null) {
                    timerBinding.destroy();
                    e0Var.D = null;
                }
                e0Var.A.closeUVLoop();
            }
        }
    }

    @Override // cl.u3
    public void q() {
        cl.g0 g0Var = this.f42627o;
        if (g0Var != null) {
            com.tencent.mars.xlog.Log.i(this.f42778a, "onQuit wakeUpUVLoop");
            com.eclipsesource.mmv8.MultiContextNodeJS multiContextNodeJS = ((cl.c0) g0Var).f42605a.A;
            if (multiContextNodeJS != null) {
                multiContextNodeJS.wakeUpUVLoop();
            }
        }
    }

    @Override // cl.u3
    public void r() {
        com.eclipsesource.mmv8.MultiContextNodeJS multiContextNodeJS;
        cl.g0 g0Var = this.f42627o;
        if (g0Var == null || (multiContextNodeJS = ((cl.c0) g0Var).f42605a.A) == null) {
            return;
        }
        multiContextNodeJS.wakeUpUVLoop();
    }

    @Override // cl.u3
    public void s() {
        com.eclipsesource.mmv8.MultiContextNodeJS multiContextNodeJS;
        cl.g0 g0Var = this.f42627o;
        if (g0Var == null || d() || (multiContextNodeJS = ((cl.c0) g0Var).f42605a.A) == null) {
            return;
        }
        multiContextNodeJS.wakeUpUVLoop();
    }

    @Override // cl.u3
    public boolean u() {
        return !this.f42628p && super.u();
    }
}

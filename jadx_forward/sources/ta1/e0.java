package ta1;

/* loaded from: classes7.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498146e;

    public e0(ta1.q0 q0Var, ta1.t0 t0Var) {
        this.f498146e = q0Var;
        this.f498145d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ta1.q0 q0Var = this.f498146e;
        boolean a17 = ta1.q0.a(q0Var);
        ta1.t0 t0Var = this.f498145d;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: resume failed: not started");
            t0Var.a(2, 301, "not start yet!", null);
            return;
        }
        ta1.o0 o0Var = q0Var.f498201d;
        ta1.o0 o0Var2 = ta1.o0.Running;
        if (o0Var == o0Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: resume failed: already running!");
            t0Var.a(2, 302, "already running!", null);
            return;
        }
        q0Var.f498201d = o0Var2;
        ta1.f fVar = (ta1.f) q0Var.f498199b;
        if (fVar.f498147c == null) {
            t0Var.a(0, 0, "ok", null);
            return;
        }
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = (com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2) fVar.f498138b.get();
        if (c4216x654bedf2 == null) {
            t0Var.a(0, 0, "ok", null);
            return;
        }
        qa1.u uVar = (qa1.u) c4216x654bedf2.getF130185e();
        if (uVar == null) {
            t0Var.a(0, 0, "ok", null);
            return;
        }
        if (!uVar.mo159665x1a7eccbf()) {
            t0Var.a(0, 0, "ok", null);
        }
        ((ht0.s) fVar.f498147c).l(0, uVar.mo159663x40edc78f(), uVar.mo159661xc2fc307e());
        t0Var.a(0, 0, "ok", null);
        ua1.f fVar2 = fVar.f498150f;
        if (fVar2 != null) {
            fVar2.d();
        }
    }
}

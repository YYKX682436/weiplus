package ta1;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498142e;

    public d0(ta1.q0 q0Var, ta1.t0 t0Var) {
        this.f498142e = q0Var;
        this.f498141d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ta1.q0 q0Var = this.f498142e;
        boolean a17 = ta1.q0.a(q0Var);
        ta1.t0 t0Var = this.f498141d;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: pause failed: not started");
            t0Var.a(2, 201, "not start yet!", null);
            return;
        }
        ta1.o0 o0Var = q0Var.f498201d;
        ta1.o0 o0Var2 = ta1.o0.Paused;
        if (o0Var == o0Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: pause failed: already paused!");
            t0Var.a(2, 202, "already paused!", null);
            return;
        }
        q0Var.f498201d = o0Var2;
        ta1.f fVar = (ta1.f) q0Var.f498199b;
        ht0.b bVar = fVar.f498147c;
        if (bVar == null) {
            t0Var.a(0, 0, "ok", null);
            return;
        }
        ((ht0.s) bVar).mo127747x65825f6();
        ua1.f fVar2 = fVar.f498150f;
        if (fVar2 != null) {
            fVar2.c();
        }
        t0Var.a(0, 0, "ok", null);
    }
}

package ta1;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ta1.t0 f498158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498159e;

    public h0(ta1.q0 q0Var, ta1.t0 t0Var) {
        this.f498159e = q0Var;
        this.f498158d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ta1.q0 q0Var = this.f498159e;
        if (!ta1.q0.a(q0Var)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: abort failed: not started");
            this.f498158d.a(2, 401, "not start yet!", null);
            return;
        }
        ta1.f fVar = (ta1.f) q0Var.f498199b;
        ht0.b bVar = fVar.f498147c;
        if (bVar != null) {
            ((ht0.s) bVar).mo127742xae7a2e7a();
            ((ht0.s) fVar.f498147c).mo127743x5a5b64d();
        }
        q0Var.f498199b.getClass();
        q0Var.f498201d = ta1.o0.Inited;
        q0Var.f498202e = null;
        ta1.f fVar2 = (ta1.f) q0Var.f498199b;
        synchronized (fVar2) {
            fVar2.f498148d = null;
        }
        com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2 c4216x654bedf2 = (com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2) this.f498159e.f498199b.f498138b.get();
        ta1.t0 t0Var = this.f498158d;
        if (c4216x654bedf2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: abort failed: view lost");
            t0Var.a(0, 0, "ok", null);
        } else {
            t0Var.a(0, 0, "ok", null);
        }
        ua1.f fVar3 = fVar.f498150f;
        if (fVar3 != null) {
            fVar3.e();
        }
    }
}

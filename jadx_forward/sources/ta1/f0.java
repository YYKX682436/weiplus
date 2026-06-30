package ta1;

/* loaded from: classes7.dex */
public class f0 implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.g0 f498151a;

    public f0(ta1.g0 g0Var) {
        this.f498151a = g0Var;
    }

    @Override // ta1.t0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(int i17, int i18, java.lang.String str, java.lang.String str2) {
        ta1.g0 g0Var = this.f498151a;
        if (((com.p314xaae8f345.p485x5dc4f1ad.ui.C4216x654bedf2) g0Var.f498154e.f498199b.f498138b.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: stop failed: view lost");
            g0Var.f498153d.a(1, -2, "view lost", null);
            return;
        }
        if (i17 != 0 || i18 != 0) {
            g0Var.f498153d.a(i17, i18, str, null);
            return;
        }
        ta1.q0 q0Var = g0Var.f498154e;
        ta1.p0 p0Var = new ta1.p0(q0Var);
        p0Var.f498193a = q0Var.f498202e;
        p0Var.f498194b = q0Var.f498203f;
        q0Var.f498199b.getClass();
        q0Var.f498201d = ta1.o0.Inited;
        q0Var.f498202e = null;
        ta1.f fVar = (ta1.f) q0Var.f498199b;
        synchronized (fVar) {
            fVar.f498148d = null;
        }
        g0Var.f498153d.a(0, 0, "ok", p0Var);
    }
}

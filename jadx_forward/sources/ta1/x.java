package ta1;

/* loaded from: classes7.dex */
public class x implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ta1.y f498226a;

    public x(ta1.y yVar) {
        this.f498226a = yVar;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GameRecorderMgr", "hy: start record failed!");
            this.f498226a.f498227d.f498132d.a(i17, i18, str, "");
            return;
        }
        ta1.a0 a0Var = this.f498226a.f498227d;
        ta1.q0 q0Var = a0Var.f498136h;
        q0Var.f498201d = ta1.o0.Running;
        ta1.s0 s0Var = a0Var.f498133e;
        q0Var.f498202e = s0Var.f498210c;
        q0Var.f498203f = s0Var.f498211d;
        ta1.f fVar = (ta1.f) q0Var.f498199b;
        synchronized (fVar) {
            fVar.f498148d = null;
        }
        ta1.a0 a0Var2 = this.f498226a.f498227d;
        ta1.b bVar = a0Var2.f498136h.f498199b;
        ta1.l0 l0Var = a0Var2.f498134f;
        ta1.f fVar2 = (ta1.f) bVar;
        synchronized (fVar2) {
            fVar2.f498148d = l0Var;
        }
        this.f498226a.f498227d.f498132d.a(0, 0, "ok", null);
    }
}

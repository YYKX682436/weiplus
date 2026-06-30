package e50;

/* loaded from: classes11.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e50.z0 f331046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e50.z0 z0Var) {
        super(0);
        this.f331046d = z0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e50.z0 z0Var = this.f331046d;
            z0Var.getClass();
            if (z0Var.f331091e == null || (!r3.f436239j)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "initEngineGroup");
                b03.a0 a0Var = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_flutter_engine_group_report_mem, false) ? new b03.a0() : null;
                if (a0Var != null) {
                    ((ku5.t0) ku5.t0.f394148d).h(new b03.x(a0Var), "EngineGroupMemReporter_serial");
                }
                java.lang.String[] args = z0Var.wi();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
                p3325xe03a0797.p3326xc267989b.r2 b17 = b03.u.f98397a.b();
                e50.f0 f0Var = new e50.f0(z0Var);
                pi0.q qVar = new pi0.q(context, args, b17);
                qVar.f436247r = f0Var;
                z0Var.f331091e = qVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterEngineService", "initEngineGroup: create " + z0Var.f331091e);
                z0Var.f331093g = p3325xe03a0797.p3326xc267989b.l.d(z0Var.f331090d, null, null, new e50.i0(z0Var, a0Var, null), 3, null);
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_flutter_engine_auto_release_interval, 30);
                pi0.q qVar2 = z0Var.f331091e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar2);
                z0Var.f331092f = new b03.l(qVar2, Ni * 1000, z0Var.f331097n, a0Var);
            }
        }
        return jz5.f0.f384359a;
    }
}

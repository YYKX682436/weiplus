package yn1;

/* loaded from: classes11.dex */
public final class b4 {
    public b4(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        pi0.l1 l1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.RoamMigrationService", "[detachFltInstanceIfNoTask] task status=" + yn1.z0.f545466a.i());
        i95.m c17 = i95.n0.c(mv.w.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.backup.migration.MigrationService");
        yn1.h4 h4Var = (yn1.h4) c17;
        synchronized (h4Var) {
            l1Var = h4Var.f545225d;
            h4Var.f545225d = null;
        }
        if (l1Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a), null, null, new yn1.d4(l1Var, h4Var, null), 3, null);
        }
    }
}

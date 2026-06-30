package w11;

/* loaded from: classes12.dex */
public class f2 implements w11.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w11.d2 f523555a;

    public f2(w11.d2 d2Var) {
        this.f523555a = d2Var;
    }

    public void a(final r45.jj6 jj6Var, w11.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "onContinueSync continueSyncScene:%s syncDataId:%s", fVar, jj6Var.f459422m);
        x51.q1 q1Var = this.f523555a.f523532a;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: w11.f2$$a
            @Override // java.lang.Runnable
            public final void run() {
                w11.f2 f2Var = w11.f2.this;
                f2Var.getClass();
                r45.jj6 jj6Var2 = jj6Var;
                int i17 = jj6Var2.f459423n;
                w11.d2 d2Var = f2Var.f523555a;
                if (i17 != 0) {
                    if (i17 == 1) {
                        if ((jj6Var2.f459424o & 1) > 0) {
                            gm0.j1.d().g(new w11.n0(jj6Var2.f459425p, w11.c2.f523524a.a()));
                        }
                        d2Var.d(new w11.v(jj6Var2));
                        return;
                    } else {
                        if (i17 == 2) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "onContinueSync SyncDataType_LightPush onFinishCmd index:%s ", java.lang.Integer.valueOf(jj6Var2.f459427r));
                            int i18 = jj6Var2.f459427r;
                            gm0.j1.i();
                            com.p314xaae8f345.mm.p642xad8b531f.y1.b(i18, gm0.j1.b().h());
                            d2Var.d(new w11.v(jj6Var2));
                            return;
                        }
                        return;
                    }
                }
                r45.ew4 ew4Var = jj6Var2.f459416d;
                if (ew4Var != null) {
                    if ((ew4Var.f455293f & jj6Var2.f459419g) != 0) {
                        r45.c50 c50Var = ew4Var.f455292e;
                        if (c50Var == null || !c50Var.f452828e.isEmpty() || !jj6Var2.f459420h || jj6Var2.f459428s <= 10) {
                            int i19 = jj6Var2.f459418f;
                            int i27 = jj6Var2.f459419g;
                            int i28 = jj6Var2.f459428s + 1;
                            jj6Var2.f459428s = i28;
                            d2Var.getClass();
                            d2Var.a(new z11.b(d2Var, i19, i27, i28, com.p314xaae8f345.mm.p642xad8b531f.x1.e()));
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SyncService", "MMKVProcessor %s onFinishCmd is continue Sync , but no Cmd , I will not continue again.", java.lang.Integer.valueOf(jj6Var2.f459421i));
                            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c c6423x452b9f7c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6423x452b9f7c();
                            c6423x452b9f7c.f137646e = 3556L;
                            c6423x452b9f7c.f137650i = jj6Var2.f459421i;
                            c6423x452b9f7c.f137651j = jj6Var2.f459416d.f455293f;
                            c6423x452b9f7c.f137652k = jj6Var2.f459419g;
                            c6423x452b9f7c.r(jj6Var2.f459418f + "");
                            c6423x452b9f7c.s(jj6Var2.f459428s + "");
                            c6423x452b9f7c.k();
                        }
                    }
                }
                d2Var.d(new w11.v(jj6Var2));
            }
        };
        q1Var.getClass();
        q1Var.a(runnable, 50L, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(r45.jj6 jj6Var, w11.u uVar) {
        if (jj6Var.f459423n == 0) {
            if (uVar == 0) {
                w11.v vVar = new w11.v(jj6Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "onSceneCallback netscene is null, use:%s", vVar.m173100x9616526c());
                gm0.j1.d().mo815x76e0bfae(0, 0, "", vVar);
            } else {
                com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) uVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SyncService", "onSceneCallback netscene is %s", java.lang.Integer.valueOf(m1Var.hashCode()));
                gm0.j1.d().mo815x76e0bfae(0, 0, "", m1Var);
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

/* loaded from: classes7.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e1 f170549a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e1();

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a ui6, java.lang.String lifecycle) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 o76;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        android.util.SparseArray sparseArray = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e1.f169368c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e1 e1Var = null;
        if (ui6.isFinishing() || ui6.isDestroyed()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e1.f169368c.remove(ui6.hashCode());
        } else if (ui6.F7()) {
            int hashCode = ui6.hashCode();
            android.util.SparseArray sparseArray2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e1.f169368c;
            e1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e1) sparseArray2.get(hashCode, null);
            if (e1Var == null) {
                e1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e1(ui6);
                sparseArray2.put(hashCode, e1Var);
            }
        }
        if (e1Var != null) {
            boolean y17 = r26.i0.y(lifecycle, "onCreate", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a context = e1Var.f169369a;
            if (!y17) {
                switch (lifecycle.hashCode()) {
                    case -1401315045:
                        if (lifecycle.equals("onDestroy")) {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.e1.f169368c.remove(context.hashCode());
                            break;
                        }
                        break;
                    case -1340212393:
                        if (lifecycle.equals("onPause")) {
                            e1Var.f169370b = 0;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d1 d1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.d1(e1Var);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.oa(context, d1Var));
                            break;
                        }
                        break;
                    case -918269635:
                        if (lifecycle.equals("onNewIntent")) {
                            e1Var.f169370b = 4;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 o77 = context.o7();
                            if (o77 != null) {
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6950xc5df1c2e c6950xc5df1c2e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6950xc5df1c2e();
                                c6950xc5df1c2e.f142552d = 1L;
                                c6950xc5df1c2e.f142553e = 2L;
                                c6950xc5df1c2e.f142554f = c6950xc5df1c2e.b("ItemId", o77.f158811d, true);
                                c6950xc5df1c2e.f142555g = c6950xc5df1c2e.b("ItemSessionId", o77.f128809v, true);
                                c6950xc5df1c2e.k();
                                break;
                            }
                        }
                        break;
                    case 1463983852:
                        if (lifecycle.equals("onResume")) {
                            ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c1(1), "AppBrandUIStandaloneTaskVisitReporter");
                            int i17 = e1Var.f169370b;
                            if (i17 <= 0) {
                                i17 = 2;
                            }
                            ((ku5.t0) ku5.t0.f394148d).b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.c1(i17), "AppBrandUIStandaloneTaskVisitReporter");
                            if (2 == i17 && (o76 = context.o7()) != null) {
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6950xc5df1c2e c6950xc5df1c2e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6950xc5df1c2e();
                                c6950xc5df1c2e2.f142552d = 2L;
                                c6950xc5df1c2e2.f142553e = 2L;
                                c6950xc5df1c2e2.f142554f = c6950xc5df1c2e2.b("ItemId", o76.f158811d, true);
                                c6950xc5df1c2e2.f142555g = c6950xc5df1c2e2.b("ItemSessionId", o76.f128809v, true);
                                c6950xc5df1c2e2.k();
                                break;
                            }
                        }
                        break;
                }
            } else {
                e1Var.f169370b = 3;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 o78 = context.o7();
                if (o78 != null) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6950xc5df1c2e c6950xc5df1c2e3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6950xc5df1c2e();
                    c6950xc5df1c2e3.f142552d = 1L;
                    c6950xc5df1c2e3.f142553e = 2L;
                    c6950xc5df1c2e3.f142554f = c6950xc5df1c2e3.b("ItemId", o78.f158811d, true);
                    c6950xc5df1c2e3.f142555g = c6950xc5df1c2e3.b("ItemSessionId", o78.f128809v, true);
                    c6950xc5df1c2e3.k();
                }
            }
            z17 = false;
        } else {
            z17 = false;
        }
        if (r26.i0.y(lifecycle, "onCreate", z17)) {
            m91.j jVar = m91.j.f406488a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(365, ui6.F7() ? 29 : 30);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lifecycle, "onDestroy")) {
            m91.j jVar2 = m91.j.f406488a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(365, ui6.F7() ? 26 : 27);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        }
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("finish", lifecycle)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + ui6.hashCode() + ' ' + ui6.getLocalClassName() + " finish, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + ui6.hashCode() + ' ' + ui6.getLocalClassName() + ' ' + lifecycle);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + ui6.hashCode() + ' ' + ui6.getClass().getSimpleName() + ' ' + lifecycle);
        }
    }
}

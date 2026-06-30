package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.task.e1 f89016a = new com.tencent.mm.plugin.appbrand.task.e1();

    public final void a(com.tencent.mm.plugin.appbrand.ui.AppBrandUI ui6, java.lang.String lifecycle) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC o76;
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        android.util.SparseArray sparseArray = com.tencent.mm.plugin.appbrand.report.e1.f87835c;
        com.tencent.mm.plugin.appbrand.report.e1 e1Var = null;
        if (ui6.isFinishing() || ui6.isDestroyed()) {
            com.tencent.mm.plugin.appbrand.report.e1.f87835c.remove(ui6.hashCode());
        } else if (ui6.F7()) {
            int hashCode = ui6.hashCode();
            android.util.SparseArray sparseArray2 = com.tencent.mm.plugin.appbrand.report.e1.f87835c;
            e1Var = (com.tencent.mm.plugin.appbrand.report.e1) sparseArray2.get(hashCode, null);
            if (e1Var == null) {
                e1Var = new com.tencent.mm.plugin.appbrand.report.e1(ui6);
                sparseArray2.put(hashCode, e1Var);
            }
        }
        if (e1Var != null) {
            boolean y17 = r26.i0.y(lifecycle, "onCreate", false);
            com.tencent.mm.plugin.appbrand.ui.AppBrandUI context = e1Var.f87836a;
            if (!y17) {
                switch (lifecycle.hashCode()) {
                    case -1401315045:
                        if (lifecycle.equals("onDestroy")) {
                            com.tencent.mm.plugin.appbrand.report.e1.f87835c.remove(context.hashCode());
                            break;
                        }
                        break;
                    case -1340212393:
                        if (lifecycle.equals("onPause")) {
                            e1Var.f87837b = 0;
                            com.tencent.mm.plugin.appbrand.report.d1 d1Var = new com.tencent.mm.plugin.appbrand.report.d1(e1Var);
                            kotlin.jvm.internal.o.g(context, "context");
                            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.oa(context, d1Var));
                            break;
                        }
                        break;
                    case -918269635:
                        if (lifecycle.equals("onNewIntent")) {
                            e1Var.f87837b = 4;
                            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC o77 = context.o7();
                            if (o77 != null) {
                                com.tencent.mm.autogen.mmdata.rpt.SwitchTaskStruct switchTaskStruct = new com.tencent.mm.autogen.mmdata.rpt.SwitchTaskStruct();
                                switchTaskStruct.f61019d = 1L;
                                switchTaskStruct.f61020e = 2L;
                                switchTaskStruct.f61021f = switchTaskStruct.b("ItemId", o77.f77278d, true);
                                switchTaskStruct.f61022g = switchTaskStruct.b("ItemSessionId", o77.f47276v, true);
                                switchTaskStruct.k();
                                break;
                            }
                        }
                        break;
                    case 1463983852:
                        if (lifecycle.equals("onResume")) {
                            ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.plugin.appbrand.report.c1(1), "AppBrandUIStandaloneTaskVisitReporter");
                            int i17 = e1Var.f87837b;
                            if (i17 <= 0) {
                                i17 = 2;
                            }
                            ((ku5.t0) ku5.t0.f312615d).b(new com.tencent.mm.plugin.appbrand.report.c1(i17), "AppBrandUIStandaloneTaskVisitReporter");
                            if (2 == i17 && (o76 = context.o7()) != null) {
                                com.tencent.mm.autogen.mmdata.rpt.SwitchTaskStruct switchTaskStruct2 = new com.tencent.mm.autogen.mmdata.rpt.SwitchTaskStruct();
                                switchTaskStruct2.f61019d = 2L;
                                switchTaskStruct2.f61020e = 2L;
                                switchTaskStruct2.f61021f = switchTaskStruct2.b("ItemId", o76.f77278d, true);
                                switchTaskStruct2.f61022g = switchTaskStruct2.b("ItemSessionId", o76.f47276v, true);
                                switchTaskStruct2.k();
                                break;
                            }
                        }
                        break;
                }
            } else {
                e1Var.f87837b = 3;
                com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC o78 = context.o7();
                if (o78 != null) {
                    com.tencent.mm.autogen.mmdata.rpt.SwitchTaskStruct switchTaskStruct3 = new com.tencent.mm.autogen.mmdata.rpt.SwitchTaskStruct();
                    switchTaskStruct3.f61019d = 1L;
                    switchTaskStruct3.f61020e = 2L;
                    switchTaskStruct3.f61021f = switchTaskStruct3.b("ItemId", o78.f77278d, true);
                    switchTaskStruct3.f61022g = switchTaskStruct3.b("ItemSessionId", o78.f47276v, true);
                    switchTaskStruct3.k();
                }
            }
            z17 = false;
        } else {
            z17 = false;
        }
        if (r26.i0.y(lifecycle, "onCreate", z17)) {
            m91.j jVar = m91.j.f324955a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(365, ui6.F7() ? 29 : 30);
            com.tencent.mars.xlog.Log.getLogLevel();
        } else if (kotlin.jvm.internal.o.b(lifecycle, "onDestroy")) {
            m91.j jVar2 = m91.j.f324955a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(365, ui6.F7() ? 26 : 27);
            com.tencent.mars.xlog.Log.getLogLevel();
        }
        try {
            if (kotlin.jvm.internal.o.b("finish", lifecycle)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + ui6.hashCode() + ' ' + ui6.getLocalClassName() + " finish, stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + ui6.hashCode() + ' ' + ui6.getLocalClassName() + ' ' + lifecycle);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUILifeCycleSpeedProfile", "onAppBrandLifeCycle " + ui6.hashCode() + ' ' + ui6.getClass().getSimpleName() + ' ' + lifecycle);
        }
    }
}

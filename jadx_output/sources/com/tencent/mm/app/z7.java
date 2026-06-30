package com.tencent.mm.app;

/* loaded from: classes11.dex */
public final class z7 implements uk5.f {
    @Override // uk5.f
    public void a(android.content.Intent intent) {
        java.lang.String str;
        if (intent == null || (str = intent.getStringExtra("MicroMsg.VAS.reportId")) == null) {
            str = "";
        }
        if (r26.n0.N(str)) {
            return;
        }
        java.util.Objects.toString(intent);
        r45.uw6 e17 = e(str);
        if (e17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - e17.f387709n;
            if (currentTimeMillis > 0) {
                e17.f387708m = currentTimeMillis;
            }
            com.tencent.mm.autogen.mmdata.rpt.VASPerformanceStruct vASPerformanceStruct = new com.tencent.mm.autogen.mmdata.rpt.VASPerformanceStruct();
            vASPerformanceStruct.f61541d = vASPerformanceStruct.b("SrcPageName", e17.f387702d, true);
            vASPerformanceStruct.f61542e = vASPerformanceStruct.b("DestPageName", e17.f387703e, true);
            vASPerformanceStruct.f61543f = e17.f387704f;
            vASPerformanceStruct.f61544g = e17.f387705g;
            vASPerformanceStruct.f61545h = e17.f387706h;
            vASPerformanceStruct.f61546i = e17.f387707i;
            vASPerformanceStruct.f61547j = e17.f387708m;
            vASPerformanceStruct.k();
            com.tencent.mm.app.a8 a8Var = com.tencent.mm.app.a8.f53329b;
            if (com.tencent.mars.xlog.Log.getLogLevel() <= 1) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(vASPerformanceStruct.g());
                java.lang.String n17 = vASPerformanceStruct.n();
                kotlin.jvm.internal.o.f(n17, "toShowString(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.VAS.WxVAS", "report%s %s", valueOf, r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
            }
            try {
                xs.j1 j1Var = (xs.j1) i95.n0.c(xs.j1.class);
                java.lang.String concat = "vasReport".concat(str);
                ((q04.r) j1Var).getClass();
                if (concat != null) {
                }
            } catch (java.lang.Throwable unused) {
            }
            if (intent != null) {
                intent.removeExtra("MicroMsg.VAS.reportId");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uk5.f
    public void b(android.content.Intent intent, android.content.Context context, boolean z17) {
        java.lang.String str;
        java.lang.String className;
        kotlin.jvm.internal.o.g(context, "context");
        if (intent == null) {
            return;
        }
        java.lang.String name = context.getClass().getName();
        android.content.ComponentName component = intent.getComponent();
        java.lang.String str2 = "";
        if (component == null || (str = component.getClassName()) == null) {
            str = "";
        }
        java.util.Set set = com.tencent.mm.app.a8.f53332e;
        int i17 = 0;
        if ((kz5.n0.O(set, name) || kz5.n0.O(set, str)) == true) {
            intent.toString();
            context.toString();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String valueOf = java.lang.String.valueOf(currentTimeMillis);
            intent.putExtra("MicroMsg.VAS.reportId", valueOf);
            r45.uw6 uw6Var = new r45.uw6();
            uw6Var.f387709n = currentTimeMillis;
            uw6Var.f387702d = context.getClass().getName();
            android.content.ComponentName component2 = intent.getComponent();
            if (component2 != null && (className = component2.getClassName()) != null) {
                str2 = className;
            }
            uw6Var.f387703e = str2;
            com.tencent.mm.ui.vas.VASActivity vASActivity = context instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context : null;
            if (vASActivity != null && vASActivity.isVASValid()) {
                i17 = 1;
            }
            uw6Var.f387704f = i17;
            uw6Var.f387705g = com.tencent.mm.ui.MMFragmentActivity.isVASActivity(intent) ? 1 : 0;
            f(uw6Var, valueOf);
        }
    }

    @Override // uk5.f
    public void c(android.content.Intent intent, long j17) {
        java.lang.String str;
        if (intent == null || (str = intent.getStringExtra("MicroMsg.VAS.reportId")) == null) {
            str = "";
        }
        if (r26.n0.N(str)) {
            return;
        }
        java.util.Objects.toString(intent);
        r45.uw6 e17 = e(str);
        if (e17 != null) {
            long j18 = j17 - e17.f387709n;
            if (j18 > 0) {
                e17.f387707i = j18;
            }
            f(e17, str);
        }
    }

    @Override // uk5.f
    public void d(android.content.Intent intent) {
        java.lang.String str;
        if (intent == null || (str = intent.getStringExtra("MicroMsg.VAS.reportId")) == null) {
            str = "";
        }
        if (r26.n0.N(str)) {
            return;
        }
        java.util.Objects.toString(intent);
        r45.uw6 e17 = e(str);
        if (e17 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - e17.f387709n;
            if (currentTimeMillis > 0) {
                e17.f387706h = currentTimeMillis;
            }
            f(e17, str);
        }
    }

    public final r45.uw6 e(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        try {
            return (r45.uw6) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(15, "vasReport".concat(id6));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final void f(r45.uw6 reportData, java.lang.String id6) {
        kotlin.jvm.internal.o.g(reportData, "reportData");
        kotlin.jvm.internal.o.g(id6, "id");
        try {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ui(15, "vasReport".concat(id6), reportData);
        } catch (java.lang.Throwable unused) {
        }
    }
}

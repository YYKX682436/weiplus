package com.p314xaae8f345.mm.app;

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
            long currentTimeMillis = java.lang.System.currentTimeMillis() - e17.f469242n;
            if (currentTimeMillis > 0) {
                e17.f469241m = currentTimeMillis;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6993x1b4e09fd c6993x1b4e09fd = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6993x1b4e09fd();
            c6993x1b4e09fd.f143074d = c6993x1b4e09fd.b("SrcPageName", e17.f469235d, true);
            c6993x1b4e09fd.f143075e = c6993x1b4e09fd.b("DestPageName", e17.f469236e, true);
            c6993x1b4e09fd.f143076f = e17.f469237f;
            c6993x1b4e09fd.f143077g = e17.f469238g;
            c6993x1b4e09fd.f143078h = e17.f469239h;
            c6993x1b4e09fd.f143079i = e17.f469240i;
            c6993x1b4e09fd.f143080j = e17.f469241m;
            c6993x1b4e09fd.k();
            com.p314xaae8f345.mm.app.a8 a8Var = com.p314xaae8f345.mm.app.a8.f134862b;
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(c6993x1b4e09fd.g());
                java.lang.String n17 = c6993x1b4e09fd.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VAS.WxVAS", "report%s %s", valueOf, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (intent == null) {
            return;
        }
        java.lang.String name = context.getClass().getName();
        android.content.ComponentName component = intent.getComponent();
        java.lang.String str2 = "";
        if (component == null || (str = component.getClassName()) == null) {
            str = "";
        }
        java.util.Set set = com.p314xaae8f345.mm.app.a8.f134865e;
        int i17 = 0;
        if ((kz5.n0.O(set, name) || kz5.n0.O(set, str)) == true) {
            intent.toString();
            context.toString();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String valueOf = java.lang.String.valueOf(currentTimeMillis);
            intent.putExtra("MicroMsg.VAS.reportId", valueOf);
            r45.uw6 uw6Var = new r45.uw6();
            uw6Var.f469242n = currentTimeMillis;
            uw6Var.f469235d = context.getClass().getName();
            android.content.ComponentName component2 = intent.getComponent();
            if (component2 != null && (className = component2.getClassName()) != null) {
                str2 = className;
            }
            uw6Var.f469236e = str2;
            com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context : null;
            if (abstractActivityC22579xbed01a37 != null && abstractActivityC22579xbed01a37.m81217xb3833cfe()) {
                i17 = 1;
            }
            uw6Var.f469237f = i17;
            uw6Var.f469238g = com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.m78729x75b0ecd(intent) ? 1 : 0;
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
            long j18 = j17 - e17.f469242n;
            if (j18 > 0) {
                e17.f469240i = j18;
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
            long currentTimeMillis = java.lang.System.currentTimeMillis() - e17.f469242n;
            if (currentTimeMillis > 0) {
                e17.f469239h = currentTimeMillis;
            }
            f(e17, str);
        }
    }

    public final r45.uw6 e(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        try {
            return (r45.uw6) ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).wi(15, "vasReport".concat(id6));
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    public final void f(r45.uw6 reportData, java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportData, "reportData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        try {
            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ui(15, "vasReport".concat(id6), reportData);
        } catch (java.lang.Throwable unused) {
        }
    }
}

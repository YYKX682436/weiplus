package com.tencent.mm.plugin.ball.service;

/* loaded from: classes14.dex */
public final class m implements gp1.s {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f93183c;

    /* renamed from: a, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.ball.service.l f93184a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f93185b;

    static {
        new com.tencent.mm.plugin.ball.service.k(null);
        f93183c = jz5.h.a(jz5.i.f302829d, com.tencent.mm.plugin.ball.service.j.f93172d);
    }

    @Override // gp1.s
    public void a(long j17, int i17) {
        if (this.f93185b == null) {
            this.f93185b = java.lang.Boolean.TRUE;
        }
        if (kotlin.jvm.internal.o.b(this.f93185b, java.lang.Boolean.FALSE)) {
            return;
        }
        if (this.f93184a == null) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20041, -1, 0, 0);
            return;
        }
        try {
            com.tencent.mm.plugin.ball.service.l lVar = this.f93184a;
            kotlin.jvm.internal.o.d(lVar);
            long j18 = j17 - lVar.f93180d;
            com.tencent.mm.plugin.ball.service.l lVar2 = this.f93184a;
            kotlin.jvm.internal.o.d(lVar2);
            if (lVar2.f93178b) {
                i17 = 4;
            } else {
                com.tencent.mm.plugin.ball.service.l lVar3 = this.f93184a;
                kotlin.jvm.internal.o.d(lVar3);
                if (!lVar3.f93179c) {
                    i17 = 3;
                }
            }
            kotlin.jvm.internal.o.d(this.f93184a);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            com.tencent.mm.plugin.ball.service.l lVar4 = this.f93184a;
            kotlin.jvm.internal.o.d(lVar4);
            g0Var.d(20041, 0, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(lVar4.f93177a));
            this.f93184a = null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallReportService", e17, "onEnterChattingFromNotification exception", new java.lang.Object[0]);
            this.f93184a = null;
        }
    }

    @Override // gp1.s
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallReportService", "markWechatForeground %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.f93184a = null;
    }

    @Override // gp1.s
    public void c(android.view.View view, java.util.Map map, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(view, "view");
        view.toString();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f485288h62);
        if (findViewById != null) {
            findViewById.hasOnClickListeners();
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        ((cy1.a) rVar).Mj(view);
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(view, "float_win_btn");
        if (l17 != null) {
            aVar.tk(view, l17.toString());
        }
        aVar.ik(view, 40, 33488);
        aVar.gk(view, map);
    }

    @Override // gp1.s
    public void d(int i17, boolean z17, boolean z18) {
        this.f93184a = new com.tencent.mm.plugin.ball.service.l(i17, z17, z18, java.lang.System.currentTimeMillis());
    }
}

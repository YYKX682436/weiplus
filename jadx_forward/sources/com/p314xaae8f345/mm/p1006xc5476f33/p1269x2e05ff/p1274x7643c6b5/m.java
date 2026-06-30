package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5;

/* loaded from: classes14.dex */
public final class m implements gp1.s {

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f174716c;

    /* renamed from: a, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.l f174717a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f174718b;

    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.k(null);
        f174716c = jz5.h.a(jz5.i.f384362d, com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.j.f174705d);
    }

    @Override // gp1.s
    public void a(long j17, int i17) {
        if (this.f174718b == null) {
            this.f174718b = java.lang.Boolean.TRUE;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f174718b, java.lang.Boolean.FALSE)) {
            return;
        }
        if (this.f174717a == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20041, -1, 0, 0);
            return;
        }
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.l lVar = this.f174717a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
            long j18 = j17 - lVar.f174713d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.l lVar2 = this.f174717a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar2);
            if (lVar2.f174711b) {
                i17 = 4;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.l lVar3 = this.f174717a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar3);
                if (!lVar3.f174712c) {
                    i17 = 3;
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f174717a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.l lVar4 = this.f174717a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar4);
            g0Var.d(20041, 0, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(lVar4.f174710a));
            this.f174717a = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallReportService", e17, "onEnterChattingFromNotification exception", new java.lang.Object[0]);
            this.f174717a = null;
        }
    }

    @Override // gp1.s
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallReportService", "markWechatForeground %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        this.f174717a = null;
    }

    @Override // gp1.s
    public void c(android.view.View view, java.util.Map map, java.lang.Long l17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        view.toString();
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f566821h62);
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
        this.f174717a = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.l(i17, z17, z18, java.lang.System.currentTimeMillis());
    }
}

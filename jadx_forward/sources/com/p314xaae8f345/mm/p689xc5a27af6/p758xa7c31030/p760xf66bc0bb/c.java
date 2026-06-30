package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

@j95.b
/* loaded from: classes9.dex */
public final class c extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.c f149210d;

    public static final void wi(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.c cVar) {
        cVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "check for state changed");
        for (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0 i0Var : ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.m.f149236a).values()) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z zVar = i0Var.f149226b;
            if (zVar != null) {
                jz5.g b17 = jz5.h.b(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.b(zVar));
                com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.u uVar = zVar.f149261c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uVar);
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                jz5.g gVar = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.u.f149247c;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.u.f149247c).mo141623x754a37bb();
                java.lang.String str = uVar.f149249b;
                long q17 = currentTimeMillis - o4Var.q(str, 0L);
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                boolean z17 = q17 >= java.util.concurrent.TimeUnit.HOURS.toMillis(uVar.f149248a);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "check " + str + " is expired: " + z17);
                if (z17 && ((java.lang.Boolean) ((jz5.n) b17).mo141623x754a37bb()).booleanValue()) {
                    ku5.u0 u0Var = ku5.t0.f394148d;
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.h0 h0Var = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.h0(i0Var);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    i0Var.f149231g = t0Var.k(h0Var, 0L);
                } else if (!((java.lang.Boolean) ((jz5.n) b17).mo141623x754a37bb()).booleanValue() && i0Var.f149227c) {
                    wu5.c cVar2 = i0Var.f149231g;
                    if (cVar2 != null) {
                        cVar2.cancel(true);
                    }
                    i0Var.f149231g = null;
                    ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.g0(i0Var, false));
                }
            }
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!ih.a.h("clicfg_mm_bg_task_scheduler_enable", z65.c.a())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "BgScheduler disabled");
            return;
        }
        try {
            com.p314xaae8f345.mm.vfs.a3.f294314a.b(-1L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, false);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BgScheduler", e17, e17.getMessage(), new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "onCreate");
        f149210d = this;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!ih.a.h("clicfg_mm_bg_task_scheduler_enable", z65.c.a())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "BgScheduler disabled");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "BgScheduler init");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.p()) {
            java.util.Map map = com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.m.f149236a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "forceCancelTask");
            for (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.i0 i0Var : ((java.util.LinkedHashMap) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.m.f149236a).values()) {
                wu5.c cVar = i0Var.f149231g;
                if (cVar != null) {
                    cVar.cancel(true);
                }
                i0Var.f149231g = null;
                ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.g0(i0Var, true));
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.a aVar = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.a(this);
            long millis = java.util.concurrent.TimeUnit.MINUTES.toMillis(30L);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(aVar, millis, null);
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5977xb82723fd>(a0Var) { // from class: com.tencent.mm.feature.performance.scheduler.BgSchedulerFeatureService$initRunOnPush$2
                {
                    this.f39173x3fe91575 = 1335927789;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5977xb82723fd c5977xb82723fd) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5977xb82723fd event = c5977xb82723fd;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BgScheduler", "check when device state changed, source = " + event.f136274g.f88140a);
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.c.wi(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.c.this);
                    return false;
                }
            }.mo48813x58998cd();
        }
    }
}

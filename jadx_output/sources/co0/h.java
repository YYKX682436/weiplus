package co0;

/* loaded from: classes3.dex */
public final class h implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.s f43718d;

    public h(co0.s sVar) {
        this.f43718d = sVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "onAppBackground setMute");
        co0.s sVar = this.f43718d;
        sVar.Z1 = true;
        if (sVar.g1()) {
            sVar.e1(true);
        }
        android.app.Activity X0 = sVar.X0(sVar.Q1);
        java.lang.String name = X0 != null ? X0.getClass().getName() : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "check hideMiniWindow: " + sVar.Z0() + " activity " + name);
        boolean z18 = false;
        if (sVar.Z0()) {
            try {
                if (!(sVar instanceof sn0.b) && name != null) {
                    fo0.o oVar = fo0.o.f264833a;
                    java.lang.String r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492396ge5);
                    kotlin.jvm.internal.o.f(r17, "getString(...)");
                    java.lang.String r18 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.ge6);
                    kotlin.jvm.internal.o.f(r18, "getString(...)");
                    java.lang.String r19 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f492396ge5);
                    kotlin.jvm.internal.o.f(r19, "getString(...)");
                    oVar.a(r17, r18, r19, name);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LiveCoreVisitor", "Try to start Live foreground service but failed. Activity name " + name + " exception: " + e17);
            }
            sVar.f420767p.getClass();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
            fo0.c cVar = fo0.c.f264798a;
            gp1.v vVar = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93136h;
            if (vVar != null) {
                vVar.B(false);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        tn0.k1 k1Var = sVar.f420770q;
        if (k1Var != null) {
            em2.w wVar = ((em2.p) k1Var).f255161a.f255169b;
            boolean z19 = !z17;
            wVar.getClass();
            if (zl2.r4.f473950a.w1() || wVar.f255181e <= 0) {
                return;
            }
            if (c01.id.c() - wVar.f255181e < 1000) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveMiniWindowReporter", "enterBackground in 1s, skip report enter and exit");
                z18 = true;
            } else {
                wVar.c(false);
            }
            wVar.f255178b = 1;
            wVar.f255177a = c01.id.c();
            wVar.f255182f = 0L;
            if (z19 && !z18) {
                wVar.b();
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMiniWindowReporter", "enterBackground shouldReportEnter:" + z19 + ", skipReport:" + z18);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppForeground cacheMute:");
        co0.s sVar = this.f43718d;
        sb6.append(sVar.Y1);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", sb6.toString());
        sVar.Z1 = false;
        if (sVar.Z0() && !(sVar instanceof sn0.b)) {
            fo0.o.f264833a.b();
        }
        if (sVar.g1()) {
            sVar.f1(sVar.Y1);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("check resumeMiniWindow: ");
        sb7.append(sVar.Z0());
        sb7.append(", ");
        kn0.p pVar = sVar.D;
        sb7.append(pVar.f());
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", sb7.toString());
        if (sVar.Z0() && pVar.f()) {
            sVar.f420767p.getClass();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
            fo0.c cVar = fo0.c.f264798a;
            gp1.v vVar = ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93136h;
            if (vVar != null) {
                vVar.E0(false);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        tn0.k1 k1Var = sVar.f420770q;
        if (k1Var != null) {
            em2.w wVar = ((em2.p) k1Var).f255161a.f255169b;
            boolean z18 = !z17;
            wVar.getClass();
            if (zl2.r4.f473950a.w1() || wVar.f255181e <= 0) {
                return;
            }
            if (z18) {
                wVar.c(false);
            }
            wVar.f255178b = 0;
            wVar.f255177a = c01.id.c();
            wVar.f255182f = 0L;
            wVar.b();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMiniWindowReporter", "enterForgound shouldReportExit:" + z18);
        }
    }
}

package co0;

/* loaded from: classes3.dex */
public final class h implements com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co0.s f125251d;

    public h(co0.s sVar) {
        this.f125251d = sVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "onAppBackground setMute");
        co0.s sVar = this.f125251d;
        sVar.Z1 = true;
        if (sVar.g1()) {
            sVar.e1(true);
        }
        android.app.Activity X0 = sVar.X0(sVar.Q1);
        java.lang.String name = X0 != null ? X0.getClass().getName() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", "check hideMiniWindow: " + sVar.Z0() + " activity " + name);
        boolean z18 = false;
        if (sVar.Z0()) {
            try {
                if (!(sVar instanceof sn0.b) && name != null) {
                    fo0.o oVar = fo0.o.f346366a;
                    java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573929ge5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
                    java.lang.String r18 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.ge6);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
                    java.lang.String r19 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f573929ge5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r19, "getString(...)");
                    oVar.a(r17, r18, r19, name);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiveCoreVisitor", "Try to start Live foreground service but failed. Activity name " + name + " exception: " + e17);
            }
            sVar.f502300p.getClass();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
            fo0.c cVar = fo0.c.f346331a;
            gp1.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174669h;
            if (vVar != null) {
                vVar.B(false);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        tn0.k1 k1Var = sVar.f502303q;
        if (k1Var != null) {
            em2.w wVar = ((em2.p) k1Var).f336694a.f336702b;
            boolean z19 = !z17;
            wVar.getClass();
            if (zl2.r4.f555483a.w1() || wVar.f336714e <= 0) {
                return;
            }
            if (c01.id.c() - wVar.f336714e < 1000) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMiniWindowReporter", "enterBackground in 1s, skip report enter and exit");
                z18 = true;
            } else {
                wVar.c(false);
            }
            wVar.f336711b = 1;
            wVar.f336710a = c01.id.c();
            wVar.f336715f = 0L;
            if (z19 && !z18) {
                wVar.b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMiniWindowReporter", "enterBackground shouldReportEnter:" + z19 + ", skipReport:" + z18);
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppForeground cacheMute:");
        co0.s sVar = this.f125251d;
        sb6.append(sVar.Y1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", sb6.toString());
        sVar.Z1 = false;
        if (sVar.Z0() && !(sVar instanceof sn0.b)) {
            fo0.o.f346366a.b();
        }
        if (sVar.g1()) {
            sVar.f1(sVar.Y1);
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("check resumeMiniWindow: ");
        sb7.append(sVar.Z0());
        sb7.append(", ");
        kn0.p pVar = sVar.D;
        sb7.append(pVar.f());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCoreVisitor", sb7.toString());
        if (sVar.Z0() && pVar.f()) {
            sVar.f502300p.getClass();
            ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
            fo0.c cVar = fo0.c.f346331a;
            gp1.v vVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.d) fo0.c.f346332b.f346340a).f174669h;
            if (vVar != null) {
                vVar.E0(false);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        tn0.k1 k1Var = sVar.f502303q;
        if (k1Var != null) {
            em2.w wVar = ((em2.p) k1Var).f336694a.f336702b;
            boolean z18 = !z17;
            wVar.getClass();
            if (zl2.r4.f555483a.w1() || wVar.f336714e <= 0) {
                return;
            }
            if (z18) {
                wVar.c(false);
            }
            wVar.f336711b = 0;
            wVar.f336710a = c01.id.c();
            wVar.f336715f = 0L;
            wVar.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMiniWindowReporter", "enterForgound shouldReportExit:" + z18);
        }
    }
}

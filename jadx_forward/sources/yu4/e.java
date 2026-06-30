package yu4;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu4.k f547402d;

    public e(yu4.k kVar) {
        this.f547402d = kVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        yu4.k kVar = this.f547402d;
        yu4.n nVar = kVar.f547419n;
        if (nVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f547431g, "dismiss dialog");
            com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = nVar.f547433i;
            java.lang.String m80970x134c2d56 = c22479x68a26381.m80970x134c2d56();
            r45.xi0 xi0Var = nVar.f547429e;
            xi0Var.f471653i = m80970x134c2d56;
            c22479x68a26381.d();
            c22479x68a26381.h();
            org.json.JSONObject mo12245xcc313de3 = xi0Var.mo12245xcc313de3();
            com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = ((com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.e) nVar.f547430f).f295188a;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v9 v9Var = dVar.C;
            if (v9Var != null) {
                v9Var.a(false, 0);
            }
            java.lang.Runnable runnable = dVar.M;
            if (runnable != null) {
                runnable.run();
                dVar.M = null;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6738x6897eb4 c6738x6897eb4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6738x6897eb4();
            c6738x6897eb4.f140720d = c6738x6897eb4.b("SessionId", mo12245xcc313de3.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984), true);
            c6738x6897eb4.f140722f = 99L;
            c6738x6897eb4.f140724h = java.lang.System.currentTimeMillis();
            c6738x6897eb4.k();
            ((xu4.e) ((ur.m) i95.n0.c(ur.m.class))).wi();
            nVar.f547435n.e();
            if (nVar.f547437p) {
                nVar.a().setBackgroundColor(0);
                nVar.a().getBackground().setAlpha(0);
                nVar.a().mo120153xd15cf999().B(0);
            }
            nVar.a().mo120173x7af55728("emojiWebSearchJSApi");
            nVar.a().mo52095x5cd39ffa();
        }
        yu4.o oVar = kVar.f547420o;
        if (oVar != null) {
            oVar.f547444i.e();
            boolean z17 = oVar.f547446n;
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.C19226x5a0e667d c19226x5a0e667d = oVar.f547445m;
            if (z17) {
                c19226x5a0e667d.mo120153xd15cf999().B(0);
            }
            c19226x5a0e667d.mo120173x7af55728("emojiWebSearchJSApi");
            c19226x5a0e667d.mo52095x5cd39ffa();
        }
    }
}

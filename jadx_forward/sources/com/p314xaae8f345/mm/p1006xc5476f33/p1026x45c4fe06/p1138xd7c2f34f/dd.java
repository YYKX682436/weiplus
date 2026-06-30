package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes14.dex */
public final class dd implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f166109a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bd f166110b;

    public dd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.bd bdVar) {
        this.f166110b = bdVar;
    }

    @Override // l81.e1
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandProcessDied");
        h(false);
    }

    @Override // l81.e1
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandPreconditionError");
        h(false);
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onTriggerHalfScreenShare, token: " + str);
    }

    @Override // l81.e1
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandUIEnter");
        h(true);
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onAppBrandUIExit, isFinish: " + z17);
    }

    @Override // l81.e1
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WeAppOpenActivityStartHelper", "onStartAppBrandUI");
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cd cdVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.cd(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(cdVar, 5000L, false);
    }

    public final void h(boolean z17) {
        if (this.f166109a.compareAndSet(false, true)) {
            dm1.o oVar = (dm1.o) this.f166110b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WmpfVoipCallInProxyActivity", "enterWxaVoipCallingPage for appId:" + oVar.f323194a + ", instanceId:" + oVar.f323195b + ", success:" + z17);
            oVar.f323196c.finish();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            if (h6Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).hj(this);
            }
        }
    }
}

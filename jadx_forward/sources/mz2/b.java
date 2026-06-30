package mz2;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e f414621d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f414622e;

    public b() {
        super(0);
        this.f414622e = false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e) abstractC20979x809547d1;
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CloseFingerPrintEventListener", "CloseFingerPrintEvent account is not ready");
            return false;
        }
        this.f414622e = false;
        if (!(c5274xb33ae62e instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e)) {
            return false;
        }
        this.f414621d = c5274xb33ae62e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CloseFingerPrintEventListener", "handle CloseFingerPrintEvent");
        gm0.j1.i();
        gm0.j1.n().f354821b.a(385, this);
        oz2.d dVar = new oz2.d(c5274xb33ae62e.f135598g.f87965a);
        gm0.j1.i();
        gm0.j1.n().f354821b.g(dVar);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof oz2.d) {
            am.e3 e3Var = new am.e3();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene return errcode " + i18 + " errmsg" + str);
            if (i17 == 0 && i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is success");
                e3Var.f88068a = 0;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CloseFingerPrintEventListener", "NetSceneTenpayCloseTouchPay doscene is fail");
                e3Var.f88068a = i18;
            }
            gm0.j1.i();
            gm0.j1.n().f354821b.q(385, this);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5274xb33ae62e c5274xb33ae62e = this.f414621d;
            c5274xb33ae62e.f135599h = e3Var;
            this.f414622e = true;
            java.lang.Runnable runnable = c5274xb33ae62e.f273897d;
            if (runnable != null) {
                runnable.run();
            }
            if (this.f414622e) {
                this.f414621d = null;
            }
        }
    }
}

package bk1;

/* loaded from: classes4.dex */
public final class c implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f102825d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12717x4aab1524 f102826e;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver$listener$1] */
    public c(im5.b lifeCycleKeeper, yz5.l onAuthorizeScopeModify) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAuthorizeScopeModify, "onAuthorizeScopeModify");
        this.f102825d = onAuthorizeScopeModify;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r07 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1199x556c354a.C12700x2c4114f4>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver$listener$1
            {
                this.f39173x3fe91575 = -784719901;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1199x556c354a.C12700x2c4114f4 c12700x2c4114f4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1199x556c354a.C12700x2c4114f4 event = c12700x2c4114f4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                ((ku5.t0) ku5.t0.f394148d).B(new bk1.b(bk1.c.this, event));
                return true;
            }
        };
        this.f102826e = r07;
        lifeCycleKeeper.mo46316x322b85(this);
        r07.mo48813x58998cd();
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAuthorizeScopeModifyObserver", "dead");
        mo48814x2efc64();
    }
}

package bk1;

/* loaded from: classes4.dex */
public final class c implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f21292d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver$listener$1 f21293e;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver$listener$1] */
    public c(im5.b lifeCycleKeeper, yz5.l onAuthorizeScopeModify) {
        kotlin.jvm.internal.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        kotlin.jvm.internal.o.g(onAuthorizeScopeModify, "onAuthorizeScopeModify");
        this.f21292d = onAuthorizeScopeModify;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r07 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver$listener$1
            {
                this.__eventId = -784719901;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent onWxaAuthorizeScopeModifyEvent) {
                com.tencent.mm.plugin.appbrand.ui.authrize.OnWxaAuthorizeScopeModifyEvent event = onWxaAuthorizeScopeModifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                ((ku5.t0) ku5.t0.f312615d).B(new bk1.b(bk1.c.this, event));
                return true;
            }
        };
        this.f21293e = r07;
        lifeCycleKeeper.keep(this);
        r07.alive();
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeScopeModifyObserver", "dead");
        dead();
    }
}

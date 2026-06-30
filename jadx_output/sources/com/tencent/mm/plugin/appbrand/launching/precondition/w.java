package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public class w extends android.content.ContextWrapper implements com.tencent.mm.plugin.appbrand.launching.precondition.y {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f85027h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f85028d;

    /* renamed from: e, reason: collision with root package name */
    public int f85029e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f85030f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.launching.precondition.s f85031g;

    public w(com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI appBrandLaunchProxyUI) {
        super(appBrandLaunchProxyUI);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f85028d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.launching.precondition.FromMMProxyUI$1
            {
                this.__eventId = 551436157;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.plugin.appbrand.service.AppBrandUIEnterAnimationCompleteEvent appBrandUIEnterAnimationCompleteEvent) {
                int i17 = com.tencent.mm.plugin.appbrand.launching.precondition.w.f85027h;
                com.tencent.mm.plugin.appbrand.launching.precondition.w wVar = com.tencent.mm.plugin.appbrand.launching.precondition.w.this;
                com.tencent.mm.plugin.appbrand.launching.precondition.s sVar = wVar.f85031g;
                if (sVar != null && !sVar.f84935e) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FromMMProxyUI", "reason[%s] process[%s] isFinished, just finish activity", "AppBrand_onEnterAnimationComplete", wVar.f85030f);
                wVar.getBaseContext().finish();
                return false;
            }
        };
        this.f85029e = 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public void a(android.content.Intent intent, android.os.Bundle bundle) {
        com.tencent.mm.ui.v9.e(getBaseContext().getWindow());
        com.tencent.mm.ui.v9.c(getBaseContext().getWindow(), true);
        java.lang.String stringExtra = intent.getStringExtra("extra_entry_token");
        com.tencent.mm.plugin.appbrand.launching.precondition.s l17 = com.tencent.mm.plugin.appbrand.launching.precondition.s.l(stringExtra);
        if (l17 == null) {
            getBaseContext().finish();
            return;
        }
        getBaseContext().overridePendingTransition(0, 0);
        l17.setBaseContext(getBaseContext());
        this.f85030f = stringExtra;
        this.f85031g = l17;
        this.f85028d.alive();
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public boolean b() {
        return true;
    }

    @Override // android.content.ContextWrapper
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI getBaseContext() {
        return (com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) super.getBaseContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public void onDestroy() {
        this.f85028d.dead();
        com.tencent.mm.plugin.appbrand.launching.precondition.s sVar = this.f85031g;
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public void onPause() {
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.precondition.y
    public void onResume() {
        int i17 = this.f85029e + 1;
        this.f85029e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FromMMProxyUI", "onResume, resume count:%d", java.lang.Integer.valueOf(i17));
        if (this.f85029e > 1) {
            com.tencent.mm.plugin.appbrand.launching.precondition.s sVar = this.f85031g;
            if (sVar == null || sVar.f84935e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FromMMProxyUI", "reason[%s] process[%s] isFinished, just finish activity", "NotFirstResume", this.f85030f);
                getBaseContext().finish();
            }
        }
    }
}

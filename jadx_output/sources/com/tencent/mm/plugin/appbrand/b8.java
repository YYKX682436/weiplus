package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class b8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent f76771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$35 f76772e;

    public b8(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$35 appBrandRuntimeWC$35, com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent notifyWxaCommLibUpdatedEvent) {
        this.f76772e = appBrandRuntimeWC$35;
        this.f76771d = notifyWxaCommLibUpdatedEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f76772e.f74867d;
        com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult updateResult = this.f76771d.f75373g;
        updateResult.getClass();
        boolean z17 = updateResult instanceof com.tencent.mm.plugin.appbrand.appcache.NotifyWxaCommLibUpdatedEvent.UpdateResult.Succeed;
        android.app.Activity r07 = o6Var.r0();
        if (r07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForCommLibUpdated(rt:%s, isUpdateSucceed:%b), get NULL activity", o6Var, java.lang.Boolean.valueOf(z17));
            return;
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(r07);
            i0Var.d(com.tencent.mm.R.string.a0c);
            i0Var.f(com.tencent.mm.R.string.a0a);
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            aVar.A = false;
            aVar.E = new com.tencent.mm.plugin.appbrand.af(o6Var);
            i0Var.h();
            return;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var2 = new com.tencent.mm.ui.widget.dialog.i0(r07);
        i0Var2.d(com.tencent.mm.R.string.a0b);
        i0Var2.f(com.tencent.mm.R.string.a0a);
        com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var2.f211821b;
        aVar2.A = false;
        aVar2.E = new com.tencent.mm.plugin.appbrand.bf(o6Var);
        i0Var2.h();
    }
}

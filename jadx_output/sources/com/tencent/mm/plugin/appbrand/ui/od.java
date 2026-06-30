package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes.dex */
public final class od extends com.tencent.mm.sdk.event.n {
    public od() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.ui.launcher.LauncherUIRegistry$LauncherUIMoveTaskToBackEvent event = (com.tencent.mm.ui.launcher.LauncherUIRegistry$LauncherUIMoveTaskToBackEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIMoveTaskToBackGuardLogic", "LauncherUI moveTaskToBack " + event.f209074g + ", invoke onMMTaskToFront");
        com.tencent.mm.plugin.appbrand.ui.w9.f90315b.post(com.tencent.mm.plugin.appbrand.ui.nd.f89891d);
        return false;
    }
}

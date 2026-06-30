package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class qc extends com.tencent.mm.plugin.appbrand.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.uc f89965c;

    public qc(com.tencent.mm.plugin.appbrand.ui.uc ucVar) {
        this.f89965c = ucVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.oc
    public boolean a(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.appbrand.o6 runtime = this.f89965c.getRuntime();
        boolean z17 = false;
        if (runtime == null) {
            return false;
        }
        if (keyEvent != null && 1 == keyEvent.getAction()) {
            z17 = true;
        }
        if (z17) {
            if (runtime.J0()) {
                com.tencent.mm.plugin.appbrand.ui.pc pcVar = new com.tencent.mm.plugin.appbrand.ui.pc(this.f89965c);
                java.lang.String str = runtime.f74803n;
                kotlin.jvm.internal.o.f(str, "getAppId(...)");
                cf.m mVar = new cf.m(str);
                pcVar.invoke(mVar);
                runtime.N.a(mVar);
                runtime.S();
            } else {
                runtime.l0();
            }
        }
        return true;
    }
}

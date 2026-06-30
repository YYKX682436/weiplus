package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class f8 implements zk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandUI f89708a;

    public f8(com.tencent.mm.plugin.appbrand.ui.AppBrandUI appBrandUI) {
        this.f89708a = appBrandUI;
    }

    @Override // zk3.b
    public java.lang.Object a() {
        rh1.c V2;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime activeRuntime = this.f89708a.q7().getActiveRuntime();
        if (!(activeRuntime instanceof com.tencent.mm.plugin.appbrand.o6) || (V2 = ((com.tencent.mm.plugin.appbrand.o6) activeRuntime).V2()) == null) {
            return null;
        }
        return V2.f300077a;
    }

    @Override // zk3.b
    public boolean b() {
        if (this.f89708a.q7().getActiveRuntime() instanceof com.tencent.mm.plugin.appbrand.o6) {
            return !((com.tencent.mm.plugin.appbrand.o6) r0).q2();
        }
        return true;
    }
}

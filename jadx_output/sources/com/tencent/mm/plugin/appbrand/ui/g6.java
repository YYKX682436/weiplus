package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class g6 extends com.tencent.mm.plugin.appbrand.uc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI f89728a;

    public g6(com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI appBrandPluginUI) {
        this.f89728a = appBrandPluginUI;
    }

    @Override // com.tencent.mm.plugin.appbrand.tc
    public void d(int i17, float f17) {
        if (1 == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPluginUI", "load convertActivityToTranslucent");
            db5.f.c(this.f89728a, null);
        }
    }
}

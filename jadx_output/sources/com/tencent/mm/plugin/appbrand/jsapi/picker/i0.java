package com.tencent.mm.plugin.appbrand.jsapi.picker;

/* loaded from: classes15.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.picker.k0 f82737d;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.picker.k0 k0Var) {
        this.f82737d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.picker.k0 k0Var = this.f82737d;
        com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePickerV2 appBrandTimePickerV2 = (com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePickerV2) k0Var.c(com.tencent.mm.plugin.appbrand.widget.picker.AppBrandTimePickerV2.class);
        if (appBrandTimePickerV2 == null) {
            k0Var.d("fail cant init view", null);
            return;
        }
        tl1.b bVar = k0Var.f420200d;
        appBrandTimePickerV2.setMinTime(k0Var.f82745m, k0Var.f82746n);
        appBrandTimePickerV2.setMaxTime(k0Var.f82747o, k0Var.f82748p);
        appBrandTimePickerV2.init(k0Var.f82749q, k0Var.f82750r);
        bVar.setOnResultListener(new com.tencent.mm.plugin.appbrand.jsapi.picker.j0(k0Var));
        bVar.setHeader(k0Var.f82744h);
        bVar.i();
    }
}

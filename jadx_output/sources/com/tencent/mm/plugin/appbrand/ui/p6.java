package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class p6 implements k01.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w6 f89919a;

    public p6(com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI, com.tencent.mm.plugin.appbrand.ui.w6 w6Var) {
        this.f89919a = w6Var;
    }

    @Override // k01.s0
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessShareMessageProxyUI", "onLoadImageResult, result:%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.ui.w6 w6Var = this.f89919a;
        w6Var.f90304d = true;
        if (w6Var.f90303c) {
            com.tencent.mm.sdk.platformtools.u3.l(w6Var.f90309i);
            w6Var.a();
        }
    }
}

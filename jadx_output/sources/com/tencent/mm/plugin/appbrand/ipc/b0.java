package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes5.dex */
public class b0 implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.c0 f78397a;

    public b0(com.tencent.mm.plugin.appbrand.ipc.c0 c0Var) {
        this.f78397a = c0Var;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI = this.f78397a.f78399a;
        dp.a.makeText(appBrandTaskProxyUI, appBrandTaskProxyUI.getString(com.tencent.mm.R.string.jzm, q75.c.c(str2)), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.appbrand.ipc.AppBrandTaskProxyUI appBrandTaskProxyUI = this.f78397a.f78399a;
        dp.a.makeText(appBrandTaskProxyUI, appBrandTaskProxyUI.getString(com.tencent.mm.R.string.jzl), 1).show();
    }
}

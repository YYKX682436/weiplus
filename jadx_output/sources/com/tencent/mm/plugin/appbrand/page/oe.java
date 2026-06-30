package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class oe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.u0 f86976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86977e;

    public oe(com.tencent.mm.plugin.appbrand.menu.u0 u0Var, java.lang.String str) {
        this.f86976d = u0Var;
        this.f86977e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.menu.u0 u0Var = this.f86976d;
        if (u0Var != null) {
            u0Var.f85996d.k("share_to_user", this.f86977e);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.WxaMenuHelper", "safeSetString, menuInfo is null, key: share_to_user");
        }
    }
}

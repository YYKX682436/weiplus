package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.t2 f85193d;

    public d(com.tencent.mm.plugin.appbrand.appusage.t2 t2Var) {
        this.f85193d = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.launching.teenmode.k kVar = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85200a;
        com.tencent.mm.plugin.appbrand.appusage.t2 t2Var = this.f85193d;
        java.lang.String str = t2Var.field_username;
        int i17 = t2Var.field_versionType;
        if (!(str == null || str.length() == 0)) {
            java.util.HashMap hashMap = com.tencent.mm.plugin.appbrand.launching.teenmode.k.f85201b;
            hashMap.remove(kVar.b(str, i17));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeReporter", "removeCollection %s, %d, %d", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(hashMap.size()));
        }
        com.tencent.mm.plugin.appbrand.launching.teenmode.k.c(t2Var.field_username);
    }
}

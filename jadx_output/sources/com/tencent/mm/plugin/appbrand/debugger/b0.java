package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public final class b0 implements com.tencent.mm.plugin.appbrand.appcache.y9, com.tencent.mm.plugin.appbrand.debugger.e {
    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("appId");
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            return;
        }
        int intExtra = intent.getIntExtra("versionType", 0);
        com.tencent.mm.plugin.appbrand.task.u0 C = com.tencent.mm.plugin.appbrand.task.u0.C();
        java.util.Objects.requireNonNull(stringExtra);
        C.s(stringExtra, intExtra);
    }

    @Override // com.tencent.mm.plugin.appbrand.appcache.y9
    public boolean b(java.lang.String str, java.util.Map map) {
        if (!com.tencent.mm.plugin.appbrand.debugger.DebuggerShell.f77584d) {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z65.c.a()) {
                return false;
            }
        }
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.AppBrandForceKill.AppId");
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map.get(".sysmsg.AppBrandForceKill.VersionType"), 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.task.u0.C().s(str3, P);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public java.lang.String name() {
        return "ForceKillAppNotify";
    }
}

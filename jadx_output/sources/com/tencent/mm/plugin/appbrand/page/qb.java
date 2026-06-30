package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class qb {
    public qb(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String j17 = u46.l.j(new java.lang.String[]{appId, org.chromium.base.BaseSwitches.V + i17}, '-');
        kotlin.jvm.internal.o.f(j17, "join(...)");
        return j17;
    }

    public final java.lang.String b(int i17) {
        java.lang.String j17 = u46.l.j(new java.lang.String[]{com.tencent.xwebsdk.BuildConfig.INSTALL_TYPE, org.chromium.base.BaseSwitches.V + i17}, '-');
        kotlin.jvm.internal.o.f(j17, "join(...)");
        return j17;
    }

    public final java.lang.String c() {
        java.lang.String str = com.tencent.mm.plugin.appbrand.page.sb.f87091d + "page_scripts";
        com.tencent.mm.vfs.w6.u(str);
        return str;
    }
}

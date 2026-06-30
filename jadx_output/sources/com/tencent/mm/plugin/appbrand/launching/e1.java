package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class e1 extends com.tencent.mm.plugin.appbrand.launching.u8 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r1 f84583g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.appbrand.launching.r1 r1Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.launching.n1 n1Var) {
        super(appBrandRuntime, n1Var);
        this.f84583g = r1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.u8, im5.a
    public void dead() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dead() hash=");
        sb6.append(hashCode());
        sb6.append(", appId:");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f85230d;
        sb6.append(appBrandRuntime != null ? appBrandRuntime.f74803n : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LaunchPrepareCallbackWrapper", sb6.toString());
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f85230d;
        if (appBrandRuntime2 != null) {
            appBrandRuntime2.n2(this);
        }
        this.f85230d = null;
        this.f85231e = null;
        this.f85232f = true;
        if (this.f84583g.f85095d != null) {
            com.tencent.mm.ipcinvoker.extension.l.c(this.f84583g.f85095d);
            this.f84583g.f85095d = null;
        }
    }
}

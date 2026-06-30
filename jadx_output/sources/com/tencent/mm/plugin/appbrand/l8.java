package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class l8 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f84234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84235e;

    public l8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        this.f84235e = o6Var;
        this.f84234d = appBrandInitConfig;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.BACKGROUND == bVar) {
            this.f84235e.N.c(this);
            final com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig = this.f84234d;
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.l8$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.l8 l8Var = com.tencent.mm.plugin.appbrand.l8.this;
                    l8Var.getClass();
                    l8Var.f84235e.o3((com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) appBrandInitConfig, com.tencent.mm.plugin.appbrand.s8.CrossNavStackBack);
                }
            });
        }
    }
}

package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class k8 implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig f84068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f84069e;

    public k8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        this.f84069e = o6Var;
        this.f84068d = appBrandInitConfig;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.BACKGROUND == bVar) {
            this.f84069e.N.c(this);
            this.f84069e.U1(this.f84068d);
        }
    }
}

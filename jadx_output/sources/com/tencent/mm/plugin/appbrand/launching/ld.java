package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ld extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.e1 f84775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle f84776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(l81.e1 e1Var, com.tencent.mm.plugin.appbrand.api.WeAppExportLaunchInfoBundle weAppExportLaunchInfoBundle) {
        super(0);
        this.f84775d = e1Var;
        this.f84776e = weAppExportLaunchInfoBundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f84775d.c(this.f84776e);
        return jz5.f0.f302826a;
    }
}

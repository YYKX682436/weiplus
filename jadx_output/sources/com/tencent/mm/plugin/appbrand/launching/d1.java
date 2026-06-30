package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class d1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.r1 f84563d;

    public d1(com.tencent.mm.plugin.appbrand.launching.r1 r1Var) {
        this.f84563d = r1Var;
        r1Var.f85095d = this;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        try {
            com.tencent.mm.plugin.appbrand.launching.r1.a(this.f84563d, (com.tencent.mm.plugin.appbrand.launching.AppBrandPrepareTask$PrepareResult) obj);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.launching.c1(this, th6));
        }
    }
}

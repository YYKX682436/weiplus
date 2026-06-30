package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class u8 extends com.tencent.mm.plugin.appbrand.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.a6 f89275b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.launching.r1 f89276c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f89277d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f89278e;

    public u8(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.a6 a6Var) {
        this.f89278e = o6Var;
        this.f89275b = a6Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void a() {
        this.f89277d = true;
        com.tencent.mm.plugin.appbrand.launching.r1 r1Var = this.f89276c;
        if (r1Var != null) {
            r1Var.b();
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public java.lang.String b() {
        return "ResourcePrepareProcess";
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public void c() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f89278e;
        o6Var.K("ResourcePrepareProcess.prepare()", new java.lang.Object[0]);
        com.tencent.mm.plugin.appbrand.launching.d2.a(o6Var, new com.tencent.mm.plugin.appbrand.t8(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.g3
    public boolean e() {
        return false;
    }
}

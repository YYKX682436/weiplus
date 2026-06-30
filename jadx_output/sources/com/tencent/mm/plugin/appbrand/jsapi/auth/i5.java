package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class i5 implements com.tencent.mm.plugin.appbrand.jsapi.auth.v4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.v4 f79591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j5 f79592b;

    public i5(com.tencent.mm.plugin.appbrand.jsapi.auth.v4 v4Var, com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var) {
        this.f79591a = v4Var;
        this.f79592b = j5Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.v4
    public void a() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.v4 v4Var = this.f79591a;
        if (v4Var != null) {
            v4Var.a();
        }
        this.f79592b.g(true);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.v4
    public void b(java.lang.String plateNo) {
        kotlin.jvm.internal.o.g(plateNo, "plateNo");
        com.tencent.mm.plugin.appbrand.jsapi.auth.v4 v4Var = this.f79591a;
        if (v4Var != null) {
            v4Var.b(plateNo);
        }
        this.f79592b.g(true);
    }
}

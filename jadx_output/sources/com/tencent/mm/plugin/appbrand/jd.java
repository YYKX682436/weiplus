package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class jd implements com.tencent.mm.plugin.appbrand.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f78482a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.md f78483b;

    public jd(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.md mdVar) {
        this.f78482a = o6Var;
        this.f78483b = mdVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.e3
    public final void a() {
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f78482a;
        o6Var.x0().post(new com.tencent.mm.plugin.appbrand.id(o6Var, this.f78483b));
    }
}

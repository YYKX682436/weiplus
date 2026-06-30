package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
public abstract class f extends com.tencent.mm.plugin.emoji.model.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f97545d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.g f97546e;

    public f(boolean z17) {
        this.f97545d = z17;
        this.f97546e = new com.tencent.mm.plugin.emoji.model.g(z17);
    }

    @Override // ir.t0
    public ir.k0 a() {
        return new com.tencent.mm.plugin.emoji.model.g(this.f97545d);
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f97546e;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        com.tencent.mm.plugin.emoji.model.g gVar = (com.tencent.mm.plugin.emoji.model.g) k0Var;
        kotlin.jvm.internal.o.g(gVar, "<set-?>");
        this.f97546e = gVar;
    }

    @Override // com.tencent.mm.plugin.emoji.model.a
    public void i(boolean z17) {
        this.f97545d = z17;
    }
}

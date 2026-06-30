package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
public abstract class d extends com.tencent.mm.plugin.emoji.model.a {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.e f97542d = new com.tencent.mm.plugin.emoji.model.e();

    @Override // ir.t0
    public ir.k0 a() {
        return new com.tencent.mm.plugin.emoji.model.e();
    }

    @Override // ir.t0
    public ir.k0 b() {
        return this.f97542d;
    }

    @Override // ir.t0
    public void f(ir.k0 k0Var) {
        com.tencent.mm.plugin.emoji.model.e eVar = (com.tencent.mm.plugin.emoji.model.e) k0Var;
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.f97542d = eVar;
    }
}

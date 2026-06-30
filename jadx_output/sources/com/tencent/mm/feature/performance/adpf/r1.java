package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.x1 f67472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.x0 f67473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.feature.performance.adpf.x1 x1Var, com.tencent.mm.feature.performance.adpf.x0 x0Var) {
        super(0);
        this.f67472d = x1Var;
        this.f67473e = x0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List f17 = this.f67472d.f();
        com.tencent.mm.feature.performance.adpf.x1 x1Var = this.f67472d;
        com.tencent.mm.feature.performance.adpf.x0 x0Var = this.f67473e;
        synchronized (f17) {
            for (ob0.e eVar : x1Var.f()) {
                if (eVar instanceof com.tencent.mm.feature.performance.adpf.b) {
                    ((com.tencent.mm.feature.performance.adpf.b) eVar).j(x0Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

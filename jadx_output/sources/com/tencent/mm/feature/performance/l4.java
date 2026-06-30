package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class l4 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.r4 f67603b;

    public l4(com.tencent.mm.feature.performance.r4 r4Var) {
        this.f67603b = r4Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        java.util.Map a17 = com.tencent.mm.feature.performance.l3.a(com.tencent.mm.feature.performance.r4.f67658h);
        com.tencent.mm.feature.performance.r4 r4Var = this.f67603b;
        synchronized (a17) {
            if (!com.tencent.mm.feature.performance.l3.a(r0).isEmpty()) {
                ((com.tencent.mm.feature.performance.m3) r4Var.f67664f.getValue()).a();
                ((com.tencent.mm.feature.performance.m3) r4Var.f67665g.getValue()).a();
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mm.feature.performance.r4 r4Var = this.f67603b;
        com.tencent.mm.feature.performance.m3 m3Var = (com.tencent.mm.feature.performance.m3) r4Var.f67664f.getValue();
        m3Var.getClass();
        jz5.g gVar = com.tencent.mm.feature.performance.r4.f67659i;
        ((android.os.Handler) ((jz5.n) gVar).getValue()).removeCallbacks(m3Var);
        com.tencent.mm.feature.performance.m3 m3Var2 = (com.tencent.mm.feature.performance.m3) r4Var.f67665g.getValue();
        m3Var2.getClass();
        ((android.os.Handler) ((jz5.n) gVar).getValue()).removeCallbacks(m3Var2);
    }
}

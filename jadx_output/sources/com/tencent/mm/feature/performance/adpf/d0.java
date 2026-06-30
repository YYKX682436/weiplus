package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f67410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f67410d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue > 0 && intValue <= 6) {
            com.tencent.mm.feature.performance.adpf.k2 k2Var = com.tencent.mm.feature.performance.adpf.IAdpfState.Companion;
            k2Var.d(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_THERMAL_HIGH).toggle(intValue >= 4, new com.tencent.mm.feature.performance.adpf.b0(intValue));
            k2Var.d(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_THERMAL_HIGH_CRITICAL).toggle(intValue >= 5, new com.tencent.mm.feature.performance.adpf.c0(intValue, this.f67410d));
        }
        return jz5.f0.f302826a;
    }
}

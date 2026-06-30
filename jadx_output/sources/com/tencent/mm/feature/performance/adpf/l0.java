package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.g f67443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.g f67444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(jz5.g gVar, jz5.g gVar2) {
        super(1);
        this.f67443d = gVar;
        this.f67444e = gVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (1 <= intValue && intValue < 1000) {
            ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) this.f67443d.getValue()).toggle(intValue > 430, new com.tencent.mm.feature.performance.adpf.j0(intValue));
            return java.lang.Boolean.valueOf(((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) this.f67444e.getValue()).toggle(intValue > 450, new com.tencent.mm.feature.performance.adpf.k0(intValue)));
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AdpfFeatureService", "battery temp err: " + intValue);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.g f67427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(jz5.g gVar) {
        super(1);
        this.f67427d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        if (intValue >= 0 && intValue < 101) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "battery level: %s", java.lang.Integer.valueOf(intValue));
            jz5.g gVar = this.f67427d;
            return java.lang.Boolean.valueOf(intValue > 30 ? ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).turnOffSync() : ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).turnOnSync());
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AdpfFeatureService", "battery level err: " + intValue);
        return jz5.f0.f302826a;
    }
}

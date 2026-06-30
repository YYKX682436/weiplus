package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.g f67455d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(jz5.g gVar) {
        super(1);
        this.f67455d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.g gVar = this.f67455d;
        if (booleanValue) {
            if (!((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).active()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "powerSaveMode on");
                ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).turnOnSync();
            }
        } else if (((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).active()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", "powerSaveMode off");
            ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).turnOffSync();
        }
        return jz5.f0.f302826a;
    }
}

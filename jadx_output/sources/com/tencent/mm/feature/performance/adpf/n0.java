package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.g f67451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(jz5.g gVar) {
        super(1);
        this.f67451d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.g gVar = this.f67451d;
        if (booleanValue != ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).active()) {
            ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) gVar.getValue()).toggle(booleanValue, com.tencent.mm.feature.performance.adpf.m0.f67448d);
        }
        return jz5.f0.f302826a;
    }
}

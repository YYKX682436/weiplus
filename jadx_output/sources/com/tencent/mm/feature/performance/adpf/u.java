package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class u extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f67493b = jz5.h.b(com.tencent.mm.feature.performance.adpf.t.f67489d);

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) this.f67493b).getValue()).turnOffSync();
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState.IMutableAdpfState) ((jz5.n) this.f67493b).getValue()).turnOnSync();
    }
}

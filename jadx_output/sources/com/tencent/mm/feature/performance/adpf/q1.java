package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class q1 extends com.tencent.mm.feature.performance.adpf.x1 implements com.tencent.matrix.lifecycle.k {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f67467m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f67468n;

    /* JADX WARN: Multi-variable type inference failed */
    public q1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public com.tencent.mm.feature.performance.adpf.x0 c(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67468n).getValue()).active() ? new com.tencent.mm.feature.performance.adpf.x0(3, source, "idle-charging") : new com.tencent.mm.feature.performance.adpf.x0(1, source, null, 4, null);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public java.util.List d() {
        return this.f67467m;
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void h() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67468n).getValue()).removeObserver(this);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void k() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67468n).getValue()).observeForever(this);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        g(this.f67511d);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        g(this.f67511d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(java.util.List<java.lang.String> bindingUiList) {
        super("SchedIdle", bindingUiList);
        kotlin.jvm.internal.o.g(bindingUiList, "bindingUiList");
        this.f67467m = bindingUiList;
        this.f67468n = jz5.h.b(com.tencent.mm.feature.performance.adpf.p1.f67463d);
    }

    public /* synthetic */ q1(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list);
    }
}

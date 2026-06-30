package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class j1 extends com.tencent.mm.feature.performance.adpf.x1 implements com.tencent.matrix.lifecycle.k {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f67432m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f67433n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f67434o;

    /* JADX WARN: Multi-variable type inference failed */
    public j1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public com.tencent.mm.feature.performance.adpf.x0 c(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        jz5.g gVar = this.f67433n;
        if (((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) gVar).getValue()).active() || ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67434o).getValue()).active()) {
            return new com.tencent.mm.feature.performance.adpf.x0(2, source, ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) gVar).getValue()).active() ? "fg" : "idle-charging");
        }
        return new com.tencent.mm.feature.performance.adpf.x0(1, source, null, 4, null);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public java.util.List d() {
        return this.f67432m;
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void h() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67433n).getValue()).removeObserver(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67434o).getValue()).removeObserver(this);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void k() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67433n).getValue()).observeForever(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67434o).getValue()).observeForever(this);
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
    public j1(java.util.List<java.lang.String> bindingUiList) {
        super("SchedCritical", bindingUiList);
        kotlin.jvm.internal.o.g(bindingUiList, "bindingUiList");
        this.f67432m = bindingUiList;
        this.f67433n = jz5.h.b(com.tencent.mm.feature.performance.adpf.h1.f67425d);
        this.f67434o = jz5.h.b(com.tencent.mm.feature.performance.adpf.i1.f67428d);
    }

    public /* synthetic */ j1(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list);
    }
}

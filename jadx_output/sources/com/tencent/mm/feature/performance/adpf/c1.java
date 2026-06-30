package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class c1 extends com.tencent.mm.feature.performance.adpf.x1 implements com.tencent.matrix.lifecycle.k {

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f67404m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f67405n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f67406o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f67407p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f67408q;

    /* JADX WARN: Multi-variable type inference failed */
    public c1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public com.tencent.mm.feature.performance.adpf.x0 c(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67405n).getValue()).active() ? a() ? new com.tencent.mm.feature.performance.adpf.x0(2, source, "bounded") : ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67407p).getValue()).active() ? new com.tencent.mm.feature.performance.adpf.x0(1, source, "emergency") : ((com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner) ((jz5.n) this.f67406o).getValue()).active() ? new com.tencent.mm.feature.performance.adpf.x0(3, source, "restricted") : new com.tencent.mm.feature.performance.adpf.x0(2, source, "fg") : ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67408q).getValue()).active() ? new com.tencent.mm.feature.performance.adpf.x0(3, source, "idle-charging") : new com.tencent.mm.feature.performance.adpf.x0(1, source, null, 4, null);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public java.util.List d() {
        return this.f67404m;
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void h() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67405n).getValue()).removeObserver(this);
        ((com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner) ((jz5.n) this.f67406o).getValue()).removeObserver(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67407p).getValue()).removeObserver(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67408q).getValue()).removeObserver(this);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void k() {
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67405n).getValue()).observeForever(this);
        ((com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner) ((jz5.n) this.f67406o).getValue()).observeForever(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67407p).getValue()).observeForever(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67408q).getValue()).observeForever(this);
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
    public c1(java.util.List<java.lang.String> bindingUiList) {
        super("SchedBatch", bindingUiList);
        kotlin.jvm.internal.o.g(bindingUiList, "bindingUiList");
        this.f67404m = bindingUiList;
        this.f67405n = jz5.h.b(com.tencent.mm.feature.performance.adpf.z0.f67521d);
        this.f67406o = jz5.h.b(com.tencent.mm.feature.performance.adpf.a1.f67390d);
        this.f67407p = jz5.h.b(com.tencent.mm.feature.performance.adpf.y0.f67515d);
        this.f67408q = jz5.h.b(com.tencent.mm.feature.performance.adpf.b1.f67400d);
    }

    public /* synthetic */ c1(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list);
    }
}

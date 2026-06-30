package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public class o1 extends com.tencent.mm.feature.performance.adpf.x1 implements com.tencent.matrix.lifecycle.k {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f67456m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f67457n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.IStatefulOwner f67458o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f67459p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f67460q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String policyName, java.util.List<java.lang.String> bindingUiList, com.tencent.matrix.lifecycle.IStatefulOwner compositeFgStatus) {
        super(policyName, kz5.p0.f313996d);
        kotlin.jvm.internal.o.g(policyName, "policyName");
        kotlin.jvm.internal.o.g(bindingUiList, "bindingUiList");
        kotlin.jvm.internal.o.g(compositeFgStatus, "compositeFgStatus");
        this.f67456m = policyName;
        this.f67457n = bindingUiList;
        this.f67458o = compositeFgStatus;
        this.f67459p = jz5.h.b(com.tencent.mm.feature.performance.adpf.n1.f67452d);
        this.f67460q = jz5.h.b(com.tencent.mm.feature.performance.adpf.m1.f67449d);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public com.tencent.mm.feature.performance.adpf.x0 c(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        return this.f67458o.active() ? a() ? new com.tencent.mm.feature.performance.adpf.x0(2, source, "bounded") : ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67460q).getValue()).active() ? new com.tencent.mm.feature.performance.adpf.x0(1, source, "emergency") : ((com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner) ((jz5.n) this.f67459p).getValue()).active() ? new com.tencent.mm.feature.performance.adpf.x0(3, source, "restricted") : new com.tencent.mm.feature.performance.adpf.x0(2, source, "fg") : new com.tencent.mm.feature.performance.adpf.x0(1, source, null, 4, null);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public java.util.List d() {
        return this.f67457n;
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public java.lang.String e() {
        return this.f67456m;
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void h() {
        this.f67458o.removeObserver(this);
        ((com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner) ((jz5.n) this.f67459p).getValue()).removeObserver(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67460q).getValue()).removeObserver(this);
    }

    @Override // com.tencent.mm.feature.performance.adpf.x1
    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AdpfFeatureService", this.f67456m + " startScheduling");
        this.f67458o.observeForever(this);
        ((com.tencent.matrix.lifecycle.ImmutableMultiSourceStatefulOwner) ((jz5.n) this.f67459p).getValue()).observeForever(this);
        ((com.tencent.mm.feature.performance.adpf.IAdpfState) ((jz5.n) this.f67460q).getValue()).observeForever(this);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        g(this.f67456m);
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        g(this.f67456m);
    }

    public /* synthetic */ o1(java.lang.String str, java.util.List list, com.tencent.matrix.lifecycle.IStatefulOwner iStatefulOwner, int i17, kotlin.jvm.internal.i iVar) {
        this(str, (i17 & 2) != 0 ? kz5.p0.f313996d : list, iStatefulOwner);
    }
}

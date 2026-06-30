package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class l1 extends com.tencent.mm.feature.performance.adpf.o1 {

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f67445r;

    /* JADX WARN: Multi-variable type inference failed */
    public l1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.tencent.mm.feature.performance.adpf.o1, com.tencent.mm.feature.performance.adpf.x1
    public java.util.List d() {
        return this.f67445r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(java.util.List<java.lang.String> bindingUiList) {
        super("SchedUidFg", bindingUiList, com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_COMPOSITE_FG));
        kotlin.jvm.internal.o.g(bindingUiList, "bindingUiList");
        this.f67445r = bindingUiList;
    }

    public /* synthetic */ l1(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list);
    }
}

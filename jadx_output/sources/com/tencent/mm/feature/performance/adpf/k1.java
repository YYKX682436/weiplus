package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class k1 extends com.tencent.mm.feature.performance.adpf.o1 {

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f67438r;

    /* JADX WARN: Multi-variable type inference failed */
    public k1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.tencent.mm.feature.performance.adpf.o1, com.tencent.mm.feature.performance.adpf.x1
    public java.util.List d() {
        return this.f67438r;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(java.util.List<java.lang.String> bindingUiList) {
        super("SchedPidFg", bindingUiList, com.tencent.mm.feature.performance.adpf.IAdpfState.Companion.e(com.tencent.mm.feature.performance.adpf.IAdpfState.STATE_FG));
        kotlin.jvm.internal.o.g(bindingUiList, "bindingUiList");
        this.f67438r = bindingUiList;
    }

    public /* synthetic */ k1(java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list);
    }
}

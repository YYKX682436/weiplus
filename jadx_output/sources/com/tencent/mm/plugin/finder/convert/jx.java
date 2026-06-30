package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class jx implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.lx f103788d;

    public jx(com.tencent.mm.plugin.finder.convert.lx lxVar) {
        this.f103788d = lxVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f103788d.f103956d.add(new java.lang.Long(((cu2.l0) obj).f222418a));
        return jz5.f0.f302826a;
    }
}

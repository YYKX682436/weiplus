package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class oa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.ra f84863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa(com.tencent.mm.plugin.appbrand.launching.ra raVar) {
        super(1);
        this.f84863d = raVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List resultPkgList = (java.util.List) obj;
        kotlin.jvm.internal.o.g(resultPkgList, "resultPkgList");
        this.f84863d.a(new com.tencent.mm.plugin.appbrand.launching.ModularizingPkgRetrieverContract$IPCCallResult(2, null, resultPkgList, true, 0, null, 50, null));
        return jz5.f0.f302826a;
    }
}

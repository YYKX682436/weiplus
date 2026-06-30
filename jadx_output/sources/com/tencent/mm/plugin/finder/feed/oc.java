package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class oc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f108637d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(0);
        this.f108637d = idVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.feed.id idVar = this.f108637d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = idVar.f107003f;
        sb6.append(pm0.v.u(finderItem != null ? finderItem.getId() : 0L));
        sb6.append(",1,");
        sb6.append(idVar.f107018x ? 1 : idVar.f107020z ? 3 : 2);
        g0Var.kvStat(20851, sb6.toString());
        return jz5.f0.f302826a;
    }
}

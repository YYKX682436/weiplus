package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b00 implements com.tencent.mm.plugin.finder.feed.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f106336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f106337b;

    public b00(com.tencent.mm.plugin.finder.feed.g00 g00Var, boolean z17) {
        this.f106336a = g00Var;
        this.f106337b = z17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void a(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.finder.feed.g00.b(this.f106336a, "requestLoadMore_onPoiRequest_" + type);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void b(boolean z17) {
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f106336a;
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, "requestLoadMore hasLocationPermission=" + z17);
        g00Var.f106797b.i1(-3);
        g00Var.f106800e.requestLoadMore(this.f106337b);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void c(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i(this.f106336a.f106801f, "requestLoadMore onFrozen type=" + type);
        com.tencent.mm.plugin.finder.feed.g00.g(this.f106336a, "requestLoadMore", -3, com.tencent.mm.plugin.finder.feed.rz.f108951d, type == com.tencent.mm.plugin.finder.feed.sz.f109016d ? so2.g5.f410362d : so2.g5.f410363e, 0L, 16, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void d(com.tencent.mm.plugin.finder.feed.qz forbiddenReason) {
        kotlin.jvm.internal.o.g(forbiddenReason, "forbiddenReason");
        com.tencent.mm.plugin.finder.feed.g00.g(this.f106336a, "requestLoadMoreNoPermission", -4, com.tencent.mm.plugin.finder.feed.rz.f108951d, forbiddenReason.i(), 0L, 16, null);
    }
}

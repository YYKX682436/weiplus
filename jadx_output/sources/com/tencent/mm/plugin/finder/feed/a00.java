package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class a00 implements com.tencent.mm.plugin.finder.feed.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f106173a;

    public a00(com.tencent.mm.plugin.finder.feed.g00 g00Var) {
        this.f106173a = g00Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void a(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i(this.f106173a.f106801f, "request init onPoiRequest type=" + type);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void b(boolean z17) {
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f106173a;
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, "request init route1,hasLocationPermission=" + z17);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestInit$default(g00Var.f106800e, false, 1, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void c(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f106173a;
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, "request init onPoiPageRequest type=" + type);
        g00Var.l(-3, type == com.tencent.mm.plugin.finder.feed.sz.f109016d ? so2.g5.f410362d : so2.g5.f410363e);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void d(com.tencent.mm.plugin.finder.feed.qz forbiddenReason) {
        kotlin.jvm.internal.o.g(forbiddenReason, "forbiddenReason");
        this.f106173a.l(-4, forbiddenReason.i());
    }
}

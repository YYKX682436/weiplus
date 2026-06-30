package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class yz implements com.tencent.mm.plugin.finder.feed.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f111215a;

    public yz(com.tencent.mm.plugin.finder.feed.g00 g00Var) {
        this.f111215a = g00Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void a(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.finder.feed.g00.b(this.f111215a, "onUserVisibleFocused_onPoiRequest_" + type);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void b(boolean z17) {
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f111215a;
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, "onUserVisibleFocused route1 hasLocationPermission=" + z17);
        if (z17) {
            com.tencent.mm.plugin.finder.feed.g00.a(g00Var);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void c(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f111215a;
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, "onUserVisibleFocused onFrozen type=" + type);
        g00Var.l(-3, type == com.tencent.mm.plugin.finder.feed.sz.f109016d ? so2.g5.f410362d : so2.g5.f410363e);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void d(com.tencent.mm.plugin.finder.feed.qz forbiddenReason) {
        kotlin.jvm.internal.o.g(forbiddenReason, "forbiddenReason");
        this.f111215a.l(-4, forbiddenReason.i());
    }
}

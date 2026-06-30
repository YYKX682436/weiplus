package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class e00 implements com.tencent.mm.plugin.finder.feed.uz {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.g00 f106604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rn5.a f106605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.e f106606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f106608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f106609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f106610g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f106611h;

    public e00(com.tencent.mm.plugin.finder.feed.g00 g00Var, rn5.a aVar, com.tencent.mm.plugin.finder.feed.model.e eVar, int i17, boolean z17, boolean z18, java.util.List list, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList) {
        this.f106604a = g00Var;
        this.f106605b = aVar;
        this.f106606c = eVar;
        this.f106607d = i17;
        this.f106608e = z17;
        this.f106609f = z18;
        this.f106610g = list;
        this.f106611h = copyOnWriteArrayList;
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void a(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mm.plugin.finder.feed.g00.b(this.f106604a, "requestRefresh_onPoiRequest_" + type);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void b(boolean z17) {
        com.tencent.mm.plugin.finder.feed.g00 g00Var = this.f106604a;
        g00Var.f106797b.i1(-3);
        jz5.l P6 = g00Var.d().P6();
        com.tencent.mars.xlog.Log.i(g00Var.f106801f, "requestRefresh hasLocationPermission=" + z17 + ",fragmentVisible=" + g00Var.f106806k + ",location=" + P6);
        if (z17) {
            if (((java.lang.Number) P6.f302833d).floatValue() == 0.0f) {
                if (((java.lang.Number) P6.f302834e).floatValue() == 0.0f) {
                    com.tencent.mm.plugin.finder.feed.g00 g00Var2 = this.f106604a;
                    if (g00Var2.f106803h) {
                        com.tencent.mars.xlog.Log.i(g00Var2.f106801f, "requestRefresh isRequestingLbs");
                        return;
                    } else {
                        g00Var2.f106803h = true;
                        pm0.v.L("LbsPresenter_requestLbs", true, new com.tencent.mm.plugin.finder.feed.d00(g00Var2, this.f106605b, this.f106606c, this.f106608e, this.f106609f, this.f106610g, this.f106611h));
                        return;
                    }
                }
            }
        }
        this.f106604a.k(this.f106605b, this.f106606c, this.f106607d, this.f106608e, this.f106609f, this.f106610g, this.f106611h);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void c(com.tencent.mm.plugin.finder.feed.sz type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i(this.f106604a.f106801f, "requestRefresh onFrozen type=" + type);
        com.tencent.mm.plugin.finder.feed.g00.g(this.f106604a, "requestRefresh", -3, com.tencent.mm.plugin.finder.feed.rz.f108952e, type == com.tencent.mm.plugin.finder.feed.sz.f109016d ? so2.g5.f410362d : so2.g5.f410363e, 0L, 16, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.uz
    public void d(com.tencent.mm.plugin.finder.feed.qz forbiddenReason) {
        kotlin.jvm.internal.o.g(forbiddenReason, "forbiddenReason");
        com.tencent.mm.plugin.finder.feed.g00.g(this.f106604a, "requestLbsNoPermission", -4, com.tencent.mm.plugin.finder.feed.rz.f108952e, forbiddenReason.i(), 0L, 16, null);
    }
}

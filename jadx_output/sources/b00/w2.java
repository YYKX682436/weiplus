package b00;

@j95.b
/* loaded from: classes8.dex */
public final class w2 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final b00.v2 f16785d = new b00.v2();

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.PluginEcs$notifyEntranceListener$1 f16786e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.ecs.PluginEcs$notifyEntranceListener$1] */
    public w2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f16786e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BypCommonBizMMECCardHolderEntranceNotifyEvent>(a0Var) { // from class: com.tencent.mm.feature.ecs.PluginEcs$notifyEntranceListener$1
            {
                this.__eventId = 1178720674;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BypCommonBizMMECCardHolderEntranceNotifyEvent bypCommonBizMMECCardHolderEntranceNotifyEvent) {
                com.tencent.mm.autogen.events.BypCommonBizMMECCardHolderEntranceNotifyEvent event = bypCommonBizMMECCardHolderEntranceNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                h00.h.a(h00.h.f277820a, 3, null, 2, null);
                return true;
            }
        };
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        java.util.concurrent.CopyOnWriteArraySet N0;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginEcs", "onAccountInitialized");
        super.onAccountInitialized(context);
        this.f16785d.alive();
        alive();
        h00.h.a(h00.h.f277820a, 2, null, 2, null);
        b00.j0 j0Var = b00.j0.f16693a;
        b00.j0.f16694b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ecs_me_reddot_revoke_when_reddot_replace_android, 1) == 1;
        com.tencent.mars.xlog.Log.i("EcsRedDotMgr", "onAccountInitialized enableRevokeMeRedDot=" + b00.j0.f16694b);
        if (b00.j0.f16694b && (N0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0()) != null) {
            N0.add((b00.h0) ((jz5.n) b00.j0.f16695c).getValue());
        }
        g20.g gVar = (g20.g) ((c00.x3) i95.n0.c(c00.x3.class));
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) gVar.f267774e).getValue()).post(new g20.c(gVar));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        java.util.concurrent.CopyOnWriteArraySet N0;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginEcs", "onAccountReleased");
        this.f16785d.dead();
        dead();
        b00.j0 j0Var = b00.j0.f16693a;
        if (b00.j0.f16694b && (N0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0()) != null) {
            N0.remove((b00.h0) ((jz5.n) b00.j0.f16695c).getValue());
        }
        android.util.LruCache lruCache = y00.h.f458527a;
        int size = lruCache.size();
        lruCache.evictAll();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardMemCache", "clear: talkers=%d", java.lang.Integer.valueOf(size));
    }
}

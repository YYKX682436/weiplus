package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes12.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.video.player.thumb.q f90902d = new com.tencent.mm.plugin.appbrand.video.player.thumb.q();

    public q() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xh3.h hVar = new xh3.h();
        jz5.g gVar = com.tencent.mm.plugin.appbrand.video.player.thumb.b0.f90868f;
        com.tencent.mm.plugin.appbrand.video.player.thumb.b0 engine = (com.tencent.mm.plugin.appbrand.video.player.thumb.b0) com.tencent.mm.plugin.appbrand.video.player.thumb.b0.f90868f.getValue();
        kotlin.jvm.internal.o.g(engine, "engine");
        com.tencent.mars.xlog.Log.i("MMMarsTaskDistributor", "bindMarsEngineService engine:" + engine);
        hVar.f454579a = engine;
        engine.f90869d = new xh3.g(hVar);
        engine.f90870e = new xh3.e(hVar);
        return hVar;
    }
}

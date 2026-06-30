package com.tencent.mm.modelsimple;

/* loaded from: classes8.dex */
public class a extends com.tencent.matrix.lifecycle.g {
    public a(com.tencent.mm.modelsimple.c cVar) {
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBgFgService", "fg at launch");
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.modelsimple.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.modelsimple.a aVar = com.tencent.mm.modelsimple.a.this;
                aVar.getClass();
                gm0.j1.i().m(new com.tencent.mm.modelsimple.b(aVar));
            }
        };
        if (c01.d9.e() == null || c01.d9.e().f70764d == null || c01.d9.e().f70764d.G() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBgFgService", "wait for core network");
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CoreNetworkReadyEvent>(this, a0Var) { // from class: com.tencent.mm.modelsimple.AppBgFgService$1$2
                {
                    this.__eventId = 1756740982;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.CoreNetworkReadyEvent coreNetworkReadyEvent) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBgFgService", "core network ready callback");
                    runnable.run();
                    dead();
                    return false;
                }
            }.alive();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBgFgService", "core network ready");
            runnable.run();
        }
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.removeLifecycleCallback(this);
    }
}

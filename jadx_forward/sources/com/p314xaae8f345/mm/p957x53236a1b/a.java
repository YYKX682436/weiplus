package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes8.dex */
public class a extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {
    public a(com.p314xaae8f345.mm.p957x53236a1b.c cVar) {
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBgFgService", "fg at launch");
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.mm.modelsimple.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p957x53236a1b.a aVar = com.p314xaae8f345.mm.p957x53236a1b.a.this;
                aVar.getClass();
                gm0.j1.i().m(new com.p314xaae8f345.mm.p957x53236a1b.b(aVar));
            }
        };
        if (c01.d9.e() == null || c01.d9.e().f152297d == null || c01.d9.e().f152297d.G() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBgFgService", "wait for core network");
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86>(this, a0Var) { // from class: com.tencent.mm.modelsimple.AppBgFgService$1$2
                {
                    this.f39173x3fe91575 = 1756740982;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5286xd13c3d86 c5286xd13c3d86) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBgFgService", "core network ready callback");
                    runnable.run();
                    mo48814x2efc64();
                    return false;
                }
            }.mo48813x58998cd();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBgFgService", "core network ready");
            runnable.run();
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40968xa01141ab(this);
    }
}

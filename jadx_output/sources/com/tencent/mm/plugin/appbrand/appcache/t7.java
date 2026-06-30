package com.tencent.mm.plugin.appbrand.appcache;

/* JADX INFO: Access modifiers changed from: package-private */
@mk0.a
/* loaded from: classes7.dex */
public final class t7 implements com.tencent.mm.ipcinvoker.i<com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader, com.tencent.mm.ipcinvoker.type.IPCVoid> {
    private t7() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void invoke(final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WxaCommLibPreloadNotify", "IPC_resetAppBrandCommLibReader#invoke(), process[%s], pkgInfo[%s]", bm5.f1.a(), iCommLibReader);
        if (iCommLibReader == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$a
            @Override // java.lang.Runnable
            public final void run() {
                final com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader2 = com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.this;
                final cf.d dVar = new cf.d(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        new com.tencent.mm.plugin.appbrand.appcache.u7(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader.this).run();
                    }
                }, 2);
                pq5.g gVar = (pq5.g) com.tencent.mm.plugin.appbrand.task.r.p(com.tencent.mm.plugin.appbrand.task.x0.WASERVICE);
                gVar.n(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$c
                    @Override // gm5.a
                    public final java.lang.Object call(java.lang.Object obj) {
                        cf.d.this.a();
                        return null;
                    }
                });
                gVar.B();
                pq5.g gVar2 = (pq5.g) com.tencent.mm.plugin.appbrand.task.r.p(com.tencent.mm.plugin.appbrand.task.x0.WAGAME);
                gVar2.n(new gm5.a() { // from class: com.tencent.mm.plugin.appbrand.appcache.t7$$d
                    @Override // gm5.a
                    public final java.lang.Object call(java.lang.Object obj) {
                        cf.d.this.a();
                        return null;
                    }
                });
                gVar2.B();
            }
        });
    }
}

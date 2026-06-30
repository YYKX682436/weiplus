package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.sync.j f97628e;

    public i(com.tencent.mm.plugin.emoji.sync.j jVar, android.content.Context context) {
        this.f97628e = jVar;
        this.f97627d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(this.f97627d);
        com.tencent.mars.xlog.Log.i("MicroMsg.BKGLoader.BKGLoaderManager", "[cpan] network change type:%d", java.lang.Integer.valueOf(netType));
        com.tencent.mm.plugin.emoji.sync.k kVar = this.f97628e.f97629a;
        if (kVar.f97640k == netType) {
            return;
        }
        if (kVar.f97630a || com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mm.plugin.emoji.sync.k kVar2 = this.f97628e.f97629a;
            if (!kVar2.f97632c) {
                kVar2.f();
            }
        } else {
            com.tencent.mm.plugin.emoji.sync.k kVar3 = this.f97628e.f97629a;
            synchronized (kVar3) {
                kVar3.f97631b = false;
                kVar3.f97632c = false;
                kVar3.f97630a = false;
                kVar3.c();
                com.tencent.mm.plugin.emoji.sync.l lVar = kVar3.f97633d;
                if (lVar != null) {
                    lVar.a();
                }
            }
        }
        this.f97628e.f97629a.f97640k = netType;
    }
}

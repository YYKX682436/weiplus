package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q80.e0 f67141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f67144g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67145h;

    public d1(com.tencent.mm.feature.lite.i iVar, q80.e0 e0Var, java.lang.String str, java.lang.String str2, android.app.Activity activity) {
        this.f67145h = iVar;
        this.f67141d = e0Var;
        this.f67142e = str;
        this.f67143f = str2;
        this.f67144g = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f67145h.f67178p;
        q80.e0 e0Var = this.f67141d;
        java.util.Map map2 = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map).get(e0Var.f360675a);
        java.lang.String str = this.f67142e;
        if (map2 != null && map2.get(str) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! appId:%s page:%s", e0Var.f360675a, str);
            return;
        }
        com.tencent.mm.plugin.lite.w.initLib();
        com.tencent.mm.plugin.lite.o oVar = com.tencent.mm.plugin.lite.p.f144149a;
        oVar.b(6, new com.tencent.liteapp.report.WxaLiteAppStartReport());
        oVar.d();
        com.tencent.liteapp.storage.WxaLiteAppInfo y17 = com.tencent.mm.plugin.lite.logic.g1.s().y(e0Var.f360675a, null);
        if (y17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "cannot find liteapp appID:%s", e0Var.f360675a);
            return;
        }
        long genAppUuid = com.tencent.mm.plugin.lite.LiteAppCenter.genAppUuid();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp appId:%s page:%s appUuid:%d, preloadData:%s", e0Var.f360675a, str, java.lang.Long.valueOf(genAppUuid), null);
        if ((kx5.n.h().f313321k != null) && com.tencent.mm.sdk.platformtools.x2.n()) {
            kx5.n.h().n(new com.tencent.mm.feature.lite.c1(this, y17, genAppUuid));
            return;
        }
        int c17 = e0Var.f360679e ? kx5.n.h().c() : kx5.n.h().o(true, null);
        com.tencent.mm.plugin.lite.LiteAppCenter.preloadView(e0Var.f360675a, this.f67142e, this.f67143f, y17.path, y17.signatureKey, c17, genAppUuid);
        com.tencent.mm.feature.lite.i.Ai(this.f67145h, this.f67141d, c17, genAppUuid, this.f67144g, y17.path, y17.signatureKey, this.f67143f);
    }
}

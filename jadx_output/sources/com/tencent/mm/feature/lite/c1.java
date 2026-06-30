package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class c1 implements kx5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.storage.WxaLiteAppInfo f67128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f67129b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.d1 f67130c;

    public c1(com.tencent.mm.feature.lite.d1 d1Var, com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo, long j17) {
        this.f67130c = d1Var;
        this.f67128a = wxaLiteAppInfo;
        this.f67129b = j17;
    }

    @Override // kx5.k
    public void a() {
        com.tencent.mm.feature.lite.d1 d1Var = this.f67130c;
        java.util.Map map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) d1Var.f67145h.f67178p).get(d1Var.f67141d.f360675a);
        if (map != null && map.get(d1Var.f67142e) != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "preloadLiteApp second, ignore! appId:%s page:%s", d1Var.f67141d.f360675a, d1Var.f67142e);
            return;
        }
        int c17 = d1Var.f67141d.f360679e ? kx5.n.h().c() : kx5.n.h().o(true, null);
        java.lang.String str = d1Var.f67141d.f360675a;
        java.lang.String str2 = d1Var.f67142e;
        java.lang.String str3 = d1Var.f67143f;
        com.tencent.liteapp.storage.WxaLiteAppInfo wxaLiteAppInfo = this.f67128a;
        com.tencent.mm.plugin.lite.LiteAppCenter.preloadView(str, str2, str3, wxaLiteAppInfo.path, wxaLiteAppInfo.signatureKey, c17, this.f67129b);
        com.tencent.mm.feature.lite.i.Ai(d1Var.f67145h, d1Var.f67141d, c17, this.f67129b, d1Var.f67144g, wxaLiteAppInfo.path, wxaLiteAppInfo.signatureKey, d1Var.f67143f);
    }
}

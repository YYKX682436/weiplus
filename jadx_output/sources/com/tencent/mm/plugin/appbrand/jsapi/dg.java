package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class dg implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f80756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f80757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yc1.q f80758f;

    public dg(com.tencent.mm.plugin.appbrand.jsapi.eg egVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, yc1.q qVar) {
        this.f80756d = lVar;
        this.f80757e = str;
        this.f80758f = qVar;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (bVar == u81.b.SUSPEND || bVar == u81.b.DESTROYED) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.t0.f427904b;
            mf1.i a17 = uh1.s0.f427901a.a(str);
            if (a17 == null) {
                return;
            }
            java.lang.String str2 = this.f80757e;
            a17.f(a17.a(str2));
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "interrupted");
            hashMap.put("socketTaskId", str2);
            hashMap.put("state", "close");
            java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
            yc1.p pVar = new yc1.p();
            pVar.p(this.f80756d);
            pVar.r(jSONObject);
            yc1.q qVar = this.f80758f;
            pVar.n(qVar.f460761g.a(str2));
            qVar.f460761g.b(str2);
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.advertise.o f78723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f78724e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78725f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f78727h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f78728i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78729m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.util.Map map, yz5.l lVar, java.lang.String str3) {
        super(1);
        this.f78723d = oVar;
        this.f78724e = jSONObject;
        this.f78725f = str;
        this.f78726g = str2;
        this.f78727h = map;
        this.f78728i = lVar;
        this.f78729m = str3;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate precondition failed, fallback to launchCommon2, reason: ".concat(reason));
        this.f78723d.F(this.f78724e, mq0.a.f330520o, kz5.c1.m(kz5.c1.k(new jz5.l("impl", this.f78725f), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, reason), new jz5.l("strategy", this.f78726g)), this.f78727h));
        this.f78728i.invoke(this.f78729m);
        return jz5.f0.f302826a;
    }
}

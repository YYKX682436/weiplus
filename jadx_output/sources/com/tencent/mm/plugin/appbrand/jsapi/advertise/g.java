package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f78744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f78745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.advertise.o f78746i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f78747m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar, org.json.JSONObject jSONObject) {
        super(3);
        this.f78741d = str;
        this.f78742e = str2;
        this.f78743f = str3;
        this.f78744g = lVar;
        this.f78745h = i17;
        this.f78746i = oVar;
        this.f78747m = jSONObject;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        mq0.a aVar;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar;
        com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        com.tencent.mm.plugin.appbrand.jsapi.advertise.o oVar2 = this.f78746i;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar2 = this.f78744g;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        java.lang.String str2 = booleanValue2 ? "1" : "0";
        mq0.a aVar2 = mq0.a.f330518m;
        java.lang.String str3 = this.f78741d;
        jz5.l lVar3 = new jz5.l("impl", str3);
        java.lang.String str4 = this.f78742e;
        jz5.l lVar4 = new jz5.l("strategy", str4);
        java.lang.String str5 = this.f78743f;
        java.util.Map k17 = kz5.c1.k(lVar3, lVar4, new jz5.l(ya.b.SOURCE, str5), new jz5.l("keep_alive", str2));
        if (booleanValue) {
            str = "ok";
            aVar = aVar2;
        } else {
            str = "fail: ".concat(errMsg);
            mq0.a aVar3 = mq0.a.f330519n;
            k17 = kz5.c1.k(new jz5.l("errMsg", str), new jz5.l("impl", str3), new jz5.l("strategy", str4), new jz5.l(ya.b.SOURCE, str5), new jz5.l("keep_alive", str2));
            aVar = aVar3;
        }
        try {
            oVar = oVar2;
            try {
                lVar = lVar2;
            } catch (java.lang.Exception e17) {
                e = e17;
                lVar = lVar2;
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            lVar = lVar2;
            oVar = oVar2;
        }
        try {
            lVar.a(this.f78745h, oVar.o(str));
        } catch (java.lang.Exception e19) {
            e = e19;
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "appId[" + lVar.getAppId() + "], callback failed, env destroyed: " + e.getMessage());
            oVar.F(this.f78747m, aVar, k17);
            return jz5.f0.f302826a;
        }
        oVar.F(this.f78747m, aVar, k17);
        return jz5.f0.f302826a;
    }
}

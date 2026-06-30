package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160275e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f160278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o f160279i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f160280m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar, org.json.JSONObject jSONObject) {
        super(3);
        this.f160274d = str;
        this.f160275e = str2;
        this.f160276f = str3;
        this.f160277g = lVar;
        this.f160278h = i17;
        this.f160279i = oVar;
        this.f160280m = jSONObject;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        mq0.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar2 = this.f160279i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar2 = this.f160277g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        java.lang.String str2 = booleanValue2 ? "1" : "0";
        mq0.a aVar2 = mq0.a.f412051m;
        java.lang.String str3 = this.f160274d;
        jz5.l lVar3 = new jz5.l("impl", str3);
        java.lang.String str4 = this.f160275e;
        jz5.l lVar4 = new jz5.l("strategy", str4);
        java.lang.String str5 = this.f160276f;
        java.util.Map k17 = kz5.c1.k(lVar3, lVar4, new jz5.l(ya.b.f77502x92235c1b, str5), new jz5.l("keep_alive", str2));
        if (booleanValue) {
            str = "ok";
            aVar = aVar2;
        } else {
            str = "fail: ".concat(errMsg);
            mq0.a aVar3 = mq0.a.f412052n;
            k17 = kz5.c1.k(new jz5.l("errMsg", str), new jz5.l("impl", str3), new jz5.l("strategy", str4), new jz5.l(ya.b.f77502x92235c1b, str5), new jz5.l("keep_alive", str2));
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
            lVar.a(this.f160278h, oVar.o(str));
        } catch (java.lang.Exception e19) {
            e = e19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "appId[" + lVar.mo48798x74292566() + "], callback failed, env destroyed: " + e.getMessage());
            oVar.F(this.f160280m, aVar, k17);
            return jz5.f0.f384359a;
        }
        oVar.F(this.f160280m, aVar, k17);
        return jz5.f0.f384359a;
    }
}

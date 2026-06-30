package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o f160269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f160270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f160271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f160273h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar, org.json.JSONObject jSONObject, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        super(3);
        this.f160269d = oVar;
        this.f160270e = jSONObject;
        this.f160271f = map;
        this.f160272g = lVar;
        this.f160273h = i17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mq0.a action = (mq0.a) obj;
        java.util.Map extMap = (java.util.Map) obj2;
        java.lang.String resultMsg = (java.lang.String) obj3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160272g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extMap, "extMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultMsg, "resultMsg");
        java.util.Map m17 = kz5.c1.m(extMap, this.f160271f);
        org.json.JSONObject jSONObject = this.f160270e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar = this.f160269d;
        oVar.F(jSONObject, action, m17);
        try {
            lVar.a(this.f160273h, oVar.o(resultMsg));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiNavigateToMiniProgram.MB", "appId[" + lVar.mo48798x74292566() + "], callback failed, env destroyed: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}

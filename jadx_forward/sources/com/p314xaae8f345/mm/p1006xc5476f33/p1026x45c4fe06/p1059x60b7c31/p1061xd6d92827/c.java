package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o f160256d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f160257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160258f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160259g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f160260h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f160261i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160262m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827.o oVar, org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2, java.util.Map map, yz5.l lVar, java.lang.String str3) {
        super(1);
        this.f160256d = oVar;
        this.f160257e = jSONObject;
        this.f160258f = str;
        this.f160259g = str2;
        this.f160260h = map;
        this.f160261i = lVar;
        this.f160262m = str3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate precondition failed, fallback to launchCommon2, reason: ".concat(reason));
        this.f160256d.F(this.f160257e, mq0.a.f412053o, kz5.c1.m(kz5.c1.k(new jz5.l("impl", this.f160258f), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, reason), new jz5.l("strategy", this.f160259g)), this.f160260h));
        this.f160261i.mo146xb9724478(this.f160262m);
        return jz5.f0.f384359a;
    }
}

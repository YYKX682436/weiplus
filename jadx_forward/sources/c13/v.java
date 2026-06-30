package c13;

/* loaded from: classes11.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f119463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2);
        this.f119461d = str;
        this.f119462e = z17;
        this.f119463f = h0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        y03.f fVar;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e engine = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e) obj;
        java.util.Map paramsBuilder = (java.util.Map) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engine, "engine");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsBuilder, "paramsBuilder");
        paramsBuilder.put("TalkerUsername", this.f119461d);
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        paramsBuilder.put("MyUserName", r17);
        paramsBuilder.put("IsVideoMode", java.lang.Boolean.valueOf(this.f119462e));
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137441x5e5b7e39 = engine.m137441x5e5b7e39();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137441x5e5b7e39, "getRenderer(...)");
        b13.f fVar2 = new b13.f(m137441x5e5b7e39);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f119463f;
        h0Var.f391656d = fVar2;
        y03.f fVar3 = fVar2.f98633e;
        long j17 = -1;
        paramsBuilder.put("LocalId", java.lang.Long.valueOf(fVar3 != null ? fVar3.f540171a : -1L));
        b13.f fVar4 = (b13.f) h0Var.f391656d;
        if (fVar4 != null && (fVar = fVar4.f98634f) != null) {
            j17 = fVar.f540171a;
        }
        paramsBuilder.put("RemoteId", java.lang.Long.valueOf(j17));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        paramsBuilder.put("IsPreRender", bool);
        paramsBuilder.put("HadShowAudioMenu", bool);
        return jz5.f0.f384359a;
    }
}

package c13;

/* loaded from: classes11.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f37929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f37930f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, boolean z17, kotlin.jvm.internal.h0 h0Var) {
        super(2);
        this.f37928d = str;
        this.f37929e = z17;
        this.f37930f = h0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        y03.f fVar;
        io.flutter.embedding.engine.FlutterEngine engine = (io.flutter.embedding.engine.FlutterEngine) obj;
        java.util.Map paramsBuilder = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(engine, "engine");
        kotlin.jvm.internal.o.g(paramsBuilder, "paramsBuilder");
        paramsBuilder.put("TalkerUsername", this.f37928d);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        paramsBuilder.put("MyUserName", r17);
        paramsBuilder.put("IsVideoMode", java.lang.Boolean.valueOf(this.f37929e));
        io.flutter.embedding.engine.renderer.FlutterRenderer renderer = engine.getRenderer();
        kotlin.jvm.internal.o.f(renderer, "getRenderer(...)");
        b13.f fVar2 = new b13.f(renderer);
        kotlin.jvm.internal.h0 h0Var = this.f37930f;
        h0Var.f310123d = fVar2;
        y03.f fVar3 = fVar2.f17100e;
        long j17 = -1;
        paramsBuilder.put("LocalId", java.lang.Long.valueOf(fVar3 != null ? fVar3.f458638a : -1L));
        b13.f fVar4 = (b13.f) h0Var.f310123d;
        if (fVar4 != null && (fVar = fVar4.f17101f) != null) {
            j17 = fVar.f458638a;
        }
        paramsBuilder.put("RemoteId", java.lang.Long.valueOf(j17));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        paramsBuilder.put("IsPreRender", bool);
        paramsBuilder.put("HadShowAudioMenu", bool);
        return jz5.f0.f302826a;
    }
}

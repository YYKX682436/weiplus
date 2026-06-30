package bb2;

/* loaded from: classes2.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f18847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18849f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(long j17, bb2.w1 w1Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f18847d = j17;
        this.f18848e = w1Var;
        this.f18849f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bb2.e1(this.f18847d, this.f18848e, this.f18849f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        bb2.e1 e1Var = (bb2.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String u17 = pm0.v.u(this.f18847d);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f18848e.f19052q;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("comment_id", u17);
        jSONObject.put("report_json", this.f18849f);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        concurrentHashMap.put(u17, jSONObject2);
        return jz5.f0.f302826a;
    }
}

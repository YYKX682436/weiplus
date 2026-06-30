package lf0;

/* loaded from: classes8.dex */
public final class a0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f399726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f399727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf0.d0 f399728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f399729e;

    public a0(java.lang.String str, java.lang.String str2, long j17, lf0.d0 d0Var, org.json.JSONObject jSONObject) {
        this.f399725a = str;
        this.f399726b = str2;
        this.f399727c = j17;
        this.f399728d = d0Var;
        this.f399729e = jSONObject;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TopStoryLiteAppJsApiFeatureService", "createStore fail");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TopStoryLiteAppJsApiFeatureService", "create k1k liteapp store appid:" + this.f399725a);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = lf0.d0.f399734e;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = lf0.d0.f399735f;
        java.lang.String str = this.f399726b;
        ku5.u0 u0Var = ku5.t0.f394148d;
        lf0.z zVar = new lf0.z(this.f399728d, this.f399725a, this.f399729e);
        long j17 = this.f399727c;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c z17 = t0Var.z(zVar, j17, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z17, "uiDelay(...)");
        concurrentHashMap2.put(str, z17);
    }
}

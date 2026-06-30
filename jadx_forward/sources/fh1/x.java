package fh1;

/* loaded from: classes7.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f344153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(fh1.z zVar, java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        super(0);
        this.f344150d = zVar;
        this.f344151e = str;
        this.f344152f = str2;
        this.f344153g = jSONObject;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fh1.z zVar = this.f344150d;
        fh1.x0 a17 = zVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zVar.f344164e, "onWXConfigReady appId:" + this.f344151e + ", envVersion:" + this.f344152f + ", bizIsDestroyed:" + a17.G.get());
        p3325xe03a0797.p3326xc267989b.y0 y0Var = zVar.f344166g;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new fh1.w(zVar, a17, this.f344151e, this.f344152f, this.f344153g, null), 2, null);
        return jz5.f0.f384359a;
    }
}

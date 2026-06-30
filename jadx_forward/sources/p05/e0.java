package p05;

/* loaded from: classes3.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.i0 f432031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f432032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p05.n0 f432033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f432034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p05.m0 f432035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p05.i0 i0Var, long j17, p05.n0 n0Var, java.lang.String str, p05.m0 m0Var) {
        super(0);
        this.f432031d = i0Var;
        this.f432032e = j17;
        this.f432033f = n0Var;
        this.f432034g = str;
        this.f432035h = m0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        p05.m0 m0Var = this.f432035h;
        jSONObject2.put("stickerNum", m0Var.f432148a);
        jSONObject2.put("materialPath", m0Var.f432149b);
        jSONObject.put("wv_render_params", jSONObject2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.FallingGiftEffect", "msgJsonObj = " + jSONObject);
        p05.i0 i0Var = this.f432031d;
        rh0.d0 d0Var = i0Var.f432075c;
        long j17 = this.f432032e;
        if (d0Var != null) {
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            ((p05.l4) d0Var).G(j17, jSONObject3, 0);
        }
        if (j17 > 0) {
            i0Var.f432079g = this.f432033f;
            i0Var.f432078f.add(new p05.d0(j17, this.f432034g + "/Lua"));
        }
        return jz5.f0.f384359a;
    }
}

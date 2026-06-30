package p05;

/* loaded from: classes10.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p05.d2 f432254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p05.s1 f432255e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p05.w0 f432256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(p05.d2 d2Var, p05.s1 s1Var, p05.w0 w0Var) {
        super(0);
        this.f432254d = d2Var;
        this.f432255e = s1Var;
        this.f432256f = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("resetFaceEffectsTimer", 1);
        jSONObject.put("wv_render_params", jSONObject2);
        p05.d2 d2Var = this.f432254d;
        rh0.d0 d0Var = d2Var.f432021c;
        p05.s1 s1Var = this.f432255e;
        if (d0Var != null) {
            long j17 = s1Var.f432214a;
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            ((p05.l4) d0Var).G(j17, jSONObject3, 0);
        }
        s1Var.f432219f = java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#newWayAppend reset same effect timer: same_ptr=");
        long j18 = s1Var.f432214a;
        sb6.append(j18);
        sb6.append(" command=");
        sb6.append(jSONObject);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", sb6.toString());
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        p05.w0 w0Var = this.f432256f;
        jSONObject5.put("startPosX", w0Var.f432252d[0]);
        jSONObject5.put("startPosY", w0Var.f432252d[1]);
        long j19 = w0Var.f432251c;
        if (j19 >= 0) {
            jSONObject5.put("giftCount", j19);
            int i17 = d2Var.f432026h;
            d2Var.f432026h = i17 + 1;
            jSONObject5.put("identifierNum", i17);
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.lang.Float[] fArr = w0Var.f432253e;
        jSONArray.put(fArr[0]);
        jSONArray.put(fArr[1]);
        jSONArray.put(fArr[2]);
        jSONArray.put(fArr[3]);
        jSONObject5.put("detectRegion", jSONArray);
        jSONObject4.put("wv_render_params", jSONObject5);
        rh0.d0 d0Var2 = d2Var.f432021c;
        if (d0Var2 != null) {
            java.lang.String jSONObject6 = jSONObject4.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
            ((p05.l4) d0Var2).G(j18, jSONObject6, 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftEffect", "#newWayAppend gl_ptr=" + j18 + " command=" + jSONObject4);
        return jz5.f0.f384359a;
    }
}

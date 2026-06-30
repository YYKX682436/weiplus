package lw4;

/* loaded from: classes8.dex */
public class j implements lw4.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 f403191a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f403192b;

    /* renamed from: c, reason: collision with root package name */
    public int f403193c;

    /* renamed from: d, reason: collision with root package name */
    public final nw4.n f403194d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.fts.ui.C19252xb5f78ab1 c19252xb5f78ab1, lw4.f fVar, nw4.n nVar) {
        this.f403191a = c19252xb5f78ab1;
        ((java.util.HashSet) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) fVar).U3).add(this);
        this.f403194d = nVar;
    }

    @Override // lw4.e
    public void a() {
    }

    @Override // lw4.e
    public void b() {
    }

    @Override // lw4.e
    public void c() {
    }

    @Override // lw4.e
    public void d() {
    }

    @Override // lw4.e
    public void e() {
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiVideoCallback", "clean %s", toString());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f403192b;
        if (b4Var != null) {
            b4Var.d();
        }
    }

    public final org.json.JSONObject g(int i17, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("playerId", this.f403191a.m74189xe57a46e0());
        jSONObject2.put("event", i17);
        if (jSONObject != null) {
            jSONObject2.put("detail", jSONObject);
        }
        return jSONObject2;
    }

    public final org.json.JSONObject h() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f403191a.m74184x900d5424());
        return jSONObject;
    }

    public void i() {
        try {
            org.json.JSONObject h17 = h();
            h17.put("currentTime", this.f403191a.m74186x898ffe25());
            j(g(6, h17));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiVideoCallback", e17, null, new java.lang.Object[0]);
        }
    }

    public final void j(org.json.JSONObject jSONObject) {
        this.f403194d.i0("onVideoPlayerCallback", null, jSONObject);
    }

    @Override // lw4.e
    /* renamed from: onBackPressed */
    public boolean mo146440xbdc3c5dc() {
        return false;
    }

    @Override // lw4.e
    /* renamed from: onDestroy */
    public void mo146441xac79a11b() {
        f();
        this.f403191a.m74193x6c4ebec7(null);
    }
}

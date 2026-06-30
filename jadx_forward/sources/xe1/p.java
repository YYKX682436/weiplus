package xe1;

/* loaded from: classes15.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a f535361d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f535362e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f535363f;

    /* renamed from: g, reason: collision with root package name */
    public int f535364g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1116x6b0147b.C12262x4a2a25a c12262x4a2a25a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar) {
        this.f535361d = c12262x4a2a25a;
        this.f535362e = tVar;
        tVar.w(this);
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 n5Var, org.json.JSONObject jSONObject) {
        if (!(n5Var instanceof xe1.n) && !(n5Var instanceof xe1.k)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Video.JsApiVideoCallback", "dispatchEvent event %s", n5Var.k());
        }
        this.f535362e.i(n5Var.r(jSONObject.toString()), null);
    }

    public final org.json.JSONObject b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, this.f535361d.m51332x900d5424());
        return jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        this.f535362e.K(this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f535363f;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f535361d.m51339x6c4ebec7(null);
    }
}

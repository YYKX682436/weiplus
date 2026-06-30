package uc1;

/* loaded from: classes13.dex */
public class u0 implements vc1.s2 {

    /* renamed from: b, reason: collision with root package name */
    public float f507887b;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f507890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f507891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vc1.a3 f507892g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f507886a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final org.json.JSONObject f507888c = new org.json.JSONObject();

    /* renamed from: d, reason: collision with root package name */
    public final uc1.h1 f507889d = new uc1.h1();

    public u0(uc1.i1 i1Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, vc1.a3 a3Var) {
        this.f507890e = i17;
        this.f507891f = tVar;
        this.f507892g = a3Var;
    }

    @Override // vc1.s2
    public void a(vc1.q1 q1Var, boolean z17) {
        vc1.a3 a3Var = this.f507892g;
        org.json.JSONObject jSONObject = this.f507888c;
        if (this.f507886a.compareAndSet(true, false)) {
            try {
                jSONObject.remove("mapId");
                jSONObject.put("mapId", this.f507890e);
                jSONObject.remove("type");
                jSONObject.put("type", "end");
                jSONObject.remove("causedBy");
                boolean z18 = q1Var.f516660a != this.f507887b;
                if (!z17) {
                    jSONObject.put("causedBy", "update");
                } else if (z18) {
                    jSONObject.put("causedBy", "scale");
                } else {
                    jSONObject.put("causedBy", "drag");
                }
                jSONObject.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2);
                jSONObject.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2, q1Var.f516661b);
                jSONObject.remove("skew");
                jSONObject.put("skew", q1Var.f516662c);
                jSONObject.remove("scale");
                jSONObject.put("scale", ((vc1.p1) a3Var).f516601e.mo98897xb5885626().mo98961xd2ef9864().m37104xfb888c49());
                uc1.a.b(a3Var, jSONObject);
                uc1.a.a(a3Var, jSONObject);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            uc1.h1 h1Var = this.f507889d;
            h1Var.f163907f = jSONObject2;
            this.f507891f.i(h1Var, null);
            jSONObject.toString();
        }
    }

    @Override // vc1.s2
    public void b(vc1.q1 q1Var, boolean z17) {
        org.json.JSONObject jSONObject = this.f507888c;
        if (this.f507886a.compareAndSet(false, true)) {
            try {
                jSONObject.remove("mapId");
                jSONObject.put("mapId", this.f507890e);
                jSONObject.remove("type");
                jSONObject.put("type", "begin");
                if (z17) {
                    jSONObject.put("causedBy", "gesture");
                } else {
                    jSONObject.put("causedBy", "update");
                }
                jSONObject.remove(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37665xf880c7f2);
                jSONObject.remove("skew");
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiInsertMap", "put JSON data error : %s", e17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            uc1.h1 h1Var = this.f507889d;
            h1Var.f163907f = jSONObject2;
            this.f507891f.i(h1Var, null);
            this.f507887b = q1Var.f516660a;
        }
    }
}

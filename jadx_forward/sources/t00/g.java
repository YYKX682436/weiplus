package t00;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t00.h f495814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ef0 f495815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495816f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t00.h hVar, bw5.ef0 ef0Var, c00.n3 n3Var) {
        super(1);
        this.f495814d = hVar;
        this.f495815e = ef0Var;
        this.f495816f = n3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.ff0 it = (bw5.ff0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f495814d.getClass();
        bw5.ef0 model = this.f495815e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        c00.n3 callback = this.f495816f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        z20.e eVar = z20.e.f551076e;
        z20.b bVar = new z20.b();
        bVar.f551070a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f113532d = "commonCgi";
        q9Var.f113546u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f551071b = q9Var;
        bVar.c("Native_reqDone");
        bVar.f(model.b());
        bVar.a();
        if (it.mo11484xe92ab0a8().f458492d == 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("respData", (it.f108789f[2] ? it.f108787d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).i());
            callback.b(jSONObject);
        } else {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, it.mo11484xe92ab0a8().f458492d);
            java.lang.Object obj2 = it.mo11484xe92ab0a8().f458493e;
            if (obj2 == null) {
                obj2 = "";
            }
            jSONObject2.put(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, obj2);
            callback.d(jSONObject2);
        }
        return jz5.f0.f384359a;
    }
}

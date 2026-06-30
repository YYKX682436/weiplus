package s93;

/* loaded from: classes.dex */
public final class a implements c00.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s93.b f486540a;

    public a(s93.b bVar) {
        this.f486540a = bVar;
    }

    @Override // c00.n3
    public void a() {
        this.f486540a.f224976f.a("onFail");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiHandleEcsAction", "onFail");
    }

    @Override // c00.n3
    public void b(org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        s93.b bVar = this.f486540a;
        if (jSONObject != null) {
            bVar.f224976f.c(jSONObject, false);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            bVar.f224976f.d(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiHandleEcsAction", "onSuc: " + jSONObject);
    }

    @Override // c00.n3
    public void c(c00.x2 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
    }

    @Override // c00.n3
    public void d(org.json.JSONObject jSONObject) {
        jz5.f0 f0Var;
        s93.b bVar = this.f486540a;
        if (jSONObject != null) {
            bVar.f224976f.a(jSONObject.toString());
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            bVar.f224976f.a("onFail");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiHandleEcsAction", "onFail: " + jSONObject);
    }

    @Override // c00.n3
    /* renamed from: onCancel */
    public void mo13720x3d6f0539() {
        this.f486540a.f224976f.a("onCancel");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiHandleEcsAction", "onCancel");
    }
}

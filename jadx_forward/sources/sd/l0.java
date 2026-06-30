package sd;

/* loaded from: classes8.dex */
public abstract class l0 implements sd.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f488151d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public td.c f488152e;

    public void a() {
    }

    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.k0 k0Var = new sd.k0(this, str, jSONObject);
        td.c cVar = this.f488152e;
        if (cVar == null) {
            cVar = td.c.f499116a;
        }
        cVar.a(str, k0Var);
    }

    public void c(sd.e eVar) {
        sd.j0 j0Var = new sd.j0(this, eVar);
        td.c cVar = this.f488152e;
        if (cVar == null) {
            cVar = td.c.f499116a;
        }
        cVar.a(eVar.b(), j0Var);
    }

    public abstract od.l d();

    public abstract java.lang.String e();

    public void f(java.lang.Class cls, sd.d dVar) {
        try {
            sd.c cVar = (sd.c) cls.newInstance();
            if (dVar == null) {
                dVar = this;
            }
            try {
                cVar.f488131d = dVar;
                this.f488151d.put(cVar.b(), cls);
                d().f426053e.put(cVar.b(), new sd.h0(this, cVar));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageRuntime", "registerJsApi: " + e17);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.LuggageRuntime", "JsApi Initialize failed, %s, %s", cls.getName(), e18);
        }
    }

    public void g(java.util.List list, sd.d dVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f((java.lang.Class) it.next(), dVar);
        }
    }
}

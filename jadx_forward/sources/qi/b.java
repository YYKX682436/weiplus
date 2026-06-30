package qi;

/* loaded from: classes12.dex */
public abstract class b implements ri.e0, ei.a {

    /* renamed from: d, reason: collision with root package name */
    public qi.c f444985d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Application f444986e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f444987f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f444988g = 0;

    public void a(boolean z17) {
    }

    public java.lang.String b() {
        return getClass().getName();
    }

    public void c(android.app.Application application, qi.c cVar) {
        if (this.f444986e != null || this.f444985d != null) {
            throw new java.lang.RuntimeException("plugin duplicate init, application or plugin listener is not null");
        }
        this.f444988g = 1;
        this.f444986e = application;
        this.f444985d = cVar;
        cVar.c(this);
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134275x.a(this);
    }

    public void d(ri.d0 d0Var) {
        if (d0Var.f477393b == null) {
            d0Var.f477393b = b();
        }
        d0Var.f477396e = this;
        org.json.JSONObject jSONObject = d0Var.f477395d;
        try {
            java.lang.String str = d0Var.f477393b;
            if (str != null) {
                jSONObject.put("tag", str);
            }
            int i17 = d0Var.f477392a;
            if (i17 != 0) {
                jSONObject.put("type", i17);
            }
            jSONObject.put("process", oj.m.b(this.f444986e));
            jSONObject.put("time", java.lang.System.currentTimeMillis());
        } catch (org.json.JSONException e17) {
            oj.j.b("Matrix.Plugin", "json error", e17);
        }
        this.f444985d.a(d0Var);
    }

    public void e() {
        int i17 = this.f444988g;
        if (i17 == 8) {
            throw new java.lang.RuntimeException("plugin start, but plugin has been already destroyed");
        }
        if (i17 == 2) {
            throw new java.lang.RuntimeException("plugin start, but plugin has been already started");
        }
        this.f444988g = 2;
        qi.c cVar = this.f444985d;
        if (cVar == null) {
            throw new java.lang.RuntimeException("plugin start, plugin listener is null");
        }
        cVar.b(this);
    }
}

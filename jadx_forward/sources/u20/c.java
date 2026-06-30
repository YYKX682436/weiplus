package u20;

/* loaded from: classes9.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f505390a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t f505391b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f505392c;

    public c(java.util.List list, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t tVar) {
        this.f505390a = list;
        this.f505391b = tVar;
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f505392c = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.x0("EcsShareToContactLogic_WAAPPMsg")));
    }

    public final void a() {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t tVar = this.f505391b;
        if (tVar != null) {
            t00.m2 m2Var = (t00.m2) tVar;
            c00.n3 n3Var = m2Var.f495852a;
            if (n3Var != null) {
                n3Var.mo13720x3d6f0539();
            }
            m2Var.f495852a = null;
        }
        this.f505391b = null;
    }

    public final void b(java.lang.String msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsShareToContactLogic_Base", "onFail： ".concat(msg));
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t tVar = this.f505391b;
        if (tVar != null) {
            ((t00.m2) tVar).a(msg);
        }
        this.f505391b = null;
    }

    public void c(boolean z17) {
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t tVar = this.f505391b;
        if (tVar != null) {
            t00.m2 m2Var = (t00.m2) tVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShareToContactsEcsActionHandler", "share to contact success");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("isGroup", z17 ? "1" : "0");
            c00.n3 n3Var = m2Var.f495852a;
            if (n3Var != null) {
                n3Var.b(jSONObject);
            }
            m2Var.f495852a = null;
        }
        this.f505391b = null;
        c(z17);
    }
}

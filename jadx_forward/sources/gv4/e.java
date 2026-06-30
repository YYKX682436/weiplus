package gv4;

/* loaded from: classes.dex */
public final class e extends aw4.y {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f357653i;

    /* renamed from: m, reason: collision with root package name */
    public su4.m1 f357654m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hv4.b uiComponent) {
        super(uiComponent);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiComponent, "uiComponent");
        this.f357653i = "MicroMsg.WebSearch.TagSearchWebData";
        gm0.j1.d().a(4614, this);
        gm0.j1.d().a(4858, this);
    }

    @Override // aw4.y
    public void e() {
        super.e();
        gm0.j1.d().q(4614, this);
        gm0.j1.d().q(4858, this);
    }

    @Override // aw4.y
    public void h(java.lang.String paramsStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paramsStr, "paramsStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(paramsStr);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(next);
                hashMap.put(next, jSONObject.opt(next));
            }
            gm0.j1.d().g(new su4.t1(g(hashMap)));
        } catch (java.lang.Exception unused) {
        }
    }

    public final hv4.b k() {
        aw4.q qVar = this.f96377d;
        if (qVar instanceof hv4.b) {
            return (hv4.b) qVar;
        }
        return null;
    }

    @Override // aw4.y, aw4.a, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.sn3 sn3Var;
        hv4.b k17;
        gv4.a b17;
        boolean z17;
        gv4.a b18;
        gv4.a b19;
        super.mo815x76e0bfae(i17, i18, str, m1Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f357653i, "onSceneEnd errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        jz5.f0 f0Var = null;
        if (!(m1Var instanceof su4.t1)) {
            if (m1Var instanceof su4.m1) {
                su4.m1 m1Var2 = (su4.m1) m1Var;
                if (m1Var2.f494543h == a() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f357654m)) {
                    if (i17 == 0 && i18 == 0 && (sn3Var = m1Var2.f494542g) != null && (k17 = k()) != null) {
                        k17.M5(sn3Var, m1Var2.f494544i, m1Var2.f494541f.f466560i);
                    }
                    this.f357654m = null;
                    return;
                }
                return;
            }
            return;
        }
        su4.t1 t1Var = (su4.t1) m1Var;
        if (t1Var.f494634g.f494610q == a()) {
            if (i17 != 0 || i18 != 0) {
                hv4.b k18 = k();
                if (k18 == null || (b17 = k18.b()) == null) {
                    return;
                }
                su4.r1 r1Var = t1Var.f494634g;
                z17 = r1Var.f494596c == 0;
                java.lang.String requestId = r1Var.f494618y;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(requestId, "requestId");
                b17.q(z17, "{\"ret\":-1}", requestId);
                return;
            }
            r45.aa7 aa7Var = t1Var.f494633f;
            if (aa7Var != null) {
                hv4.b k19 = k();
                if (k19 != null && (b19 = k19.b()) != null) {
                    su4.r1 r1Var2 = t1Var.f494634g;
                    boolean z18 = r1Var2.f494596c == 0;
                    java.lang.String str2 = aa7Var.f451410f;
                    if (str2 == null) {
                        str2 = "{}";
                    }
                    java.lang.String requestId2 = r1Var2.f494618y;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(requestId2, "requestId");
                    b19.q(z18, str2, requestId2);
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var != null) {
                    return;
                }
            }
            hv4.b k27 = k();
            if (k27 == null || (b18 = k27.b()) == null) {
                return;
            }
            su4.r1 r1Var3 = t1Var.f494634g;
            z17 = r1Var3.f494596c == 0;
            java.lang.String requestId3 = r1Var3.f494618y;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(requestId3, "requestId");
            b18.q(z17, "{\"ret\":-1}", requestId3);
        }
    }
}

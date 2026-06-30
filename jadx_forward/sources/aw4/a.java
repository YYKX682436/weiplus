package aw4;

/* loaded from: classes.dex */
public abstract class a implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public aw4.q f96377d;

    public a(aw4.q qVar) {
        this.f96377d = qVar;
        gm0.j1.d().a(2975, this);
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this);
    }

    public final int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        aw4.q qVar = this.f96377d;
        if (qVar == null || (mo9090x86b9ebe3 = qVar.mo9090x86b9ebe3()) == null) {
            return -1;
        }
        return mo9090x86b9ebe3.hashCode();
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        aw4.l b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchData", "onAppBackground " + str);
        aw4.q qVar = this.f96377d;
        if (qVar == null || (b17 = qVar.b()) == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, str);
            jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, c01.id.c());
            av4.j jVar = b17.f95859a;
            if (jVar != null && (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onAppBackground", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onAppBackground", "onAppBackground", jSONObject2}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17.g().toString(), "toString(...)");
        } catch (java.lang.Exception unused) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17.f().toString(), "toString(...)");
        }
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        aw4.l b17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e mo9090x86b9ebe3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchData", "onAppForeground " + str);
        aw4.q qVar = this.f96377d;
        if (qVar == null || (b17 = qVar.b()) == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, str);
            jSONObject.put(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, c01.id.c());
            av4.j jVar = b17.f95859a;
            if (jVar != null && (mo9090x86b9ebe3 = jVar.mo9090x86b9ebe3()) != null) {
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onAppForeground", jSONObject2);
                    java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onAppForeground", "onAppForeground", jSONObject2}, 3));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                    pm0.v.X(new av4.t0(mo9090x86b9ebe3, format));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17.g().toString(), "toString(...)");
        } catch (java.lang.Exception unused) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17.f().toString(), "toString(...)");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        aw4.l b17;
        java.lang.String str2;
        aw4.l b18;
        if (m1Var instanceof su4.s1) {
            su4.s1 s1Var = (su4.s1) m1Var;
            if (s1Var.f494625h == a()) {
                r45.e97 e97Var = (r45.e97) s1Var.f494622e.f152244b.f152233a;
                if (e97Var != null) {
                    aw4.q qVar = this.f96377d;
                    if (qVar == null || (b18 = qVar.b()) == null) {
                        str2 = null;
                    } else {
                        if (str == null) {
                            str = "";
                        }
                        java.lang.String str3 = e97Var.f454714d;
                        if (str3 == null) {
                            str3 = "";
                        }
                        str2 = b18.m(i18, str, str3, e97Var.f454715e);
                    }
                    if (str2 != null) {
                        return;
                    }
                }
                aw4.q qVar2 = this.f96377d;
                if (qVar2 == null || (b17 = qVar2.b()) == null) {
                    return;
                }
                b17.m(-1, "", "", s1Var.f494624g);
            }
        }
    }
}

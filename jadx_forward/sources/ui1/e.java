package ui1;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f509576h = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f509577g;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(1);
        this.f509577g = c11510xdd90c2f2;
        ui1.b bVar = new ui1.b(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11510xdd90c2f2, "<this>");
        java.lang.String str = c11510xdd90c2f2.f156336n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        bVar.mo146xb9724478(mVar);
        c11510xdd90c2f2.N.a(mVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.c
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a aVar, yz5.a onEnd) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0 c0Var;
        ui1.c task = (ui1.c) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onEnd, "onEnd");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJSApiUserAuthExecutor", "runTask " + task.f509572f);
        ui1.d dVar = new ui1.d(task.f509571e, onEnd);
        ui1.p pVar = ui1.t.f509615d;
        ui1.a0 a0Var = task.f509570d;
        if (!a0Var.f509558a.mo50262x39e05d35()) {
            dVar.mo32123x3d6f0539();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = a0Var.f509558a;
        java.lang.String mo48798x74292566 = yVar.mo48798x74292566();
        ui1.p pVar2 = ui1.t.f509615d;
        java.lang.String str = a0Var.f509559b;
        java.util.Set c17 = pVar2.c(mo48798x74292566, false);
        if (c17 != null) {
            synchronized (c17) {
                z17 = c17.contains(str);
            }
        } else {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, before cgi, appId %s, api %s, found in AUTH_CACHE, return ok", mo48798x74292566, str);
            dVar.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUSerAuth, before cgi, appId %s, api %s", mo48798x74292566, str);
        ui1.t tVar = new ui1.t(dVar, a0Var);
        java.lang.String mo48798x742925662 = yVar.mo48798x74292566();
        if (yVar.t3() instanceof ze.n ? ((ze.n) yVar.t3()).o2().f167634d : false) {
            c0Var = xh1.g.f536040m.a(yVar);
        } else {
            c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) yVar.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class);
            java.util.Objects.requireNonNull(c0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsApiUserAuth", "checkAuth appId = %s,mApi = %s", mo48798x742925662, str);
        r45.g24 g24Var = new r45.g24();
        g24Var.f456367d = mo48798x742925662;
        g24Var.f456371h = str;
        g24Var.f456369f = tVar.f509618c;
        g24Var.f456370g = new r45.nd7();
        g24Var.f456373m = yVar.t3().S0(str);
        java.lang.String str2 = a0Var.f509560c;
        if (!u46.l.e(u46.l.u(str2))) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                r45.me7 me7Var = new r45.me7();
                g24Var.f456372i = me7Var;
                me7Var.f461965d = jSONObject.optString("appId", null);
                ne.e eVar = (ne.e) t37.p0(ne.e.class, false);
                if (eVar != null) {
                    r45.me7 me7Var2 = g24Var.f456372i;
                    me7Var2.f461967f = eVar.a(me7Var2.f461965d);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (t37 instanceof ze.n) {
            g24Var.f456370g.f462829e = ((ze.n) t37).l2().f169323f;
        }
        if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) {
            g24Var.f456370g.f462830f = 1;
        } else if (yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) {
            g24Var.f456370g.f462830f = 2;
        }
        ((km5.q) c0Var.e1("/cgi-bin/mmbiz-bin/js-authorize", mo48798x742925662, g24Var, r45.h24.class).n(new ui1.j(tVar, c0Var, mo48798x742925662)).a(new ui1.i(tVar))).s(new ui1.h(tVar, mo48798x742925662, str));
    }
}

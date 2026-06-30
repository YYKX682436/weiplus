package gx0;

/* loaded from: classes5.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358588d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358589e;

    /* renamed from: f, reason: collision with root package name */
    public int f358590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358592h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(gx0.w8 w8Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358591g = w8Var;
        this.f358592h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.v5(this.f358591g, this.f358592h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.v5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358590f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.w8 w8Var = this.f358591g;
            this.f358588d = w8Var;
            java.lang.String str = this.f358592h;
            this.f358589e = str;
            this.f358590f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            java.lang.String m33753x8dc9649f = ((zu0.a) w8Var.f358656y.get(0)).f557194a.m33753x8dc9649f();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m33753x8dc9649f, "getIdentifier(...)");
            gx0.u5 u5Var = new gx0.u5(rVar);
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.g(m33753x8dc9649f));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            db2.c1 c1Var = null;
            if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                m143895xf1229813 = null;
            }
            org.json.JSONObject jSONObject = (org.json.JSONObject) m143895xf1229813;
            if (jSONObject == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(jSONObject.optString("description"), "miaojian")) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiaoJianUtils", "metadata is null");
                u5Var.mo146xb9724478(null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiaoJianUtils", "metadata:" + jSONObject);
                java.lang.String Di = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(m33753x8dc9649f);
                try {
                    w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Di);
                    ((qs2.q) eVar).getClass();
                    db2.c1 c1Var2 = new db2.c1(Di);
                    com.p314xaae8f345.mm.p944x882e457a.o oVar = c1Var2.f152179f;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
                    r45.p81 p81Var = fVar instanceof r45.p81 ? (r45.p81) fVar : null;
                    int i18 = oVar != null ? oVar.f152246d : 0;
                    c1Var2.l().L(new t65.g("Cgi_" + i18), new gx0.x(i18, p81Var, c1Var2, u5Var));
                    c1Var = c1Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MiaoJianUtils", "getMiaojianCgi failed", e17);
                }
            }
            rVar.m(new gx0.t5(c1Var, w8Var, str));
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f440719d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}

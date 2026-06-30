package df2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.o f312147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f312148f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(df2.o oVar, r45.ze2 ze2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312147e = oVar;
        this.f312148f = ze2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.l(this.f312147e, this.f312148f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312146d;
        df2.o oVar = this.f312147e;
        r45.ze2 loc = this.f312148f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            long m75942xfb822ef2 = ((mm2.e1) oVar.getStore().m56796xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) oVar.getStore().m56796xbba4bfc0(mm2.e1.class)).f410516m;
            ek2.q1 q1Var = ek2.r1.f335057u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loc, "loc");
            r45.hx0 hx0Var = new r45.hx0();
            hx0Var.set(0, 22);
            r45.u02 u02Var = new r45.u02();
            u02Var.set(0, loc);
            hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(u02Var.mo14344x5f01b1f6()));
            ek2.r1 r1Var = new ek2.r1(m75942xfb822ef2, j17, 22, hx0Var);
            az2.j.u(r1Var, oVar.O6(), null, 0L, 6, null);
            this.f312146d = 1;
            obj = rm0.h.b(r1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.b()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("longitude", new java.lang.Float(loc.m75938x746dc8a6(0)));
            jSONObject.put("latitude", new java.lang.Float(loc.m75938x746dc8a6(1)));
            jSONObject.put("city", loc.m75945x2fec8307(2));
            jSONObject.put("poiName", loc.m75945x2fec8307(3));
            jSONObject.put("poiAddress", loc.m75945x2fec8307(4));
            jSONObject.put("poiClassifyId", loc.m75945x2fec8307(5));
            jSONObject.put("poiClassifyType", loc.m75939xb282bd08(6));
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409888h2, jSONObject.toString(), null, 4, null);
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) oVar.m56788xbba4bfc0(mm2.g1.class)).f410607o).k(loc);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(oVar.f312432p, "[onLocPickResult] errCode = " + fVar.f152149b + ", errType = " + fVar.f152148a);
        return jz5.f0.f384359a;
    }
}

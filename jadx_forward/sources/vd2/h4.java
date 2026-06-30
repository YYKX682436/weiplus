package vd2;

/* loaded from: classes3.dex */
public final class h4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f517290d;

    /* renamed from: e, reason: collision with root package name */
    public int f517291e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c f517292f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.m84 f517293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c, r45.m84 m84Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f517292f = c14167x40aca97c;
        this.f517293g = m84Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd2.h4(this.f517292f, this.f517293g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd2.h4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yl2.g1 g1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f517291e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = this.f517292f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = c14167x40aca97c.f193017f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractActivityC21394xb3d2c0cf, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            yl2.g1 g1Var2 = new yl2.g1(abstractActivityC21394xb3d2c0cf, 15, 0L, 4, null);
            g1Var2.f544545e = false;
            this.f517290d = g1Var2;
            this.f517291e = 1;
            java.lang.Object t17 = yl2.g1.t(g1Var2, null, false, this, 3, null);
            if (t17 == aVar) {
                return aVar;
            }
            g1Var = g1Var2;
            obj = t17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var = (yl2.g1) this.f517290d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "startLiveCheck failed, errCode:" + ((yl2.x) a0Var).f544614a);
        } else if (a0Var instanceof yl2.z) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "startLiveCheck continueLive");
            g1Var.d(((yl2.z) a0Var).f544620a);
        } else if (a0Var instanceof yl2.y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "startLiveCheck success, creating KTV room");
            vd2.w5.f517513a = new vd2.g4(g1Var, a0Var, this.f517293g);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0 wg0Var = c14353xe7c1f419 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0) c14353xe7c1f419.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wg0.class) : null;
            if (wg0Var != null) {
                wg0Var.u1(false);
            }
        }
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f409116i;
        ml2.y3 y3Var = ml2.y3.f409813r;
        y4Var.getClass();
        y4Var.f409824c0 = y3Var;
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        jSONObject.put("entrance_type", 15);
        jSONObject.put("entrance_id", g1Var.f544543c);
        zy2.zb.j5(zbVar, 36L, jSONObject.toString(), null, 4, null);
        return jz5.f0.f384359a;
    }
}

package df2;

/* loaded from: classes3.dex */
public final class lc implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.tc f312187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f312188e;

    public lc(df2.tc tcVar, android.view.ViewGroup viewGroup) {
        this.f312187d = tcVar;
        this.f312188e = viewGroup;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.gw1 gw1Var = (r45.gw1) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorGuideController", "try to show anchor guide bubble, id " + gw1Var.m75945x2fec8307(0) + " type " + gw1Var.m75939xb282bd08(1) + " text " + gw1Var.m75945x2fec8307(2));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) this.f312188e;
        df2.tc tcVar = this.f312187d;
        tcVar.getClass();
        java.lang.String m75945x2fec8307 = gw1Var.m75945x2fec8307(2);
        if (m75945x2fec8307 != null) {
            android.view.View findViewById = k0Var.findViewById(com.p314xaae8f345.mm.R.id.fbe);
            yg2.b m57691xa0fa63f9 = k0Var.m57691xa0fa63f9();
            if (m57691xa0fa63f9 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl(tcVar.O6());
                slVar.c(m75945x2fec8307);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
                slVar.f201333d = findViewById;
                slVar.f201332c = 8000L;
                slVar.f201341l = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kl.f200378e;
                slVar.f201342m = 130;
                slVar.f201334e = new df2.nc(tcVar, gw1Var);
                slVar.f201335f = new df2.oc(gw1Var);
                slVar.f201336g = new df2.pc(gw1Var);
                slVar.b();
                tcVar.f312966n.put(java.lang.Integer.valueOf(gw1Var.m75939xb282bd08(1)), slVar);
                if (!k0Var.m57703xa7d505b7()) {
                    java.util.Set set = tcVar.f312965m;
                    if (!kz5.n0.O(set, gw1Var.m75945x2fec8307(0))) {
                        java.lang.String m75945x2fec83072 = gw1Var.m75945x2fec8307(0);
                        if (m75945x2fec83072 != null) {
                            set.add(m75945x2fec83072);
                        }
                        slVar.d(m57691xa0fa63f9);
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("type", "6");
                        i95.m c17 = i95.n0.c(zy2.zb.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409895m, jSONObject.toString(), null, 4, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}

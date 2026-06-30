package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f194216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar) {
        super(1);
        this.f194216d = adVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar = this.f194216d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ld.b(adVar, false);
            boolean z17 = ((mm2.c1) adVar.P0(mm2.c1.class)).f410334f2 == 2;
            long j17 = ((mm2.e1) adVar.P0(mm2.e1.class)).f410516m;
            if (z17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("object_id", pm0.v.u(j17));
                ml2.z0.f409863a.a(jSONObject);
                zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                ml2.o3[] o3VarArr = ml2.o3.f409306d;
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                ((ml2.j0) zbVar).Wj("watch_live_pay_succ", jSONObject2);
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).yj(ml2.b4.f408813y1, 7, java.lang.System.currentTimeMillis() - ((ml2.r0) i95.n0.c(ml2.r0.class)).f409411q);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChargePayPluginEx", "showWecoinInfo fail!");
        }
        return jz5.f0.f384359a;
    }
}

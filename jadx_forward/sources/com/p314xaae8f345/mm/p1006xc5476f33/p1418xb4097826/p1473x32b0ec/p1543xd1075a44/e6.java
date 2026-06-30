package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class e6 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6 f199762a;

    public e6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6 m6Var) {
        this.f199762a = m6Var;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public final void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6 m6Var = this.f199762a;
        boolean z18 = !m6Var.f200579n.m75933x41a8a7f2(0);
        if (m6Var.f200576h == 1) {
            int i17 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 11);
            jSONObject.put("sub_element", 1);
            jSONObject.put("sub_type", i17);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
        } else {
            int i18 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 15);
            jSONObject2.put("sub_element", 1);
            jSONObject2.put("sub_type", i18);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.D1, jSONObject2.toString(), null, 4, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "auto_gen_live_replay changed to: " + z18);
        m6Var.f200579n.set(0, java.lang.Boolean.valueOf(z18));
        if (m6Var.f200579n.m75933x41a8a7f2(0)) {
            r45.v94 v94Var = m6Var.f200579n;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            v94Var.set(2, bool);
            if (m6Var.f200579n.m75933x41a8a7f2(3)) {
                m6Var.f200579n.set(1, bool);
            }
        } else {
            r45.v94 v94Var2 = m6Var.f200579n;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            v94Var2.set(2, bool2);
            if (m6Var.f200579n.m75933x41a8a7f2(3)) {
                m6Var.f200579n.set(1, bool2);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m6.y(m6Var);
    }
}

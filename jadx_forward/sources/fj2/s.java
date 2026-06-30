package fj2;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a */
    public static final fj2.s f344716a = new fj2.s();

    public static void c(fj2.s sVar, ml2.q2 type, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            str = "";
        }
        if ((i19 & 4) != 0) {
            str2 = "";
        }
        if ((i19 & 8) != 0) {
            i17 = -1;
        }
        if ((i19 & 16) != 0) {
            i18 = -1;
        }
        sVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f409378d);
        jSONObject.put("result", str != null ? str : "");
        if (!(str2 == null || str2.length() == 0)) {
            jSONObject.put("result_switch", str2);
        }
        jSONObject.put("MicType", i17);
        jSONObject.put("InviteType", i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportMic21054 json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409923y, jSONObject.toString(), null, 4, null);
    }

    public static /* synthetic */ void h(fj2.s sVar, ml2.w4 w4Var, java.lang.String str, int i17, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 2) != 0) {
            str = null;
        }
        if ((i19 & 4) != 0) {
            i17 = -1;
        }
        if ((i19 & 8) != 0) {
            i18 = -1;
        }
        sVar.g(w4Var, str, i17, i18);
    }

    public final void a(ml2.k1 battleType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(battleType, "battleType");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportBattle21054 battleType: ");
        int i17 = battleType.f409179d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", sb6.toString());
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.G;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.putOpt("type", java.lang.Integer.valueOf(i17));
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }

    public final void b(ml2.n4 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: " + action.f409297d);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, action, null, 0, 6, null);
    }

    public final void d(ml2.q2 type, java.lang.String str, hi2.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f409378d);
        if (!(str == null || str.length() == 0)) {
            jSONObject.put("ai_msg_id", str);
        }
        if (aVar != null) {
            java.lang.String str2 = aVar.f363036a;
            if (!(str2 == null || str2.length() == 0)) {
                jSONObject.put("finder_username", str2);
            }
            java.lang.String str3 = aVar.f363037b;
            if (!(str3 == null || str3.length() == 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, "0")) {
                jSONObject.put("feedid", str3);
            }
            java.lang.String str4 = aVar.f363038c;
            if (!(str4 == null || str4.length() == 0)) {
                jSONObject.put("requestid", str4);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportMicAnchor21054 json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f409923y, jSONObject.toString(), null, 4, null);
    }

    public final void e(ml2.q4 element, ml2.r4 r4Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(element, "element");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.s4[] s4VarArr = ml2.s4.f409459d;
        jSONObject.put("type", 2);
        jSONObject.put("element", element.f409391d);
        if (r4Var != null) {
            jSONObject.put("result", r4Var.f409446d);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportMicCenterBtnClick21084 json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.f408765g3, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    public final void f(int i17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6518xdfc7e35e c6518xdfc7e35e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6518xdfc7e35e();
        c6518xdfc7e35e.f138706d = i17;
        c6518xdfc7e35e.f138707e = c6518xdfc7e35e.b("opMsg", str2, true);
        c6518xdfc7e35e.f138708f = c6518xdfc7e35e.b("userId", str, true);
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = dk2.ef.I;
        c6518xdfc7e35e.f138709g = c6518xdfc7e35e.b("liveId", eVar != null ? pm0.v.u(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0)) : "", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportMicPv " + i17 + " msg: " + str2);
        c6518xdfc7e35e.k();
    }

    public final void g(ml2.w4 type, java.lang.String str, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", type.f409731d);
        if (str != null) {
            jSONObject.put(dm.i4.f66875xa013b0d5, str);
        }
        if (i17 != -1) {
            jSONObject.put("last_index", i17);
        }
        if (i18 != -1) {
            jSONObject.put("after_index", i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "reportVoiceRoom21054 json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.P1, jSONObject.toString(), null, 4, null);
    }
}

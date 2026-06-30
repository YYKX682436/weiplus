package fa2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final fa2.a f342239a = new fa2.a();

    public static void a(fa2.a aVar, android.content.Context context, java.lang.String str, int i17, int i18, r45.hj2 hj2Var, org.json.JSONObject jSONObject, int i19, java.lang.Object obj) {
        long m75942xfb822ef2;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        r45.zi2 zi2Var;
        java.lang.String str3 = "";
        java.lang.String eid = (i19 & 2) != 0 ? "" : str;
        if ((i19 & 4) != 0) {
            i17 = 0;
        }
        if ((i19 & 8) != 0) {
            i18 = 138;
        }
        if ((i19 & 16) != 0) {
            hj2Var = null;
        }
        if ((i19 & 32) != 0) {
            jSONObject = null;
        }
        aVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String str4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p;
        java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        if (hj2Var != null) {
            try {
                m75942xfb822ef2 = hj2Var.m75942xfb822ef2(0);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMusicReporter", e17.getMessage());
            }
        } else {
            m75942xfb822ef2 = 0;
        }
        jSONObject.put("music_profile_id", pm0.v.u(m75942xfb822ef2));
        if (hj2Var == null || (zi2Var = (r45.zi2) hj2Var.m75936x14adae67(3)) == null || (str2 = zi2Var.m75945x2fec8307(12)) == null) {
            str2 = "";
        }
        jSONObject.put("songid", str2);
        if (hj2Var != null && (m75945x2fec8307 = hj2Var.m75945x2fec8307(15)) != null) {
            str3 = m75945x2fec8307;
        }
        jSONObject.put("audioId", str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicReporter", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:" + i18 + " action:" + i17 + " eid:" + eid + " udf_kv:" + jSONObject);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        g0Var.d(21875, Ri, str4, valueOf2, valueOf3, valueOf, eid, r26.i0.t(jSONObject2, ",", ";", false));
    }

    public final void b(android.content.Context context, int i17, r45.hj2 hj2Var, int i18, java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("jump_type", i18);
            byte[] bytes = wording.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            jSONObject.put("wording", android.util.Base64.encodeToString(bytes, 2));
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMusicReporter", e17.getMessage());
        }
        a(this, context, "music_people_cell", i17, 0, hj2Var, jSONObject, 8, null);
    }
}

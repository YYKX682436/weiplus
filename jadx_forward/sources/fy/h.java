package fy;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final fy.h f348702d = new fy.h();

    public h() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Iterable iterable;
        java.lang.String str;
        org.json.JSONObject param = (org.json.JSONObject) obj;
        yz5.l onComplete = (yz5.l) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onComplete, "onComplete");
        try {
            org.json.JSONArray jSONArray = param.getJSONArray("chat_id_list");
            e06.k m17 = e06.p.m(0, jSONArray.length());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (((e06.j) it).hasNext()) {
                arrayList.add(jSONArray.getString(((kz5.x0) it).b()));
            }
            iterable = kz5.n0.K0(arrayList, 6);
        } catch (java.lang.Exception unused) {
            iterable = kz5.p0.f395529d;
        }
        try {
            str = param.getString("display_scene");
        } catch (java.lang.Exception unused2) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FunctionCall", "display_contact_list invoke chatIdList " + iterable + " displayScene " + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.f77504xbb80cbe3, true);
        java.util.List i17 = kz5.c0.i("send_message", "voice_call", "video_call");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        if (str.length() == 0) {
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
            jSONObject.put("error_message", "display_scene is required");
            jSONObject.put("displayed_contacts", new org.json.JSONArray());
            onComplete.mo146xb9724478(jSONObject);
        } else if (i17.contains(str)) {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
            java.util.Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) x3Var).Bi().n((java.lang.String) it6.next(), true);
                if (n17 != null && n17.r2()) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("chat_id", n17.d1());
                    jSONObject2.put("nickname", n17.P0());
                    jSONObject2.put("remark", n17.w0());
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("displayed_contacts", jSONArray2);
            jSONObject.put(ya.b.f77504xbb80cbe3, true);
            onComplete.mo146xb9724478(jSONObject);
        } else {
            java.lang.Object message = "invalid display_scene: " + str + ", must be one of " + i17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
            jSONObject.put(ya.b.f77504xbb80cbe3, false);
            jSONObject.put("error_message", message);
            jSONObject.put("displayed_contacts", new org.json.JSONArray());
            onComplete.mo146xb9724478(jSONObject);
        }
        return jz5.f0.f384359a;
    }
}

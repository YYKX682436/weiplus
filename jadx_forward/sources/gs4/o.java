package gs4;

/* loaded from: classes9.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f356657a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public r45.rl6 f356658b;

    /* renamed from: c, reason: collision with root package name */
    public r45.rl6 f356659c;

    public static gs4.o a(org.json.JSONObject jSONObject) {
        gs4.o oVar = new gs4.o();
        try {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("extra_labels");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    oVar.f356657a.add(b(optJSONArray.getJSONObject(i17)));
                }
            }
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("header");
            if (optJSONObject != null) {
                oVar.f356658b = d(optJSONObject);
            }
            org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
            if (optJSONObject2 != null) {
                oVar.f356659c = d(optJSONObject2);
            }
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayPayManager", " PayManageExtraSectionsData dcreateFromJSONObject Exception:%s", e17.getMessage());
        }
        return oVar;
    }

    public static at4.m1 b(org.json.JSONObject jSONObject) {
        at4.m1 m1Var = new at4.m1();
        if (jSONObject != null) {
            m1Var.f66695xf0aedead = jSONObject.optInt("show_label", 0);
            java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            m1Var.f66700x5804f5a1 = optString;
            m1Var.f66699xd0f0afe8 = optString;
            m1Var.f66698x4d221e28 = jSONObject.optString("desc");
            m1Var.f66697x96a1f680 = jSONObject.optString("logo_url");
            m1Var.f66696xc374eba6 = jSONObject.optInt("jump_type");
            m1Var.f66701xd0f0d6f8 = jSONObject.optString("jump_h5_url");
            m1Var.f66703x61257cd9 = jSONObject.optString("tinyapp_username");
            m1Var.f66702xebf8d1a8 = jSONObject.optString("tinyapp_path");
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().y0(m1Var.f66699xd0f0afe8);
            ((pg0.a3) i95.n0.c(pg0.a3.class)).Zi().mo880xb970c2b9(m1Var);
        }
        return m1Var;
    }

    public static r45.hl6 c(org.json.JSONObject jSONObject) {
        r45.hl6 hl6Var = new r45.hl6();
        if (jSONObject != null) {
            hl6Var.f457804d = jSONObject.optLong("color");
            hl6Var.f457805e = jSONObject.optString("font");
            hl6Var.f457806f = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
            hl6Var.f457807g = (float) jSONObject.optLong("size");
            hl6Var.f457809i = jSONObject.optInt("text_attr");
            hl6Var.f457810m = jSONObject.optString("view_id");
            r45.yt5 yt5Var = new r45.yt5();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("route_info");
            if (optJSONObject != null) {
                yt5Var.f472887d = optJSONObject.optInt("type");
                yt5Var.f472888e = optJSONObject.optString("url");
                r45.nm6 nm6Var = new r45.nm6();
                org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("tiny_app_uri");
                if (optJSONObject2 != null) {
                    nm6Var.f463051d = optJSONObject2.optString(dm.i4.f66875xa013b0d5);
                    nm6Var.f463052e = optJSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                    nm6Var.f463053f = optJSONObject2.optInt("version");
                    yt5Var.f472889f = nm6Var;
                }
            }
            hl6Var.f457808h = yt5Var;
            r45.cg0 cg0Var = new r45.cg0();
            org.json.JSONObject optJSONObject3 = jSONObject.optJSONObject("dynamic_color");
            if (optJSONObject3 != null) {
                cg0Var.f453071d = optJSONObject3.optLong("normal_color");
                cg0Var.f453072e = optJSONObject3.optLong("dark_mode_color");
                hl6Var.f457811n = cg0Var;
            }
        }
        return hl6Var;
    }

    public static r45.rl6 d(org.json.JSONObject jSONObject) {
        r45.rl6 rl6Var = new r45.rl6();
        if (jSONObject != null) {
            rl6Var.f466521e = jSONObject.optString("view_id");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    try {
                        rl6Var.f466520d.add(c(optJSONArray.getJSONObject(i17)));
                    } catch (org.json.JSONException e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneTenpayPayManager", "parseTextViewData Exception:%s", e17.getMessage());
                    }
                }
            }
        }
        return rl6Var;
    }
}

package r01;

/* loaded from: classes9.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public int f449606a;

    /* renamed from: b, reason: collision with root package name */
    public int f449607b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f449608c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f449609d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f449610e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f449611f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f449612g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f449613h;

    /* renamed from: i, reason: collision with root package name */
    public int f449614i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f449615j;

    /* renamed from: k, reason: collision with root package name */
    public int f449616k;

    /* renamed from: l, reason: collision with root package name */
    public bw5.x7 f449617l;

    public static java.util.LinkedList c(java.util.Map map) {
        int P;
        if (map != null && (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(".msg.appmsg.buttonlist.$count"), 0)) > 0) {
            try {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                for (int i17 = 0; i17 < P; i17++) {
                    r01.g0 g0Var = new r01.g0();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(".msg.appmsg.buttonlist.button");
                    sb6.append(i17 != 0 ? "" + i17 : "");
                    java.lang.String sb7 = sb6.toString();
                    g0Var.f449606a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb7 + ".id"), 0);
                    g0Var.f449607b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb7 + ".type"), 0);
                    g0Var.f449608c = (java.lang.String) map.get(sb7 + ".name");
                    g0Var.f449609d = (java.lang.String) map.get(sb7 + ".key");
                    g0Var.f449610e = (java.lang.String) map.get(sb7 + ".value");
                    g0Var.f449614i = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) map.get(sb7 + ".acttype"), 0);
                    linkedList.add(g0Var);
                }
                return linkedList;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMenuItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        return null;
    }

    public static java.util.List d(org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                org.json.JSONObject jSONObject = jSONArray.getJSONObject(i17);
                r01.g0 g0Var = new r01.g0();
                g0Var.f449606a = jSONObject.getInt(dm.i4.f66865x76d1ec5a);
                g0Var.f449607b = jSONObject.getInt("type");
                g0Var.f449608c = jSONObject.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                g0Var.f449609d = jSONObject.getString("key");
                g0Var.f449610e = jSONObject.optString("value");
                g0Var.f449611f = jSONObject.optString("native_url");
                g0Var.f449612g = d(jSONObject.optJSONArray("sub_button_list"));
                g0Var.f449614i = jSONObject.optInt("acttype");
                g0Var.f449616k = jSONObject.optInt("show_icon_type", 0);
                g0Var.f449617l = e(jSONObject.optJSONObject("menu_ecs_data"));
                arrayList.add(g0Var);
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMenuItem", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    public static bw5.x7 e(org.json.JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optJSONObject("jump_info") == null) {
            return null;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("jump_info");
        bw5.x7 x7Var = new bw5.x7();
        x7Var.f116506d = optJSONObject.optInt("jumpBizType", 0);
        boolean[] zArr = x7Var.f116517r;
        zArr[1] = true;
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("jumpPriority");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            x7Var.j(new java.util.LinkedList());
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                x7Var.f116510h.add(optJSONArray.optString(i17));
            }
        }
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("mini_app_info");
        if (optJSONObject2 != null) {
            bw5.u7 u7Var = new bw5.u7();
            u7Var.e(optJSONObject2.optString("appid"));
            u7Var.f(optJSONObject2.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
            u7Var.f115288e = optJSONObject2.optString("app_username");
            u7Var.f115301u[2] = true;
            u7Var.g(optJSONObject2.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1035));
            u7Var.i(optJSONObject2.optString("scene_note"));
            u7Var.j(optJSONObject2.optInt("version_type", 0));
            x7Var.k(u7Var);
        }
        org.json.JSONObject optJSONObject3 = optJSONObject.optJSONObject("lite_app_info");
        if (optJSONObject3 != null) {
            bw5.q7 q7Var = new bw5.q7();
            q7Var.f113512d = optJSONObject3.optString("appid");
            boolean[] zArr2 = q7Var.f113520o;
            zArr2[1] = true;
            q7Var.f113513e = optJSONObject3.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            zArr2[2] = true;
            q7Var.f113514f = optJSONObject3.optString("query");
            zArr2[3] = true;
            q7Var.f113515g = optJSONObject3.optString("default_url");
            zArr2[4] = true;
            x7Var.f116508f = q7Var;
            zArr[3] = true;
        }
        org.json.JSONObject optJSONObject4 = optJSONObject.optJSONObject("html5_info");
        if (optJSONObject4 != null) {
            bw5.o7 o7Var = new bw5.o7();
            o7Var.f112534d = optJSONObject4.optString("url");
            o7Var.f112539i[1] = true;
            x7Var.f116509g = o7Var;
            zArr[4] = true;
        }
        return x7Var;
    }

    public void a(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMenuItem", "value null!");
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("pic_md5", str);
                jSONArray.put(jSONObject);
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("pics", jSONArray);
            this.f449615j = jSONObject2.toString();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMenuItem", e17.toString());
        }
    }

    public java.lang.String b() {
        if (this.f449615j == null) {
            this.f449615j = "";
        }
        if (this.f449613h == null) {
            if (this.f449607b == 4) {
                this.f449613h = "menu_action_start";
            } else {
                this.f449613h = "menu_click";
            }
        }
        return java.lang.String.format("%s<info><id><![CDATA[%d]]></id><key><![CDATA[%s]]></key><status><![CDATA[%s]]></status><content><![CDATA[%s]]></content></info>", "#bizmenu#", java.lang.Integer.valueOf(this.f449606a), this.f449609d, this.f449613h, this.f449615j);
    }

    /* renamed from: toString */
    public java.lang.String m161194x9616526c() {
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(this.f449606a);
        objArr[1] = java.lang.Integer.valueOf(this.f449614i);
        objArr[2] = java.lang.Integer.valueOf(this.f449607b);
        java.lang.String str = this.f449608c;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        java.lang.String str2 = this.f449609d;
        if (str2 == null) {
            str2 = "";
        }
        objArr[4] = str2;
        java.lang.String str3 = this.f449610e;
        if (str3 == null) {
            str3 = "";
        }
        objArr[5] = str3;
        java.lang.String str4 = this.f449615j;
        objArr[6] = str4 != null ? str4 : "";
        return java.lang.String.format("id:%d, type:%d, acttype:%s, name:%s, key:%s, value:%s, content:%s", objArr);
    }
}
